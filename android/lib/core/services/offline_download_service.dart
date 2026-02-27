import 'dart:async';
import 'dart:io';

import 'package:dio/dio.dart';
import 'package:path_provider/path_provider.dart';

import '../database/database_helper.dart';
import '../models/channel.dart';
import '../models/offline_recording.dart';
import 'service_locator.dart';

/// Manages offline recordings / downloads of IPTV channels.
///
/// - VOD / direct-file URLs → downloads the complete file.
/// - Live / HLS streams     → records raw bytes for [defaultLiveDuration]
///   (or a user-specified duration) then stops automatically.
///
/// All records are persisted in the `offline_recordings` SQLite table.
/// Progress is broadcast via [progressStream].
class OfflineDownloadService {
  static const Duration defaultLiveDuration = Duration(minutes: 30);
  static const String _offlineDir = 'offline';

  final DatabaseHelper _db;

  // Active download cancellation tokens keyed by recording id
  final Map<int, CancelToken> _cancelTokens = {};

  // Progress controller: maps recording id → 0.0–1.0
  final _progressController =
      StreamController<Map<int, double>>.broadcast();

  final Map<int, double> _progress = {};

  Stream<Map<int, double>> get progressStream => _progressController.stream;

  double progressFor(int recordingId) => _progress[recordingId] ?? 0.0;

  OfflineDownloadService(this._db);

  // ─────────────────────────────────────────────────────────────────────────
  // Public API
  // ─────────────────────────────────────────────────────────────────────────

  /// Start downloading [channel]. Returns the [OfflineRecording] that was
  /// created (status: [DownloadStatus.downloading]).
  ///
  /// [duration] is used for live channels to cap the recording length.
  /// Pass `null` to use [defaultLiveDuration] for live, or unlimited for VOD.
  Future<OfflineRecording> startDownload(
    Channel channel, {
    Duration? duration,
  }) async {
    final dir = await _offlineDirectory();
    final filename = _sanitizeFilename(channel.name);
    final ext = _guessExtension(channel.currentUrl);
    final timestamp = DateTime.now().millisecondsSinceEpoch;
    final filePath = '${dir.path}/${filename}_$timestamp$ext';

    final recording = OfflineRecording(
      channelId: channel.id ?? 0,
      channelName: channel.name,
      channelUrl: channel.currentUrl,
      channelLogo: channel.logoUrl,
      filePath: filePath,
      status: DownloadStatus.downloading,
    );

    // Persist to DB
    final id = await _db.insert('offline_recordings', recording.toMap());
    final rec = recording.copyWith(id: id);

    _progress[id] = 0.0;
    _progressController.add(Map.from(_progress));

    // Run in background
    _runDownload(rec, duration: duration);

    return rec;
  }

  /// Resume a failed/cancelled download from where it left off.
  /// Uses HTTP Range header to continue from existing bytes.
  /// Returns null if the recording doesn't exist or can't be resumed.
  Future<OfflineRecording?> resumeDownload(int recordingId) async {
    final rows = await _db.rawQuery(
      'SELECT * FROM offline_recordings WHERE id = ?',
      [recordingId],
    );
    if (rows.isEmpty) return null;

    final recording = OfflineRecording.fromMap(rows.first);
    
    // Only resume failed/cancelled downloads
    if (recording.status != DownloadStatus.failed &&
        recording.status != DownloadStatus.cancelled) {
      return null;
    }

    // Check if partial file exists
    final file = File(recording.filePath);
    int existingBytes = 0;
    if (await file.exists()) {
      existingBytes = await file.length();
    }

    // Update status to downloading
    await _updateStatus(recordingId, DownloadStatus.downloading);
    
    _progress[recordingId] = 0.0;
    _progressController.add(Map.from(_progress));

    // Run download with offset
    _runDownload(recording, resumeFromBytes: existingBytes);

    ServiceLocator.log.i(
      'Resuming download: ${recording.channelName} from ${_humanSize(existingBytes)}',
      tag: 'OfflineDownloadService',
    );

    return recording;
  }

  /// Cancel an active download.
  Future<void> cancelDownload(int recordingId) async {
    _cancelTokens[recordingId]?.cancel('User cancelled');
    _cancelTokens.remove(recordingId);
    await _updateStatus(
        recordingId, DownloadStatus.cancelled, sizeBytes: 0);
    _cleanupProgress(recordingId);
  }

  /// Delete a completed/failed recording from device + DB.
  Future<void> deleteRecording(int recordingId) async {
    // Cancel if still active
    _cancelTokens[recordingId]?.cancel('Deleted');
    _cancelTokens.remove(recordingId);

    final rows = await _db.rawQuery(
      'SELECT file_path FROM offline_recordings WHERE id = ?',
      [recordingId],
    );
    if (rows.isNotEmpty) {
      final path = rows.first['file_path'] as String?;
      if (path != null) {
        final file = File(path);
        if (await file.exists()) await file.delete();
      }
    }
    await _db.delete(
      'offline_recordings',
      where: 'id = ?',
      whereArgs: [recordingId],
    );
    _cleanupProgress(recordingId);
  }

  /// Returns all recordings ordered by newest first.
  Future<List<OfflineRecording>> allRecordings() async {
    final rows = await _db.rawQuery(
      'SELECT * FROM offline_recordings ORDER BY created_at DESC',
    );
    return rows.map(OfflineRecording.fromMap).toList();
  }

  /// Returns recordings filtered by status.
  Future<List<OfflineRecording>> recordingsByStatus(
      DownloadStatus status) async {
    final rows = await _db.rawQuery(
      "SELECT * FROM offline_recordings WHERE status = ? ORDER BY created_at "
      "DESC",
      [status.name],
    );
    return rows.map(OfflineRecording.fromMap).toList();
  }

  /// True if there is an active download for [channelId].
  bool isDownloading(int channelId) {
    return _cancelTokens.values.isNotEmpty &&
        _progress.keys.any((id) => id == channelId);
  }

  void dispose() {
    for (final ct in _cancelTokens.values) {
      ct.cancel('Disposed');
    }
    _progressController.close();
  }

  // ─────────────────────────────────────────────────────────────────────────
  // Internal
  // ─────────────────────────────────────────────────────────────────────────

  Future<void> _runDownload(
    OfflineRecording recording, {
    Duration? duration,
    int resumeFromBytes = 0,
  }) async {
    final id = recording.id!;
    final cancelToken = CancelToken();
    _cancelTokens[id] = cancelToken;

    // For live streams, enforce a max duration via a timer
    Timer? durationTimer;
    final isLive = !_isDirectFile(recording.channelUrl);
    final recordDuration =
        duration ?? (isLive ? defaultLiveDuration : null);

    if (recordDuration != null) {
      durationTimer = Timer(recordDuration, () {
        cancelToken.cancel('Duration reached');
      });
    }

    final dio = ServiceLocator.createDio();
    final file = File(recording.filePath);

    try {
      int writtenBytes = resumeFromBytes;
      
      // Use append mode if resuming, otherwise write mode
      final fileMode = resumeFromBytes > 0 ? FileMode.writeOnlyAppend : FileMode.writeOnly;
      final sink = file.openWrite(mode: fileMode);

      // Build request options with Range header for resume
      final options = Options(
        responseType: ResponseType.stream,
        headers: resumeFromBytes > 0 ? {'Range': 'bytes=$resumeFromBytes-'} : null,
      );

      final response = await dio.get<ResponseBody>(
        recording.channelUrl,
        options: options,
        cancelToken: cancelToken,
      );

      // Parse content-length (may be partial if resuming)
      int total = int.tryParse(
            response.headers.value('content-length') ?? '',
          ) ??
          -1;
      
      // If resuming, add existing bytes to total for accurate progress
      if (resumeFromBytes > 0 && total > 0) {
        total += resumeFromBytes;
      }

      await for (final chunk in response.data!.stream) {
        if (cancelToken.isCancelled) break;
        sink.add(chunk);
        writtenBytes += chunk.length;

        if (total > 0) {
          final p = (writtenBytes / total).clamp(0.0, 1.0);
          _progress[id] = p;
          _progressController.add(Map.from(_progress));
        }
      }

      await sink.flush();
      await sink.close();

      durationTimer?.cancel();
      _cancelTokens.remove(id);

      // Determine final status
      final wasCancelled = cancelToken.isCancelled &&
          !_isTimerCancellation(cancelToken);
      final status = wasCancelled
          ? DownloadStatus.cancelled
          : DownloadStatus.completed;

      await _updateStatus(id, status, sizeBytes: writtenBytes);
      _progress[id] = 1.0;
      _progressController.add(Map.from(_progress));

      ServiceLocator.log.i(
        'Download complete: ${recording.channelName} '
        '(${_humanSize(writtenBytes)})',
        tag: 'OfflineDownloadService',
      );
    } on DioException catch (e) {
      durationTimer?.cancel();
      _cancelTokens.remove(id);

      final isCancelOrDuration = e.type == DioExceptionType.cancel;
      if (isCancelOrDuration) {
        // Duration expired → completed with what we have
        final size = await _fileSize(recording.filePath);
        await _updateStatus(
          id,
          size > 0 ? DownloadStatus.completed : DownloadStatus.cancelled,
          sizeBytes: size,
        );
        _progress[id] = 1.0;
      } else {
        await _updateStatus(id, DownloadStatus.failed,
            error: e.message ?? 'Download failed');
        ServiceLocator.log.e(
          'Download failed: ${recording.channelName} — $e',
          tag: 'OfflineDownloadService',
        );
      }
      _progressController.add(Map.from(_progress));
    } catch (e) {
      durationTimer?.cancel();
      _cancelTokens.remove(id);
      await _updateStatus(id, DownloadStatus.failed,
          error: e.toString());
      ServiceLocator.log.e(
        'Download error: ${recording.channelName} — $e',
        tag: 'OfflineDownloadService',
      );
      _progressController.add(Map.from(_progress));
    }
  }

  // ─── helpers ─────────────────────────────────────────────────────────────

  Future<Directory> _offlineDirectory() async {
    final base = await getApplicationDocumentsDirectory();
    final dir = Directory('${base.path}/$_offlineDir');
    if (!await dir.exists()) await dir.create(recursive: true);
    return dir;
  }

  String _sanitizeFilename(String name) {
    return name
        .replaceAll(RegExp(r'[<>:"/\\|?*]'), '_')
        .replaceAll(RegExp(r'\s+'), '_')
        .substring(0, name.length.clamp(0, 40));
  }

  String _guessExtension(String url) {
    final lower = url.toLowerCase().split('?').first;
    if (lower.endsWith('.mp4')) return '.mp4';
    if (lower.endsWith('.mkv')) return '.mkv';
    if (lower.endsWith('.avi')) return '.avi';
    if (lower.endsWith('.m4v')) return '.m4v';
    if (lower.endsWith('.mov')) return '.mov';
    if (lower.endsWith('.m3u8')) return '.ts'; // record as TS
    return '.ts';
  }

  bool _isDirectFile(String url) {
    final lower = url.toLowerCase().split('?').first;
    return lower.endsWith('.mp4') ||
        lower.endsWith('.mkv') ||
        lower.endsWith('.avi') ||
        lower.endsWith('.m4v') ||
        lower.endsWith('.mov') ||
        lower.endsWith('.flv') ||
        lower.endsWith('.wmv');
  }

  bool _isTimerCancellation(CancelToken token) {
    // Dio doesn't expose the cancel reason directly, use progress heuristic
    return true; // treat all cancel-via-timer as "completed partial recording"
  }

  Future<void> _updateStatus(
    int id,
    DownloadStatus status, {
    int? sizeBytes,
    String? error,
  }) async {
    final map = <String, dynamic>{'status': status.name};
    if (sizeBytes != null) map['size_bytes'] = sizeBytes;
    if (error != null) map['error_message'] = error;
    await _db.update('offline_recordings', map,
        where: 'id = ?', whereArgs: [id]);
  }

  Future<int> _fileSize(String path) async {
    try {
      final f = File(path);
      if (await f.exists()) return await f.length();
    } catch (_) {}
    return 0;
  }

  void _cleanupProgress(int id) {
    _progress.remove(id);
    _progressController.add(Map.from(_progress));
  }

  String _humanSize(int bytes) {
    if (bytes < 1024 * 1024) return '${(bytes / 1024).toStringAsFixed(1)} KB';
    if (bytes < 1024 * 1024 * 1024) {
      return '${(bytes / (1024 * 1024)).toStringAsFixed(1)} MB';
    }
    return '${(bytes / (1024 * 1024 * 1024)).toStringAsFixed(2)} GB';
  }
}

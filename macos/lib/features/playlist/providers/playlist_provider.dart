import 'dart:io';
import 'dart:async';
import 'package:path_provider/path_provider.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:dio/dio.dart';
import '../../../core/models/playlist.dart';
import '../../../core/models/channel.dart';
import '../../../core/services/service_locator.dart';
import '../../../core/utils/m3u_parser.dart';
import '../../../core/utils/txt_parser.dart';
import '../../favorites/providers/favorites_provider.dart';
import '../../settings/providers/settings_provider.dart';

class PlaylistProvider extends ChangeNotifier {
  List<Playlist> _playlists = [];
  Playlist? _activePlaylist;
  bool _isLoading = false;
  String? _error;
  double _importProgress = 0.0;

  /// Last extracted EPG URL from M3U file (for UI display only)
  String? _lastExtractedEpgUrl;
  String? get lastExtractedEpgUrl => _lastExtractedEpgUrl;
  
  /// Playlists that need backup creation (for lazy migration)
  final Set<int> _playlistsNeedingBackup = {};

  // Getters

  // Getters
  List<Playlist> get playlists => _playlists;
  Playlist? get activePlaylist => _activePlaylist;
  bool get isLoading => _isLoading;
  String? get error => _error;
  double get importProgress => _importProgress;

  bool get hasPlaylists => _playlists.isNotEmpty;

  String _sortBy = 'name ASC';
  String get sortBy => _sortBy;

  void toggleSortOrder() {
    if (_sortBy == 'name ASC') {
      _sortBy = 'created_at DESC';
    } else {
      _sortBy = 'name ASC';
    }
    loadPlaylists();
  }

  // Load all playlists from database
  Future<void> loadPlaylists() async {
    ServiceLocator.log.i('', tag: 'PlaylistProvider');
    final startTime = DateTime.now();
    
    _isLoading = true;
    _error = null;
    notifyListeners();

    try {
      final results = await ServiceLocator.database.query(
        'playlists',
        orderBy: _sortBy,
      );

      _playlists = results.map((r) => Playlist.fromMap(r)).toList();
      ServiceLocator.log.d(' ${_playlists.length} ', tag: 'PlaylistProvider');
      
      //  EPG URL
      for (final playlist in _playlists) {
        ServiceLocator.log.d(' "${playlist.name}" (ID: ${playlist.id}) - epgUrl: ${playlist.epgUrl ?? "()"}', tag: 'PlaylistProvider');
      }

      // Load channel counts for each playlist
      for (int i = 0; i < _playlists.length; i++) {
        final countResult = await ServiceLocator.database.rawQuery(
          'SELECT COUNT(*) as count, COUNT(DISTINCT group_name) as groups FROM channels WHERE playlist_id = ?',
          [_playlists[i].id],
        );

        if (countResult.isNotEmpty) {
          _playlists[i] = _playlists[i].copyWith(
            channelCount: countResult.first['count'] as int? ?? 0,
            groupCount: countResult.first['groups'] as int? ?? 0,
          );
        }
      }

      // Set active playlist if none selected
      if (_activePlaylist == null && _playlists.isNotEmpty) {
        _activePlaylist = _playlists.firstWhere(
          (p) => p.isActive,
          orElse: () => _playlists.first,
        );
        ServiceLocator.log.d(': ${_activePlaylist?.name}', tag: 'PlaylistProvider');
      }
      
      // 
      _playlistsNeedingBackup.clear();
      for (final playlist in _playlists) {
        if (playlist.id == null) continue;
        
        if (playlist.backupPath == null) {
          // 
          _playlistsNeedingBackup.add(playlist.id!);
          ServiceLocator.log.d(' "${playlist.name}" (ID: ${playlist.id}) ', tag: 'PlaylistProvider');
        } else {
          // 
          final backupFile = File(playlist.backupPath!);
          if (!await backupFile.exists()) {
            _playlistsNeedingBackup.add(playlist.id!);
            ServiceLocator.log.w(' "${playlist.name}" (ID: ${playlist.id}) ', tag: 'PlaylistProvider');
          }
        }
      }
      
      // 🔍 
      try {
        final appDir = await getApplicationDocumentsDirectory();
        final backupDir = Directory('${appDir.path}/playlists/backups');
        if (await backupDir.exists()) {
          final backupFiles = await backupDir.list().toList();
          ServiceLocator.log.d('📁  ( ${backupFiles.length} ):', tag: 'PlaylistProvider');
          for (final file in backupFiles) {
            if (file is File) {
              try {
                final stat = await file.stat();
                ServiceLocator.log.d('  - ${file.path.split('/').last} (${stat.size} bytes)', tag: 'PlaylistProvider');
              } catch (e) {
                ServiceLocator.log.d('  - ${file.path.split('/').last} ()', tag: 'PlaylistProvider');
              }
            }
          }
        } else {
          ServiceLocator.log.d('📁 ', tag: 'PlaylistProvider');
        }
      } catch (e) {
        ServiceLocator.log.w(': $e', tag: 'PlaylistProvider');
      }
      
      // UI
      if (_playlistsNeedingBackup.isNotEmpty) {
        ServiceLocator.log.i(' ${_playlistsNeedingBackup.length} ', tag: 'PlaylistProvider');
        unawaited(_createMissingBackups());
      }

      // Auto-refresh any seeded/empty playlists that have a URL but 0 channels
      for (final playlist in _playlists) {
        if (playlist.channelCount == 0 &&
            playlist.url != null &&
            playlist.url!.isNotEmpty &&
            playlist.lastUpdated == null) {
          ServiceLocator.log.i(
              'Auto-refreshing empty playlist "${playlist.name}" (${playlist.url})',
              tag: 'PlaylistProvider');
          unawaited(refreshPlaylist(playlist, silent: true));
        }
      }

      final loadTime = DateTime.now().difference(startTime).inMilliseconds;
      ServiceLocator.log.i(': ${loadTime}ms', tag: 'PlaylistProvider');
      _error = null;
    } catch (e) {
      ServiceLocator.log.e('', tag: 'PlaylistProvider', error: e);
      _error = 'Failed to load playlists: $e';
      _playlists = [];
    }

    _isLoading = false;
    notifyListeners();
  }

  /// Detect playlist format from URL or content
  /// Returns 'txt' for TXT format, 'm3u' for M3U format
  String _detectPlaylistFormat(String source, {String? content}) {
    // Check by extension first
    final lowerSource = source.toLowerCase();
    if (lowerSource.endsWith('.txt')) {
      return 'txt';
    }
    if (lowerSource.endsWith('.m3u') || lowerSource.endsWith('.m3u8')) {
      return 'm3u';
    }

    // Check by content if available
    if (content != null) {
      final trimmed = content.trim();
      
      // M3U format starts with #EXTM3U or #EXTINF ()
      if (trimmed.startsWith('#EXTM3U') || trimmed.startsWith('#EXTINF')) {
        return 'm3u';
      }
      
      // TXT format characteristics:
      // 1. Contains ,#genre# pattern (category marker)
      if (trimmed.contains(',#genre#')) {
        return 'txt';
      }
      
      // 2. Lines with comma-separated format: name,url
      // Check first few non-empty lines
      final lines = trimmed.split('\n').where((line) => line.trim().isNotEmpty).take(10);
      int txtFormatLines = 0;
      int totalLines = 0;
      
      for (final line in lines) {
        totalLines++;
        final trimmedLine = line.trim();
        // Skip comment lines
        if (trimmedLine.startsWith('#')) continue;
        
        // TXT format: name,url (comma-separated, and second part looks like URL)
        if (trimmedLine.contains(',')) {
          final parts = trimmedLine.split(',');
          if (parts.length >= 2) {
            final secondPart = parts[1].trim();
            // Check if second part looks like a URL or contains #genre#
            if (secondPart.startsWith('http') || 
                secondPart.startsWith('rtmp') || 
                secondPart.startsWith('rtsp') ||
                secondPart.contains('#genre#')) {
              txtFormatLines++;
            }
          }
        }
      }
      
      // If more than 50% of lines match TXT format, it's TXT
      if (totalLines > 0 && txtFormatLines > totalLines / 2) {
        return 'txt';
      }
    }

    // Default to M3U
    return 'm3u';
  }

  /// Common import logic extracted to reduce code duplication
  /// Supports URL, content, and file path sources
  Future<Playlist?> _importPlaylist({
    required String name,
    String? url,
    String? content,
    String? filePath,
    String? mergeRule, // Add merge rule parameter
  }) async {
    ServiceLocator.log.i(': $name', tag: 'PlaylistProvider');
    if (url != null) ServiceLocator.log.d('URL: $url', tag: 'PlaylistProvider');
    if (filePath != null) ServiceLocator.log.d(': $filePath', tag: 'PlaylistProvider');
    
    final startTime = DateTime.now();
    
    _isLoading = true;
    _importProgress = 0.0;
    _error = null;
    notifyListeners();

    int? playlistId;
    String? tempFilePath;
    String? originalContent; // 
    
    try {
      // Step 1: Create playlist record (10%)
      final playlistData = Playlist(
        name: name,
        url: url,
        filePath: filePath,
        createdAt: DateTime.now(),
      ).toMap();

      playlistId = await ServiceLocator.database.insert('playlists', playlistData);
      ServiceLocator.log.d('ID: $playlistId', tag: 'PlaylistProvider');

      _importProgress = 0.1;
      notifyListeners();

      // Step 2: Parse channels (15% - 50%)
      late List<Channel> channels;
      String? epgUrl;
      
      // Use provided merge rule or default to 'name_group'
      final effectiveMergeRule = mergeRule ?? 'name_group';
      ServiceLocator.log.d(': $effectiveMergeRule', tag: 'PlaylistProvider');
      
      if (url != null) {
        // From URL
        ServiceLocator.log.i('URL: $url', tag: 'PlaylistProvider');
        _importProgress = 0.15;
        notifyListeners();

        // If this looks like an Xtream endpoint, prefer the player_api.php flow
        if (_looksLikeXtreamUrl(url)) {
          try {
            final creds = _parseXtreamCredentials(url);
            final base = creds['base'];
            final user = creds['username'];
            final pass = creds['password'];

            if (base != null && user != null && pass != null) {
              ServiceLocator.log.i('XtreamAPIplayer_api.php', tag: 'PlaylistProvider');
              try {
                channels = await _importFromXtream(
                  baseServer: base,
                  username: user,
                  password: pass,
                  playlistId: playlistId!,
                  mergeRule: effectiveMergeRule,
                );
                // Do not create a large content backup for API imports
                originalContent = '';
              } catch (e) {
                ServiceLocator.log.w('Xtream API : $e', tag: 'PlaylistProvider');
                // Fallback to the default behavior below
                final format = _detectPlaylistFormat(url);
                try {
                  originalContent = await _downloadContentFromUrl(url);
                } catch (e) {
                  ServiceLocator.log.w(': $e', tag: 'PlaylistProvider');
                }
                if (format == 'txt') {
                  channels = await TXTParser.parseFromUrl(url, playlistId!, mergeRule: effectiveMergeRule);
                } else {
                  channels = await M3UParser.parseFromUrl(url, playlistId!, mergeRule: effectiveMergeRule);
                  epgUrl = M3UParser.lastParseResult?.epgUrl;
                }
              }
            } else {
              ServiceLocator.log.w('URLXtream', tag: 'PlaylistProvider');
              final format = _detectPlaylistFormat(url);
              try {
                originalContent = await _downloadContentFromUrl(url);
              } catch (e) {
                ServiceLocator.log.w(': $e', tag: 'PlaylistProvider');
              }
              if (format == 'txt') {
                channels = await TXTParser.parseFromUrl(url, playlistId!, mergeRule: effectiveMergeRule);
              } else {
                channels = await M3UParser.parseFromUrl(url, playlistId!, mergeRule: effectiveMergeRule);
                epgUrl = M3UParser.lastParseResult?.epgUrl;
              }
            }
          } catch (e) {
            ServiceLocator.log.w('Xtream URL: $e', tag: 'PlaylistProvider');
            final format = _detectPlaylistFormat(url);
            try {
              originalContent = await _downloadContentFromUrl(url);
            } catch (e) {
              ServiceLocator.log.w(': $e', tag: 'PlaylistProvider');
            }
            if (format == 'txt') {
              channels = await TXTParser.parseFromUrl(url, playlistId!, mergeRule: effectiveMergeRule);
            } else {
              channels = await M3UParser.parseFromUrl(url, playlistId!, mergeRule: effectiveMergeRule);
              epgUrl = M3UParser.lastParseResult?.epgUrl;
            }
          }
        } else {
          // Regular URL handling (M3U / TXT)
          final format = _detectPlaylistFormat(url);
          ServiceLocator.log.i(': $format', tag: 'PlaylistProvider');

          // 
          try {
            originalContent = await _downloadContentFromUrl(url);
          } catch (e) {
            ServiceLocator.log.w(': $e', tag: 'PlaylistProvider');
          }

          if (format == 'txt') {
            channels = await TXTParser.parseFromUrl(url, playlistId!, mergeRule: effectiveMergeRule);
          } else {
            channels = await M3UParser.parseFromUrl(url, playlistId!, mergeRule: effectiveMergeRule);
            epgUrl = M3UParser.lastParseResult?.epgUrl;
          }
        }
      } else if (content != null) {
        // From content string
        originalContent = content; // 
        
        final format = _detectPlaylistFormat('', content: content);
        ServiceLocator.log.i(': $format', tag: 'PlaylistProvider');
        
        _importProgress = 0.15;
        notifyListeners();
        
        if (format == 'txt') {
          channels = TXTParser.parse(content, playlistId!, mergeRule: effectiveMergeRule);
        } else {
          channels = M3UParser.parse(content, playlistId!, mergeRule: effectiveMergeRule);
          epgUrl = M3UParser.lastParseResult?.epgUrl;
        }
        
        // Save content to permanent storage for future refreshes
        // Android TV
        final appDir = await getApplicationDocumentsDirectory();
        final playlistDir = Directory('${appDir.path}/playlists');
        
        // 
        if (!await playlistDir.exists()) {
          await playlistDir.create(recursive: true);
          ServiceLocator.log.d(': ${playlistDir.path}', tag: 'PlaylistProvider');
        }
        
        // Clean up old files for this playlist before creating new one
        await _cleanupOldPlaylistFiles(playlistDir, playlistId!);
        
        final timestamp = DateTime.now().millisecondsSinceEpoch;
        // ✅ 
        final extension = format == 'txt' ? 'txt' : 'm3u';
        final playlistFile = File('${playlistDir.path}/playlist_${playlistId}_$timestamp.$extension');
        await playlistFile.writeAsString(content);
        tempFilePath = playlistFile.path;
        
        ServiceLocator.log.d(': $tempFilePath (: $format)', tag: 'PlaylistProvider');
      } else if (filePath != null) {
        // From local file
        final format = _detectPlaylistFormat(filePath);
        ServiceLocator.log.i(': $format', tag: 'PlaylistProvider');
        
        _importProgress = 0.15;
        notifyListeners();
        
        // 
        try {
          final file = File(filePath);
          if (await file.exists()) {
            originalContent = await file.readAsString();
          }
        } catch (e) {
          ServiceLocator.log.w(': $e', tag: 'PlaylistProvider');
        }
        
        if (format == 'txt') {
          channels = await TXTParser.parseFromFile(filePath, playlistId!, mergeRule: effectiveMergeRule);
        } else {
          channels = await M3UParser.parseFromFile(filePath, playlistId!, mergeRule: effectiveMergeRule);
          epgUrl = M3UParser.lastParseResult?.epgUrl;
        }
      } else {
        throw Exception('No valid source provided (url, content, or filePath required)');
      }

      _importProgress = 0.5;
      notifyListeners();

      if (channels.isEmpty) {
        ServiceLocator.log.w('', tag: 'PlaylistProvider');
        throw Exception('No channels found in playlist');
      }
      
      ServiceLocator.log.i(' ${channels.length} ', tag: 'PlaylistProvider');

      // ✅ Step 3:  (50% - 60%)
      ServiceLocator.log.i('', tag: 'PlaylistProvider');
      final channelNames = channels.map((c) => c.name).toList();
      final fallbackLogos = await ServiceLocator.channelLogo.findLogoUrlsBulk(channelNames);
      
      // 
      for (final channel in channels) {
        if (fallbackLogos.containsKey(channel.name)) {
          channel.fallbackLogoUrl = fallbackLogos[channel.name];
        }
      }
      
      ServiceLocator.log.i(' ${fallbackLogos.length} ', tag: 'PlaylistProvider');
      
      _importProgress = 0.6;
      notifyListeners();

      // Step 4: Insert channels in transaction (60% - 90%)
      await ServiceLocator.database.db.transaction((txn) async {
        // Batch insert channels in chunks
        const chunkSize = 500;
        for (int i = 0; i < channels.length; i += chunkSize) {
          final end = (i + chunkSize < channels.length) ? i + chunkSize : channels.length;
          final chunk = channels.sublist(i, end);
          
          final batch = txn.batch();
          for (final channel in chunk) {
            batch.insert('channels', channel.toMap());
          }
          await batch.commit(noResult: true);
          
          ServiceLocator.log.d(' $end/${channels.length} ', tag: 'PlaylistProvider');
        }

        // Update playlist with metadata
        final updateData = <String, dynamic>{
          'last_updated': DateTime.now().millisecondsSinceEpoch,
          'channel_count': channels.length,
        };
        
        if (epgUrl != null) {
          updateData['epg_url'] = epgUrl;
          _lastExtractedEpgUrl = epgUrl;
          ServiceLocator.log.d('EPG URL: $epgUrl', tag: 'PlaylistProvider');
        }
        
        if (tempFilePath != null) {
          updateData['file_path'] = tempFilePath;
        }
        
        await txn.update(
          'playlists',
          updateData,
          where: 'id = ?',
          whereArgs: [playlistId],
        );
      });

      // Debug: log channel counts by type for this playlist (helps verify VOD/Series persistence)
      try {
        final counts = await ServiceLocator.database.rawQuery(
          'SELECT channel_type, COUNT(*) as cnt FROM channels WHERE playlist_id = ? GROUP BY channel_type',
          [playlistId],
        );
        int total = 0;
        final parts = <String>[];
        for (final row in counts) {
          final type = row['channel_type']?.toString() ?? 'unknown';
          final cnt = (row['cnt'] is int) ? (row['cnt'] as int) : ((row['cnt'] is num) ? (row['cnt'] as num).toInt() : 0);
          total += cnt;
          parts.add('$type:$cnt');
        }
        ServiceLocator.log.i('Import debug: playlist $playlistId channel counts: ${parts.join(', ')} (total $total)', tag: 'PlaylistProvider');
      } catch (e) {
        ServiceLocator.log.w('Import debug: failed to query channel counts: $e', tag: 'PlaylistProvider');
      }

      // Update progress after transaction (90%)
      _importProgress = 0.9;
      notifyListeners();

      _importProgress = 0.95;
      notifyListeners();

      // Reload playlists
      await loadPlaylists();
      
      // 
      if (playlistId != null && originalContent != null && originalContent.isNotEmpty) {
        try {
          final format = _detectPlaylistFormat(url ?? filePath ?? '', content: originalContent);
          await _updateBackupFile(playlistId, originalContent, format);
          ServiceLocator.log.i('', tag: 'PlaylistProvider');
        } catch (e) {
          ServiceLocator.log.w(': $e', tag: 'PlaylistProvider');
        }
      }
      
      // Run ANALYZE to update database statistics after large import
      if (playlistId != null) {
        try {
          await ServiceLocator.database.db.execute('ANALYZE');
          ServiceLocator.log.d('', tag: 'PlaylistProvider');
        } catch (e) {
          ServiceLocator.log.w(': $e', tag: 'PlaylistProvider');
        }
      }

      _importProgress = 1.0;
      notifyListeners();

      final totalTime = DateTime.now().difference(startTime).inMilliseconds;
      ServiceLocator.log.i(': ${totalTime}ms', tag: 'PlaylistProvider');
      
      await ServiceLocator.log.flush();

      return _playlists.firstWhere((p) => p.id == playlistId);
    } catch (e) {
      ServiceLocator.log.e('', tag: 'PlaylistProvider', error: e);
      
      // Cleanup on failure
      if (playlistId != null) {
        try {
          await ServiceLocator.database.delete(
            'playlists',
            where: 'id = ?',
            whereArgs: [playlistId],
          );
          await ServiceLocator.database.delete(
            'channels',
            where: 'playlist_id = ?',
            whereArgs: [playlistId],
          );
        } catch (cleanupError) {
          ServiceLocator.log.w('', tag: 'PlaylistProvider', error: cleanupError);
        }
      }
      
      if (tempFilePath != null) {
        try {
          final file = File(tempFilePath!);
          if (await file.exists()) {
            await file.delete();
          }
        } catch (cleanupError) {
          ServiceLocator.log.w('', tag: 'PlaylistProvider', error: cleanupError);
        }
      }
      
      _error = 'Failed to import playlist: $e';
      _isLoading = false;
      notifyListeners();
      rethrow;
    } finally {
      _isLoading = false;
    }
  }

  /// Clean up old playlist files for a specific playlist
  Future<void> _cleanupOldPlaylistFiles(Directory playlistDir, int playlistId) async {
    try {
      final files = playlistDir.listSync();
      // ✅  .m3u  .txt 
      final pattern = RegExp('playlist_${playlistId}_\\d+\\.(m3u|txt)');
      
      for (final file in files) {
        if (file is File && pattern.hasMatch(file.path)) {
          try {
            await file.delete();
            ServiceLocator.log.d(': ${file.path}', tag: 'PlaylistProvider');
          } catch (e) {
            ServiceLocator.log.w(': ${file.path}', tag: 'PlaylistProvider', error: e);
          }
        }
      }
    } catch (e) {
      ServiceLocator.log.w('', tag: 'PlaylistProvider', error: e);
    }
  }

  /// Clean up old temporary files for a playlist (deprecated, kept for compatibility)
  Future<void> _cleanupOldTempFiles(Directory tempDir, int playlistId) async {
    try {
      final files = tempDir.listSync();
      // ✅  .m3u  .txt 
      final pattern = RegExp('playlist_${playlistId}_\\d+\\.(m3u|txt)');
      
      for (final file in files) {
        if (file is File && pattern.hasMatch(file.path)) {
          try {
            await file.delete();
            ServiceLocator.log.d(': ${file.path}', tag: 'PlaylistProvider');
          } catch (e) {
            ServiceLocator.log.w(': ${file.path}', tag: 'PlaylistProvider', error: e);
          }
        }
      }
    } catch (e) {
      ServiceLocator.log.w('', tag: 'PlaylistProvider', error: e);
    }
  }

  // Add a new playlist from URL
  Future<Playlist?> addPlaylistFromUrl(String name, String url, {String? mergeRule}) async {
    return _importPlaylist(name: name, url: url, mergeRule: mergeRule);
  }

  // Add a new playlist from M3U content directly (for QR import)
  Future<Playlist?> addPlaylistFromContent(String name, String content, {String? mergeRule}) async {
    return _importPlaylist(name: name, content: content, mergeRule: mergeRule);
  }

  // Add a new playlist from local file
  Future<Playlist?> addPlaylistFromFile(String name, String filePath, {String? mergeRule}) async {
    return _importPlaylist(name: name, filePath: filePath, mergeRule: mergeRule);
  }

  // Refresh a playlist from its source
  // If silent=true, runs in background without blocking UI
  Future<bool> refreshPlaylist(Playlist playlist, {bool silent = false, String? mergeRule}) async {
    if (playlist.id == null) return false;

    ServiceLocator.log.d(': ${playlist.name} (ID: ${playlist.id}), : $silent', tag: 'PlaylistProvider');
    ServiceLocator.log.d('playlist.url = ${playlist.url}', tag: 'PlaylistProvider');
    ServiceLocator.log.d('playlist.filePath = ${playlist.filePath}', tag: 'PlaylistProvider');
    ServiceLocator.log.d('playlist.isRemote = ${playlist.isRemote}', tag: 'PlaylistProvider');
    ServiceLocator.log.d('playlist.isLocal = ${playlist.isLocal}', tag: 'PlaylistProvider');

    if (!silent) {
      _isLoading = true;
      _importProgress = 0.0;
      _error = null;
      notifyListeners();
    }

    try {
      //  playlist 
      final dbResults = await ServiceLocator.database.query(
        'playlists',
        where: 'id = ?',
        whereArgs: [playlist.id],
      );

      if (dbResults.isEmpty) {
        throw Exception('Playlist not found in database');
      }

      final freshPlaylist = Playlist.fromMap(dbResults.first);
      ServiceLocator.log.d(' - URL: ${freshPlaylist.url}, FilePath: ${freshPlaylist.filePath}', tag: 'PlaylistProvider');

      List<Channel> channels;

      // Use provided merge rule or default to 'name_group'
      final effectiveMergeRule = mergeRule ?? 'name_group';
      ServiceLocator.log.d(': $effectiveMergeRule', tag: 'PlaylistProvider');

      ServiceLocator.log.d(': ${freshPlaylist.isRemote ? "URL" : freshPlaylist.isLocal ? "" : ""}', tag: 'PlaylistProvider');
      ServiceLocator.log.d(': ${freshPlaylist.sourcePath}', tag: 'PlaylistProvider');

      if (freshPlaylist.isRemote) {
        ServiceLocator.log.d('URL: ${freshPlaylist.url}', tag: 'PlaylistProvider');

        // Xtream URL: use API import path so LIVE/VOD/SERIES are all persisted correctly
        if (_looksLikeXtreamUrl(freshPlaylist.url!)) {
          final creds = _parseXtreamCredentials(freshPlaylist.url!);
          final base = creds['base'];
          final user = creds['username'];
          final pass = creds['password'];

          if (base != null && user != null && pass != null) {
            ServiceLocator.log.i(' Xtream  API LIVE/VOD/SERIES', tag: 'PlaylistProvider');
            channels = await _importFromXtream(
              baseServer: base,
              username: user,
              password: pass,
              playlistId: playlist.id!,
              mergeRule: effectiveMergeRule,
            );
          } else {
            ServiceLocator.log.w(' Xtream ', tag: 'PlaylistProvider');

            final format = _detectPlaylistFormat(freshPlaylist.url!);
            ServiceLocator.log.d(': $format', tag: 'PlaylistProvider');

            if (format == 'txt') {
              channels = await TXTParser.parseFromUrl(freshPlaylist.url!, playlist.id!, mergeRule: effectiveMergeRule);
            } else {
              channels = await M3UParser.parseFromUrl(freshPlaylist.url!, playlist.id!, mergeRule: effectiveMergeRule);
            }

            if (format == 'm3u') {
              _lastExtractedEpgUrl = M3UParser.lastParseResult?.epgUrl;
              if (_lastExtractedEpgUrl != null) {
                ServiceLocator.log.d('M3UEPG URL: $_lastExtractedEpgUrl', tag: 'PlaylistProvider');
              }
            }
          }
        } else {
          // Detect format and parse accordingly
          final format = _detectPlaylistFormat(freshPlaylist.url!);
          ServiceLocator.log.d(': $format', tag: 'PlaylistProvider');

          if (format == 'txt') {
            channels = await TXTParser.parseFromUrl(freshPlaylist.url!, playlist.id!, mergeRule: effectiveMergeRule);
          } else {
            channels = await M3UParser.parseFromUrl(freshPlaylist.url!, playlist.id!, mergeRule: effectiveMergeRule);
          }

          // Check for EPG URL in M3U header (only for M3U format)
          if (format == 'm3u') {
            _lastExtractedEpgUrl = M3UParser.lastParseResult?.epgUrl;
            if (_lastExtractedEpgUrl != null) {
              ServiceLocator.log.d('M3UEPG URL: $_lastExtractedEpgUrl', tag: 'PlaylistProvider');
            }
          }
        }
      } else if (freshPlaylist.isLocal) {
        ServiceLocator.log.d(': ${freshPlaylist.filePath}', tag: 'PlaylistProvider');

        // Check if file exists before trying to parse
        final file = File(freshPlaylist.filePath!);
        if (!await file.exists()) {
          ServiceLocator.log.d(': ${freshPlaylist.filePath}', tag: 'PlaylistProvider');
          throw Exception('Local playlist file not found: ${freshPlaylist.filePath}');
        }

        // Detect format and parse accordingly
        final format = _detectPlaylistFormat(freshPlaylist.filePath!);
        ServiceLocator.log.d(': $format', tag: 'PlaylistProvider');
        
        if (format == 'txt') {
          channels = await TXTParser.parseFromFile(freshPlaylist.filePath!, playlist.id!, mergeRule: effectiveMergeRule);
        } else {
          channels = await M3UParser.parseFromFile(freshPlaylist.filePath!, playlist.id!, mergeRule: effectiveMergeRule);
        }
        
        // Check for EPG URL in M3U header (only for M3U format)
        if (format == 'm3u') {
          _lastExtractedEpgUrl = M3UParser.lastParseResult?.epgUrl;
          if (_lastExtractedEpgUrl != null) {
            ServiceLocator.log.d('M3UEPG URL: $_lastExtractedEpgUrl', tag: 'PlaylistProvider');
          }
        }
      } else {
        // Check if this is a content-imported playlist without a proper file path
        ServiceLocator.log.d('URL: ${freshPlaylist.url}, : ${freshPlaylist.filePath}', tag: 'PlaylistProvider');
        throw Exception('Invalid playlist source - URL: ${freshPlaylist.url}, File: ${freshPlaylist.filePath}');
      }

      ServiceLocator.log.d(' ${channels.length} ', tag: 'PlaylistProvider');

      if (!silent) {
        _importProgress = 0.5;
        notifyListeners();
      }

      // ✅ 
      ServiceLocator.log.i('', tag: 'PlaylistProvider');
      final channelNames = channels.map((c) => c.name).toList();
      final fallbackLogos = await ServiceLocator.channelLogo.findLogoUrlsBulk(channelNames);
      
      // 
      for (final channel in channels) {
        if (fallbackLogos.containsKey(channel.name)) {
          channel.fallbackLogoUrl = fallbackLogos[channel.name];
        }
      }
      
      ServiceLocator.log.i(' ${fallbackLogos.length} ', tag: 'PlaylistProvider');

      if (!silent) {
        _importProgress = 0.6;
        notifyListeners();
      }

      // URL
      ServiceLocator.log.d('...', tag: 'PlaylistProvider');
      final savedChannelInfo = await ServiceLocator.watchHistory.saveWatchHistoryChannelInfo(playlist.id!);
      ServiceLocator.log.d(' ${savedChannelInfo.length} ', tag: 'PlaylistProvider');

      // ✅ 
      ServiceLocator.log.d('...', tag: 'PlaylistProvider');
      final favoriteChannelNames = await _saveFavoriteChannelNames(playlist.id!);
      ServiceLocator.log.d(' ${favoriteChannelNames.length} ', tag: 'PlaylistProvider');

      // 
      // 
      await ServiceLocator.database.db.transaction((txn) async {
        // Delete existing channels
        ServiceLocator.log.d('...', tag: 'PlaylistProvider');
        final deleteResult = await txn.delete(
          'channels',
          where: 'playlist_id = ?',
          whereArgs: [playlist.id],
        );
        ServiceLocator.log.d(' $deleteResult ', tag: 'PlaylistProvider');

        // Insert new channels - 
        const chunkSize = 500;
        for (int i = 0; i < channels.length; i += chunkSize) {
          final end = (i + chunkSize < channels.length) ? i + chunkSize : channels.length;
          final chunk = channels.sublist(i, end);
          
          final batch = txn.batch();
          for (final channel in chunk) {
            final channelMap = channel.toMap();
            batch.insert('channels', channelMap);
          }
          await batch.commit(noResult: true);
          ServiceLocator.log.d(' $end/${channels.length} ', tag: 'PlaylistProvider');
        }
      });

      // ✅ 
      if (favoriteChannelNames.isNotEmpty) {
        ServiceLocator.log.d('...', tag: 'PlaylistProvider');
        final restoredCount = await _restoreFavoritesByName(playlist.id!, favoriteChannelNames);
        ServiceLocator.log.d(' $restoredCount ', tag: 'PlaylistProvider');
      }

      // Update playlist timestamp and EPG URL
      ServiceLocator.log.d('EPG URL...', tag: 'PlaylistProvider');
      final updateData = <String, dynamic>{
        'last_updated': DateTime.now().millisecondsSinceEpoch,
        'channel_count': channels.length,
      };
      
      //  EPG URL
      if (_lastExtractedEpgUrl != null) {
        updateData['epg_url'] = _lastExtractedEpgUrl;
        ServiceLocator.log.d('EPG URL: $_lastExtractedEpgUrl', tag: 'PlaylistProvider');
      }
      
      await ServiceLocator.database.update(
        'playlists',
        updateData,
        where: 'id = ?',
        whereArgs: [playlist.id],
      );

      if (!silent) {
        _importProgress = 1.0;
        ServiceLocator.log.d(': 100%', tag: 'PlaylistProvider');
        notifyListeners();
      }

      // IDURLID
      ServiceLocator.log.d('ID...', tag: 'PlaylistProvider');
      await ServiceLocator.watchHistory.updateChannelIdsAfterRefresh(playlist.id!, savedChannelInfo);
      ServiceLocator.log.d('ID', tag: 'PlaylistProvider');

      // URL
      ServiceLocator.redirectCache.clearAllCache();
      ServiceLocator.log.d('', tag: 'PlaylistProvider');

      // Reload playlists
      ServiceLocator.log.d('...', tag: 'PlaylistProvider');
      await loadPlaylists();

      ServiceLocator.log.d('', tag: 'PlaylistProvider');
      
      if (!silent) {
        _isLoading = false;
      }
      
      // ✅  Provider 
      notifyListeners();
      
      return true;
    } catch (e) {
      ServiceLocator.log.e('', tag: 'PlaylistProvider', error: e);
      ServiceLocator.log.d(': ${StackTrace.current}', tag: 'PlaylistProvider');
      _error = 'Failed to refresh playlist: $e';
      
      if (!silent) {
        _isLoading = false;
        notifyListeners();
      }
      
      return false;
    }
  }

  // Delete a playlist
  Future<bool> deletePlaylist(int playlistId) async {
    try {
      // Find the playlist before deletion to check for temp files
      final playlist = _playlists.firstWhere(
        (p) => p.id == playlistId, 
        orElse: () => Playlist(name: '')
      );
      final wasActive = _activePlaylist?.id == playlistId;

      // Use transaction for data consistency
      await ServiceLocator.database.db.transaction((txn) async {
        // Delete channels first (cascade should handle this, but being explicit)
        await txn.delete(
          'channels',
          where: 'playlist_id = ?',
          whereArgs: [playlistId],
        );

        // Delete playlist
        await txn.delete(
          'playlists',
          where: 'id = ?',
          whereArgs: [playlistId],
        );
      });

      // Delete playlist file if exists (both temp and permanent storage)
      if (playlist.filePath != null) {
        try {
          final file = File(playlist.filePath!);
          if (await file.exists()) {
            await file.delete();
            ServiceLocator.log.d(': ${playlist.filePath}', tag: 'PlaylistProvider');
          }
        } catch (e) {
          ServiceLocator.log.w(': $e', tag: 'PlaylistProvider');
        }
      }
      
      // Also clean up any old files for this playlist in both directories
      try {
        // Clean up from temp directory
        final tempDir = await getTemporaryDirectory();
        await _cleanupOldTempFiles(tempDir, playlistId);
        
        // Clean up from permanent storage
        final appDir = await getApplicationDocumentsDirectory();
        final playlistDir = Directory('${appDir.path}/playlists');
        if (await playlistDir.exists()) {
          await _cleanupOldPlaylistFiles(playlistDir, playlistId);
        }
        
        // ✅ Clean up backup file
        final backupDir = Directory('${appDir.path}/playlists/backups');
        if (await backupDir.exists()) {
          final backupFiles = [
            File('${backupDir.path}/playlist_${playlistId}_backup.m3u'),
            File('${backupDir.path}/playlist_${playlistId}_backup.txt'),
          ];
          
          for (final backupFile in backupFiles) {
            if (await backupFile.exists()) {
              await backupFile.delete();
              ServiceLocator.log.d(': ${backupFile.path}', tag: 'PlaylistProvider');
            }
          }
        }
      } catch (e) {
        ServiceLocator.log.w(': $e', tag: 'PlaylistProvider');
      }

      // URL
      ServiceLocator.redirectCache.clearAllCache();
      ServiceLocator.log.d('', tag: 'PlaylistProvider');

      // Update local state
      _playlists.removeWhere((p) => p.id == playlistId);

      // If the deleted playlist was active, switch to the first available playlist
      if (wasActive) {
        if (_playlists.isNotEmpty) {
          _activePlaylist = _playlists.first;
          // Save the new active playlist to database
          await ServiceLocator.prefs.setInt('active_playlist_id', _activePlaylist!.id!);
          ServiceLocator.log.d(': ${_activePlaylist!.name} (ID: ${_activePlaylist!.id})', tag: 'PlaylistProvider');
        } else {
          _activePlaylist = null;
          await ServiceLocator.prefs.remove('active_playlist_id');
          ServiceLocator.log.d('', tag: 'PlaylistProvider');
        }
      }

      notifyListeners();

      // Run VACUUM in background to reclaim space (don't await to avoid blocking UI)
      optimizeDatabase().then((_) {
        ServiceLocator.log.d('', tag: 'PlaylistProvider');
      }).catchError((e) {
        ServiceLocator.log.w(': $e', tag: 'PlaylistProvider');
      });

      return true;
    } catch (e) {
      ServiceLocator.log.e('', tag: 'PlaylistProvider', error: e);
      _error = 'Failed to delete playlist: $e';
      notifyListeners();
      return false;
    }
  }

  // Set active playlist
  void setActivePlaylist(Playlist playlist, {Function(int)? onPlaylistChanged, FavoritesProvider? favoritesProvider}) async {
    ServiceLocator.log.d('DEBUG: : ${playlist.name} (ID: ${playlist.id})');
    _activePlaylist = playlist;

    // Update database to mark this playlist as active
    if (playlist.id != null) {
      try {
        // Mark all playlists as inactive
        await ServiceLocator.database.update(
          'playlists',
          {'is_active': 0},
        );

        // Mark this playlist as active
        await ServiceLocator.database.update(
          'playlists',
          {'is_active': 1},
          where: 'id = ?',
          whereArgs: [playlist.id],
        );
      } catch (e) {
        ServiceLocator.log.d('DEBUG: : $e');
      }
    }

    // Notify listeners immediately for UI update
    notifyListeners();

    // Trigger channel loading via callback
    if (playlist.id != null && onPlaylistChanged != null) {
      try {
        ServiceLocator.log.d('DEBUG: ...');
        onPlaylistChanged(playlist.id!);
      } catch (e) {
        ServiceLocator.log.d('DEBUG: : $e');
      }
    }

    // Update favorites provider with the new active playlist
    if (playlist.id != null && favoritesProvider != null) {
      try {
        ServiceLocator.log.d('DEBUG: ID...');
        favoritesProvider.setActivePlaylistId(playlist.id!);
        await favoritesProvider.loadFavorites();
      } catch (e) {
        ServiceLocator.log.d('DEBUG: : $e');
      }
    }
  }

  // Update playlist
  Future<bool> updatePlaylist(Playlist playlist) async {
    if (playlist.id == null) return false;

    try {
      await ServiceLocator.database.update(
        'playlists',
        playlist.toMap(),
        where: 'id = ?',
        whereArgs: [playlist.id],
      );

      final index = _playlists.indexWhere((p) => p.id == playlist.id);
      if (index != -1) {
        _playlists[index] = playlist;
      }

      notifyListeners();
      return true;
    } catch (e) {
      _error = 'Failed to update playlist: $e';
      notifyListeners();
      return false;
    }
  }

  // Clear error
  void clearError() {
    _error = null;
    notifyListeners();
  }

  /// Clean up all old playlist files from both temp and permanent storage
  Future<void> cleanupAllTempFiles() async {
    int totalDeleted = 0;
    
    try {
      // 
      final tempDir = await getTemporaryDirectory();
      if (await tempDir.exists()) {
        final tempFiles = tempDir.listSync();
        final pattern = RegExp(r'playlist_\d+_\d+\.m3u');
        
        for (final file in tempFiles) {
          if (file is File && pattern.hasMatch(file.path)) {
            try {
              await file.delete();
              totalDeleted++;
            } catch (e) {
              ServiceLocator.log.w(': ${file.path}', tag: 'PlaylistProvider');
            }
          }
        }
      }
      
      // 
      final appDir = await getApplicationDocumentsDirectory();
      final playlistDir = Directory('${appDir.path}/playlists');
      
      if (await playlistDir.exists()) {
        final playlistFiles = playlistDir.listSync();
        final pattern = RegExp(r'playlist_\d+_\d+\.m3u');
        
        // ID
        final validPlaylistIds = _playlists.map((p) => p.id).whereType<int>().toSet();
        
        for (final file in playlistFiles) {
          if (file is File && pattern.hasMatch(file.path)) {
            // ID
            final match = RegExp(r'playlist_(\d+)_\d+\.m3u').firstMatch(file.path);
            if (match != null) {
              final playlistId = int.tryParse(match.group(1)!);
              // ID
              if (playlistId != null && !validPlaylistIds.contains(playlistId)) {
                try {
                  await file.delete();
                  totalDeleted++;
                  ServiceLocator.log.d(': ${file.path}', tag: 'PlaylistProvider');
                } catch (e) {
                  ServiceLocator.log.w(': ${file.path}', tag: 'PlaylistProvider');
                }
              }
            }
          }
        }
      }
      
      if (totalDeleted > 0) {
        ServiceLocator.log.i(' $totalDeleted ', tag: 'PlaylistProvider');
      }
    } catch (e) {
      ServiceLocator.log.e('', tag: 'PlaylistProvider', error: e);
    }
  }

  /// Refresh playlist with callback for UI updates
  /// This is a unified method for both home screen and playlist screen
  Future<void> refreshPlaylistWithCallback({
    required Playlist playlist,
    required BuildContext context,
    bool silent = false,
    Function(bool success, String? error)? onComplete,
  }) async {
    if (playlist.id == null) {
      onComplete?.call(false, 'Invalid playlist ID');
      return;
    }

    final startTime = DateTime.now();

    // Show initial message (must be on main thread)
    if (context.mounted) {
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(
          content: Text(silent 
              ? ' ${playlist.name}...' 
              : ' ${playlist.name}...'),
          duration: const Duration(seconds: 2),
        ),
      );
    }

    // Get merge rule from settings
    final settings = context.read<SettingsProvider>();
    final mergeRule = settings.channelMergeRule;

    // Execute refresh
    final success = await refreshPlaylist(playlist, silent: silent, mergeRule: mergeRule);
    
    final refreshTime = DateTime.now().difference(startTime).inMilliseconds;

    // Use scheduleMicrotask to ensure we're on the main thread for UI updates
    if (context.mounted) {
      scheduleMicrotask(() {
        if (!context.mounted) return;
        
        if (success) {
          ServiceLocator.log.i(': ${refreshTime}ms', tag: 'PlaylistProvider');
          
          ScaffoldMessenger.of(context).showSnackBar(
            SnackBar(
              content: Text('${playlist.name} '),
              duration: const Duration(seconds: 2),
              backgroundColor: Colors.green,
            ),
          );
        } else {
          ServiceLocator.log.e('', tag: 'PlaylistProvider');
          
          ScaffoldMessenger.of(context).showSnackBar(
            SnackBar(
              content: Text(
                  '${playlist.name} : ${_error?.replaceAll("Exception:", "").trim() ?? ""}'),
              duration: const Duration(seconds: 5),
              backgroundColor: Colors.red,
            ),
          );
        }
      });
    }

    // Call completion callback
    onComplete?.call(success, success ? null : _error);
  }

  /// Optimize database by running VACUUM
  /// Should be called after large deletions or periodically
  Future<bool> optimizeDatabase() async {
    try {
      ServiceLocator.log.i('', tag: 'PlaylistProvider');
      
      final sizeBefore = await ServiceLocator.database.getDatabaseSize();
      await ServiceLocator.database.vacuum();
      final sizeAfter = await ServiceLocator.database.getDatabaseSize();
      
      final savedBytes = sizeBefore - sizeAfter;
      final savedMB = (savedBytes / (1024 * 1024)).toStringAsFixed(2);
      
      ServiceLocator.log.i(': ${savedMB}MB', tag: 'PlaylistProvider');
      return true;
    } catch (e) {
      ServiceLocator.log.e('', tag: 'PlaylistProvider', error: e);
      return false;
    }
  }

  /// ✅ 
  Future<Map<String, int>> _saveFavoriteChannelNames(int playlistId) async {
    try {
      ServiceLocator.log.i(' $playlistId ', tag: 'PlaylistProvider');
      
      final results = await ServiceLocator.database.rawQuery('''
        SELECT c.name, f.position
        FROM favorites f
        INNER JOIN channels c ON f.channel_id = c.id
        WHERE c.playlist_id = ?
        ORDER BY f.position
      ''', [playlistId]);
      
      ServiceLocator.log.i(' ${results.length} ', tag: 'PlaylistProvider');
      
      final Map<String, int> favoriteMap = {};
      for (final row in results) {
        final name = row['name'] as String;
        final position = row['position'] as int;
        favoriteMap[name] = position;
        ServiceLocator.log.d(': $name (: $position)', tag: 'PlaylistProvider');
      }
      
      return favoriteMap;
    } catch (e) {
      ServiceLocator.log.e('', tag: 'PlaylistProvider', error: e);
      return {};
    }
  }

  /// ✅ 
  Future<int> _restoreFavoritesByName(int playlistId, Map<String, int> favoriteMap) async {
    try {
      ServiceLocator.log.i(' ${favoriteMap.length} ', tag: 'PlaylistProvider');
      int restoredCount = 0;
      
      for (final entry in favoriteMap.entries) {
        final channelName = entry.key;
        final position = entry.value;
        
        ServiceLocator.log.d(': $channelName', tag: 'PlaylistProvider');
        
        // ID
        final results = await ServiceLocator.database.rawQuery('''
          SELECT id FROM channels 
          WHERE playlist_id = ? AND name = ? 
          LIMIT 1
        ''', [playlistId, channelName]);
        
        if (results.isNotEmpty) {
          final channelId = results.first['id'] as int;
          
          ServiceLocator.log.d('ID: $channelId', tag: 'PlaylistProvider');
          
          // 
          await ServiceLocator.database.insert('favorites', {
            'channel_id': channelId,
            'position': position,
            'created_at': DateTime.now().millisecondsSinceEpoch,
          });
          
          restoredCount++;
        } else {
          ServiceLocator.log.w(': $channelName', tag: 'PlaylistProvider');
        }
      }
      
      ServiceLocator.log.i(' $restoredCount ', tag: 'PlaylistProvider');
      return restoredCount;
    } catch (e) {
      ServiceLocator.log.e('', tag: 'PlaylistProvider', error: e);
      return 0;
    }
  }
  
  // ============  ============
  
  /// UI
  Future<void> _createMissingBackups() async {
    for (final playlistId in _playlistsNeedingBackup.toList()) {
      try {
        await _createBackupForPlaylist(playlistId);
        _playlistsNeedingBackup.remove(playlistId);
      } catch (e) {
        ServiceLocator.log.w(' $playlistId : $e', tag: 'PlaylistProvider');
      }
    }
  }
  
  /// 
  Future<void> _createBackupForPlaylist(int playlistId) async {
    final playlist = _playlists.firstWhere(
      (p) => p.id == playlistId,
      orElse: () => Playlist(name: ''),
    );
    
    if (playlist.id == null) {
      ServiceLocator.log.w('ID', tag: 'PlaylistProvider');
      return;
    }
    
    String? sourceContent;
    
    // 
    try {
      if (playlist.url != null && playlist.url!.isNotEmpty) {
        // URL
        ServiceLocator.log.d('URL: ${playlist.url}', tag: 'PlaylistProvider');
        sourceContent = await _downloadContentFromUrl(playlist.url!);
      } else if (playlist.filePath != null && playlist.filePath!.isNotEmpty) {
        // 
        final file = File(playlist.filePath!);
        if (await file.exists()) {
          ServiceLocator.log.d(': ${playlist.filePath}', tag: 'PlaylistProvider');
          sourceContent = await file.readAsString();
        } else {
          ServiceLocator.log.w(': ${playlist.filePath}', tag: 'PlaylistProvider');
        }
      }
      
      // 
      if (sourceContent == null) {
        sourceContent = await _tryFindOldTempFile(playlistId);
      }
    } catch (e) {
      ServiceLocator.log.w(': $e', tag: 'PlaylistProvider');
    }
    
    if (sourceContent != null && sourceContent.isNotEmpty) {
      // 
      final backupPath = await _saveBackupFile(playlistId, sourceContent, playlist.format);
      
      // 
      await ServiceLocator.database.update(
        'playlists',
        {
          'backup_path': backupPath,
          'file_path': backupPath, // file_path
          'last_backup_time': DateTime.now().millisecondsSinceEpoch,
        },
        where: 'id = ?',
        whereArgs: [playlistId],
      );
      
      ServiceLocator.log.i(' "${playlist.name}" (ID: $playlistId) : $backupPath', tag: 'PlaylistProvider');
    } else {
      ServiceLocator.log.w(' "${playlist.name}" (ID: $playlistId) ', tag: 'PlaylistProvider');
    }
  }
  
  /// URL
  Future<String> _downloadContentFromUrl(String url) async {
    final dio = ServiceLocator.createDio();
    final response = await dio.get(
      url,
      options: Options(
        responseType: ResponseType.plain,
        followRedirects: true,
        validateStatus: (status) => status! < 500,
      ),
    );
    
    if (response.statusCode == 200) {
      return response.data.toString();
    } else {
      throw Exception('HTTP ${response.statusCode}');
    }
  }

  /// Heuristic: detect Xtream-style URLs (player_api.php / get.php with username/password)
  bool _looksLikeXtreamUrl(String url) {
    try {
      final uri = Uri.parse(url);
      final path = uri.path.toLowerCase();
      final query = uri.query.toLowerCase();

      if (path.contains('player_api.php') || path.contains('get.php')) return true;
      if (query.contains('username=') && query.contains('password=')) return true;
      return false;
    } catch (e) {
      return false;
    }
  }

  /// Parse base server, username and password from a Xtream URL (get.php or player_api.php)
  Map<String, String?> _parseXtreamCredentials(String url) {
    final uri = Uri.parse(url);
    String base = '${uri.scheme}://${uri.host}';
    if (uri.hasPort) base = '$base:${uri.port}';

    final params = uri.queryParameters;
    final username = params['username'] ?? params['user'];
    final password = params['password'] ?? params['pass'];

    return {
      'base': base,
      'username': username,
      'password': password,
    };
  }

  /// Import channels using the Xtream `player_api.php` endpoints.
  /// This avoids downloading a monolithic M3U and uses the API to fetch categories and streams.
  Future<List<Channel>> _importFromXtream({
    required String baseServer,
    required String username,
    required String password,
    required int playlistId,
    required String mergeRule,
  }) async {
    final dio = ServiceLocator.createDio();
    dio.options.connectTimeout = const Duration(seconds: 10);
    dio.options.receiveTimeout = const Duration(seconds: 20);
    dio.options.validateStatus = (status) => status != null && status < 500;

    // Validate main endpoint
    final authUrl = '$baseServer/player_api.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}';
    final authResp = await dio.get(authUrl);
    if (authResp.statusCode != 200 || authResp.data == null || authResp.data is! Map) {
      throw Exception('No se pudo validar la cuenta Xtream');
    }

    final result = <Channel>[];

    // Fetch LIVE categories (if available)
    final catUrl = '$baseServer/player_api.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}&action=get_live_categories';
    final catResp = await dio.get(catUrl);

    List categories = [];
    if (catResp.statusCode == 200 && catResp.data is List) {
      categories = catResp.data as List;
    }

    // Build category map for quick group naming when using single-call stream import
    final Map<String, String> categoryNames = {};
    for (final c in categories) {
      if (c is! Map) continue;
      final categoryId = c['category_id']?.toString();
      final categoryName = c['category_name']?.toString() ?? c['title']?.toString() ?? 'LIVE';
      if (categoryId != null && categoryId.isNotEmpty) {
        categoryNames[categoryId] = categoryName;
      }
    }

    // Fast path: fetch all LIVE streams in one request (much faster on TV boxes)
    final allStreamsUrl = '$baseServer/player_api.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}&action=get_live_streams';
    final allStreamsResp = await dio.get(allStreamsUrl);
    if (allStreamsResp.statusCode == 200 && allStreamsResp.data is List) {
      final streams = allStreamsResp.data as List;
      for (final s in streams) {
        if (s is! Map) continue;
        final streamCategoryId = s['category_id']?.toString();
        final groupName = (streamCategoryId != null && categoryNames.containsKey(streamCategoryId))
            ? categoryNames[streamCategoryId]
            : null;
        final ch = _channelFromXtreamMap(s, groupName, baseServer, username, password, playlistId, channelType: 'live');
        result.add(ch);
      }
      ServiceLocator.log.i('Xtream LIVE: ${result.length} ', tag: 'PlaylistProvider');
    } else if (categories.isNotEmpty) {
      // Fallback: per-category live streams
      for (final c in categories) {
        if (c is! Map) continue;
        final categoryId = c['category_id']?.toString();
        final categoryName = c['category_name']?.toString() ?? c['title']?.toString() ?? 'LIVE';
        if (categoryId == null) continue;
        final streamsUrl = '$baseServer/player_api.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}&action=get_live_streams&category_id=${Uri.encodeComponent(categoryId)}';
        final streamsResp = await dio.get(streamsUrl);
        if (streamsResp.statusCode != 200 || streamsResp.data is! List) continue;
        for (final s in (streamsResp.data as List)) {
          if (s is Map) result.add(_channelFromXtreamMap(s, categoryName, baseServer, username, password, playlistId, channelType: 'live'));
        }
      }
    }

    // ── VOD (Movies) ─────────────────────────────────────────────────────────
    try {
      final vodCatUrl = '$baseServer/player_api.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}&action=get_vod_categories';
      final vodCatResp = await dio.get(vodCatUrl);
      if (vodCatResp.statusCode == 200 && vodCatResp.data is List) {
        final vodCategoryNames = <String, String>{};
        for (final c in (vodCatResp.data as List)) {
          if (c is! Map) continue;
          final id = c['category_id']?.toString();
          final name = c['category_name']?.toString() ?? 'Movies';
          if (id != null) vodCategoryNames[id] = name;
        }

        final vodUrl = '$baseServer/player_api.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}&action=get_vod_streams';
        final vodResp = await dio.get(vodUrl);
        if (vodResp.statusCode == 200 && vodResp.data is List) {
          int vodCount = 0;
          for (final s in (vodResp.data as List)) {
            if (s is! Map) continue;
            final catId = s['category_id']?.toString();
            final groupName = (catId != null && vodCategoryNames.containsKey(catId)) ? vodCategoryNames[catId] : null;
            result.add(_channelFromVodMap(s, groupName, baseServer, username, password, playlistId));
            vodCount++;
          }
          ServiceLocator.log.i('Xtream VOD: $vodCount ', tag: 'PlaylistProvider');
        }
      }
    } catch (e) {
      ServiceLocator.log.w('Xtream VOD: $e', tag: 'PlaylistProvider');
    }

    // ── Series ────────────────────────────────────────────────────────────────
    try {
      final serCatUrl = '$baseServer/player_api.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}&action=get_series_categories';
      final serCatResp = await dio.get(serCatUrl);
      if (serCatResp.statusCode == 200 && serCatResp.data is List) {
        final seriesCategoryNames = <String, String>{};
        for (final c in (serCatResp.data as List)) {
          if (c is! Map) continue;
          final id = c['category_id']?.toString();
          final name = c['category_name']?.toString() ?? 'Series';
          if (id != null) seriesCategoryNames[id] = name;
        }

        final serUrl = '$baseServer/player_api.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}&action=get_series';
        final serResp = await dio.get(serUrl);
        if (serResp.statusCode == 200 && serResp.data is List) {
          int serCount = 0;
          for (final s in (serResp.data as List)) {
            if (s is! Map) continue;
            final catId = s['category_id']?.toString();
            final groupName = (catId != null && seriesCategoryNames.containsKey(catId)) ? seriesCategoryNames[catId] : null;
            result.add(_channelFromSeriesMap(s, groupName, baseServer, username, password, playlistId));
            serCount++;
          }
          ServiceLocator.log.i('Xtream Series: $serCount ', tag: 'PlaylistProvider');
        }
      }
    } catch (e) {
      ServiceLocator.log.w('Xtream Series: $e', tag: 'PlaylistProvider');
    }

    ServiceLocator.log.i('Xtream: ${result.length} ', tag: 'PlaylistProvider');
    return result;
  }

  Channel _channelFromVodMap(Map s, String? categoryName, String baseServer, String username, String password, int playlistId) {
    final name = (s['name'] ?? s['title'] ?? s['stream_name'] ?? 'Unknown').toString();
    String? logo = s['stream_icon']?.toString() ?? s['cover']?.toString() ?? s['logo']?.toString();
    final ext = (s['container_extension']?.toString() ?? 'mp4').replaceAll('.', '');
    final streamId = (s['stream_id'] ?? s['id'])?.toString();
    String url = streamId != null
        ? '$baseServer/movie/$username/$password/$streamId.$ext'
        : '$baseServer/movie/$username/$password/0.$ext';
    return Channel(
      playlistId: playlistId,
      name: name,
      url: url,
      sources: [url],
      logoUrl: logo,
      groupName: categoryName,
      channelType: 'vod',
    );
  }

  Channel _channelFromSeriesMap(Map s, String? categoryName, String baseServer, String username, String password, int playlistId) {
    final name = (s['name'] ?? s['title'] ?? 'Unknown Series').toString();
    String? logo = s['cover']?.toString() ?? s['stream_icon']?.toString();
    final seriesId = (s['series_id'] ?? s['id'])?.toString();
    // Series don't have a direct stream URL; store a placeholder that links to the series
    String url = seriesId != null
        ? '$baseServer/series/$username/$password/$seriesId'
        : '$baseServer/player_api.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}&action=get_series_info&series_id=0';
    return Channel(
      playlistId: playlistId,
      name: name,
      url: url,
      sources: [url],
      logoUrl: logo,
      groupName: categoryName,
      channelType: 'series',
    );
  }

  Channel _channelFromXtreamMap(Map s, String? categoryName, String baseServer, String username, String password, int playlistId, {String channelType = 'live'}) {
    final name = (s['name'] ?? s['channel_name'] ?? s['stream_name'] ?? 'Unknown Channel').toString();

    String? logo;
    if (s['stream_icon'] != null) logo = s['stream_icon'].toString();
    if (logo == null && s['logo'] != null) logo = s['logo'].toString();

    String? epgId;
    if (s['epg_channel_id'] != null) epgId = s['epg_channel_id'].toString();

    // Prefer explicit stream URL if provided
    String url = '';
    if (s['stream_url'] != null) {
      url = s['stream_url'].toString();
    } else if (s['url'] != null) {
      url = s['url'].toString();
    } else if (s['stream_id'] != null) {
      final sid = s['stream_id'].toString();
      // Common Xtream direct stream patterns - include multiple candidates
      url = '$baseServer/live/$username/$password/$sid.ts';
    } else if (s['id'] != null) {
      final sid = s['id'].toString();
      url = '$baseServer/live/$username/$password/$sid.ts';
    } else {
      // Fallback to base get.php (server-wide M3U) - not ideal but last resort
      url = '$baseServer/get.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}&output=ts&type=m3u_plus';
    }

    // Provide alternative sources where reasonable
    final sources = <String>[];
    if (url.isNotEmpty) sources.add(url);
    // If we used stream_id, also add m3u8 variant
    if ((s['stream_id'] ?? s['id']) != null) {
      final sid = (s['stream_id'] ?? s['id']).toString();
      final alt = '$baseServer/live/$username/$password/$sid.m3u8';
      if (!sources.contains(alt)) sources.add(alt);
    }

    return Channel(
      playlistId: playlistId,
      name: name,
      url: url,
      sources: sources,
      logoUrl: logo,
      groupName: categoryName,
      epgId: epgId,
      channelType: channelType,
    );
  }
  
  /// 
  Future<String> _saveBackupFile(int playlistId, String content, String format) async {
    final appDir = await getApplicationDocumentsDirectory();
    final backupDir = Directory('${appDir.path}/playlists/backups');
    
    // 
    if (!await backupDir.exists()) {
      await backupDir.create(recursive: true);
      ServiceLocator.log.d(': ${backupDir.path}', tag: 'PlaylistProvider');
    }
    
    // 
    final extension = format.toLowerCase() == 'txt' ? 'txt' : 'm3u';
    final backupFile = File('${backupDir.path}/playlist_${playlistId}_backup.$extension');
    
    await backupFile.writeAsString(content);
    ServiceLocator.log.d(': ${backupFile.path}', tag: 'PlaylistProvider');
    
    return backupFile.path;
  }
  
  /// 
  Future<String?> _tryFindOldTempFile(int playlistId) async {
    try {
      // 
      final tempDir = await getTemporaryDirectory();
      if (!await tempDir.exists()) return null;
      
      final files = tempDir.listSync();
      final pattern = RegExp('playlist_${playlistId}_\\d+\\.m3u');
      
      for (final file in files) {
        if (file is File && pattern.hasMatch(file.path)) {
          ServiceLocator.log.i(': ${file.path}', tag: 'PlaylistProvider');
          final content = await file.readAsString();
          
          // 
          try {
            await file.delete();
            ServiceLocator.log.d(': ${file.path}', tag: 'PlaylistProvider');
          } catch (e) {
            ServiceLocator.log.w(': $e', tag: 'PlaylistProvider');
          }
          
          return content;
        }
      }
      
      // 
      final appDir = await getApplicationDocumentsDirectory();
      final playlistDir = Directory('${appDir.path}/playlists');
      if (await playlistDir.exists()) {
        final playlistFiles = playlistDir.listSync();
        for (final file in playlistFiles) {
          if (file is File && pattern.hasMatch(file.path)) {
            ServiceLocator.log.i(': ${file.path}', tag: 'PlaylistProvider');
            return await file.readAsString();
          }
        }
      }
    } catch (e) {
      ServiceLocator.log.w(': $e', tag: 'PlaylistProvider');
    }
    
    return null;
  }
  
  /// 
  Future<void> _updateBackupFile(int playlistId, String content, String format) async {
    try {
      final backupPath = await _saveBackupFile(playlistId, content, format);
      
      // 
      await ServiceLocator.database.update(
        'playlists',
        {
          'backup_path': backupPath,
          'file_path': backupPath, // file_path
          'last_backup_time': DateTime.now().millisecondsSinceEpoch,
        },
        where: 'id = ?',
        whereArgs: [playlistId],
      );
      
      ServiceLocator.log.d(' $playlistId ', tag: 'PlaylistProvider');
    } catch (e) {
      ServiceLocator.log.w(': $e', tag: 'PlaylistProvider');
    }
  }
}

import 'dart:async';
import 'dart:io';

import 'package:flutter/material.dart';

import '../../../core/i18n/app_strings.dart';
import '../../../core/models/offline_recording.dart';
import '../../../core/navigation/app_router.dart';
import '../../../core/services/offline_download_service.dart';
import '../../../core/services/service_locator.dart';
import '../../../core/theme/app_theme.dart';

/// Screen that shows all offline recordings with download status and actions.
class OfflineScreen extends StatefulWidget {
  const OfflineScreen({super.key});

  @override
  State<OfflineScreen> createState() => _OfflineScreenState();
}

class _OfflineScreenState extends State<OfflineScreen> {
  final OfflineDownloadService _service = ServiceLocator.offlineDownloads;

  List<OfflineRecording> _recordings = [];
  bool _loading = true;
  StreamSubscription<Map<int, double>>? _progressSub;

  // Runtime progress map (recordingId → 0.0–1.0)
  Map<int, double> _progress = {};

  @override
  void initState() {
    super.initState();
    _load();
    _progressSub = _service.progressStream.listen((map) {
      if (mounted) {
        setState(() => _progress = map);
        // Refresh list periodically to pick up completed status changes
        _load(silent: true);
      }
    });
  }

  @override
  void dispose() {
    _progressSub?.cancel();
    super.dispose();
  }

  Future<void> _load({bool silent = false}) async {
    if (!silent) setState(() => _loading = true);
    final recs = await _service.allRecordings();
    if (mounted) {
      setState(() {
        _recordings = recs;
        _loading = false;
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    final strings = AppStrings.of(context);
    return Scaffold(
      backgroundColor: AppTheme.getBackgroundColor(context),
      appBar: AppBar(
        backgroundColor: AppTheme.getSurfaceColor(context),
        elevation: 0,
        title: Text(
          strings?.offlineDownloads ?? 'Offline Downloads',
          style: TextStyle(
            color: AppTheme.getTextPrimary(context),
            fontWeight: FontWeight.bold,
            fontSize: 18,
          ),
        ),
        leading: IconButton(
          icon: Icon(Icons.arrow_back_ios_rounded,
              color: AppTheme.getTextPrimary(context)),
          onPressed: () => Navigator.of(context).pop(),
        ),
        actions: [
          if (_recordings.any((r) =>
              r.status == DownloadStatus.completed ||
              r.status == DownloadStatus.failed ||
              r.status == DownloadStatus.cancelled))
            IconButton(
              icon: Icon(Icons.delete_sweep_rounded,
                  color: AppTheme.getTextSecondary(context)),
              tooltip: strings?.clearCompleted ?? 'Clear completed',
              onPressed: _clearCompleted,
            ),
        ],
      ),
      body: _loading
          ? const Center(
              child: CircularProgressIndicator(color: AppTheme.primaryColor))
          : _recordings.isEmpty
              ? _buildEmptyState(context, strings)
              : RefreshIndicator(
                  color: AppTheme.primaryColor,
                  onRefresh: _load,
                  child: ListView.separated(
                    padding: const EdgeInsets.all(16),
                    itemCount: _recordings.length,
                    separatorBuilder: (_, __) => const SizedBox(height: 10),
                    itemBuilder: (ctx, i) =>
                        _buildRecordingCard(ctx, _recordings[i]),
                  ),
                ),
    );
  }

  Widget _buildEmptyState(BuildContext context, AppStrings? strings) {
    return Center(
      child: Column(
        mainAxisSize: MainAxisSize.min,
        children: [
          Icon(Icons.download_for_offline_outlined,
              size: 64,
              color: AppTheme.getTextSecondary(context).withOpacity(0.4)),
          const SizedBox(height: 16),
          Text(
            strings?.noOfflineRecordings ?? 'No offline recordings yet',
            style: TextStyle(
              color: AppTheme.getTextSecondary(context),
              fontSize: 16,
            ),
          ),
          const SizedBox(height: 8),
          Text(
            strings?.offlineHint ??
                'Long-press any channel and tap "Download"',
            style: TextStyle(
              color: AppTheme.getTextSecondary(context).withOpacity(0.7),
              fontSize: 13,
            ),
            textAlign: TextAlign.center,
          ),
        ],
      ),
    );
  }

  Widget _buildRecordingCard(BuildContext context, OfflineRecording rec) {
    final isActive = rec.status == DownloadStatus.downloading;
    final progress = isActive
        ? (_progress[rec.id!] ?? rec.progress)
        : (rec.status == DownloadStatus.completed ? 1.0 : 0.0);

    final statusColor = _statusColor(rec.status);

    return Container(
      decoration: BoxDecoration(
        color: AppTheme.getCardColor(context),
        borderRadius: BorderRadius.circular(12),
        border: Border.all(
          color: isActive
              ? AppTheme.primaryColor.withOpacity(0.5)
              : AppTheme.getGlassBorderColor(context),
          width: isActive ? 1.5 : 1,
        ),
      ),
      child: Column(
        children: [
          ListTile(
            contentPadding:
                const EdgeInsets.symmetric(horizontal: 14, vertical: 4),
            leading: _buildStatusIcon(rec.status),
            title: Text(
              rec.channelName,
              style: TextStyle(
                color: AppTheme.getTextPrimary(context),
                fontWeight: FontWeight.w600,
                fontSize: 14,
              ),
              maxLines: 1,
              overflow: TextOverflow.ellipsis,
            ),
            subtitle: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const SizedBox(height: 2),
                Text(
                  _subtitleText(rec),
                  style: TextStyle(
                    color: statusColor,
                    fontSize: 12,
                  ),
                ),
              ],
            ),
            trailing: _buildTrailingActions(context, rec),
          ),
          if (isActive)
            Padding(
              padding:
                  const EdgeInsets.only(left: 14, right: 14, bottom: 10),
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  ClipRRect(
                    borderRadius: BorderRadius.circular(4),
                    child: LinearProgressIndicator(
                      value: progress > 0 ? progress : null, // null = indeterminate
                      backgroundColor: AppTheme.primaryColor.withOpacity(0.15),
                      valueColor: AlwaysStoppedAnimation<Color>(
                          AppTheme.primaryColor),
                      minHeight: 4,
                    ),
                  ),
                  if (progress > 0) ...[
                    const SizedBox(height: 4),
                    Text(
                      '${(progress * 100).toStringAsFixed(0)}%',
                      style: TextStyle(
                        color: AppTheme.getTextSecondary(context),
                        fontSize: 11,
                      ),
                    ),
                  ],
                ],
              ),
            ),
        ],
      ),
    );
  }

  Widget _buildStatusIcon(DownloadStatus status) {
    switch (status) {
      case DownloadStatus.downloading:
        return Container(
          width: 36,
          height: 36,
          padding: const EdgeInsets.all(6),
          decoration: BoxDecoration(
            color: AppTheme.primaryColor.withOpacity(0.15),
            shape: BoxShape.circle,
          ),
          child: const CircularProgressIndicator(
            strokeWidth: 2.5,
            valueColor:
                AlwaysStoppedAnimation<Color>(AppTheme.primaryColor),
          ),
        );
      case DownloadStatus.completed:
        return Container(
          width: 36,
          height: 36,
          decoration: BoxDecoration(
            color: AppTheme.successColor.withOpacity(0.15),
            shape: BoxShape.circle,
          ),
          child: const Icon(Icons.check_circle_rounded,
              color: AppTheme.successColor, size: 22),
        );
      case DownloadStatus.failed:
        return Container(
          width: 36,
          height: 36,
          decoration: BoxDecoration(
            color: AppTheme.errorColor.withOpacity(0.15),
            shape: BoxShape.circle,
          ),
          child: const Icon(Icons.error_rounded,
              color: AppTheme.errorColor, size: 22),
        );
      case DownloadStatus.cancelled:
        return Container(
          width: 36,
          height: 36,
          decoration: BoxDecoration(
            color: Colors.grey.withOpacity(0.15),
            shape: BoxShape.circle,
          ),
          child: const Icon(Icons.cancel_rounded,
              color: Colors.grey, size: 22),
        );
      case DownloadStatus.pending:
        return Container(
          width: 36,
          height: 36,
          decoration: BoxDecoration(
            color: Colors.orange.withOpacity(0.15),
            shape: BoxShape.circle,
          ),
          child: const Icon(Icons.schedule_rounded,
              color: Colors.orange, size: 22),
        );
    }
  }

  Widget _buildTrailingActions(
      BuildContext context, OfflineRecording rec) {
    final strings = AppStrings.of(context);
    if (rec.status == DownloadStatus.downloading) {
      return IconButton(
        icon: const Icon(Icons.stop_circle_rounded,
            color: AppTheme.errorColor),
        tooltip: strings?.cancel ?? 'Cancel',
        onPressed: () async {
          await _service.cancelDownload(rec.id!);
          _load();
        },
      );
    }

    return Row(
      mainAxisSize: MainAxisSize.min,
      children: [
        if (rec.status == DownloadStatus.completed)
          IconButton(
            icon: Icon(Icons.play_circle_fill_rounded,
                color: AppTheme.getPrimaryColor(context)),
            tooltip: 'Play',
            onPressed: () => _playOffline(rec),
          ),
        IconButton(
          icon: Icon(Icons.delete_outline_rounded,
              color: AppTheme.getTextSecondary(context)),
          tooltip: strings?.delete ?? 'Delete',
          onPressed: () => _confirmDelete(context, rec),
        ),
      ],
    );
  }

  String _subtitleText(OfflineRecording rec) {
    final strings = AppStrings.of(context);
    switch (rec.status) {
      case DownloadStatus.downloading:
        return strings?.downloading ?? 'Downloading...';
      case DownloadStatus.completed:
        final size = rec.sizeLabel;
        final date = _formatDate(rec.createdAt);
        return '$date${size.isNotEmpty ? ' · $size' : ''}';
      case DownloadStatus.failed:
        return rec.errorMessage ?? (strings?.downloadFailed ?? 'Failed');
      case DownloadStatus.cancelled:
        return 'Cancelled · ${rec.sizeLabel}';
      case DownloadStatus.pending:
        return 'Waiting...';
    }
  }

  Color _statusColor(DownloadStatus status) {
    switch (status) {
      case DownloadStatus.completed:
        return AppTheme.successColor;
      case DownloadStatus.failed:
        return AppTheme.errorColor;
      case DownloadStatus.downloading:
        return AppTheme.primaryColor;
      case DownloadStatus.cancelled:
        return Colors.grey;
      case DownloadStatus.pending:
        return Colors.orange;
    }
  }

  String _formatDate(DateTime dt) {
    final now = DateTime.now();
    if (now.difference(dt).inDays == 0) {
      return '${dt.hour.toString().padLeft(2, '0')}:'
          '${dt.minute.toString().padLeft(2, '0')}';
    }
    return '${dt.day}/${dt.month}/${dt.year}';
  }

  // ─────────────────────────────────────────────────────────────────────────

  void _playOffline(OfflineRecording rec) {
    Navigator.of(context).pushNamed(
      AppRouter.player,
      arguments: {
        'channelUrl': 'file://${rec.filePath}',
        'channelName': rec.channelName,
        'channelLogo': rec.channelLogo,
        'isMultiScreen': false,
      },
    );
  }

  Future<void> _confirmDelete(
      BuildContext context, OfflineRecording rec) async {
    final strings = AppStrings.of(context);
    final confirmed = await showDialog<bool>(
      context: context,
      builder: (ctx) => AlertDialog(
        backgroundColor: AppTheme.getSurfaceColor(ctx),
        shape:
            RoundedRectangleBorder(borderRadius: BorderRadius.circular(14)),
        title: Text(strings?.delete ?? 'Delete',
            style:
                TextStyle(color: AppTheme.getTextPrimary(ctx), fontSize: 16)),
        content: Text(
          '${strings?.deleteConfirmation ?? 'Delete'} "${rec.channelName}"?',
          style: TextStyle(
              color: AppTheme.getTextSecondary(ctx), fontSize: 14),
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(ctx, false),
            child: Text(strings?.cancel ?? 'Cancel'),
          ),
          TextButton(
            onPressed: () => Navigator.pop(ctx, true),
            child: Text(strings?.delete ?? 'Delete',
                style: const TextStyle(color: AppTheme.errorColor)),
          ),
        ],
      ),
    );

    if (confirmed == true) {
      await _service.deleteRecording(rec.id!);
      _load();
    }
  }

  Future<void> _clearCompleted() async {
    final completed = _recordings.where(
      (r) =>
          r.status == DownloadStatus.completed ||
          r.status == DownloadStatus.failed ||
          r.status == DownloadStatus.cancelled,
    );
    for (final r in completed) {
      await _service.deleteRecording(r.id!);
    }
    _load();
  }
}

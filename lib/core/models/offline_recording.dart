/// Status of an offline recording / download
enum DownloadStatus {
  pending,
  downloading,
  completed,
  failed,
  cancelled,
}

/// Represents a channel recording stored on device
class OfflineRecording {
  final int? id;
  final int channelId;
  final String channelName;
  final String channelUrl;
  final String? channelLogo; // nullable — logo URL for display
  final String filePath; // absolute path on device
  final int sizeBytes; // actual bytes written
  final DownloadStatus status;
  final DateTime createdAt;
  final String? errorMessage;

  // Runtime-only (not persisted)
  double progress; // 0.0 – 1.0 while downloading

  OfflineRecording({
    this.id,
    required this.channelId,
    required this.channelName,
    required this.channelUrl,
    this.channelLogo,
    required this.filePath,
    this.sizeBytes = 0,
    this.status = DownloadStatus.pending,
    DateTime? createdAt,
    this.errorMessage,
    this.progress = 0.0,
  }) : createdAt = createdAt ?? DateTime.now();

  String get statusLabel {
    switch (status) {
      case DownloadStatus.pending:
        return 'Pending';
      case DownloadStatus.downloading:
        return 'Downloading';
      case DownloadStatus.completed:
        return 'Ready';
      case DownloadStatus.failed:
        return 'Failed';
      case DownloadStatus.cancelled:
        return 'Cancelled';
    }
  }

  /// Human-readable file size
  String get sizeLabel {
    if (sizeBytes <= 0) return '';
    if (sizeBytes < 1024 * 1024) {
      return '${(sizeBytes / 1024).toStringAsFixed(1)} KB';
    } else if (sizeBytes < 1024 * 1024 * 1024) {
      return '${(sizeBytes / (1024 * 1024)).toStringAsFixed(1)} MB';
    } else {
      return '${(sizeBytes / (1024 * 1024 * 1024)).toStringAsFixed(2)} GB';
    }
  }

  OfflineRecording copyWith({
    int? id,
    int? sizeBytes,
    DownloadStatus? status,
    String? errorMessage,
    double? progress,
  }) {
    return OfflineRecording(
      id: id ?? this.id,
      channelId: channelId,
      channelName: channelName,
      channelUrl: channelUrl,
      channelLogo: channelLogo,
      filePath: filePath,
      sizeBytes: sizeBytes ?? this.sizeBytes,
      status: status ?? this.status,
      createdAt: createdAt,
      errorMessage: errorMessage ?? this.errorMessage,
      progress: progress ?? this.progress,
    );
  }

  Map<String, dynamic> toMap() {
    return {
      if (id != null) 'id': id,
      'channel_id': channelId,
      'channel_name': channelName,
      'channel_url': channelUrl,
      'channel_logo': channelLogo,
      'file_path': filePath,
      'size_bytes': sizeBytes,
      'status': status.name,
      'created_at': createdAt.millisecondsSinceEpoch,
      'error_message': errorMessage,
    };
  }

  factory OfflineRecording.fromMap(Map<String, dynamic> map) {
    return OfflineRecording(
      id: map['id'] as int?,
      channelId: map['channel_id'] as int,
      channelName: map['channel_name'] as String,
      channelUrl: map['channel_url'] as String,
      channelLogo: map['channel_logo'] as String?,
      filePath: map['file_path'] as String,
      sizeBytes: map['size_bytes'] as int? ?? 0,
      status: DownloadStatus.values.firstWhere(
        (e) => e.name == (map['status'] as String? ?? 'pending'),
        orElse: () => DownloadStatus.failed,
      ),
      createdAt: DateTime.fromMillisecondsSinceEpoch(
        map['created_at'] as int,
      ),
      errorMessage: map['error_message'] as String?,
    );
  }
}

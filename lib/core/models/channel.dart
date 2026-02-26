/// Channel type enum
enum ChannelType {
  live,      // 
  vod,       // 
  replay,    // 
  unknown,   // 
}

/// Represents an IPTV channel with multiple sources
class Channel {
  final int? id;
  final int playlistId;
  final String name;
  final String url; // Primary URL (first source)
  final List<String> sources; // All source URLs
  final String? logoUrl;
  final String? groupName;
  final String? epgId;
  final bool isActive;
  final DateTime createdAt;
  /// Stored channel type: 'live' | 'vod' | 'series'
  final String channelType;

  // Runtime properties (not stored in database)
  bool isFavorite;
  bool isCurrentlyPlaying;
  int currentSourceIndex; // Current playing source index

  String? fallbackLogoUrl;
  /// Resume position for VOD content (seconds). Runtime only, not persisted in DB directly.
  int resumePositionSeconds;

  Channel({
    this.id,
    required this.playlistId,
    required this.name,
    required this.url,
    List<String>? sources,
    this.logoUrl,
    this.groupName,
    this.epgId,
    this.isActive = true,
    DateTime? createdAt,
    this.isFavorite = false,
    this.isCurrentlyPlaying = false,
    this.currentSourceIndex = 0,
    this.fallbackLogoUrl,
    this.channelType = 'live',
    this.resumePositionSeconds = 0,
  }) : sources = sources ?? [url],
       createdAt = createdAt ?? DateTime.now();

  /// Get current source URL
  String get currentUrl => sources.isNotEmpty 
      ? sources[currentSourceIndex.clamp(0, sources.length - 1)] 
      : url;

  /// Check if channel has multiple sources
  bool get hasMultipleSources => sources.length > 1;

  /// Get source count
  int get sourceCount => sources.length;

  /// Determine channel type based on stored channelType, group name and URL.
  /// The stored [channelType] (set at import time) takes priority over
  /// heuristic detection from group names / URL patterns.
  ChannelType get type {
    // ── Trust stored channelType for VOD/Series (only Xtream sets these) ──
    if (channelType == 'vod') return ChannelType.vod;
    if (channelType == 'series') return ChannelType.vod; // seekable like VOD

    // ── URL-based live detection FIRST ────────────────────────────────────
    // Xtream live URLs always contain /live/ — this is more reliable than
    // group name keywords which can be misleading ("Movie Channels", etc.)
    final urlLower = currentUrl.toLowerCase();
    if (urlLower.contains('/live/')) {
      return ChannelType.live;
    }

    // ── Fallback heuristic for M3U or ambiguous URLs ─────────────────────
    final group = groupName?.toLowerCase() ?? '';
    
    //  .mp4 
    if (group.contains('') || group.contains('replay') ||
        group.contains('') || group.contains('catchup') ||
        group.contains('')) {
      return ChannelType.replay;
    }
    
    // 
    if (group.contains('') || group.contains('movie') ||
        group.contains('') || group.contains('series') || group.contains('') ||
        group.contains('') || group.contains('music') || group.contains('mv') ||
        group.contains('') || group.contains('dance') ||
        group.contains('') || group.contains('vod') ||
        group.contains('') || group.contains('variety') ||
        group.contains('') || group.contains('anime') ||
        group.contains('') || group.contains('documentary')) {
      return ChannelType.vod;
    }
    
    // URL 
    if (urlLower.endsWith('.mp4') || urlLower.endsWith('.mkv') ||
        urlLower.endsWith('.avi') || urlLower.endsWith('.mov') ||
        urlLower.endsWith('.flv') || urlLower.endsWith('.wmv') ||
        urlLower.endsWith('.m4v') || urlLower.endsWith('.3gp')) {
      return ChannelType.vod;
    }
    
    // 
    if (group.contains('') || group.contains('live') ||
        group.contains('') || group.contains('cctv') ||
        group.contains('') || group.contains('') || 
        group.contains('channel') || group.contains('tv')) {
      return ChannelType.live;
    }
    
    // URL 
    if (urlLower.contains('live.') ||
        urlLower.endsWith('.m3u8') || urlLower.contains('.m3u8?')) {
      return ChannelType.live;
    }
    
    return ChannelType.unknown;
  }
  
  /// Check if channel is seekable (can use progress bar)
  bool get isSeekable => type == ChannelType.vod || type == ChannelType.replay;
  
  /// Check if channel is live stream
  bool get isLive => type == ChannelType.live;

  factory Channel.fromMap(Map<String, dynamic> map) {
    final logoUrl = map['logo_url'] as String?;
    final fallbackLogoUrl = map['fallback_logo_url'] as String?;
    final url = map['url'] as String;
    
    // Parse sources from JSON string or use single URL
    List<String> sources = [url];
    if (map['sources'] != null) {
      try {
        final sourcesStr = map['sources'] as String;
        if (sourcesStr.isNotEmpty) {
          sources = sourcesStr.split('|||');
        }
      } catch (e) {
        // Fallback to single URL
      }
    }

    return Channel(
      id: map['id'] as int?,
      playlistId: map['playlist_id'] as int,
      name: map['name'] as String,
      url: url,
      sources: sources,
      logoUrl: logoUrl,
      fallbackLogoUrl: fallbackLogoUrl,
      groupName: map['group_name'] as String?,
      epgId: map['epg_id'] as String?,
      isActive: (map['is_active'] as int?) == 1,
      createdAt: map['created_at'] != null ? DateTime.fromMillisecondsSinceEpoch(map['created_at'] as int) : DateTime.now(),
      channelType: (map['channel_type'] as String?) ?? 'live',
    );
  }

  Map<String, dynamic> toMap() {
    return {
      if (id != null) 'id': id,
      'playlist_id': playlistId,
      'name': name,
      'url': url,
      'sources': sources.join('|||'), // Store as delimiter-separated string
      'logo_url': logoUrl,
      'fallback_logo_url': fallbackLogoUrl,
      'group_name': groupName,
      'epg_id': epgId,
      'is_active': isActive ? 1 : 0,
      'created_at': createdAt.millisecondsSinceEpoch,
      'channel_type': channelType,
    };
  }

  Channel copyWith({
    int? id,
    int? playlistId,
    String? name,
    String? url,
    List<String>? sources,
    String? logoUrl,
    String? groupName,
    String? epgId,
    bool? isActive,
    DateTime? createdAt,
    bool? isFavorite,
    bool? isCurrentlyPlaying,
    int? currentSourceIndex,
    String? fallbackLogoUrl,
    String? channelType,
  }) {
    return Channel(
      id: id ?? this.id,
      playlistId: playlistId ?? this.playlistId,
      name: name ?? this.name,
      url: url ?? this.url,
      sources: sources ?? List.from(this.sources),
      logoUrl: logoUrl ?? this.logoUrl,
      groupName: groupName ?? this.groupName,
      epgId: epgId ?? this.epgId,
      isActive: isActive ?? this.isActive,
      createdAt: createdAt ?? this.createdAt,
      isFavorite: isFavorite ?? this.isFavorite,
      isCurrentlyPlaying: isCurrentlyPlaying ?? this.isCurrentlyPlaying,
      currentSourceIndex: currentSourceIndex ?? this.currentSourceIndex,
      fallbackLogoUrl: fallbackLogoUrl ?? this.fallbackLogoUrl,
      channelType: channelType ?? this.channelType,
    );
  }

  /// Add a source URL to this channel
  Channel addSource(String sourceUrl) {
    if (!sources.contains(sourceUrl)) {
      return copyWith(sources: [...sources, sourceUrl]);
    }
    return this;
  }

  @override
  bool operator ==(Object other) {
    if (identical(this, other)) return true;
    return other is Channel && other.id == id && other.url == url;
  }

  @override
  int get hashCode => id.hashCode ^ url.hashCode;

  @override
  String toString() => 'Channel(id: $id, name: $name, group: $groupName)';
}

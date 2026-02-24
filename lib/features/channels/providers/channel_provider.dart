import 'dart:async';
import 'package:flutter/foundation.dart';
import '../../../core/models/channel.dart';
import '../../../core/models/channel_group.dart';
import '../../../core/services/service_locator.dart';

class ChannelProvider extends ChangeNotifier {
  // ✅ 
  List<Channel> _allChannels = [];      // live + unknown
  List<ChannelGroup> _allGroups = [];
  List<Channel> _vodChannels = [];      // VOD / movies
  List<ChannelGroup> _vodGroups = [];
  List<Channel> _seriesChannels = [];   // Series
  List<ChannelGroup> _seriesGroups = [];
  
  // ✅ UI
  List<Channel> _displayedChannels = []; // UI
  static const int _displayPageSize = 50; // 50
  int _displayedCount = 0; // 
  
  // 
  String? _selectedGroup;
  bool _isLoading = false;
  String? _error;

  // ✅ UI
  bool _hasMoreToDisplay = true;
  bool _isLoadingMore = false;
  int? _currentPlaylistId;

  // ✅ 
  bool _isLogoLoadingPaused = false;
  int _loadingGeneration = 0;

  // ✅  notifyListeners() 
  Timer? _notifyTimer;
  bool _hasPendingNotify = false;
  static const _notifyThrottleDuration = Duration(milliseconds: 100); // 100ms

  // Getters
  List<Channel> get allChannels => _allChannels; // 
  List<Channel> get channels => _displayedChannels; // UI
  List<ChannelGroup> get groups => _allGroups;
  List<Channel> get vodChannels => _vodChannels;     // /
  List<ChannelGroup> get vodGroups => _vodGroups;
  List<Channel> get seriesChannels => _seriesChannels; // 
  List<ChannelGroup> get seriesGroups => _seriesGroups;
  String? get selectedGroup => _selectedGroup;
  bool get isLoading => _isLoading;
  bool get isLoadingMore => _isLoadingMore;
  bool get hasMore => _hasMoreToDisplay;
  String? get error => _error;
  int get totalChannelCount => _allChannels.length;
  int get totalContentChannelCount =>
      _allChannels.length + _vodChannels.length + _seriesChannels.length;
  int get loadedChannelCount => _displayedChannels.length;
  int get vodChannelCount => _vodChannels.length;
  int get seriesChannelCount => _seriesChannels.length;

  // ✅  notifyListeners()
  void _throttledNotify() {
    _hasPendingNotify = true;
    
    // 
    if (_notifyTimer?.isActive ?? false) {
      return;
    }

    // 
    _notifyTimer = Timer(_notifyThrottleDuration, () {
      if (_hasPendingNotify) {
        _hasPendingNotify = false;
        notifyListeners();
      }
    });
  }

  // ✅ 
  void _immediateNotify() {
    _notifyTimer?.cancel();
    _hasPendingNotify = false;
    notifyListeners();
  }

  @override
  void dispose() {
    _notifyTimer?.cancel();
    super.dispose();
  }
  List<Channel> get filteredChannels {
    if (_selectedGroup == null) return _allChannels;
    if (_selectedGroup == unavailableGroupName) {
      return _allChannels.where((c) => isUnavailableChannel(c.groupName)).toList();
    }
    return _allChannels.where((c) => c.groupName == _selectedGroup).toList();
  }

  // ✅ UI
  List<Channel> get displayedFilteredChannels {
    if (_selectedGroup == null) return _displayedChannels;
    if (_selectedGroup == unavailableGroupName) {
      return _displayedChannels.where((c) => isUnavailableChannel(c.groupName)).toList();
    }
    return _displayedChannels.where((c) => c.groupName == _selectedGroup).toList();
  }

  // ✅ 
  List<ChannelGroup> getHomeGroups({int maxGroups = 8}) {
    return _allGroups.take(maxGroups).toList();
  }

  // ✅ 
  Map<String, List<Channel>> getHomeChannelsByGroup({int maxGroups = 8, int channelsPerGroup = 12}) {
    final result = <String, List<Channel>>{};
    final groups = _allGroups.take(maxGroups);
    
    ServiceLocator.log.d(
        'getHomeChannelsByGroup: _allGroups.length=${_allGroups.length}, _allChannels.length=${_allChannels.length}',
        tag: 'ChannelProvider');
    
    for (final group in groups) {
      final channels = _allChannels
          .where((c) => c.groupName == group.name)
          .take(channelsPerGroup)
          .toList();
      
      // ServiceLocator.log.d(
      //     'getHomeChannelsByGroup: group=${group.name}, channels.length=${channels.length}',
      //     tag: 'ChannelProvider');
      
      // ✅ 
      result[group.name] = channels;
    }
    
    // ServiceLocator.log.d(
    //     'getHomeChannelsByGroup: result.length=${result.length}',
    //     tag: 'ChannelProvider');
    
    return result;
  }

  // ✅ UI
  void _resetDisplay() {
    _displayedChannels.clear();
    _displayedCount = 0;
    _hasMoreToDisplay = true;
  }

  // ✅ // playlist 
  void clearCache() {
    // 1. 
    _notifyTimer?.cancel();
    _hasPendingNotify = false;
    
    // 2.  generation ID
    _loadingGeneration++;
    
    // 3. 
    _allChannels.clear();
    _allGroups.clear();
    _vodChannels.clear();
    _vodGroups.clear();
    _seriesChannels.clear();
    _seriesGroups.clear();
    _displayedChannels.clear();
    _displayedCount = 0;
    _hasMoreToDisplay = true;
    _currentPlaylistId = null;
    
    ServiceLocator.log.i(' (generation: $_loadingGeneration)', tag: 'ChannelProvider');
  }

  // ✅ UI
  Future<void> loadAllChannelsToCache(int playlistId, {bool loadMore = false}) async {
    if (loadMore) {
      // UI
      return _loadMoreToDisplay();
    }

    // 
    ServiceLocator.log.i(': $playlistId', tag: 'ChannelProvider');
    clearCache();
    _currentPlaylistId = playlistId;
    _isLoading = true;
    _error = null;
    _immediateNotify(); // 

    final startTime = DateTime.now();

    try {
      // ✅ 
      final results = await ServiceLocator.database.query(
        'channels',
        where: 'playlist_id = ? AND is_active = 1',
        whereArgs: [playlistId],
        orderBy: 'id ASC',
      );

      final allLoaded = results.map((r) => Channel.fromMap(r)).toList();
      _allChannels = allLoaded.where((c) => c.channelType != 'vod' && c.channelType != 'series').toList();
      _vodChannels = allLoaded.where((c) => c.channelType == 'vod').toList();
      _seriesChannels = allLoaded.where((c) => c.channelType == 'series').toList();
      
      ServiceLocator.log.i(
          ': ${_allChannels.length}  / ${_vodChannels.length}  / ${_seriesChannels.length} ',
          tag: 'ChannelProvider');

      // ✅ 
      _onCacheLoadComplete();

      // ✅ 
      _loadMoreToDisplay(isInitial: true);

      // ✅ 

      final loadTime = DateTime.now().difference(startTime).inMilliseconds;
      ServiceLocator.log.i(
          ': ${loadTime}ms: ${_displayedChannels.length}/${_allChannels.length}',
          tag: 'ChannelProvider');
      _error = null;
    } catch (e) {
      ServiceLocator.log.e('', tag: 'ChannelProvider', error: e);
      _error = 'Failed to load channels: $e';
      _allChannels = []; _allGroups = [];
      _vodChannels = []; _vodGroups = [];
      _seriesChannels = []; _seriesGroups = [];
    }

    _isLoading = false;
    _immediateNotify(); // ✅ 
  }

  // ✅ UI
  Future<void> _loadMoreToDisplay({bool isInitial = false}) async {
    if (!isInitial) {
      if (_isLoadingMore || !_hasMoreToDisplay) return;
      _isLoadingMore = true;
      _immediateNotify(); // 
    }

    // 
    final startIndex = _displayedCount;
    final endIndex = (_displayedCount + _displayPageSize).clamp(0, _allChannels.length);
    
    if (startIndex >= _allChannels.length) {
      _hasMoreToDisplay = false;
      if (!isInitial) {
        _isLoadingMore = false;
        _immediateNotify();
      }
      return;
    }

    final nextBatch = _allChannels.sublist(startIndex, endIndex);
    _displayedChannels.addAll(nextBatch);
    _displayedCount = endIndex;
    _hasMoreToDisplay = _displayedCount < _allChannels.length;

    ServiceLocator.log.d(
        'UI: ${_displayedChannels.length}/${_allChannels.length}',
        tag: 'ChannelProvider');

    if (!isInitial) {
      _isLoadingMore = false;
      _immediateNotify(); // 
    }
  }

  // Load channels for a specific playlist ()
  Future<void> loadChannels(int playlistId, {bool loadMore = false}) async {
    return loadAllChannelsToCache(playlistId, loadMore: loadMore);
  }

  // Load all channels from all active playlists (UI)
  Future<void> loadAllChannels({bool loadMore = false}) async {
    if (loadMore) {
      // UI
      return _loadMoreToDisplay();
    }

    clearCache();
    _isLoading = true;
    _error = null;
    _immediateNotify(); // 

    final startTime = DateTime.now();

    try {
      // ✅ 
      final results = await ServiceLocator.database.rawQuery('''
        SELECT c.* FROM channels c
        INNER JOIN playlists p ON c.playlist_id = p.id
        WHERE c.is_active = 1 AND p.is_active = 1
        ORDER BY c.id ASC
      ''');

      final allLoaded = results.map((r) => Channel.fromMap(r)).toList();
      _allChannels = allLoaded.where((c) => c.channelType != 'vod' && c.channelType != 'series').toList();
      _vodChannels = allLoaded.where((c) => c.channelType == 'vod').toList();
      _seriesChannels = allLoaded.where((c) => c.channelType == 'series').toList();
      
      ServiceLocator.log.i(
          ': ${_allChannels.length}  / ${_vodChannels.length}  / ${_seriesChannels.length} ',
          tag: 'ChannelProvider');

      // ✅ 
      _onCacheLoadComplete();

      // ✅ 
      _loadMoreToDisplay(isInitial: true);

      // ✅ 

      final loadTime = DateTime.now().difference(startTime).inMilliseconds;
      ServiceLocator.log.i(
          ': ${loadTime}ms: ${_displayedChannels.length}/${_allChannels.length}',
          tag: 'ChannelProvider');
      _error = null;
    } catch (e) {
      _error = 'Failed to load channels: $e';
      _allChannels = []; _allGroups = [];
      _vodChannels = []; _vodGroups = [];
      _seriesChannels = []; _seriesGroups = [];
    }

    _isLoading = false;
    _immediateNotify(); // ✅ 
  }

  void _updateGroups() {
    final Map<String, int> groupCounts = {};
    final List<String> groupOrder = []; // 
    int unavailableCount = 0;

    for (final channel in _allChannels) {
      final group = channel.groupName ?? 'Uncategorized';
      // 
      if (isUnavailableChannel(group)) {
        unavailableCount++;
      } else {
        if (!groupCounts.containsKey(group)) {
          groupOrder.add(group); // 
        }
        groupCounts[group] = (groupCounts[group] ?? 0) + 1;
      }
    }

    // 
    _allGroups = groupOrder
        .map((name) =>
            ChannelGroup(name: name, channelCount: groupCounts[name] ?? 0))
        .toList();

    // 
    if (unavailableCount > 0) {
      _allGroups.add(ChannelGroup(
          name: unavailableGroupName, channelCount: unavailableCount));
    }
    
    ServiceLocator.log.d(': ${_allGroups.length} ', tag: 'ChannelProvider');
  }

  // ✅ 
  void _onCacheLoadComplete() {
    ServiceLocator.log.d(
        '_onCacheLoadComplete: _allChannels.length=${_allChannels.length}',
        tag: 'ChannelProvider');
    
    // 1. 
    _updateGroups();
    
    ServiceLocator.log.d(
        '_onCacheLoadComplete: _updateGroups_allGroups.length=${_allGroups.length}',
        tag: 'ChannelProvider');
    
    // 2. 
    if (_allGroups.isEmpty && _allChannels.isNotEmpty) {
      ServiceLocator.log.w('', tag: 'ChannelProvider');
      _updateGroups();
      ServiceLocator.log.d(
          '_onCacheLoadComplete: _allGroups.length=${_allGroups.length}',
          tag: 'ChannelProvider');
    }
    
    // 3. 
    if (_allGroups.isNotEmpty) {
      final groupNames = _allGroups.take(5).map((g) => '${g.name}(${g.channelCount})').join(', ');
      ServiceLocator.log.d(
          '_onCacheLoadComplete: 5: $groupNames',
          tag: 'ChannelProvider');
    }
    
    ServiceLocator.log.i(
        ': ${_allChannels.length}  / ${_vodChannels.length}  / ${_seriesChannels.length} , ${_allGroups.length} ',
        tag: 'ChannelProvider');
    //  VOD  Series 
    _updateVodGroups();
    _updateSeriesGroups();
  }

  void _updateVodGroups() {
    final Map<String, int> counts = {};
    final List<String> order = [];
    for (final ch in _vodChannels) {
      final g = ch.groupName ?? 'Movies';
      if (!counts.containsKey(g)) order.add(g);
      counts[g] = (counts[g] ?? 0) + 1;
    }
    _vodGroups = order.map((n) => ChannelGroup(name: n, channelCount: counts[n]!)).toList();
    ServiceLocator.log.d('VOD: ${_vodGroups.length} ', tag: 'ChannelProvider');
  }

  void _updateSeriesGroups() {
    final Map<String, int> counts = {};
    final List<String> order = [];
    for (final ch in _seriesChannels) {
      final g = ch.groupName ?? 'Series';
      if (!counts.containsKey(g)) order.add(g);
      counts[g] = (counts[g] ?? 0) + 1;
    }
    _seriesGroups = order.map((n) => ChannelGroup(name: n, channelCount: counts[n]!)).toList();
    ServiceLocator.log.d('Series: ${_seriesGroups.length} ', tag: 'ChannelProvider');
  }

  // Select a group filter
  void selectGroup(String? groupName) {
    _selectedGroup = groupName;

    // 
    try {
      clearLogoLoadingQueue();
      ServiceLocator.log.d(': $groupName');
    } catch (e) {
      ServiceLocator.log.w(': $e');
    }

    _immediateNotify(); // 
  }

  // Clear group filter
  void clearGroupFilter() {
    _selectedGroup = null;
    _immediateNotify(); // 
  }

  // Search channels by name
  List<Channel> searchChannels(String query) {
    if (query.isEmpty) return filteredChannels;

    final lowerQuery = query.toLowerCase();
    return _allChannels.where((c) {
      return c.name.toLowerCase().contains(lowerQuery) ||
          (c.groupName?.toLowerCase().contains(lowerQuery) ?? false);
    }).toList();
  }

  // Get channels by group
  List<Channel> getChannelsByGroup(String groupName) {
    return _allChannels.where((c) => c.groupName == groupName).toList();
  }

  // Get a channel by ID
  Channel? getChannelById(int id) {
    try {
      return _allChannels.firstWhere((c) => c.id == id);
    } catch (_) {
      return null;
    }
  }

  // Update favorite status for a channel
  void updateFavoriteStatus(int channelId, bool isFavorite) {
    final index = _allChannels.indexWhere((c) => c.id == channelId);
    if (index != -1) {
      _allChannels[index] = _allChannels[index].copyWith(isFavorite: isFavorite);
      _throttledNotify(); // 
    }
  }

  // Set currently playing channel
  void setCurrentlyPlaying(int? channelId) {
    for (int i = 0; i < _allChannels.length; i++) {
      final isPlaying = _allChannels[i].id == channelId;
      if (_allChannels[i].isCurrentlyPlaying != isPlaying) {
        _allChannels[i] = _allChannels[i].copyWith(isCurrentlyPlaying: isPlaying);
      }
    }
    _throttledNotify(); // 
  }

  // Add channels from parsing
  Future<void> addChannels(List<Channel> channels) async {
    try {
      for (final channel in channels) {
        await ServiceLocator.database.insert('channels', channel.toMap());
      }

      // Reload channels
      if (channels.isNotEmpty) {
        await loadChannels(channels.first.playlistId);
      }
    } catch (e) {
      _error = 'Failed to add channels: $e';
      _immediateNotify(); // 
    }
  }

  // Delete channels for a playlist
  Future<void> deleteChannelsForPlaylist(int playlistId) async {
    try {
      await ServiceLocator.database.delete(
        'channels',
        where: 'playlist_id = ?',
        whereArgs: [playlistId],
      );

      _allChannels.removeWhere((c) => c.playlistId == playlistId);
      _updateGroups();
      _immediateNotify(); // 
    } catch (e) {
      _error = 'Failed to delete channels: $e';
      _immediateNotify(); // 
    }
  }

  // 
  static const String unavailableGroupPrefix = '⚠️ Unavailable';
  static const String unavailableGroupName = '⚠️ Unavailable';
  static const String legacyUnavailableGroupPrefix = '⚠️ ';

  // 
  static String? extractOriginalGroup(String? groupName) {
    if (groupName == null ||
        (!groupName.startsWith(unavailableGroupPrefix) &&
            !groupName.startsWith(legacyUnavailableGroupPrefix))) {
      return null;
    }
    // : "⚠️ |"
    final parts = groupName.split('|');
    if (parts.length > 1) {
      return parts[1];
    }
    return 'Uncategorized';
  }

  // 
  static bool isUnavailableChannel(String? groupName) {
    return groupName != null &&
        (groupName.startsWith(unavailableGroupPrefix) ||
            groupName.startsWith(legacyUnavailableGroupPrefix));
  }

  // 
  Future<void> markChannelsAsUnavailable(List<int> channelIds) async {
    if (channelIds.isEmpty) return;

    try {
      // 
      for (final id in channelIds) {
        final channel = _allChannels.firstWhere((c) => c.id == id,
            orElse: () => _allChannels.first);
        final originalGroup = channel.groupName ?? 'Uncategorized';
        // 
        if (isUnavailableChannel(originalGroup)) continue;

        final newGroupName = '$unavailableGroupPrefix|$originalGroup';

        await ServiceLocator.database.update(
          'channels',
          {'group_name': newGroupName},
          where: 'id = ?',
          whereArgs: [id],
        );
      }

      // 
      for (int i = 0; i < _allChannels.length; i++) {
        if (channelIds.contains(_allChannels[i].id)) {
          final originalGroup = _allChannels[i].groupName ?? 'Uncategorized';
          if (!isUnavailableChannel(originalGroup)) {
            _allChannels[i] = _allChannels[i].copyWith(
              groupName: '$unavailableGroupPrefix|$originalGroup',
            );
          }
        }
      }

      _updateGroups();
      _immediateNotify(); // 

      ServiceLocator.log.d('DEBUG:  ${channelIds.length} ');
    } catch (e) {
      ServiceLocator.log.d('DEBUG: : $e');
      _error = 'Failed to mark channels as unavailable: $e';
      _immediateNotify(); // 
    }
  }

  // 
  Future<bool> restoreChannel(int channelId) async {
    try {
      final channel = _allChannels.firstWhere((c) => c.id == channelId);
      final originalGroup = extractOriginalGroup(channel.groupName);

      if (originalGroup == null) {
        ServiceLocator.log.d('DEBUG: ');
        return false;
      }

      await ServiceLocator.database.update(
        'channels',
        {'group_name': originalGroup},
        where: 'id = ?',
        whereArgs: [channelId],
      );

      final index = _allChannels.indexWhere((c) => c.id == channelId);
      if (index != -1) {
        _allChannels[index] = _allChannels[index].copyWith(groupName: originalGroup);
      }

      _updateGroups();
      _immediateNotify(); // 

      ServiceLocator.log.d('DEBUG: : $originalGroup');
      return true;
    } catch (e) {
      _error = 'Failed to restore channel: $e';
      _immediateNotify(); // 
      return false;
    }
  }

  // 
  Future<int> deleteAllUnavailableChannels() async {
    try {
      final count = await ServiceLocator.database.delete(
        'channels',
        where: 'group_name LIKE ?',
        whereArgs: ['$unavailableGroupPrefix%'],
      );

      _allChannels.removeWhere((c) => isUnavailableChannel(c.groupName));
      _updateGroups();
      _immediateNotify(); // 

      ServiceLocator.log.d('DEBUG:  $count ');
      return count;
    } catch (e) {
      _error = 'Failed to delete unavailable channels: $e';
      _immediateNotify(); // 
      return 0;
    }
  }

  // 
  int get unavailableChannelCount {
    return _allChannels.where((c) => isUnavailableChannel(c.groupName)).length;
  }

  // ✅ 
  void pauseLogoLoading() {
    _isLogoLoadingPaused = true;
  }

  // ✅ 
  void resumeLogoLoading() {
    _isLogoLoadingPaused = false;
  }

  // ✅ 
  void clearLogoLoadingQueue() {
    // 1. 
    _notifyTimer?.cancel();
    _hasPendingNotify = false;
    
    // 2.  generation ID
    _loadingGeneration++;
    
    ServiceLocator.log.d(' (generation: $_loadingGeneration)', tag: 'ChannelProvider');
  }

  // Clear all data
  void clear() {
    _allChannels = [];
    _allGroups = [];
    _selectedGroup = null;
    _error = null;
    _immediateNotify(); // 
  }
}

import '../database/database_helper.dart';
import '../models/channel.dart';
import '../services/service_locator.dart';

class WatchHistoryService {
  final DatabaseHelper _db = ServiceLocator.database;

  /// Save VOD playback position so the user can resume later
  Future<void> updatePlaybackPosition(int channelId, int playlistId, int positionSeconds) async {
    try {
      if (positionSeconds < 5) return; // ignore trivial positions
      await _db.update(
        'watch_history',
        {'position_seconds': positionSeconds},
        where: 'channel_id = ? AND playlist_id = ?',
        whereArgs: [channelId, playlistId],
      );
    } catch (e) {
      ServiceLocator.log.e('updatePlaybackPosition failed: $e', tag: 'WatchHistoryService');
    }
  }

  /// Get saved VOD position (0 if none)
  Future<int> getPlaybackPosition(int channelId, int playlistId) async {
    try {
      final result = await _db.rawQuery('''
        SELECT position_seconds FROM watch_history
        WHERE channel_id = ? AND playlist_id = ?
        LIMIT 1
      ''', [channelId, playlistId]);
      if (result.isEmpty) return 0;
      return (result.first['position_seconds'] as int?) ?? 0;
    } catch (e) {
      return 0;
    }
  }

  /// 
  Future<void> addWatchHistory(int channelId, int playlistId) async {
    try {
      final now = DateTime.now().millisecondsSinceEpoch;
      
      // 
      final existing = await _db.rawQuery('''
        SELECT id FROM watch_history 
        WHERE channel_id = ? AND playlist_id = ?
      ''', [channelId, playlistId]);
      
      if (existing.isNotEmpty) {
        // 
        await _db.update(
          'watch_history',
          {'watched_at': now},
          where: 'channel_id = ? AND playlist_id = ?',
          whereArgs: [channelId, playlistId],
        );
      } else {
        // 
        await _db.insert('watch_history', {
          'channel_id': channelId,
          'playlist_id': playlistId,
          'watched_at': now,
          'duration_seconds': 0,
        });
      }
    } catch (e) {
      ServiceLocator.log.e(': $e', tag: 'WatchHistoryService');
    }
  }

  /// 
  /// limit 20
  Future<List<Channel>> getWatchHistory(int playlistId, {int limit = 20}) async {
    try {
      //  INNER JOIN 
      // 
      final result = await _db.rawQuery('''
        SELECT c.*, wh.watched_at, wh.position_seconds
        FROM watch_history wh
        INNER JOIN channels c ON wh.channel_id = c.id
        WHERE wh.playlist_id = ? AND c.is_active = 1 AND c.playlist_id = ?
        ORDER BY wh.watched_at DESC
        LIMIT ?
      ''', [playlistId, playlistId, limit]);

      return result.map((row) {
        return Channel(
          id: row['id'] as int,
          name: row['name'] as String,
          url: row['url'] as String,
          logoUrl: row['logo_url'] as String?,
          groupName: row['group_name'] as String?,
          epgId: row['epg_id'] as String?,
          sources: _parseSources(row['sources'] as String?),
          playlistId: row['playlist_id'] as int,
          isActive: (row['is_active'] as int) == 1,
          createdAt: DateTime.fromMillisecondsSinceEpoch(row['created_at'] as int),
          resumePositionSeconds: (row['position_seconds'] as int?) ?? 0,
        );
      }).toList();
    } catch (e, stackTrace) {
      ServiceLocator.log.e(': $e\n$stackTrace', tag: 'WatchHistoryService');
      return [];
    }
  }

  /// 
  Future<List<Channel>> getAllWatchHistory({int limit = 20}) async {
    try {
      final result = await _db.rawQuery('''
        SELECT c.*, wh.watched_at, wh.position_seconds, p.name as playlist_name
        FROM watch_history wh
        INNER JOIN channels c ON wh.channel_id = c.id
        INNER JOIN playlists p ON wh.playlist_id = p.id
        WHERE c.is_active = 1 AND p.is_active = 1
        ORDER BY wh.watched_at DESC
        LIMIT ?
      ''', [limit]);

      return result.map((row) {
        return Channel(
          id: row['id'] as int,
          name: row['name'] as String,
          url: row['url'] as String,
          logoUrl: row['logo_url'] as String?,
          groupName: row['group_name'] as String?,
          epgId: row['epg_id'] as String?,
          sources: _parseSources(row['sources'] as String?),
          playlistId: row['playlist_id'] as int,
          isActive: (row['is_active'] as int) == 1,
          createdAt: DateTime.fromMillisecondsSinceEpoch(row['created_at'] as int),
          resumePositionSeconds: (row['position_seconds'] as int?) ?? 0,
        );
      }).toList();
    } catch (e) {
      ServiceLocator.log.e(': $e');
      return [];
    }
  }

  /// 
  Future<void> clearWatchHistory(int playlistId) async {
    try {
      await _db.delete(
        'watch_history',
        where: 'playlist_id = ?',
        whereArgs: [playlistId],
      );
      ServiceLocator.log.d('$playlistId ');
    } catch (e) {
      ServiceLocator.log.e(': $e');
    }
  }

  /// 
  Future<void> clearAllWatchHistory() async {
    try {
      await _db.delete('watch_history');
      ServiceLocator.log.d('');
    } catch (e) {
      ServiceLocator.log.e(': $e');
    }
  }

  /// 
  /// MapkeyIDvalueURL
  Future<Map<int, Map<String, String>>> saveWatchHistoryChannelInfo(int playlistId) async {
    try {
      ServiceLocator.log.i('$playlistId ', tag: 'WatchHistoryService');
      
      // 
      final historyRecords = await _db.rawQuery('''
        SELECT wh.id, c.name, c.url
        FROM watch_history wh
        INNER JOIN channels c ON wh.channel_id = c.id
        WHERE wh.playlist_id = ?
      ''', [playlistId]);
      
      final Map<int, Map<String, String>> channelInfo = {};
      for (final record in historyRecords) {
        final historyId = record['id'] as int;
        final name = record['name'] as String;
        final url = record['url'] as String;
        channelInfo[historyId] = {'name': name, 'url': url};
      }
      
      ServiceLocator.log.i(' ${channelInfo.length} ', tag: 'WatchHistoryService');
      return channelInfo;
    } catch (e) {
      ServiceLocator.log.e(': $e', tag: 'WatchHistoryService');
      return {};
    }
  }

  /// ID
  /// ID
  Future<void> updateChannelIdsAfterRefresh(
    int playlistId,
    Map<int, Map<String, String>> savedChannelInfo,
  ) async {
    try {
      ServiceLocator.log.i('$playlistId ID', tag: 'WatchHistoryService');
      
      // 1. 20
      final countResult = await _db.rawQuery('''
        SELECT COUNT(*) as count FROM watch_history WHERE playlist_id = ?
      ''', [playlistId]);
      final count = countResult.first['count'] as int;
      
      if (count > 20) {
        // 20ID
        final keepIds = await _db.rawQuery('''
          SELECT id FROM watch_history 
          WHERE playlist_id = ? 
          ORDER BY watched_at DESC 
          LIMIT 20
        ''', [playlistId]);
        
        final keepIdList = keepIds.map((row) => row['id'] as int).join(',');
        
        // 
        await _db.rawQuery('''
          DELETE FROM watch_history 
          WHERE playlist_id = ? AND id NOT IN ($keepIdList)
        ''', [playlistId]);
        
        ServiceLocator.log.i(' ${count - 20} ', tag: 'WatchHistoryService');
      }
      
      int updatedCount = 0;
      int deletedCount = 0;
      
      // 2. 
      for (final entry in savedChannelInfo.entries) {
        final historyId = entry.key;
        final channelName = entry.value['name']!;
        final channelUrl = entry.value['url']!;
        
        // 1
        final historyExists = await _db.rawQuery('''
          SELECT id FROM watch_history WHERE id = ?
        ''', [historyId]);
        
        if (historyExists.isEmpty) {
          // 20
          continue;
        }
        
        // URLID
        final newChannels = await _db.rawQuery('''
          SELECT id FROM channels 
          WHERE name = ? AND url = ? AND playlist_id = ? AND is_active = 1
          LIMIT 1
        ''', [channelName, channelUrl, playlistId]);
        
        if (newChannels.isNotEmpty) {
          final newChannelId = newChannels.first['id'] as int;
          
          // ID
          await _db.update(
            'watch_history',
            {'channel_id': newChannelId},
            where: 'id = ?',
            whereArgs: [historyId],
          );
          updatedCount++;
        } else {
          // 
          await _db.delete(
            'watch_history',
            where: 'id = ?',
            whereArgs: [historyId],
          );
          deletedCount++;
          ServiceLocator.log.d(' $historyId ( "$channelName" )', tag: 'WatchHistoryService');
        }
      }
      
      ServiceLocator.log.i(':  $updatedCount  $deletedCount ', tag: 'WatchHistoryService');
    } catch (e) {
      ServiceLocator.log.e('ID: $e', tag: 'WatchHistoryService');
    }
  }

  /// 20
  /// 
  /// 2020
  Future<void> cleanupWatchHistoryAfterRefresh(int playlistId) async {
    try {
      ServiceLocator.log.i('$playlistId ', tag: 'WatchHistoryService');
      
      // 20
      final countResult = await _db.rawQuery('''
        SELECT COUNT(*) as count FROM watch_history WHERE playlist_id = ?
      ''', [playlistId]);
      final count = countResult.first['count'] as int;
      
      if (count > 20) {
        // 20ID
        final keepIds = await _db.rawQuery('''
          SELECT id FROM watch_history 
          WHERE playlist_id = ? 
          ORDER BY watched_at DESC 
          LIMIT 20
        ''', [playlistId]);
        
        final keepIdList = keepIds.map((row) => row['id'] as int).join(',');
        
        // 
        await _db.rawQuery('''
          DELETE FROM watch_history 
          WHERE playlist_id = ? AND id NOT IN ($keepIdList)
        ''', [playlistId]);
        
        ServiceLocator.log.i(' ${count - 20} 20', tag: 'WatchHistoryService');
      } else {
        ServiceLocator.log.i(' $count <= 20', tag: 'WatchHistoryService');
      }
    } catch (e) {
      ServiceLocator.log.e(': $e', tag: 'WatchHistoryService');
    }
  }

  /// 
  List<String> _parseSources(String? sourcesStr) {
    if (sourcesStr == null || sourcesStr.isEmpty) return [];
    try {
      // sources
      return sourcesStr.split(',').map((s) => s.trim()).where((s) => s.isNotEmpty).toList();
    } catch (e) {
      return [];
    }
  }
}
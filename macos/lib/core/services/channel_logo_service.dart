import '../database/database_helper.dart';
import 'service_locator.dart';

/// Service for managing channel logos
class ChannelLogoService {
  final DatabaseHelper _db;
  static const String _tableName = 'channel_logos';

  // Cache for logo mappings
  final Map<String, String> _logoCache = {};
  final Set<String> _notFoundCache = {};
  bool _isInitialized = false;

  ChannelLogoService(this._db);

  /// Initialize the service and load cache
  Future<void> initialize() async {
    if (_isInitialized) return;

    try {
      ServiceLocator.log.d('ChannelLogoService: ');
      await _loadCacheFromDatabase();
      _isInitialized = true;
      ServiceLocator.log
          .d('ChannelLogoService:  ${_logoCache.length} ');
    } catch (e) {
      ServiceLocator.log.e('ChannelLogoService: : $e');
    }
  }

  /// Load cache from database
  Future<void> _loadCacheFromDatabase() async {
    try {
      final logos = await _db.query(_tableName);
      _logoCache.clear();
      for (final logo in logos) {
        final channelName = logo['channel_name'] as String;
        final logoUrl = logo['logo_url'] as String;
        _logoCache[_normalizeChannelName(channelName)] = logoUrl;
      }
      ServiceLocator.log
          .d('ChannelLogoService:  ${_logoCache.length} ');
    } catch (e) {
      ServiceLocator.log.e('ChannelLogoService: : $e');
    }
  }

  /// Normalize channel name for matching
  String _normalizeChannelName(String name) {
    String normalized = name.toUpperCase();

    // 1. CCTV-01 -> CCTV1, CCTV-1 -> CCTV1
    normalized = normalized.replaceAllMapped(
      RegExp(r'CCTV[-\s]*0*(\d+)'),
      (match) => 'CCTV${match.group(1)}',
    );

    // 2. + CCTV1, CCTV5+
    // +++
    final coreMatch = RegExp(r'^([A-Z0-9+]+)').firstMatch(normalized);
    if (coreMatch != null) {
      final core = coreMatch.group(1)!;
      // 
      if (RegExp(r'[A-Z]').hasMatch(core) && RegExp(r'[0-9]').hasMatch(core)) {
        normalized = core;
        return normalized;
      }
    }

    // 3.  
    // 
    normalized = normalized.replaceAll(RegExp(r'(HD|4K|8K|FHD|UHD|SD)'), '');

    // 
    normalized = normalized.replaceAll(
      RegExp(r'(||||||||)$'),
      '',
    );

    // ""
    if (!normalized.endsWith('') && name.toUpperCase().contains('')) {
      // 
      final wsMatch = RegExp(r'(.+?)').firstMatch(name.toUpperCase());
      if (wsMatch != null) {
        normalized = '${wsMatch.group(1)!}';
      }
    }

    // 4.  + 
    normalized = normalized.replaceAll(RegExp(r'[-\s_]+'), '');

    return normalized;
  }

  /// Find logo URL for a channel name with fuzzy matching
  Future<String?> findLogoUrl(String channelName) async {
    if (!_isInitialized) {
      await initialize();
    }

    // Try exact match from cache first
    final normalized = _normalizeChannelName(channelName);

    if (_logoCache.containsKey(normalized)) {
      return _logoCache[normalized];
    }

    // Check negative cache
    if (_notFoundCache.contains(normalized)) {
      return null;
    }

    // Rely on memory cache for normalized matches.
    // The previous SQL query for "Exact Normalized Match" was redundant
    // because _logoCache is already populated with normalized keys at startup.
    // We proceed to fuzzy matching only if not in cache.

    // Try fuzzy match from database (Only for single lookups, not bulk)
    try {
      final cleanName = _normalizeChannelName(channelName);

      //  (LIKE)
      // ( findLogoUrlsBulk)
      final results = await _db.rawQuery('''
        SELECT logo_url FROM $_tableName 
        WHERE channel_name LIKE ? OR search_keys LIKE ?
        LIMIT 1
      ''', ['%$cleanName%', '%$cleanName%']);

      if (results.isNotEmpty) {
        final logoUrl = results.first['logo_url'] as String;
        _logoCache[normalized] = logoUrl;
        return logoUrl;
      } else {
        // Add to negative cache
        _notFoundCache.add(normalized);
      }
    } catch (e) {
      ServiceLocator.log.w('ChannelLogoService: : $e');
    }

    return null;
  }

  /// Batch find logo URLs for multiple channels
  /// Purely memory-based for maximum performance during scrolling
  Future<Map<String, String>> findLogoUrlsBulk(
      List<String> channelNames) async {
    if (!_isInitialized) {
      await initialize();
    }

    final Map<String, String> results = {};

    // Check memory cache
    // Since _logoCache contains ALL logos (normalized), we don't need to query DB.
    // DB queries are too slow for bulk operations during scrolling.
    for (final name in channelNames) {
      final normalized = _normalizeChannelName(name);

      if (_logoCache.containsKey(normalized)) {
        results[name] = _logoCache[normalized]!;
      } else {
        // If not in cache, assume not found for bulk operations.
        // We don't update negative cache here to allow potential future fuzzy retries
        // if the user stops scrolling (though currenlty we don't retry).
        // For performance, we treat "Not in Cache" as "No Logo".
        if (!_notFoundCache.contains(normalized)) {
          _notFoundCache.add(normalized);
        }
      }
    }

    return results;
  }

  /// Get logo count from database
  Future<int> getLogoCount() async {
    try {
      final result =
          await _db.rawQuery('SELECT COUNT(*) as count FROM $_tableName');
      return result.first['count'] as int;
    } catch (e) {
      return 0;
    }
  }
}

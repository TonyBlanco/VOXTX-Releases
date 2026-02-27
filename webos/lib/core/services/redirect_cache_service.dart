import 'dart:io';
import 'service_locator.dart';

/// URL
class _RedirectCacheEntry {
  final String realUrl;
  final DateTime timestamp;
  
  _RedirectCacheEntry(this.realUrl, this.timestamp);
}

/// 
/// HTTP 302
class RedirectCacheService {
  static final RedirectCacheService _instance = RedirectCacheService._internal();
  factory RedirectCacheService() => _instance;
  RedirectCacheService._internal();

  final Map<String, _RedirectCacheEntry> _cache = {};
  static const _cacheExpiryDuration = Duration(hours: 24); // 24

  /// 302
  Future<String> resolveRealPlayUrl(String url) async {
    final startTime = DateTime.now();
    
    // URL $ /
    final cleanUrl = url.split('\$').first.trim();
    
    //  HTTP/HTTPS 302
    if (!_isHttpProtocol(cleanUrl)) {
      ServiceLocator.log.d('✓ HTTP302: $cleanUrl');
      return cleanUrl;
    }
    
    //  udpxy URLudpxy  HEAD 
    if (_isUdpxyUrl(cleanUrl)) {
      ServiceLocator.log.d('✓ udpxy URL302: $cleanUrl');
      return cleanUrl;
    }
    
    // URL302
    if (_isDirectStreamUrl(cleanUrl)) {
      ServiceLocator.log.d('✓ URL302: $cleanUrl');
      return cleanUrl;
    }

    // Xtream URLHEAD
    if (_isXtreamUrl(cleanUrl)) {
      ServiceLocator.log.d('✓ Xtream URL302: $cleanUrl');
      return cleanUrl;
    }
    
    // URLkey
    final cached = _cache[cleanUrl];
    if (cached != null) {
      final now = DateTime.now();
      if (now.difference(cached.timestamp) < _cacheExpiryDuration) {
        final elapsed = DateTime.now().difference(startTime).inMilliseconds;
        ServiceLocator.log.d('✓  (${elapsed}ms): $cleanUrl -> ${cached.realUrl}');
        return cached.realUrl;
      } else {
        // 
        _cache.remove(cleanUrl);
        ServiceLocator.log.d(': $cleanUrl');
      }
    }

    // 3
    final realUrl = await _resolveRedirectRecursive(cleanUrl, 0, startTime);
    
    // 
    if (realUrl != cleanUrl) {
      _cache[cleanUrl] = _RedirectCacheEntry(realUrl, DateTime.now());
    }
    
    return realUrl;
  }
  
  /// URLHTTPHTTPS
  /// HTTP/HTTPS302
  bool _isHttpProtocol(String url) {
    try {
      final uri = Uri.parse(url);
      final scheme = uri.scheme.toLowerCase();
      return scheme == 'http' || scheme == 'https';
    } catch (e) {
      // URLfalse302
      return false;
    }
  }
  
  /// URL udpxy 
  /// udpxy  UDP  HTTP 
  /// 
  /// - path : /rtp/IPv4:Port  /udp/IPv4:Port
  /// -  HEAD 
  /// -  Range 
  /// -  Content-Length
  /// 
  /// 
  /// - http://192.168.1.1:4022/rtp/225.1.2.142:10870
  /// - http://lysj.aylzline.top:8899/rtp/225.1.2.142:10870
  bool _isUdpxyUrl(String url) {
    try {
      final uri = Uri.parse(url);
      final path = uri.path;
      
      // udpxy  path /rtp/IPv4:Port  /udp/IPv4:Port
      // IPv4 xxx.xxx.xxx.xxx ( 0-255)
      // Port 1-65535
      final udpxyRegex = RegExp(
        r'^/(rtp|udp)/\d{1,3}(\.\d{1,3}){3}:\d+$',
        caseSensitive: false,
      );
      
      return udpxyRegex.hasMatch(path);
    } catch (e) {
      return false;
    }
  }
  
  /// 
  Future<String> _resolveRedirectRecursive(String url, int depth, DateTime startTime) async {
    const maxDepth = 3; // 3
    
    if (depth >= maxDepth) {
      ServiceLocator.log.w('⚠ ($maxDepth): $url');
      return url;
    }
    
    // URL
    if (depth > 0 && _isDirectStreamUrl(url)) {
      ServiceLocator.log.d('✓ ${depth}URL: $url');
      return url;
    }

    try {
      final connectStartTime = DateTime.now();
      final client = HttpClient();
      client.autoUncompress = true;
      client.connectionTimeout = const Duration(seconds: 2);
      
      final request = await client.getUrl(Uri.parse(url));
      // Use Smarters-compatible User-Agent to avoid server blocking
      request.headers.set(HttpHeaders.userAgentHeader, 'IPTVSmartersPlayer');
      request.followRedirects = false;
      
      final response = await request.close().timeout(const Duration(seconds: 2));
      final connectTime = DateTime.now().difference(connectStartTime).inMilliseconds;
      
      final responseCode = response.statusCode;
      ServiceLocator.log.d('${depth + 1} HTTP: $responseCode');
      
      if (responseCode == 403) {
        ServiceLocator.log.w('403 ForbiddenUser-Agent');
      }
      
      if (response.isRedirect) {
        final location = response.headers.value(HttpHeaders.locationHeader);
        await response.drain();
        client.close();

        if (location != null) {
          final elapsed = DateTime.now().difference(startTime).inMilliseconds;
          ServiceLocator.log.d('✓ ${depth + 1} (${connectTime}ms, :${elapsed}ms)');
          ServiceLocator.log.d('  ${depth + 1}URL: $url');
          ServiceLocator.log.d('  -> : $location');

          // If the Location points to a player_api.php endpoint, update a saved Xtream base for this host
          try {
            if (location.contains('/player_api.php')) {
              final origHost = Uri.parse(url).host;
              final parts = location.split('/player_api.php');
              if (parts.isNotEmpty) {
                final newBase = parts.first;
                try {
                  await ServiceLocator.prefs.setString('xtream_base_$origHost', newBase);
                  ServiceLocator.log.i('Xtream base: $origHost -> $newBase', tag: 'RedirectCacheService');
                } catch (e) {
                  ServiceLocator.log.w('Xtream base: $e', tag: 'RedirectCacheService');
                }
              }
            }
          } catch (e) {
            ServiceLocator.log.w('Location: $e', tag: 'RedirectCacheService');
          }

          // 
          return await _resolveRedirectRecursive(location, depth + 1, startTime);
        }
      }
      
      await response.drain();
      client.close();
      
      final totalTime = DateTime.now().difference(startTime).inMilliseconds;
      if (depth == 0) {
        ServiceLocator.log.d('✓  (${totalTime}ms): $responseCode URL: $url');
      } else {
        ServiceLocator.log.d('✓ ${depth + 1} (:${totalTime}ms)URL: $url');
      }
      return url;
    } catch (e) {
      final totalTime = DateTime.now().difference(startTime).inMilliseconds;
      ServiceLocator.log.e('✗ ${depth + 1} (${totalTime}ms): $e');
      return url;
    }
  }
  
  /// URL
  /// 302
  bool _isDirectStreamUrl(String url) {
    try {
      final uri = Uri.parse(url);
      final path = uri.path.toLowerCase();
      
      // 
      final streamExtensions = [
        '.m3u8',   // HLS
        '.m3u',    // M3U playlist
        '.ts',     // MPEG-TS
        '.flv',    // Flash Video
        '.mp4',    // MP4
        '.mkv',    // Matroska
        '.avi',    // AVI
        '.mov',    // QuickTime
        '.wmv',    // Windows Media
        '.mpd',    // MPEG-DASH
        '.f4m',    // Flash Manifest
        '.ism',    // Smooth Streaming
        '.webm',   // WebM
      ];
      
      // 
      return streamExtensions.any((ext) => path.endsWith(ext));
    } catch (e) {
      return false;
    }
  }

  ///  Xtream Codes  URL
  /// URLHEAD/302
  bool _isXtreamUrl(String url) {
    try {
      final uri = Uri.parse(url);
      final path = uri.path.toLowerCase();
      final hasXtreamQuery = uri.query.toLowerCase().contains('username=') && uri.query.toLowerCase().contains('password=');

      if (path.contains('/player_api.php') || path.contains('/get.php')) {
        return true;
      }

      if (path.contains('/live/') || path.contains('/movie/') || path.contains('/series/')) {
        return true;
      }

      if (hasXtreamQuery && (path.endsWith('.ts') || path.endsWith('.m3u8') || path.endsWith('.mp4') || path.contains('/live'))) {
        return true;
      }

      return false;
    } catch (e) {
      return false;
    }
  }

  /// URL
  void clearCache(String url) {
    _cache.remove(url);
    ServiceLocator.log.d(': $url');
  }

  /// 
  void clearAllCache() {
    _cache.clear();
    ServiceLocator.log.d('');
  }

  /// 
  void clearExpiredCache() {
    final now = DateTime.now();
    _cache.removeWhere((url, entry) {
      final expired = now.difference(entry.timestamp) >= _cacheExpiryDuration;
      if (expired) {
        ServiceLocator.log.d(': $url');
      }
      return expired;
    });
  }

  /// 
  Map<String, dynamic> getCacheStats() {
    return {
      'total': _cache.length,
      'entries': _cache.entries.map((e) {
        final age = DateTime.now().difference(e.value.timestamp);
        return {
          'url': e.key,
          'realUrl': e.value.realUrl,
          'age': '${age.inMinutes}',
        };
      }).toList(),
    };
  }
}

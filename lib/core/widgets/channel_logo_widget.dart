import 'dart:async';
import 'package:flutter/material.dart';
import 'package:cached_network_image/cached_network_image.dart';
import 'package:flutter_cache_manager/flutter_cache_manager.dart';
import 'package:http/http.dart' as http;
import 'package:http/io_client.dart' as io_client;
import 'dart:io';
import '../models/channel.dart';
import '../services/service_locator.dart';
import '../utils/throttled_state_mixin.dart';

// ========================================
// ✅  - 
// ========================================
//
// 
// 1. maxConnectionsPerHost (10): 
//    - 
//    - 
//
// 2. connectionTimeout (3s): 
//    - 
//    - 
//
// 3. idleTimeout (30s): 
//    - 
//    - 
//
// 4. maxConcurrentLoads (15): 
//    - UI
//    - 
//
// 5. maxQueueSize (30): 
//    - 
//    - 
//
// ========================================

/// HTTP 
class _HttpPoolConfig {
  static const int maxConnectionsPerHost = 50; // 
  static const Duration connectionTimeout = Duration(seconds: 5); // 
  static const Duration idleTimeout = Duration(seconds: 30); // 
}

/// 
class _LogoLoadConfig {
  static const int maxConcurrentLoads = 50; // 
  static const int maxQueueSize = 1000; // 
}

// ========================================

/// ✅ HTTPTCP
class _HttpConnectionPool {
  static final _HttpConnectionPool _instance = _HttpConnectionPool._();
  factory _HttpConnectionPool() => _instance;
  _HttpConnectionPool._();

  HttpClient? _httpClient;
  io_client.IOClient? _ioClient;
  bool _initialized = false;

  void initialize() {
    if (_initialized) {
      ServiceLocator.log.d('[HttpPool] ');
      return;
    }

    _httpClient = HttpClient()
      ..connectionTimeout = _HttpPoolConfig.connectionTimeout
      ..idleTimeout = _HttpPoolConfig.idleTimeout
      ..maxConnectionsPerHost = _HttpPoolConfig.maxConnectionsPerHost
      ..autoUncompress = true
      ..userAgent = 'VOXTV/1.5';

    _ioClient = io_client.IOClient(_httpClient!);
    _initialized = true;
    ServiceLocator.log.i(
        '[HttpPool]  - : ${_HttpPoolConfig.maxConnectionsPerHost}, : ${_HttpPoolConfig.connectionTimeout.inSeconds}s, : ${_HttpPoolConfig.idleTimeout.inSeconds}s');
  }

  io_client.IOClient get client {
    if (!_initialized || _ioClient == null) {
      ServiceLocator.log.w('[HttpPool] ');
      initialize();
    }
    return _ioClient!;
  }

  void dispose() {
    if (_httpClient != null) {
      _httpClient!.close(force: true);
      _initialized = false;
      ServiceLocator.log.i('[HttpPool] ');
    }
  }
}

/// Custom HTTP client with timeout and connection pooling for logo loading
class _TimeoutHttpClient extends http.BaseClient {
  final io_client.IOClient _pooledClient;
  final Duration timeout;

  _TimeoutHttpClient({
    required io_client.IOClient pooledClient,
    this.timeout = const Duration(seconds: 3),
  }) : _pooledClient = pooledClient;

  @override
  Future<http.StreamedResponse> send(http.BaseRequest request) {
    return _pooledClient.send(request).timeout(timeout);
  }

  @override
  void close() {
    // 
  }
}

/// Custom cache manager with short timeout for logo loading
class LogoCacheManager extends CacheManager {
  static const key = 'logoCache';
  static LogoCacheManager? _instance;

  factory LogoCacheManager() {
    _instance ??= LogoCacheManager._();
    return _instance!;
  }

  LogoCacheManager._()
      : super(
          Config(
            key,
            stalePeriod: const Duration(days: 7),
            maxNrOfCacheObjects: 500,
            repo: JsonCacheInfoRepository(databaseName: key),
            fileService: HttpFileService(
              httpClient: _TimeoutHttpClient(
                pooledClient: _HttpConnectionPool().client,
                timeout: _HttpPoolConfig.connectionTimeout,
              ),
            ),
          ),
        ) {
    // 
    _HttpConnectionPool().initialize();
    ServiceLocator.log.i('[LogoCache] ');
  }
}

/// Global logo state manager to persist logo loading states across widget rebuilds
class _LogoStateManager {
  static final _LogoStateManager _instance = _LogoStateManager._();
  factory _LogoStateManager() => _instance;
  _LogoStateManager._();

  //  M3U  key
  final Map<String, bool> _m3uLogoFailed = {};

  //  URL key
  final Map<String, String?> _fallbackLogoUrls = {};

  //  null 
  final Set<String> _fallbackLoaded = {};

  //  fallback 
  final Set<String> _loadingFallback = {};

  // ✅ 
  bool _isScrolling = false;
  final ValueNotifier<bool> scrollingNotifier = ValueNotifier(false);

  // 
  static const int _maxConcurrentLoads = _LogoLoadConfig.maxConcurrentLoads;
  static const int _maxQueueSize = _LogoLoadConfig.maxQueueSize;
  int _currentLoadingCount = 0;
  final List<Function> _pendingLoads = [];

  bool get isScrolling => _isScrolling;

  void setScrolling(bool scrolling) {
    if (_isScrolling != scrolling) {
      _isScrolling = scrolling;
      scrollingNotifier.value = scrolling;
      // ServiceLocator.log.d(
      //     '[LogoState] : ${scrolling ? "" : ""}, : ${_pendingLoads.length}/$_maxQueueSize, : $_currentLoadingCount/$_maxConcurrentLoads');

      if (!scrolling) {
        // 
        _processNextPendingLoad();
      }
    }
  }

  bool isM3uLogoFailed(String channelName) {
    return _m3uLogoFailed[channelName] ?? false;
  }

  void markM3uLogoFailed(String channelName) {
    _m3uLogoFailed[channelName] = true;
  }

  String? getFallbackLogoUrl(String channelName) {
    return _fallbackLogoUrls[channelName];
  }

  void setFallbackLogoUrl(String channelName, String? url) {
    _fallbackLogoUrls[channelName] = url;
    _fallbackLoaded.add(channelName); // 
  }

  bool isFallbackLoaded(String channelName) {
    return _fallbackLoaded.contains(channelName);
  }

  bool isLoadingFallback(String channelName) {
    return _loadingFallback.contains(channelName);
  }

  void markLoadingFallback(String channelName, bool loading) {
    if (loading) {
      _loadingFallback.add(channelName);
    } else {
      _loadingFallback.remove(channelName);
    }
  }

  ///  fallback logo
  Future<void> requestLoadFallback(Function loadFunction) async {
    // ✅ 
    if (_isScrolling) {
      if (_pendingLoads.length >= _maxQueueSize) {
        // ServiceLocator.log.d(
        //     '[LogoState] (${_pendingLoads.length}/$_maxQueueSize)');
        return;
      }
      // ServiceLocator.log.d(
      //     '[LogoState] : ${_pendingLoads.length}/$_maxQueueSize');
      _pendingLoads.add(loadFunction);
      return;
    }

    if (_currentLoadingCount < _maxConcurrentLoads) {
      // ServiceLocator.log.d(
      //     '[LogoState] : $_currentLoadingCount/$_maxConcurrentLoads');
      _currentLoadingCount++;
      try {
        await loadFunction();
      } finally {
        _currentLoadingCount--;
        // ServiceLocator.log.d(
        //     '[LogoState] : $_currentLoadingCount/$_maxConcurrentLoads');
        _processNextPendingLoad();
      }
    } else {
      // 
      if (_pendingLoads.length >= _maxQueueSize) {
        // ServiceLocator.log
        //     .d('[LogoState] (${_pendingLoads.length}/$_maxQueueSize)');
        return;
      }
      // ServiceLocator.log.d(
      //     '[LogoState] : ${_pendingLoads.length}/$_maxQueueSize');
      _pendingLoads.add(loadFunction);
    }
  }

  void _processNextPendingLoad() {
    // ✅ 
    if (_isScrolling) {
      // ServiceLocator.log.d('[LogoState] ');
      return;
    }

    // ✅ 
    while (_pendingLoads.isNotEmpty &&
        _currentLoadingCount < _maxConcurrentLoads) {
      final nextLoad = _pendingLoads.removeAt(0);
      // ServiceLocator.log.d('[LogoState] : ${_pendingLoads.length}');
      _currentLoadingCount++;
      nextLoad().then((_) {
        _currentLoadingCount--;
        _processNextPendingLoad();
      }).catchError((e) {
        ServiceLocator.log.w('[LogoState] : $e');
        _currentLoadingCount--;
        _processNextPendingLoad();
      });
    }
  }

  void clear() {
    _m3uLogoFailed.clear();
    _fallbackLogoUrls.clear();
    _fallbackLoaded.clear();
    _loadingFallback.clear();
    _pendingLoads.clear();
    _currentLoadingCount = 0;
  }

  /// 
  void clearPendingLoads() {
    _pendingLoads.clear();
    ServiceLocator.log.d(': 0');
  }
}

/// 
void clearLogoLoadingQueue() {
  _LogoStateManager().clearPendingLoads();
}

/// 
void clearAllLogoCache() {
  _LogoStateManager().clear();
  ServiceLocator.log.d('');
}

/// ✅ 
void setLogoLoadingScrolling(bool scrolling) {
  _LogoStateManager().setScrolling(scrolling);
}

/// ✅ HTTP
void initializeLogoConnectionPool() {
  _HttpConnectionPool().initialize();
}

/// ✅ HTTP
void disposeLogoConnectionPool() {
  _HttpConnectionPool().dispose();
}

/// Widget to display channel logo with fallback priority:
/// 1. M3U logo (if available and loads successfully)
/// 2. Database logo (fuzzy match by channel name)
/// 3. Default placeholder image
///
/// ✅  ValueNotifier  setState() 
class ChannelLogoWidget extends StatefulWidget {
  final Channel channel;
  final double? width;
  final double? height;
  final BoxFit fit;
  final BorderRadius? borderRadius;

  const ChannelLogoWidget({
    super.key,
    required this.channel,
    this.width,
    this.height,
    this.fit = BoxFit.cover,
    this.borderRadius,
  });

  @override
  State<ChannelLogoWidget> createState() => _ChannelLogoWidgetState();
}

class _ChannelLogoWidgetState extends State<ChannelLogoWidget> with ThrottledStateMixin {
  final _logoState = _LogoStateManager();
  bool _isDisposed = false;

  @override
  void initState() {
    super.initState();
    // ServiceLocator.log.d('[ChannelLogo] initState - ${widget.channel.name}');
  }

  @override
  void dispose() {
    _isDisposed = true;
    super.dispose();
  }

  void _onM3uLogoError() {
    if (_isDisposed) return;

    final channelName = widget.channel.name;
    // 
    if (!_logoState.isM3uLogoFailed(channelName)) {
      // 
      _logoState.markM3uLogoFailed(channelName);
      
      // ✅  setState
      // errorWidget  fallback
      // ServiceLocator.log.d('[ChannelLogo] M3U - $channelName');
    }
  }

  Widget _buildLogo(String? logoUrl, {bool isM3uLogo = false}) {
    if (logoUrl == null || logoUrl.isEmpty) {
      return _buildPlaceholder();
    }

    return CachedNetworkImage(
      imageUrl: logoUrl,
      width: widget.width,
      height: widget.height,
      fit: widget.fit,
      cacheManager: LogoCacheManager(), // 
      placeholder: (context, url) => _buildPlaceholder(),
      errorWidget: (context, url, error) {
        if (isM3uLogo) {
          _onM3uLogoError();
          
          // ✅ M3U  fallback 
          final fallback = widget.channel.fallbackLogoUrl;
          ServiceLocator.log.d('[ChannelLogo] M3U. fallbackURL - $fallback');
          //  fallback IO 
          if (!_logoState.isScrolling && fallback != null && fallback.isNotEmpty) {
            //  Image.network 
            //  CachedNetworkImage 
            return Image.network(
              fallback,
              width: widget.width,
              height: widget.height,
              fit: widget.fit,
              errorBuilder: (_, __, ___) => _buildPlaceholder(),
              // 
              loadingBuilder: (context, child, loadingProgress) {
                if (loadingProgress == null) return child;
                return _buildPlaceholder();
              },
            );
          }
        }
        return _buildPlaceholder();
      },
      httpHeaders: const {
        'Connection': 'close',
      },
      fadeInDuration: const Duration(milliseconds: 200),
      fadeOutDuration: const Duration(milliseconds: 200),
    );
  }

  Widget _buildPlaceholder() {
    return Container(
      width: widget.width,
      height: widget.height,
      decoration: BoxDecoration(
        borderRadius: widget.borderRadius,
      ),
      child: Image.asset(
        'assets/images/default_logo.png',
        fit: BoxFit.contain,
        errorBuilder: (context, error, stackTrace) {
          // 
          return Icon(
            Icons.tv,
            size: (widget.width ?? 48) * 0.5,
            color: Colors.grey[600],
          );
        },
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    return ValueListenableBuilder<bool>(
      valueListenable: _logoState.scrollingNotifier,
      builder: (context, isScrolling, child) {
        //  CachedNetworkImage  IO 
        if (isScrolling) {
          return _buildPlaceholderWrapper();
        }

        Widget logoWidget;
        final channelName = widget.channel.name;

        // M3U
        final m3uHasFailed = _logoState.isM3uLogoFailed(channelName);

        String? urlToLoad;
        bool isM3u = false;

        // 1: M3U ()
        if (!m3uHasFailed &&
            widget.channel.logoUrl != null &&
            widget.channel.logoUrl!.isNotEmpty) {
          urlToLoad = widget.channel.logoUrl;
          isM3u = true;
        }
        // 2: 
        else if (widget.channel.fallbackLogoUrl != null &&
            widget.channel.fallbackLogoUrl!.isNotEmpty) {
          urlToLoad = widget.channel.fallbackLogoUrl;
        }

        if (urlToLoad != null) {
          logoWidget = _buildLogo(urlToLoad, isM3uLogo: isM3u);
        } else {
          // 3: 
          logoWidget = _buildPlaceholder();
        }

        if (widget.borderRadius != null) {
          return ClipRRect(
            borderRadius: widget.borderRadius!,
            child: logoWidget,
          );
        }

        return logoWidget;
      },
    );
  }

  Widget _buildPlaceholderWrapper() {
    final placeholder = _buildPlaceholder();
    if (widget.borderRadius != null) {
      return ClipRRect(
        borderRadius: widget.borderRadius!,
        child: placeholder,
      );
    }
    return placeholder;
  }
}

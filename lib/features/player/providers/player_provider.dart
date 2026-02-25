import 'package:flutter/widgets.dart';
import 'package:media_kit/media_kit.dart';
import 'package:media_kit_video/media_kit_video.dart';
import 'dart:io';
import 'dart:async';
import 'dart:math' as math;

import '../../../core/models/channel.dart';
import '../../../core/platform/platform_detector.dart';
import '../../../core/services/service_locator.dart';
import '../../../core/services/channel_test_service.dart';
import '../../../core/services/log_service.dart';

enum PlayerState {
  idle,
  loading,
  playing,
  paused,
  error,
  buffering,
}

/// Unified player provider that uses:
/// - Native Android Activity (via MethodChannel) on Android TV for best 4K performance
/// - media_kit on all other platforms (Windows, Android phone/tablet, etc.)
class PlayerProvider extends ChangeNotifier {
  // media_kit player (for all platforms except Android TV)
  Player? _mediaKitPlayer;
  VideoController? _videoController;

  // Common state
  Channel? _currentChannel;
  PlayerState _state = PlayerState.idle;
  String? _error;
  Duration _position = Duration.zero;
  Duration _duration = Duration.zero;
  double _volume = 1.0;
  bool _isMuted = false;
  double _playbackSpeed = 1.0;
  bool _isFullscreen = false;
  bool _controlsVisible = true;
  int _volumeBoostDb = 0;

  int _retryCount = 0;
  static const int _maxRetries = 3; // exponential backoff: 500ms, 1s, 2s
  Timer? _retryTimer;
  bool _isAutoSwitching = false; // 
  bool _isAutoDetecting = false; // 
  bool _isSoftwareDecoding = false;
  bool _noVideoFallbackAttempted = false;
  bool _allowSoftwareFallback = true;
  String _windowsHwdecMode = 'auto-safe';
  bool _isDisposed = false;
  String _videoOutput = 'auto';
  String _vo = 'unknown';
  String _configuredVo = 'auto';

  // On Android TV, we use native player via Activity, so don't init any Flutter player
  // On Android phone/tablet and other platforms, use media_kit
  bool get _useNativePlayer => Platform.isAndroid && PlatformDetector.isTV;

  // Getters
  Player? get player => _mediaKitPlayer;
  VideoController? get videoController => _videoController;

  Channel? get currentChannel => _currentChannel;
  PlayerState get state => _state;
  String? get error => _error;
  Duration get position => _position;
  Duration get duration => _duration;
  double get volume => _volume;
  bool get isMuted => _isMuted;
  double get playbackSpeed => _playbackSpeed;
  bool get isFullscreen => _isFullscreen;
  bool get controlsVisible => _controlsVisible;

  bool get isPlaying => _state == PlayerState.playing;
  bool get isLoading => _state == PlayerState.loading || _state == PlayerState.buffering;
  bool get hasError => _state == PlayerState.error && _error != null;

  /// Check if current content is seekable (VOD or replay)
  bool get isSeekable {
    // 1. 
    if (_currentChannel?.isLive == true) return false;
    
    // 2. 
    if (_currentChannel?.isSeekable == true) {
      //  duration 
      if (_duration.inSeconds > 0 && _duration.inSeconds <= 86400) {
        return true;
      }
    }
    
    // 3.  duration
    //  duration  0 
    if (_duration.inSeconds > 0 && _duration.inSeconds <= 86400) {
      // 124
      if (_currentChannel?.isLive != true) {
        return true;
      }
    }
    
    // 4. 
    return false;
  }
  
  /// Check if should show progress bar based on settings and content
  bool shouldShowProgressBar(String progressBarMode) {
    if (progressBarMode == 'never') return false;
    if (progressBarMode == 'always') return _duration.inSeconds > 0;
    // auto mode: only show for seekable content
    return isSeekable && _duration.inSeconds > 0;
  }
  
  /// Check if current content is live stream
  bool get isLiveStream => !isSeekable;

  // 
  void clearError() {
    _error = null;
    _errorDisplayed = true; // 
    //  idle hasError  true
    if (_state == PlayerState.error) {
      _state = PlayerState.idle;
    }
    notifyListeners();
  }

  // 
  DateTime? _lastErrorTime;
  String? _lastErrorMessage;
  bool _errorDisplayed = false; // 

  void _setError(String error) {
    ServiceLocator.log.d('PlayerProvider: _setError  - : $_retryCount/$_maxRetries, : $error');
    
    //  seek  seek
    if (error.contains('seekable') || 
        error.contains('Cannot seek') || 
        error.contains('seek in this stream')) {
      ServiceLocator.log.d('PlayerProvider:  seek ');
      return;
    }
    
    // 
    if (error.contains('Error decoding audio') || 
        error.contains('audio decoder') ||
        error.contains('Audio decoding')) {
      ServiceLocator.log.d('PlayerProvider: Ignore audio decode warning (likely partial frame decode failure)');
      return;
    }
    
    // 
    if (_retryCount < _maxRetries && _currentChannel != null) {
      _retryCount++;
      ServiceLocator.log.d('PlayerProvider: ($_retryCount/$_maxRetries): $error');
      _retryTimer?.cancel();
      // Exponential backoff: 500ms, 1000ms, 2000ms
      final delayMs = 500 * math.pow(2, _retryCount - 1).round();
      ServiceLocator.log.d('PlayerProvider: retry in ${delayMs}ms (backoff)');
      _retryTimer = Timer(Duration(milliseconds: delayMs), () {
        if (_currentChannel != null) {
          _retryPlayback();
        }
      });
      return;
    }
    
    // 
    if (_currentChannel != null && _currentChannel!.hasMultipleSources) {
      final currentSourceIndex = _currentChannel!.currentSourceIndex;
      final totalSources = _currentChannel!.sourceCount;
      
      ServiceLocator.log.d('PlayerProvider: : $currentSourceIndex, : $totalSources');
      
      // 
      int nextIndex = currentSourceIndex + 1;
      
      // 
      if (nextIndex < totalSources) {
        // 
        ServiceLocator.log.d('PlayerProvider: (${currentSourceIndex + 1}/$totalSources)  ${nextIndex + 1}');
        
        // 
        _isAutoDetecting = true;
        // 
        _checkAndSwitchToNextSource(nextIndex, error);
        return;
      } else {
        ServiceLocator.log.d('PlayerProvider:  (${currentSourceIndex + 1}/$totalSources), ');
      }
    }
    
    // 
    final now = DateTime.now();
    // 
    if (_errorDisplayed) {
      return;
    }
    // 30
    if (_lastErrorMessage == error && _lastErrorTime != null && now.difference(_lastErrorTime!).inSeconds < 30) {
      return;
    }
    _lastErrorMessage = error;
    _lastErrorTime = now;
    
    ServiceLocator.log.d('PlayerProvider: Playback failed, show error');
    _state = PlayerState.error;
    _error = error;
    notifyListeners();
  }
  
  
  /// 
  Future<void> _checkAndSwitchToNextSource(int nextIndex, String originalError) async {
    if (_currentChannel == null || !_isAutoDetecting) return; // 
    
    // UI
    _currentChannel!.currentSourceIndex = nextIndex;
    _state = PlayerState.loading;
    notifyListeners();
    
    ServiceLocator.log.d('PlayerProvider:  ${nextIndex + 1}/${_currentChannel!.sourceCount}');
    
    final testService = ChannelTestService();
    final tempChannel = Channel(
      id: _currentChannel!.id,
      name: _currentChannel!.name,
      url: _currentChannel!.sources[nextIndex],
      groupName: _currentChannel!.groupName,
      logoUrl: _currentChannel!.logoUrl,
      sources: [_currentChannel!.sources[nextIndex]],
      playlistId: _currentChannel!.playlistId,
    );
    
    final result = await testService.testChannel(tempChannel);
    
    if (!_isAutoDetecting) return; // 
    
    if (!result.isAvailable) {
      ServiceLocator.log.d('PlayerProvider:  ${nextIndex + 1} : ${result.error}');
      
      // 
      final totalSources = _currentChannel!.sourceCount;
      final nextNextIndex = nextIndex + 1;
      
      if (nextNextIndex < totalSources) {
        // 
        _checkAndSwitchToNextSource(nextNextIndex, originalError);
      } else {
        // 
        ServiceLocator.log.d('PlayerProvider: ');
        _isAutoDetecting = false;
        _state = PlayerState.error;
        _error = 'All $totalSources sources failed';
        notifyListeners();
      }
      return;
    }
    
    ServiceLocator.log.d('PlayerProvider: Source ${nextIndex + 1} is available (${result.responseTime}ms), switching');
    _isAutoDetecting = false;
    _retryCount = 0; // 
    _isAutoSwitching = true; // 
    _lastErrorMessage = null; // 
    _playCurrentSource();
    _isAutoSwitching = false; // 
  }

  /// 
  Future<void> _retryPlayback() async {
    if (_currentChannel == null) return;
    
    ServiceLocator.log.d('PlayerProvider:  ${_currentChannel!.name}, : ${_currentChannel!.currentSourceIndex}, : $_retryCount');
    final startTime = DateTime.now();
    
    _state = PlayerState.loading;
    _error = null;
    notifyListeners();
    
    //  currentUrl  url
    final url = _currentChannel!.currentUrl;
    ServiceLocator.log.d('PlayerProvider: URL: $url');
    
    try {
      if (!_useNativePlayer) {
        ServiceLocator.log.i('>>> Retry: start resolving redirect', tag: 'PlayerProvider');
        //  302 
        final redirectStartTime = DateTime.now();
        
        final realUrl = await ServiceLocator.redirectCache.resolveRealPlayUrl(url);
        
        final redirectTime = DateTime.now().difference(redirectStartTime).inMilliseconds;
        ServiceLocator.log.i('>>> : 302: ${redirectTime}ms', tag: 'PlayerProvider');
        ServiceLocator.log.d('>>> : : $realUrl', tag: 'PlayerProvider');
        
        final playStartTime = DateTime.now();
        await _mediaKitPlayer?.open(Media(realUrl));
        
        final playTime = DateTime.now().difference(playStartTime).inMilliseconds;
        final totalTime = DateTime.now().difference(startTime).inMilliseconds;
        ServiceLocator.log.i('>>> : : ${playTime}ms', tag: 'PlayerProvider');
        ServiceLocator.log.i('>>> : : ${totalTime}ms', tag: 'PlayerProvider');
        
        _state = PlayerState.playing;
      }
      //  _retryCount
      // playing 
      ServiceLocator.log.d('PlayerProvider: Retry command sent');
    } catch (e) {
      final totalTime = DateTime.now().difference(startTime).inMilliseconds;
      ServiceLocator.log.d('PlayerProvider:  (${totalTime}ms): $e');
      // 
      _setError('Failed to play channel: $e');
    }
    notifyListeners();
  }

  String _hwdecMode = 'unknown';
  String _videoCodec = '';
  double _fps = 0;
  
  //  hwdec 
  String _configuredHwdec = 'unknown';
  
  // FPS 
  double _currentFps = 0;
  
  // 
  int _videoWidth = 0;
  int _videoHeight = 0;
  double _downloadSpeed = 0; // bytes per second

  double get currentFps => _currentFps;
  int get videoWidth => _videoWidth;
  int get videoHeight => _videoHeight;
  double get downloadSpeed => _downloadSpeed;

  String get videoInfo {
    if (_mediaKitPlayer == null) return '';
    final w = _mediaKitPlayer!.state.width;
    final h = _mediaKitPlayer!.state.height;
    if (w == 0 || h == 0) return '';
    final parts = <String>['${w}x$h'];
    if (_videoCodec.isNotEmpty) parts.add(_videoCodec);
    if (_fps > 0) parts.add('${_fps.toStringAsFixed(1)} fps');
    final hwdecInfo = _formatHwdecInfo();
    if (hwdecInfo.isNotEmpty) {
      parts.add('hwdec: $hwdecInfo');
    }
    final voInfo = _formatVoInfo();
    if (voInfo.isNotEmpty) {
      parts.add('vo: $voInfo');
    }
    return parts.join(' | ');
  }

  double get progress {
    if (_duration.inMilliseconds == 0) return 0;
    return _position.inMilliseconds / _duration.inMilliseconds;
  }

  PlayerProvider() {
    _initPlayer();
  }

  void _initPlayer({bool useSoftwareDecoding = false}) {
    // On Android TV, we use native player - don't initialize any Flutter player
    if (_useNativePlayer) {
      return;
    }

    //  Android  media_kit
    _initMediaKitPlayer(useSoftwareDecoding: useSoftwareDecoding);
  }
  
  ///  - ,
  /// 
  Future<void> warmup() async {
    if (_useNativePlayer) {
      return; // 
    }
    
    if (_mediaKitPlayer == null) {
      ServiceLocator.log.d('PlayerProvider:  -  media_kit', tag: 'PlayerProvider');
      _initMediaKitPlayer();
    }
    
    //  Media /
    // 
  }

  void _initMediaKitPlayer({bool useSoftwareDecoding = false, String bufferStrength = 'fast'}) {
    _mediaKitPlayer?.dispose();
    _debugInfoTimer?.cancel();
    // Load decoding settings (overridden by explicit useSoftwareDecoding)
    final prefs = ServiceLocator.prefs;
    final decodingMode = prefs.getString('decoding_mode') ?? 'auto';
    _windowsHwdecMode = prefs.getString('windows_hwdec_mode') ?? 'auto-safe';
    _allowSoftwareFallback = prefs.getBool('allow_software_fallback') ?? true;
    _videoOutput = prefs.getString('video_output') ?? 'auto';
    final effectiveSoftware = useSoftwareDecoding || decodingMode == 'software';
    _isSoftwareDecoding = effectiveSoftware;

    ServiceLocator.log.i('==========  ==========', tag: 'PlayerProvider');
    ServiceLocator.log.i(': ${Platform.operatingSystem}', tag: 'PlayerProvider');
    ServiceLocator.log.i(': $useSoftwareDecoding', tag: 'PlayerProvider');
    ServiceLocator.log.i(': $bufferStrength', tag: 'PlayerProvider');

    // 
    final bufferSize = switch (bufferStrength) {
      'fast' => 32 * 1024 * 1024,      // 32MB - 
      'balanced' => 64 * 1024 * 1024,  // 64MB - 
      'stable' => 128 * 1024 * 1024,   // 128MB - 
      _ => 32 * 1024 * 1024,
    };

    String? vo;
    switch (_videoOutput) {
      case 'gpu':
        vo = 'gpu';
        break;
      case 'libmpv':
        vo = 'libmpv';
        break;
      case 'auto':
      default:
        vo = null;
        break;
    }
    _configuredVo = _videoOutput;

    _mediaKitPlayer = Player(
      configuration: PlayerConfiguration(
        bufferSize: bufferSize,
        vo: vo,
        // 
        // timeout: 3 
        //  mpv 
        logLevel: ServiceLocator.log.currentLevel == LogLevel.debug
            ? MPVLogLevel.debug
            : (ServiceLocator.log.currentLevel == LogLevel.off
                ? MPVLogLevel.error
                : MPVLogLevel.info),
      ),
    );

    // ″
    String? hwdecMode;
    if (Platform.isAndroid) {
      hwdecMode = effectiveSoftware ? 'no' : 'mediacodec';
    } else if (Platform.isWindows) {
      if (effectiveSoftware) {
        hwdecMode = 'no';
      } else {
        switch (_windowsHwdecMode) {
          case 'auto-copy':
            hwdecMode = 'auto-copy';
            break;
          case 'd3d11va':
            hwdecMode = 'd3d11va';
            break;
          case 'dxva2':
            hwdecMode = 'dxva2';
            break;
          case 'auto-safe':
          default:
            hwdecMode = 'auto-safe';
            break;
        }
      }
    }

    _configuredHwdec = hwdecMode ?? 'default';
    ServiceLocator.log.i(': ${hwdecMode ?? ""}', tag: 'PlayerProvider');
    ServiceLocator.log.i('€? ${!effectiveSoftware}', tag: 'PlayerProvider');

    VideoControllerConfiguration config = VideoControllerConfiguration(
      hwdec: hwdecMode,
      enableHardwareAcceleration: !effectiveSoftware,
    );

    // 
    _hwdecMode = effectiveSoftware ? 'no' : _configuredHwdec;
    _vo = vo ?? 'auto';

    _videoController = VideoController(_mediaKitPlayer!, configuration: config);
    _setupMediaKitListeners();
    _updateDebugInfo();
    
    ServiceLocator.log.i('', tag: 'PlayerProvider');
  }

  void _setupMediaKitListeners() {
    ServiceLocator.log.d('', tag: 'PlayerProvider');
    
    //  mpv 
      if (ServiceLocator.log.currentLevel != LogLevel.off) {
        _mediaKitPlayer!.stream.log.listen((log) {
          final message = log.text.toLowerCase();
          ServiceLocator.log.d('MPV log: ${log.text}', tag: 'PlayerProvider');
          
          // // 
        if (message.contains('using hardware decoding') || 
            message.contains('hwdec') ||
            message.contains('d3d11va') ||
            message.contains('nvdec') ||
            message.contains('dxva2') ||
            message.contains('qsv')) {
            ServiceLocator.log.i(': ${log.text}', tag: 'PlayerProvider');
            _updateHwdecFromLog(message);
          }
        
        // //  GPU 
        if (message.contains('gpu') || 
            message.contains('nvidia') || 
            message.contains('intel') || 
            message.contains('amd') ||
            message.contains('adapter') ||
            message.contains('device')) {
          ServiceLocator.log.i(' GPU : ${log.text}', tag: 'PlayerProvider');
        }
        
        // // 
          if (message.contains('vo/gpu') || 
              message.contains('opengl') || 
              message.contains('d3d11') ||
              message.contains('vulkan') ||
              message.contains('video output') ||
              message.contains('vo:')) {
            ServiceLocator.log.i(' ${log.text}', tag: 'PlayerProvider');
            _updateVoFromLog(message);
          }
        
        // // 
        if (message.contains('decoder') || message.contains('codec')) {
          ServiceLocator.log.d(' ${log.text}', tag: 'PlayerProvider');
        }
        
        // 
        if (log.level == MPVLogLevel.error) {
          ServiceLocator.log.e('MPV: ${log.text}', tag: 'PlayerProvider');
        } else if (log.level == MPVLogLevel.warn) {
          ServiceLocator.log.w('MPV: ${log.text}', tag: 'PlayerProvider');
        }
        });
      }
    
    _mediaKitPlayer!.stream.playing.listen((playing) {
      ServiceLocator.log.d(': playing=$playing', tag: 'PlayerProvider');
      if (playing) {
        _state = PlayerState.playing;
        // 
        // 
        Future.delayed(const Duration(seconds: 3), () {
          if (_state == PlayerState.playing && _currentChannel != null) {
            ServiceLocator.log.d('PlayerProvider: Playback stable, reset retry count');
            _retryCount = 0;
          }
        });
      } else if (_state == PlayerState.playing) {
        _state = PlayerState.paused;
      }
      notifyListeners();
    });

    _mediaKitPlayer!.stream.buffering.listen((buffering) {
      ServiceLocator.log.d(': buffering=$buffering', tag: 'PlayerProvider');
      if (buffering && _state != PlayerState.idle && _state != PlayerState.error) {
        _state = PlayerState.buffering;
      } else if (!buffering && _state == PlayerState.buffering) {
        _state = _mediaKitPlayer!.state.playing ? PlayerState.playing : PlayerState.paused;
      }
      notifyListeners();
    });

    _mediaKitPlayer!.stream.position.listen((pos) {
      _position = pos;
      notifyListeners();
    });
    
    _mediaKitPlayer!.stream.duration.listen((dur) {
      _duration = dur;
      notifyListeners();
    });
    
    _mediaKitPlayer!.stream.tracks.listen((tracks) {
      ServiceLocator.log.d('ㄩ℃: ?${tracks.video.length}, ?${tracks.audio.length}', tag: 'PlayerProvider');
      
      for (final track in tracks.video) {
        if (track.codec != null) {
          _videoCodec = track.codec!;
          ServiceLocator.log.i(': ${track.codec}', tag: 'PlayerProvider');
        }
        if (track.fps != null) {
          _fps = track.fps!;
          ServiceLocator.log.i('х: ${track.fps} fps', tag: 'PlayerProvider');
        }
        if (track.w != null && track.h != null) {
          ServiceLocator.log.i('? ${track.w}x${track.h}', tag: 'PlayerProvider');
        }
      }
      
      for (final track in tracks.audio) {
        if (track.codec != null) {
          ServiceLocator.log.i(': ${track.codec}', tag: 'PlayerProvider');
        }
      }
      
      notifyListeners();
    });
    
    _mediaKitPlayer!.stream.volume.listen((vol) {
      _volume = vol / 100;
      notifyListeners();
    });
    
    _mediaKitPlayer!.stream.error.listen((err) {
      if (err.isNotEmpty) {
        ServiceLocator.log.e(': $err', tag: 'PlayerProvider');
        
        // 
        if (err.toLowerCase().contains('decode') || err.toLowerCase().contains('decoder')) {
          ServiceLocator.log.e('>>> : $err', tag: 'PlayerProvider');
        } else if (err.toLowerCase().contains('render') || err.toLowerCase().contains('display')) {
          ServiceLocator.log.e('>>> : $err', tag: 'PlayerProvider');
        } else if (err.toLowerCase().contains('hwdec') || err.toLowerCase().contains('hardware')) {
          ServiceLocator.log.e('>>> €? $err', tag: 'PlayerProvider');
        } else if (err.toLowerCase().contains('codec')) {
          ServiceLocator.log.e('>>> : $err', tag: 'PlayerProvider');
        }
        
        if (_shouldTrySoftwareFallback(err)) {
          ServiceLocator.log.w('В', tag: 'PlayerProvider');
          _attemptSoftwareFallback();
        } else {
          _setError(err);
        }
      }
    });
    
    _mediaKitPlayer!.stream.width.listen((width) {
      if (width != null && width > 0) {
        ServiceLocator.log.d(': $width', tag: 'PlayerProvider');
      }
      notifyListeners();
    });
    
    _mediaKitPlayer!.stream.height.listen((height) {
      if (height != null && height > 0) {
        ServiceLocator.log.d(': $height', tag: 'PlayerProvider');
      }
      notifyListeners();
    });
  }

  Timer? _debugInfoTimer;
  
  void _updateDebugInfo() {
    _debugInfoTimer?.cancel();
    
    _debugInfoTimer = Timer.periodic(const Duration(seconds: 1), (_) {
      if (_mediaKitPlayer == null) return;
      
      // 
      if (ServiceLocator.log.currentLevel == LogLevel.off &&
          (_hwdecMode == 'unknown' || _hwdecMode.isEmpty)) {
        _hwdecMode = _configuredHwdec;
      }
      
      // 
      final newWidth = _mediaKitPlayer!.state.width ?? 0;
      final newHeight = _mediaKitPlayer!.state.height ?? 0;
      
      // 
      if (newWidth != _videoWidth || newHeight != _videoHeight) {
        if (newWidth > 0 && newHeight > 0) {
          ServiceLocator.log.i('?: ${newWidth}x${newHeight}', tag: 'PlayerProvider');
        } else if (_videoWidth > 0 && newWidth == 0) {
          ServiceLocator.log.w('?㈠け', tag: 'PlayerProvider');
        }
      }
      
      _videoWidth = newWidth;
      _videoHeight = newHeight;
      
      // Windows  track  fps 
      // media_kit (mpv) х
      if (_state == PlayerState.playing && _fps > 0) {
        _currentFps = _fps;
      } else {
        _currentFps = 0;
      }
      
      //  - х
      // media_kit  API
      if (_state == PlayerState.playing && _videoWidth > 0 && _videoHeight > 0) {
        final pixels = _videoWidth * _videoHeight;
        final fps = _fps > 0 ? _fps : 25.0;
        //  * х *  (H.264/H.265 ?
        // 1080p@30fps ?3-8 Mbps, 4K@30fps ?15-25 Mbps
        double compressionFactor;
        if (pixels >= 3840 * 2160) {
          compressionFactor = 0.04; // 4K
        } else if (pixels >= 1920 * 1080) {
          compressionFactor = 0.06; // 1080p
        } else if (pixels >= 1280 * 720) {
          compressionFactor = 0.08; // 720p
        } else {
          compressionFactor = 0.10; // SD
        }
        final estimatedBitrate = pixels * fps * compressionFactor; // bits per second
        _downloadSpeed = estimatedBitrate / 8.0; // bytes per second
      } else {
        _downloadSpeed = 0;
      }
      
      notifyListeners();
    });
  }

  void _updateHwdecFromLog(String lowerMessage) {
    String? detected;

    // e.g. "Using hardware decoding (d3d11va-copy)"
    final hwdecMatch =
        RegExp(r'using hardware decoding\s*\(([^)]+)\)').firstMatch(lowerMessage);
    if (hwdecMatch != null) {
      detected = hwdecMatch.group(1);
    }

    // e.g. "hwdec=auto", "hwdec: d3d11va"
    final hwdecKeyMatch =
        RegExp(r'hwdec(?:-current)?\s*[:=]\s*([\w\-]+)')
            .firstMatch(lowerMessage);
    if (detected == null && hwdecKeyMatch != null) {
      detected = hwdecKeyMatch.group(1);
    }

    if (detected == null && lowerMessage.contains('software decoding')) {
      detected = 'no';
    }

    if (detected != null && detected.isNotEmpty && detected != _hwdecMode) {
      _hwdecMode = detected;
      notifyListeners();
    }
  }

  void _updateVoFromLog(String lowerMessage) {
    String? detected;

    // e.g. "VO: [gpu] 1920x1080"
    final voMatch = RegExp(r'vo:\s*\[?([a-z0-9_\-]+)\]?').firstMatch(lowerMessage);
    if (voMatch != null) {
      detected = voMatch.group(1);
    }

    // e.g. "Using video output driver: gpu"
    final driverMatch =
        RegExp(r'video output driver:\s*([a-z0-9_\-]+)').firstMatch(lowerMessage);
    if (detected == null && driverMatch != null) {
      detected = driverMatch.group(1);
    }

    if (detected != null && detected.isNotEmpty && detected != _vo) {
      _vo = detected;
      notifyListeners();
    }
  }

  String _formatHwdecInfo() {
    final configured = _configuredHwdec.trim();
    final actual = _hwdecMode.trim();
    if (configured.isEmpty || configured == 'unknown') {
      return actual == 'unknown' ? '' : actual;
    }
    if (actual.isEmpty || actual == 'unknown' || actual == configured) {
      return configured;
    }
    return '$configured -> $actual';
  }

  String _formatVoInfo() {
    final configured = _configuredVo.trim();
    final actual = _vo.trim();
    if (configured.isEmpty || configured == 'unknown') {
      return actual == 'unknown' ? '' : actual;
    }
    if (actual.isEmpty || actual == 'unknown' || actual == configured) {
      return configured;
    }
    return '$configured -> $actual';
  }

  bool _shouldTrySoftwareFallback(String error) {
    final lowerError = error.toLowerCase();
    if (!_allowSoftwareFallback) return false;
    return (lowerError.contains('codec') ||
            lowerError.contains('decoder') ||
            lowerError.contains('hwdec') ||
            lowerError.contains('mediacodec')) &&
        _retryCount < _maxRetries;
  }

  void _attemptSoftwareFallback() {
    if (!_allowSoftwareFallback) return;
    _retryCount++;
    final channelToPlay = _currentChannel;
    _initMediaKitPlayer(useSoftwareDecoding: true);
    if (channelToPlay != null) playChannel(channelToPlay);
  }

  // ============ Public API ============

  Future<void> playChannel(Channel channel, {bool preserveCurrentSource = false}) async {
    ServiceLocator.log.i('========== ==========', tag: 'PlayerProvider');
    ServiceLocator.log.i(': ${channel.name} (ID: ${channel.id})', tag: 'PlayerProvider');
    ServiceLocator.log.d('URL: ${channel.url}', tag: 'PlayerProvider');
    ServiceLocator.log.d(' ${channel.sourceCount}', tag: 'PlayerProvider');
    final playStartTime = DateTime.now();
    
    _currentChannel = channel;
    _state = PlayerState.loading;
    _error = null;
    _lastErrorMessage = null; // 
    _errorDisplayed = false; // 
    _retryCount = 0; // 
    _retryTimer?.cancel(); // 
    _isAutoDetecting = false; // 
    _noVideoFallbackAttempted = false;
    loadVolumeSettings(); // Apply volume boost settings
    notifyListeners();

    // 
    if (channel.hasMultipleSources && !preserveCurrentSource) {
      ServiceLocator.log.i(' ${channel.sourceCount} ', tag: 'PlayerProvider');
      final detectStartTime = DateTime.now();

      final availableSourceIndex = await _findFirstAvailableSource(channel);

      final detectTime = DateTime.now().difference(detectStartTime).inMilliseconds;

      if (availableSourceIndex != null) {
        channel.currentSourceIndex = availableSourceIndex;
        ServiceLocator.log.i(' ${availableSourceIndex + 1}/${channel.sourceCount}: ${detectTime}ms', tag: 'PlayerProvider');
      } else {
        ServiceLocator.log.e(' ${channel.sourceCount} : ${detectTime}ms', tag: 'PlayerProvider');
        _setError(' ${channel.sourceCount} ');
        return;
      }
    } else if (channel.hasMultipleSources) {
      channel.currentSourceIndex =
          channel.currentSourceIndex.clamp(0, channel.sourceCount - 1);
      ServiceLocator.log.d('PlayerProvider: preserveCurrentSource=true, using source ${channel.currentSourceIndex + 1}/${channel.sourceCount}');
    }

    final playUrl = channel.currentUrl;
    ServiceLocator.log.d('URL: $playUrl', tag: 'PlayerProvider');

    try {
      final playerInitStartTime = DateTime.now();
      
      // Android TV  MethodChannel 
      //  Android  media_kit
      if (!_useNativePlayer) {
        //  302 
        ServiceLocator.log.i('>>> Start resolving redirect', tag: 'PlayerProvider');
        final redirectStartTime = DateTime.now();
        
        final realUrl = await ServiceLocator.redirectCache.resolveRealPlayUrl(playUrl);
        
        final redirectTime = DateTime.now().difference(redirectStartTime).inMilliseconds;
        ServiceLocator.log.i('>>> 302: ${redirectTime}ms', tag: 'PlayerProvider');
        ServiceLocator.log.d('>>> : $realUrl', tag: 'PlayerProvider');
        
        // 
        ServiceLocator.log.i('>>> Start initializing player', tag: 'PlayerProvider');
        final playStartTime = DateTime.now();
        
        await _mediaKitPlayer?.open(Media(realUrl));
        
        final playTime = DateTime.now().difference(playStartTime).inMilliseconds;
        ServiceLocator.log.i('>>> : ${playTime}ms', tag: 'PlayerProvider');
        
        _state = PlayerState.playing;
        notifyListeners();
        _scheduleNoVideoFallbackIfNeeded();
      }
      
      // 
      final channelId = channel.id;
      final playlistId = channel.playlistId;
      if (channelId != null) {
        await ServiceLocator.watchHistory.addWatchHistory(channelId, playlistId);
      }
      
      final playerInitTime = DateTime.now().difference(playerInitStartTime).inMilliseconds;
      final totalTime = DateTime.now().difference(playStartTime).inMilliseconds;
      ServiceLocator.log.i('>>> : ${totalTime}ms (: ${playerInitTime}ms)', tag: 'PlayerProvider');
      ServiceLocator.log.i('========== : ${totalTime}ms ==========', tag: 'PlayerProvider');
    } catch (e) {
      ServiceLocator.log.e('', tag: 'PlayerProvider', error: e);
      _setError('Failed to play channel: $e');
      return;
    }
  }

  Future<void> reinitializePlayer({required String bufferStrength}) async {
    if (_useNativePlayer) return;
    final channelToPlay = _currentChannel;
    _state = PlayerState.loading;
    notifyListeners();
    _initMediaKitPlayer(bufferStrength: bufferStrength);
    if (channelToPlay != null) {
      await playChannel(channelToPlay);
    }
  }

  /// 
  Future<int?> _findFirstAvailableSource(Channel channel) async {
    ServiceLocator.log.d('${channel.sourceCount} ', tag: 'PlayerProvider');
    final testService = ChannelTestService();
    
    for (int i = 0; i < channel.sourceCount; i++) {
      // UI
      channel.currentSourceIndex = i;
      notifyListeners();
      
      // 
      final tempChannel = Channel(
        id: channel.id,
        name: channel.name,
        url: channel.sources[i],
        groupName: channel.groupName,
        logoUrl: channel.logoUrl,
        sources: [channel.sources[i]], // 
        playlistId: channel.playlistId,
      );
      
      ServiceLocator.log.d(' ${i + 1}/${channel.sourceCount}', tag: 'PlayerProvider');
      final testStartTime = DateTime.now();
      
      final result = await testService.testChannel(tempChannel);
      final testTime = DateTime.now().difference(testStartTime).inMilliseconds;
      
      if (result.isAvailable) {
        ServiceLocator.log.i('${i + 1} : ${result.responseTime}ms: ${testTime}ms', tag: 'PlayerProvider');
        return i;
      } else {
        ServiceLocator.log.w('✗  ${i + 1} : ${result.error}: ${testTime}ms', tag: 'PlayerProvider');
      }
    }
    
    ServiceLocator.log.e('${channel.sourceCount} ', tag: 'PlayerProvider');
    return null; // 
  }

  Future<void> playUrl(String url, {String? name}) async {
    // Android TV 
    if (_useNativePlayer) {
      ServiceLocator.log.w('playUrl: Android TV ', tag: 'PlayerProvider');
      return;
    }
    
    final startTime = DateTime.now();
    _state = PlayerState.loading;
    _error = null;
    _lastErrorMessage = null; // 
    _errorDisplayed = false; // 
    _noVideoFallbackAttempted = false;
    loadVolumeSettings(); // Apply volume boost settings
    notifyListeners();

    try {
      //  302 
      ServiceLocator.log.i('>>> Start resolving redirect', tag: 'PlayerProvider');
      final redirectStartTime = DateTime.now();
      
      final realUrl = await ServiceLocator.redirectCache.resolveRealPlayUrl(url);
      
      final redirectTime = DateTime.now().difference(redirectStartTime).inMilliseconds;
      ServiceLocator.log.i('>>> 302: ${redirectTime}ms', tag: 'PlayerProvider');
        ServiceLocator.log.d('>>> : $realUrl', tag: 'PlayerProvider');
      
      // 
      ServiceLocator.log.i('>>> Start initializing player', tag: 'PlayerProvider');
      final playStartTime = DateTime.now();
      
      await _mediaKitPlayer?.open(Media(realUrl));
      
      final playTime = DateTime.now().difference(playStartTime).inMilliseconds;
      final totalTime = DateTime.now().difference(startTime).inMilliseconds;
        ServiceLocator.log.i('>>> : ${playTime}ms', tag: 'PlayerProvider');
        ServiceLocator.log.i('>>> : ${totalTime}ms', tag: 'PlayerProvider');
      
      _state = PlayerState.playing;
      _scheduleNoVideoFallbackIfNeeded();
    } catch (e) {
      final totalTime = DateTime.now().difference(startTime).inMilliseconds;
      ServiceLocator.log.e('>>>  (${totalTime}ms): $e', tag: 'PlayerProvider');
      _setError('Failed to play: $e');
      return;
    }
    notifyListeners();
  }

  void togglePlayPause() {
    if (_useNativePlayer) return; // TV 
    _mediaKitPlayer?.playOrPause();
  }

  void pause() {
    if (_useNativePlayer) return; // TV 
    _mediaKitPlayer?.pause();
  }

  void play() {
    if (_useNativePlayer) return; // TV 
    _mediaKitPlayer?.play();
  }

  Future<void> stop({bool silent = false}) async {
    // Save VOD position before stopping
    await _saveVodPositionIfNeeded();

    // 
    _retryTimer?.cancel();
    _retryTimer = null;
    _retryCount = 0;
    _error = null;
    _errorDisplayed = false;
    _lastErrorMessage = null;
    _lastErrorTime = null;
    _isAutoSwitching = false;
    _isAutoDetecting = false;
    
    if (!_useNativePlayer) {
      _mediaKitPlayer?.stop();
    }
    _state = PlayerState.idle;
    _currentChannel = null;
    
    if (!silent) {
      notifyListeners();
    }
  }

  void seek(Duration position) {
    if (_useNativePlayer) return; // TV 
    _mediaKitPlayer?.seek(position);
  }

  void seekForward(int seconds) {
    seek(_position + Duration(seconds: seconds));
  }

  // ── VOD resume / position persistence ─────────────────────────────────────

  /// Save current position to DB so the user can resume later (VOD only).
  Future<void> _saveVodPositionIfNeeded() async {
    final channel = _currentChannel;
    if (channel == null) return;
    if (channel.id == null) return;
    // Only persist position for seekable/VOD-style content
    final positionSec = _position.inSeconds;
    if (positionSec < 5) return;
    // Don't save for live streams
    if (_duration.inSeconds > 0 && _duration.inSeconds <= 86400) {
      try {
        await ServiceLocator.watchHistory
            .updatePlaybackPosition(channel.id!, channel.playlistId, positionSec);
        ServiceLocator.log.d('Saved VOD position: ${positionSec}s for ${channel.name}', tag: 'PlayerProvider');
      } catch (e) {
        ServiceLocator.log.w('Failed to save VOD position: $e', tag: 'PlayerProvider');
      }
    }
  }

  /// Seek to the resume position stored in the channel model (called by UI after playback starts).
  void resumeFromSavedPosition(int positionSeconds) {
    if (positionSeconds > 5) {
      seek(Duration(seconds: positionSeconds));
      ServiceLocator.log.i('Resuming from position: ${positionSeconds}s', tag: 'PlayerProvider');
    }
  }

  // ── Quality / Video Track selection ───────────────────────────────────────

  /// Available video tracks (for HLS quality selection).
  List<VideoTrack> get availableVideoTracks {
    if (_useNativePlayer || _mediaKitPlayer == null) return [];
    return _mediaKitPlayer!.state.tracks.video;
  }

  /// Set a specific video track for quality selection.
  void setVideoTrack(VideoTrack track) {
    if (_useNativePlayer || _mediaKitPlayer == null) return;
    _mediaKitPlayer!.setVideoTrack(track);
    ServiceLocator.log.i('Video track set: ${track.title ?? track.id}', tag: 'PlayerProvider');
  }

  void seekBackward(int seconds) {
    final newPos = _position - Duration(seconds: seconds);
    seek(newPos.isNegative ? Duration.zero : newPos);
  }

  void setVolume(double volume) {
    _volume = volume.clamp(0.0, 1.0);
    _applyVolume();
    if (_volume > 0) _isMuted = false;
    notifyListeners();
  }

  double _volumeBeforeMute = 1.0; // 

  void toggleMute() {
    if (!_isMuted) {
      // 
      _volumeBeforeMute = _volume > 0 ? _volume : 1.0;
    }
    _isMuted = !_isMuted;
    if (!_isMuted && _volume == 0) {
      // 0
      _volume = _volumeBeforeMute;
    }
    _applyVolume();
    notifyListeners();
  }

  /// Apply volume boost from settings (in dB)
  void setVolumeBoost(int db) {
    _volumeBoostDb = db.clamp(-20, 20);
    _applyVolume();
    notifyListeners();
  }

  /// Load volume settings from preferences
  void loadVolumeSettings() {
    final prefs = ServiceLocator.prefs;
    // 
    _volumeBoostDb = prefs.getInt('volume_boost') ?? 0;
    _applyVolume();
  }

  /// Calculate and apply the effective volume with boost
  void _applyVolume() {
    if (_useNativePlayer) return; // TV 
    
    if (_isMuted) {
      _mediaKitPlayer?.setVolume(0);
      return;
    }

    // Convert dB to linear multiplier: multiplier = 10^(dB/20)
    final multiplier = math.pow(10, _volumeBoostDb / 20.0);
    final effectiveVolume = (_volume * multiplier).clamp(0.0, 2.0); // Allow up to 2x volume

    // media_kit uses 0-100 scale, but can go higher for boost
    _mediaKitPlayer?.setVolume(effectiveVolume * 100);
  }

  void setPlaybackSpeed(double speed) {
    if (_useNativePlayer) return; // TV 
    _playbackSpeed = speed;
    _mediaKitPlayer?.setRate(speed);
    notifyListeners();
  }

  void toggleFullscreen() {
    _isFullscreen = !_isFullscreen;
    notifyListeners();
  }

  void setFullscreen(bool fullscreen) {
    _isFullscreen = fullscreen;
    notifyListeners();
  }

  void setControlsVisible(bool visible) {
    _controlsVisible = visible;
    notifyListeners();
  }

  void toggleControls() {
    _controlsVisible = !_controlsVisible;
    notifyListeners();
  }

  void playNext(List<Channel> channels) {
    if (_currentChannel == null || channels.isEmpty) return;
    final idx = channels.indexWhere((c) => c.id == _currentChannel!.id);
    if (idx == -1 || idx >= channels.length - 1) return;
    playChannel(channels[idx + 1]);
  }

  void playPrevious(List<Channel> channels) {
    if (_currentChannel == null || channels.isEmpty) return;
    final idx = channels.indexWhere((c) => c.id == _currentChannel!.id);
    if (idx <= 0) return;
    playChannel(channels[idx - 1]);
  }

  /// Switch to next source for current channel (if has multiple sources)
  void switchToNextSource() {
    if (_currentChannel == null || !_currentChannel!.hasMultipleSources) return;
    
    // 
    _isAutoDetecting = false;
    _retryTimer?.cancel();
    
    final newIndex = (_currentChannel!.currentSourceIndex + 1) % _currentChannel!.sourceCount;
    _currentChannel!.currentSourceIndex = newIndex;
    
    ServiceLocator.log.d('PlayerProvider:  ${newIndex + 1}/${_currentChannel!.sourceCount}');
    
    // 
    if (!_isAutoSwitching) {
      _retryCount = 0;
      ServiceLocator.log.d('PlayerProvider: Manual source switch, reset retry state');
    }
    
    // Play the new source
    _playCurrentSource();
  }

  /// Switch to previous source for current channel (if has multiple sources)
  void switchToPreviousSource() {
    if (_currentChannel == null || !_currentChannel!.hasMultipleSources) return;
    
    // 
    _isAutoDetecting = false;
    _retryTimer?.cancel();
    
    final newIndex = (_currentChannel!.currentSourceIndex - 1 + _currentChannel!.sourceCount) % _currentChannel!.sourceCount;
    _currentChannel!.currentSourceIndex = newIndex;
    
    ServiceLocator.log.d('PlayerProvider:  ${newIndex + 1}/${_currentChannel!.sourceCount}');
    
    // 
    if (!_isAutoSwitching) {
      _retryCount = 0;
      ServiceLocator.log.d('PlayerProvider: Manual source switch, reset retry state');
    }
    
    // Play the new source
    _playCurrentSource();
  }

  /// Play the current source of the current channel
  Future<void> _playCurrentSource() async {
    if (_currentChannel == null) return;
    
    // 
    ServiceLocator.log.d('', tag: 'PlayerProvider');
    ServiceLocator.log.d(': ${_currentChannel!.name},  ${_currentChannel!.currentSourceIndex}/${_currentChannel!.sourceCount}', tag: 'PlayerProvider');
    
    // 
    final testService = ChannelTestService();
    final tempChannel = Channel(
      id: _currentChannel!.id,
      name: _currentChannel!.name,
      url: _currentChannel!.currentUrl,
      groupName: _currentChannel!.groupName,
      logoUrl: _currentChannel!.logoUrl,
      sources: [_currentChannel!.currentUrl],
      playlistId: _currentChannel!.playlistId,
    );
    
    ServiceLocator.log.i(': ${_currentChannel!.currentUrl}', tag: 'PlayerProvider');
    
    final result = await testService.testChannel(tempChannel);
    
    if (!result.isAvailable) {
      ServiceLocator.log.w(': ${result.error}', tag: 'PlayerProvider');
      _setError(': ${result.error}');
      return;
    }
    
    ServiceLocator.log.i(': ${result.responseTime}ms', tag: 'PlayerProvider');
    
    final url = _currentChannel!.currentUrl;
    final startTime = DateTime.now();
    
    _state = PlayerState.loading;
    _error = null;
    _lastErrorMessage = null;
    _errorDisplayed = false;
    _noVideoFallbackAttempted = false;
    notifyListeners();

    try {
      if (!_useNativePlayer) {
        //  302 
        ServiceLocator.log.i('>>> Source switch: start resolving redirect', tag: 'PlayerProvider');
        final redirectStartTime = DateTime.now();
        
        final realUrl = await ServiceLocator.redirectCache.resolveRealPlayUrl(url);
        
        final redirectTime = DateTime.now().difference(redirectStartTime).inMilliseconds;
        ServiceLocator.log.i('>>> : 302: ${redirectTime}ms', tag: 'PlayerProvider');
        ServiceLocator.log.d('>>> : : $realUrl', tag: 'PlayerProvider');
        
        final playStartTime = DateTime.now();
        await _mediaKitPlayer?.open(Media(realUrl));
        
        final playTime = DateTime.now().difference(playStartTime).inMilliseconds;
        final totalTime = DateTime.now().difference(startTime).inMilliseconds;
        ServiceLocator.log.i('>>> : : ${playTime}ms', tag: 'PlayerProvider');
        ServiceLocator.log.i('>>> : €: ${totalTime}ms', tag: 'PlayerProvider');
        
        _state = PlayerState.playing;
        _scheduleNoVideoFallbackIfNeeded();
      }
      ServiceLocator.log.i('', tag: 'PlayerProvider');
    } catch (e) {
      final totalTime = DateTime.now().difference(startTime).inMilliseconds;
      ServiceLocator.log.e(' (${totalTime}ms)', tag: 'PlayerProvider', error: e);
      _setError('Failed to play source: $e');
      return;
    }
    notifyListeners();
  }

  /// Get current source index (1-based for display)
  int get currentSourceIndex => (_currentChannel?.currentSourceIndex ?? 0) + 1;

  /// Get total source count
  int get sourceCount => _currentChannel?.sourceCount ?? 1;

  /// Set current channel without starting playback (for native player coordination)
  void setCurrentChannelOnly(Channel channel) {
    _currentChannel = channel;
    notifyListeners();
  }

  @override
  void dispose() {
    _isDisposed = true;
    _debugInfoTimer?.cancel();
    _retryTimer?.cancel();
    _mediaKitPlayer?.dispose();
    super.dispose();
  }

  void _scheduleNoVideoFallbackIfNeeded() {
    if (_useNativePlayer) return;
    if (!Platform.isWindows) return;
    if (_isSoftwareDecoding) return;
    if (!_allowSoftwareFallback) return;
    if (_noVideoFallbackAttempted) return;

    _noVideoFallbackAttempted = true;
    Future.delayed(const Duration(seconds: 3), () {
      if (_isDisposed) return;
      // 0
      if (_state == PlayerState.playing && _videoWidth == 0 && _videoHeight == 0) {
        ServiceLocator.log.w('PlayerProvider: В€€', tag: 'PlayerProvider');
        _attemptSoftwareFallback();
      }
    });
  }
}


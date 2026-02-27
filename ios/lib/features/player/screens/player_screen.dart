import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:provider/provider.dart';
import 'package:media_kit_video/media_kit_video.dart';
import 'package:screen_brightness/screen_brightness.dart';
import 'package:wakelock_plus/wakelock_plus.dart';
import 'package:window_manager/window_manager.dart';
import 'package:cached_network_image/cached_network_image.dart';
import 'dart:async';

import '../../../core/i18n/app_strings.dart';
import '../../../core/theme/app_theme.dart';
import '../../../core/widgets/tv_focusable.dart';
import '../../../core/platform/platform_detector.dart';
import '../../../core/platform/native_player_channel.dart';
import '../../../core/platform/windows_pip_channel.dart';
import '../../../core/platform/windows_fullscreen_native.dart';
import '../../../core/platform/macos_fullscreen_channel.dart';
import '../../../core/models/channel.dart';
import '../providers/player_provider.dart';
import '../../favorites/providers/favorites_provider.dart';
import '../../channels/providers/channel_provider.dart';
import '../../settings/providers/settings_provider.dart';
import '../../settings/providers/dlna_provider.dart';
import '../../epg/providers/epg_provider.dart';
import '../../multi_screen/providers/multi_screen_provider.dart';
import '../../multi_screen/widgets/multi_screen_player.dart';
import '../../../core/services/service_locator.dart';
import '../../../core/services/chromecast_service.dart';

class PlayerScreen extends StatefulWidget {
  final String channelUrl;
  final String channelName;
  final String? channelLogo;
  final bool isMultiScreen; //

  const PlayerScreen({
    super.key,
    required this.channelUrl,
    required this.channelName,
    this.channelLogo,
    this.isMultiScreen = false,
  });

  @override
  State<PlayerScreen> createState() => _PlayerScreenState();
}

class _PlayerScreenState extends State<PlayerScreen>
    with WidgetsBindingObserver {
  Timer? _hideControlsTimer;
  Timer? _dlnaSyncTimer; // DLNA Android TV
  Timer? _wakelockTimer; // wakelock
  bool _showControls = true;
  final FocusNode _playerFocusNode = FocusNode();
  bool _usingNativePlayer = false;
  bool _showCategoryPanel = false;
  String? _selectedCategory;
  final ScrollController _categoryScrollController = ScrollController();
  final ScrollController _channelScrollController = ScrollController();

  //  provider  dispose
  PlayerProvider? _playerProvider;
  MultiScreenProvider? _multiScreenProvider;
  SettingsProvider? _settingsProvider;

  //
  bool _localMultiScreenMode = false;

  //  dispose
  bool _wasMultiScreenMode = false;

  // Resume position (seconds) to seek to after playback starts
  int _pendingResumeSeconds = 0;
  bool _resumeSnackbarShown = false;

  //
  bool _multiScreenStateSaved = false;

  //
  double _gestureStartY = 0;
  double _initialVolume = 0;
  double _initialBrightness = 0;
  bool _showGestureIndicator = false;
  double _gestureValue = 0;

  //  loading
  bool _isLoading = true;

  //
  bool _errorShown = false;
  Timer? _errorHideTimer; //

  // Windows
  bool _isFullScreen = false;
  DateTime? _lastFullScreenToggle; //
  bool _mouseOver = false;

  //
  bool _isMultiScreenMode() {
    return _localMultiScreenMode && PlatformDetector.isDesktop;
  }

  Future<void> _handleChromecastAction(PlayerProvider provider) async {
    final channel = provider.currentChannel;
    if (channel == null) {
      ScaffoldMessenger.of(context).showSnackBar(
        const SnackBar(content: Text('No hay canal activo para enviar')),
      );
      return;
    }

    final castService = ChromecastService.instance;
    final supported = await castService.isSupported();
    if (!supported) {
      ScaffoldMessenger.of(context).showSnackBar(
        const SnackBar(
            content: Text('Chromecast no disponible en este dispositivo')),
      );
      return;
    }

    final connected = await castService.isConnected();
    final success = connected
        ? await castService.castChannel(channel)
        : await castService.connectAndCast(channel);

    if (!mounted) return;
    ScaffoldMessenger.of(context).showSnackBar(
      SnackBar(
        content: Text(
          success
              ? 'Enviado a Chromecast: ${channel.name}'
              : 'No se pudo conectar o enviar a Chromecast',
        ),
      ),
    );
  }

  @override
  void initState() {
    super.initState();
    WidgetsBinding.instance.addObserver(this);
    //
    _enableWakelock();
    //  didChangeDependencies
    //  _localMultiScreenMode

    // On mobile (iOS/Android phone), force landscape + immersive for the player
    if (PlatformDetector.isMobile) {
      SystemChrome.setPreferredOrientations([
        DeviceOrientation.landscapeLeft,
        DeviceOrientation.landscapeRight,
      ]);
      SystemChrome.setEnabledSystemUIMode(SystemUiMode.immersiveSticky);
    }
  }

  Future<void> _enableWakelock() async {
    //
    if (PlatformDetector.isMobile) {
      try {
        await PlatformDetector.setKeepScreenOn(true);
      } catch (e) {
        ServiceLocator.log.d('PlayerScreen: Failed to set keep screen on: $e');
      }
    } else {
      // wakelock_plus
      try {
        //  Flutter
        await Future.delayed(const Duration(milliseconds: 100));
        await WakelockPlus.enable();
        final enabled = await WakelockPlus.enabled;
        ServiceLocator.log.d('PlayerScreen: WakelockPlus enabled: $enabled');
      } catch (e) {
        ServiceLocator.log.d('PlayerScreen: Failed to enable wakelock: $e');
      }
    }
  }

  @override
  void didChangeDependencies() {
    super.didChangeDependencies();
    //  provider
    if (_playerProvider == null) {
      _playerProvider = context.read<PlayerProvider>();
      _playerProvider!.addListener(_onProviderUpdate);
      _isLoading = _playerProvider!.isLoading;

      //  settings  multi-screen provider  dispose
      _settingsProvider = context.read<SettingsProvider>();
      _multiScreenProvider = context.read<MultiScreenProvider>();

      //  DLNA
      bool isDlnaMode = false;
      try {
        final dlnaProvider = context.read<DlnaProvider>();
        isDlnaMode = dlnaProvider.isActiveSession;
      } catch (_) {}

      //
      //  isMultiScreen=true
      // DLNA
      _localMultiScreenMode = !isDlnaMode &&
          (widget.isMultiScreen || _settingsProvider!.enableMultiScreen) &&
          PlatformDetector.isDesktop;

      // provider
      //
      if (_localMultiScreenMode && !_multiScreenProvider!.hasAnyChannel) {
        _multiScreenProvider!.setVolumeSettings(
            _playerProvider!.volume, _settingsProvider!.volumeBoost);
      }

      //
      _checkAndLaunchPlayer();
    }
    //
    _wasMultiScreenMode = _isMultiScreenMode();
  }

  void _onProviderUpdate() {
    if (!mounted) return;
    final provider = _playerProvider;
    if (provider == null) return;

    final newLoading = provider.isLoading;
    if (_isLoading != newLoading) {
      setState(() {
        _isLoading = newLoading;
      });
    }

    //
    if (provider.hasError && !_errorShown) {
      _checkAndShowError();
    }

    // Resume from saved position once playing starts
    if (_pendingResumeSeconds > 0 &&
        provider.state == PlayerState.playing &&
        !_resumeSnackbarShown) {
      final sec = _pendingResumeSeconds;
      _resumeSnackbarShown = true;
      Future.delayed(const Duration(seconds: 2), () {
        if (!mounted) return;
        provider.resumeFromSavedPosition(sec);
        try {
          ScaffoldMessenger.of(context).showSnackBar(
            SnackBar(
              content: Text(
                  'Reanudando desde ${_formatDuration(Duration(seconds: sec))}'),
              duration: const Duration(seconds: 5),
              action: SnackBarAction(
                label: 'Desde el inicio',
                onPressed: () => provider.seek(Duration.zero),
              ),
            ),
          );
        } catch (_) {}
      });
    }

    //  DLNA
    try {
      final dlnaProvider = context.read<DlnaProvider>();
      if (dlnaProvider.isActiveSession) {
        dlnaProvider.syncPlayerState(
          isPlaying: provider.isPlaying,
          isPaused: provider.state == PlayerState.paused,
          position: provider.position,
          duration: provider.duration,
        );
      }
    } catch (e) {
      // DLNA provider
    }
  }

  @override
  void didChangeAppLifecycleState(AppLifecycleState state) {
    super.didChangeAppLifecycleState(state);
    ServiceLocator.log.d('PlayerScreen: AppLifecycleState changed to $state');
  }

  Future<void> _checkAndLaunchPlayer() async {
    // PlayerProviderMultiScreenProvider
    if (_isMultiScreenMode()) {
      // UIPlayerProvider
      SystemChrome.setEnabledSystemUIMode(SystemUiMode.immersiveSticky);
      return;
    }

    // Check if we should use native player on Android TV
    if (PlatformDetector.isTV && PlatformDetector.isAndroid) {
      final nativeAvailable = await NativePlayerChannel.isAvailable();
      ServiceLocator.log
          .d('PlayerScreen: Native player available: $nativeAvailable');
      if (nativeAvailable && mounted) {
        _usingNativePlayer = true;

        //  DLNA
        bool isDlnaMode = false;
        try {
          final dlnaProvider = context.read<DlnaProvider>();
          isDlnaMode = dlnaProvider.isActiveSession;
          ServiceLocator.log
              .d('PlayerScreen: DLNA isActiveSession=$isDlnaMode');
        } catch (e) {
          ServiceLocator.log.d('PlayerScreen: Failed to get DlnaProvider: $e');
        }

        //
        final channelProvider = context.read<ChannelProvider>();
        //
        final channels = channelProvider.allChannels;

        //  providers
        final favoritesProvider = context.read<FavoritesProvider>();
        final settingsProvider = context.read<SettingsProvider>();
        NativePlayerChannel.setProviders(
            favoritesProvider, channelProvider, settingsProvider);

        // DLNA  URL
        List<String> urls;
        List<String> names;
        List<String> groups;
        List<List<String>> sources;
        List<String> logos;
        List<String> epgIds;
        List<bool> isSeekableList;
        int currentIndex = 0;

        if (isDlnaMode) {
          // DLNA URL
          urls = [widget.channelUrl];
          names = [widget.channelName];
          groups = ['DLNA'];
          sources = [
            [widget.channelUrl]
          ];
          logos = [''];
          epgIds = [''];
          isSeekableList = [true]; // DLNA
          currentIndex = 0;
        } else {
          //
          // Find current channel index
          for (int i = 0; i < channels.length; i++) {
            if (channels[i].url == widget.channelUrl) {
              currentIndex = i;
              break;
            }
          }
          urls = channels.map((c) => c.url).toList();
          names = channels.map((c) => c.name).toList();
          groups = channels.map((c) => c.groupName ?? '').toList();
          sources = channels.map((c) => c.sources).toList();
          logos = channels.map((c) => c.logoUrl ?? '').toList();
          epgIds = channels.map((c) => c.epgId ?? '').toList();
          isSeekableList = channels.map((c) => c.isSeekable).toList();
        }

        ServiceLocator.log.d(
            'PlayerScreen: Launching native player for ${widget.channelName} (isDlna=$isDlnaMode, index $currentIndex of ${urls.length})');

        // TV
        if (!isDlnaMode &&
            currentIndex >= 0 &&
            currentIndex < channels.length) {
          final channel = channels[currentIndex];
          if (channel.id != null) {
            await ServiceLocator.watchHistory
                .addWatchHistory(channel.id!, channel.playlistId);
            ServiceLocator.log.d(
                'PlayerScreen: Recorded watch history for channel ${channel.name}');
          }
        }

        //
        final bufferStrength = settingsProvider.bufferStrength;
        final showFps = settingsProvider.showFps;
        final showClock = settingsProvider.showClock;
        final showNetworkSpeed = settingsProvider.showNetworkSpeed;
        final showVideoInfo = settingsProvider.showVideoInfo;

        // Launch native player with channel list and callback for when it closes
        final launched = await NativePlayerChannel.launchPlayer(
          url: widget.channelUrl,
          name: widget.channelName,
          index: currentIndex,
          urls: urls,
          names: names,
          groups: groups,
          sources: sources,
          logos: logos,
          epgIds: epgIds,
          isSeekable: isSeekableList,
          isDlnaMode: isDlnaMode,
          bufferStrength: bufferStrength,
          showFps: showFps,
          showClock: showClock,
          showNetworkSpeed: showNetworkSpeed,
          showVideoInfo: showVideoInfo,
          progressBarMode: settingsProvider.progressBarMode, // €︽
          showChannelName: settingsProvider.showMultiScreenChannelName, //
          onClosed: () {
            ServiceLocator.log.d('PlayerScreen: Native player closed callback');
            //  DLNA
            _dlnaSyncTimer?.cancel();
            _dlnaSyncTimer = null;

            //  DLNA  DLNA
            try {
              final dlnaProvider = context.read<DlnaProvider>();
              if (dlnaProvider.isActiveSession) {
                dlnaProvider.notifyPlaybackStopped();
              }
            } catch (e) {
              //
            }

            if (mounted) {
              //
              Navigator.of(context).maybePop();
            }
          },
        );

        if (launched && mounted) {
          // Don't pop - wait for native player to close via callback
          // The native player is now a Fragment overlay, not a separate Activity

          //  DLNA
          _startDlnaSyncForNativePlayer();
          return;
        } else if (!launched && mounted) {
          // Native player failed to launch, fall back to Flutter player
          _usingNativePlayer = false;
          _initFlutterPlayer();
        }
        return;
      }
    }

    // Fallback to Flutter player
    if (mounted) {
      _usingNativePlayer = false;
      _initFlutterPlayer();
    }
  }

  void _initFlutterPlayer() {
    _startPlayback();
    _startHideControlsTimer();

    // Hide system UI for immersive experience
    SystemChrome.setEnabledSystemUIMode(SystemUiMode.immersiveSticky);

    //  wakelock wakelock
    if (PlatformDetector.isMobile) {
      _wakelockTimer?.cancel();
      _wakelockTimer = Timer.periodic(const Duration(seconds: 30), (_) async {
        if (mounted) {
          await _enableWakelock();
        }
      });
    }

    //
  }

  ///  Android TV  DLNA
  void _startDlnaSyncForNativePlayer() {
    try {
      final dlnaProvider = context.read<DlnaProvider>();
      //  isActiveSession TV  DLNA
      //  isActiveSession
      //  DLNA
      if (!dlnaProvider.isRunning) {
        ServiceLocator.log
            .d('PlayerScreen: DLNA service not running, skip sync timer');
        return;
      }

      ServiceLocator.log
          .d('PlayerScreen: Starting DLNA sync timer for native player');

      //
      _dlnaSyncTimer?.cancel();
      _dlnaSyncTimer = Timer.periodic(const Duration(seconds: 1), (_) async {
        if (!mounted) {
          _dlnaSyncTimer?.cancel();
          return;
        }

        try {
          final state = await NativePlayerChannel.getPlaybackState();
          ServiceLocator.log.d('PlayerScreen: DLNA sync - state=$state');
          if (state != null) {
            final isPlaying = state['isPlaying'] as bool? ?? false;
            final position =
                Duration(milliseconds: (state['position'] as int?) ?? 0);
            final duration =
                Duration(milliseconds: (state['duration'] as int?) ?? 0);
            final stateStr = state['state'] as String? ?? 'unknown';

            dlnaProvider.syncPlayerState(
              isPlaying: isPlaying,
              isPaused: stateStr == 'paused',
              position: position,
              duration: duration,
            );
          }
        } catch (e) {
          ServiceLocator.log.d('PlayerScreen: DLNA sync error - $e');
        }
      });
    } catch (e) {
      ServiceLocator.log.d('PlayerScreen: Failed to start DLNA sync - $e');
    }
  }

  // Strip CJK characters from error messages so no Chinese text leaks into the UI
  String _sanitizeError(String raw) {
    final hasCjk = raw.runes.any((r) =>
        (r >= 0x4E00 && r <= 0x9FFF) ||
        (r >= 0x3400 && r <= 0x4DBF) ||
        (r >= 0x3000 && r <= 0x303F) ||
        (r >= 0xFF00 && r <= 0xFFEF));
    if (hasCjk) {
      final strings = AppStrings.of(context);
      return strings?.playbackError ?? 'Playback failed';
    }
    return raw;
  }

  void _checkAndShowError() {
    if (!mounted || _errorShown) return;

    final provider = context.read<PlayerProvider>();
    if (provider.hasError && provider.error != null) {
      final errorMessage = _sanitizeError(provider.error!);
      _errorShown = true;
      provider.clearError();

      //
      _errorHideTimer?.cancel();

      //  SnackBar
      try {
        ScaffoldMessenger.of(context).clearSnackBars();
      } catch (e) {
        ServiceLocator.log.d('PlayerScreen: Error clearing SnackBars: $e');
        return;
      }

      final scaffoldMessenger = ScaffoldMessenger.of(context);

      final snackBar = SnackBar(
        content: Text(
            '${AppStrings.of(context)?.playbackError ?? "Error"}: $errorMessage'),
        backgroundColor: AppTheme.errorColor,
        duration: const Duration(days: 365), //
        behavior: SnackBarBehavior.floating,
        action: SnackBarAction(
          label: AppStrings.of(context)?.retry ?? 'Retry',
          textColor: Colors.white,
          onPressed: () {
            _errorHideTimer?.cancel();
            _errorShown = false;
            scaffoldMessenger.hideCurrentSnackBar();
            _startPlayback();
          },
        ),
      );

      scaffoldMessenger.showSnackBar(snackBar);

      // 3
      _errorHideTimer = Timer(const Duration(seconds: 3), () {
        if (mounted) {
          try {
            scaffoldMessenger.hideCurrentSnackBar();
          } catch (e) {
            ServiceLocator.log.d('PlayerScreen: Error hiding SnackBar: $e');
          }
          _errorShown = false;
        }
      });
    }
  }

  void _startPlayback() {
    _errorShown = false; //
    _errorHideTimer?.cancel(); //
    //
    if (mounted) {
      ScaffoldMessenger.of(context).hideCurrentSnackBar();
    }

    final playerProvider = context.read<PlayerProvider>();
    final channelProvider = context.read<ChannelProvider>();
    final settingsProvider = context.read<SettingsProvider>();

    try {
      // ✅
      final channel = channelProvider.allChannels.firstWhere(
        (c) => c.url == widget.channelUrl,
      );

      //  ID
      if (settingsProvider.rememberLastChannel && channel.id != null) {
        settingsProvider.setLastChannelId(channel.id);
      }

      // Parental control gate
      if (settingsProvider.parentalControl && _isAdultContent(channel)) {
        _checkParentalGate(
          settingsProvider,
          onUnlocked: () {
            playerProvider.playChannel(channel);
            _loadResumePosition(channel);
          },
        );
        return;
      }

      playerProvider.playChannel(channel);
      _loadResumePosition(channel);
    } catch (_) {
      // Fallback if channel object not found
      playerProvider.playUrl(widget.channelUrl, name: widget.channelName);
    }
  }

  // ── Parental Control helpers ───────────────────────────────────────

  bool _isAdultContent(Channel channel) {
    final group = (channel.groupName ?? '').toLowerCase();
    final name = channel.name.toLowerCase();
    const adultKeywords = [
      'adult',
      'xxx',
      'porno',
      'porn',
      '18+',
      'x18',
      'explicit',
      'adults only',
      'erotic',
      'erotica',
      'red light',
      'playboy',
    ];
    return adultKeywords.any((k) => group.contains(k) || name.contains(k));
  }

  void _checkParentalGate(SettingsProvider settings,
      {required VoidCallback onUnlocked}) {
    final pinController = TextEditingController();
    showDialog<void>(
      context: context,
      barrierDismissible: false,
      builder: (ctx) {
        return AlertDialog(
          backgroundColor: AppTheme.getSurfaceColor(context),
          title: Row(
            children: [
              Icon(Icons.lock_rounded,
                  color: AppTheme.getPrimaryColor(context)),
              const SizedBox(width: 8),
              Text('Control parental',
                  style: TextStyle(color: AppTheme.getTextPrimary(context))),
            ],
          ),
          content: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              Text(
                'Introduce el PIN para acceder a este contenido',
                style: TextStyle(
                    color: AppTheme.getTextSecondary(context), fontSize: 13),
              ),
              const SizedBox(height: 16),
              TextField(
                controller: pinController,
                keyboardType: TextInputType.number,
                maxLength: 4,
                obscureText: true,
                autofocus: true,
                style: TextStyle(color: AppTheme.getTextPrimary(context)),
                decoration: InputDecoration(
                  hintText: 'PIN de 4 dígitos',
                  hintStyle: TextStyle(color: AppTheme.getTextMuted(context)),
                ),
              ),
            ],
          ),
          actions: [
            TextButton(
              onPressed: () {
                Navigator.pop(ctx);
                if (mounted) Navigator.pop(context); // back to channel list
              },
              child: const Text('Cancelar'),
            ),
            ElevatedButton(
              onPressed: () {
                if (settings.validateParentalPin(pinController.text)) {
                  Navigator.pop(ctx);
                  onUnlocked();
                } else {
                  ScaffoldMessenger.of(context).showSnackBar(
                    const SnackBar(content: Text('PIN incorrecto')),
                  );
                }
              },
              child: const Text('Aceptar'),
            ),
          ],
        );
      },
    );
  }

  // ── VOD Resume position helpers ───────────────────────────────────

  void _loadResumePosition(Channel channel) {
    if (channel.id == null) return;
    _resumeSnackbarShown = false;
    ServiceLocator.watchHistory
        .getPlaybackPosition(channel.id!, channel.playlistId)
        .then((pos) {
      if (pos > 10 && mounted) {
        setState(() => _pendingResumeSeconds = pos);
      }
    });
  }

  // ── Quality / Video Track dialog ───────────────────────────────────────

  void _showQualityDialog(PlayerProvider provider) {
    final tracks = provider.availableVideoTracks;
    if (tracks.isEmpty) {
      ScaffoldMessenger.of(context).showSnackBar(
        const SnackBar(
            content:
                Text('No hay pistas de calidad disponibles para este stream')),
      );
      return;
    }
    showModalBottomSheet<void>(
      context: context,
      backgroundColor: AppTheme.getSurfaceColor(context),
      shape: const RoundedRectangleBorder(
        borderRadius: BorderRadius.vertical(top: Radius.circular(16)),
      ),
      builder: (ctx) {
        return Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            Padding(
              padding: const EdgeInsets.all(16),
              child: Text(
                'Calidad de vídeo',
                style: TextStyle(
                  color: AppTheme.getTextPrimary(context),
                  fontSize: 16,
                  fontWeight: FontWeight.bold,
                ),
              ),
            ),
            const Divider(height: 1),
            ...tracks.map((track) {
              final label = track.title?.isNotEmpty == true
                  ? track.title!
                  : (track.id.isEmpty || track.id == 'auto'
                      ? 'Auto'
                      : 'Pista ${tracks.indexOf(track) + 1}');
              return ListTile(
                title: Text(
                  label,
                  style: TextStyle(color: AppTheme.getTextPrimary(context)),
                ),
                leading: Icon(
                  Icons.hd_rounded,
                  color: AppTheme.getPrimaryColor(context),
                ),
                onTap: () {
                  provider.setVideoTrack(track);
                  Navigator.pop(ctx);
                  ScaffoldMessenger.of(context).showSnackBar(
                    SnackBar(content: Text('Calidad cambiada: $label')),
                  );
                },
              );
            }),
            const SizedBox(height: 16),
          ],
        );
      },
    );
  }

  void _showAudioTrackDialog(PlayerProvider provider) {
    final tracks = provider.availableAudioTracks;
    if (tracks.isEmpty) {
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(
            content: Text(AppStrings.of(context)?.noAudioTracks ??
                'No hay pistas de audio disponibles')),
      );
      return;
    }
    showModalBottomSheet<void>(
      context: context,
      backgroundColor: AppTheme.getSurfaceColor(context),
      shape: const RoundedRectangleBorder(
        borderRadius: BorderRadius.vertical(top: Radius.circular(16)),
      ),
      builder: (ctx) {
        return Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            Padding(
              padding: const EdgeInsets.all(16),
              child: Text(
                AppStrings.of(context)?.audioTracks ?? 'Pistas de audio',
                style: TextStyle(
                  color: AppTheme.getTextPrimary(context),
                  fontSize: 16,
                  fontWeight: FontWeight.bold,
                ),
              ),
            ),
            const Divider(height: 1),
            ...tracks.map((track) {
              final label = track.title?.isNotEmpty == true
                  ? track.title!
                  : (track.language?.isNotEmpty == true
                      ? track.language!
                      : 'Pista ${tracks.indexOf(track) + 1}');
              return ListTile(
                title: Text(
                  label,
                  style: TextStyle(color: AppTheme.getTextPrimary(context)),
                ),
                leading: Icon(
                  Icons.audiotrack_rounded,
                  color: AppTheme.getPrimaryColor(context),
                ),
                onTap: () {
                  provider.setAudioTrack(track);
                  Navigator.pop(ctx);
                  ScaffoldMessenger.of(context).showSnackBar(
                    SnackBar(content: Text('Audio: $label')),
                  );
                },
              );
            }),
            const SizedBox(height: 16),
          ],
        );
      },
    );
  }

  void _showSubtitleTrackDialog(PlayerProvider provider) {
    final tracks = provider.availableSubtitleTracks;
    if (tracks.isEmpty) {
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(
            content: Text(AppStrings.of(context)?.noSubtitleTracks ??
                'No hay subtítulos disponibles')),
      );
      return;
    }
    showModalBottomSheet<void>(
      context: context,
      backgroundColor: AppTheme.getSurfaceColor(context),
      shape: const RoundedRectangleBorder(
        borderRadius: BorderRadius.vertical(top: Radius.circular(16)),
      ),
      builder: (ctx) {
        return Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            Padding(
              padding: const EdgeInsets.all(16),
              child: Text(
                AppStrings.of(context)?.subtitles ?? 'Subtítulos',
                style: TextStyle(
                  color: AppTheme.getTextPrimary(context),
                  fontSize: 16,
                  fontWeight: FontWeight.bold,
                ),
              ),
            ),
            const Divider(height: 1),
            // Option to disable subtitles
            ListTile(
              title: Text(
                AppStrings.of(context)?.disableSubtitles ??
                    'Desactivar subtítulos',
                style: TextStyle(color: AppTheme.getTextPrimary(context)),
              ),
              leading: Icon(
                Icons.subtitles_off_rounded,
                color: AppTheme.getTextMuted(context),
              ),
              onTap: () {
                provider.disableSubtitles();
                Navigator.pop(ctx);
                ScaffoldMessenger.of(context).showSnackBar(
                  SnackBar(
                      content: Text(AppStrings.of(context)?.subtitlesDisabled ??
                          'Subtítulos desactivados')),
                );
              },
            ),
            ...tracks.map((track) {
              final label = track.title?.isNotEmpty == true
                  ? track.title!
                  : (track.language?.isNotEmpty == true
                      ? track.language!
                      : 'Subtítulo ${tracks.indexOf(track) + 1}');
              return ListTile(
                title: Text(
                  label,
                  style: TextStyle(color: AppTheme.getTextPrimary(context)),
                ),
                leading: Icon(
                  Icons.subtitles_rounded,
                  color: AppTheme.getPrimaryColor(context),
                ),
                onTap: () {
                  provider.setSubtitleTrack(track);
                  Navigator.pop(ctx);
                  ScaffoldMessenger.of(context).showSnackBar(
                    SnackBar(content: Text('Subtítulos: $label')),
                  );
                },
              );
            }),
            const SizedBox(height: 16),
          ],
        );
      },
    );
  }

  void _startHideControlsTimer() {
    _hideControlsTimer?.cancel();
    _hideControlsTimer = Timer(const Duration(seconds: 4), () {
      if (mounted) {
        setState(() => _showControls = false);
      }
    });
  }

  void _showControlsTemporarily() {
    setState(() => _showControls = true);
    _startHideControlsTimer();
  }

  String _formatSpeed(double bytesPerSecond) {
    if (bytesPerSecond >= 1024 * 1024) {
      return '${(bytesPerSecond / (1024 * 1024)).toStringAsFixed(1)} MB/s';
    } else if (bytesPerSecond >= 1024) {
      return '${(bytesPerSecond / 1024).toStringAsFixed(0)} KB/s';
    } else {
      return '${bytesPerSecond.toStringAsFixed(0)} B/s';
    }
  }

  String _formatDuration(Duration duration) {
    final hours = duration.inHours;
    final minutes = duration.inMinutes.remainder(60);
    final seconds = duration.inSeconds.remainder(60);
    if (hours > 0) {
      return '${hours.toString().padLeft(2, '0')}:${minutes.toString().padLeft(2, '0')}:${seconds.toString().padLeft(2, '0')}';
    }
    return '${minutes.toString().padLeft(2, '0')}:${seconds.toString().padLeft(2, '0')}';
  }

  @override
  void dispose() {
    ServiceLocator.log.d(
        'PlayerScreen: dispose() called, _usingNativePlayer=$_usingNativePlayer, _wasMultiScreenMode=$_wasMultiScreenMode');

    //  provider
    if (_playerProvider != null) {
      _playerProvider!.removeListener(_onProviderUpdate);
    }

    //
    _errorHideTimer?.cancel();
    _errorShown = false;

    //  SnackBar
    try {
      ScaffoldMessenger.of(context).clearSnackBars();
    } catch (e) {
      ServiceLocator.log
          .d('PlayerScreen: Error clearing SnackBars in dispose: $e');
    }

    WidgetsBinding.instance.removeObserver(this);
    _hideControlsTimer?.cancel();
    _dlnaSyncTimer?.cancel();
    _wakelockTimer?.cancel();
    _longPressTimer?.cancel();
    _playerFocusNode.dispose();
    _categoryScrollController.dispose();
    _channelScrollController.dispose();

    //  Windows mini  mini
    if (WindowsPipChannel.isInPipMode) {
      WindowsPipChannel.exitPipMode();
    }

    //  -  API
    if (_isFullScreen &&
        (PlatformDetector.isWindows || PlatformDetector.isMacOS)) {
      if (PlatformDetector.isWindows) {
        final success = WindowsFullscreenNative.exitFullScreen();
        if (!success) {
          ServiceLocator.log.d(
              'Native exitFullScreen failed in dispose, using window_manager');
          unawaited(windowManager.setFullScreen(false));
        }
      } else {
        unawaited(MacOSFullscreen.exitFullscreen());
      }
    }

    // Windows
    if (_wasMultiScreenMode && PlatformDetector.isDesktop) {
      _saveMultiScreenState();
    }

    //
    if (!_usingNativePlayer && _playerProvider != null) {
      ServiceLocator.log
          .d('PlayerScreen: calling _playerProvider.stop() in silent mode');
      unawaited(_playerProvider!.stop(silent: true));
    }
    if (PlatformDetector.isDesktop && _multiScreenProvider != null) {
      ServiceLocator.log.d(
          'PlayerScreen: calling _multiScreenProvider.clearAllScreens() in dispose');
      unawaited(_multiScreenProvider!.clearAllScreens());
    }

    //
    try {
      ScreenBrightness.instance.resetApplicationScreenBrightness();
    } catch (_) {}

    //
    if (PlatformDetector.isMobile) {
      PlatformDetector.setKeepScreenOn(false);
    } else {
      try {
        WakelockPlus.disable();
      } catch (e) {
        ServiceLocator.log.d('PlayerScreen: Failed to disable wakelock: $e');
      }
    }

    // Restore system UI
    SystemChrome.setEnabledSystemUIMode(SystemUiMode.edgeToEdge);

    // Restore orientation to user preference on mobile (was forced landscape for player)
    if (PlatformDetector.isMobile) {
      final orientation = _settingsProvider?.mobileOrientation ?? 'auto';
      switch (orientation) {
        case 'landscape':
          SystemChrome.setPreferredOrientations([
            DeviceOrientation.landscapeLeft,
            DeviceOrientation.landscapeRight,
          ]);
          break;
        case 'portrait':
          SystemChrome.setPreferredOrientations([
            DeviceOrientation.portraitUp,
          ]);
          break;
        case 'auto':
        default:
          SystemChrome.setPreferredOrientations([
            DeviceOrientation.portraitUp,
            DeviceOrientation.landscapeLeft,
            DeviceOrientation.landscapeRight,
          ]);
          break;
      }
    }

    super.dispose();
  }

  /// Windows
  void _saveMultiScreenState() {
    //
    if (_multiScreenStateSaved) {
      ServiceLocator.log
          .d('PlayerScreen: Multi-screen state already saved, skipping');
      return;
    }

    try {
      if (_multiScreenProvider == null || _settingsProvider == null) {
        ServiceLocator.log.d(
            'PlayerScreen: Cannot save multi-screen state - providers not available');
        return;
      }

      // ID
      final List<int?> channelIds = [];
      final List<int> sourceIndexes = [];
      for (int i = 0; i < 4; i++) {
        final screen = _multiScreenProvider!.getScreen(i);
        channelIds.add(screen.channel?.id);
        sourceIndexes.add(screen.channel?.currentSourceIndex ?? 0);
      }

      final activeIndex = _multiScreenProvider!.activeScreenIndex;

      ServiceLocator.log.d(
          'PlayerScreen: Saving multi-screen state - channelIds: $channelIds, sourceIndexes: $sourceIndexes, activeIndex: $activeIndex');

      //
      _settingsProvider!.saveLastMultiScreen(
        channelIds,
        activeIndex,
        sourceIndexes: sourceIndexes,
      );
      _multiScreenStateSaved = true;
    } catch (e) {
      ServiceLocator.log.d('PlayerScreen: Error saving multi-screen state: $e');
    }
  }

  ///  ()
  void _showSourceSwitchIndicator(PlayerProvider provider) {
    //  SnackBar
  }

  void _saveLastChannelId(Channel? channel) {
    if (channel == null || channel.id == null) return;
    if (_settingsProvider != null && _settingsProvider!.rememberLastChannel) {
      //
      _settingsProvider!.saveLastSingleChannel(channel.id);
    }
  }

  // ============ ============

  //
  Offset? _panStartPosition;
  String?
      _currentGestureType; // 'volume', 'brightness', 'channel', 'horizontal'

  void _onPanStart(DragStartDetails details) {
    _panStartPosition = details.globalPosition;
    _currentGestureType = null;

    final playerProvider = _playerProvider ?? context.read<PlayerProvider>();
    _initialVolume = playerProvider.volume;
    _gestureStartY = details.globalPosition.dy;

    //
    _loadCurrentBrightness();
  }

  Future<void> _loadCurrentBrightness() async {
    try {
      _initialBrightness = await ScreenBrightness.instance.current;
    } catch (_) {
      _initialBrightness = 0.5;
    }
  }

  void _onPanUpdate(DragUpdateDetails details) {
    if (_panStartPosition == null) return;

    final dx = details.globalPosition.dx - _panStartPosition!.dx;
    final dy = details.globalPosition.dy - _panStartPosition!.dy;

    //
    if (_currentGestureType == null) {
      const threshold = 10.0; //
      if (dx.abs() > threshold || dy.abs() > threshold) {
        final screenWidth = MediaQuery.of(context).size.width;
        final x = _panStartPosition!.dx;

        if (dy.abs() > dx.abs()) {
          //
          if (x < screenWidth * 0.35) {
            _currentGestureType = 'volume';
            _gestureValue = _initialVolume;
          } else if (x > screenWidth * 0.65) {
            _currentGestureType = 'brightness';
            _gestureValue = _initialBrightness;
          } else {
            _currentGestureType = 'channel';
          }
        } else {
          //
          _currentGestureType = 'horizontal';
        }
      }
      return;
    }

    //
    final screenHeight = MediaQuery.of(context).size.height;
    final deltaY = _gestureStartY - details.globalPosition.dy;

    if (_currentGestureType == 'volume') {
      final volumeChange = (deltaY / (screenHeight * 0.5)) * 1.0; // 100%
      final newVolume = (_initialVolume + volumeChange).clamp(0.0, 1.0);
      (_playerProvider ?? context.read<PlayerProvider>()).setVolume(newVolume);
      setState(() {
        _showGestureIndicator = true;
        _gestureValue = newVolume;
      });
    } else if (_currentGestureType == 'brightness') {
      final brightnessChange = (deltaY / (screenHeight * 0.5)) * 1.0;
      final newBrightness =
          (_initialBrightness + brightnessChange).clamp(0.0, 1.0);
      try {
        ScreenBrightness.instance.setApplicationScreenBrightness(newBrightness);
      } catch (_) {}
      setState(() {
        _showGestureIndicator = true;
        _gestureValue = newBrightness;
      });
    } else if (_currentGestureType == 'channel') {
      // ず
      setState(() {
        _showGestureIndicator = true;
        _gestureValue = dy.clamp(-100.0, 100.0) / 100.0; //
      });
    }
  }

  void _onPanEnd(DragEndDetails details) {
    if (_panStartPosition == null) {
      _resetGestureState();
      return;
    }

    final dx = details.globalPosition.dx - _panStartPosition!.dx;
    final dy = details.globalPosition.dy - _panStartPosition!.dy;
    final screenHeight = MediaQuery.of(context).size.height;
    final screenWidth = MediaQuery.of(context).size.width;

    //
    if (_currentGestureType == 'channel') {
      final threshold = screenHeight * 0.08; // 8%
      if (dy.abs() > threshold) {
        _errorShown = false; // ?
        _errorHideTimer?.cancel(); //
        //
        ScaffoldMessenger.of(context).hideCurrentSnackBar();

        final playerProvider =
            _playerProvider ?? context.read<PlayerProvider>();
        final channelProvider = context.read<ChannelProvider>();
        if (dy > 0) {
          //  ->
          playerProvider.playPrevious(channelProvider.allChannels);
          _saveLastChannelId(playerProvider.currentChannel);
        } else {
          //  ->
          playerProvider.playNext(channelProvider.allChannels);
          _saveLastChannelId(playerProvider.currentChannel);
        }
        //  UI
        setState(() {});
      }
    }

    //  - /
    if (_currentGestureType == 'horizontal') {
      final threshold = screenWidth * 0.15; // 15%
      if (dx < -threshold && !_showCategoryPanel) {
        // ︽
        setState(() {
          _showCategoryPanel = true;
          _showControls = false;
        });
      } else if (dx > threshold && _showCategoryPanel) {
        //
        setState(() {
          _showCategoryPanel = false;
          _selectedCategory = null;
        });
      }
    }

    _resetGestureState();
  }

  void _resetGestureState() {
    setState(() {
      _showGestureIndicator = false;
    });
    _panStartPosition = null;
    _currentGestureType = null;
  }

  Widget _buildGestureIndicator() {
    IconData icon;
    String label;

    if (_currentGestureType == 'volume') {
      icon = _gestureValue > 0.5
          ? Icons.volume_up
          : (_gestureValue > 0 ? Icons.volume_down : Icons.volume_off);
      label = '${(_gestureValue * 100).toInt()}%';
    } else if (_currentGestureType == 'brightness') {
      icon = _gestureValue > 0.5 ? Icons.brightness_high : Icons.brightness_low;
      label = '${(_gestureValue * 100).toInt()}%';
    } else if (_currentGestureType == 'channel') {
      // ず
      if (_gestureValue < 0) {
        icon = Icons.keyboard_arrow_up;
        label = AppStrings.of(context)?.nextChannel ?? 'Next channel';
      } else {
        icon = Icons.keyboard_arrow_down;
        label = AppStrings.of(context)?.previousChannel ?? 'Previous channel';
      }
    } else {
      return const SizedBox.shrink();
    }

    return Center(
      child: Container(
        padding: const EdgeInsets.symmetric(horizontal: 24, vertical: 16),
        decoration: BoxDecoration(
          color: Colors.black.withAlpha(180),
          borderRadius: BorderRadius.circular(12),
        ),
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            Icon(icon, color: Colors.white, size: 36),
            const SizedBox(height: 8),
            Text(
              label,
              style: const TextStyle(
                  color: Colors.white,
                  fontSize: 16,
                  fontWeight: FontWeight.bold),
            ),
          ],
        ),
      ),
    );
  }

  DateTime? _lastSelectKeyDownTime;
  DateTime? _lastLeftKeyDownTime; //
  Timer? _longPressTimer; //

  KeyEventResult _handleKeyEvent(FocusNode node, KeyEvent event) {
    _showControlsTemporarily();

    final playerProvider = context.read<PlayerProvider>();
    final key = event.logicalKey;

    // Play/Pause & Favorite (Select/Enter)
    if (key == LogicalKeyboardKey.select ||
        key == LogicalKeyboardKey.enter ||
        key == LogicalKeyboardKey.space) {
      if (event is KeyDownEvent) {
        if (event is KeyRepeatEvent) return KeyEventResult.handled;
        _lastSelectKeyDownTime = DateTime.now();
        return KeyEventResult.handled;
      }

      if (event is KeyUpEvent && _lastSelectKeyDownTime != null) {
        final duration = DateTime.now().difference(_lastSelectKeyDownTime!);
        _lastSelectKeyDownTime = null;

        if (duration.inMilliseconds > 500) {
          // Long Press: Toggle Favorite
          // Channel Provider not needed, Favorites Provider is enough
          // final provider = context.read<ChannelProvider>();
          final favorites = context.read<FavoritesProvider>();
          final channel = playerProvider.currentChannel;

          if (channel != null) {
            favorites.toggleFavorite(channel);

            // Show toast
            final isFav = favorites.isFavorite(channel.id ?? 0);
            ScaffoldMessenger.of(context).showSnackBar(
              SnackBar(
                content: Text(
                  isFav ? 'Added to Favorites' : 'Removed from Favorites',
                ),
                duration: const Duration(seconds: 1),
                backgroundColor: AppTheme.accentColor,
              ),
            );
          }
        } else {
          // Short Press: Play/Pause or Select Button if focused?
          // Actually, if we are focused on a button, the button handles it?
          // No, we are in the Parent Focus Capture.
          // If we handle it here, the child button's 'onSelect' might not trigger if we consume it?
          // Focus on the scaffold body is _playerFocusNode.
          // If focus is on a button, this _handleKeyEvent on _playerFocusNode might NOT receive it if the button consumes it?
          // Wait, Focus(onKeyEvent) usually bubbles UP if not handled by child.
          // If the child (button) handles it, this won't run.
          // So this logic only applies when no button handles it (e.g. video area focused).
          playerProvider.togglePlayPause();
        }
        return KeyEventResult.handled;
      }
      return KeyEventResult.handled;
    }

    // Left key -  / ㈡
    if (key == LogicalKeyboardKey.arrowLeft) {
      if (event is KeyDownEvent) {
        if (event is KeyRepeatEvent) return KeyEventResult.handled;
        _lastLeftKeyDownTime = DateTime.now();
        //
        _longPressTimer?.cancel();
        _longPressTimer = Timer(const Duration(milliseconds: 500), () {
          if (mounted && _lastLeftKeyDownTime != null) {
            // ㈡
            final playerProvider = context.read<PlayerProvider>();
            final channelProvider = context.read<ChannelProvider>();
            final currentChannel = playerProvider.currentChannel;

            setState(() {
              _showCategoryPanel = true;
              //
              if (currentChannel != null && currentChannel.groupName != null) {
                _selectedCategory = currentChannel.groupName;

                //
                WidgetsBinding.instance.addPostFrameCallback((_) {
                  if (_selectedCategory != null) {
                    final channels =
                        channelProvider.getChannelsByGroup(_selectedCategory!);
                    final currentIndex =
                        channels.indexWhere((ch) => ch.id == currentChannel.id);

                    if (currentIndex >= 0 &&
                        _channelScrollController.hasClients) {
                      //  44
                      const itemHeight = 44.0;
                      final scrollOffset = currentIndex * itemHeight;

                      _channelScrollController.animateTo(
                        scrollOffset,
                        duration: const Duration(milliseconds: 300),
                        curve: Curves.easeOut,
                      );
                    }
                  }
                });
              } else {
                _selectedCategory = null;
              }
            });
            _lastLeftKeyDownTime = null; //
          }
        });
        return KeyEventResult.handled;
      }

      if (event is KeyUpEvent) {
        _longPressTimer?.cancel();
        if (_lastLeftKeyDownTime != null) {
          //
          _lastLeftKeyDownTime = null;

          if (_showCategoryPanel) {
            //
            if (_selectedCategory != null) {
              setState(() => _selectedCategory = null);
              return KeyEventResult.handled;
            }
            //
            setState(() {
              _showCategoryPanel = false;
              _selectedCategory = null;
            });
            return KeyEventResult.handled;
          }

          // €
          final channel = playerProvider.currentChannel;
          if (channel != null && channel.hasMultipleSources) {
            playerProvider.switchToPreviousSource();
            _showSourceSwitchIndicator(playerProvider);
          }
        }
        return KeyEventResult.handled;
      }
      return KeyEventResult.handled;
    }

    // Right key - 
    if (key == LogicalKeyboardKey.arrowRight) {
      if (_showCategoryPanel) {
        //
        return KeyEventResult.handled;
      }

      if (event is KeyDownEvent && event is! KeyRepeatEvent) {
        // €
        final channel = playerProvider.currentChannel;
        if (channel != null && channel.hasMultipleSources) {
          playerProvider.switchToNextSource();
          _showSourceSwitchIndicator(playerProvider);
        }
      }
      return KeyEventResult.handled;
    }

    if (event is! KeyDownEvent) return KeyEventResult.ignored;
    // I will keep Up/Down as Channel Switch for now, unless user explicitly requested navigation.
    // Wait, user complained "Navigate bar displays, Left/Right cannot seek (should move focus)".
    // They didn't complain about Up/Down. So I will ONLY modify Left/Right.

    // Previous Channel (Up)
    if (key == LogicalKeyboardKey.arrowUp ||
        key == LogicalKeyboardKey.channelUp) {
      _errorShown = false; // ?
      _errorHideTimer?.cancel(); //
      //
      ScaffoldMessenger.of(context).hideCurrentSnackBar();

      final channelProvider = context.read<ChannelProvider>();
      playerProvider.playPrevious(channelProvider.allChannels);
      //  ID
      _saveLastChannelId(playerProvider.currentChannel);
      return KeyEventResult.handled;
    }

    // Next Channel (Down)
    if (key == LogicalKeyboardKey.arrowDown ||
        key == LogicalKeyboardKey.channelDown) {
      _errorShown = false; // ?
      _errorHideTimer?.cancel(); //
      //
      ScaffoldMessenger.of(context).hideCurrentSnackBar();

      final channelProvider = context.read<ChannelProvider>();
      playerProvider.playNext(channelProvider.allChannels);
      //  ID
      _saveLastChannelId(playerProvider.currentChannel);
      return KeyEventResult.handled;
    }

    // Back/Exit
    if (key == LogicalKeyboardKey.escape || key == LogicalKeyboardKey.goBack) {
      //
      if (WindowsPipChannel.isInPipMode) {
        WindowsPipChannel.exitPipMode();
        setState(() {});
        //
        _playerFocusNode.requestFocus();
        return KeyEventResult.handled;
      }

      //
      _errorHideTimer?.cancel();
      _errorShown = false;
      ScaffoldMessenger.of(context).clearSnackBars();

      //  stop()dispose
      // dispose

      if (Navigator.canPop(context)) {
        Navigator.of(context).pop();
      }
      return KeyEventResult.handled;
    }

    // Mute -  TV
    if (key == LogicalKeyboardKey.keyM ||
        (key == LogicalKeyboardKey.audioVolumeMute &&
            !PlatformDetector.isMobile)) {
      playerProvider.toggleMute();
      return KeyEventResult.handled;
    }

    // Explicit Volume Keys (for TV remotes with dedicated buttons)
    //
    if (!PlatformDetector.isMobile) {
      if (key == LogicalKeyboardKey.audioVolumeUp) {
        playerProvider.setVolume(playerProvider.volume + 0.1);
        return KeyEventResult.handled;
      }

      if (key == LogicalKeyboardKey.audioVolumeDown) {
        playerProvider.setVolume(playerProvider.volume - 0.1);
        return KeyEventResult.handled;
      }
    }

    // Settings / Menu
    if (key == LogicalKeyboardKey.settings ||
        key == LogicalKeyboardKey.contextMenu) {
      _showSettingsSheet(context);
      return KeyEventResult.handled;
    }

    // Back (explicit handling for some remotes)
    if (key == LogicalKeyboardKey.backspace) {
      ServiceLocator.log.d('========================================');
      ServiceLocator.log.d('PlayerScreen: Back key pressed (backspace)');

      //
      ServiceLocator.log.d('PlayerScreen: Clearing error state');
      _errorHideTimer?.cancel();
      _errorShown = false;
      ScaffoldMessenger.of(context).clearSnackBars();
      ServiceLocator.log.d('PlayerScreen: SnackBars cleared');

      //  stop()dispose
      ServiceLocator.log
          .d('PlayerScreen: Navigating back (stop will be called in dispose)');

      if (Navigator.canPop(context)) {
        ServiceLocator.log.d('PlayerScreen: Popping navigation');
        Navigator.of(context).pop();
      }
      ServiceLocator.log.d('========================================');
      return KeyEventResult.handled;
    }

    return KeyEventResult.ignored;
  }

  @override
  Widget build(BuildContext context) {
    return PopScope(
      canPop: true,
      onPopInvokedWithResult: (didPop, result) {
        if (didPop) {
          //  popら?
          _errorHideTimer?.cancel();
          _errorShown = false;
          try {
            ScaffoldMessenger.of(context).clearSnackBars();
          } catch (e) {
            ServiceLocator.log.d(
                'PlayerScreen: Error clearing SnackBars in onPopInvoked: $e');
          }
        }
      },
      child: Scaffold(
        backgroundColor: Colors.black,
        body: Focus(
          focusNode: _playerFocusNode,
          autofocus: true,
          onKeyEvent: _handleKeyEvent,
          child: MouseRegion(
            cursor: _showControls
                ? SystemMouseCursors.basic
                : SystemMouseCursors.none,
            onEnter: (_) {
              _mouseOver = true;
              _showControlsTemporarily();
            },
            onHover: (_) {
              _showControlsTemporarily();
            },
            onExit: (_) {
              _mouseOver = false;
              if (mounted) {
                _hideControlsTimer?.cancel();
                _hideControlsTimer =
                    Timer(const Duration(milliseconds: 300), () {
                  if (mounted && !_mouseOver) {
                    setState(() => _showControls = false);
                  }
                });
              }
            },
            child: GestureDetector(
              //  translucent
              behavior: HitTestBehavior.translucent,
              onTap: () {
                if (_showCategoryPanel) {
                  setState(() {
                    _showCategoryPanel = false;
                    _selectedCategory = null;
                  });
                } else {
                  _showControlsTemporarily();
                }
              },
              onDoubleTap: () {
                context.read<PlayerProvider>().togglePlayPause();
              },
              //  -  Pan
              onPanStart: PlatformDetector.isMobile ? _onPanStart : null,
              onPanUpdate: PlatformDetector.isMobile ? _onPanUpdate : null,
              onPanEnd: PlatformDetector.isMobile ? _onPanEnd : null,
              child: Stack(
                children: [
                  //
                  const Positioned.fill(
                    child: ColoredBox(color: Colors.transparent),
                  ),

                  // Video Player
                  _buildVideoPlayer(),

                  // Controls Overlay -
                  if (!_isMultiScreenMode())
                    AnimatedOpacity(
                      opacity: _showControls ? 1.0 : 0.0,
                      duration: const Duration(milliseconds: 300),
                      child: IgnorePointer(
                        ignoring: !_showControls,
                        child: WindowsPipChannel.isInPipMode
                            ? _buildMiniControlsOverlay()
                            : _buildControlsOverlay(),
                      ),
                    ),

                  // Category Panel (Left side) -
                  if (_showCategoryPanel &&
                      !WindowsPipChannel.isInPipMode &&
                      !_isMultiScreenMode())
                    _buildCategoryPanel(),

                  // ず??
                  if (_showGestureIndicator) _buildGestureIndicator(),

                  // Loading Indicator - ㄥず?
                  if (_isLoading && !_isMultiScreenMode())
                    Center(
                      child: Transform.scale(
                        scale: WindowsPipChannel.isInPipMode ? 0.6 : 1.0,
                        child: CircularProgressIndicator(
                          color: AppTheme.getPrimaryColor(context),
                        ),
                      ),
                    ),

                  // FPS  - ?
                  Builder(
                    builder: (context) {
                      final settings = context.watch<SettingsProvider>();
                      final player = context.watch<PlayerProvider>();

                      //
                      if (!WindowsPipChannel.isInPipMode) {
                        return const SizedBox.shrink();
                      }

                      if (!settings.showFps ||
                          player.state != PlayerState.playing) {
                        return const SizedBox.shrink();
                      }
                      final fps = player.currentFps;
                      if (fps <= 0) return const SizedBox.shrink();

                      return Positioned(
                        bottom: 4,
                        right: 4,
                        child: IgnorePointer(
                          child: Container(
                            padding: const EdgeInsets.symmetric(
                                horizontal: 4, vertical: 2),
                            decoration: BoxDecoration(
                              color: Colors.red.withOpacity(0.8),
                              borderRadius: BorderRadius.circular(2),
                            ),
                            child: Text(
                              '${fps.toStringAsFixed(0)} FPS',
                              style: const TextStyle(
                                color: Colors.white,
                                fontSize: 8,
                                fontWeight: FontWeight.bold,
                              ),
                            ),
                          ),
                        ),
                      );
                    },
                  ),

                  // Windows  - FPS
                  //
                  Builder(
                    builder: (context) {
                      final settings = context.watch<SettingsProvider>();
                      final player = context.watch<PlayerProvider>();

                      //
                      if (_isMultiScreenMode() ||
                          WindowsPipChannel.isInPipMode ||
                          player.state != PlayerState.playing) {
                        return const SizedBox.shrink();
                      }

                      //
                      final showAny = settings.showNetworkSpeed ||
                          settings.showClock ||
                          settings.showFps ||
                          settings.showVideoInfo;
                      if (!showAny) return const SizedBox.shrink();

                      final fps = player.currentFps;

                      return Positioned(
                        top: MediaQuery.of(context).padding.top + 8,
                        right: 16,
                        child: IgnorePointer(
                          child: Row(
                            mainAxisSize: MainAxisSize.min,
                            children: [
                              // €?-  (?TV Windows )
                              if (settings.showNetworkSpeed &&
                                  player.downloadSpeed > 0 &&
                                  PlatformDetector.isTV)
                                Container(
                                  margin: const EdgeInsets.only(left: 6),
                                  padding: const EdgeInsets.symmetric(
                                      horizontal: 8, vertical: 4),
                                  decoration: BoxDecoration(
                                    color: Colors.green.withOpacity(0.7),
                                    borderRadius: BorderRadius.circular(4),
                                  ),
                                  child: Text(
                                    _formatSpeed(player.downloadSpeed),
                                    style: const TextStyle(
                                      color: Colors.white,
                                      fontSize: 11,
                                      fontWeight: FontWeight.bold,
                                    ),
                                  ),
                                ),
                              //  -
                              if (settings.showClock)
                                Container(
                                  margin: const EdgeInsets.only(left: 6),
                                  padding: const EdgeInsets.symmetric(
                                      horizontal: 8, vertical: 4),
                                  decoration: BoxDecoration(
                                    color: Colors.black.withOpacity(0.7),
                                    borderRadius: BorderRadius.circular(4),
                                  ),
                                  child: StreamBuilder(
                                    stream: Stream.periodic(
                                        const Duration(seconds: 1)),
                                    builder: (context, snapshot) {
                                      final now = DateTime.now();
                                      return Text(
                                        '${now.hour.toString().padLeft(2, '0')}:${now.minute.toString().padLeft(2, '0')}:${now.second.toString().padLeft(2, '0')}',
                                        style: const TextStyle(
                                          color: Colors.white,
                                          fontSize: 11,
                                          fontWeight: FontWeight.bold,
                                        ),
                                      );
                                    },
                                  ),
                                ),
                              // FPS  - ㈣
                              if (settings.showFps && fps > 0)
                                Container(
                                  margin: const EdgeInsets.only(left: 6),
                                  padding: const EdgeInsets.symmetric(
                                      horizontal: 8, vertical: 4),
                                  decoration: BoxDecoration(
                                    color: Colors.red.withOpacity(0.7),
                                    borderRadius: BorderRadius.circular(4),
                                  ),
                                  child: Text(
                                    '${fps.toStringAsFixed(0)} FPS',
                                    style: const TextStyle(
                                      color: Colors.white,
                                      fontSize: 11,
                                      fontWeight: FontWeight.bold,
                                    ),
                                  ),
                                ),
                              //  -
                              if (settings.showVideoInfo &&
                                  player.videoWidth > 0 &&
                                  player.videoHeight > 0)
                                Container(
                                  margin: const EdgeInsets.only(left: 6),
                                  padding: const EdgeInsets.symmetric(
                                      horizontal: 8, vertical: 4),
                                  decoration: BoxDecoration(
                                    color: Colors.blue.withOpacity(0.7),
                                    borderRadius: BorderRadius.circular(4),
                                  ),
                                  child: Text(
                                    '${player.videoWidth}x${player.videoHeight}',
                                    style: const TextStyle(
                                      color: Colors.white,
                                      fontSize: 11,
                                      fontWeight: FontWeight.bold,
                                    ),
                                  ),
                                ),
                            ],
                          ),
                        ),
                      );
                    },
                  ),

                  // Error Display - Handled via Listener now to show SnackBar
                  // But we can keep a subtle indicator if needed, or remove it entirely
                  // to prevent blocking. Let's remove the blocking widget.
                ],
              ),
            ),
          ),
        ),
      ),
    ); // PopScope
  }

  Widget _buildVideoPlayer() {
    //
    if (_isMultiScreenMode()) {
      return _buildMultiScreenPlayer();
    }

    return Consumer<PlayerProvider>(
      builder: (context, provider, _) {
        //  media_kit
        if (provider.videoController == null) {
          return const SizedBox.expand(
            child: Center(
              child: CircularProgressIndicator(),
            ),
          );
        }

        return Stack(
          fit: StackFit.expand,
          children: [
            Video(
              controller: provider.videoController!,
              controls: NoVideoControls,
            ),
            // Black overlay that hides the green frame on first render
            // (PICO VR headset, Android boxes with mediacodec surface warm-up delay).
            // Fades out to transparent once the first real frame arrives.
            AnimatedOpacity(
              opacity: provider.firstFrameRendered ? 0.0 : 1.0,
              duration: const Duration(milliseconds: 350),
              child: const ColoredBox(color: Colors.black),
            ),
          ],
        );
      },
    );
  }

  //
  Widget _buildMultiScreenPlayer() {
    return MultiScreenPlayer(
      onExitMultiScreen: () {
        //
        final multiScreenProvider = context.read<MultiScreenProvider>();
        final activeChannel = multiScreenProvider.activeChannel;

        //
        multiScreenProvider.pauseAllScreens();

        //
        setState(() {
          _localMultiScreenMode = false;
        });

        if (activeChannel != null) {
          //
          unawaited(_resumeSingleFromMultiScreen(activeChannel));
        }
      },
      onBack: () async {
        //
        _saveMultiScreenState();
        //
        final multiScreenProvider = context.read<MultiScreenProvider>();
        await multiScreenProvider.clearAllScreens();
        if (mounted) {
          Navigator.of(context).pop();
        }
      },
    );
  }

  //

  Future<void> _resumeSingleFromMultiScreen(Channel activeChannel) async {
    final playerProvider = context.read<PlayerProvider>();
    final channelProvider = context.read<ChannelProvider>();

    // Prefer channel object from ChannelProvider to keep original source list/count.
    final matchedChannel =
        channelProvider.allChannels.cast<Channel?>().firstWhere(
              (c) =>
                  c != null &&
                  ((activeChannel.id != null && c.id == activeChannel.id) ||
                      c.name == activeChannel.name),
              orElse: () => null,
            );

    final baseChannel = matchedChannel ?? activeChannel;
    final targetSourceIndex = activeChannel.currentSourceIndex.clamp(
      0,
      baseChannel.sourceCount - 1,
    );

    if (matchedChannel != null) {
      matchedChannel.currentSourceIndex = targetSourceIndex;
    }

    final resumeChannel = baseChannel.copyWith(
      currentSourceIndex: targetSourceIndex,
    );
    await playerProvider.playChannel(
      resumeChannel,
      preserveCurrentSource: true,
    );
  }

  void _switchToMultiScreenMode() {
    if (!PlatformDetector.isDesktop) return;
    final playerProvider = context.read<PlayerProvider>();
    final multiScreenProvider = context.read<MultiScreenProvider>();
    final settingsProvider = context.read<SettingsProvider>();
    final currentChannel = playerProvider.currentChannel;

    //
    unawaited(playerProvider.stop(silent: true));

    // rovider
    multiScreenProvider.setVolumeSettings(
        playerProvider.volume, settingsProvider.volumeBoost);

    //
    setState(() {
      _localMultiScreenMode = true;
    });

    //
    if (multiScreenProvider.hasAnyChannel) {
      multiScreenProvider.resumeAllScreens();
      //
      if (currentChannel != null) {
        final activeIndex = multiScreenProvider.activeScreenIndex;
        multiScreenProvider.playChannelOnScreen(activeIndex, currentChannel);
      }
    } else if (currentChannel != null) {
      //
      final defaultPosition = settingsProvider.defaultScreenPosition;
      multiScreenProvider.playChannelAtDefaultPosition(
          currentChannel, defaultPosition);
    }
  }

  // €?
  Widget _buildMiniControlsOverlay() {
    return GestureDetector(
      //
      onPanStart: (_) => windowManager.startDragging(),
      child: Container(
        decoration: BoxDecoration(
          gradient: LinearGradient(
            begin: Alignment.topCenter,
            end: Alignment.bottomCenter,
            colors: [
              Colors.transparent,
              Colors.transparent,
              Colors.black.withOpacity(0.5),
            ],
            stops: const [0.0, 0.5, 1.0],
          ),
        ),
        child: Column(
          children: [
            //
            Padding(
              padding: const EdgeInsets.all(6),
              child: Row(
                mainAxisAlignment: MainAxisAlignment.end,
                children: [
                  //
                  GestureDetector(
                    onTap: () async {
                      await WindowsPipChannel.exitPipMode();
                      //
                      if (PlatformDetector.isWindows ||
                          PlatformDetector.isMacOS) {
                        await Future.delayed(const Duration(milliseconds: 300));
                        _isFullScreen = await windowManager.isFullScreen();
                      }
                      setState(() {});
                      //
                      _playerFocusNode.requestFocus();
                    },
                    child: Container(
                      padding: const EdgeInsets.all(4),
                      decoration: BoxDecoration(
                        color: Colors.white.withOpacity(0.2),
                        borderRadius: BorderRadius.circular(4),
                      ),
                      child: const Icon(Icons.fullscreen,
                          color: Colors.white, size: 14),
                    ),
                  ),
                  const SizedBox(width: 4),
                  //
                  GestureDetector(
                    onTap: () {
                      WindowsPipChannel.exitPipMode();
                      context.read<PlayerProvider>().stop();
                      Navigator.of(context).pop();
                    },
                    child: Container(
                      padding: const EdgeInsets.all(4),
                      decoration: BoxDecoration(
                        color: Colors.white.withOpacity(0.2),
                        borderRadius: BorderRadius.circular(4),
                      ),
                      child: const Icon(Icons.close,
                          color: Colors.white, size: 14),
                    ),
                  ),
                ],
              ),
            ),
            const Spacer(),
            //  + /
            Padding(
              padding: const EdgeInsets.all(8),
              child: Consumer<PlayerProvider>(
                builder: (context, provider, _) {
                  return Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      //
                      GestureDetector(
                        onTap: provider.toggleMute,
                        child: Container(
                          padding: const EdgeInsets.all(6),
                          decoration: BoxDecoration(
                            color: Colors.white.withOpacity(0.2),
                            shape: BoxShape.circle,
                          ),
                          child: Icon(
                            provider.isMuted
                                ? Icons.volume_off
                                : Icons.volume_up,
                            color: Colors.white,
                            size: 16,
                          ),
                        ),
                      ),
                      const SizedBox(width: 12),
                      // /
                      GestureDetector(
                        onTap: provider.togglePlayPause,
                        child: Container(
                          padding: const EdgeInsets.all(8),
                          decoration: const BoxDecoration(
                            gradient: AppTheme.lotusGradient,
                            shape: BoxShape.circle,
                          ),
                          child: Icon(
                            provider.isPlaying ? Icons.pause : Icons.play_arrow,
                            color: Colors.white,
                            size: 20,
                          ),
                        ),
                      ),
                    ],
                  );
                },
              ),
            ),
          ],
        ),
      ),
    );
  }

  Widget _buildControlsOverlay() {
    return Stack(
      children: [
        // Top gradient mask
        Positioned(
          top: 0,
          left: 0,
          right: 0,
          height: 160,
          child: Container(
            decoration: const BoxDecoration(
              gradient: LinearGradient(
                begin: Alignment.topCenter,
                end: Alignment.bottomCenter,
                colors: [
                  Color(0xCC000000), // 80% black
                  Color(0x66000000), // 40% black
                  Colors.transparent,
                ],
                stops: [0.0, 0.5, 1.0],
              ),
            ),
          ),
        ),
        // Bottom gradient mask
        Positioned(
          bottom: 0,
          left: 0,
          right: 0,
          height: 200,
          child: Container(
            decoration: const BoxDecoration(
              gradient: LinearGradient(
                begin: Alignment.topCenter,
                end: Alignment.bottomCenter,
                colors: [
                  Colors.transparent,
                  Color(0x80000000), // 50% black
                  Color(0xE6000000), // 90% black
                ],
                stops: [0.0, 0.4, 1.0],
              ),
            ),
          ),
        ),
        // Content
        SafeArea(
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.stretch,
            children: [
              _buildTopBar(),
              const Spacer(),
              _buildBottomControls(),
            ],
          ),
        ),
      ],
    );
  }

  Widget _buildTopBar() {
    return Padding(
      //  30
      padding: const EdgeInsets.fromLTRB(24, 30, 24, 16),
      child: Row(
        children: [
          // Semi-transparent channel logo/back button
          TVFocusable(
            onSelect: () async {
              //
              _errorHideTimer?.cancel();
              _errorShown = false;
              ScaffoldMessenger.of(context).clearSnackBars();

              //  -  API
              if (_isFullScreen &&
                  (PlatformDetector.isWindows || PlatformDetector.isMacOS)) {
                _isFullScreen = false;
                if (PlatformDetector.isWindows) {
                  final success = WindowsFullscreenNative.exitFullScreen();
                  if (!success) {
                    //  API  window_manager
                    unawaited(windowManager.setFullScreen(false));
                  }
                } else {
                  unawaited(MacOSFullscreen.exitFullscreen());
                }
              }

              //  stop()dispose

              //
              if (mounted) {
                Navigator.of(context).pop();
              }
            },
            focusScale: 1.0,
            showFocusBorder: false,
            builder: (context, isFocused, child) {
              return Container(
                padding: const EdgeInsets.all(8),
                decoration: BoxDecoration(
                  color: isFocused
                      ? AppTheme.getPrimaryColor(context)
                      : const Color(0x33FFFFFF),
                  borderRadius: BorderRadius.circular(10),
                  border: Border.all(
                    color: isFocused
                        ? AppTheme.getPrimaryColor(context)
                        : const Color(0x1AFFFFFF),
                    width: isFocused ? 2 : 1,
                  ),
                ),
                child: child,
              );
            },
            child: const Icon(Icons.arrow_back_rounded,
                color: Colors.white, size: 18),
          ),

          const SizedBox(width: 16),

          // Minimal channel info
          Expanded(
            child: Consumer<PlayerProvider>(
              builder: (context, provider, _) {
                return Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  mainAxisSize: MainAxisSize.min,
                  children: [
                    Text(
                      provider.currentChannel?.name ?? widget.channelName,
                      style: const TextStyle(
                        color: Colors.white,
                        fontSize: 18,
                        fontWeight: FontWeight.w600,
                      ),
                      maxLines: 1,
                      overflow: TextOverflow.ellipsis,
                    ),
                    const SizedBox(height: 4),
                    Row(
                      children: [
                        // Live indicator
                        if (provider.state == PlayerState.playing) ...[
                          Container(
                            padding: const EdgeInsets.symmetric(
                                horizontal: 8, vertical: 2),
                            decoration: BoxDecoration(
                              gradient: AppTheme.getGradient(context),
                              borderRadius: BorderRadius.circular(4),
                            ),
                            child: const Row(
                              mainAxisSize: MainAxisSize.min,
                              children: [
                                Icon(Icons.circle,
                                    color: Colors.white, size: 6),
                                SizedBox(width: 4),
                                Text('LIVE',
                                    style: TextStyle(
                                        color: Colors.white,
                                        fontSize: 10,
                                        fontWeight: FontWeight.bold)),
                              ],
                            ),
                          ),
                          const SizedBox(width: 8),
                        ],
                        // Source indicator (if multiple sources)
                        if (provider.currentChannel != null &&
                            provider.currentChannel!.hasMultipleSources) ...[
                          Container(
                            padding: const EdgeInsets.symmetric(
                                horizontal: 8, vertical: 2),
                            decoration: BoxDecoration(
                              color: AppTheme.getPrimaryColor(context)
                                  .withOpacity(0.8),
                              borderRadius: BorderRadius.circular(4),
                            ),
                            child: Row(
                              mainAxisSize: MainAxisSize.min,
                              children: [
                                const Icon(Icons.swap_horiz,
                                    color: Colors.white, size: 10),
                                const SizedBox(width: 4),
                                Text(
                                  '${AppStrings.of(context)?.source ?? 'Source'} ${provider.currentSourceIndex}/${provider.sourceCount}',
                                  style: const TextStyle(
                                      color: Colors.white,
                                      fontSize: 10,
                                      fontWeight: FontWeight.bold),
                                ),
                              ],
                            ),
                          ),
                          const SizedBox(width: 8),
                        ],
                        // Video info
                        if (provider.videoInfo.isNotEmpty)
                          Flexible(
                            child: Text(
                              provider.videoInfo,
                              style: const TextStyle(
                                  color: Color(0x99FFFFFF), fontSize: 11),
                              maxLines: 1,
                              overflow: TextOverflow.ellipsis,
                            ),
                          ),
                      ],
                    ),
                  ],
                );
              },
            ),
          ),

          // Favorite button - minimal style
          Consumer<FavoritesProvider>(
            builder: (context, favorites, _) {
              final playerProvider = context.read<PlayerProvider>();
              final currentChannel = playerProvider.currentChannel;
              final isFav = currentChannel != null &&
                  favorites.isFavorite(currentChannel.id ?? 0);

              return TVFocusable(
                onSelect: () async {
                  if (currentChannel != null) {
                    ServiceLocator.log.d(
                        'TV:  - : ${currentChannel.name}, ID: ${currentChannel.id}');
                    final success =
                        await favorites.toggleFavorite(currentChannel);
                    ServiceLocator.log.d('TV: ${success ? "" : ""}');

                    if (success) {
                      final newIsFav =
                          favorites.isFavorite(currentChannel.id ?? 0);
                      ScaffoldMessenger.of(context).showSnackBar(
                        SnackBar(
                          content: Text(
                            newIsFav
                                ? 'Added to favorites'
                                : 'Removed from favorites',
                          ),
                          duration: const Duration(seconds: 1),
                        ),
                      );
                    }
                  } else {
                    ServiceLocator.log.d('TV: ');
                  }
                },
                focusScale: 1.0,
                showFocusBorder: false,
                builder: (context, isFocused, child) {
                  return Container(
                    padding: const EdgeInsets.all(8),
                    decoration: BoxDecoration(
                      gradient: isFav ? AppTheme.getGradient(context) : null,
                      color: isFav
                          ? null
                          : (isFocused
                              ? AppTheme.getPrimaryColor(context)
                              : const Color(0x33FFFFFF)),
                      borderRadius: BorderRadius.circular(10),
                      border: Border.all(
                        color: isFocused
                            ? AppTheme.getPrimaryColor(context)
                            : const Color(0x1AFFFFFF),
                        width: isFocused ? 2 : 1,
                      ),
                    ),
                    child: child,
                  );
                },
                child: Icon(
                  isFav ? Icons.favorite : Icons.favorite_border_rounded,
                  color: Colors.white,
                  size: 18,
                ),
              );
            },
          ),

          // PiP  -  Windows
          if (WindowsPipChannel.isSupported) ...[
            const SizedBox(width: 8),
            _buildPipButton(),
          ],

          // Android PiP
          if (PlatformDetector.isAndroid && !PlatformDetector.isTV) ...[
            const SizedBox(width: 8),
            _buildAndroidPipButton(),
          ],

          // Android external player (PICO/other)
          if (PlatformDetector.isAndroid && !PlatformDetector.isTV) ...[
            const SizedBox(width: 8),
            _buildExternalPlayerButton(),
          ],

          //  - ㈠?
          if (PlatformDetector.isDesktop) ...[
            const SizedBox(width: 8),
            _buildMultiScreenButton(),
          ],
        ],
      ),
    );
  }

  //
  Widget _buildMultiScreenButton() {
    return TVFocusable(
      onSelect: _switchToMultiScreenMode,
      focusScale: 1.0,
      showFocusBorder: false,
      builder: (context, isFocused, child) {
        return Container(
          padding: const EdgeInsets.all(8),
          decoration: BoxDecoration(
            color: isFocused
                ? AppTheme.getPrimaryColor(context)
                : const Color(0x33FFFFFF),
            borderRadius: BorderRadius.circular(10),
            border: Border.all(
              color: isFocused
                  ? AppTheme.getPrimaryColor(context)
                  : const Color(0x1AFFFFFF),
              width: isFocused ? 2 : 1,
            ),
          ),
          child: child,
        );
      },
      child: const Icon(
        Icons.grid_view_rounded,
        color: Colors.white,
        size: 18,
      ),
    );
  }

  // PiP
  Widget _buildPipButton() {
    return StatefulBuilder(
      builder: (context, setState) {
        final isInPip = WindowsPipChannel.isInPipMode;
        final isPinned = WindowsPipChannel.isPinned;

        return Row(
          mainAxisSize: MainAxisSize.min,
          children: [
            // PiP
            TVFocusable(
              onSelect: () async {
                await WindowsPipChannel.togglePipMode();
                //
                if (PlatformDetector.isWindows) {
                  await Future.delayed(const Duration(milliseconds: 300));
                  _isFullScreen = await windowManager.isFullScreen();
                }
                setState(() {});
              },
              focusScale: 1.0,
              showFocusBorder: false,
              builder: (context, isFocused, child) {
                return Container(
                  padding: const EdgeInsets.all(8),
                  decoration: BoxDecoration(
                    gradient: isInPip ? AppTheme.getGradient(context) : null,
                    color: isInPip
                        ? null
                        : (isFocused
                            ? AppTheme.getPrimaryColor(context)
                            : const Color(0x33FFFFFF)),
                    borderRadius: BorderRadius.circular(10),
                    border: Border.all(
                      color: isFocused
                          ? AppTheme.getPrimaryColor(context)
                          : const Color(0x1AFFFFFF),
                      width: isFocused ? 2 : 1,
                    ),
                  ),
                  child: child,
                );
              },
              child: Icon(
                isInPip ? Icons.fullscreen : Icons.picture_in_picture_alt,
                color: Colors.white,
                size: 18,
              ),
            ),
            //  - ?
            if (isInPip) ...[
              const SizedBox(width: 8),
              TVFocusable(
                onSelect: () async {
                  await WindowsPipChannel.togglePin();
                  setState(() {});
                },
                focusScale: 1.0,
                showFocusBorder: false,
                builder: (context, isFocused, child) {
                  return Container(
                    padding: const EdgeInsets.all(8),
                    decoration: BoxDecoration(
                      gradient: isPinned ? AppTheme.getGradient(context) : null,
                      color: isPinned
                          ? null
                          : (isFocused
                              ? AppTheme.getPrimaryColor(context)
                              : const Color(0x33FFFFFF)),
                      borderRadius: BorderRadius.circular(10),
                      border: Border.all(
                        color: isFocused
                            ? AppTheme.getPrimaryColor(context)
                            : const Color(0x1AFFFFFF),
                        width: isFocused ? 2 : 1,
                      ),
                    ),
                    child: child,
                  );
                },
                child: Icon(
                  isPinned ? Icons.push_pin : Icons.push_pin_outlined,
                  color: Colors.white,
                  size: 18,
                ),
              ),
            ],
          ],
        );
      },
    );
  }

  Widget _buildAndroidPipButton() {
    return TVFocusable(
      onSelect: () async {
        final supported = await NativePlayerChannel.isAndroidPipSupported();
        if (!mounted) return;
        if (!supported) {
          ScaffoldMessenger.of(context).showSnackBar(
            const SnackBar(
                content: Text('PiP no está disponible en este dispositivo')),
          );
          return;
        }

        final entered = await NativePlayerChannel.enterAndroidPipMode();
        if (!mounted) return;
        if (!entered) {
          ScaffoldMessenger.of(context).showSnackBar(
            const SnackBar(content: Text('No se pudo activar PiP')),
          );
        }
      },
      focusScale: 1.0,
      showFocusBorder: false,
      builder: (context, isFocused, child) {
        return Container(
          padding: const EdgeInsets.all(8),
          decoration: BoxDecoration(
            color: isFocused
                ? AppTheme.getPrimaryColor(context)
                : const Color(0x33FFFFFF),
            borderRadius: BorderRadius.circular(10),
            border: Border.all(
              color: isFocused
                  ? AppTheme.getPrimaryColor(context)
                  : const Color(0x1AFFFFFF),
              width: isFocused ? 2 : 1,
            ),
          ),
          child: child,
        );
      },
      child: const Icon(Icons.picture_in_picture_alt_rounded,
          color: Colors.white, size: 18),
    );
  }

  Widget _buildExternalPlayerButton() {
    return TVFocusable(
      onSelect: _showExternalPlayerSheet,
      focusScale: 1.0,
      showFocusBorder: false,
      builder: (context, isFocused, child) {
        return Container(
          padding: const EdgeInsets.all(8),
          decoration: BoxDecoration(
            color: isFocused
                ? AppTheme.getPrimaryColor(context)
                : const Color(0x33FFFFFF),
            borderRadius: BorderRadius.circular(10),
            border: Border.all(
              color: isFocused
                  ? AppTheme.getPrimaryColor(context)
                  : const Color(0x1AFFFFFF),
              width: isFocused ? 2 : 1,
            ),
          ),
          child: child,
        );
      },
      child:
          const Icon(Icons.open_in_new_rounded, color: Colors.white, size: 18),
    );
  }

  Future<void> _showExternalPlayerSheet() async {
    final provider = context.read<PlayerProvider>();
    final settings = context.read<SettingsProvider>();
    final currentChannel = provider.currentChannel;
    final playUrl = currentChannel?.currentUrl ?? widget.channelUrl;
    final playTitle = currentChannel?.name ?? widget.channelName;
    final is3dCandidate = currentChannel?.isSeekable ?? false;
    final stereoMode = settings.external3dMode;

    final picoPackage =
        await NativePlayerChannel.getInstalledPicoPlayerPackage();
    if (!mounted) return;

    showModalBottomSheet<void>(
      context: context,
      backgroundColor: AppTheme.getSurfaceColor(context),
      shape: const RoundedRectangleBorder(
        borderRadius: BorderRadius.vertical(top: Radius.circular(16)),
      ),
      builder: (ctx) {
        return SafeArea(
          child: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              ListTile(
                leading:
                    const Icon(Icons.open_in_new_rounded, color: Colors.white),
                title: Text(
                  'Abrir con reproductor externo',
                  style: TextStyle(color: AppTheme.getTextPrimary(context)),
                ),
                subtitle: Text(
                  'Selector de apps (VLC, MX, etc.)',
                  style: TextStyle(color: AppTheme.getTextMuted(context)),
                ),
                onTap: () async {
                  Navigator.of(ctx).pop();
                  final opened = await NativePlayerChannel.openInExternalPlayer(
                    url: playUrl,
                    title: playTitle,
                    forceChooser: true,
                  );
                  if (!mounted) return;
                  if (!opened) {
                    ScaffoldMessenger.of(context).showSnackBar(
                      const SnackBar(
                          content:
                              Text('No se pudo abrir reproductor externo')),
                    );
                  }
                },
              ),
              if (picoPackage != null)
                ListTile(
                  leading:
                      const Icon(Icons.view_in_ar_rounded, color: Colors.white),
                  title: Text(
                    'Abrir en PICO Player (3D)',
                    style: TextStyle(color: AppTheme.getTextPrimary(context)),
                  ),
                  subtitle: Text(
                    is3dCandidate
                        ? 'Envia flags 3D (${stereoMode.toUpperCase()}) al player PICO'
                        : 'Disponible; recomendado para contenido 3D/VOD',
                    style: TextStyle(color: AppTheme.getTextMuted(context)),
                  ),
                  onTap: () async {
                    Navigator.of(ctx).pop();
                    final opened =
                        await NativePlayerChannel.openInExternalPlayer(
                      url: playUrl,
                      title: playTitle,
                      packageName: picoPackage,
                      is3d: true,
                      stereoMode: stereoMode,
                    );
                    if (!mounted) return;
                    if (!opened) {
                      ScaffoldMessenger.of(context).showSnackBar(
                        const SnackBar(
                            content: Text('No se pudo abrir PICO Player')),
                      );
                    }
                  },
                ),
              const SizedBox(height: 8),
            ],
          ),
        );
      },
    );
  }

  Widget _buildBottomControls() {
    return Consumer<PlayerProvider>(
      builder: (context, provider, _) {
        return Padding(
          padding: const EdgeInsets.symmetric(horizontal: 24, vertical: 12),
          child: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              // EPG
              Consumer<EpgProvider>(
                builder: (context, epgProvider, _) {
                  final channel = provider.currentChannel;
                  final currentProgram = epgProvider.getCurrentProgram(
                      channel?.epgId, channel?.name);
                  final nextProgram =
                      epgProvider.getNextProgram(channel?.epgId, channel?.name);

                  if (currentProgram != null || nextProgram != null) {
                    return Padding(
                      padding: const EdgeInsets.only(bottom: 12),
                      child: Container(
                        padding: const EdgeInsets.symmetric(
                            horizontal: 12, vertical: 8),
                        decoration: BoxDecoration(
                          color: const Color(0x33000000),
                          borderRadius: BorderRadius.circular(8),
                        ),
                        child: Column(
                          crossAxisAlignment: CrossAxisAlignment.start,
                          children: [
                            if (currentProgram != null)
                              Row(
                                children: [
                                  Container(
                                    padding: const EdgeInsets.symmetric(
                                        horizontal: 6, vertical: 2),
                                    decoration: BoxDecoration(
                                      color: AppTheme.getPrimaryColor(context),
                                      borderRadius: BorderRadius.circular(4),
                                    ),
                                    child: Text(
                                        AppStrings.of(context)?.nowPlaying ??
                                            'Now playing',
                                        style: const TextStyle(
                                            color: Colors.white,
                                            fontSize: 10,
                                            fontWeight: FontWeight.bold)),
                                  ),
                                  const SizedBox(width: 8),
                                  Expanded(
                                    child: Text(
                                      currentProgram.title,
                                      style: const TextStyle(
                                          color: Colors.white, fontSize: 13),
                                      maxLines: 1,
                                      overflow: TextOverflow.ellipsis,
                                    ),
                                  ),
                                  Text(
                                    (AppStrings.of(context)?.endsInMinutes ??
                                            'Ends in {minutes} min')
                                        .replaceFirst('{minutes}',
                                            '${currentProgram.remainingMinutes}'),
                                    style: const TextStyle(
                                        color: Color(0x99FFFFFF), fontSize: 11),
                                  ),
                                ],
                              ),
                            if (nextProgram != null) ...[
                              const SizedBox(height: 6),
                              Row(
                                children: [
                                  Container(
                                    padding: const EdgeInsets.symmetric(
                                        horizontal: 8, vertical: 3),
                                    decoration: BoxDecoration(
                                      gradient: LinearGradient(
                                        colors: [
                                          AppTheme.getPrimaryColor(context)
                                              .withOpacity(0.7),
                                          AppTheme.getSecondaryColor(context)
                                              .withOpacity(0.7),
                                        ],
                                      ),
                                      borderRadius: BorderRadius.circular(6),
                                    ),
                                    child: Text(
                                        AppStrings.of(context)?.upNext ??
                                            'Up next',
                                        style: const TextStyle(
                                            color: Colors.white,
                                            fontSize: 11,
                                            fontWeight: FontWeight.w600)),
                                  ),
                                  const SizedBox(width: 10),
                                  Expanded(
                                    child: Text(
                                      nextProgram.title,
                                      style: const TextStyle(
                                          color: Colors.white,
                                          fontSize: 13,
                                          fontWeight: FontWeight.w500),
                                      maxLines: 1,
                                      overflow: TextOverflow.ellipsis,
                                    ),
                                  ),
                                ],
                              ),
                            ],
                          ],
                        ),
                      ),
                    );
                  }
                  return const SizedBox.shrink();
                },
              ),

              // Progress bar for seekable content (VOD, Replay) - EPG ℃
              Consumer<SettingsProvider>(
                builder: (context, settings, _) {
                  if (!provider
                      .shouldShowProgressBar(settings.progressBarMode)) {
                    return const SizedBox.shrink();
                  }

                  return Padding(
                    padding: const EdgeInsets.only(bottom: 12),
                    child: Column(
                      children: [
                        //
                        SliderTheme(
                          data: SliderTheme.of(context).copyWith(
                            trackHeight: 2, //
                            thumbShape: const RoundSliderThumbShape(
                                enabledThumbRadius: 5), //
                            overlayShape: const RoundSliderOverlayShape(
                                overlayRadius: 10), // ︽
                            activeTrackColor: AppTheme.getPrimaryColor(context),
                            inactiveTrackColor: const Color(0x33FFFFFF),
                            thumbColor: Colors.white,
                            overlayColor: AppTheme.getPrimaryColor(context)
                                .withOpacity(0.3),
                          ),
                          child: Slider(
                            value: provider.position.inSeconds.toDouble().clamp(
                                0, provider.duration.inSeconds.toDouble()),
                            max: provider.duration.inSeconds
                                .toDouble()
                                .clamp(1, double.infinity),
                            onChanged: (value) {
                              provider.seek(Duration(seconds: value.toInt()));
                            },
                          ),
                        ),
                        //
                        Padding(
                          padding: const EdgeInsets.symmetric(horizontal: 4),
                          child: Row(
                            mainAxisAlignment: MainAxisAlignment.spaceBetween,
                            children: [
                              Text(
                                _formatDuration(provider.position),
                                style: const TextStyle(
                                    color: Color(0x99FFFFFF), fontSize: 10),
                              ),
                              Text(
                                _formatDuration(provider.duration),
                                style: const TextStyle(
                                    color: Color(0x99FFFFFF), fontSize: 10),
                              ),
                            ],
                          ),
                        ),
                      ],
                    ),
                  );
                },
              ),

              _buildUpNextRow(provider),

              // Control buttons row (moved above progress bar)
              PlatformDetector.isMobile
                ? SingleChildScrollView(
                    scrollDirection: Axis.horizontal,
                    physics: const BouncingScrollPhysics(),
                    child: Row(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: _buildControlButtons(provider),
                    ),
                  )
                : Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: _buildControlButtons(provider),
                  ),
              // Keyboard hints
              if (PlatformDetector.useDPadNavigation)
                Padding(
                  padding: const EdgeInsets.only(top: 8),
                  child: Text(
                    AppStrings.of(context)?.playerHintTV ??
                        '☰️  · 🎛️ · 🔄  · OK / · OK ',
                    style:
                        const TextStyle(color: Color(0x66FFFFFF), fontSize: 11),
                  ),
                ),
            ],
          ),
        );
      },
    );
  }

  List<Channel> _getUpNextChannels(
      ChannelProvider channelProvider, PlayerProvider playerProvider) {
    final current = playerProvider.currentChannel;
    if (current == null) return const [];

    List<Channel> source;
    if (current.channelType == 'vod') {
      source = channelProvider.vodChannels;
    } else if (current.channelType == 'series') {
      source = channelProvider.seriesChannels;
    } else {
      source = channelProvider.allChannels;
    }

    final sameGroup = source
        .where((c) =>
            c.id != current.id &&
            c.url != current.url &&
            c.groupName != null &&
            c.groupName == current.groupName)
        .toList();

    final fallback = source
        .where((c) => c.id != current.id && c.url != current.url)
        .toList();

    final candidates = sameGroup.isNotEmpty ? sameGroup : fallback;
    return candidates.take(12).toList();
  }

  Widget _buildUpNextRow(PlayerProvider provider) {
    return Consumer<ChannelProvider>(
      builder: (context, channelProvider, _) {
        final upNext = _getUpNextChannels(channelProvider, provider);
        if (upNext.isEmpty) return const SizedBox.shrink();

        return Padding(
          padding: const EdgeInsets.only(bottom: 12),
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              Text(
                AppStrings.of(context)?.upNext ?? 'Up next',
                style: const TextStyle(
                  color: Colors.white,
                  fontSize: 13,
                  fontWeight: FontWeight.w600,
                ),
              ),
              const SizedBox(height: 8),
              SizedBox(
                height: 104,
                child: ListView.separated(
                  scrollDirection: Axis.horizontal,
                  itemCount: upNext.length,
                  separatorBuilder: (_, __) => const SizedBox(width: 8),
                  itemBuilder: (context, index) {
                    final channel = upNext[index];
                    return SizedBox(
                      width: 180,
                      child: TVFocusable(
                        onSelect: () {
                          provider.playChannel(channel);
                          _saveLastChannelId(channel);
                        },
                        focusScale: 1.02,
                        showFocusBorder: false,
                        builder: (context, isFocused, child) {
                          return Container(
                            decoration: BoxDecoration(
                              color: AppTheme.getCardColor(context)
                                  .withOpacity(0.9),
                              borderRadius: BorderRadius.circular(10),
                              border: Border.all(
                                color: isFocused
                                    ? AppTheme.getPrimaryColor(context)
                                    : const Color(0x1AFFFFFF),
                                width: isFocused ? 2 : 1,
                              ),
                            ),
                            child: child,
                          );
                        },
                        child: Row(
                          children: [
                            ClipRRect(
                              borderRadius: const BorderRadius.only(
                                topLeft: Radius.circular(10),
                                bottomLeft: Radius.circular(10),
                              ),
                              child: SizedBox(
                                width: 74,
                                height: 104,
                                child: (channel.logoUrl != null &&
                                        channel.logoUrl!.isNotEmpty)
                                    ? CachedNetworkImage(
                                        imageUrl: channel.logoUrl!,
                                        fit: BoxFit.cover,
                                        placeholder: (_, __) => Container(
                                          color:
                                              AppTheme.getSurfaceColor(context),
                                          child: Icon(Icons.movie_rounded,
                                              color: AppTheme.getTextMuted(
                                                  context),
                                              size: 20),
                                        ),
                                        errorWidget: (_, __, ___) => Container(
                                          color:
                                              AppTheme.getSurfaceColor(context),
                                          child: Icon(Icons.movie_rounded,
                                              color: AppTheme.getTextMuted(
                                                  context),
                                              size: 20),
                                        ),
                                      )
                                    : Container(
                                        color:
                                            AppTheme.getSurfaceColor(context),
                                        child: Icon(Icons.movie_rounded,
                                            color:
                                                AppTheme.getTextMuted(context),
                                            size: 20),
                                      ),
                              ),
                            ),
                            Expanded(
                              child: Padding(
                                padding: const EdgeInsets.symmetric(
                                    horizontal: 8, vertical: 6),
                                child: Column(
                                  crossAxisAlignment: CrossAxisAlignment.start,
                                  mainAxisAlignment: MainAxisAlignment.center,
                                  children: [
                                    Text(
                                      channel.name,
                                      maxLines: 2,
                                      overflow: TextOverflow.ellipsis,
                                      style: const TextStyle(
                                        color: Colors.white,
                                        fontSize: 12,
                                        fontWeight: FontWeight.w600,
                                      ),
                                    ),
                                    const SizedBox(height: 6),
                                    Text(
                                      channel.groupName ?? '',
                                      maxLines: 1,
                                      overflow: TextOverflow.ellipsis,
                                      style: const TextStyle(
                                        color: Color(0xB3FFFFFF),
                                        fontSize: 10,
                                      ),
                                    ),
                                  ],
                                ),
                              ),
                            ),
                          ],
                        ),
                      ),
                    );
                  },
                ),
              ),
            ],
          ),
        );
      },
    );
  }

  /// Builds the list of control buttons for the player bottom bar.
  /// Used by both mobile (wrapped in SingleChildScrollView) and desktop (plain Row).
  List<Widget> _buildControlButtons(PlayerProvider provider) {
    return [
      // Volume control
      _buildVolumeControl(provider),

      const SizedBox(width: 16),

      // Previous source button (mobile only)
      if (PlatformDetector.isMobile &&
          provider.currentChannel != null &&
          provider.currentChannel!.hasMultipleSources)
        TVFocusable(
          onSelect: () {
            provider.switchToPreviousSource();
            _showSourceSwitchIndicator(provider);
          },
          focusScale: 1.0,
          showFocusBorder: false,
          builder: (context, isFocused, child) {
            return Container(
              padding: const EdgeInsets.all(8),
              decoration: BoxDecoration(
                color: isFocused
                    ? AppTheme.getPrimaryColor(context)
                    : const Color(0x33FFFFFF),
                borderRadius: BorderRadius.circular(10),
                border: Border.all(
                  color: isFocused
                      ? AppTheme.getPrimaryColor(context)
                      : const Color(0x1AFFFFFF),
                  width: isFocused ? 2 : 1,
                ),
              ),
              child: child,
            );
          },
          child: const Icon(Icons.skip_previous_rounded,
              color: Colors.white, size: 18),
        ),

      if (PlatformDetector.isMobile &&
          provider.currentChannel != null &&
          provider.currentChannel!.hasMultipleSources)
        const SizedBox(width: 8),

      // Play/Pause - Lotus gradient button (smaller)
      TVFocusable(
        autofocus: true,
        onSelect: provider.togglePlayPause,
        focusScale: 1.0,
        showFocusBorder: false,
        builder: (context, isFocused, child) {
          return Container(
            width: 44,
            height: 44,
            decoration: BoxDecoration(
              gradient: AppTheme.getGradient(context),
              shape: BoxShape.circle,
              border: Border.all(
                color: isFocused ? Colors.white : Colors.transparent,
                width: 2,
              ),
              boxShadow: [
                BoxShadow(
                  color: AppTheme.getPrimaryColor(context)
                      .withAlpha(isFocused ? 100 : 50),
                  blurRadius: isFocused ? 16 : 8,
                  spreadRadius: isFocused ? 2 : 1,
                ),
              ],
            ),
            child: child,
          );
        },
        child: Icon(
          provider.isPlaying
              ? Icons.pause_rounded
              : Icons.play_arrow_rounded,
          color: Colors.white,
          size: 22,
        ),
      ),

      // Next source button (mobile only)
      if (PlatformDetector.isMobile &&
          provider.currentChannel != null &&
          provider.currentChannel!.hasMultipleSources)
        const SizedBox(width: 8),

      if (PlatformDetector.isMobile &&
          provider.currentChannel != null &&
          provider.currentChannel!.hasMultipleSources)
        TVFocusable(
          onSelect: () {
            provider.switchToNextSource();
            _showSourceSwitchIndicator(provider);
          },
          focusScale: 1.0,
          showFocusBorder: false,
          builder: (context, isFocused, child) {
            return Container(
              padding: const EdgeInsets.all(8),
              decoration: BoxDecoration(
                color: isFocused
                    ? AppTheme.getPrimaryColor(context)
                    : const Color(0x33FFFFFF),
                borderRadius: BorderRadius.circular(10),
                border: Border.all(
                  color: isFocused
                      ? AppTheme.getPrimaryColor(context)
                      : const Color(0x1AFFFFFF),
                  width: isFocused ? 2 : 1,
                ),
              ),
              child: child,
            );
          },
          child: const Icon(Icons.skip_next_rounded,
              color: Colors.white, size: 18),
        ),

      // Source selector (desktop/TV only)
      if (!PlatformDetector.isMobile &&
          provider.currentChannel != null &&
          provider.currentChannel!.hasMultipleSources) ...[
        const SizedBox(width: 8),
        TVFocusable(
          onSelect: () {
            provider.switchToNextSource();
            _showSourceSwitchIndicator(provider);
          },
          focusScale: 1.0,
          showFocusBorder: false,
          builder: (context, isFocused, child) {
            return Container(
              padding: const EdgeInsets.symmetric(
                  horizontal: 10, vertical: 8),
              decoration: BoxDecoration(
                color: isFocused
                    ? AppTheme.getPrimaryColor(context)
                    : const Color(0x33FFFFFF),
                borderRadius: BorderRadius.circular(10),
                border: Border.all(
                  color: isFocused
                      ? AppTheme.getPrimaryColor(context)
                      : const Color(0x1AFFFFFF),
                  width: isFocused ? 2 : 1,
                ),
              ),
              child: child,
            );
          },
          child: Text(
            '${AppStrings.of(context)?.source ?? 'Source'} ${provider.currentSourceIndex}/${provider.sourceCount}',
            style: const TextStyle(color: Colors.white, fontSize: 12),
          ),
        ),
      ],

      const SizedBox(width: 16),

      // Settings button (smaller)
      TVFocusable(
        onSelect: () => _showSettingsSheet(context),
        focusScale: 1.0,
        showFocusBorder: false,
        builder: (context, isFocused, child) {
          return Container(
            padding: const EdgeInsets.all(8),
            decoration: BoxDecoration(
              color: isFocused
                  ? AppTheme.getPrimaryColor(context)
                  : const Color(0x33FFFFFF),
              borderRadius: BorderRadius.circular(10),
              border: Border.all(
                color: isFocused
                    ? AppTheme.getPrimaryColor(context)
                    : const Color(0x1AFFFFFF),
                width: isFocused ? 2 : 1,
              ),
            ),
            child: child,
          );
        },
        child: const Icon(Icons.settings_rounded,
            color: Colors.white, size: 18),
      ),

      const SizedBox(width: 8),

      // Quality track button
      TVFocusable(
        onSelect: () => _showQualityDialog(provider),
        focusScale: 1.0,
        showFocusBorder: false,
        builder: (context, isFocused, child) {
          return Container(
            padding: const EdgeInsets.all(8),
            decoration: BoxDecoration(
              color: isFocused
                  ? AppTheme.getPrimaryColor(context)
                  : const Color(0x33FFFFFF),
              borderRadius: BorderRadius.circular(10),
              border: Border.all(
                color: isFocused
                    ? AppTheme.getPrimaryColor(context)
                    : const Color(0x1AFFFFFF),
                width: isFocused ? 2 : 1,
              ),
            ),
            child: child,
          );
        },
        child: const Icon(Icons.high_quality_rounded,
            color: Colors.white, size: 18),
      ),

      const SizedBox(width: 8),

      // Audio track button
      TVFocusable(
        onSelect: () => _showAudioTrackDialog(provider),
        focusScale: 1.0,
        showFocusBorder: false,
        builder: (context, isFocused, child) {
          return Container(
            padding: const EdgeInsets.all(8),
            decoration: BoxDecoration(
              color: isFocused
                  ? AppTheme.getPrimaryColor(context)
                  : const Color(0x33FFFFFF),
              borderRadius: BorderRadius.circular(10),
              border: Border.all(
                color: isFocused
                    ? AppTheme.getPrimaryColor(context)
                    : const Color(0x1AFFFFFF),
                width: isFocused ? 2 : 1,
              ),
            ),
            child: child,
          );
        },
        child: const Icon(Icons.audiotrack_rounded,
            color: Colors.white, size: 18),
      ),

      const SizedBox(width: 8),

      // Subtitle track button
      TVFocusable(
        onSelect: () => _showSubtitleTrackDialog(provider),
        focusScale: 1.0,
        showFocusBorder: false,
        builder: (context, isFocused, child) {
          return Container(
            padding: const EdgeInsets.all(8),
            decoration: BoxDecoration(
              color: isFocused
                  ? AppTheme.getPrimaryColor(context)
                  : const Color(0x33FFFFFF),
              borderRadius: BorderRadius.circular(10),
              border: Border.all(
                color: isFocused
                    ? AppTheme.getPrimaryColor(context)
                    : const Color(0x1AFFFFFF),
                width: isFocused ? 2 : 1,
              ),
            ),
            child: child,
          );
        },
        child: const Icon(Icons.subtitles_rounded,
            color: Colors.white, size: 18),
      ),

      const SizedBox(width: 16),

      // Chromecast (Android phone only)
      if (PlatformDetector.isAndroid && !PlatformDetector.isTV) ...[
        TVFocusable(
          onSelect: () => _handleChromecastAction(provider),
          focusScale: 1.0,
          showFocusBorder: false,
          builder: (context, isFocused, child) {
            return Container(
              padding: const EdgeInsets.all(8),
              decoration: BoxDecoration(
                color: isFocused
                    ? AppTheme.getPrimaryColor(context)
                    : const Color(0x33FFFFFF),
                borderRadius: BorderRadius.circular(10),
                border: Border.all(
                  color: isFocused
                      ? AppTheme.getPrimaryColor(context)
                      : const Color(0x1AFFFFFF),
                  width: isFocused ? 2 : 1,
                ),
              ),
              child: child,
            );
          },
          child: const Icon(Icons.cast_rounded,
              color: Colors.white, size: 18),
        ),
        const SizedBox(width: 16),
      ],

      // Category menu button
      TVFocusable(
        onSelect: () {
          setState(() {
            if (_showCategoryPanel) {
              _showCategoryPanel = false;
              _selectedCategory = null;
            } else {
              final playerProvider = context.read<PlayerProvider>();
              final channelProvider = context.read<ChannelProvider>();
              final currentChannel = playerProvider.currentChannel;

              _showCategoryPanel = true;
              if (currentChannel != null &&
                  currentChannel.groupName != null) {
                _selectedCategory = currentChannel.groupName;

                WidgetsBinding.instance.addPostFrameCallback((_) {
                  if (_selectedCategory != null) {
                    final channels = channelProvider
                        .getChannelsByGroup(_selectedCategory!);
                    final currentIndex = channels.indexWhere(
                        (ch) => ch.id == currentChannel.id);

                    if (currentIndex >= 0 &&
                        _channelScrollController.hasClients) {
                      const itemHeight = 44.0;
                      final scrollOffset = currentIndex * itemHeight;

                      _channelScrollController.animateTo(
                        scrollOffset,
                        duration: const Duration(milliseconds: 300),
                        curve: Curves.easeOut,
                      );
                    }
                  }
                });
              } else {
                _selectedCategory = null;
              }
            }
          });
        },
        focusScale: 1.0,
        showFocusBorder: false,
        builder: (context, isFocused, child) {
          return Container(
            padding: const EdgeInsets.all(8),
            decoration: BoxDecoration(
              color: isFocused
                  ? AppTheme.getPrimaryColor(context)
                  : const Color(0x33FFFFFF),
              borderRadius: BorderRadius.circular(10),
              border: Border.all(
                color: isFocused
                    ? AppTheme.getPrimaryColor(context)
                    : const Color(0x1AFFFFFF),
                width: isFocused ? 2 : 1,
              ),
            ),
            child: child,
          );
        },
        child: const Icon(Icons.menu_rounded,
            color: Colors.white, size: 18),
      ),

      // Windows / macOS fullscreen
      if (PlatformDetector.isWindows ||
          PlatformDetector.isMacOS) ...[
        const SizedBox(width: 16),
        TVFocusable(
          onSelect: () {
            _toggleFullScreen();
            Future.delayed(const Duration(milliseconds: 120), () {
              if (mounted) _playerFocusNode.requestFocus();
            });
          },
          focusScale: 1.0,
          showFocusBorder: false,
          builder: (context, isFocused, child) {
            return Container(
              padding: const EdgeInsets.all(8),
              decoration: BoxDecoration(
                color: isFocused
                    ? AppTheme.getPrimaryColor(context)
                    : const Color(0x33FFFFFF),
                borderRadius: BorderRadius.circular(10),
                border: Border.all(
                  color: isFocused
                      ? AppTheme.getPrimaryColor(context)
                      : const Color(0x1AFFFFFF),
                  width: isFocused ? 2 : 1,
                ),
              ),
              child: child,
            );
          },
          child: Icon(
              _isFullScreen
                  ? Icons.fullscreen_exit_rounded
                  : Icons.fullscreen_rounded,
              color: Colors.white,
              size: 18),
        ),
      ],
    ];
  }

  Widget _buildVolumeControl(PlayerProvider provider) {
    //  0-1
    final volume = provider.volume.clamp(0.0, 1.0);

    return Row(
      mainAxisSize: MainAxisSize.min,
      children: [
        TVFocusable(
          onSelect: provider.toggleMute,
          focusScale: 1.0,
          showFocusBorder: false,
          builder: (context, isFocused, child) {
            return Container(
              padding: const EdgeInsets.all(8),
              decoration: BoxDecoration(
                color: isFocused
                    ? AppTheme.getPrimaryColor(context)
                    : const Color(0x33FFFFFF),
                borderRadius: BorderRadius.circular(8),
                border: Border.all(
                  color: isFocused
                      ? AppTheme.getPrimaryColor(context)
                      : const Color(0x1AFFFFFF),
                  width: isFocused ? 2 : 1,
                ),
              ),
              child: child,
            );
          },
          child: Icon(
            provider.isMuted || volume == 0
                ? Icons.volume_off_rounded
                : volume < 0.5
                    ? Icons.volume_down_rounded
                    : Icons.volume_up_rounded,
            color: Colors.white,
            size: 16,
          ),
        ),
        const SizedBox(width: 6),
        SizedBox(
          width: 70,
          child: SliderTheme(
            data: SliderTheme.of(context).copyWith(
              trackHeight: 2,
              thumbShape: const RoundSliderThumbShape(enabledThumbRadius: 4),
              overlayShape: const RoundSliderOverlayShape(overlayRadius: 8),
            ),
            child: Slider(
              value: provider.isMuted ? 0 : volume,
              onChanged: (value) {
                //
                if (provider.isMuted && value > 0) {
                  provider.toggleMute();
                }
                provider.setVolume(value);
              },
              activeColor: AppTheme.getPrimaryColor(context),
              inactiveColor: const Color(0x33FFFFFF),
            ),
          ),
        ),
      ],
    );
  }

  // ㄥ (?Windows)
  void _toggleFullScreen() {
    if (!PlatformDetector.isWindows && !PlatformDetector.isMacOS) return;

    // €
    final now = DateTime.now();
    if (_lastFullScreenToggle != null &&
        now.difference(_lastFullScreenToggle!).inMilliseconds < 200) {
      return;
    }
    _lastFullScreenToggle = now;

    if (PlatformDetector.isWindows) {
      //  Windows API ㄥ
      final success = WindowsFullscreenNative.toggleFullScreen();

      if (success) {
        // UI
        Future.microtask(() {
          if (mounted) {
            setState(() {
              _isFullScreen = WindowsFullscreenNative.isFullScreen();
            });
            _playerFocusNode.requestFocus();
          }
        });
      } else {
        //  API  window_manager
        ServiceLocator.log
            .d('Native fullscreen failed, falling back to window_manager');
        windowManager
            .isFullScreen()
            .then((value) => windowManager.setFullScreen(!value));

        Future.microtask(() {
          if (mounted) {
            windowManager.isFullScreen().then((isFullScreen) {
              if (mounted) {
                setState(() {
                  _isFullScreen = isFullScreen;
                });
                _playerFocusNode.requestFocus();
              }
            });
          }
        });
      }
      return;
    }

    // macOS: window_manager native fullscreen
    MacOSFullscreen.isFullscreen().then((isFullScreen) async {
      if (isFullScreen) {
        await MacOSFullscreen.exitFullscreen();
      } else {
        await MacOSFullscreen.enterFullscreen();
      }
      if (mounted) {
        setState(() {
          _isFullScreen = !isFullScreen;
        });
        _playerFocusNode.requestFocus();
      }
    });
  }

  void _showSettingsSheet(BuildContext context) {
    showModalBottomSheet(
      context: context,
      backgroundColor: AppTheme.getSurfaceColor(context),
      shape: const RoundedRectangleBorder(
        borderRadius: BorderRadius.vertical(top: Radius.circular(20)),
      ),
      builder: (context) {
        return Consumer<PlayerProvider>(
          builder: (context, provider, _) {
            return Padding(
              padding: const EdgeInsets.all(24),
              child: Column(
                mainAxisSize: MainAxisSize.min,
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(
                    AppStrings.of(context)?.playbackSettings ??
                        'Playback Settings',
                    style: const TextStyle(
                      color: AppTheme.textPrimary,
                      fontSize: 20,
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                  const SizedBox(height: 24),

                  // Playback Speed
                  Text(
                    AppStrings.of(context)?.playbackSpeed ?? 'Playback Speed',
                    style: const TextStyle(
                      color: AppTheme.textSecondary,
                      fontSize: 14,
                    ),
                  ),
                  const SizedBox(height: 8),
                  Wrap(
                    spacing: 8,
                    children: [0.5, 0.75, 1.0, 1.25, 1.5, 2.0].map((speed) {
                      final isSelected = provider.playbackSpeed == speed;
                      return ChoiceChip(
                        label: Text('${speed}x'),
                        selected: isSelected,
                        onSelected: (_) => provider.setPlaybackSpeed(speed),
                        selectedColor: AppTheme.getPrimaryColor(context),
                        backgroundColor: AppTheme.cardColor,
                        labelStyle: TextStyle(
                          color: isSelected
                              ? Colors.white
                              : AppTheme.textSecondary,
                        ),
                      );
                    }).toList(),
                  ),

                  const SizedBox(height: 24),
                ],
              ),
            );
          },
        );
      },
    );
  }

  Widget _buildCategoryPanel() {
    final channelProvider = context.read<ChannelProvider>();
    final groups = channelProvider.groups;
    return Positioned(
      left: 0,
      top: 0,
      bottom: 0,
      child: Row(
        children: [
          //
          Container(
            width: 180,
            decoration: const BoxDecoration(
              gradient: LinearGradient(
                begin: Alignment.centerLeft,
                end: Alignment.centerRight,
                colors: [
                  Color(0xE6000000),
                  Color(0x99000000),
                  Colors.transparent,
                ],
                stops: [0.0, 0.7, 1.0],
              ),
            ),
            child: SafeArea(
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Padding(
                    padding: const EdgeInsets.fromLTRB(16, 16, 16, 8),
                    child: Text(
                      AppStrings.of(context)?.categories ?? 'Categories',
                      style: const TextStyle(
                        color: Colors.white,
                        fontSize: 16,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                  ),
                  Expanded(
                    child: ListView.builder(
                      controller: _categoryScrollController,
                      padding: const EdgeInsets.symmetric(vertical: 8),
                      itemCount: groups.length,
                      itemBuilder: (context, index) {
                        final group = groups[index];
                        final isSelected = _selectedCategory == group.name;
                        return TVFocusable(
                          autofocus: index == 0 && _selectedCategory == null,
                          onSelect: () {
                            setState(() {
                              _selectedCategory = group.name;
                            });
                          },
                          focusScale: 1.0,
                          showFocusBorder: false,
                          builder: (context, isFocused, child) {
                            return Container(
                              margin: const EdgeInsets.symmetric(
                                  horizontal: 8, vertical: 2),
                              padding: const EdgeInsets.symmetric(
                                  horizontal: 12, vertical: 10),
                              decoration: BoxDecoration(
                                gradient: (isFocused || isSelected)
                                    ? AppTheme.getGradient(context)
                                    : null,
                                color: (isFocused || isSelected)
                                    ? null
                                    : Colors.transparent,
                                borderRadius: BorderRadius.circular(8),
                              ),
                              child: child,
                            );
                          },
                          child: Row(
                            children: [
                              Expanded(
                                child: Text(
                                  group.name,
                                  style: const TextStyle(
                                      color: Colors.white, fontSize: 13),
                                  maxLines: 1,
                                  overflow: TextOverflow.ellipsis,
                                ),
                              ),
                              Text(
                                '${group.channelCount}',
                                style: const TextStyle(
                                    color: Color(0x99FFFFFF), fontSize: 11),
                              ),
                            ],
                          ),
                        );
                      },
                    ),
                  ),
                ],
              ),
            ),
          ),
          //
          if (_selectedCategory != null) _buildChannelList(),
        ],
      ),
    );
  }

  Widget _buildChannelList() {
    final channelProvider = context.read<ChannelProvider>();
    final playerProvider = context.read<PlayerProvider>();
    final channels = channelProvider.getChannelsByGroup(_selectedCategory!);
    final currentChannel = playerProvider.currentChannel;

    return Container(
      width: 220,
      decoration: const BoxDecoration(
        gradient: LinearGradient(
          begin: Alignment.centerLeft,
          end: Alignment.centerRight,
          colors: [
            Color(0xCC000000),
            Color(0x66000000),
            Colors.transparent,
          ],
          stops: [0.0, 0.7, 1.0],
        ),
      ),
      child: SafeArea(
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Padding(
              padding: const EdgeInsets.fromLTRB(16, 16, 16, 8),
              child: Row(
                children: [
                  GestureDetector(
                    onTap: () => setState(() => _selectedCategory = null),
                    child: const Icon(Icons.arrow_back_ios,
                        color: Colors.white, size: 14),
                  ),
                  const SizedBox(width: 8),
                  Expanded(
                    child: Text(
                      _selectedCategory!,
                      style: const TextStyle(
                        color: Colors.white,
                        fontSize: 14,
                        fontWeight: FontWeight.bold,
                      ),
                      maxLines: 1,
                      overflow: TextOverflow.ellipsis,
                    ),
                  ),
                ],
              ),
            ),
            Expanded(
              child: ListView.builder(
                controller: _channelScrollController,
                padding: const EdgeInsets.symmetric(vertical: 8),
                itemCount: channels.length,
                itemBuilder: (context, index) {
                  final channel = channels[index];
                  final isPlaying = currentChannel?.id == channel.id;
                  return TVFocusable(
                    autofocus: isPlaying, //
                    onSelect: () {
                      //  ID
                      final settingsProvider = context.read<SettingsProvider>();
                      if (settingsProvider.rememberLastChannel &&
                          channel.id != null) {
                        settingsProvider.setLastChannelId(channel.id);
                      }

                      // 
                      playerProvider.playChannel(channel);
                      // ㈡
                      setState(() {
                        _showCategoryPanel = false;
                        _selectedCategory = null;
                      });
                    },
                    focusScale: 1.0,
                    showFocusBorder: false,
                    builder: (context, isFocused, child) {
                      return Container(
                        margin: const EdgeInsets.symmetric(
                            horizontal: 8, vertical: 2),
                        padding: const EdgeInsets.symmetric(
                            horizontal: 12, vertical: 10),
                        decoration: BoxDecoration(
                          gradient:
                              isFocused ? AppTheme.getGradient(context) : null,
                          color: isPlaying && !isFocused
                              ? const Color(0x33E91E63)
                              : Colors.transparent,
                          borderRadius: BorderRadius.circular(8),
                        ),
                        child: child,
                      );
                    },
                    child: Row(
                      children: [
                        if (isPlaying)
                          Padding(
                            padding: const EdgeInsets.only(right: 8),
                            child: Icon(Icons.play_arrow,
                                color: AppTheme.getPrimaryColor(context),
                                size: 16),
                          ),
                        Expanded(
                          child: Text(
                            channel.name,
                            style: TextStyle(
                              color: isPlaying
                                  ? AppTheme.getPrimaryColor(context)
                                  : Colors.white,
                              fontSize: 13,
                              fontWeight: isPlaying
                                  ? FontWeight.bold
                                  : FontWeight.normal,
                            ),
                            maxLines: 1,
                            overflow: TextOverflow.ellipsis,
                          ),
                        ),
                      ],
                    ),
                  );
                },
              ),
            ),
          ],
        ),
      ),
    );
  }
}

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter_localizations/flutter_localizations.dart';
import 'package:provider/provider.dart';
import 'package:media_kit/media_kit.dart';
import 'package:window_manager/window_manager.dart';
import 'core/i18n/app_strings.dart';

import 'dart:io';
import 'package:sqflite_common_ffi/sqflite_ffi.dart';

import 'core/theme/app_theme.dart';
import 'core/navigation/app_router.dart';
import 'core/services/service_locator.dart';
import 'core/services/auto_refresh_service.dart';
import 'core/services/native_log_channel.dart';
import 'core/platform/native_player_channel.dart';
import 'core/platform/platform_detector.dart';
import 'core/widgets/channel_logo_widget.dart';
import 'features/channels/providers/channel_provider.dart';
import 'features/player/providers/player_provider.dart';
import 'features/playlist/providers/playlist_provider.dart';
import 'features/favorites/providers/favorites_provider.dart';
import 'features/settings/providers/settings_provider.dart';
import 'features/settings/providers/dlna_provider.dart';
import 'features/epg/providers/epg_provider.dart';
import 'features/multi_screen/providers/multi_screen_provider.dart';
import 'core/widgets/window_title_bar.dart';

void main() async {
  try {
    WidgetsFlutterBinding.ensureInitialized();

    // Initialize critical services FIRST (before any logging)
    await ServiceLocator.initPrefs();

    // Now we can set up error handlers that use logging
    FlutterError.onError = (FlutterErrorDetails details) {
      FlutterError.presentError(details);
      // Use debugPrint as fallback if log service fails
      try {
        if (ServiceLocator.isLogInitialized) {
          ServiceLocator.log.e('Flutter Error: ${details.exception}');
          ServiceLocator.log.e('Stack trace: ${details.stack}');
        } else {
          debugPrint('Flutter Error: ${details.exception}');
          debugPrint('Stack trace: ${details.stack}');
        }
      } catch (e) {
        debugPrint('Flutter Error: ${details.exception}');
        debugPrint('Stack trace: ${details.stack}');
      }
    };

    // Initialize MediaKit
    MediaKit.ensureInitialized();

    // Initialize native player channel for Android TV
    NativePlayerChannel.init();
    
    // Initialize native log channel for Android TV only
    if (Platform.isAndroid) {
      await NativeLogChannel.init();
    }

    // Initialize Windows/Linux/macOS Database Engine
    if (Platform.isWindows || Platform.isLinux || Platform.isMacOS) {
      sqfliteFfiInit();
      databaseFactory = databaseFactoryFfi;
    }

    // Initialize window manager for Windows
    if (Platform.isWindows) {
      await windowManager.ensureInitialized();

      WindowOptions windowOptions = const WindowOptions(
        size: Size(1280, 720),
        minimumSize: Size(360, 600),
        center: true,
        backgroundColor: Colors.black,
        titleBarStyle: TitleBarStyle.hidden,
        windowButtonVisibility: false,
      );

      await windowManager.waitUntilReadyToShow(windowOptions, () async {
        await windowManager.show();
        await windowManager.focus();
      });
    }

    // Initialize PlatformDetector for settings page
    await PlatformDetector.init();
    
    // ✅ Inicializar el pool de conexiones HTTP para la carga de logos
    initializeLogoConnectionPool();

    // La orientación inicial se aplicará después de construir MaterialApp según la configuración
    // Permitir todas las orientaciones temporalmente para evitar restricciones al iniciar
    await SystemChrome.setPreferredOrientations([
      DeviceOrientation.portraitUp,
      DeviceOrientation.landscapeLeft,
      DeviceOrientation.landscapeRight,
    ]);

    // Set system UI overlay style
    SystemChrome.setSystemUIOverlayStyle(
      const SystemUiOverlayStyle(
        statusBarColor: Colors.transparent,
        statusBarIconBrightness: Brightness.light,
        systemNavigationBarColor: Colors.black,
        systemNavigationBarIconBrightness: Brightness.light,
      ),
    );

    runApp(const FlutterIPTVApp());
  } catch (e, stackTrace) {
    // Use debugPrint as fallback if log service is not initialized
    debugPrint('Fatal error during app initialization: $e');
    debugPrint('Stack trace: $stackTrace');

    // Show an error dialog for Windows
    runApp(MaterialApp(
      home: Scaffold(
        backgroundColor: Colors.black,
        body: Center(
          child: Padding(
            padding: const EdgeInsets.all(32),
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                const Icon(Icons.error_outline, color: Colors.red, size: 64),
                const SizedBox(height: 16),
                const Text(
                  'Application Failed to Start',
                  style: TextStyle(
                      color: Colors.white,
                      fontSize: 24,
                      fontWeight: FontWeight.bold),
                ),
                const SizedBox(height: 16),
                Text(
                  'Error: $e',
                  style: const TextStyle(color: Colors.white70, fontSize: 14),
                  textAlign: TextAlign.center,
                ),
                const SizedBox(height: 24),
                SelectableText(
                  stackTrace.toString(),
                  style: const TextStyle(color: Colors.white54, fontSize: 10),
                ),
              ],
            ),
          ),
        ),
      ),
    ));
  }
}

class FlutterIPTVApp extends StatefulWidget {
  const FlutterIPTVApp({super.key});

  @override
  State<FlutterIPTVApp> createState() => _FlutterIPTVAppState();
}

class _FlutterIPTVAppState extends State<FlutterIPTVApp> {
  @override
  Widget build(BuildContext context) {
    return MultiProvider(
      providers: [
        ChangeNotifierProvider(create: (_) => SettingsProvider()),
        ChangeNotifierProvider(create: (_) => PlaylistProvider()),
        ChangeNotifierProvider(create: (_) => ChannelProvider()),
        ChangeNotifierProvider(create: (_) => PlayerProvider()),
        ChangeNotifierProvider(create: (_) => FavoritesProvider()),
        ChangeNotifierProvider(create: (_) => EpgProvider()),
        ChangeNotifierProvider(create: (_) => DlnaProvider()),
        ChangeNotifierProvider(create: (_) => MultiScreenProvider()),
      ],
      child: Consumer<SettingsProvider>(
        builder: (context, settings, _) {
          return _DlnaAwareApp(settings: settings);
        },
      ),
    );
  }
}

/// Envuelve MaterialApp, escucha solicitudes DLNA y gestiona el servicio de auto-refresco
class _DlnaAwareApp extends StatefulWidget {
  final SettingsProvider settings;

  const _DlnaAwareApp({required this.settings});

  @override
  State<_DlnaAwareApp> createState() => _DlnaAwareAppState();
}

class _DlnaAwareAppState extends State<_DlnaAwareApp> with WindowListener {
  final GlobalKey<NavigatorState> _navigatorKey = GlobalKey<NavigatorState>();
  String? _currentDlnaUrl; // URL actualmente reproducido por DLNA

  // Servicio de auto-refresco
  final AutoRefreshService _autoRefreshService = AutoRefreshService();
  bool _lastAutoRefreshState = false;
  int _lastRefreshInterval = 24;

  @override
  void initState() {
    super.initState();
    ServiceLocator.log.d('_DlnaAwareApp.initState() llamado', tag: 'AutoRefresh');

    // Listener de cierre de ventana en Windows
    if (Platform.isWindows) {
      windowManager.addListener(this);
    }
    // Crear inmediatamente DlnaProvider (iniciará DLNA automáticamente)
    // Usar addPostFrameCallback para asegurar que el context esté disponible
    WidgetsBinding.instance.addPostFrameCallback((_) {
      ServiceLocator.log.d('addPostFrameCallback invocado', tag: 'DLNA');
      _setupDlnaCallbacks();
      // 
      ServiceLocator.log.d('addPostFrameCallback ejecutado', tag: 'AutoRefresh');
      _initAutoRefresh();
      // 
      _applyOrientationSettings();
    });
  }

  /// 
  Future<void> _applyOrientationSettings() async {
    if (!PlatformDetector.isMobile) return;

    final settings = context.read<SettingsProvider>();
    final orientation = settings.mobileOrientation;

    List<DeviceOrientation> orientations;
    switch (orientation) {
      case 'landscape':
        orientations = [
          DeviceOrientation.landscapeLeft,
          DeviceOrientation.landscapeRight,
        ];
        break;
      case 'portrait':
        orientations = [
          DeviceOrientation.portraitUp,
        ];
        break;
      case 'auto':
      default:
        orientations = [
          DeviceOrientation.portraitUp,
          DeviceOrientation.landscapeLeft,
          DeviceOrientation.landscapeRight,
        ];
        break;
    }

    await SystemChrome.setPreferredOrientations(orientations);
    ServiceLocator.log.d('Aplicar configuración de orientación: $orientation', tag: 'Orientation');
  }

  @override
  void dispose() {
    if (Platform.isWindows) {
      windowManager.removeListener(this);
    }
    _autoRefreshService.stop();
    super.dispose();
  }

  Future<void> _initAutoRefresh() async {
    ServiceLocator.log.d('_initAutoRefresh() inicio', tag: 'AutoRefresh');

    if (!mounted) {
      ServiceLocator.log.d('Widget no montado, saliendo de inicialización', tag: 'AutoRefresh');
      return;
    }

    try {
      // 
      await _autoRefreshService.loadLastRefreshTime();

      // 
      final settings = context.read<SettingsProvider>();
      _lastAutoRefreshState = settings.autoRefresh;
      _lastRefreshInterval = settings.refreshInterval;

      ServiceLocator.log.d(
          ' - autoRefresh=${settings.autoRefresh}, interval=${settings.refreshInterval}',
          tag: 'AutoRefresh');

      if (settings.autoRefresh) {
        ServiceLocator.log
            .d(': ${settings.refreshInterval}', tag: 'AutoRefresh');
        _startAutoRefresh(settings);
      } else {
        ServiceLocator.log.d('', tag: 'AutoRefresh');
      }

      // 
      settings.addListener(() {
        if (!mounted) return;

        //  autoRefresh 
        final currentAutoRefresh = settings.autoRefresh;
        final currentInterval = settings.refreshInterval;

        if (currentAutoRefresh != _lastAutoRefreshState ||
            (currentAutoRefresh && currentInterval != _lastRefreshInterval)) {
          _lastAutoRefreshState = currentAutoRefresh;
          _lastRefreshInterval = currentInterval;

          if (currentAutoRefresh) {
            ServiceLocator.log
                .d(' - : $currentInterval', tag: 'AutoRefresh');
            _startAutoRefresh(settings);
          } else {
            ServiceLocator.log.d('', tag: 'AutoRefresh');
            _autoRefreshService.stop();
          }
        }
      });

      ServiceLocator.log.d('_initAutoRefresh() ', tag: 'AutoRefresh');
    } catch (e, stackTrace) {
      ServiceLocator.log.d(' - $e', tag: 'AutoRefresh');
      ServiceLocator.log.d(' - $stackTrace', tag: 'AutoRefresh');
    }
  }

  void _startAutoRefresh(SettingsProvider settings) {
    _autoRefreshService.start(
      intervalHours: settings.refreshInterval,
      onRefresh: () => _performAutoRefresh(),
    );
  }

  Future<void> _performAutoRefresh() async {
    if (!mounted) return;

    ServiceLocator.log.d('', tag: 'AutoRefresh');

    try {
      final playlistProvider = context.read<PlaylistProvider>();
      final settings = context.read<SettingsProvider>();
      final playlists = playlistProvider.playlists;

      if (playlists.isEmpty) {
        ServiceLocator.log.d('', tag: 'AutoRefresh');
        return;
      }

      int successCount = 0;
      int failCount = 0;

      String? lastError;

      // 
      for (final playlist in playlists) {
        if (playlist.id != null) {
          try {
            ServiceLocator.log
                .d(': ${playlist.name}', tag: 'AutoRefresh');
            final success = await playlistProvider.refreshPlaylist(playlist, mergeRule: settings.channelMergeRule);
            if (success) {
              successCount++;
            } else {
              failCount++;
              lastError = playlistProvider.error; // Get the error from provider
              ServiceLocator.log
                  .d(': ${playlist.name}', tag: 'AutoRefresh');
            }
          } catch (e) {
            failCount++;
            lastError = e.toString();
            ServiceLocator.log
                .d(': ${playlist.name} - $e', tag: 'AutoRefresh');
          }
        }
      }

      // 
      if (playlistProvider.activePlaylist?.id != null) {
        try {
          final channelProvider = context.read<ChannelProvider>();
          await channelProvider
              .loadChannels(playlistProvider.activePlaylist!.id!);
        } catch (e) {
          ServiceLocator.log.d(': $e', tag: 'AutoRefresh');
        }
      }

      ServiceLocator.log
          .d(' - : $successCount, : $failCount', tag: 'AutoRefresh');

      // 
      if (failCount > 0) {
        ServiceLocator.log.d('', tag: 'AutoRefresh');

        // Show error to user if mounted
        if (mounted) {
          String message = AppStrings.of(context)?.playlistRefreshFailed ??
              'Playlist refresh failed';
          if (lastError != null) {
            // Clean up error message
            String displayError = lastError.replaceAll('Exception:', '').trim();
            message = '$message: $displayError';
          }

          ScaffoldMessenger.of(context).showSnackBar(
            SnackBar(
              content: Text(message),
              backgroundColor: Colors.red,
              duration: const Duration(seconds: 5),
              action: SnackBarAction(
                label: AppStrings.of(context)?.close ?? 'Close',
                textColor: Colors.white,
                onPressed: () {
                  ScaffoldMessenger.of(context).hideCurrentSnackBar();
                },
              ),
            ),
          );
        }
      }
    } catch (e) {
      ServiceLocator.log.d(': $e', tag: 'AutoRefresh');
      // 
    }
  }

  @override
  void onWindowClose() async {
    //  DLNA 
    try {
      final dlnaProvider = context.read<DlnaProvider>();
      await dlnaProvider.setEnabled(false);
      ServiceLocator.log.d('', tag: 'DLNA');
    } catch (e) {
      // 
    }
    await windowManager.destroy();
  }

  void _setupDlnaCallbacks() {
    final dlnaProvider = context.read<DlnaProvider>();
    dlnaProvider.onPlayRequested = _handleDlnaPlay;
    dlnaProvider.onPauseRequested = _handleDlnaPause;
    dlnaProvider.onStopRequested = _handleDlnaStop;
    dlnaProvider.onSeekRequested = _handleDlnaSeek;
    dlnaProvider.onVolumeRequested = _handleDlnaVolume;
    ServiceLocator.log.d('Provider ', tag: 'DLNA');
  }

  void _handleDlnaPlay(String url, String? title) async {
    //  URL
    if (_currentDlnaUrl == url) {
      return;
    }

    // 
    try {
      final playerProvider = context.read<PlayerProvider>();
      playerProvider.stop();

      // 
      final multiScreenProvider = context.read<MultiScreenProvider>();
      await multiScreenProvider.clearAllScreens();
    } catch (e) {
      ServiceLocator.log.d(' - $e', tag: 'DLNA');
    }

    // 
    _navigatorKey.currentState?.popUntil((route) => route.isFirst);

    _currentDlnaUrl = url;
    ServiceLocator.log.d(' - ${title ?? url}', tag: 'DLNA');
    _navigatorKey.currentState?.pushNamed(
      AppRouter.player,
      arguments: {
        'channelUrl': url,
        'channelName': title ?? 'DLNA Cast',
        'channelLogo': null,
      },
    );
  }

  void _handleDlnaPause() {
    try {
      // Android TV 
      if (PlatformDetector.isTV && PlatformDetector.isAndroid) {
        NativePlayerChannel.pause();
      } else {
        final playerProvider = context.read<PlayerProvider>();
        playerProvider.pause();
      }
    } catch (e) {
      // 
    }
  }

  void _handleDlnaStop() {
    _currentDlnaUrl = null;
    try {
      // Android TV 
      if (PlatformDetector.isTV && PlatformDetector.isAndroid) {
        // closePlayer  onClosed 
        NativePlayerChannel.closePlayer();
        //  popUntilonClosed 
      } else {
        final playerProvider = context.read<PlayerProvider>();
        playerProvider.stop();
        _navigatorKey.currentState?.popUntil((route) => route.isFirst);
      }
    } catch (e) {
      // 
    }
  }

  void _handleDlnaSeek(Duration position) {
    try {
      // Android TV 
      if (PlatformDetector.isTV && PlatformDetector.isAndroid) {
        NativePlayerChannel.seekTo(position.inMilliseconds);
      } else {
        final playerProvider = context.read<PlayerProvider>();
        playerProvider.seek(position);
      }
    } catch (e) {
      // 
    }
  }

  void _handleDlnaVolume(int volume) {
    try {
      // Android TV 
      if (PlatformDetector.isTV && PlatformDetector.isAndroid) {
        NativePlayerChannel.setVolume(volume);
      } else {
        final playerProvider = context.read<PlayerProvider>();
        playerProvider.setVolume(volume / 100.0);
      }
    } catch (e) {
      // 
    }
  }

  @override
  Widget build(BuildContext context) {
    //  settings 
    return Consumer<SettingsProvider>(
      builder: (context, settings, _) {
        ServiceLocator.log.d(
            '${settings.darkColorScheme}, : ${settings.lightColorScheme}, : ${settings.themeMode}, : ${settings.fontFamily}',
            tag: 'MaterialApp  - ');
        final fontFamily = AppTheme.resolveFontFamily(settings.fontFamily);
        return MaterialApp(
          navigatorKey: _navigatorKey,
          navigatorObservers: [AppRouter.routeObserver], // 
          title: AppStrings.of(context)?.lotusIptv ?? 'VoXtv',
          debugShowCheckedModeBanner: false,
          theme: AppThemeDynamic.getLightTheme(
              settings.lightColorScheme, fontFamily),
          darkTheme: AppThemeDynamic.getDarkTheme(
              settings.darkColorScheme, fontFamily),
          themeMode: settings.themeMode == 'light'
              ? ThemeMode.light
              : settings.themeMode == 'system'
                  ? ThemeMode.system
                  : ThemeMode.dark,
          locale: settings.locale,
          supportedLocales: const [
            Locale('en', ''),
            Locale('es', ''),
          ],
          localizationsDelegates: const [
            AppStrings.delegate,
            GlobalMaterialLocalizations.delegate,
            GlobalWidgetsLocalizations.delegate,
            GlobalCupertinoLocalizations.delegate,
          ],
          // Use shortcuts for TV remote support
          shortcuts: <ShortcutActivator, Intent>{
            ...WidgetsApp.defaultShortcuts,
            const SingleActivator(LogicalKeyboardKey.select):
                const ActivateIntent(),
            const SingleActivator(LogicalKeyboardKey.enter):
                const ActivateIntent(),
          },
          onGenerateRoute: AppRouter.generateRoute,
          initialRoute: AppRouter.splash,
          builder: (context, child) {
            return MediaQuery(
              data: MediaQuery.of(context).copyWith(
                textScaler: const TextScaler.linear(1.0),
              ),
              child: Platform.isWindows
                  ? Stack(
                      children: [
                        child!,
                        const WindowTitleBar(),
                      ],
                    )
                  : child!,
            );
          },
        );
      },
    );
  }
}

import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../../../core/theme/app_theme.dart';
import '../../../core/navigation/app_router.dart';
import '../../../core/services/service_locator.dart';
import '../../../core/services/auto_refresh_service.dart';
import '../../../core/platform/tv_detection_channel.dart';
import '../../../core/platform/platform_detector.dart';
import '../../../core/i18n/app_strings.dart';
import '../../playlist/providers/playlist_provider.dart';
import '../../player/providers/player_provider.dart';

class SplashScreen extends StatefulWidget {
  const SplashScreen({super.key});

  @override
  State<SplashScreen> createState() => _SplashScreenState();
}

class _SplashScreenState extends State<SplashScreen> with TickerProviderStateMixin {
  late AnimationController _logoController;
  late AnimationController _textController;
  late AnimationController _ambientController;
  late Animation<double> _logoScale;
  late Animation<double> _logoOpacity;
  late Animation<Offset> _logoSlide;
  late Animation<double> _textOpacity;
  late Animation<Offset> _textSlide;
  late Animation<double> _ambientPulse;
  late Animation<double> _ambientRingScale;
  late Animation<double> _ambientRingOpacity;
  late Animation<double> _loadingShimmer;

  @override
  void initState() {
    super.initState();
    _logoController = AnimationController(duration: const Duration(milliseconds: 1200), vsync: this);
    _textController = AnimationController(duration: const Duration(milliseconds: 800), vsync: this);
    _ambientController = AnimationController(duration: const Duration(milliseconds: 2800), vsync: this);

    _logoScale = Tween<double>(begin: 0.72, end: 1.0).animate(CurvedAnimation(parent: _logoController, curve: Curves.easeOutBack));
    _logoOpacity = Tween<double>(begin: 0.0, end: 1.0).animate(CurvedAnimation(parent: _logoController, curve: const Interval(0.0, 0.5, curve: Curves.easeOut)));
    _logoSlide = Tween<Offset>(begin: const Offset(0, 0.18), end: Offset.zero).animate(CurvedAnimation(parent: _logoController, curve: Curves.easeOutCubic));
    _textOpacity = Tween<double>(begin: 0.0, end: 1.0).animate(CurvedAnimation(parent: _textController, curve: Curves.easeOut));
    _textSlide = Tween<Offset>(begin: const Offset(0, 0.5), end: Offset.zero).animate(CurvedAnimation(parent: _textController, curve: Curves.easeOutCubic));
    _ambientPulse = TweenSequence<double>([
      TweenSequenceItem(tween: Tween(begin: 0.97, end: 1.03), weight: 50),
      TweenSequenceItem(tween: Tween(begin: 1.03, end: 0.97), weight: 50),
    ]).animate(CurvedAnimation(parent: _ambientController, curve: Curves.easeInOut));
    _ambientRingScale = Tween<double>(begin: 0.9, end: 1.35).animate(CurvedAnimation(parent: _ambientController, curve: Curves.easeOut));
    _ambientRingOpacity = Tween<double>(begin: 0.28, end: 0.0).animate(CurvedAnimation(parent: _ambientController, curve: Curves.easeOut));
    _loadingShimmer = Tween<double>(begin: -1.1, end: 1.1).animate(CurvedAnimation(parent: _ambientController, curve: Curves.easeInOut));

    _ambientController.repeat();

    _startAnimations();
  }

  Future<void> _startAnimations() async {
    _logoController.forward();
    await Future.delayed(const Duration(milliseconds: 600));
    _textController.forward();
    await _initializeApp();
  }

  Future<void> _initializeApp() async {
    ServiceLocator.log.i('开始初始化应用服务', tag: 'SplashScreen');
    final startTime = DateTime.now();
    
    try {
      // Initialize core services
      ServiceLocator.log.d('初始化核心服务...', tag: 'SplashScreen');
      await ServiceLocator.init();
      ServiceLocator.log.d('初始化 TV 检测...', tag: 'SplashScreen');
      await TVDetectionChannel.initialize();

      // Load data
      if (mounted) {
        ServiceLocator.log.d('加载播放列表数据...', tag: 'SplashScreen');
        final playlistProvider = context.read<PlaylistProvider>();
        await playlistProvider.loadPlaylists();
        
        ServiceLocator.log.d('播放列表加载完成: ${playlistProvider.playlists.length} 个', tag: 'SplashScreen');
        
        // 播放列表加载完成后，通知自动刷新服务进行检查
        AutoRefreshService().checkOnStartup();
        
        // 预热播放器 - Windows 桌面端提前初始化播放器,避免首次进入播放页面卡顿
        if (PlatformDetector.isDesktop) {
          ServiceLocator.log.d('预热播放器...', tag: 'SplashScreen');
          final playerProvider = context.read<PlayerProvider>();
          // 异步预热,不阻塞启动流程
          playerProvider.warmup().catchError((e) {
            ServiceLocator.log.d('播放器预热失败 (不影响使用): $e', tag: 'SplashScreen');
          });
        }
      }
      
      final initTime = DateTime.now().difference(startTime).inMilliseconds;
      ServiceLocator.log.i('应用初始化完成，耗时: ${initTime}ms', tag: 'SplashScreen');
    } catch (e) {
      ServiceLocator.log.e('应用初始化失败', tag: 'SplashScreen', error: e);
    }

    // Ensure minimum splash display time
    await Future.delayed(const Duration(milliseconds: 1500));

    if (mounted) {
      // 使用 pushReplacementNamed 替换 splash，这样退出时不会显示 splash
      Navigator.of(context).pushReplacementNamed(AppRouter.home);
    }
  }

  @override
  void dispose() {
    _logoController.dispose();
    _textController.dispose();
    _ambientController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    final primaryColor = AppTheme.getPrimaryColor(context);
    
    return Scaffold(
      backgroundColor: AppTheme.getBackgroundColor(context),
      body: Container(
        decoration: BoxDecoration(
          gradient: LinearGradient(
            begin: Alignment.topLeft,
            end: Alignment.bottomRight,
            colors: [
              AppTheme.getBackgroundColor(context),
              AppTheme.getBackgroundColor(context).withOpacity(0.8),
              primaryColor.withOpacity(0.05),
            ],
          ),
        ),
        child: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              // OTT-style animated logo with ambient pulse
              AnimatedBuilder(
                animation: Listenable.merge([_logoController, _ambientController]),
                builder: (context, _) {
                  return SlideTransition(
                    position: _logoSlide,
                    child: Transform.scale(
                      scale: _logoScale.value,
                      child: Opacity(
                        opacity: _logoOpacity.value,
                        child: Stack(
                          alignment: Alignment.center,
                          children: [
                            Transform.scale(
                              scale: _ambientRingScale.value,
                              child: Container(
                                width: 140,
                                height: 140,
                                decoration: BoxDecoration(
                                  shape: BoxShape.circle,
                                  border: Border.all(
                                    color: primaryColor.withOpacity(_ambientRingOpacity.value),
                                    width: 2,
                                  ),
                                ),
                              ),
                            ),
                            Transform.scale(
                              scale: _ambientPulse.value,
                              child: Container(
                                width: 120,
                                height: 120,
                                decoration: BoxDecoration(
                                  gradient: AppTheme.getGradient(context),
                                  borderRadius: BorderRadius.circular(30),
                                  boxShadow: [
                                    BoxShadow(
                                      color: primaryColor.withOpacity(0.42),
                                      blurRadius: 30,
                                      spreadRadius: 4,
                                    ),
                                  ],
                                ),
                                child: ClipRRect(
                                  borderRadius: BorderRadius.circular(20),
                                  child: Image.asset(
                                    'assets/icons/app_icon.png',
                                    width: 80,
                                    height: 80,
                                    fit: BoxFit.cover,
                                  ),
                                ),
                              ),
                            ),
                          ],
                        ),
                      ),
                    ),
                  );
                },
              ),

              const SizedBox(height: 32),

              // Animated App Name
              SlideTransition(
                position: _textSlide,
                child: FadeTransition(
                  opacity: _textOpacity,
                  child: Column(
                    children: [
                      ShaderMask(
                        shaderCallback: (bounds) => AppTheme.getGradient(context).createShader(bounds),
                        child: Text(
                          AppStrings.of(context)?.lotusIptv ?? 'VoXtv',
                          style: const TextStyle(
                            fontSize: 36,
                            fontWeight: FontWeight.bold,
                            color: Colors.white,
                            letterSpacing: 1.5,
                          ),
                        ),
                      ),
                      const SizedBox(height: 8),
                      Text(
                        AppStrings.of(context)?.professionalIptvPlayer ?? 'Professional IPTV Player',
                        style: TextStyle(
                          fontSize: 14,
                          color: AppTheme.getTextSecondary(context).withOpacity(0.8),
                          letterSpacing: 2,
                        ),
                      ),
                    ],
                  ),
                ),
              ),

              const SizedBox(height: 60),

              // Professional loading bar (without spinner)
              AnimatedBuilder(
                animation: Listenable.merge([_textController, _ambientController]),
                builder: (context, child) {
                  return Opacity(
                    opacity: _textOpacity.value,
                    child: child,
                  );
                },
                child: SizedBox(
                  width: 220,
                  child: Column(
                    children: [
                      ClipRRect(
                        borderRadius: BorderRadius.circular(999),
                        child: Container(
                          height: 6,
                          color: AppTheme.getSurfaceColor(context),
                          child: Stack(
                            children: [
                              Transform.translate(
                                offset: Offset(_loadingShimmer.value * 120, 0),
                                child: Container(
                                  width: 84,
                                  decoration: BoxDecoration(
                                    gradient: AppTheme.getGradient(context),
                                    borderRadius: BorderRadius.circular(999),
                                  ),
                                ),
                              ),
                            ],
                          ),
                        ),
                      ),
                      const SizedBox(height: 16),
                      Text(
                        AppStrings.of(context)?.loading ?? 'Loading...',
                        style: TextStyle(
                          fontSize: 12,
                          color: AppTheme.getTextMuted(context),
                        ),
                      ),
                    ],
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}

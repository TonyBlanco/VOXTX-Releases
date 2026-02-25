import 'dart:math';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:shared_preferences/shared_preferences.dart';

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
  static const Duration _minimumSplashDuration = Duration(milliseconds: 12800);
  static const String _kLegalAccepted = 'legal_accepted';

  // Disclaimer state
  bool _showingDisclaimer = false;
  bool _legalLoaded = false;

  late AnimationController _logoController;
  late AnimationController _textController;
  late AnimationController _ambientController;
  late DateTime _splashStartedAt;
  late Animation<double> _logoScale;
  late Animation<double> _logoOpacity;
  late Animation<Offset> _logoSlide;
  late Animation<double> _textOpacity;
  late Animation<Offset> _textSlide;
  late Animation<double> _ambientPulse;
  late Animation<double> _floatingOffset;
  late Animation<double> _glowOpacity;
  late Animation<double> _ambientRingScale;
  late Animation<double> _ambientRingOpacity;
  late Animation<double> _loadingShimmer;
  String _loadingStatus = 'Iniciando servicios...';

  void _setStatus(String status) {
    if (mounted) setState(() => _loadingStatus = status);
  }

  @override
  void initState() {
    super.initState();
    _splashStartedAt = DateTime.now();
    _logoController = AnimationController(duration: const Duration(milliseconds: 1200), vsync: this);
    _textController = AnimationController(duration: const Duration(milliseconds: 800), vsync: this);
    _ambientController = AnimationController(duration: const Duration(milliseconds: 2800), vsync: this);

    _logoScale = Tween<double>(begin: 0.72, end: 1.0).animate(CurvedAnimation(parent: _logoController, curve: Curves.easeOutBack));
    _logoOpacity = Tween<double>(begin: 0.0, end: 1.0).animate(CurvedAnimation(parent: _logoController, curve: const Interval(0.0, 0.5, curve: Curves.easeOut)));
    _logoSlide = Tween<Offset>(begin: const Offset(0, 0.18), end: Offset.zero).animate(CurvedAnimation(parent: _logoController, curve: Curves.easeOutCubic));
    _textOpacity = Tween<double>(begin: 0.0, end: 1.0).animate(CurvedAnimation(parent: _textController, curve: Curves.easeOut));
    _textSlide = Tween<Offset>(begin: const Offset(0, 0.5), end: Offset.zero).animate(CurvedAnimation(parent: _textController, curve: Curves.easeOutCubic));
    _ambientPulse = TweenSequence<double>([
      TweenSequenceItem(tween: Tween(begin: 0.98, end: 1.04), weight: 50),
      TweenSequenceItem(tween: Tween(begin: 1.04, end: 0.98), weight: 50),
    ]).animate(CurvedAnimation(parent: _ambientController, curve: Curves.easeInOut));
    _floatingOffset = TweenSequence<double>([
      TweenSequenceItem(tween: Tween(begin: 6.0, end: -8.0), weight: 50),
      TweenSequenceItem(tween: Tween(begin: -8.0, end: 6.0), weight: 50),
    ]).animate(CurvedAnimation(parent: _ambientController, curve: Curves.easeInOut));
    _glowOpacity = TweenSequence<double>([
      TweenSequenceItem(tween: Tween(begin: 0.24, end: 0.52), weight: 50),
      TweenSequenceItem(tween: Tween(begin: 0.52, end: 0.24), weight: 50),
    ]).animate(CurvedAnimation(parent: _ambientController, curve: Curves.easeInOut));
    _ambientRingScale = Tween<double>(begin: 0.9, end: 1.35).animate(CurvedAnimation(parent: _ambientController, curve: Curves.easeOut));
    _ambientRingOpacity = Tween<double>(begin: 0.28, end: 0.0).animate(CurvedAnimation(parent: _ambientController, curve: Curves.easeOut));
    _loadingShimmer = Tween<double>(begin: -1.1, end: 1.1).animate(CurvedAnimation(parent: _ambientController, curve: Curves.easeInOut));

    _ambientController.repeat();

    _checkLegalStatus();
  }

  Future<void> _checkLegalStatus() async {
    final prefs = await SharedPreferences.getInstance();
    final accepted = prefs.getBool(_kLegalAccepted) ?? false;
    if (!mounted) return;
    if (accepted) {
      setState(() => _legalLoaded = true);
      _startAnimations();
    } else {
      setState(() {
        _legalLoaded = true;
        _showingDisclaimer = true;
      });
    }
  }

  Future<void> _acceptDisclaimer() async {
    final prefs = await SharedPreferences.getInstance();
    await prefs.setBool(_kLegalAccepted, true);
    if (!mounted) return;
    setState(() => _showingDisclaimer = false);
    _splashStartedAt = DateTime.now(); // reset timer after acceptance
    _startAnimations();
  }

  Future<void> _startAnimations() async {
    _logoController.forward();
    await Future.delayed(const Duration(milliseconds: 600));
    _textController.forward();
    await _initializeApp();
  }

  Future<void> _initializeApp() async {
    ServiceLocator.log.i('Initializing app services', tag: 'SplashScreen');
    final startTime = DateTime.now();
    
    try {
      _setStatus('Conectando con los servicios...');
      await ServiceLocator.init();

      _setStatus('Detectando plataforma...');
      await TVDetectionChannel.initialize();

      if (mounted) {
        _setStatus('Cargando listas de canales...');
        final playlistProvider = context.read<PlaylistProvider>();
        await playlistProvider.loadPlaylists();
        
        _setStatus('Verificando actualizaciones...');
        AutoRefreshService().checkOnStartup();
        await Future.delayed(const Duration(milliseconds: 600));
        
        if (PlatformDetector.isDesktop) {
          _setStatus('Inicializando reproductor...');
          final playerProvider = context.read<PlayerProvider>();
          playerProvider.warmup().catchError((e) {
            ServiceLocator.log.d('Player warmup failed (non-fatal): $e', tag: 'SplashScreen');
          });
          await Future.delayed(const Duration(milliseconds: 400));
        }

        _setStatus('Preparando interfaz...');
      }
      
      final initTime = DateTime.now().difference(startTime).inMilliseconds;
      ServiceLocator.log.i('App init done in ${initTime}ms', tag: 'SplashScreen');
    } catch (e) {
      _setStatus('Error al inicializar. Reintentando...');
      ServiceLocator.log.e('App init failed', tag: 'SplashScreen', error: e);
    }

    final elapsed = DateTime.now().difference(_splashStartedAt);
    if (elapsed < _minimumSplashDuration) {
      await Future.delayed(_minimumSplashDuration - elapsed);
    }

    if (mounted) {
      //  pushReplacementNamed  splash splash
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

  Widget _buildDisclaimerScreen(BuildContext context, Color primaryColor) {
    final strings = AppStrings.of(context);
    final isEs = Localizations.localeOf(context).languageCode == 'es';
    final bg = AppTheme.getBackgroundColor(context);
    final surface = AppTheme.getSurfaceColor(context);
    final textPrimary = AppTheme.getTextPrimary(context);
    final textSecondary = AppTheme.getTextSecondary(context);
    final appName = strings?.lotusIptv ?? 'VoXtv';

    final title = isEs
        ? 'Aviso Legal y de Responsabilidad'
        : 'Legal Notice and Disclaimer';

    final body = isEs
        ? '''$appName es un reproductor multimedia destinado exclusivamente a la reproducción de listas de reproducción en formato M3U/M3U8/Xtream Codes u otros estándares similares que el propio usuario proporcione.

La aplicación NO ofrece, vende, distribuye ni aloja ningún tipo de contenido audiovisual, canal de televisión, película, serie, evento deportivo o similar.

Cualquier contenido reproducido mediante esta aplicación proviene exclusivamente de fuentes añadidas por el usuario.

El uso de listas o fuentes que contengan material protegido por derechos de autor sin la expresa autorización de los titulares constituye una infracción a la legislación vigente.

Usted, como usuario, asume plena y exclusiva responsabilidad civil y/o penal por:

  • La procedencia y legalidad de las listas y contenidos que introduzca.
  • Cualquier daño o perjuicio causado a terceros.
  • El cumplimiento de la normativa aplicable en su país.

El desarrollador, programador, distribuidor y cualquier entidad relacionada con esta aplicación quedan exentos de toda responsabilidad derivada del uso que realice el usuario.

Al pulsar "Acepto" usted declara bajo su responsabilidad que:

  1. Ha leído y comprendido el presente aviso.
  2. Utilizará la aplicación únicamente con contenidos lícitos y autorizados.
  3. Exime al desarrollador de cualquier consecuencia derivada de un uso contrario a la ley.'''
        : '''$appName is a multimedia player intended exclusively for playing user-provided playlist files in M3U/M3U8/Xtream Codes or similar standard formats.

The application does NOT offer, sell, distribute or host any audiovisual content, TV channels, movies, series, sports events or similar.

Any content played through this application comes exclusively from sources added by the user.

Using playlists or sources containing copyright-protected material without express authorisation from the rights holders constitutes a violation of applicable law.

As a user, you assume full and exclusive civil and/or criminal responsibility for:

  • The origin and legality of the playlists and content you add.
  • Any damage or harm caused to third parties.
  • Compliance with the applicable regulations in your country.

The developer, programmer, distributor and any entity related to this application are exempt from any liability arising from the user's use of it.

By tapping "I Agree" you declare under your responsibility that:

  1. You have read and understood this notice.
  2. You will use the application only with lawful and authorised content.
  3. You release the developer from any consequences arising from unlawful use.''';

    final btnLabel = isEs ? 'He leído y acepto' : 'I have read and agree';

    return Scaffold(
      backgroundColor: bg,
      body: SafeArea(
        child: Column(
          children: [
            // Header
            Container(
              padding: const EdgeInsets.symmetric(horizontal: 24, vertical: 20),
              decoration: BoxDecoration(
                gradient: LinearGradient(
                  begin: Alignment.topLeft,
                  end: Alignment.bottomRight,
                  colors: [primaryColor.withOpacity(0.15), bg],
                ),
                border: Border(bottom: BorderSide(color: primaryColor.withOpacity(0.2), width: 1)),
              ),
              child: Row(
                children: [
                  Container(
                    padding: const EdgeInsets.all(8),
                    decoration: BoxDecoration(
                      color: primaryColor.withOpacity(0.12),
                      borderRadius: BorderRadius.circular(10),
                    ),
                    child: Icon(Icons.gavel_rounded, color: primaryColor, size: 22),
                  ),
                  const SizedBox(width: 12),
                  Expanded(
                    child: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Text(
                          appName,
                          style: TextStyle(
                            color: primaryColor,
                            fontWeight: FontWeight.w700,
                            fontSize: 13,
                            letterSpacing: 1.2,
                          ),
                        ),
                        Text(
                          title,
                          style: TextStyle(
                            color: textPrimary,
                            fontWeight: FontWeight.w600,
                            fontSize: 15,
                          ),
                        ),
                      ],
                    ),
                  ),
                ],
              ),
            ),

            // Scrollable disclaimer text
            Expanded(
              child: SingleChildScrollView(
                physics: const BouncingScrollPhysics(),
                padding: const EdgeInsets.symmetric(horizontal: 24, vertical: 20),
                child: Container(
                  padding: const EdgeInsets.all(20),
                  decoration: BoxDecoration(
                    color: surface,
                    borderRadius: BorderRadius.circular(16),
                    border: Border.all(color: primaryColor.withOpacity(0.12)),
                  ),
                  child: Text(
                    body,
                    style: TextStyle(
                      color: textSecondary,
                      fontSize: 13.5,
                      height: 1.7,
                    ),
                  ),
                ),
              ),
            ),

            // Accept button
            Container(
              padding: const EdgeInsets.fromLTRB(24, 12, 24, 24),
              decoration: BoxDecoration(
                color: bg,
                border: Border(top: BorderSide(color: primaryColor.withOpacity(0.15), width: 1)),
              ),
              child: SizedBox(
                width: double.infinity,
                height: 52,
                child: DecoratedBox(
                  decoration: BoxDecoration(
                    gradient: AppTheme.getGradient(context),
                    borderRadius: BorderRadius.circular(14),
                    boxShadow: [BoxShadow(color: primaryColor.withOpacity(0.35), blurRadius: 16, offset: const Offset(0, 4))],
                  ),
                  child: Material(
                    color: Colors.transparent,
                    child: InkWell(
                      borderRadius: BorderRadius.circular(14),
                      onTap: _acceptDisclaimer,
                      child: Center(
                        child: Text(
                          btnLabel,
                          style: const TextStyle(
                            color: Colors.white,
                            fontWeight: FontWeight.w700,
                            fontSize: 15,
                            letterSpacing: 0.5,
                          ),
                        ),
                      ),
                    ),
                  ),
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    final primaryColor = AppTheme.getPrimaryColor(context);

    // While checking SharedPreferences, show plain background
    if (!_legalLoaded) {
      return Scaffold(backgroundColor: AppTheme.getBackgroundColor(context));
    }

    // Show legal disclaimer on first launch
    if (_showingDisclaimer) {
      return _buildDisclaimerScreen(context, primaryColor);
    }

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
                                width: 176,
                                height: 176,
                                decoration: BoxDecoration(
                                  shape: BoxShape.circle,
                                  border: Border.all(
                                    color: primaryColor.withOpacity(_ambientRingOpacity.value),
                                    width: 2,
                                  ),
                                ),
                              ),
                            ),
                            Transform.translate(
                              offset: Offset(0, _floatingOffset.value),
                              child: Transform.scale(
                                scale: _ambientPulse.value,
                                child: Container(
                                  width: 190,
                                  height: 190,
                                  decoration: BoxDecoration(
                                    shape: BoxShape.circle,
                                    boxShadow: [
                                      BoxShadow(
                                        color: primaryColor.withOpacity(_glowOpacity.value),
                                        blurRadius: 56,
                                        spreadRadius: 6,
                                      ),
                                    ],
                                  ),
                                  alignment: Alignment.center,
                                  child: Image.asset(
                                    'assets/icons/app_icon.png',
                                    width: 138,
                                    height: 138,
                                    fit: BoxFit.contain,
                                    filterQuality: FilterQuality.high,
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

              // Connection signal bars + status text
              AnimatedBuilder(
                animation: Listenable.merge([_textController, _ambientController]),
                builder: (context, _) {
                  final t = _ambientController.value * 2 * pi;
                  final primaryColor = AppTheme.getPrimaryColor(context);
                  return Opacity(
                    opacity: _textOpacity.value,
                    child: SizedBox(
                      width: 260,
                      child: Column(
                        children: [
                          // Animated signal/equalizer bars
                          Row(
                            mainAxisAlignment: MainAxisAlignment.center,
                            crossAxisAlignment: CrossAxisAlignment.end,
                            children: List.generate(7, (i) {
                              final phase = i * (pi / 3.5);
                              final height = 8.0 + 22.0 * (0.5 + 0.5 * sin(t + phase));
                              final opacity = 0.45 + 0.55 * (0.5 + 0.5 * sin(t + phase));
                              return Padding(
                                padding: const EdgeInsets.symmetric(horizontal: 3),
                                child: AnimatedContainer(
                                  duration: const Duration(milliseconds: 80),
                                  width: 7,
                                  height: height,
                                  decoration: BoxDecoration(
                                    borderRadius: BorderRadius.circular(4),
                                    color: primaryColor.withOpacity(opacity),
                                  ),
                                ),
                              );
                            }),
                          ),
                          const SizedBox(height: 20),
                          // Shimmer bar below the equalizer
                          ClipRRect(
                            borderRadius: BorderRadius.circular(999),
                            child: Container(
                              height: 4,
                              color: AppTheme.getSurfaceColor(context),
                              child: Stack(
                                children: [
                                  Transform.translate(
                                    offset: Offset(_loadingShimmer.value * 130, 0),
                                    child: Container(
                                      width: 90,
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
                          // Cycling status text
                          AnimatedSwitcher(
                            duration: const Duration(milliseconds: 400),
                            child: Text(
                              _loadingStatus,
                              key: ValueKey(_loadingStatus),
                              style: TextStyle(
                                fontSize: 12,
                                color: AppTheme.getTextMuted(context),
                                letterSpacing: 0.5,
                              ),
                              textAlign: TextAlign.center,
                            ),
                          ),
                        ],
                      ),
                    ),
                  );
                },
              ),
            ],
          ),
        ),
      ),
    );
  }
}

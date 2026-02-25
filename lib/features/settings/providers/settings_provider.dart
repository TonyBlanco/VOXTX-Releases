import 'package:flutter/material.dart';
import 'package:package_info_plus/package_info_plus.dart';
import '../../../core/services/service_locator.dart';
import '../../../core/services/log_service.dart';

class SettingsProvider extends ChangeNotifier {
  // Keys for SharedPreferences
  static const String _keyThemeMode = 'theme_mode';
  static const String _keyAutoRefresh = 'auto_refresh';
  static const String _keyRefreshInterval = 'refresh_interval';
  static const String _keyDefaultQuality = 'default_quality';
  static const String _keyHardwareDecoding = 'hardware_decoding';
  static const String _keyDecodingMode = 'decoding_mode'; // New: auto, hardware, software
  static const String _keyWindowsHwdecMode = 'windows_hwdec_mode'; // auto-safe, auto-copy, d3d11va, dxva2
  static const String _keyAllowSoftwareFallback = 'allow_software_fallback';
  static const String _keyVideoOutput = 'video_output'; // auto, libmpv, gpu
  static const String _keyChannelMergeRule = 'channel_merge_rule'; // New: name, name_group
  static const String _keyBufferSize = 'buffer_size';
  static const String _keyLastPlaylistId = 'last_playlist_id';
  static const String _keyEnableEpg = 'enable_epg';
  static const String _keyEpgUrl = 'epg_url';
  static const String _keyParentalControl = 'parental_control';
  static const String _keyParentalPin = 'parental_pin';
  static const String _keyAutoPlay = 'auto_play';
  static const String _keyRememberLastChannel = 'remember_last_channel';
  static const String _keyLastChannelId = 'last_channel_id';
  static const String _keyLocale = 'locale';
  static const String _keyVolumeNormalization = 'volume_normalization';
  static const String _keyVolumeBoost = 'volume_boost';
  static const String _keyBufferStrength = 'buffer_strength'; // fast, balanced, stable
  static const String _keyShowFps = 'show_fps';
  static const String _keyShowClock = 'show_clock';
  static const String _keyShowNetworkSpeed = 'show_network_speed';
  static const String _keyShowVideoInfo = 'show_video_info';
  static const String _keyProgressBarMode = 'progress_bar_mode'; // auto, always, never
  static const String _keyEnableMultiScreen = 'enable_multi_screen';
  static const String _keyDefaultScreenPosition = 'default_screen_position';
  static const String _keyActiveScreenIndex = 'active_screen_index';
  static const String _keyLastPlayMode = 'last_play_mode'; // 'single' or 'multi'
  static const String _keyLastMultiScreenChannels = 'last_multi_screen_channels'; // JSON string of channel IDs
  static const String _keyLastMultiScreenSourceIndexes =
      'last_multi_screen_source_indexes'; // comma-separated source indexes
  static const String _keyShowMultiScreenChannelName = 'show_multi_screen_channel_name'; // Mostrar nombre del canal en multi-pantalla
  static const String _keyDarkColorScheme = 'dark_color_scheme';
  static const String _keyLightColorScheme = 'light_color_scheme';
  static const String _keyFontFamily = 'font_family';
  static const String _keySimpleMenu = 'simple_menu';
  static const String _keyLogLevel = 'log_level'; // debug, release, off
  static const String _keyMobileOrientation = 'mobile_orientation'; // portrait, landscape, auto
  static const String _keyLastAppVersion = 'last_app_version'; // Para detectar actualizaciones de versión
  static const String _keyShowWatchHistoryOnHome = 'show_watch_history_on_home'; // Mostrar historial en la pantalla principal
  static const String _keyShowFavoritesOnHome = 'show_favorites_on_home'; // Mostrar favoritos en la pantalla principal

  // Settings values
  String _themeMode = 'dark';
  bool _autoRefresh = false;
  int _refreshInterval = 24; // hours
  String _defaultQuality = 'auto';
  bool _hardwareDecoding = true;
  String _decodingMode = 'auto'; // New: auto, hardware, software
  String _windowsHwdecMode = 'auto-safe';
  bool _allowSoftwareFallback = true;
  String _videoOutput = 'auto';
  String _channelMergeRule = 'name_group'; // New: name, name_group
  int _bufferSize = 30; // seconds
  int? _lastPlaylistId;
  bool _enableEpg = true;
  String? _epgUrl;
  bool _parentalControl = false;
  String? _parentalPin;
  bool _autoPlay = false;
  bool _rememberLastChannel = true;
  int? _lastChannelId;
  Locale? _locale;
  bool _volumeNormalization = false;
  int _volumeBoost = 0; // -20 to +20 dB
  String _bufferStrength = 'fast'; // fast, balanced, stable
  bool _showFps = true; // Mostrar FPS por defecto
  bool _showClock = true; // Mostrar reloj por defecto
  bool _showNetworkSpeed = true; // Mostrar velocidad de red por defecto
  bool _showVideoInfo = true; // Mostrar resolución/bitrate por defecto
  String _progressBarMode = 'auto'; // Modo de barra de progreso: auto, always, never
  bool _enableMultiScreen = true; // Multi-pantalla activada por defecto
  int _defaultScreenPosition = 1; // Posición por defecto de reproducción (arriba-izquierda)
  int _activeScreenIndex = 0; // Índice de ventana activa
  String _lastPlayMode = 'single'; // Último modo de reproducción: 'single' o 'multi'
  List<int?> _lastMultiScreenChannels = [null, null, null, null]; // IDs de canales en multi-pantalla
  List<int> _lastMultiScreenSourceIndexes = [0, 0, 0, 0]; // Índices de fuente en multi-pantalla
  bool _showMultiScreenChannelName = false; // Mostrar nombre del canal en multi-pantalla (por defecto false)
  String _darkColorScheme = 'ocean'; // Esquema de color para modo oscuro (por defecto 'ocean')
  String _lightColorScheme = 'sky'; // Esquema de color para modo claro (por defecto 'sky')
  String _fontFamily = 'System'; // Fuente del sistema (Roboto en Android/TV)
  bool _simpleMenu = true; // Usar menú simple (no expandido) por defecto
  String _logLevel = 'off'; // Nivel de logs: debug, release, off (por defecto off)
  String _mobileOrientation = 'portrait'; // Orientación en móvil: portrait, landscape, auto (por defecto portrait)
  bool _showWatchHistoryOnHome = true; // Mostrar historial en Home por defecto
  bool _showFavoritesOnHome = false; // Mostrar favoritos en Home (por defecto false)

  // Getters
  String get themeMode => _themeMode;
  bool get autoRefresh => _autoRefresh;
  int get refreshInterval => _refreshInterval;
  String get defaultQuality => _defaultQuality;
  bool get hardwareDecoding => _hardwareDecoding;
  String get decodingMode => _decodingMode;
  String get windowsHwdecMode => _windowsHwdecMode;
  bool get allowSoftwareFallback => _allowSoftwareFallback;
  String get videoOutput => _videoOutput;
  String get channelMergeRule => _channelMergeRule;
  int get bufferSize => _bufferSize;
  int? get lastPlaylistId => _lastPlaylistId;
  bool get enableEpg => _enableEpg;
  String? get epgUrl => _epgUrl;
  bool get parentalControl => _parentalControl;
  String? get parentalPin => _parentalPin;
  bool get autoPlay => _autoPlay;
  bool get rememberLastChannel => _rememberLastChannel;
  int? get lastChannelId => _lastChannelId;
  Locale? get locale => _locale;
  bool get volumeNormalization => _volumeNormalization;
  int get volumeBoost => _volumeBoost;
  String get bufferStrength => _bufferStrength;
  bool get showFps => _showFps;
  bool get showClock => _showClock;
  bool get showNetworkSpeed => _showNetworkSpeed;
  bool get showVideoInfo => _showVideoInfo;
  String get progressBarMode => _progressBarMode;
  bool get enableMultiScreen => _enableMultiScreen;
  int get defaultScreenPosition => _defaultScreenPosition;
  int get activeScreenIndex => _activeScreenIndex;
  String get lastPlayMode => _lastPlayMode;
  List<int?> get lastMultiScreenChannels => _lastMultiScreenChannels;
  List<int> get lastMultiScreenSourceIndexes => _lastMultiScreenSourceIndexes;
  bool get showMultiScreenChannelName => _showMultiScreenChannelName;
  String get darkColorScheme => _darkColorScheme;
  String get lightColorScheme => _lightColorScheme;
  String get fontFamily => _fontFamily;
  bool get simpleMenu => _simpleMenu;
  String get logLevel => _logLevel;
  String get mobileOrientation => _mobileOrientation;
  bool get showWatchHistoryOnHome => _showWatchHistoryOnHome;
  bool get showFavoritesOnHome => _showFavoritesOnHome;
  
  /// Obtener el esquema de color actual que debe usarse
  String get currentColorScheme {
    if (_themeMode == 'dark') return _darkColorScheme;
    if (_themeMode == 'light') return _lightColorScheme;
    // Si sigue el sistema, la elección depende del brillo del sistema
    // Aquí se devuelve el esquema oscuro por defecto; la UI puede decidir lo contrario
    return _darkColorScheme;
  }

  SettingsProvider() {
    _loadSettings();
    _checkVersionUpdate();
  }

  void _loadSettings() {
    final prefs = ServiceLocator.prefs;

    _themeMode = prefs.getString(_keyThemeMode) ?? 'dark';
    _autoRefresh = prefs.getBool(_keyAutoRefresh) ?? false;
    _refreshInterval = prefs.getInt(_keyRefreshInterval) ?? 24;
    _defaultQuality = prefs.getString(_keyDefaultQuality) ?? 'auto';
    _hardwareDecoding = prefs.getBool(_keyHardwareDecoding) ?? true;
    _decodingMode = prefs.getString(_keyDecodingMode) ?? 'auto';
    _windowsHwdecMode = prefs.getString(_keyWindowsHwdecMode) ?? 'auto-safe';
    _allowSoftwareFallback = prefs.getBool(_keyAllowSoftwareFallback) ?? true;
    _videoOutput = prefs.getString(_keyVideoOutput) ?? 'auto';
    _channelMergeRule = prefs.getString(_keyChannelMergeRule) ?? 'name_group';
    _bufferSize = prefs.getInt(_keyBufferSize) ?? 30;
    _lastPlaylistId = prefs.getInt(_keyLastPlaylistId);
    _enableEpg = prefs.getBool(_keyEnableEpg) ?? true;
    _epgUrl = prefs.getString(_keyEpgUrl);
    _parentalControl = prefs.getBool(_keyParentalControl) ?? false;
    _parentalPin = prefs.getString(_keyParentalPin);
    _autoPlay = prefs.getBool(_keyAutoPlay) ?? false;
    _rememberLastChannel = prefs.getBool(_keyRememberLastChannel) ?? true;
    _lastChannelId = prefs.getInt(_keyLastChannelId);

    final localeCode = prefs.getString(_keyLocale);
    if (localeCode != null) {
      // Migrate deprecated Chinese locale to Spanish (EN/ES only)
      final normalized = localeCode == 'zh' ? 'es' : localeCode;
      final parts = normalized.split('_');
      _locale = Locale(parts[0], parts.length > 1 ? parts[1] : null);
    }
    _volumeNormalization = prefs.getBool(_keyVolumeNormalization) ?? false;
    _volumeBoost = prefs.getInt(_keyVolumeBoost) ?? 0;
    _bufferStrength = prefs.getString(_keyBufferStrength) ?? 'fast';
    _showFps = prefs.getBool(_keyShowFps) ?? true;
    _showClock = prefs.getBool(_keyShowClock) ?? true;
    _showNetworkSpeed = prefs.getBool(_keyShowNetworkSpeed) ?? true;
    _showVideoInfo = prefs.getBool(_keyShowVideoInfo) ?? true;
    _progressBarMode = prefs.getString(_keyProgressBarMode) ?? 'auto';
    _enableMultiScreen = prefs.getBool(_keyEnableMultiScreen) ?? true;
    _defaultScreenPosition = prefs.getInt(_keyDefaultScreenPosition) ?? 1;
    _activeScreenIndex = prefs.getInt(_keyActiveScreenIndex) ?? 0;
    _lastPlayMode = prefs.getString(_keyLastPlayMode) ?? 'single';
    _showMultiScreenChannelName = prefs.getBool(_keyShowMultiScreenChannelName) ?? false;
    ServiceLocator.log.d('SettingsProvider: loaded showMultiScreenChannelName=$_showMultiScreenChannelName');
    
    // Cargar la lista de IDs de canales en multi-pantalla
    final multiScreenChannelsJson = prefs.getString(_keyLastMultiScreenChannels);
    if (multiScreenChannelsJson != null) {
      try {
        final List<dynamic> decoded = List<dynamic>.from(
          multiScreenChannelsJson.split(',').map((s) => s.isEmpty ? null : int.tryParse(s))
        );
        _lastMultiScreenChannels = decoded.map((e) => e as int?).toList();
        while (_lastMultiScreenChannels.length < 4) {
          _lastMultiScreenChannels.add(null);
        }
      } catch (_) {
        _lastMultiScreenChannels = [null, null, null, null];
      }
    }

    final multiScreenSourceIndexesStr = prefs.getString(_keyLastMultiScreenSourceIndexes);
    if (multiScreenSourceIndexesStr != null) {
      try {
        final parsed = multiScreenSourceIndexesStr
            .split(',')
            .map((s) => int.tryParse(s) ?? 0)
            .toList();
        _lastMultiScreenSourceIndexes = parsed.take(4).toList();
        while (_lastMultiScreenSourceIndexes.length < 4) {
          _lastMultiScreenSourceIndexes.add(0);
        }
      } catch (_) {
        _lastMultiScreenSourceIndexes = [0, 0, 0, 0];
      }
    }
    
    // Cargar configuración de esquemas de color
    _darkColorScheme = prefs.getString(_keyDarkColorScheme) ?? 'ocean';
    _lightColorScheme = prefs.getString(_keyLightColorScheme) ?? 'sky';

    // Cargar configuración de fuente
    _fontFamily = prefs.getString(_keyFontFamily) ?? 'System';

    // Cargar configuración de menú simple
    _simpleMenu = prefs.getBool(_keySimpleMenu) ?? true;

    // Cargar nivel de logs
    _logLevel = prefs.getString(_keyLogLevel) ?? 'off';

    // Cargar orientación para móvil
    _mobileOrientation = prefs.getString(_keyMobileOrientation) ?? 'portrait';

    // Cargar ajustes de visualización en la pantalla principal
    _showWatchHistoryOnHome = prefs.getBool(_keyShowWatchHistoryOnHome) ?? true;
    _showFavoritesOnHome = prefs.getBool(_keyShowFavoritesOnHome) ?? false;
    
    // No llamar a notifyListeners() en el constructor para evitar reconstrucciones durante build
  }

  /// Comprobar actualización de versión; si hay actualización, desactivar logs de desarrollo automáticamente
  Future<void> _checkVersionUpdate() async {
    try {
      final prefs = ServiceLocator.prefs;
      final lastVersion = prefs.getString(_keyLastAppVersion);
      // Obtener el número de versión actual
      final packageInfo = await PackageInfo.fromPlatform();
      final currentVersion = packageInfo.version;

      // Si la versión es diferente, la app se ha actualizado
      if (lastVersion != null && lastVersion != currentVersion) {
        ServiceLocator.log.d('Detectada actualización de versión: $lastVersion → $currentVersion');

        // Desactivar automáticamente los logs de desarrollo
        if (_logLevel != 'off') {
          ServiceLocator.log.d('Desactivando logs de desarrollo automáticamente');
          await setLogLevel('off');
        }
      }

      // Guardar la versión actual
      await prefs.setString(_keyLastAppVersion, currentVersion);
    } catch (e) {
      ServiceLocator.log.e('Fallo al detectar la versión: $e');
    }
  }

  Future<void> _saveSettings() async {
    final prefs = ServiceLocator.prefs;

    await prefs.setString(_keyThemeMode, _themeMode);
    await prefs.setBool(_keyAutoRefresh, _autoRefresh);
    await prefs.setInt(_keyRefreshInterval, _refreshInterval);
    await prefs.setString(_keyDefaultQuality, _defaultQuality);
    await prefs.setBool(_keyHardwareDecoding, _hardwareDecoding);
    await prefs.setString(_keyDecodingMode, _decodingMode);
    await prefs.setString(_keyWindowsHwdecMode, _windowsHwdecMode);
    await prefs.setBool(_keyAllowSoftwareFallback, _allowSoftwareFallback);
    await prefs.setString(_keyVideoOutput, _videoOutput);
    await prefs.setString(_keyChannelMergeRule, _channelMergeRule);
    await prefs.setInt(_keyBufferSize, _bufferSize);
    if (_lastPlaylistId != null) {
      await prefs.setInt(_keyLastPlaylistId, _lastPlaylistId!);
    }
    await prefs.setBool(_keyEnableEpg, _enableEpg);
    if (_epgUrl != null) {
      await prefs.setString(_keyEpgUrl, _epgUrl!);
    }
    await prefs.setBool(_keyParentalControl, _parentalControl);
    if (_parentalPin != null) {
      await prefs.setString(_keyParentalPin, _parentalPin!);
    }
    await prefs.setBool(_keyAutoPlay, _autoPlay);
    await prefs.setBool(_keyRememberLastChannel, _rememberLastChannel);
    if (_lastChannelId != null) {
      await prefs.setInt(_keyLastChannelId, _lastChannelId!);
    }
    if (_locale != null) {
      await prefs.setString(_keyLocale, _locale!.languageCode);
    } else {
      await prefs.remove(_keyLocale);
    }
    await prefs.setBool(_keyVolumeNormalization, _volumeNormalization);
    await prefs.setInt(_keyVolumeBoost, _volumeBoost);
    await prefs.setString(_keyBufferStrength, _bufferStrength);
    await prefs.setBool(_keyShowFps, _showFps);
    await prefs.setBool(_keyShowClock, _showClock);
    await prefs.setBool(_keyShowNetworkSpeed, _showNetworkSpeed);
    await prefs.setBool(_keyShowVideoInfo, _showVideoInfo);
    await prefs.setString(_keyProgressBarMode, _progressBarMode);
    await prefs.setBool(_keyEnableMultiScreen, _enableMultiScreen);
    await prefs.setInt(_keyDefaultScreenPosition, _defaultScreenPosition);
    await prefs.setInt(_keyActiveScreenIndex, _activeScreenIndex);
    await prefs.setString(_keyLastPlayMode, _lastPlayMode);
    await prefs.setString(_keyLastMultiScreenChannels, _lastMultiScreenChannels.map((e) => e?.toString() ?? '').join(','));
    await prefs.setString(_keyLastMultiScreenSourceIndexes,
        _lastMultiScreenSourceIndexes.map((e) => e.toString()).join(','));
    await prefs.setBool(_keyShowMultiScreenChannelName, _showMultiScreenChannelName);
    await prefs.setString(_keyDarkColorScheme, _darkColorScheme);
    await prefs.setString(_keyLightColorScheme, _lightColorScheme);
    await prefs.setString(_keyFontFamily, _fontFamily);
    await prefs.setBool(_keySimpleMenu, _simpleMenu);
    await prefs.setString(_keyLogLevel, _logLevel);
    await prefs.setString(_keyMobileOrientation, _mobileOrientation);
    await prefs.setBool(_keyShowWatchHistoryOnHome, _showWatchHistoryOnHome);
    await prefs.setBool(_keyShowFavoritesOnHome, _showFavoritesOnHome);
  }

  // Setters with persistence
  Future<void> setThemeMode(String mode) async {
    _themeMode = mode;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setAutoRefresh(bool value) async {
    _autoRefresh = value;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setRefreshInterval(int hours) async {
    _refreshInterval = hours;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setDefaultQuality(String quality) async {
    _defaultQuality = quality;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setHardwareDecoding(bool enabled) async {
    _hardwareDecoding = enabled;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setDecodingMode(String mode) async {
    _decodingMode = mode;
    // Also update hardwareDecoding based on mode for backward compatibility
    _hardwareDecoding = mode != 'software';
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setWindowsHwdecMode(String mode) async {
    _windowsHwdecMode = mode;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setAllowSoftwareFallback(bool enabled) async {
    _allowSoftwareFallback = enabled;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setVideoOutput(String output) async {
    _videoOutput = output;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setChannelMergeRule(String rule) async {
    _channelMergeRule = rule;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setBufferSize(int seconds) async {
    _bufferSize = seconds;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setLastPlaylistId(int? id) async {
    _lastPlaylistId = id;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setEnableEpg(bool enabled) async {
    _enableEpg = enabled;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setEpgUrl(String? url) async {
    _epgUrl = url;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setParentalControl(bool enabled) async {
    _parentalControl = enabled;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setParentalPin(String? pin) async {
    _parentalPin = pin;
    await _saveSettings();
    notifyListeners();
  }

  bool validateParentalPin(String pin) {
    return _parentalPin == pin;
  }

  Future<void> setAutoPlay(bool enabled) async {
    _autoPlay = enabled;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setRememberLastChannel(bool enabled) async {
    _rememberLastChannel = enabled;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setLastChannelId(int? id) async {
    _lastChannelId = id;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setLocale(Locale? locale) async {
    _locale = locale;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setVolumeNormalization(bool enabled) async {
    _volumeNormalization = enabled;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setVolumeBoost(int db) async {
    _volumeBoost = db.clamp(-20, 20);
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setBufferStrength(String strength) async {
    _bufferStrength = strength;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setShowFps(bool show) async {
    _showFps = show;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setShowClock(bool show) async {
    _showClock = show;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setShowNetworkSpeed(bool show) async {
    _showNetworkSpeed = show;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setShowVideoInfo(bool show) async {
    _showVideoInfo = show;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setProgressBarMode(String mode) async {
    if (mode == 'auto' || mode == 'always' || mode == 'never') {
      _progressBarMode = mode;
      await _saveSettings();
      notifyListeners();
    }
  }

  Future<void> setEnableMultiScreen(bool enabled) async {
    _enableMultiScreen = enabled;
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setDefaultScreenPosition(int position) async {
    _defaultScreenPosition = position.clamp(1, 4);
    await _saveSettings();
    notifyListeners();
  }

  Future<void> setActiveScreenIndex(int index) async {
    _activeScreenIndex = index.clamp(0, 3);
    await _saveSettings();
    notifyListeners();
  }

  /// Establecer si en multi-pantalla se muestra el nombre del canal
  Future<void> setShowMultiScreenChannelName(bool show) async {
    ServiceLocator.log.d('SettingsProvider: setShowMultiScreenChannelName($show)');
    _showMultiScreenChannelName = show;
    await _saveSettings();
    notifyListeners();
  }

  /// Establecer último modo de reproducción
  Future<void> setLastPlayMode(String mode) async {
    _lastPlayMode = mode;
    await _saveSettings();
    notifyListeners();
  }

  /// Guardar lista de IDs de canales para multi-pantalla
  Future<void> setLastMultiScreenChannels(List<int?> channelIds) async {
    _lastMultiScreenChannels = List<int?>.from(channelIds);
    while (_lastMultiScreenChannels.length < 4) {
      _lastMultiScreenChannels.add(null);
    }
    await _saveSettings();
    notifyListeners();
  }

  /// Guardar estado de reproducción de un solo canal
  Future<void> saveLastSingleChannel(int? channelId) async {
    _lastPlayMode = 'single';
    if (channelId != null) {
      _lastChannelId = channelId;
    }
    await _saveSettings();
    notifyListeners();
  }

  /// Guardar estado de reproducción en multi-pantalla
  Future<void> saveLastMultiScreen(List<int?> channelIds, int activeIndex,
      {List<int>? sourceIndexes}) async {
    _lastPlayMode = 'multi';
    _lastMultiScreenChannels = List<int?>.from(channelIds);
    while (_lastMultiScreenChannels.length < 4) {
      _lastMultiScreenChannels.add(null);
    }
    _lastMultiScreenSourceIndexes =
        List<int>.from(sourceIndexes ?? _lastMultiScreenSourceIndexes);
    while (_lastMultiScreenSourceIndexes.length < 4) {
      _lastMultiScreenSourceIndexes.add(0);
    }
    _lastMultiScreenSourceIndexes =
        _lastMultiScreenSourceIndexes.take(4).map((e) => e < 0 ? 0 : e).toList();
    _activeScreenIndex = activeIndex.clamp(0, 3);
    await _saveSettings();
    notifyListeners();
  }

  /// Comprobar si existe estado de multi-pantalla para restaurar
  bool get hasMultiScreenState {
    return _lastPlayMode == 'multi' && _lastMultiScreenChannels.any((id) => id != null);
  }
  
  /// Establecer esquema de color para modo oscuro
  Future<void> setDarkColorScheme(String scheme) async {
    ServiceLocator.log.d('SettingsProvider: establecer esquema oscuro - $scheme');
    _darkColorScheme = scheme;
    await _saveSettings();
    ServiceLocator.log.d('SettingsProvider: esquema guardado, notificando listeners');
    notifyListeners();
  }
  
  /// Establecer esquema de color para modo claro
  Future<void> setLightColorScheme(String scheme) async {
    ServiceLocator.log.d('SettingsProvider: establecer esquema claro - $scheme');
    _lightColorScheme = scheme;
    await _saveSettings();
    ServiceLocator.log.d('SettingsProvider: esquema guardado, notificando listeners');
    notifyListeners();
  }

  /// Establecer la familia de fuente
  Future<void> setFontFamily(String fontFamily) async {
    ServiceLocator.log.d('SettingsProvider: establecer fuente - $fontFamily');
    _fontFamily = fontFamily;
    await _saveSettings();
    notifyListeners();
  }

  /// Establecer menú simple
  Future<void> setSimpleMenu(bool value) async {
    ServiceLocator.log.d('SettingsProvider: establecer menú simple - $value');
    _simpleMenu = value;
    await _saveSettings();
    notifyListeners();
  }

  /// Establecer nivel de logs
  Future<void> setLogLevel(String level) async {
    debugPrint('SettingsProvider: iniciando ajuste de nivel de logs - $level');
    _logLevel = level;
    await _saveSettings();
    
    // Actualizar servicio de logs
    final logLevel = switch (level) {
      'debug' => LogLevel.debug,
      'release' => LogLevel.release,
      'off' => LogLevel.off,
      _ => LogLevel.release,
    };
    
    debugPrint('SettingsProvider: llamando a ServiceLocator.log.setLogLevel($logLevel)');
    await ServiceLocator.log.setLogLevel(logLevel);
    
    // Escribir logs de prueba
    debugPrint('SettingsProvider: escribiendo logs de prueba...');
    ServiceLocator.log.d('Registro de prueba: nivel de logs cambiado a $level');
    ServiceLocator.log.i('Registro de prueba: nivel Info');
    ServiceLocator.log.w('Registro de prueba: nivel Warning');
    
    // Forzar vaciado del buffer de logs
    await ServiceLocator.log.flush();
    debugPrint('SettingsProvider: buffer de logs vaciado');
    
    notifyListeners();
  }

  /// Establecer orientación de pantalla para móviles
  Future<void> setMobileOrientation(String orientation) async {
    ServiceLocator.log.d('SettingsProvider: establecer orientación móvil - $orientation');
    _mobileOrientation = orientation;
    await _saveSettings();
    notifyListeners();
  }

  /// Establecer si se muestra el historial en la pantalla principal
  Future<void> setShowWatchHistoryOnHome(bool show) async {
    ServiceLocator.log.d('SettingsProvider: mostrar historial en Home - $show');
    _showWatchHistoryOnHome = show;
    await _saveSettings();
    notifyListeners();
  }

  /// Establecer si se muestran favoritos en la pantalla principal
  Future<void> setShowFavoritesOnHome(bool show) async {
    ServiceLocator.log.d('SettingsProvider: mostrar favoritos en Home - $show');
    _showFavoritesOnHome = show;
    await _saveSettings();
    notifyListeners();
  }

  // Reset all settings to defaults
  Future<void> resetSettings() async {
    _themeMode = 'dark';
    _autoRefresh = false;
    _refreshInterval = 24;
    _defaultQuality = 'auto';
    _hardwareDecoding = true;
    _channelMergeRule = 'name_group';
    _decodingMode = 'auto';
    _windowsHwdecMode = 'auto-safe';
    _allowSoftwareFallback = true;
    _videoOutput = 'auto';
    _bufferSize = 30;
    _enableEpg = true;
    _epgUrl = null;
    _parentalControl = false;
    _parentalPin = null;
    _autoPlay = false;
    _rememberLastChannel = true;
    _volumeNormalization = false;
    _volumeBoost = 0;
    _bufferStrength = 'fast';
    _showFps = true;
    _showClock = true;
    _showNetworkSpeed = true;
    _showVideoInfo = true;
    _progressBarMode = 'auto';
    _enableMultiScreen = true;
    _defaultScreenPosition = 1;
    _activeScreenIndex = 0;
    _lastMultiScreenSourceIndexes = [0, 0, 0, 0];
    _darkColorScheme = 'ocean';
    _lightColorScheme = 'sky';
    _fontFamily = 'Arial';

    await _saveSettings();
    
    // Restablecer el nivel de logs a 'off' (optimización de rendimiento)
    await ServiceLocator.prefs.setString('log_level', 'off');
    await ServiceLocator.log.setLogLevel(LogLevel.off);
    
    notifyListeners();
  }
}

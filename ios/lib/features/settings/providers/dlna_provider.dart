import 'package:flutter/foundation.dart';
import '../../../core/services/dlna_service.dart';
import '../../../core/services/service_locator.dart';

/// Gestión del estado del servicio DLNA
class DlnaProvider extends ChangeNotifier {
  final DlnaService _dlnaService = DlnaService();
  static const String _keyDlnaEnabled = 'dlna_enabled';

  bool _isEnabled = false;
  bool _isRunning = false;
  bool _isActiveSession = false; // DLNA 
  String? _pendingUrl;
  String? _pendingTitle;

  bool get isEnabled => _isEnabled;
  bool get isRunning => _isRunning;
  bool get isActiveSession => _isActiveSession; // DLNA
  String get deviceName => _dlnaService.deviceName;
  String? get pendingUrl => _pendingUrl;
  String? get pendingTitle => _pendingTitle;

  // Callbacks de reproducción (establecidos externamente)
  Function(String url, String? title)? onPlayRequested;
  Function()? onPauseRequested;
  Function()? onStopRequested;
  Function(Duration position)? onSeekRequested;
  Function(int volume)? onVolumeRequested;

  DlnaProvider() {
    _setupCallbacks();
    // Inicia el servicio DLNA en segundo plano de forma asíncrona
    Future.microtask(() => _autoStart());
  }
  
  /// Autoarranque del servicio DLNA (si estaba habilitado previamente)
  Future<void> _autoStart() async {
    try {
      final prefs = ServiceLocator.prefs;
      // Imprime todas las claves de SharedPreferences para depuración
      final allKeys = prefs.getKeys();
      ServiceLocator.log.d('SharedPreferences keys = $allKeys', tag: 'DLNA');

      final wasEnabled = prefs.getBool(_keyDlnaEnabled) ?? false;
      ServiceLocator.log.d('Revisar estado autoarranque - key=$_keyDlnaEnabled, wasEnabled=$wasEnabled', tag: 'DLNA');

      if (wasEnabled) {
        ServiceLocator.log.d('Iniciando servicio en segundo plano...', tag: 'DLNA');
        final success = await setEnabled(true);
        ServiceLocator.log.d('Autoarranque ${success ? 'exitoso' : 'fallido'}', tag: 'DLNA');
      }
    } catch (e, stack) {
      ServiceLocator.log.e('DLNA: Error al autoarrancar - $e');
      ServiceLocator.log.e('DLNA: Stack trace - $stack');
    }
  }

  void _setupCallbacks() {
    _dlnaService.onPlayUrl = (url, title) {
      _pendingUrl = url;
      _pendingTitle = title;
      _isActiveSession = true;
      notifyListeners();
      onPlayRequested?.call(url, title);
    };

    _dlnaService.onPause = () {
      onPauseRequested?.call();
    };

    _dlnaService.onStop = () {
      _pendingUrl = null;
      _pendingTitle = null;
      _isActiveSession = false;
      notifyListeners();
      onStopRequested?.call();
    };

    _dlnaService.onSetVolume = (volume) {
      onVolumeRequested?.call(volume);
    };

    _dlnaService.onSeek = (position) {
      onSeekRequested?.call(position);
    };
  }

  /// Habilitar/Deshabilitar el servicio DLNA
  Future<bool> setEnabled(bool enabled) async {
    if (enabled == _isEnabled) return true;

    if (enabled) {
      final success = await _dlnaService.start();
      if (success) {
        _isEnabled = true;
        _isRunning = true;
        // Guardar estado habilitado
        try {
          final prefs = ServiceLocator.prefs;
          await prefs.setBool(_keyDlnaEnabled, true);
          ServiceLocator.log.d('Estado habilitado guardado - key=$_keyDlnaEnabled, value=true', tag: 'DLNA');
          // Verificar si el guardado fue exitoso
          final saved = prefs.getBool(_keyDlnaEnabled);
          ServiceLocator.log.d('Verificación de guardado - saved=$saved', tag: 'DLNA');
        } catch (e) {
          ServiceLocator.log.d('Error al guardar estado habilitado - $e', tag: 'DLNA');
        }
        notifyListeners();
        return true;
      }
      return false;
    } else {
      await _dlnaService.stop();
      _isEnabled = false;
      _isRunning = false;
      _isActiveSession = false;
      _pendingUrl = null;
      _pendingTitle = null;
      // Guardar estado deshabilitado
      try {
        final prefs = ServiceLocator.prefs;
        await prefs.setBool(_keyDlnaEnabled, false);
        ServiceLocator.log.d('Estado deshabilitado guardado - key=$_keyDlnaEnabled, value=false', tag: 'DLNA');
      } catch (e) {
        ServiceLocator.log.d('Error al guardar estado deshabilitado - $e', tag: 'DLNA');
      }
      notifyListeners();
      return true;
    }
  }

  /// Actualizar estado de reproducción (usado por PlayerProvider)
  void updatePlayState({
    String? state,
    Duration? position,
    Duration? duration,
  }) {
    _dlnaService.updatePlayState(
      state: state,
      position: position,
      duration: duration,
    );
  }
  
  /// Notificar al servicio DLNA que la reproducción se ha detenido (llamar al salir)
  void notifyPlaybackStopped() {
    _dlnaService.updatePlayState(state: 'STOPPED');
    _pendingUrl = null;
    _pendingTitle = null;
    _isActiveSession = false;
    notifyListeners();
  }
  
  /// Sincronizar estado del reproductor con DLNA (llamadas periódicas)
  void syncPlayerState({
    required bool isPlaying,
    required bool isPaused,
    required Duration position,
    required Duration duration,
  }) {
    String state;
    if (isPlaying) {
      state = 'PLAYING';
    } else if (isPaused) {
      state = 'PAUSED_PLAYBACK';
    } else {
      state = 'STOPPED';
    }
    
    _dlnaService.updatePlayState(
      state: state,
      position: position,
      duration: duration,
    );
  }

  /// Limpiar contenido pendiente de reproducción
  void clearPending() {
    _pendingUrl = null;
    _pendingTitle = null;
    notifyListeners();
  }

  @override
  void dispose() {
    _dlnaService.stop();
    super.dispose();
  }
}

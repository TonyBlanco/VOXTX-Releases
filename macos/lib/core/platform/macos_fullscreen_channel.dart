import 'package:window_manager/window_manager.dart';

/// macOS fullscreen helper — uses `window_manager` directly, no native channel needed.
class MacOSFullscreen {
  /// Enter native macOS fullscreen.
  static Future<void> enterFullscreen() => windowManager.setFullScreen(true);

  /// Exit native macOS fullscreen.
  static Future<void> exitFullscreen() => windowManager.setFullScreen(false);

  /// Whether the window is currently in fullscreen mode.
  static Future<bool> isFullscreen() => windowManager.isFullScreen();
}

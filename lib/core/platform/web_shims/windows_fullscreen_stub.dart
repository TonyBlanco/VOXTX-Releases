/// Web stub for `windows_fullscreen_native.dart`.
///
/// No-op implementation — fullscreen is not managed via Win32 API on web.

class WindowsFullscreenNative {
  static bool initialize() => false;
  static int? getWindowHandle() => null;
  static bool isFullScreen() => false;
  static bool enterFullScreen() => false;
  static bool exitFullScreen() => false;
  static bool toggleFullScreen() => false;
}

/// Web stub for `package:window_manager/window_manager.dart`.
///
/// Provides no-op implementations so web compilation succeeds.
/// All window management calls are silently ignored on web.
import 'dart:ui';

/// Global instance (same pattern as the real package).
final WindowManager windowManager = WindowManager._();

class WindowManager {
  WindowManager._();

  Future<void> ensureInitialized() async {}
  Future<void> waitUntilReadyToShow(
      [WindowOptions? options, VoidCallback? callback]) async {
    callback?.call();
  }

  Future<void> show() async {}
  Future<void> hide() async {}
  Future<void> focus() async {}
  Future<void> blur() async {}
  Future<void> close() async {}
  Future<void> destroy() async {}
  Future<void> minimize() async {}
  Future<void> maximize() async {}
  Future<void> unmaximize() async {}
  Future<void> restore() async {}
  Future<bool> isMinimized() async => false;
  Future<bool> isMaximized() async => false;
  Future<bool> isFullScreen() async => false;
  Future<void> setFullScreen(bool fullscreen) async {}
  Future<bool> isAlwaysOnTop() async => false;
  Future<void> setAlwaysOnTop(bool isAlwaysOnTop) async {}
  Future<Size> getSize() async => const Size(1280, 720);
  Future<void> setSize(Size size) async {}
  Future<void> setMinimumSize(Size size) async {}
  Future<void> setMaximumSize(Size size) async {}
  Future<Offset> getPosition() async => Offset.zero;
  Future<void> setPosition(Offset position) async {}
  Future<void> setTitle(String title) async {}
  Future<String> getTitle() async => '';
  Future<void> setTitleBarStyle(TitleBarStyle style,
      {bool windowButtonVisibility = true}) async {}
  Future<bool> isPreventClose() async => false;
  Future<void> setPreventClose(bool isPreventClose) async {}
  Future<bool> isResizable() async => true;
  Future<void> setResizable(bool isResizable) async {}
  Future<double> getOpacity() async => 1.0;
  Future<void> setOpacity(double opacity) async {}
  Future<void> setBackgroundColor(Color color) async {}
  Future<void> setBrightness(Brightness brightness) async {}
  Future<Rect> getBounds() async => Rect.zero;
  Future<void> setBounds(Rect? bounds) async {}
  Future<bool> isSkipTaskbar() async => false;
  Future<void> setSkipTaskbar(bool isSkipTaskbar) async {}
  Future<void> setProgressBar(double progress) async {}
  Future<bool> hasShadow() async => false;
  Future<void> setHasShadow(bool hasShadow) async {}
  Future<bool> isFocused() async => false;
  Future<bool> isVisible() async => true;
  Future<bool> isClosable() async => true;

  Future<void> startDragging() async {}

  void addListener(WindowListener listener) {}
  void removeListener(WindowListener listener) {}
}

mixin WindowListener {
  void onWindowFocus() {}
  void onWindowBlur() {}
  void onWindowMaximize() {}
  void onWindowUnmaximize() {}
  void onWindowMinimize() {}
  void onWindowRestore() {}
  void onWindowResize() {}
  void onWindowMove() {}
  void onWindowClose() {}
  void onWindowMoved() {}
  void onWindowResized() {}
  void onWindowEvent(String eventName) {}
  void onWindowEnterFullScreen() {}
  void onWindowLeaveFullScreen() {}
  void onWindowDocked() {}
  void onWindowUndocked() {}
}

class WindowOptions {
  final Size? size;
  final Size? minimumSize;
  final Size? maximumSize;
  final bool? center;
  final Color? backgroundColor;
  final bool? skipTaskbar;
  final String? title;
  final TitleBarStyle? titleBarStyle;
  final bool? windowButtonVisibility;
  final bool? fullScreen;
  final bool? alwaysOnTop;

  const WindowOptions({
    this.size,
    this.minimumSize,
    this.maximumSize,
    this.center,
    this.backgroundColor,
    this.skipTaskbar,
    this.title,
    this.titleBarStyle,
    this.windowButtonVisibility,
    this.fullScreen,
    this.alwaysOnTop,
  });
}

enum TitleBarStyle {
  normal,
  hidden,
}

/// Web stub for `windows_pip_channel.dart`.
///
/// No-op implementation — PiP via window_manager is not available on web.
import 'package:flutter/foundation.dart';

class WindowsPipChannel {
  static final ValueNotifier<bool> pipModeNotifier = ValueNotifier<bool>(false);

  static bool get isInPipMode => false;
  static bool get isPinned => false;
  static bool get isSupported => false;

  static Future<bool> enterPipMode() async => false;
  static Future<bool> exitPipMode() async => false;
  static Future<bool> togglePipMode() async => false;
  static Future<bool> togglePin() async => false;
  static Future<void> updatePosition(String position) async {}
}

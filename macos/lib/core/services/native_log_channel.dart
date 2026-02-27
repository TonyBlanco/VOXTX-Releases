import 'package:flutter/services.dart';
import 'service_locator.dart';

/// 
/// AndroidFlutterLogService
class NativeLogChannel {
  static const MethodChannel _channel = MethodChannel('com.flutteriptv/native_log');
  static bool _initialized = false;

  /// 
  static Future<void> init() async {
    if (_initialized) return;

    _channel.setMethodCallHandler((call) async {
      if (call.method == 'nativeLog') {
        final level = call.arguments['level'] as String?;
        final tag = call.arguments['tag'] as String?;
        final message = call.arguments['message'] as String?;

        if (level != null && tag != null && message != null) {
          _handleNativeLog(level, tag, message);
        }
      }
    });

    _initialized = true;
  }

  /// 
  static void _handleNativeLog(String level, String tag, String message) {
    //  [NATIVE] 
    final formattedMessage = '[NATIVE] [$tag] $message';

    switch (level.toLowerCase()) {
      case 'debug':
        ServiceLocator.log.d(formattedMessage);
        break;
      case 'info':
        ServiceLocator.log.i(formattedMessage);
        break;
      case 'warning':
        ServiceLocator.log.w(formattedMessage);
        break;
      case 'error':
        ServiceLocator.log.e(formattedMessage);
        break;
      default:
        ServiceLocator.log.i(formattedMessage);
    }
  }
}

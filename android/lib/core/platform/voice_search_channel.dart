import 'package:flutter/services.dart';
import '../services/service_locator.dart';

/// Voice search channel for Android TV.
/// Uses Android's RecognizerIntent for speech recognition.
class VoiceSearchChannel {
  static const _channel = MethodChannel('com.voxtv/voice_search');
  
  /// Callback for when voice search returns a result
  static Function(String query)? onVoiceSearchResult;

  /// Initialize the voice search channel listener
  static void init() {
    _channel.setMethodCallHandler(_handleMethod);
  }

  static Future<dynamic> _handleMethod(MethodCall call) async {
    switch (call.method) {
      case 'onVoiceResult':
        final query = call.arguments as String?;
        if (query != null && query.isNotEmpty) {
          ServiceLocator.log.d('Voice search result: $query', tag: 'VoiceSearch');
          onVoiceSearchResult?.call(query);
        }
        return null;
      default:
        throw PlatformException(
          code: 'UNIMPLEMENTED',
          message: 'Method ${call.method} not implemented',
        );
    }
  }

  /// Start voice recognition.
  /// Returns true if voice search was started successfully.
  static Future<bool> startVoiceSearch() async {
    try {
      final result = await _channel.invokeMethod<bool>('startVoiceSearch');
      return result ?? false;
    } on PlatformException catch (e) {
      ServiceLocator.log.e('Voice search error: ${e.message}', tag: 'VoiceSearch');
      return false;
    }
  }

  /// Check if voice search is available on this device.
  static Future<bool> isVoiceSearchAvailable() async {
    try {
      final result = await _channel.invokeMethod<bool>('isVoiceSearchAvailable');
      return result ?? false;
    } on PlatformException {
      return false;
    }
  }
}

import 'dart:io';
import 'dart:ui';
import 'package:flutter/foundation.dart';
import 'package:window_manager/window_manager.dart';
import 'package:screen_retriever/screen_retriever.dart';
import '../services/service_locator.dart';

/// Windows 
class WindowsPipChannel {
  static bool _isInMiniMode = false;
  static bool _isPinned = false;
  static Size? _originalSize;
  static Offset? _originalPosition;
  static bool _wasMaximized = false;
  static bool _wasFullScreen = false;
  
  // 
  static const double _miniWidth = 400;
  static const double _miniHeight = 225; // 16:9 
  static const double _margin = 20;

  // 
  static final ValueNotifier<bool> pipModeNotifier = ValueNotifier<bool>(false);

  /// 
  static bool get isInPipMode => _isInMiniMode;

  /// 
  static bool get isPinned => _isPinned;

  ///  Windows 
  static bool get isSupported => !kIsWeb && Platform.isWindows;

  /// 
  static Future<bool> enterPipMode() async {
    if (!isSupported || _isInMiniMode) return false;

    try {
      // 
      _wasFullScreen = await windowManager.isFullScreen();
      _wasMaximized = await windowManager.isMaximized();
      
      // 
      if (_wasFullScreen) {
        await windowManager.setFullScreen(false);
        await Future.delayed(const Duration(milliseconds: 200));
      }
      
      // 
      if (_wasMaximized) {
        await windowManager.unmaximize();
        await Future.delayed(const Duration(milliseconds: 200));
      }
      
      _originalSize = await windowManager.getSize();
      _originalPosition = await windowManager.getPosition();

      // 
      final primaryDisplay = await screenRetriever.getPrimaryDisplay();
      final screenWidth = primaryDisplay.size.width;
      final screenHeight = primaryDisplay.size.height;
      
      ServiceLocator.log.d('WindowsPipChannel:  - $screenWidth x $screenHeight');
      
      // 
      final x = screenWidth - _miniWidth - _margin;
      final y = screenHeight - _miniHeight - _margin;

      ServiceLocator.log.d('WindowsPipChannel:  - ($x, $y)');

      // 
      await windowManager.setTitleBarStyle(TitleBarStyle.hidden);
      
      // 
      await windowManager.setMinimumSize(const Size(320, 180));
      await windowManager.setSize(const Size(_miniWidth, _miniHeight));
      await Future.delayed(const Duration(milliseconds: 100));
      
      // 
      await windowManager.setPosition(Offset(x, y));
      await Future.delayed(const Duration(milliseconds: 100));
      
      //  +  Win+D 
      await windowManager.setAlwaysOnTop(true);
      await windowManager.setSkipTaskbar(true);
      
      _isInMiniMode = true;
      _isPinned = true;
      pipModeNotifier.value = true; // 
      
      ServiceLocator.log.d('WindowsPipChannel: ');
      return true;
    } catch (e) {
      ServiceLocator.log.d('WindowsPipChannel: enterPipMode error: $e');
      return false;
    }
  }

  /// 
  static Future<bool> exitPipMode() async {
    if (!isSupported || !_isInMiniMode) return false;

    try {
      // 
      await windowManager.setAlwaysOnTop(false);
      await windowManager.setSkipTaskbar(false);
      
      // 
      await windowManager.setTitleBarStyle(TitleBarStyle.hidden);
      
      // 
      await windowManager.setMinimumSize(const Size(360, 600));
      
      // 
      if (_originalSize != null) {
        await windowManager.setSize(_originalSize!);
        await Future.delayed(const Duration(milliseconds: 100));
      }
      
      if (_originalPosition != null) {
        await windowManager.setPosition(_originalPosition!);
        await Future.delayed(const Duration(milliseconds: 100));
      }
      
      // 
      if (_wasMaximized) {
        await Future.delayed(const Duration(milliseconds: 100));
        await windowManager.maximize();
      }
      
      //  -  microtask 
      if (_wasFullScreen) {
        Future.microtask(() async {
          await Future.delayed(const Duration(milliseconds: 200));
          try {
            await windowManager.setFullScreen(true);
            ServiceLocator.log.d('WindowsPipChannel: ');
          } catch (e) {
            ServiceLocator.log.d('WindowsPipChannel: : $e');
          }
        });
      }

      _isInMiniMode = false;
      _isPinned = false;
      pipModeNotifier.value = false; // 
      
      ServiceLocator.log.d('WindowsPipChannel: ');
      return true;
    } catch (e) {
      ServiceLocator.log.d('WindowsPipChannel: exitPipMode error: $e');
      return false;
    }
  }

  /// 
  static Future<bool> togglePipMode() async {
    if (_isInMiniMode) {
      return exitPipMode();
    } else {
      return enterPipMode();
    }
  }

  /// 
  static Future<bool> togglePin() async {
    if (!isSupported) return false;

    try {
      _isPinned = !_isPinned;
      await windowManager.setAlwaysOnTop(_isPinned);
      ServiceLocator.log.d('WindowsPipChannel: : $_isPinned');
      return true;
    } catch (e) {
      ServiceLocator.log.d('WindowsPipChannel: togglePin error: $e');
      return false;
    }
  }
  
  /// 
  static void reset() {
    _isInMiniMode = false;
    _isPinned = false;
    _originalSize = null;
    _originalPosition = null;
    _wasMaximized = false;
    _wasFullScreen = false;
  }
}

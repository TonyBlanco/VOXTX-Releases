import 'dart:async';
import 'dart:io';

import 'package:flutter/services.dart';

import '../models/channel.dart';

/// Thin wrapper around Android native Google Cast SDK via MethodChannel.
class ChromecastService {
  ChromecastService._();
  static final ChromecastService instance = ChromecastService._();

  static const MethodChannel _channel =
      MethodChannel('com.flutteriptv/chromecast');

  Future<bool> isSupported() async {
    if (!Platform.isAndroid) return false;
    try {
      final supported = await _channel.invokeMethod<bool>('isSupported');
      return supported ?? false;
    } catch (_) {
      return false;
    }
  }

  Future<bool> isConnected() async {
    if (!Platform.isAndroid) return false;
    try {
      final connected = await _channel.invokeMethod<bool>('isConnected');
      return connected ?? false;
    } catch (_) {
      return false;
    }
  }

  Future<bool> showDevicePicker() async {
    if (!Platform.isAndroid) return false;
    try {
      final opened = await _channel.invokeMethod<bool>('showDevicePicker');
      return opened ?? false;
    } catch (_) {
      return false;
    }
  }

  Future<bool> stopCasting() async {
    if (!Platform.isAndroid) return false;
    try {
      final stopped = await _channel.invokeMethod<bool>('stopCasting');
      return stopped ?? false;
    } catch (_) {
      return false;
    }
  }

  Future<bool> castChannel(Channel channel) async {
    if (!Platform.isAndroid) return false;
    try {
      final ok = await _channel.invokeMethod<bool>('castMedia', {
        'url': channel.currentUrl,
        'title': channel.name,
        'imageUrl': channel.logoUrl,
        'isLive': channel.isLive,
        'contentType': _guessContentType(channel.currentUrl),
      });
      return ok ?? false;
    } catch (_) {
      return false;
    }
  }

  Future<bool> connectAndCast(Channel channel) async {
    if (!Platform.isAndroid) return false;

    final pickerOpened = await showDevicePicker();
    if (!pickerOpened) return false;

    // Wait briefly for the user to select a Cast route.
    const maxAttempts = 20;
    for (int i = 0; i < maxAttempts; i++) {
      await Future.delayed(const Duration(milliseconds: 500));
      if (await isConnected()) {
        return castChannel(channel);
      }
    }

    return false;
  }

  String _guessContentType(String url) {
    final lower = url.toLowerCase();
    if (lower.contains('.m3u8')) return 'application/x-mpegURL';
    if (lower.contains('.mpd')) return 'application/dash+xml';
    if (lower.contains('.mp4')) return 'video/mp4';
    if (lower.contains('.webm')) return 'video/webm';
    return 'video/*';
  }
}

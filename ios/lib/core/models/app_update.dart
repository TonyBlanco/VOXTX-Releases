import 'dart:io';
import 'package:flutter/services.dart';
import '../platform/platform_detector.dart';
import '../services/service_locator.dart';

class AppUpdate {
  final String version;
  final int build;
  final String releaseNotes;
  final String downloadUrl;
  final Map<String, dynamic> assets;
  final DateTime releaseDate;
  final String minVersion;

  AppUpdate({
    required this.version,
    required this.build,
    required this.releaseNotes,
    required this.downloadUrl,
    required this.assets,
    required this.releaseDate,
    this.minVersion = '1.0.0',
  });

  //  CPU
  static String? _cachedCpuAbi;
  static const _platformChannel = MethodChannel('com.voxtv/platform');

  ///  GitHub Pages version.json
  static Future<AppUpdate> fromVersionJsonAsync(
      Map<String, dynamic> json) async {
    final assets = json['assets'] as Map<String, dynamic>? ?? {};
    final changelog = json['changelog'] as Map<String, dynamic>? ?? {};

    //
    final locale = Platform.localeName.toLowerCase();
    final preferred = locale.startsWith('es') ? 'es' : 'en';
    final releaseNotes =
        changelog[preferred] ?? changelog['en'] ?? changelog['es'] ?? '';

    //
    final downloadUrl = await _getDownloadUrl(assets);

    return AppUpdate(
      version: json['version'] ?? '0.0.0',
      build: json['build'] ?? 0,
      releaseNotes: releaseNotes,
      downloadUrl: downloadUrl,
      assets: assets,
      releaseDate:
          DateTime.tryParse(json['releaseDate'] ?? '') ?? DateTime.now(),
      minVersion: json['minVersion'] ?? '1.0.0',
    );
  }

  ///  GitHub Pages version.json
  factory AppUpdate.fromVersionJson(Map<String, dynamic> json) {
    final assets = json['assets'] as Map<String, dynamic>? ?? {};
    final changelog = json['changelog'] as Map<String, dynamic>? ?? {};

    //
    final locale = Platform.localeName.toLowerCase();
    final preferred = locale.startsWith('es') ? 'es' : 'en';
    final releaseNotes =
        changelog[preferred] ?? changelog['en'] ?? changelog['es'] ?? '';

    //
    final downloadUrl = _getDownloadUrlSync(assets);

    return AppUpdate(
      version: json['version'] ?? '0.0.0',
      build: json['build'] ?? 0,
      releaseNotes: releaseNotes,
      downloadUrl: downloadUrl,
      assets: assets,
      releaseDate:
          DateTime.tryParse(json['releaseDate'] ?? '') ?? DateTime.now(),
      minVersion: json['minVersion'] ?? '1.0.0',
    );
  }

  ///  Android CPU
  static Future<String> _getAndroidArch() async {
    if (_cachedCpuAbi != null) return _cachedCpuAbi!;

    try {
      final abi = await _platformChannel.invokeMethod<String>('getCpuAbi');
      _cachedCpuAbi = abi ?? 'armeabi-v7a';
      ServiceLocator.log.d('UPDATE:  CPU : $_cachedCpuAbi');
    } catch (e) {
      ServiceLocator.log.d('UPDATE:  CPU : $e');
      _cachedCpuAbi = 'armeabi-v7a';
    }
    return _cachedCpuAbi!;
  }

  ///
  static Future<String> _getDownloadUrl(Map<String, dynamic> assets) async {
    if (Platform.isWindows) {
      return assets['windows'] ?? '';
    }

    if (Platform.isMacOS) {
      return assets['macos'] ?? '';
    }

    if (Platform.isIOS) {
      // iOS updates go through the App Store; the URL lives in assets.ios
      return assets['ios'] ?? '';
    }

    if (Platform.isAndroid) {
      final arch = await _getAndroidArch();
      ServiceLocator.log
          .d('UPDATE: Android : $arch, isTV: ${PlatformDetector.isTV}');

      //  TV
      final androidAssets = PlatformDetector.isTV
          ? assets['android_tv'] as Map<String, dynamic>?
          : assets['android_mobile'] as Map<String, dynamic>?;

      if (androidAssets != null) {
        //  universal
        return androidAssets[arch] ?? androidAssets['universal'] ?? '';
      }

      //
      return assets['android'] ?? '';
    }

    return '';
  }

  ///
  static String _getDownloadUrlSync(Map<String, dynamic> assets) {
    if (Platform.isWindows) {
      return assets['windows'] ?? '';
    }

    if (Platform.isMacOS) {
      return assets['macos'] ?? '';
    }

    if (Platform.isIOS) {
      return assets['ios'] ?? '';
    }

    if (Platform.isAndroid) {
      //  armeabi-v7a
      final arch = _cachedCpuAbi ?? 'armeabi-v7a';
      ServiceLocator.log
          .d('UPDATE: Android (sync): $arch, isTV: ${PlatformDetector.isTV}');

      //  TV
      final androidAssets = PlatformDetector.isTV
          ? assets['android_tv'] as Map<String, dynamic>?
          : assets['android_mobile'] as Map<String, dynamic>?;

      if (androidAssets != null) {
        //  universal
        return androidAssets[arch] ?? androidAssets['universal'] ?? '';
      }

      //
      return assets['android'] ?? '';
    }

    return '';
  }

  ///  CPU
  static Future<void> preloadCpuArch() async {
    if (Platform.isAndroid) {
      await _getAndroidArch();
    }
  }

  ///  GitHub API
  factory AppUpdate.fromJson(Map<String, dynamic> json) {
    // tagName'v'
    String version = json['tag_name'] ?? '0.0.0';
    if (version.startsWith('v')) {
      version = version.substring(1);
    }

    //
    String releaseNotes = json['body'] ?? '';

    //
    DateTime releaseDate =
        DateTime.tryParse(json['published_at'] ?? '') ?? DateTime.now();

    // URL
    String downloadUrl = '';

    if (json['assets'] != null && json['assets'] is List) {
      for (final asset in json['assets']) {
        final name = asset['name']?.toString().toLowerCase() ?? '';
        final url = asset['browser_download_url'] ?? '';

        if (Platform.isAndroid && name.endsWith('.apk')) {
          //
          if (PlatformDetector.isTV && name.contains('tv')) {
            if (name.contains('arm64')) {
              downloadUrl = url;
              break;
            } else if (downloadUrl.isEmpty) {
              downloadUrl = url;
            }
          } else if (!PlatformDetector.isTV && name.contains('mobile')) {
            if (name.contains('arm64')) {
              downloadUrl = url;
              break;
            } else if (downloadUrl.isEmpty) {
              downloadUrl = url;
            }
          }
        } else if (Platform.isWindows &&
            (name.endsWith('.exe') || name.endsWith('.zip'))) {
          downloadUrl = url;
        } else if (Platform.isMacOS && name.endsWith('.dmg')) {
          downloadUrl = url;
        }
      }

      //  APK/EXE
      if (downloadUrl.isEmpty && json['assets'].isNotEmpty) {
        for (final asset in json['assets']) {
          final name = asset['name']?.toString().toLowerCase() ?? '';
          final url = asset['browser_download_url'] ?? '';
          if ((Platform.isAndroid && name.endsWith('.apk')) ||
              (Platform.isWindows &&
                  (name.endsWith('.exe') || name.endsWith('.zip'))) ||
              (Platform.isMacOS && name.endsWith('.dmg'))) {
            downloadUrl = url;
            break;
          }
        }
      }
    }

    return AppUpdate(
      version: version,
      build: 0,
      releaseNotes: releaseNotes,
      downloadUrl: downloadUrl,
      assets: {},
      releaseDate: releaseDate,
    );
  }

  Map<String, dynamic> toJson() {
    return {
      'version': version,
      'build': build,
      'releaseNotes': releaseNotes,
      'downloadUrl': downloadUrl,
      'assets': assets,
      'releaseDate': releaseDate.toIso8601String(),
      'minVersion': minVersion,
    };
  }

  @override
  String toString() {
    return 'AppUpdate(version: $version, build: $build, downloadUrl: $downloadUrl, releaseDate: $releaseDate)';
  }
}

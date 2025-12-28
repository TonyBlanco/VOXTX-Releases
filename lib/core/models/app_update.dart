import 'dart:io';
import 'package:flutter/foundation.dart';
import '../platform/platform_detector.dart';

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

  /// 从 GitHub Pages version.json 解析
  factory AppUpdate.fromVersionJson(Map<String, dynamic> json) {
    final assets = json['assets'] as Map<String, dynamic>? ?? {};
    final changelog = json['changelog'] as Map<String, dynamic>? ?? {};
    
    // 根据当前语言选择更新日志，默认中文
    final locale = Platform.localeName.startsWith('zh') ? 'zh' : 'en';
    final releaseNotes = changelog[locale] ?? changelog['zh'] ?? changelog['en'] ?? '';
    
    // 根据平台和架构选择下载链接
    final downloadUrl = _getDownloadUrl(assets);

    return AppUpdate(
      version: json['version'] ?? '0.0.0',
      build: json['build'] ?? 0,
      releaseNotes: releaseNotes,
      downloadUrl: downloadUrl,
      assets: assets,
      releaseDate: DateTime.tryParse(json['releaseDate'] ?? '') ?? DateTime.now(),
      minVersion: json['minVersion'] ?? '1.0.0',
    );
  }

  /// 根据平台和架构获取下载链接
  static String _getDownloadUrl(Map<String, dynamic> assets) {
    if (Platform.isWindows) {
      return assets['windows'] ?? '';
    }
    
    if (Platform.isAndroid) {
      // 获取设备架构
      final arch = _getAndroidArch();
      debugPrint('UPDATE: Android 架构: $arch, isTV: ${PlatformDetector.isTV}');
      
      // 根据是否是 TV 选择对应的包
      final androidAssets = PlatformDetector.isTV 
          ? assets['android_tv'] as Map<String, dynamic>?
          : assets['android_mobile'] as Map<String, dynamic>?;
      
      if (androidAssets != null) {
        // 优先使用对应架构的包，否则使用 universal
        return androidAssets[arch] ?? androidAssets['universal'] ?? '';
      }
      
      // 兼容旧格式
      return assets['android'] ?? '';
    }
    
    return '';
  }

  /// 获取 Android 设备架构
  static String _getAndroidArch() {
    // 通过 Dart 的 Platform 无法直接获取 CPU 架构
    // 这里使用一个简化的方法：优先返回 arm64-v8a（大多数现代设备）
    // 实际项目中可以通过 MethodChannel 从原生获取
    // 或者直接使用 universal 包
    return 'arm64-v8a';
  }

  /// 从 GitHub API 解析（保留兼容性）
  factory AppUpdate.fromJson(Map<String, dynamic> json) {
    // 从tagName中提取版本号，移除'v'前缀
    String version = json['tag_name'] ?? '0.0.0';
    if (version.startsWith('v')) {
      version = version.substring(1);
    }

    // 获取发布说明
    String releaseNotes = json['body'] ?? '';

    // 获取发布时间
    DateTime releaseDate = DateTime.tryParse(json['published_at'] ?? '') ?? DateTime.now();

    // 获取下载URL
    String downloadUrl = '';
    
    if (json['assets'] != null && json['assets'] is List) {
      for (final asset in json['assets']) {
        final name = asset['name']?.toString().toLowerCase() ?? '';
        final url = asset['browser_download_url'] ?? '';
        
        if (Platform.isAndroid && name.endsWith('.apk')) {
          // 优先选择对应架构的包
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
        } else if (Platform.isWindows && (name.endsWith('.exe') || name.endsWith('.zip'))) {
          downloadUrl = url;
        }
      }
      
      // 如果没有匹配到，使用第一个 APK/EXE
      if (downloadUrl.isEmpty && json['assets'].isNotEmpty) {
        for (final asset in json['assets']) {
          final name = asset['name']?.toString().toLowerCase() ?? '';
          final url = asset['browser_download_url'] ?? '';
          if ((Platform.isAndroid && name.endsWith('.apk')) ||
              (Platform.isWindows && (name.endsWith('.exe') || name.endsWith('.zip')))) {
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

import 'dart:convert';
import 'dart:io';
import 'package:http/http.dart' as http;
import 'package:package_info_plus/package_info_plus.dart';
import 'package:url_launcher/url_launcher.dart';
import 'package:version/version.dart';
import 'package:path_provider/path_provider.dart';
import '../models/app_update.dart';
import 'service_locator.dart';

class UpdateService {
  //  GitHub Pages 
  //  VOXTX-Android 

  static const String _versionJsonUrl = 'https://raw.githubusercontent.com/TonyBlanco/VOXTX-Releases/main/version.json';
  static const String _githubReleasesUrl = 'https://github.com/TonyBlanco/VOXTX-Releases/releases';

  // 
  static const int _checkUpdateInterval = 24;
  static const String _lastUpdateCheckKey = 'last_update_check';

  /// 
  Future<AppUpdate?> checkForUpdates({bool forceCheck = false}) async {
    try {
      ServiceLocator.log.d('UPDATE: ...');

      // 
      if (!forceCheck) {
        final lastCheck = await _getLastUpdateCheckTime();
        final now = DateTime.now();
        if (lastCheck != null && now.difference(lastCheck).inHours < _checkUpdateInterval) {
          ServiceLocator.log.d('UPDATE: 24');
          return null;
        }
      }

      // 
      final currentVersion = await getCurrentVersion();
      ServiceLocator.log.d('UPDATE: : $currentVersion');

      // 
      final latestRelease = await _fetchLatestRelease();
      if (latestRelease == null) {
        ServiceLocator.log.d('UPDATE: ');
        return null;
      }

      ServiceLocator.log.d('UPDATE: : ${latestRelease.version}');

      // 
      if (_isNewerVersion(latestRelease.version, currentVersion)) {
        ServiceLocator.log.d('UPDATE: ');
        await _saveLastUpdateCheckTime();
        return latestRelease;
      } else {
        ServiceLocator.log.d('UPDATE: ');
        await _saveLastUpdateCheckTime();
        return null;
      }
    } catch (e) {
      ServiceLocator.log.d('UPDATE: : $e');
      return null;
    }
  }

  /// 
  Future<String> getCurrentVersion() async {
    try {
      final packageInfo = await PackageInfo.fromPlatform();
      return packageInfo.version;
    } catch (e) {
      ServiceLocator.log.d('UPDATE: : $e');
      return '0.0.0';
    }
  }

  ///  GitHub Pages 
  Future<AppUpdate?> _fetchLatestRelease() async {
    try {
      final response = await http.get(
        Uri.parse(_versionJsonUrl),
        headers: {
          'User-Agent': 'FlutterIPTV-App',
          'Cache-Control': 'no-cache',
        },
      ).timeout(const Duration(seconds: 10));

      if (response.statusCode == 200) {
        final Map<String, dynamic> data = json.decode(response.body);
        // 
        return await AppUpdate.fromVersionJsonAsync(data);
      } else {
        ServiceLocator.log.d('UPDATE: : ${response.statusCode}');
      }
    } catch (e) {
      ServiceLocator.log.d('UPDATE: : $e');
    }
    return null;
  }

  /// 
  bool _isNewerVersion(String newVersion, String currentVersion) {
    try {
      final newVer = Version.parse(newVersion);
      final currentVer = Version.parse(currentVersion);
      return newVer > currentVer;
    } catch (e) {
      ServiceLocator.log.d('UPDATE: : $e');
      return false;
    }
  }

  /// 
  Future<bool> openDownloadPage() async {
    try {
      final uri = Uri.parse(_githubReleasesUrl);
      ServiceLocator.log.d('UPDATE: : $_githubReleasesUrl');
      return await launchUrl(
        uri,
        mode: LaunchMode.externalApplication,
      );
    } catch (e) {
      ServiceLocator.log.d('UPDATE: : $e');
      return false;
    }
  }

  /// 
  Future<File?> downloadUpdate(AppUpdate update, {Function(double)? onProgress}) async {
    try {
      final downloadUrl = update.downloadUrl;
      if (downloadUrl.isEmpty) {
        ServiceLocator.log.d('UPDATE: ');
        return null;
      }

      ServiceLocator.log.d('UPDATE: : $downloadUrl');

      // 
      final tempDir = await getTemporaryDirectory();
      
      //  URL 
      String fileName;
      final uri = Uri.parse(downloadUrl);
      final urlFileName = uri.pathSegments.isNotEmpty ? uri.pathSegments.last : '';
      if (urlFileName.isNotEmpty) {
        fileName = urlFileName;
      } else if (Platform.isWindows) {
        fileName = 'flutter_iptv_update.exe';
      } else if (Platform.isMacOS) {
        fileName = 'flutter_iptv_update.dmg';
      } else {
        fileName = 'flutter_iptv_update.apk';
      }
      
      final file = File('${tempDir.path}/$fileName');
      ServiceLocator.log.d('UPDATE: : ${file.path}');

      // 
      final request = http.Request('GET', Uri.parse(downloadUrl));
      request.headers['User-Agent'] = 'FlutterIPTV-App';
      
      final response = await http.Client().send(request);
      
      if (response.statusCode != 200) {
        ServiceLocator.log.d('UPDATE: : ${response.statusCode}');
        return null;
      }

      final contentLength = response.contentLength ?? 0;
      ServiceLocator.log.d('UPDATE: : $contentLength bytes');
      int receivedBytes = 0;
      
      final sink = file.openWrite();
      
      await for (final chunk in response.stream) {
        sink.add(chunk);
        receivedBytes += chunk.length;
        if (contentLength > 0 && onProgress != null) {
          onProgress(receivedBytes / contentLength);
        }
      }
      
      await sink.close();
      
      ServiceLocator.log.d('UPDATE: : ${file.path}, : $receivedBytes bytes');
      return file;
    } catch (e, stack) {
      ServiceLocator.log.d('UPDATE: : $e');
      ServiceLocator.log.d('UPDATE: Stack: $stack');
      return null;
    }
  }

  /// 
  Future<DateTime?> _getLastUpdateCheckTime() async {
    try {
      final prefs = ServiceLocator.prefs;
      final timestamp = prefs.getInt(_lastUpdateCheckKey);
      if (timestamp != null) {
        return DateTime.fromMillisecondsSinceEpoch(timestamp);
      }
      return null;
    } catch (e) {
      ServiceLocator.log.d('UPDATE: : $e');
      return null;
    }
  }

  /// 
  Future<void> _saveLastUpdateCheckTime() async {
    try {
      final prefs = ServiceLocator.prefs;
      await prefs.setInt(_lastUpdateCheckKey, DateTime.now().millisecondsSinceEpoch);
      ServiceLocator.log.d('UPDATE: : ${DateTime.now()}');
    } catch (e) {
      ServiceLocator.log.d('UPDATE: : $e');
    }
  }
}

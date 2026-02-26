import 'package:shared_preferences/shared_preferences.dart';
import 'package:dio/dio.dart';
import 'package:path_provider/path_provider.dart';
import 'dart:io';

import '../database/database_helper.dart';
import '../platform/platform_detector.dart';
import 'update_service.dart';
import 'log_service.dart';
import 'channel_logo_service.dart';
import 'redirect_cache_service.dart';
import 'watch_history_service.dart';
import 'omdb_service.dart';
import 'watch_later_service.dart';
import '../managers/update_manager.dart';
import 'offline_download_service.dart';

/// Service Locator for dependency injection
class ServiceLocator {
  static late SharedPreferences _prefs;
  static late DatabaseHelper _database;
  static late Directory _appDir;
  static late UpdateService _updateService;
  static late UpdateManager _updateManager;
  static late LogService _logService;
  static late ChannelLogoService _channelLogoService;
  static late RedirectCacheService _redirectCache;
  static late WatchHistoryService _watchHistory;
  static late OmdbService _omdbService;
  static late WatchLaterService _watchLaterService;
  static late OfflineDownloadService _offlineDownloads;

  static SharedPreferences get prefs => _prefs;
  static DatabaseHelper get database => _database;
  static Directory get appDir => _appDir;
  static UpdateService get updateService => _updateService;
  static UpdateManager get updateManager => _updateManager;
  static LogService get log => _logService;
  static ChannelLogoService get channelLogo => _channelLogoService;
  static RedirectCacheService get redirectCache => _redirectCache;
  static WatchHistoryService get watchHistory => _watchHistory;
  static OmdbService get omdb => _omdbService;
  static WatchLaterService get watchLater => _watchLaterService;
  static OfflineDownloadService get offlineDownloads => _offlineDownloads;
  
  /// Check if log service is initialized
  static bool get isLogInitialized {
    try {
      return true; // _logService is always initialized after initPrefs()
    } catch (e) {
      return false;
    }
  }

  static Future<void> initPrefs() async {
    // Initialize SharedPreferences - Fast and critical for theme
    _prefs = await SharedPreferences.getInstance();
    
    // Initialize log service early (after prefs) - pass prefs to avoid circular dependency
    _logService = LogService();
    await _logService.init(prefs: _prefs);

    // Detect platform (after log service is initialized)
    await PlatformDetector.init();
  }

  static Future<void> initDatabase() async {
    // Initialize app directory
    _appDir = await getApplicationDocumentsDirectory();

    // Initialize database
    _database = DatabaseHelper();
    await _database.initialize();

    // Initialize channel logo service (after database)
    _channelLogoService = ChannelLogoService(_database);
    // Initialize in background to avoid blocking app startup
    _channelLogoService.initialize().catchError((e) {
      log.e('Failed to initialize channel logo service: $e');
    });

    // Initialize watch history service (after database)
    _watchHistory = WatchHistoryService();
  }

  static Future<void> init() async {
    await initPrefs();
    await initDatabase();

    // Initialize update service
    _updateService = UpdateService();
    _updateManager = UpdateManager();
    
    // Initialize redirect cache service
    _redirectCache = RedirectCacheService();

    // OMDb metadata service (user-provided API key)
    _omdbService = OmdbService(apiKey: '1a04c33a');

    // Watch later service
    _watchLaterService = WatchLaterService(_prefs);

    // Offline download service
    _offlineDownloads = OfflineDownloadService(_database);
  }

  static Future<void> dispose() async {
    // 
    try {
      await _logService.flush();
    } catch (e) {
      //  print  debugPrint static 
      print('ServiceLocator:  - $e');
    }
    
    await _database.close();
  }

  /// Create a Dio instance configured with app-wide defaults
  static Dio createDio({Map<String, dynamic>? extraHeaders}) {
    final dio = Dio();
    dio.options.connectTimeout = const Duration(seconds: 15);
    dio.options.receiveTimeout = const Duration(seconds: 30);
    dio.options.followRedirects = true;

    final defaultHeaders = <String, dynamic>{
      'User-Agent': 'VOXTV/1.5',
      'Accept': 'application/json,text/plain,*/*',
    };

    if (extraHeaders != null) {
      defaultHeaders.addAll(extraHeaders);
    }

    dio.options.headers = defaultHeaders;
    return dio;
  }
}

import 'dart:io';
import 'package:flutter/foundation.dart';
import 'package:logger/logger.dart';
import 'package:path_provider/path_provider.dart';
import 'package:path/path.dart' as path;
import 'package:intl/intl.dart';
import 'package:shared_preferences/shared_preferences.dart';
import 'service_locator.dart';

/// 
enum LogLevel {
  debug,    // 
  release,  // 
  off,      // 
}

///  - 
class LogService {
  static final LogService _instance = LogService._internal();
  factory LogService() => _instance;
  LogService._internal();

  Logger? _logger;
  LogLevel _currentLevel = LogLevel.release;
  String? _logFilePath;
  bool _initialized = false;
  
  // 
  final List<String> _logBuffer = [];
  static const int _bufferSize = 10; // 10
  DateTime? _lastFlushTime; // 
  static const Duration _autoFlushInterval = Duration(seconds: 2); // 2

  /// 
  Future<void> init({SharedPreferences? prefs}) async {
    if (_initialized) return;

    try {
      // 
      final preferences = prefs ?? ServiceLocator.prefs;
      
      String levelString = preferences.getString('log_level') ?? 'off';
      debugPrint('LogService:  SharedPreferences : $levelString');
      
      _currentLevel = _parseLogLevel(levelString);
      debugPrint('LogService: : ${_currentLevel.name}');

      if (_currentLevel == LogLevel.off) {
        debugPrint('LogService: ');
        _initialized = true;
        return;
      }

      // 
      _logFilePath = await _getLogFilePath();
      
      if (_logFilePath != null) {
        // 
        _file = File(_logFilePath!);
        
        // 
        final logDir = Directory(path.dirname(_logFilePath!));
        if (!await logDir.exists()) {
          await logDir.create(recursive: true);
        }

        // 7
        await _cleanOldLogs(logDir);

        //  Logger 
        // Logger  level  all Filter 
        _logger = Logger(
          filter: _LogFilter(_currentLevel),
          printer: _LogPrinter(),
          output: _BatchFileOutput(this),
          level: Level.all, //  Filter 
        );

        debugPrint('LogService: : $_logFilePath');
        debugPrint('LogService: : ${_currentLevel.name}');
        
        // 
        _logger?.i('========================================');
        _logger?.i(' - ${DateTime.now()}');
        _logger?.i(': ${_currentLevel.name}');
        _logger?.i('========================================');
        
        // 
        await flush();
      }

      _initialized = true;
    } catch (e) {
      debugPrint('LogService:  - $e');
    }
  }

  /// 
  Future<String?> _getLogFilePath() async {
    try {
      Directory? logDir;

      if (Platform.isWindows) {
        // Windows:  logs 
        final exePath = Platform.resolvedExecutable;
        final exeDir = path.dirname(exePath);
        logDir = Directory(path.join(exeDir, 'logs'));
      } else if (Platform.isAndroid) {
        // Android: 
        final appDir = await getExternalStorageDirectory();
        if (appDir != null) {
          logDir = Directory(path.join(appDir.path, 'logs'));
        }
      } else {
        // 
        final appDir = await getApplicationDocumentsDirectory();
        logDir = Directory(path.join(appDir.path, 'logs'));
      }

      if (logDir == null) return null;

      // 
      if (!await logDir.exists()) {
        await logDir.create(recursive: true);
      }

      // lotus_iptv_YYYYMMDD.log
      final dateStr = DateFormat('yyyyMMdd').format(DateTime.now());
      return path.join(logDir.path, 'lotus_iptv_$dateStr.log');
    } catch (e) {
      debugPrint('LogService:  - $e');
      return null;
    }
  }

  /// 7
  Future<void> _cleanOldLogs(Directory logDir) async {
    try {
      final now = DateTime.now();
      final files = await logDir.list().toList();

      for (final file in files) {
        if (file is File && file.path.endsWith('.log')) {
          final stat = await file.stat();
          final age = now.difference(stat.modified).inDays;
          
          if (age > 7) {
            await file.delete();
            debugPrint('LogService:  - ${path.basename(file.path)}');
          }
        }
      }
    } catch (e) {
      debugPrint('LogService:  - $e');
    }
  }

  /// 
  LogLevel _parseLogLevel(String level) {
    switch (level.toLowerCase()) {
      case 'debug':
        return LogLevel.debug;
      case 'release':
        return LogLevel.release;
      case 'off':
        return LogLevel.off;
      default:
        return LogLevel.release;
    }
  }

  /// 
  Future<void> setLogLevel(LogLevel level) async {
    debugPrint('LogService:  ${level.name}');
    
    // 
    await flush();
    
    _currentLevel = level;
    
    // 
    try {
      final prefs = ServiceLocator.prefs;
      await prefs.setString('log_level', level.name);
      debugPrint('LogService:  SharedPreferences');
    } catch (e) {
      debugPrint('LogService:  - $e');
    }

    // 
    _initialized = false;
    _logger = null;
    _file = null;
    debugPrint('LogService: ...');
    await init();
    debugPrint('LogService: _logger = $_logger, _file = $_file');
  }

  /// 
  LogLevel get currentLevel => _currentLevel;

  /// 
  String? get logFilePath => _logFilePath;

  /// Debug 
  void d(String message, {String? tag, dynamic error, StackTrace? stackTrace}) {
    if (_currentLevel == LogLevel.off) return; //  off 
    if (_currentLevel != LogLevel.debug) return; //  debug  debug 
    
    if (_logger == null) {
      debugPrint('LogService: Logger ');
      return;
    }
    
    final msg = tag != null ? '[$tag] $message' : message;
    _logger?.d(msg, error: error, stackTrace: stackTrace);
    // 
    // if (kDebugMode) debugPrint('DEBUG: $msg');
  }

  /// Info 
  void i(String message, {String? tag, dynamic error, StackTrace? stackTrace}) {
    if (_currentLevel == LogLevel.off) return;
    
    if (_logger == null) {
      debugPrint('LogService: Logger  (Info)');
      return;
    }
    
    final msg = tag != null ? '[$tag] $message' : message;
    _logger?.i(msg, error: error, stackTrace: stackTrace);
    if (kDebugMode) debugPrint('INFO: $msg');
  }

  /// Warning 
  void w(String message, {String? tag, dynamic error, StackTrace? stackTrace}) {
    if (_currentLevel == LogLevel.off) return;
    final msg = tag != null ? '[$tag] $message' : message;
    _logger?.w(msg, error: error, stackTrace: stackTrace);
    if (kDebugMode) debugPrint('WARN: $msg');
  }

  /// Error 
  void e(String message, {String? tag, dynamic error, StackTrace? stackTrace}) {
    if (_currentLevel == LogLevel.off) return;
    final msg = tag != null ? '[$tag] $message' : message;
    _logger?.e(msg, error: error, stackTrace: stackTrace);
    if (kDebugMode) debugPrint('ERROR: $msg');
  }
  
  /// 
  Future<void> flush() async {
    if (_logBuffer.isEmpty) return;
    
    try {
      if (_file != null) {
        await _file!.writeAsString(
          _logBuffer.join('\n') + '\n',
          mode: FileMode.append,
          flush: true,
        );
        _logBuffer.clear();
        _lastFlushTime = DateTime.now();
      }
    } catch (e) {
      debugPrint('LogService:  - $e');
    }
  }
  
  /// 
  void _checkAutoFlush() {
    if (_lastFlushTime == null) {
      _lastFlushTime = DateTime.now();
      return;
    }
    
    final now = DateTime.now();
    if (now.difference(_lastFlushTime!) >= _autoFlushInterval) {
      flush();
    }
  }
  
  File? _file;

  /// 
  Future<Directory?> getLogDirectory() async {
    if (_logFilePath == null) return null;
    return Directory(path.dirname(_logFilePath!));
  }

  /// 
  Future<List<File>> getLogFiles() async {
    final logDir = await getLogDirectory();
    if (logDir == null || !await logDir.exists()) return [];

    final files = await logDir.list().toList();
    return files
        .whereType<File>()
        .where((f) => f.path.endsWith('.log'))
        .toList()
      ..sort((a, b) => b.path.compareTo(a.path)); // 
  }

  /// 
  Future<String?> exportLogs() async {
    try {
      final logFiles = await getLogFiles();
      if (logFiles.isEmpty) return null;

      // 
      final buffer = StringBuffer();
      buffer.writeln('========================================');
      buffer.writeln('VoXTV ');
      buffer.writeln(': ${DateTime.now()}');
      buffer.writeln('========================================\n');

      for (final file in logFiles) {
        buffer.writeln('\n========== ${path.basename(file.path)} ==========\n');
        final content = await file.readAsString();
        buffer.writeln(content);
      }

      // 
      final tempDir = await getTemporaryDirectory();
      final exportFile = File(path.join(
        tempDir.path,
        'lotus_iptv_logs_${DateFormat('yyyyMMdd_HHmmss').format(DateTime.now())}.txt',
      ));
      await exportFile.writeAsString(buffer.toString());

      return exportFile.path;
    } catch (e) {
      debugPrint('LogService:  - $e');
      return null;
    }
  }

  /// 
  Future<void> clearLogs() async {
    try {
      final logDir = await getLogDirectory();
      if (logDir == null || !await logDir.exists()) return;

      final files = await logDir.list().toList();
      for (final file in files) {
        if (file is File && file.path.endsWith('.log')) {
          await file.delete();
        }
      }

      debugPrint('LogService: ');
      
      // 
      _initialized = false;
      await init();
    } catch (e) {
      debugPrint('LogService:  - $e');
    }
  }
}

/// 
class _LogFilter extends LogFilter {
  final LogLevel logLevel;

  _LogFilter(this.logLevel);

  @override
  bool shouldLog(LogEvent event) {
    if (logLevel == LogLevel.off) return false;
    if (logLevel == LogLevel.debug) return true; // Debug 
    // Release  info, warning  error
    return event.level.index >= Level.info.index;
  }
}

/// 
class _LogPrinter extends LogPrinter {
  static final _dateFormat = DateFormat('yyyy-MM-dd HH:mm:ss.SSS');

  @override
  List<String> log(LogEvent event) {
    final time = _dateFormat.format(event.time);
    final level = event.level.name.toUpperCase().padRight(7);
    final message = event.message;
    
    final buffer = StringBuffer();
    buffer.write('$time [$level] $message');

    if (event.error != null) {
      buffer.write('\nError: ${event.error}');
    }

    if (event.stackTrace != null) {
      buffer.write('\nStackTrace:\n${event.stackTrace}');
    }

    return [buffer.toString()];
  }
}

/// 
class _BatchFileOutput extends LogOutput {
  final LogService logService;

  _BatchFileOutput(this.logService);

  @override
  void output(OutputEvent event) {
    if (logService._file == null) return;

    try {
      for (final line in event.lines) {
        logService._logBuffer.add(line);
      }
      
      // 
      logService._checkAutoFlush();
      
      // 
      if (logService._logBuffer.length >= LogService._bufferSize) {
        logService._file!.writeAsStringSync(
          logService._logBuffer.join('\n') + '\n',
          mode: FileMode.append,
          flush: false, // 
        );
        logService._logBuffer.clear();
        logService._lastFlushTime = DateTime.now();
      }
    } catch (e) {
      debugPrint('LogService:  - $e');
    }
  }
}

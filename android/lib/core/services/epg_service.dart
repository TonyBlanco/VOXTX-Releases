import 'dart:convert';
import 'dart:io';
import 'dart:async';
import 'package:http/http.dart' as http;
import 'package:xml/xml.dart';
import 'package:flutter/foundation.dart';
import './service_locator.dart';

/// EPG 
class EpgProgram {
  final String channelId;
  final String title;
  final String? description;
  final DateTime start;
  final DateTime end;
  final String? category;

  EpgProgram({
    required this.channelId,
    required this.title,
    this.description,
    required this.start,
    required this.end,
    this.category,
  });

  bool get isNow {
    final now = DateTime.now();
    return now.isAfter(start) && now.isBefore(end);
  }

  bool get isNext {
    final now = DateTime.now();
    return start.isAfter(now);
  }

  ///  (0.0 - 1.0)
  double get progress {
    final now = DateTime.now();
    if (now.isBefore(start)) return 0.0;
    if (now.isAfter(end)) return 1.0;
    final total = end.difference(start).inSeconds;
    final elapsed = now.difference(start).inSeconds;
    return elapsed / total;
  }

  /// 
  int get remainingMinutes {
    final now = DateTime.now();
    if (now.isAfter(end)) return 0;
    return end.difference(now).inMinutes;
  }
}

/// EPG  -  EPG 
class EpgService {
  static final EpgService _instance = EpgService._internal();
  factory EpgService() => _instance;
  EpgService._internal();

  // channelId -> List<EpgProgram>
  final Map<String, List<EpgProgram>> _programs = {};

  //  ()
  final Map<String, String> _channelNames = {};

  //  (normalizedName -> channelId) 
  final Map<String, String> _nameIndex = {};

  // EPG  (channelKey -> channelId)
  final Map<String, String?> _lookupCache = {};

  DateTime? _lastUpdate;
  bool _isLoading = false;

  bool get isLoading => _isLoading;
  DateTime? get lastUpdate => _lastUpdate;

  /// 
  EpgProgram? getCurrentProgram(String? channelId, String? channelName) {
    final programs = _findPrograms(channelId, channelName);
    if (programs == null) return null;

    final now = DateTime.now();
    for (final program in programs) {
      if (now.isAfter(program.start) && now.isBefore(program.end)) {
        return program;
      }
    }
    return null;
  }

  /// 
  EpgProgram? getNextProgram(String? channelId, String? channelName) {
    final programs = _findPrograms(channelId, channelName);
    if (programs == null) return null;

    final now = DateTime.now();
    for (final program in programs) {
      if (program.start.isAfter(now)) {
        return program;
      }
    }
    return null;
  }

  /// 
  List<EpgProgram> getTodayPrograms(String? channelId, String? channelName) {
    final programs = _findPrograms(channelId, channelName);
    if (programs == null) return [];

    final today = DateTime.now();
    final startOfDay = DateTime(today.year, today.month, today.day);
    final endOfDay = startOfDay.add(const Duration(days: 1));

    return programs
        .where((p) => p.start.isAfter(startOfDay) && p.start.isBefore(endOfDay))
        .toList();
  }

  List<EpgProgram>? _findPrograms(String? channelId, String? channelName) {
    //  key
    final cacheKey = '${channelId ?? ''}_${channelName ?? ''}';

    // 
    if (_lookupCache.containsKey(cacheKey)) {
      final cachedId = _lookupCache[cacheKey];
      if (cachedId != null && _programs.containsKey(cachedId)) {
        return _programs[cachedId];
      }
      return null;
    }

    //  channelId 
    if (channelId != null &&
        channelId.isNotEmpty &&
        _programs.containsKey(channelId)) {
      _lookupCache[cacheKey] = channelId;
      return _programs[channelId];
    }

    // 
    if (channelName != null && channelName.isNotEmpty) {
      final normalizedName = _normalizeName(channelName);

      if (_nameIndex.containsKey(normalizedName)) {
        final foundId = _nameIndex[normalizedName]!;
        _lookupCache[cacheKey] = foundId;
        return _programs[foundId];
      }

      //  channelId 
      if (channelId != null && channelId.isNotEmpty) {
        final normalizedId = _normalizeName(channelId);
        if (_nameIndex.containsKey(normalizedId)) {
          final foundId = _nameIndex[normalizedId]!;
          _lookupCache[cacheKey] = foundId;
          return _programs[foundId];
        }
      }
    }

    // 
    _lookupCache[cacheKey] = null;
    return null;
  }

  /// 
  /// 
  String _normalizeName(String name) {
    String normalized = name.toUpperCase();

    // 1.  + 
    normalized = normalized.replaceAll(RegExp(r'[-\s_]+'), '');

    // 2. CCTV01 -> CCTV1
    normalized = normalized.replaceAllMapped(
      RegExp(r'CCTV0*(\d+)'),
      (match) => 'CCTV${match.group(1)}',
    );

    // 3. 
    normalized = normalized.replaceAll(RegExp(r'(HD|4K|8K|FHD|UHD|SD)'), '');

    // 4. 
    normalized = normalized.replaceAll(
      RegExp(r'(||||||)$'),
      '',
    );

    // 5.  CCTV  CCTV1 -> CCTV1
    normalized = normalized.replaceAllMapped(
      RegExp(r'(CCTV\d+\+?)[\u4e00-\u9fa5]+'),
      (match) => match.group(1)!,
    );

    // 6. ""
    if (!normalized.endsWith('') && name.toUpperCase().contains('')) {
      // 
      final wsMatch = RegExp(r'(.+?)')
          .firstMatch(name.toUpperCase().replaceAll(RegExp(r'[-\s_]+'), ''));
      if (wsMatch != null) {
        normalized = '${wsMatch.group(1)!}';
      }
    }

    // 7. 
    normalized = normalized.replaceAll(
      RegExp(r'()(|)$'),
      r'$1',
    );

    return normalized;
  }

  ///  URL  EPG 
  Future<bool> loadFromUrl(String url) async {
    if (_isLoading) return false;
    _isLoading = true;

    try {
      ServiceLocator.log.d('EPG: Loading from $url');

      final response = await http.get(Uri.parse(url)).timeout(
            const Duration(seconds: 30),
          );

      if (response.statusCode != 200) {
        ServiceLocator.log.d('EPG: HTTP error ${response.statusCode}');
        return false;
      }

      //  isolate  XML UI
      final computeData = {
        'bytes': response.bodyBytes,
        'isGzip': url.endsWith('.gz'),
      };

      final result = await compute(_parseXmlTvInBackground, computeData);

      if (result != null) {
        // compute() already ran in a background isolate and returned on the
        // main thread, so we can assign the data synchronously here — no need
        // for scheduleMicrotask (which would create a race where data isn't
        // available yet when notifyListeners() fires in EpgProvider).
        _programs.clear();
        _channelNames.clear();
        _nameIndex.clear();
        _lookupCache.clear();

        _programs.addAll(result['programs'] as Map<String, List<EpgProgram>>);
        _channelNames.addAll(result['channelNames'] as Map<String, String>);
        _nameIndex.addAll(result['nameIndex'] as Map<String, String>);

        _lastUpdate = DateTime.now();
        ServiceLocator.log.d(
            'EPG: Loaded ${_programs.length} channels, ${_programs.values.fold(0, (sum, list) => sum + list.length)} programs');
        return true;
      }
      return false;
    } catch (e) {
      ServiceLocator.log.d('EPG: Error loading: $e');
      return false;
    } finally {
      _isLoading = false;
    }
  }

  ///  isolate  XML
  static Map<String, dynamic>? _parseXmlTvInBackground(
      Map<String, dynamic> data) {
    try {
      final bytes = data['bytes'] as List<int>;
      final isGzip = data['isGzip'] as bool;

      String content;
      if (isGzip) {
        final decompressed = GZipCodec().decode(bytes);
        content = _decodeContentStatic(decompressed);
      } else {
        content = _decodeContentStatic(bytes);
      }

      final document = XmlDocument.parse(content);
      final tv = document.findElements('tv').firstOrNull;
      if (tv == null) return null;

      final programs = <String, List<EpgProgram>>{};
      final channelNames = <String, String>{};
      final nameIndex = <String, String>{};

      // 
      for (final channel in tv.findElements('channel')) {
        final id = channel.getAttribute('id');
        if (id == null) continue;

        // 
        // 1. <channel id="11"><display-name>CCTV1</display-name></channel>
        // 2. <channel id="11" display-name="CCTV1"></channel>
        var displayName =
            channel.findElements('display-name').firstOrNull?.innerText;
        displayName ??= channel.getAttribute('display-name');

        if (displayName != null) {
          channelNames[id] = displayName;
          nameIndex[_normalizeNameStatic(displayName)] = id;
          nameIndex[_normalizeNameStatic(id)] = id;
        }
      }

      //  ( programme  program )
      final programmes = tv.findElements('programme').toList();
      programmes.addAll(tv.findElements('program'));

      for (final programme in programmes) {
        final channelId = programme.getAttribute('channel');
        final startStr = programme.getAttribute('start');
        final stopStr = programme.getAttribute('stop');

        if (channelId == null || startStr == null || stopStr == null) continue;

        final start = _parseDateTimeStatic(startStr);
        final end = _parseDateTimeStatic(stopStr);
        if (start == null || end == null) continue;

        final title =
            programme.findElements('title').firstOrNull?.innerText ?? '';
        final desc = programme.findElements('desc').firstOrNull?.innerText;
        final category =
            programme.findElements('category').firstOrNull?.innerText;

        final program = EpgProgram(
          channelId: channelId,
          title: title,
          description: desc,
          start: start,
          end: end,
          category: category,
        );

        programs.putIfAbsent(channelId, () => []).add(program);
      }

      // 
      for (final programList in programs.values) {
        programList.sort((a, b) => a.start.compareTo(b.start));
      }

      return {
        'programs': programs,
        'channelNames': channelNames,
        'nameIndex': nameIndex,
      };
    } catch (e) {
      return null;
    }
  }

  ///  isolate
  /// 
  static String _normalizeNameStatic(String name) {
    String normalized = name.toUpperCase();

    // 1.  + 
    normalized = normalized.replaceAll(RegExp(r'[-\s_]+'), '');

    // 2. CCTV01 -> CCTV1
    normalized = normalized.replaceAllMapped(
      RegExp(r'CCTV0*(\d+)'),
      (match) => 'CCTV${match.group(1)}',
    );

    // 3. 
    normalized = normalized.replaceAll(RegExp(r'(HD|4K|8K|FHD|UHD|SD)'), '');

    // 4. 
    normalized = normalized.replaceAll(
      RegExp(r'(||||||)$'),
      '',
    );

    // 5.  CCTV  CCTV1 -> CCTV1
    normalized = normalized.replaceAllMapped(
      RegExp(r'(CCTV\d+\+?)[\u4e00-\u9fa5]+'),
      (match) => match.group(1)!,
    );

    // 6. ""
    if (!normalized.endsWith('') && name.toUpperCase().contains('')) {
      // 
      final wsMatch = RegExp(r'(.+?)')
          .firstMatch(name.toUpperCase().replaceAll(RegExp(r'[-\s_]+'), ''));
      if (wsMatch != null) {
        normalized = '${wsMatch.group(1)!}';
      }
    }

    // 7. 
    normalized = normalized.replaceAll(
      RegExp(r'()(|)$'),
      r'$1',
    );

    return normalized;
  }

  static DateTime? _parseDateTimeStatic(String str) {
    try {
      final match = RegExp(r'(\d{14})').firstMatch(str);
      if (match == null) return null;

      final dateStr = match.group(1)!;
      return DateTime(
        int.parse(dateStr.substring(0, 4)),
        int.parse(dateStr.substring(4, 6)),
        int.parse(dateStr.substring(6, 8)),
        int.parse(dateStr.substring(8, 10)),
        int.parse(dateStr.substring(10, 12)),
        int.parse(dateStr.substring(12, 14)),
      );
    } catch (e) {
      return null;
    }
  }

  ///  UTF-8  GBK (Static version for isolate)
  static String _decodeContentStatic(List<int> bytes) {
    //  UTF-8
    try {
      final content = utf8.decode(bytes);
      //  UTF-8  GBK 
      if (!content.contains('') && !_hasGarbledChineseStatic(content)) {
        return content;
      }
    } catch (_) {}

    //  Latin1 (ISO-8859-1)  GBK 
    //  Dart  GBK  Latin1 
    try {
      final latin1Content = latin1.decode(bytes);
      //  XML 
      if (latin1Content.contains('encoding="gb2312"') ||
          latin1Content.contains('encoding="gbk"') ||
          latin1Content.contains('encoding="GB2312"') ||
          latin1Content.contains('encoding="GBK"')) {
        //  GBK  Dart  UTF-8 with allowMalformed
        return utf8.decode(bytes, allowMalformed: true);
      }
    } catch (_) {}

    //  UTF-8 with allowMalformed
    return utf8.decode(bytes, allowMalformed: true);
  }

  static bool _hasGarbledChineseStatic(String content) {
    // 
    final garbledPatterns = [
      'å',
      'ä',
      'ã',
      'æ',
      'ç',
      'è',
      'é',
      'ê',
      'ë',
      'ì',
      'í',
      'î',
      'ï'
    ];
    int count = 0;
    for (final pattern in garbledPatterns) {
      if (content.contains(pattern)) count++;
    }
    // 
    return count > 3;
  }

  void clear() {
    _programs.clear();
    _channelNames.clear();
    _nameIndex.clear();
    _lookupCache.clear();
    _lastUpdate = null;
  }
}

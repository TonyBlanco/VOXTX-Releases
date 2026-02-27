import 'package:dio/dio.dart';

import 'service_locator.dart';

class OmdbMovieInfo {
  final String title;
  final String year;
  final String imdbId;
  final String imdbRating;
  final String plot;
  final String genre;
  final String runtime;
  final String? poster;

  const OmdbMovieInfo({
    required this.title,
    required this.year,
    required this.imdbId,
    required this.imdbRating,
    required this.plot,
    required this.genre,
    required this.runtime,
    this.poster,
  });

  factory OmdbMovieInfo.fromMap(Map<String, dynamic> map) {
    return OmdbMovieInfo(
      title: (map['Title'] ?? '').toString(),
      year: (map['Year'] ?? '').toString(),
      imdbId: (map['imdbID'] ?? '').toString(),
      imdbRating: (map['imdbRating'] ?? '').toString(),
      plot: (map['Plot'] ?? '').toString(),
      genre: (map['Genre'] ?? '').toString(),
      runtime: (map['Runtime'] ?? '').toString(),
      poster: map['Poster']?.toString(),
    );
  }
}

class OmdbService {
  OmdbService({required this.apiKey});

  final String apiKey;
  final Map<String, OmdbMovieInfo> _cache = {};
  final Map<String, DateTime> _missCache = {};

  static const Duration _missTtl = Duration(minutes: 30);

  Future<OmdbMovieInfo?> getMovieInfo({String? rawTitle, String? rawImdbId}) async {
    final imdbId = _normalizeImdbId(rawImdbId);
    final normalizedTitle = rawTitle == null ? '' : _normalizeTitle(rawTitle);

    if (imdbId == null && normalizedTitle.isEmpty) return null;

    if (imdbId != null) {
      final byId = await _getByQuery(cacheKey: 'id:$imdbId', queryParam: 'i=$imdbId');
      if (byId != null) return byId;
    }

    if (normalizedTitle.isNotEmpty) {
      return _getByQuery(
        cacheKey: 'title:$normalizedTitle',
        queryParam: 't=${Uri.encodeComponent(normalizedTitle)}',
      );
    }

    return null;
  }

  Future<OmdbMovieInfo?> getMovieInfoByTitle(String rawTitle) async {
    return getMovieInfo(rawTitle: rawTitle);
  }

  Future<OmdbMovieInfo?> _getByQuery({required String cacheKey, required String queryParam}) async {
    final now = DateTime.now();

    final cached = _cache[cacheKey];
    if (cached != null) {
      return cached;
    }

    final missAt = _missCache[cacheKey];
    if (missAt != null && now.difference(missAt) < _missTtl) {
      return null;
    }

    try {
      final dio = ServiceLocator.createDio();
      dio.options.connectTimeout = const Duration(seconds: 10);
      dio.options.receiveTimeout = const Duration(seconds: 20);
      dio.options.validateStatus = (status) => status != null && status < 500;

      final url = 'https://www.omdbapi.com/?$queryParam&plot=short&apikey=$apiKey';
      final response = await dio.get(url);

      if (response.statusCode != 200 || response.data is! Map) {
        _missCache[cacheKey] = now;
        return null;
      }

      final data = Map<String, dynamic>.from(response.data as Map);
      if ((data['Response']?.toString().toLowerCase() ?? 'false') != 'true') {
        _missCache[cacheKey] = now;
        return null;
      }

      final info = OmdbMovieInfo.fromMap(data);
      _cache[cacheKey] = info;
      if (info.imdbId.isNotEmpty) {
        _cache['id:${info.imdbId}'] = info;
      }
      return info;
    } on DioException {
      return null;
    } catch (_) {
      return null;
    }
  }

  String? _normalizeImdbId(String? raw) {
    if (raw == null) return null;
    final value = raw.trim();
    if (value.isEmpty) return null;
    final match = RegExp(r'(tt\d{5,10})', caseSensitive: false).firstMatch(value);
    return match?.group(1)?.toLowerCase();
  }

  String _normalizeTitle(String input) {
    var title = input.trim();

    title = title.replaceAll(RegExp(r'\[[^\]]*\]'), ' ');
    title = title.replaceAll(RegExp(r'\([^\)]*\)'), ' ');
    title = title.replaceAll(RegExp(r'\bS\d{1,2}E\d{1,2}\b', caseSensitive: false), ' ');
    title = title.replaceAll(RegExp(r'\b(19|20)\d{2}\b'), ' ');
    title = title.replaceAll(RegExp(r'\b(4k|uhd|fhd|hd|sd|espa[nñ]ol|latino|castellano)\b', caseSensitive: false), ' ');
    title = title.replaceAll(RegExp(r'\s+'), ' ').trim();

    return title;
  }
}

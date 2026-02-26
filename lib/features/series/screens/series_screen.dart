import 'dart:async';

import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:cached_network_image/cached_network_image.dart';
import 'package:dio/dio.dart';

import '../../../core/theme/app_theme.dart';
import '../../../core/navigation/app_router.dart';
import '../../../core/widgets/tv_sidebar.dart';
import '../../../core/widgets/tv_focusable.dart';
import '../../../core/platform/platform_detector.dart';
import '../../../core/i18n/app_strings.dart';
import '../../../core/models/channel.dart';
import '../../../core/models/channel_group.dart';
import '../../../core/services/service_locator.dart';
import '../../../core/services/omdb_service.dart';

import '../../channels/providers/channel_provider.dart';
import '../../playlist/providers/playlist_provider.dart';
import '../../favorites/providers/favorites_provider.dart';

/// Series screen: shows series/TV show channels grouped by category.
/// Layout: left sidebar (categories) + right vertical list of episodes/shows.
class SeriesScreen extends StatefulWidget {
  const SeriesScreen({super.key});

  @override
  State<SeriesScreen> createState() => _SeriesScreenState();
}

class _SeriesScreenState extends State<SeriesScreen> {
  String? _selectedGroup;
  final ScrollController _scrollController = ScrollController();
  final ScrollController _groupScrollController = ScrollController();
  final List<FocusNode> _groupFocusNodes = [];
  final List<FocusNode> _itemFocusNodes = [];
  int _currentGroupIndex = 0;
  Timer? _groupSelectTimer;
  final Map<String, Future<OmdbMovieInfo?>> _omdbFutures = {};

  @override
  void initState() {
    super.initState();
    WidgetsBinding.instance.addPostFrameCallback((_) {
      _ensureSeriesLoaded();
    });
  }

  Future<void> _ensureSeriesLoaded() async {
    if (!mounted) return;
    final channelProvider = context.read<ChannelProvider>();
    final playlistProvider = context.read<PlaylistProvider>();
    final activeId = playlistProvider.activePlaylist?.id;

    if (activeId == null || channelProvider.isLoading) return;

    if (channelProvider.seriesChannels.isEmpty) {
      ServiceLocator.log.i(
          'SeriesScreen: Series vacío, recargando canales del playlist activo $activeId',
          tag: 'SeriesScreen');
      await channelProvider.loadAllChannelsToCache(activeId);
    }
  }

  List<Channel> _seriesForGroup(ChannelProvider provider, String? group) {
    if (group == null) return provider.seriesChannels;
    return provider.seriesChannels.where((c) => c.groupName == group).toList();
  }

  @override
  void dispose() {
    _groupSelectTimer?.cancel();
    _scrollController.dispose();
    _groupScrollController.dispose();
    for (final n in _groupFocusNodes) n.dispose();
    for (final n in _itemFocusNodes) n.dispose();
    super.dispose();
  }

  void _playChannel(Channel channel) {
    if (channel.channelType == 'series') {
      _openSeriesEpisodes(channel);
      return;
    }

    Navigator.pushNamed(
      context,
      AppRouter.player,
      arguments: {
        'channelUrl': channel.url,
        'channelName': channel.name,
        'channelLogo': channel.logoUrl,
        'isMultiScreen': false,
      },
    );
  }

  String _tr(String es, String en) {
    final lang = Localizations.localeOf(context).languageCode;
    return lang == 'es' ? es : en;
  }

  Future<OmdbMovieInfo?> _getOmdbInfo(Channel series) {
    final key = '${series.epgId ?? ''}|${series.name.trim().toLowerCase()}';
    return _omdbFutures.putIfAbsent(
      key,
      () => ServiceLocator.omdb.getMovieInfo(
        rawTitle: series.name,
        rawImdbId: series.epgId,
      ),
    );
  }

  Future<void> _openSeriesEpisodes(Channel seriesChannel) async {
    final episodesFuture = _fetchSeriesEpisodes(seriesChannel);
    final detailsFuture = _getOmdbInfo(seriesChannel);
    final favoritesProvider = context.read<FavoritesProvider>();
    bool watchLater = ServiceLocator.watchLater.contains(seriesChannel.id);

    await showModalBottomSheet(
      context: context,
      isScrollControlled: true,
      backgroundColor: AppTheme.getSurfaceColor(context),
      shape: const RoundedRectangleBorder(
        borderRadius: BorderRadius.vertical(top: Radius.circular(16)),
      ),
      builder: (ctx) {
        return StatefulBuilder(
          builder: (context, setSheetState) {
            final isFavorite =
                favoritesProvider.isFavorite(seriesChannel.id ?? 0);

            return SafeArea(
              child: SizedBox(
                height: MediaQuery.of(ctx).size.height * 0.8,
                child: FutureBuilder<List<_SeriesEpisode>>(
                  future: episodesFuture,
                  builder: (context, snapshot) {
                    if (snapshot.connectionState == ConnectionState.waiting) {
                      return Center(
                        child: Column(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: [
                            const CircularProgressIndicator(),
                            const SizedBox(height: 12),
                            Text(
                              _tr('Descargando capítulos…',
                                  'Downloading episodes…'),
                              style: TextStyle(
                                  color: AppTheme.getTextPrimary(context)),
                            ),
                          ],
                        ),
                      );
                    }

                    if (snapshot.hasError) {
                      return Padding(
                        padding: const EdgeInsets.all(16),
                        child: Column(
                          crossAxisAlignment: CrossAxisAlignment.start,
                          children: [
                            Text(
                              _tr('No se pudieron cargar los capítulos',
                                  'Could not load episodes'),
                              style: TextStyle(
                                color: AppTheme.getTextPrimary(context),
                                fontSize: 18,
                                fontWeight: FontWeight.bold,
                              ),
                            ),
                            const SizedBox(height: 10),
                            Text(
                              _tr(
                                'Esta serie no trae lista de capítulos en el proveedor o faltan datos de series_id. Sin capítulos no se puede iniciar reproducción.',
                                'This series does not provide episode list in the provider, or series_id is missing. Without episodes, playback cannot start.',
                              ),
                              style: TextStyle(
                                  color: AppTheme.getTextSecondary(context),
                                  fontSize: 13),
                            ),
                            const SizedBox(height: 10),
                            Text(
                              '${snapshot.error}',
                              style: TextStyle(
                                  color: AppTheme.getTextMuted(context),
                                  fontSize: 12),
                            ),
                            const Spacer(),
                            Align(
                              alignment: Alignment.centerRight,
                              child: ElevatedButton(
                                onPressed: () => Navigator.pop(context),
                                child: Text(_tr('Cerrar', 'Close')),
                              ),
                            ),
                          ],
                        ),
                      );
                    }

                    final episodes = snapshot.data ?? const <_SeriesEpisode>[];
                    if (episodes.isEmpty) {
                      return Center(
                        child: Text(
                          _tr('No hay capítulos disponibles para esta serie',
                              'No episodes available for this series'),
                          style: TextStyle(
                              color: AppTheme.getTextSecondary(context)),
                        ),
                      );
                    }

                    final grouped = <int, List<_SeriesEpisode>>{};
                    for (final ep in episodes) {
                      grouped.putIfAbsent(ep.season, () => []).add(ep);
                    }
                    final seasons = grouped.keys.toList()..sort();

                    return Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Padding(
                          padding: const EdgeInsets.fromLTRB(16, 14, 16, 8),
                          child: Column(
                            crossAxisAlignment: CrossAxisAlignment.start,
                            children: [
                              Row(
                                children: [
                                  Expanded(
                                    child: Text(
                                      seriesChannel.name,
                                      style: TextStyle(
                                        color: AppTheme.getTextPrimary(context),
                                        fontSize: 18,
                                        fontWeight: FontWeight.bold,
                                      ),
                                      maxLines: 1,
                                      overflow: TextOverflow.ellipsis,
                                    ),
                                  ),
                                  IconButton(
                                    onPressed: () => Navigator.pop(context),
                                    icon: Icon(Icons.close,
                                        color:
                                            AppTheme.getTextPrimary(context)),
                                  ),
                                ],
                              ),
                              const SizedBox(height: 6),
                              FutureBuilder<OmdbMovieInfo?>(
                                future: detailsFuture,
                                builder: (context, detailsSnapshot) {
                                  final info = detailsSnapshot.data;
                                  final hasRating =
                                      (info?.imdbRating.isNotEmpty ?? false) &&
                                          info!.imdbRating != 'N/A';
                                  final hasYear =
                                      (info?.year.isNotEmpty ?? false) &&
                                          info!.year != 'N/A';
                                  final hasPlot =
                                      (info?.plot.isNotEmpty ?? false) &&
                                          info!.plot != 'N/A';

                                  if (!hasRating && !hasYear && !hasPlot) {
                                    return const SizedBox.shrink();
                                  }

                                  final meta = [
                                    if (hasYear)
                                      '${_tr('Año', 'Year')}: ${info.year}',
                                    if (hasRating) 'IMDb ${info.imdbRating}',
                                  ].join(' · ');

                                  return Padding(
                                    padding: const EdgeInsets.only(bottom: 8),
                                    child: Column(
                                      crossAxisAlignment:
                                          CrossAxisAlignment.start,
                                      children: [
                                        if (meta.isNotEmpty)
                                          Text(
                                            meta,
                                            style: TextStyle(
                                              color: AppTheme.getTextSecondary(
                                                  context),
                                              fontSize: 12,
                                            ),
                                          ),
                                        if (hasPlot)
                                          Text(
                                            info.plot,
                                            maxLines: 2,
                                            overflow: TextOverflow.ellipsis,
                                            style: TextStyle(
                                              color: AppTheme.getTextMuted(
                                                  context),
                                              fontSize: 11,
                                            ),
                                          ),
                                      ],
                                    ),
                                  );
                                },
                              ),
                              Row(
                                children: [
                                  TVFocusable(
                                    onSelect: () async {
                                      await favoritesProvider
                                          .toggleFavorite(seriesChannel);
                                      if (context.mounted) setSheetState(() {});
                                    },
                                    child: Container(
                                      padding: const EdgeInsets.symmetric(
                                          horizontal: 10, vertical: 6),
                                      decoration: BoxDecoration(
                                        color: isFavorite
                                            ? AppTheme.getPrimaryColor(context)
                                                .withOpacity(0.2)
                                            : AppTheme.getCardColor(context),
                                        borderRadius: BorderRadius.circular(20),
                                      ),
                                      child: Row(
                                        mainAxisSize: MainAxisSize.min,
                                        children: [
                                          Icon(
                                            isFavorite
                                                ? Icons.favorite
                                                : Icons.favorite_border_rounded,
                                            size: 16,
                                            color: isFavorite
                                                ? AppTheme.getPrimaryColor(
                                                    context)
                                                : AppTheme.getTextSecondary(
                                                    context),
                                          ),
                                          const SizedBox(width: 6),
                                          Text(
                                            _tr('Favorito', 'Favorite'),
                                            style: TextStyle(
                                                color: AppTheme.getTextPrimary(
                                                    context),
                                                fontSize: 12),
                                          ),
                                        ],
                                      ),
                                    ),
                                  ),
                                  const SizedBox(width: 8),
                                  TVFocusable(
                                    onSelect: () async {
                                      watchLater = await ServiceLocator
                                          .watchLater
                                          .toggle(seriesChannel.id);
                                      if (context.mounted) setSheetState(() {});
                                    },
                                    child: Container(
                                      padding: const EdgeInsets.symmetric(
                                          horizontal: 10, vertical: 6),
                                      decoration: BoxDecoration(
                                        color: watchLater
                                            ? AppTheme.getPrimaryColor(context)
                                                .withOpacity(0.2)
                                            : AppTheme.getCardColor(context),
                                        borderRadius: BorderRadius.circular(20),
                                      ),
                                      child: Row(
                                        mainAxisSize: MainAxisSize.min,
                                        children: [
                                          Icon(
                                            watchLater
                                                ? Icons.bookmark_rounded
                                                : Icons.bookmark_border_rounded,
                                            size: 16,
                                            color: watchLater
                                                ? AppTheme.getPrimaryColor(
                                                    context)
                                                : AppTheme.getTextSecondary(
                                                    context),
                                          ),
                                          const SizedBox(width: 6),
                                          Text(
                                            _tr('Ver luego', 'Watch later'),
                                            style: TextStyle(
                                                color: AppTheme.getTextPrimary(
                                                    context),
                                                fontSize: 12),
                                          ),
                                        ],
                                      ),
                                    ),
                                  ),
                                ],
                              ),
                            ],
                          ),
                        ),
                        Expanded(
                          child: ListView.builder(
                            itemCount: seasons.length,
                            itemBuilder: (context, index) {
                              final season = seasons[index];
                              final items = grouped[season]!
                                ..sort((a, b) =>
                                    a.episodeNumber.compareTo(b.episodeNumber));

                              return ExpansionTile(
                                initiallyExpanded: index == 0,
                                title: Text(
                                  _tr('Temporada $season', 'Season $season'),
                                  style: TextStyle(
                                    color: AppTheme.getTextPrimary(context),
                                    fontWeight: FontWeight.w600,
                                  ),
                                ),
                                children: items.map((ep) {
                                  return ListTile(
                                    title: Text(
                                      ep.title,
                                      maxLines: 1,
                                      overflow: TextOverflow.ellipsis,
                                      style: TextStyle(
                                          color:
                                              AppTheme.getTextPrimary(context)),
                                    ),
                                    subtitle: Text(
                                      _tr('Capítulo ${ep.episodeNumber}',
                                          'Episode ${ep.episodeNumber}'),
                                      style: TextStyle(
                                          color:
                                              AppTheme.getTextMuted(context)),
                                    ),
                                    trailing: Icon(
                                      Icons.play_arrow_rounded,
                                      color: AppTheme.getPrimaryColor(context),
                                    ),
                                    onTap: () {
                                      Navigator.pop(context);
                                      Navigator.pushNamed(
                                        this.context,
                                        AppRouter.player,
                                        arguments: {
                                          'channelUrl': ep.url,
                                          'channelName':
                                              '${seriesChannel.name} · ${_tr('T', 'S')}${ep.season}${_tr('C', 'E')}${ep.episodeNumber}',
                                          'channelLogo': seriesChannel.logoUrl,
                                          'isMultiScreen': false,
                                        },
                                      );
                                    },
                                  );
                                }).toList(),
                              );
                            },
                          ),
                        ),
                      ],
                    );
                  },
                ),
              ),
            );
          },
        );
      },
    );
  }

  Future<List<_SeriesEpisode>> _fetchSeriesEpisodes(
      Channel seriesChannel) async {
    final creds = _parseSeriesCredentials(seriesChannel.url);
    if (creds == null) {
      throw Exception(_tr('URL de serie inválida o incompleta',
          'Invalid or incomplete series URL'));
    }

    final base = creds['base']!;
    final user = creds['username']!;
    final pass = creds['password']!;
    final seriesId = creds['seriesId']!;

    final infoUrl =
        '$base/player_api.php?username=${Uri.encodeComponent(user)}&password=${Uri.encodeComponent(pass)}&action=get_series_info&series_id=${Uri.encodeComponent(seriesId)}';

    Response<dynamic>? resp;
    final retryDelays = <Duration>[
      const Duration(seconds: 0),
      const Duration(seconds: 2),
      const Duration(seconds: 4),
    ];
    final receiveTimeouts = <Duration>[
      const Duration(seconds: 20),
      const Duration(seconds: 40),
      const Duration(seconds: 70),
    ];

    for (int attempt = 0; attempt < retryDelays.length; attempt++) {
      if (retryDelays[attempt] > Duration.zero) {
        await Future.delayed(retryDelays[attempt]);
      }

      final dio = ServiceLocator.createDio();
      dio.options.connectTimeout = const Duration(seconds: 15);
      dio.options.receiveTimeout = receiveTimeouts[attempt];
      dio.options.validateStatus = (status) => status != null && status < 500;

      try {
        resp = await dio.get(infoUrl);
        if (resp.statusCode == 200 && resp.data is Map) {
          break;
        }
      } on DioException catch (e) {
        final isTimeout = e.type == DioExceptionType.connectionTimeout ||
            e.type == DioExceptionType.receiveTimeout ||
            e.type == DioExceptionType.sendTimeout;

        if (!isTimeout || attempt == retryDelays.length - 1) {
          rethrow;
        }

        ServiceLocator.log.w(
          'Series episodes timeout (attempt ${attempt + 1}/${retryDelays.length}), reintentando...',
          tag: 'SeriesScreen',
        );
      }
    }

    if (resp == null) {
      throw Exception(_tr('No se recibió respuesta de capítulos',
          'No episodes response received'));
    }

    if (resp.statusCode != 200 || resp.data is! Map) {
      throw Exception(_tr('Error al consultar capítulos en Xtream',
          'Failed to query episodes from Xtream'));
    }

    final data = resp.data as Map;
    final episodesRaw = data['episodes'];
    if (episodesRaw is! Map || episodesRaw.isEmpty) {
      throw Exception(_tr('El proveedor no devolvió capítulos para esta serie',
          'Provider returned no episodes for this series'));
    }

    final result = <_SeriesEpisode>[];

    for (final entry in episodesRaw.entries) {
      final season = int.tryParse(entry.key.toString()) ?? 0;
      final list = entry.value;
      if (list is! List) continue;

      for (final raw in list) {
        if (raw is! Map) continue;

        final episodeId =
            (raw['id'] ?? raw['episode_id'] ?? raw['stream_id'])?.toString();
        if (episodeId == null || episodeId.isEmpty) continue;

        final extension = (raw['container_extension']?.toString() ?? 'mp4')
            .replaceAll('.', '');
        final directSource = raw['direct_source']?.toString();
        final title = (raw['title'] ?? raw['name'] ?? 'Episode').toString();
        final episodeNumber = int.tryParse(
                (raw['episode_num'] ?? raw['episode'] ?? '0').toString()) ??
            0;

        final playUrl = (directSource != null && directSource.isNotEmpty)
            ? directSource
            : '$base/series/$user/$pass/$episodeId.$extension';

        result.add(_SeriesEpisode(
          season: season,
          episodeNumber: episodeNumber,
          title: title,
          url: playUrl,
        ));
      }
    }

    result.sort((a, b) {
      final seasonComp = a.season.compareTo(b.season);
      if (seasonComp != 0) return seasonComp;
      return a.episodeNumber.compareTo(b.episodeNumber);
    });

    return result;
  }

  Map<String, String>? _parseSeriesCredentials(String rawUrl) {
    try {
      final uri = Uri.parse(rawUrl);
      String base = '${uri.scheme}://${uri.host}';
      if (uri.hasPort) base = '$base:${uri.port}';

      // Pattern 1: /series/{user}/{pass}/{seriesId}
      final segments = uri.pathSegments;
      final seriesIndex = segments.indexOf('series');
      if (seriesIndex != -1 && segments.length >= seriesIndex + 4) {
        final username = segments[seriesIndex + 1];
        final password = segments[seriesIndex + 2];
        final idSegment = segments[seriesIndex + 3];
        final seriesId = idSegment.split('.').first;

        if (username.isNotEmpty && password.isNotEmpty && seriesId.isNotEmpty) {
          return {
            'base': base,
            'username': username,
            'password': password,
            'seriesId': seriesId,
          };
        }
      }

      // Pattern 2: player_api.php?...&series_id=...
      final username = uri.queryParameters['username'];
      final password = uri.queryParameters['password'];
      final seriesId = uri.queryParameters['series_id'];
      if (username != null && password != null && seriesId != null) {
        return {
          'base': base,
          'username': username,
          'password': password,
          'seriesId': seriesId,
        };
      }
    } catch (_) {}

    return null;
  }

  @override
  Widget build(BuildContext context) {
    final isTV = PlatformDetector.isTV;
    final content = isTV ? _buildTVLayout() : _buildMobileLayout();

    return Scaffold(
      body: SafeArea(
        top: !isTV,
        bottom: false,
        child: Container(
          decoration: BoxDecoration(
            gradient: LinearGradient(
              begin: Alignment.topLeft,
              end: Alignment.bottomRight,
              colors: [
                AppTheme.getBackgroundColor(context),
                AppTheme.getBackgroundColor(context).withOpacity(0.8),
                AppTheme.getPrimaryColor(context).withOpacity(0.05),
              ],
            ),
          ),
          child: content,
        ),
      ),
    );
  }

  Widget _buildTVLayout() {
    return TVSidebar(
      selectedIndex: 4, // Series is index 4
      child: Consumer<ChannelProvider>(
        builder: (context, provider, _) {
          final groups = provider.seriesGroups;
          final series = _seriesForGroup(provider, _selectedGroup);
          return Row(
            children: [
              _buildGroupsSidebar(groups, provider),
              Expanded(child: _buildSeriesList(series)),
            ],
          );
        },
      ),
    );
  }

  Widget _buildMobileLayout() {
    return Consumer<ChannelProvider>(
      builder: (context, provider, _) {
        final groups = provider.seriesGroups;
        final series = _seriesForGroup(provider, _selectedGroup);
        return Column(
          children: [
            Container(
              padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 10),
              decoration: const BoxDecoration(gradient: AppTheme.lotusGradient),
              child: Row(
                children: [
                  GestureDetector(
                    onTap: () => Navigator.pop(context),
                    child: const Icon(Icons.arrow_back,
                        color: Colors.white, size: 20),
                  ),
                  const SizedBox(width: 12),
                  Text(
                    AppStrings.of(context)?.series ?? 'Series',
                    style: const TextStyle(
                        color: Colors.white,
                        fontSize: 18,
                        fontWeight: FontWeight.bold),
                  ),
                  const SizedBox(width: 12),
                  GestureDetector(
                    onTap: () => _showMobileGroupsBottomSheet(context, groups),
                    child: Container(
                      padding: const EdgeInsets.symmetric(
                          horizontal: 10, vertical: 4),
                      decoration: BoxDecoration(
                        color: Colors.white.withOpacity(0.2),
                        borderRadius: BorderRadius.circular(12),
                      ),
                      child: Row(
                        mainAxisSize: MainAxisSize.min,
                        children: [
                          Text(
                            _selectedGroup ??
                                (AppStrings.of(context)?.allChannels ?? 'All'),
                            style: const TextStyle(
                                color: Colors.white, fontSize: 12),
                          ),
                          const SizedBox(width: 4),
                          const Icon(Icons.expand_more,
                              color: Colors.white, size: 16),
                        ],
                      ),
                    ),
                  ),
                ],
              ),
            ),
            Expanded(child: _buildSeriesList(series)),
          ],
        );
      },
    );
  }

  void _showMobileGroupsBottomSheet(
      BuildContext context, List<ChannelGroup> groups) {
    showModalBottomSheet(
      context: context,
      backgroundColor: AppTheme.getSurfaceColor(context),
      shape: const RoundedRectangleBorder(
          borderRadius: BorderRadius.vertical(top: Radius.circular(16))),
      builder: (ctx) => SafeArea(
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            Container(
              padding: const EdgeInsets.all(12),
              child: Text(
                AppStrings.of(context)?.categories ?? 'Categories',
                style: TextStyle(
                    color: AppTheme.getTextPrimary(context),
                    fontSize: 16,
                    fontWeight: FontWeight.bold),
              ),
            ),
            const Divider(height: 1),
            Flexible(
              child: ListView(
                shrinkWrap: true,
                children: [
                  ListTile(
                    title: Text(
                        AppStrings.of(context)?.allChannels ?? 'All Series'),
                    leading: Icon(Icons.video_library_rounded,
                        color: _selectedGroup == null
                            ? AppTheme.getPrimaryColor(context)
                            : AppTheme.getTextSecondary(context)),
                    selected: _selectedGroup == null,
                    onTap: () {
                      setState(() => _selectedGroup = null);
                      Navigator.pop(ctx);
                    },
                  ),
                  ...groups.map((g) => ListTile(
                        title: Text(g.name),
                        leading: Icon(Icons.folder_rounded,
                            color: _selectedGroup == g.name
                                ? AppTheme.getPrimaryColor(context)
                                : AppTheme.getTextSecondary(context)),
                        selected: _selectedGroup == g.name,
                        onTap: () {
                          setState(() => _selectedGroup = g.name);
                          Navigator.pop(ctx);
                        },
                      )),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }

  Widget _buildGroupsSidebar(
      List<ChannelGroup> groups, ChannelProvider provider) {
    final totalGroups = groups.length + 1;
    while (_groupFocusNodes.length < totalGroups)
      _groupFocusNodes.add(FocusNode());
    while (_groupFocusNodes.length > totalGroups)
      _groupFocusNodes.removeLast().dispose();

    return FocusTraversalGroup(
      child: Container(
        width: 200,
        decoration: BoxDecoration(
          gradient: LinearGradient(
            begin: Alignment.topLeft,
            end: Alignment.bottomRight,
            colors: Theme.of(context).brightness == Brightness.dark
                ? [
                    AppTheme.getBackgroundColor(context),
                    AppTheme.getPrimaryColor(context).withOpacity(0.15),
                    AppTheme.getBackgroundColor(context)
                  ]
                : [
                    AppTheme.getBackgroundColor(context),
                    AppTheme.getBackgroundColor(context).withOpacity(0.9),
                    AppTheme.getPrimaryColor(context).withOpacity(0.08)
                  ],
          ),
          boxShadow: [
            BoxShadow(
                color: Colors.black.withOpacity(0.2),
                blurRadius: 8,
                offset: const Offset(2, 0))
          ],
        ),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            // Header
            Container(
              padding: const EdgeInsets.all(20),
              decoration: BoxDecoration(
                gradient: LinearGradient(
                  begin: Alignment.topLeft,
                  end: Alignment.bottomRight,
                  colors: Theme.of(context).brightness == Brightness.dark
                      ? [
                          const Color(0xFF0A0A0A),
                          AppTheme.getPrimaryColor(context).withOpacity(0.1)
                        ]
                      : [
                          const Color(0xFFE0E0E0),
                          AppTheme.getPrimaryColor(context).withOpacity(0.12)
                        ],
                ),
                border: Border(
                    bottom: BorderSide(
                        color: AppTheme.getCardColor(context), width: 1)),
              ),
              child: Row(
                children: [
                  TVFocusable(
                    onSelect: () => Navigator.of(context).pop(),
                    focusScale: 1.1,
                    child: Container(
                      padding: const EdgeInsets.all(8),
                      decoration: BoxDecoration(
                          color: AppTheme.getCardColor(context),
                          borderRadius: BorderRadius.circular(8)),
                      child: Icon(Icons.arrow_back_rounded,
                          color: AppTheme.getTextPrimary(context), size: 20),
                    ),
                  ),
                  const SizedBox(width: 12),
                  Expanded(
                    child: Text(
                      AppStrings.of(context)?.series ?? 'Series',
                      style: TextStyle(
                          color: AppTheme.getTextPrimary(context),
                          fontSize: 18,
                          fontWeight: FontWeight.bold),
                    ),
                  ),
                ],
              ),
            ),
            // All Series
            Padding(
              padding: const EdgeInsets.symmetric(horizontal: 12, vertical: 8),
              child: _buildGroupItem(
                name: AppStrings.of(context)?.allChannels ?? 'All Series',
                count: provider.seriesChannelCount,
                isSelected: _selectedGroup == null,
                focusNode:
                    _groupFocusNodes.isNotEmpty ? _groupFocusNodes[0] : null,
                groupIndex: 0,
                onTap: () => setState(() {
                  _selectedGroup = null;
                  _currentGroupIndex = 0;
                }),
              ),
            ),
            Divider(color: AppTheme.getCardColor(context), height: 1),
            Expanded(
              child: ListView.builder(
                controller: _groupScrollController,
                padding:
                    const EdgeInsets.symmetric(horizontal: 12, vertical: 8),
                itemCount: groups.length,
                itemBuilder: (context, index) {
                  final g = groups[index];
                  final focusIndex = index + 1;
                  return _buildGroupItem(
                    name: g.name,
                    count: g.channelCount,
                    isSelected: _selectedGroup == g.name,
                    focusNode: focusIndex < _groupFocusNodes.length
                        ? _groupFocusNodes[focusIndex]
                        : null,
                    groupIndex: focusIndex,
                    onTap: () => setState(() {
                      _selectedGroup = g.name;
                      _currentGroupIndex = focusIndex;
                    }),
                  );
                },
              ),
            ),
          ],
        ),
      ),
    );
  }

  Widget _buildGroupItem({
    required String name,
    required int count,
    required bool isSelected,
    required VoidCallback onTap,
    FocusNode? focusNode,
    int groupIndex = 0,
  }) {
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: 2),
      child: TVFocusable(
        focusNode: focusNode,
        onSelect: onTap,
        onFocus: PlatformDetector.isTV
            ? () {
                _currentGroupIndex = groupIndex;
                _groupSelectTimer?.cancel();
                _groupSelectTimer =
                    Timer(const Duration(milliseconds: 300), () {
                  if (mounted) {
                    _scrollController.jumpTo(0);
                    onTap();
                  }
                });
              }
            : null,
        onRight: PlatformDetector.isTV
            ? () {
                if (_itemFocusNodes.isNotEmpty)
                  _itemFocusNodes[0].requestFocus();
              }
            : null,
        child: Container(
          padding: const EdgeInsets.symmetric(horizontal: 12, vertical: 10),
          decoration: BoxDecoration(
            gradient: isSelected ? AppTheme.getGradient(context) : null,
            color: isSelected ? null : Colors.transparent,
            borderRadius: BorderRadius.circular(8),
          ),
          child: Row(
            children: [
              Icon(
                isSelected
                    ? Icons.video_library_rounded
                    : Icons.chevron_right_rounded,
                color:
                    isSelected ? Colors.white : AppTheme.getTextMuted(context),
                size: 16,
              ),
              const SizedBox(width: 8),
              Expanded(
                child: Text(
                  name,
                  maxLines: 2,
                  overflow: TextOverflow.ellipsis,
                  style: TextStyle(
                    color: isSelected
                        ? Colors.white
                        : AppTheme.getTextSecondary(context),
                    fontSize: 12,
                    fontWeight:
                        isSelected ? FontWeight.w600 : FontWeight.normal,
                  ),
                ),
              ),
              Container(
                padding: const EdgeInsets.symmetric(horizontal: 6, vertical: 2),
                decoration: BoxDecoration(
                  color: isSelected
                      ? Colors.white.withOpacity(0.25)
                      : AppTheme.getCardColor(context),
                  borderRadius: BorderRadius.circular(8),
                ),
                child: Text(
                  count.toString(),
                  style: TextStyle(
                    color: isSelected
                        ? Colors.white
                        : AppTheme.getTextMuted(context),
                    fontSize: 10,
                    fontWeight: FontWeight.w600,
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }

  Widget _buildSeriesList(List<Channel> items) {
    if (items.isEmpty) {
      return Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Icon(Icons.video_library_outlined,
                size: 64, color: AppTheme.getTextMuted(context)),
            const SizedBox(height: 16),
            Text(
              AppStrings.of(context)?.noResultsFound ?? 'No series found',
              style: TextStyle(
                  color: AppTheme.getTextMuted(context), fontSize: 16),
            ),
          ],
        ),
      );
    }

    while (_itemFocusNodes.length < items.length)
      _itemFocusNodes.add(FocusNode());
    while (_itemFocusNodes.length > items.length)
      _itemFocusNodes.removeLast().dispose();

    return ListView.builder(
      controller: _scrollController,
      padding: const EdgeInsets.symmetric(vertical: 8, horizontal: 12),
      itemCount: items.length,
      itemBuilder: (context, index) {
        final item = items[index];
        final focusNode =
            index < _itemFocusNodes.length ? _itemFocusNodes[index] : null;
        return _buildSeriesItem(item, focusNode, index);
      },
    );
  }

  Widget _buildSeriesItem(Channel item, FocusNode? focusNode, int index) {
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: 3),
      child: TVFocusable(
        focusNode: focusNode,
        onSelect: () => _playChannel(item),
        focusScale: 1.02,
        child: GestureDetector(
          onTap: () => _playChannel(item),
          child: Container(
            padding: const EdgeInsets.symmetric(horizontal: 12, vertical: 10),
            decoration: BoxDecoration(
              color: AppTheme.getCardColor(context),
              borderRadius: BorderRadius.circular(8),
            ),
            child: Row(
              children: [
                // Thumbnail / Logo
                ClipRRect(
                  borderRadius: BorderRadius.circular(6),
                  child: SizedBox(
                    width: 56,
                    height: 56,
                    child: item.logoUrl != null && item.logoUrl!.isNotEmpty
                        ? CachedNetworkImage(
                            imageUrl: item.logoUrl!,
                            fit: BoxFit.cover,
                            placeholder: (_, __) => Container(
                              color: AppTheme.getSurfaceColor(context),
                              child: Icon(Icons.video_library_rounded,
                                  color: AppTheme.getTextMuted(context),
                                  size: 24),
                            ),
                            errorWidget: (_, __, ___) => Container(
                              color: AppTheme.getSurfaceColor(context),
                              child: Icon(Icons.video_library_rounded,
                                  color: AppTheme.getTextMuted(context),
                                  size: 24),
                            ),
                          )
                        : Container(
                            color: AppTheme.getSurfaceColor(context),
                            child: Icon(Icons.video_library_rounded,
                                color: AppTheme.getTextMuted(context),
                                size: 24),
                          ),
                  ),
                ),
                const SizedBox(width: 12),
                // Title + group info
                Expanded(
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Text(
                        item.name,
                        maxLines: 1,
                        overflow: TextOverflow.ellipsis,
                        style: TextStyle(
                          color: AppTheme.getTextPrimary(context),
                          fontSize: 14,
                          fontWeight: FontWeight.w500,
                        ),
                      ),
                      if (item.groupName != null &&
                          item.groupName!.isNotEmpty) ...[
                        const SizedBox(height: 4),
                        Text(
                          item.groupName!,
                          maxLines: 1,
                          overflow: TextOverflow.ellipsis,
                          style: TextStyle(
                            color: AppTheme.getTextMuted(context),
                            fontSize: 11,
                          ),
                        ),
                      ],
                    ],
                  ),
                ),
                // Play icon
                Icon(Icons.play_circle_outline_rounded,
                    color: AppTheme.getPrimaryColor(context), size: 24),
              ],
            ),
          ),
        ),
      ),
    );
  }
}

class _SeriesEpisode {
  final int season;
  final int episodeNumber;
  final String title;
  final String url;

  const _SeriesEpisode({
    required this.season,
    required this.episodeNumber,
    required this.title,
    required this.url,
  });
}

import 'dart:async';

import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:cached_network_image/cached_network_image.dart';

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

/// Movies screen: shows VOD channels grouped by movie categories.
/// Layout: left sidebar (categories) + right poster grid.
class MoviesScreen extends StatefulWidget {
  const MoviesScreen({super.key});

  @override
  State<MoviesScreen> createState() => _MoviesScreenState();
}

class _MoviesScreenState extends State<MoviesScreen> {
  String? _selectedGroup;
  final ScrollController _scrollController = ScrollController();
  final ScrollController _groupScrollController = ScrollController();
  Timer? _groupSelectTimer;
  final List<FocusNode> _groupFocusNodes = [];
  final List<FocusNode> _cardFocusNodes = [];
  int _currentGroupIndex = 0;
  final Map<String, Future<OmdbMovieInfo?>> _omdbFutures = {};

  @override
  void initState() {
    super.initState();
    WidgetsBinding.instance.addPostFrameCallback((_) {
      _ensureMoviesLoaded();
    });
  }

  Future<void> _ensureMoviesLoaded() async {
    if (!mounted) return;
    final channelProvider = context.read<ChannelProvider>();
    final playlistProvider = context.read<PlaylistProvider>();
    final activeId = playlistProvider.activePlaylist?.id;

    if (activeId == null || channelProvider.isLoading) return;

    if (channelProvider.vodChannels.isEmpty) {
      ServiceLocator.log.i('MoviesScreen: VOD vacío, recargando canales del playlist activo $activeId', tag: 'MoviesScreen');
      await channelProvider.loadAllChannelsToCache(activeId);
    }
  }

  List<Channel> _moviesForGroup(ChannelProvider provider, String? group) {
    if (group == null) return provider.vodChannels;
    return provider.vodChannels.where((c) => c.groupName == group).toList();
  }

  @override
  void dispose() {
    _groupSelectTimer?.cancel();
    _scrollController.dispose();
    _groupScrollController.dispose();
    for (final n in _groupFocusNodes) n.dispose();
    for (final n in _cardFocusNodes) n.dispose();
    super.dispose();
  }

  Future<OmdbMovieInfo?> _getOmdbInfo(Channel movie) {
    final key = '${movie.epgId ?? ''}|${movie.name.trim().toLowerCase()}';
    return _omdbFutures.putIfAbsent(
      key,
      () => ServiceLocator.omdb.getMovieInfo(
        rawTitle: movie.name,
        rawImdbId: movie.epgId,
      ),
    );
  }

  String? _bestPosterUrl(Channel movie, OmdbMovieInfo? info) {
    final omdbPoster = info?.poster;
    if (omdbPoster != null && omdbPoster.isNotEmpty && omdbPoster != 'N/A') {
      return omdbPoster;
    }

    if (movie.logoUrl != null && movie.logoUrl!.isNotEmpty) {
      return movie.logoUrl;
    }

    if (movie.fallbackLogoUrl != null && movie.fallbackLogoUrl!.isNotEmpty) {
      return movie.fallbackLogoUrl;
    }

    return null;
  }

  String _tr(String es, String en) {
    final lang = Localizations.localeOf(context).languageCode;
    return lang == 'es' ? es : en;
  }

  void _playChannel(Channel channel) {
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

  Future<void> _openMovieDetails(Channel movie) async {
    final favoritesProvider = context.read<FavoritesProvider>();
    bool watchLater = ServiceLocator.watchLater.contains(movie.id);

    await showDialog(
      context: context,
      builder: (ctx) {
        return StatefulBuilder(
          builder: (context, setDialogState) {
            final isFavorite = favoritesProvider.isFavorite(movie.id ?? 0);

            return AlertDialog(
          backgroundColor: AppTheme.getSurfaceColor(ctx),
          contentPadding: const EdgeInsets.fromLTRB(16, 14, 16, 10),
          content: SizedBox(
            width: 620,
            child: FutureBuilder<OmdbMovieInfo?>(
              future: _getOmdbInfo(movie),
              builder: (context, snapshot) {
                final info = snapshot.data;
                final title = (info?.title.isNotEmpty ?? false) ? info!.title : movie.name;
                final year = (info?.year.isNotEmpty ?? false) && info!.year != 'N/A' ? info.year : '—';
                final rating = (info?.imdbRating.isNotEmpty ?? false) && info!.imdbRating != 'N/A' ? info.imdbRating : '—';
                final genre = (info?.genre.isNotEmpty ?? false) && info!.genre != 'N/A' ? info.genre : '—';
                final runtime = (info?.runtime.isNotEmpty ?? false) && info!.runtime != 'N/A' ? info.runtime : '—';
                final plot = (info?.plot.isNotEmpty ?? false) && info!.plot != 'N/A'
                    ? info.plot
                    : _tr('Sin descripción disponible', 'No description available');

                return Column(
                  mainAxisSize: MainAxisSize.min,
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Row(
                      children: [
                        TVFocusable(
                          onSelect: () async {
                            await favoritesProvider.toggleFavorite(movie);
                            if (context.mounted) setDialogState(() {});
                          },
                          child: Container(
                            padding: const EdgeInsets.symmetric(horizontal: 10, vertical: 6),
                            decoration: BoxDecoration(
                              color: isFavorite
                                  ? AppTheme.getPrimaryColor(context).withOpacity(0.2)
                                  : AppTheme.getCardColor(context),
                              borderRadius: BorderRadius.circular(20),
                            ),
                            child: Row(
                              mainAxisSize: MainAxisSize.min,
                              children: [
                                Icon(
                                  isFavorite ? Icons.favorite : Icons.favorite_border_rounded,
                                  size: 16,
                                  color: isFavorite
                                      ? AppTheme.getPrimaryColor(context)
                                      : AppTheme.getTextSecondary(context),
                                ),
                                const SizedBox(width: 6),
                                Text(
                                  _tr('Favorito', 'Favorite'),
                                  style: TextStyle(color: AppTheme.getTextPrimary(context), fontSize: 12),
                                ),
                              ],
                            ),
                          ),
                        ),
                        const SizedBox(width: 8),
                        TVFocusable(
                          onSelect: () async {
                            watchLater = await ServiceLocator.watchLater.toggle(movie.id);
                            if (context.mounted) setDialogState(() {});
                          },
                          child: Container(
                            padding: const EdgeInsets.symmetric(horizontal: 10, vertical: 6),
                            decoration: BoxDecoration(
                              color: watchLater
                                  ? AppTheme.getPrimaryColor(context).withOpacity(0.2)
                                  : AppTheme.getCardColor(context),
                              borderRadius: BorderRadius.circular(20),
                            ),
                            child: Row(
                              mainAxisSize: MainAxisSize.min,
                              children: [
                                Icon(
                                  watchLater ? Icons.bookmark_rounded : Icons.bookmark_border_rounded,
                                  size: 16,
                                  color: watchLater
                                      ? AppTheme.getPrimaryColor(context)
                                      : AppTheme.getTextSecondary(context),
                                ),
                                const SizedBox(width: 6),
                                Text(
                                  _tr('Ver luego', 'Watch later'),
                                  style: TextStyle(color: AppTheme.getTextPrimary(context), fontSize: 12),
                                ),
                              ],
                            ),
                          ),
                        ),
                      ],
                    ),
                    const SizedBox(height: 12),
                    Row(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        ClipRRect(
                          borderRadius: BorderRadius.circular(8),
                          child: SizedBox(
                            width: 120,
                            height: 170,
                            child: () {
                              final posterUrl = _bestPosterUrl(movie, info);
                              if (posterUrl == null) {
                                return Container(
                                  color: AppTheme.getCardColor(context),
                                  child: Icon(Icons.movie_rounded, color: AppTheme.getTextMuted(context), size: 36),
                                );
                              }

                              return CachedNetworkImage(
                                imageUrl: posterUrl,
                                fit: BoxFit.cover,
                                errorWidget: (_, __, ___) => Container(
                                  color: AppTheme.getCardColor(context),
                                  child: Icon(Icons.movie_rounded, color: AppTheme.getTextMuted(context), size: 36),
                                ),
                              );
                            }(),
                          ),
                        ),
                        const SizedBox(width: 14),
                        Expanded(
                          child: Column(
                            crossAxisAlignment: CrossAxisAlignment.start,
                            children: [
                              Text(
                                title,
                                maxLines: 2,
                                overflow: TextOverflow.ellipsis,
                                style: TextStyle(
                                  color: AppTheme.getTextPrimary(context),
                                  fontSize: 20,
                                  fontWeight: FontWeight.bold,
                                ),
                              ),
                              const SizedBox(height: 8),
                              Text('IMDb: $rating', style: TextStyle(color: AppTheme.getTextSecondary(context))),
                              const SizedBox(height: 4),
                              Text('${_tr('Año', 'Year')}: $year', style: TextStyle(color: AppTheme.getTextSecondary(context))),
                              const SizedBox(height: 4),
                              Text('${_tr('Género', 'Genre')}: $genre', style: TextStyle(color: AppTheme.getTextSecondary(context))),
                              const SizedBox(height: 4),
                              Text('${_tr('Duración', 'Runtime')}: $runtime', style: TextStyle(color: AppTheme.getTextSecondary(context))),
                            ],
                          ),
                        ),
                      ],
                    ),
                    const SizedBox(height: 12),
                    Text(
                      plot,
                      maxLines: 5,
                      overflow: TextOverflow.ellipsis,
                      style: TextStyle(color: AppTheme.getTextPrimary(context), height: 1.3),
                    ),
                    if (snapshot.connectionState == ConnectionState.waiting) ...[
                      const SizedBox(height: 8),
                      Text(
                        _tr('Consultando OMDb…', 'Loading OMDb…'),
                        style: TextStyle(color: AppTheme.getTextMuted(context), fontSize: 12),
                      ),
                    ],
                  ],
                );
              },
            ),
          ),
          actions: [
            TextButton(
              onPressed: () => Navigator.pop(ctx),
              child: Text(_tr('Cerrar', 'Close')),
            ),
            ElevatedButton.icon(
              onPressed: () {
                Navigator.pop(ctx);
                _playChannel(movie);
              },
              icon: const Icon(Icons.play_arrow_rounded),
              label: Text(_tr('Reproducir', 'Play')),
            ),
          ],
            );
          },
        );
      },
    );
  }

  @override
  Widget build(BuildContext context) {
    final isTV = PlatformDetector.isTV;
    final content = isTV ? _buildTVLayout() : _buildMobileLayout();

    return Scaffold(
      body: Container(
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
    );
  }

  Widget _buildTVLayout() {
    return TVSidebar(
      selectedIndex: 2, // Movies is index 2
      child: Consumer<ChannelProvider>(
        builder: (context, provider, _) {
          final groups = provider.vodGroups;
          final movies = _moviesForGroup(provider, _selectedGroup);
          return Row(
            children: [
              _buildGroupsSidebar(groups, provider),
              Expanded(child: _buildPosterGrid(movies)),
            ],
          );
        },
      ),
    );
  }

  Widget _buildMobileLayout() {
    return Consumer<ChannelProvider>(
      builder: (context, provider, _) {
        final groups = provider.vodGroups;
        final movies = _moviesForGroup(provider, _selectedGroup);
        return Column(
          children: [
            // Mobile top bar
            Container(
              padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 10),
              decoration: const BoxDecoration(gradient: AppTheme.lotusGradient),
              child: Row(
                children: [
                  GestureDetector(
                    onTap: () => Navigator.pop(context),
                    child: const Icon(Icons.arrow_back, color: Colors.white, size: 20),
                  ),
                  const SizedBox(width: 12),
                  Text(
                    AppStrings.of(context)?.movies ?? 'Movies',
                    style: const TextStyle(color: Colors.white, fontSize: 18, fontWeight: FontWeight.bold),
                  ),
                  const SizedBox(width: 12),
                  GestureDetector(
                    onTap: () => _showMobileGroupsBottomSheet(context, groups),  
                    child: Container(
                      padding: const EdgeInsets.symmetric(horizontal: 10, vertical: 4),
                      decoration: BoxDecoration(
                        color: Colors.white.withOpacity(0.2),
                        borderRadius: BorderRadius.circular(12),
                      ),
                      child: Row(
                        mainAxisSize: MainAxisSize.min,
                        children: [
                          Text(
                            _selectedGroup ?? (AppStrings.of(context)?.allChannels ?? 'All'),
                            style: const TextStyle(color: Colors.white, fontSize: 12),
                          ),
                          const SizedBox(width: 4),
                          const Icon(Icons.expand_more, color: Colors.white, size: 16),
                        ],
                      ),
                    ),
                  ),
                ],
              ),
            ),
            Expanded(child: _buildPosterGrid(movies)),
          ],
        );
      },
    );
  }

  void _showMobileGroupsBottomSheet(BuildContext context, List<ChannelGroup> groups) {
    showModalBottomSheet(
      context: context,
      backgroundColor: AppTheme.getSurfaceColor(context),
      shape: const RoundedRectangleBorder(borderRadius: BorderRadius.vertical(top: Radius.circular(16))),
      builder: (ctx) => SafeArea(
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            Container(
              padding: const EdgeInsets.all(12),
              child: Text(
                AppStrings.of(context)?.categories ?? 'Categories',
                style: TextStyle(color: AppTheme.getTextPrimary(context), fontSize: 16, fontWeight: FontWeight.bold),
              ),
            ),
            const Divider(height: 1),
            Flexible(
              child: ListView(
                shrinkWrap: true,
                children: [
                  ListTile(
                    title: Text(AppStrings.of(context)?.allChannels ?? 'All Movies'),
                    leading: Icon(Icons.movie_rounded, color: _selectedGroup == null ? AppTheme.getPrimaryColor(context) : AppTheme.getTextSecondary(context)),
                    selected: _selectedGroup == null,
                    onTap: () {
                      setState(() => _selectedGroup = null);
                      Navigator.pop(ctx);
                    },
                  ),
                  ...groups.map((g) => ListTile(
                    title: Text(g.name),
                    leading: Icon(Icons.folder_rounded, color: _selectedGroup == g.name ? AppTheme.getPrimaryColor(context) : AppTheme.getTextSecondary(context)),
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

  Widget _buildGroupsSidebar(List<ChannelGroup> groups, ChannelProvider provider) {
    // Ensure focus nodes
    final totalGroups = groups.length + 1; // +1 for "All"
    while (_groupFocusNodes.length < totalGroups) _groupFocusNodes.add(FocusNode());
    while (_groupFocusNodes.length > totalGroups) _groupFocusNodes.removeLast().dispose();

    return FocusTraversalGroup(
      child: Container(
        width: 200,
        decoration: BoxDecoration(
          gradient: LinearGradient(
            begin: Alignment.topLeft,
            end: Alignment.bottomRight,
            colors: Theme.of(context).brightness == Brightness.dark
                ? [AppTheme.getBackgroundColor(context), AppTheme.getPrimaryColor(context).withOpacity(0.15), AppTheme.getBackgroundColor(context)]
                : [AppTheme.getBackgroundColor(context), AppTheme.getBackgroundColor(context).withOpacity(0.9), AppTheme.getPrimaryColor(context).withOpacity(0.08)],
          ),
          boxShadow: [BoxShadow(color: Colors.black.withOpacity(0.2), blurRadius: 8, offset: const Offset(2, 0))],
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
                      ? [const Color(0xFF0A0A0A), AppTheme.getPrimaryColor(context).withOpacity(0.1)]
                      : [const Color(0xFFE0E0E0), AppTheme.getPrimaryColor(context).withOpacity(0.12)],
                ),
                border: Border(bottom: BorderSide(color: AppTheme.getCardColor(context), width: 1)),
              ),
              child: Row(
                children: [
                  TVFocusable(
                    onSelect: () => Navigator.of(context).pop(),
                    focusScale: 1.1,
                    child: Container(
                      padding: const EdgeInsets.all(8),
                      decoration: BoxDecoration(color: AppTheme.getCardColor(context), borderRadius: BorderRadius.circular(8)),
                      child: Icon(Icons.arrow_back_rounded, color: AppTheme.getTextPrimary(context), size: 20),
                    ),
                  ),
                  const SizedBox(width: 12),
                  Expanded(
                    child: Text(
                      AppStrings.of(context)?.movies ?? 'Movies',
                      style: TextStyle(color: AppTheme.getTextPrimary(context), fontSize: 18, fontWeight: FontWeight.bold),
                    ),
                  ),
                ],
              ),
            ),
            // All Movies
            Padding(
              padding: const EdgeInsets.symmetric(horizontal: 12, vertical: 8),
              child: _buildGroupItem(
                name: AppStrings.of(context)?.allChannels ?? 'All Movies',
                count: provider.vodChannelCount,
                isSelected: _selectedGroup == null,
                focusNode: _groupFocusNodes.isNotEmpty ? _groupFocusNodes[0] : null,
                groupIndex: 0,
                onTap: () => setState(() { _selectedGroup = null; }),
              ),
            ),
            Divider(color: AppTheme.getCardColor(context), height: 1),
            Expanded(
              child: ListView.builder(
                controller: _groupScrollController,
                padding: const EdgeInsets.symmetric(horizontal: 12, vertical: 8),
                itemCount: groups.length,
                itemBuilder: (context, index) {
                  final g = groups[index];
                  final focusIndex = index + 1;
                  return _buildGroupItem(
                    name: g.name,
                    count: g.channelCount,
                    isSelected: _selectedGroup == g.name,
                    focusNode: focusIndex < _groupFocusNodes.length ? _groupFocusNodes[focusIndex] : null,
                    groupIndex: focusIndex,
                    onTap: () => setState(() { _selectedGroup = g.name; }),
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
                _groupSelectTimer?.cancel();
                _groupSelectTimer = Timer(const Duration(milliseconds: 300), () {
                  if (mounted) {
                    _scrollController.jumpTo(0);
                    onTap();
                  }
                });
              }
            : null,
        onRight: PlatformDetector.isTV
            ? () {
                if (_cardFocusNodes.isNotEmpty) _cardFocusNodes[0].requestFocus();
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
                isSelected ? Icons.movie_rounded : Icons.folder_rounded,
                color: isSelected ? Colors.white : AppTheme.getTextMuted(context),
                size: 16,
              ),
              const SizedBox(width: 8),
              Expanded(
                child: Text(
                  name,
                  maxLines: 2,
                  overflow: TextOverflow.ellipsis,
                  style: TextStyle(
                    color: isSelected ? Colors.white : AppTheme.getTextSecondary(context),
                    fontSize: 12,
                    fontWeight: isSelected ? FontWeight.w600 : FontWeight.normal,
                  ),
                ),
              ),
              Container(
                padding: const EdgeInsets.symmetric(horizontal: 6, vertical: 2),
                decoration: BoxDecoration(
                  color: isSelected ? Colors.white.withOpacity(0.25) : AppTheme.getCardColor(context),
                  borderRadius: BorderRadius.circular(8),
                ),
                child: Text(
                  count.toString(),
                  style: TextStyle(
                    color: isSelected ? Colors.white : AppTheme.getTextMuted(context),
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

  Widget _buildPosterGrid(List<Channel> movies) {
    if (movies.isEmpty) {
      return Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Icon(Icons.movie_outlined, size: 64, color: AppTheme.getTextMuted(context)),
            const SizedBox(height: 16),
            Text(
              AppStrings.of(context)?.noResultsFound ?? 'No movies found',
              style: TextStyle(color: AppTheme.getTextMuted(context), fontSize: 16),
            ),
          ],
        ),
      );
    }

    // Ensure card focus nodes
    while (_cardFocusNodes.length < movies.length) _cardFocusNodes.add(FocusNode());
    while (_cardFocusNodes.length > movies.length) _cardFocusNodes.removeLast().dispose();

    final crossAxisCount = _posterColumns();

    return GridView.builder(
      controller: _scrollController,
      padding: const EdgeInsets.all(16),
      gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
        crossAxisCount: crossAxisCount,
        crossAxisSpacing: 12,
        mainAxisSpacing: 12,
        childAspectRatio: 0.65, // Poster aspect ratio (portrait)
      ),
      itemCount: movies.length,
      itemBuilder: (context, index) {
        final movie = movies[index];
        final focusNode = index < _cardFocusNodes.length ? _cardFocusNodes[index] : null;
        return _buildPosterCard(movie, focusNode);
      },
    );
  }

  int _posterColumns() {
    final width = MediaQuery.of(context).size.width;
    if (PlatformDetector.isTV) {
      if (width > 1800) return 8;
      if (width > 1600) return 7;
      if (width > 1400) return 6;
      if (width > 1200) return 6;
      if (width > 1000) return 5;
      return 4;
    } else if (PlatformDetector.isMobile) {
      if (width > 700) return 5;
      if (width > 450) return 4;
      if (width > 350) return 3;
      return 2;
    } else {
      if (width > 1600) return 7;
      if (width > 1400) return 6;
      if (width > 1200) return 5;
      return 4;
    }
  }

  Widget _buildPosterCard(Channel movie, FocusNode? focusNode) {
    return TVFocusable(
      focusNode: focusNode,
      onSelect: () => _openMovieDetails(movie),
      focusScale: 1.05,
      child: GestureDetector(
        onTap: () => _openMovieDetails(movie),
        child: Container(
          decoration: BoxDecoration(
            color: AppTheme.getCardColor(context),
            borderRadius: BorderRadius.circular(8),
            boxShadow: [BoxShadow(color: Colors.black.withOpacity(0.3), blurRadius: 6, offset: const Offset(0, 3))],
          ),
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.stretch,
            children: [
              // Poster image (70% of height)
              Expanded(
                flex: 7,
                child: ClipRRect(
                  borderRadius: const BorderRadius.vertical(top: Radius.circular(8)),
                  child: movie.logoUrl != null && movie.logoUrl!.isNotEmpty
                      ? CachedNetworkImage(
                          imageUrl: movie.logoUrl!,
                          fit: BoxFit.cover,
                          placeholder: (_, __) => Container(
                            color: AppTheme.getSurfaceColor(context),
                            child: Icon(Icons.movie_rounded, color: AppTheme.getTextMuted(context), size: 32),
                          ),
                          errorWidget: (_, __, ___) => Container(
                            color: AppTheme.getSurfaceColor(context),
                            child: Icon(Icons.movie_rounded, color: AppTheme.getTextMuted(context), size: 32),
                          ),
                        )
                      : Container(
                          color: AppTheme.getSurfaceColor(context),
                          child: Icon(Icons.movie_rounded, color: AppTheme.getTextMuted(context), size: 32),
                        ),
                ),
              ),
              // Title (30% of height)
              Expanded(
                flex: 3,
                child: Padding(
                  padding: const EdgeInsets.symmetric(horizontal: 6, vertical: 4),
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    mainAxisAlignment: MainAxisAlignment.start,
                    children: [
                      Text(
                        movie.name,
                        maxLines: 2,
                        overflow: TextOverflow.ellipsis,
                        style: TextStyle(
                          color: AppTheme.getTextPrimary(context),
                          fontSize: 11,
                          fontWeight: FontWeight.w600,
                        ),
                      ),
                      if (movie.groupName != null && movie.groupName!.isNotEmpty) ...[
                        const SizedBox(height: 2),
                        Text(
                          movie.groupName!,
                          maxLines: 1,
                          overflow: TextOverflow.ellipsis,
                          style: TextStyle(
                            color: AppTheme.getTextMuted(context),
                            fontSize: 10,
                          ),
                        ),
                      ],
                    ],
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}

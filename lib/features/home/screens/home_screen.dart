import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:provider/provider.dart';
import 'package:package_info_plus/package_info_plus.dart';

import '../../../core/theme/app_theme.dart';
import '../../../core/navigation/app_router.dart';
import '../../../core/widgets/tv_focusable.dart';
import '../../../core/widgets/tv_sidebar.dart';
import '../../../core/widgets/category_card.dart';
import '../../../core/widgets/channel_card.dart';
import '../../../core/widgets/channel_logo_widget.dart';
import '../../../core/platform/platform_detector.dart';
import '../../../core/i18n/app_strings.dart';
import '../../../core/services/update_service.dart';
import '../../../core/services/service_locator.dart';
import '../../../core/models/app_update.dart';
import '../../../core/utils/card_size_calculator.dart';
import '../../../core/utils/throttled_state_mixin.dart'; // ✅  mixin
import '../../channels/providers/channel_provider.dart';
import '../../channels/screens/channels_screen.dart';
import '../../playlist/providers/playlist_provider.dart';
import '../../playlist/widgets/add_playlist_dialog.dart';
import '../../playlist/screens/playlist_list_screen.dart';
import '../../favorites/providers/favorites_provider.dart';
import '../../favorites/screens/favorites_screen.dart';
import '../../player/providers/player_provider.dart';
import '../../settings/providers/settings_provider.dart';
import '../../settings/screens/settings_screen.dart';
import '../../search/screens/search_screen.dart';
import '../../epg/providers/epg_provider.dart';
import '../../multi_screen/providers/multi_screen_provider.dart';
import '../../../core/platform/native_player_channel.dart';
import '../../../core/models/channel.dart';

class HomeScreen extends StatefulWidget {
  const HomeScreen({super.key});

  @override
  State<HomeScreen> createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen>
    with WidgetsBindingObserver, RouteAware, ThrottledStateMixin {
  int _selectedNavIndex = 0;
  List<Channel> _watchHistoryChannels = [];
  int? _lastPlaylistId; // ID
  int _lastChannelCount = 0; //
  String _appVersion = '';
  AppUpdate? _availableUpdate; //
  final ScrollController _scrollController = ScrollController(); //
  final FocusNode _continueButtonFocusNode = FocusNode(); //
  bool _hasTriggeredEmptyChannelLoad = false; // ✅

  void _runAfterBuild(VoidCallback action) {
    WidgetsBinding.instance.addPostFrameCallback((_) {
      if (!mounted) return;
      action();
    });
  }

  @override
  void initState() {
    super.initState();
    WidgetsBinding.instance.addObserver(this); //
    _loadVersion();
    _checkForUpdates();
    //
    WidgetsBinding.instance.addPostFrameCallback((_) {
      _loadData();
      context.read<ChannelProvider>().addListener(_onChannelProviderChanged);
      context.read<PlaylistProvider>().addListener(_onPlaylistProviderChanged);
      context
          .read<FavoritesProvider>()
          .addListener(_onFavoritesProviderChanged);
    });
  }

  @override
  void didChangeDependencies() {
    super.didChangeDependencies();
    //
    final route = ModalRoute.of(context);
    if (route is PageRoute) {
      AppRouter.routeObserver.subscribe(this, route);
    }
    //
    _checkAndReloadIfNeeded();
  }

  //
  @override
  void didPopNext() {
    super.didPopNext();
    ServiceLocator.log.i('', tag: 'HomeScreen');
    _refreshWatchHistory();
  }

  @override
  void didChangeAppLifecycleState(AppLifecycleState state) {
    super.didChangeAppLifecycleState(state);
    // ServiceLocator.log.i(': $state', tag: 'HomeScreen');

    //
    if (state == AppLifecycleState.resumed) {
      // ServiceLocator.log.i('', tag: 'HomeScreen');
      _checkAndReloadIfNeeded();
      //
      _refreshWatchHistory();
    }
  }

  Future<void> _checkForUpdates() async {
    try {
      final updateService = UpdateService();
      // 24
      final update = await updateService.checkForUpdates(forceCheck: true);
      if (mounted && update != null) {
        setState(() {
          _availableUpdate = update;
        });
      }
    } catch (e) {
      //
    }
  }

  Future<void> _loadVersion() async {
    try {
      final packageInfo = await PackageInfo.fromPlatform();
      if (mounted) {
        setState(() {
          _appVersion = packageInfo.version;
        });
      }
    } catch (e) {
      // ignore
    }
  }

  @override
  void dispose() {
    _scrollController.dispose(); //
    _continueButtonFocusNode.dispose(); //
    WidgetsBinding.instance.removeObserver(this); //
    AppRouter.routeObserver.unsubscribe(this); //
    //  context
    super.dispose();
  }

  void _onChannelProviderChanged() {
    if (!mounted) return;
    final channelProvider = context.read<ChannelProvider>();

    //
    if (!channelProvider.isLoading && channelProvider.channels.isNotEmpty) {
      // ✅
      _hasTriggeredEmptyChannelLoad = false;

      //
      if (channelProvider.channels.length != _lastChannelCount ||
          _watchHistoryChannels.isEmpty) {
        _lastChannelCount = channelProvider.channels.length;
        _refreshWatchHistory();
      }
    }
  }

  void _onPlaylistProviderChanged() {
    if (!mounted) return;
    final playlistProvider = context.read<PlaylistProvider>();
    final currentPlaylistId = playlistProvider.activePlaylist?.id;

    // ID
    if (_lastPlaylistId != currentPlaylistId) {
      _lastPlaylistId = currentPlaylistId;
      _watchHistoryChannels = [];
      _lastChannelCount = 0;
      _hasTriggeredEmptyChannelLoad = false; // ✅

      // ✅
      if (currentPlaylistId != null) {
        final channelProvider = context.read<ChannelProvider>();
        ServiceLocator.log.i(': $currentPlaylistId', tag: 'HomeScreen');

        // 1.  setState
        clearPendingSetState();

        // 2.  Provider
        channelProvider.clearCache(); //
        channelProvider.clearLogoLoadingQueue(); //

        // 3.
        _runAfterBuild(() {
          channelProvider.loadAllChannelsToCache(currentPlaylistId);
        });
      }
    }

    // isLoading  true  false
    //  M3U
    if (!playlistProvider.isLoading && playlistProvider.hasPlaylists) {
      final channelProvider = context.read<ChannelProvider>();
      final favoritesProvider = context.read<FavoritesProvider>();
      final currentId = playlistProvider.activePlaylist?.id;

      // ✅
      if (!channelProvider.isLoading && currentId != null) {
        //
        if (channelProvider.channels.isEmpty) {
          ServiceLocator.log.i('', tag: 'HomeScreen');

          // 1.  setState
          clearPendingSetState();

          // 2.  Provider
          channelProvider.clearCache(); //
          channelProvider.clearLogoLoadingQueue(); //

          // 3.
          _runAfterBuild(() {
            channelProvider.loadAllChannelsToCache(currentId);
          });
        }

        // ✅
        ServiceLocator.log.i('', tag: 'HomeScreen');
        _runAfterBuild(() {
          favoritesProvider.loadFavorites();
          _refreshWatchHistory();
        });
      }
    }
  }

  void _onFavoritesProviderChanged() {
    if (!mounted) return;
    //
    _refreshWatchHistory();
  }

  ///
  void _checkAndReloadIfNeeded() {
    final playlistProvider = context.read<PlaylistProvider>();
    final channelProvider = context.read<ChannelProvider>();

    //
    if (playlistProvider.hasPlaylists &&
        !playlistProvider.isLoading &&
        channelProvider.channels.isEmpty &&
        !channelProvider.isLoading) {
      ServiceLocator.log.w('', tag: 'HomeScreen');
      final activePlaylist = playlistProvider.activePlaylist;
      if (activePlaylist?.id != null) {
        _runAfterBuild(() {
          channelProvider.loadAllChannelsToCache(activePlaylist!.id!);
        });
      }
    }
  }

  Future<void> _loadData() async {
    ServiceLocator.log.i('', tag: 'HomeScreen');
    final startTime = DateTime.now();

    final playlistProvider = context.read<PlaylistProvider>();
    final channelProvider = context.read<ChannelProvider>();
    final favoritesProvider = context.read<FavoritesProvider>();
    final settingsProvider = context.read<SettingsProvider>();
    final epgProvider = context.read<EpgProvider>();

    //
    if (!playlistProvider.hasPlaylists) {
      ServiceLocator.log.w('', tag: 'HomeScreen');
      await playlistProvider.loadPlaylists();
    }

    if (playlistProvider.hasPlaylists) {
      final activePlaylist = playlistProvider.activePlaylist;
      _lastPlaylistId = activePlaylist?.id;
      ServiceLocator.log.d(
          ': ${activePlaylist?.name} (ID: ${activePlaylist?.id})',
          tag: 'HomeScreen');

      if (activePlaylist != null && activePlaylist.id != null) {
        ServiceLocator.log.d(': ', tag: 'HomeScreen');
        // ✅
        await channelProvider.loadAllChannelsToCache(activePlaylist.id!);
      } else {
        ServiceLocator.log.d('', tag: 'HomeScreen');
        await channelProvider.loadAllChannels();
      }

      ServiceLocator.log.d('', tag: 'HomeScreen');
      await favoritesProvider.loadFavorites();
      _refreshWatchHistory();

      final loadTime = DateTime.now().difference(startTime).inMilliseconds;
      ServiceLocator.log.i(
          ': ${loadTime}ms: ${channelProvider.channels.length}',
          tag: 'HomeScreen');

      //  EPG EPG URL URL
      ServiceLocator.log.d(
          'HomeScreen:  EPG  - activePlaylist.epgUrl=${activePlaylist?.epgUrl}, settingsProvider.epgUrl=${settingsProvider.epgUrl}');
      print(
          'HomeScreen:  EPG  - activePlaylist.epgUrl=${activePlaylist?.epgUrl}, settingsProvider.epgUrl=${settingsProvider.epgUrl}');
      if (activePlaylist?.epgUrl != null &&
          activePlaylist!.epgUrl!.isNotEmpty) {
        ServiceLocator.log.d('HomeScreen:  EPG URL: ${activePlaylist.epgUrl}');
        // Background loading - don't block UI
        await epgProvider.loadEpg(
          activePlaylist.epgUrl!,
          fallbackUrl: settingsProvider.epgUrl,
          silent: true,
        );
      } else if (settingsProvider.epgUrl != null &&
          settingsProvider.epgUrl!.isNotEmpty) {
        ServiceLocator.log
            .d('HomeScreen:  EPG URL: ${settingsProvider.epgUrl}');
        // Background loading - don't block UI
        await epgProvider.loadEpg(settingsProvider.epgUrl!, silent: true);
      } else {
        ServiceLocator.log.d('HomeScreen:  EPG URL');
      }

      // 500ms
      if (settingsProvider.autoPlay && mounted) {
        Future.delayed(const Duration(milliseconds: 500), () {
          if (!mounted) return;

          //
          final isMultiScreenMode = settingsProvider.lastPlayMode == 'multi' &&
              settingsProvider.hasMultiScreenState;
          Channel? lastChannel;

          if (settingsProvider.rememberLastChannel &&
              settingsProvider.lastChannelId != null) {
            try {
              lastChannel = channelProvider.channels.firstWhere(
                (c) => c.id == settingsProvider.lastChannelId,
              );
            } catch (_) {
              //
              lastChannel = channelProvider.channels.isNotEmpty
                  ? channelProvider.channels.first
                  : null;
            }
          } else {
            lastChannel = channelProvider.channels.isNotEmpty
                ? channelProvider.channels.first
                : null;
          }

          //
          if (lastChannel != null || isMultiScreenMode) {
            ServiceLocator.log.d(
                'HomeScreen: Auto-play triggered - isMultiScreen=$isMultiScreenMode');
            _continuePlayback(channelProvider, lastChannel, isMultiScreenMode,
                settingsProvider);
          }
        });
      }
    }
  }

  void _refreshWatchHistory() async {
    if (!mounted) return;

    final playlistProvider = context.read<PlaylistProvider>();
    final activePlaylist = playlistProvider.activePlaylist;

    if (activePlaylist?.id == null) {
      if (_watchHistoryChannels.isNotEmpty) {
        throttledSetState(() {
          _watchHistoryChannels = [];
        });
      }
      return;
    }

    //
    ServiceLocator.watchHistory
        .getWatchHistory(activePlaylist!.id!, limit: 20)
        .then((history) {
      if (mounted) {
        throttledSetState(() {
          _watchHistoryChannels = history;
        });
      }
    }).catchError((e) {
      ServiceLocator.log.e(': $e', tag: 'HomeScreen');
      if (mounted) {
        throttledSetState(() {
          _watchHistoryChannels = [];
        });
      }
    });
  }

  List<_NavItem> _getNavItems(BuildContext context) {
    final strings = AppStrings.of(context);
    return [
      _NavItem(icon: Icons.home_rounded, label: strings?.home ?? 'Home'),
      _NavItem(
          icon: Icons.live_tv_rounded, label: strings?.channels ?? 'Channels'),
      _NavItem(
          icon: Icons.playlist_play_rounded,
          label: strings?.playlistList ?? 'Sources'),
      _NavItem(
          icon: Icons.favorite_rounded,
          label: strings?.favorites ?? 'Favorites'),
      _NavItem(
          icon: Icons.search_rounded,
          label: strings?.searchChannels ?? 'Search'),
      _NavItem(
          icon: Icons.settings_rounded, label: strings?.settings ?? 'Settings'),
    ];
  }

  void _onNavItemTap(int index) {
    if (index == _selectedNavIndex) return;

    //
    clearLogoLoadingQueue();

    immediateSetState(() => _selectedNavIndex = index); //

    // ✅
    if (index == 0) {
      _refreshWatchHistory();
    }
  }

  @override
  Widget build(BuildContext context) {
    final size = MediaQuery.of(context).size;
    final isTV = PlatformDetector.isTV || size.width > 1200;

    if (isTV) {
      return Scaffold(
        body: Container(
          decoration: BoxDecoration(
            gradient: LinearGradient(
              begin: Alignment.topLeft,
              end: Alignment.bottomRight,
              colors: Theme.of(context).brightness == Brightness.dark
                  ? [
                      AppTheme.getBackgroundColor(context),
                      AppTheme.getPrimaryColor(context).withOpacity(0.15),
                      AppTheme.getBackgroundColor(context),
                    ]
                  : [
                      AppTheme.getBackgroundColor(context),
                      AppTheme.getBackgroundColor(context).withOpacity(0.9),
                      AppTheme.getPrimaryColor(context).withOpacity(0.08),
                    ],
            ),
          ),
          child: TVSidebar(
            selectedIndex: 0,
            child: _buildMainContent(context),
          ),
        ),
      );
    }

    //
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
        //
        alignment: Alignment.topCenter,
        child: _buildMobileBody(),
      ),
      bottomNavigationBar: _buildBottomNav(context),
      //
      floatingActionButton:
          PlatformDetector.isMobile ? _buildOrientationFab() : null,
    );
  }

  ///
  Widget _buildOrientationFab() {
    return Consumer<SettingsProvider>(
      builder: (context, settings, _) {
        final orientation = settings.mobileOrientation;
        IconData icon;
        String tooltip;

        //
        switch (orientation) {
          case 'landscape':
            icon = Icons.screen_rotation_rounded;
            tooltip = '';
            break;
          case 'portrait':
          default:
            icon = Icons.stay_current_portrait_rounded;
            tooltip = '';
            break;
        }

        return FloatingActionButton(
          mini: true,
          backgroundColor: AppTheme.getSurfaceColor(context).withOpacity(0.9),
          onPressed: () => _toggleOrientation(settings),
          tooltip: tooltip,
          child: Icon(icon, color: AppTheme.getPrimaryColor(context), size: 20),
        );
      },
    );
  }

  ///
  Future<void> _toggleOrientation(SettingsProvider settings) async {
    String newOrientation;
    List<DeviceOrientation> orientations;
    String message;

    //
    if (settings.mobileOrientation == 'portrait') {
      newOrientation = 'landscape';
      orientations = [
        DeviceOrientation.landscapeLeft,
        DeviceOrientation.landscapeRight,
      ];
      message = '';
    } else {
      newOrientation = 'portrait';
      orientations = [
        DeviceOrientation.portraitUp,
      ];
      message = '';
    }

    await settings.setMobileOrientation(newOrientation);
    await SystemChrome.setPreferredOrientations(orientations);

    if (mounted) {
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(
          content: Text(message),
          duration: const Duration(seconds: 1),
        ),
      );
    }
  }

  Widget _buildMobileBody() {
    switch (_selectedNavIndex) {
      case 0:
        return _buildMainContent(context);
      case 1:
        return const _EmbeddedChannelsScreen();
      case 2:
        return const _EmbeddedPlaylistListScreen();
      case 3:
        return const _EmbeddedFavoritesScreen();
      case 4:
        return const _EmbeddedSearchScreen();
      case 5:
        return const _EmbeddedSettingsScreen();
      default:
        return _buildMainContent(context);
    }
  }

  Widget _buildBottomNav(BuildContext context) {
    final navItems = _getNavItems(context);
    return Container(
      decoration: BoxDecoration(
          color: AppTheme.getSurfaceColor(context),
          border: const Border(
              top: BorderSide(color: Color(0x1AFFFFFF), width: 1))),
      child: SafeArea(
        child: Padding(
          padding: const EdgeInsets.symmetric(vertical: 4),
          child: Row(
            mainAxisAlignment: MainAxisAlignment.spaceAround,
            children: List.generate(navItems.length, (index) {
              final item = navItems[index];
              final isSelected = _selectedNavIndex == index;
              return GestureDetector(
                onTap: () => _onNavItemTap(index),
                child: Container(
                  padding:
                      const EdgeInsets.symmetric(horizontal: 14, vertical: 6),
                  decoration: BoxDecoration(
                      gradient:
                          isSelected ? AppTheme.getGradient(context) : null,
                      borderRadius: BorderRadius.circular(AppTheme.radiusPill)),
                  child: Icon(item.icon,
                      color: isSelected
                          ? Colors.white
                          : AppTheme.getTextMuted(context),
                      size: 22),
                ),
              );
            }),
          ),
        ),
      ),
    );
  }

  Widget _buildMainContent(BuildContext context) {
    return Consumer3<PlaylistProvider, ChannelProvider, SettingsProvider>(
      builder:
          (context, playlistProvider, channelProvider, settingsProvider, _) {
        if (!playlistProvider.hasPlaylists) return _buildEmptyState();

        //
        if (playlistProvider.isLoading) {
          return _buildContentLoadingState(playlistProvider, channelProvider);
        }

        //
        if (playlistProvider.hasPlaylists &&
            channelProvider.totalContentChannelCount == 0) {
          // ✅
          if (!_hasTriggeredEmptyChannelLoad && !channelProvider.isLoading) {
            _hasTriggeredEmptyChannelLoad = true;
            //  addPostFrameCallback  build  setState
            WidgetsBinding.instance.addPostFrameCallback((_) {
              if (mounted && !channelProvider.isLoading) {
                ServiceLocator.log.d('HomeScreen: ');
                final activePlaylist = playlistProvider.activePlaylist;
                if (activePlaylist?.id != null) {
                  channelProvider.loadAllChannelsToCache(activePlaylist!.id!);
                }
              }
            });
          }

          // ✅
          if (channelProvider.isLoading && !_hasTriggeredEmptyChannelLoad) {
            return const Center(
                child: CircularProgressIndicator(color: AppTheme.primaryColor));
          }

          // ✅ UI
          return _buildEmptyChannelsState(playlistProvider);
        }

        // ✅
        if (channelProvider.isLoading) {
          if (channelProvider.totalContentChannelCount == 0) {
            return _buildContentLoadingState(playlistProvider, channelProvider);
          }
          return const Center(
              child: CircularProgressIndicator(color: AppTheme.primaryColor));
        }

        final favChannels = _getFavoriteChannels(channelProvider);
        final watchLaterChannels = _getWatchLaterChannels(channelProvider);
        final upNextMedia = _getUpNextMediaChannels(channelProvider);
        final movieChannels = channelProvider.vodChannels.take(12).toList();
        final seriesChannels = channelProvider.seriesChannels.take(12).toList();

        // ✅ 8
        final homeChannelsByGroup = channelProvider.getHomeChannelsByGroup(
            maxGroups: 8, channelsPerGroup: 12);
        final homeGroups = channelProvider.getHomeGroups(maxGroups: 8);

        return Column(
          mainAxisSize: MainAxisSize.max,
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            //
            _buildCompactHeader(channelProvider),
            //
            if (MediaQuery.of(context).size.width <= 700 ||
                !PlatformDetector.isMobile)
              _buildCategoryChips(channelProvider),
            SizedBox(
                height: PlatformDetector.isMobile &&
                        MediaQuery.of(context).size.width > 700
                    ? 0
                    : (PlatformDetector.isMobile ? 2 : 16)), // 0
            //
            Expanded(
              child: CustomScrollView(
                controller: _scrollController, //
                slivers: [
                  SliverPadding(
                    padding: EdgeInsets.symmetric(
                        horizontal: PlatformDetector.isMobile ? 12 : 24),
                    sliver: SliverList(
                      delegate: SliverChildListDelegate([
                        //
                        if (settingsProvider.showWatchHistoryOnHome &&
                            _watchHistoryChannels.isNotEmpty) ...[
                          _buildChannelRow(
                              AppStrings.of(context)?.watchHistory ??
                                  'Watch History',
                              _watchHistoryChannels,
                              isFirstRow: true), //
                          SizedBox(height: PlatformDetector.isMobile ? 8 : 12),
                        ],
                        //
                        if (settingsProvider.showFavoritesOnHome &&
                            favChannels.isNotEmpty) ...[
                          _buildChannelRow(
                              AppStrings.of(context)?.myFavorites ??
                                  'My Favorites',
                              favChannels,
                              showMore: true,
                              onMoreTap: () => Navigator.pushNamed(
                                  context, AppRouter.favorites),
                              isFirstRow:
                                  !settingsProvider.showWatchHistoryOnHome ||
                                      _watchHistoryChannels.isEmpty), //
                          SizedBox(height: PlatformDetector.isMobile ? 8 : 12),
                        ],
                        // Watch Later row
                        if (watchLaterChannels.isNotEmpty) ...[
                          _buildChannelRow(
                            'Watch Later',
                            watchLaterChannels,
                            showMore: false,
                            isFirstRow:
                                (!settingsProvider.showWatchHistoryOnHome ||
                                        _watchHistoryChannels.isEmpty) &&
                                    (!settingsProvider.showFavoritesOnHome ||
                                        favChannels.isEmpty),
                          ),
                          SizedBox(height: PlatformDetector.isMobile ? 8 : 12),
                        ],
                        // Up Next (movies/series recommendations)
                        if (upNextMedia.isNotEmpty) ...[
                          _buildChannelRow(
                            AppStrings.of(context)?.upNext ?? 'Up Next',
                            upNextMedia,
                            showMore: false,
                            isFirstRow:
                                (!settingsProvider.showWatchHistoryOnHome ||
                                        _watchHistoryChannels.isEmpty) &&
                                    (!settingsProvider.showFavoritesOnHome ||
                                        favChannels.isEmpty) &&
                                    watchLaterChannels.isEmpty,
                          ),
                          SizedBox(height: PlatformDetector.isMobile ? 8 : 12),
                        ],
                        // Movies row
                        if (movieChannels.isNotEmpty) ...[
                          _buildChannelRow(
                            AppStrings.of(context)?.movies ?? 'Movies',
                            movieChannels,
                            showMore: true,
                            onMoreTap: () =>
                                Navigator.pushNamed(context, AppRouter.movies),
                            isFirstRow:
                                (!settingsProvider.showWatchHistoryOnHome ||
                                        _watchHistoryChannels.isEmpty) &&
                                    (!settingsProvider.showFavoritesOnHome ||
                                        favChannels.isEmpty) &&
                                    watchLaterChannels.isEmpty &&
                                    upNextMedia.isEmpty,
                          ),
                          SizedBox(height: PlatformDetector.isMobile ? 8 : 12),
                        ],
                        // Series row
                        if (seriesChannels.isNotEmpty) ...[
                          _buildChannelRow(
                            AppStrings.of(context)?.series ?? 'Series',
                            seriesChannels,
                            showMore: true,
                            onMoreTap: () =>
                                Navigator.pushNamed(context, AppRouter.series),
                            isFirstRow:
                                (!settingsProvider.showWatchHistoryOnHome ||
                                        _watchHistoryChannels.isEmpty) &&
                                    (!settingsProvider.showFavoritesOnHome ||
                                        favChannels.isEmpty) &&
                                    watchLaterChannels.isEmpty &&
                                    upNextMedia.isEmpty &&
                                    movieChannels.isEmpty,
                          ),
                          SizedBox(height: PlatformDetector.isMobile ? 8 : 12),
                        ],
                        // ✅
                        ...homeGroups.asMap().entries.map((entry) {
                          final index = entry.key;
                          final group = entry.value;
                          // ✅
                          final channels =
                              homeChannelsByGroup[group.name] ?? [];

                          // ✅
                          if (channels.isEmpty) {
                            return const SizedBox.shrink();
                          }

                          //
                          final isFirst = index == 0 &&
                              (!settingsProvider.showWatchHistoryOnHome ||
                                  _watchHistoryChannels.isEmpty) &&
                              (!settingsProvider.showFavoritesOnHome ||
                                  favChannels.isEmpty);
                          return Padding(
                            padding: EdgeInsets.only(
                                bottom: PlatformDetector.isMobile ? 8 : 12),
                            child: _buildChannelRow(
                              group.name,
                              channels,
                              showMore: true,
                              onMoreTap: () => Navigator.pushNamed(
                                  context, AppRouter.channels,
                                  arguments: {'groupName': group.name}),
                              isFirstRow: isFirst,
                            ),
                          );
                        }),
                      ]),
                    ),
                  ),
                ],
              ),
            ),
          ],
        );
      },
    );
  }

  Widget _buildCompactHeader(ChannelProvider provider) {
    //  -  watch
    final settingsProvider = context.watch<SettingsProvider>();
    final playlistProvider = context.watch<PlaylistProvider>();
    final activePlaylist = playlistProvider.activePlaylist;
    Channel? lastChannel;
    final bool isMultiScreenMode = settingsProvider.lastPlayMode == 'multi' &&
        settingsProvider.hasMultiScreenState;

    // ServiceLocator.log.d(
    //     'HomeScreen: lastPlayMode=${settingsProvider.lastPlayMode}, hasMultiScreenState=${settingsProvider.hasMultiScreenState}, isMultiScreenMode=$isMultiScreenMode');
    // ServiceLocator.log.d(
    //     'HomeScreen: lastMultiScreenChannels=${settingsProvider.lastMultiScreenChannels}');

    if (settingsProvider.rememberLastChannel &&
        settingsProvider.lastChannelId != null) {
      try {
        lastChannel = provider.channels.firstWhere(
          (c) => c.id == settingsProvider.lastChannelId,
        );
      } catch (_) {
        //
        lastChannel =
            provider.channels.isNotEmpty ? provider.channels.first : null;
      }
    } else {
      lastChannel =
          provider.channels.isNotEmpty ? provider.channels.first : null;
    }

    //
    String playlistInfo = '';
    if (activePlaylist != null) {
      final type = activePlaylist.isRemote ? 'URL' : '';
      playlistInfo = ' · [$type] ${activePlaylist.name}';
      if (activePlaylist.url != null && activePlaylist.url!.isNotEmpty) {
        String url =
            activePlaylist.url!.replaceFirst(RegExp(r'^https?://'), '');
        if (url.length > 30) {
          url = '${url.substring(0, 30)}...';
        }
        playlistInfo += ' · $url';
      }
    }

    //  -  "Continue"
    final continueLabel =
        AppStrings.of(context)?.continueWatching ?? 'Continue';
    final isMobile = PlatformDetector.isMobile;
    final screenWidth = MediaQuery.of(context).size.width;
    final isLandscape = isMobile && screenWidth > 700; //

    //
    final statusBarHeight = isMobile ? MediaQuery.of(context).padding.top : 0.0;
    final topPadding = isMobile
        ? (statusBarHeight > 0 ? statusBarHeight - 10.0 : 0.0)
        : 16.0; //  + 4px

    return Container(
      // paddingSafeArea
      padding: EdgeInsets.fromLTRB(
          isMobile ? 12 : 24,
          topPadding, //
          isMobile ? 12 : 24,
          isMobile ? 2 : 12),
      child: Row(
        children: [
          Expanded(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                ShaderMask(
                  shaderCallback: (bounds) =>
                      AppTheme.getGradient(context).createShader(bounds),
                  child: Row(
                    mainAxisSize: MainAxisSize.min,
                    crossAxisAlignment: CrossAxisAlignment.baseline,
                    textBaseline: TextBaseline.alphabetic,
                    children: [
                      Text('VoXtv',
                          style: TextStyle(
                              fontSize: isLandscape ? 16 : (isMobile ? 18 : 28),
                              fontWeight: FontWeight.bold,
                              color: Colors.white)), // 1618
                      const SizedBox(width: 8),
                      Text('v$_appVersion',
                          style: TextStyle(
                              fontSize: isLandscape ? 10 : (isMobile ? 11 : 11),
                              fontWeight: FontWeight.normal,
                              color: Colors.white70)), // 121314
                      if (_availableUpdate != null) ...[
                        const SizedBox(width: 8),
                        TVFocusable(
                          onSelect: () => Navigator.pushNamed(
                              context, AppRouter.settings,
                              arguments: {'autoCheckUpdate': true}),
                          focusScale: 1.0,
                          showFocusBorder: false,
                          builder: (context, isFocused, child) {
                            return Container(
                              padding: const EdgeInsets.symmetric(
                                  horizontal: 6, vertical: 2),
                              decoration: BoxDecoration(
                                gradient: isFocused
                                    ? AppTheme.getGradient(context)
                                    : LinearGradient(
                                        colors: [
                                          Colors.orange.shade600,
                                          Colors.deepOrange.shade600
                                        ],
                                      ),
                                borderRadius:
                                    BorderRadius.circular(AppTheme.radiusPill),
                                border: isFocused
                                    ? Border.all(
                                        color:
                                            AppTheme.getPrimaryColor(context),
                                        width: 2)
                                    : null,
                              ),
                              child: child,
                            );
                          },
                          child: Row(
                            mainAxisSize: MainAxisSize.min,
                            children: [
                              const Icon(Icons.system_update_rounded,
                                  size: 10, color: Colors.white),
                              const SizedBox(width: 3),
                              Text('v${_availableUpdate!.version}',
                                  style: const TextStyle(
                                      fontSize: 10,
                                      color: Colors.white,
                                      fontWeight: FontWeight.w600)),
                            ],
                          ),
                        ),
                      ],
                    ],
                  ),
                ),
                //
                if (!isMobile || MediaQuery.of(context).size.width <= 700) ...[
                  SizedBox(height: isMobile ? 2 : 4),
                  Text(
                    '${provider.totalContentChannelCount} ${AppStrings.of(context)?.channels ?? ""} · ${provider.groups.length} ${AppStrings.of(context)?.categories ?? ""} · ${context.watch<FavoritesProvider>().count} ${AppStrings.of(context)?.favorites ?? ""}$playlistInfo',
                    style: TextStyle(
                        color: AppTheme.getTextMuted(context), fontSize: 13),
                    maxLines: 1,
                    overflow: TextOverflow.ellipsis,
                  ),
                ],
              ],
            ),
          ),
          Row(
            children: [
              _buildHeaderButton(
                  Icons.play_arrow_rounded,
                  continueLabel,
                  true,
                  (lastChannel != null || isMultiScreenMode)
                      ? () => _continuePlayback(provider, lastChannel,
                          isMultiScreenMode, settingsProvider)
                      : null,
                  focusNode: _continueButtonFocusNode), //
              SizedBox(width: isMobile ? 6 : 10),
              _buildHeaderButton(
                  Icons.playlist_add_rounded,
                  AppStrings.of(context)?.playlists ?? 'Playlists',
                  false,
                  () => _showAddPlaylistDialog()),
              SizedBox(width: isMobile ? 6 : 10),
              _buildHeaderButton(
                  Icons.refresh_rounded,
                  AppStrings.of(context)?.refresh ?? 'Refresh',
                  false,
                  activePlaylist != null
                      ? () =>
                          _refreshCurrentPlaylist(playlistProvider, provider)
                      : null),
              SizedBox(width: isMobile ? 6 : 10),
              _buildThemeToggleButton(),
            ],
          ),
        ],
      ),
    );
  }

  ///  -
  void _continuePlayback(ChannelProvider provider, Channel? lastChannel,
      bool isMultiScreenMode, SettingsProvider settingsProvider) {
    ServiceLocator.log
        .i(' - : ${isMultiScreenMode ? "" : ""}', tag: 'HomeScreen');

    if (isMultiScreenMode) {
      //
      _resumeMultiScreen(provider, settingsProvider);
    } else if (lastChannel != null) {
      //
      ServiceLocator.log.d(': ${lastChannel.name}', tag: 'HomeScreen');
      _playChannel(lastChannel);
    }
  }

  ///
  Future<void> _showAddPlaylistDialog() async {
    final result = PlatformDetector.isMobile
        ? await showModalBottomSheet<bool>(
            context: context,
            isScrollControlled: true,
            backgroundColor: Colors.transparent,
            builder: (context) => const AddPlaylistDialog(),
          )
        : await showDialog<bool>(
            context: context,
            barrierDismissible: false,
            builder: (context) => const AddPlaylistDialog(),
          );

    //
    if (result == true && mounted) {
      _hasTriggeredEmptyChannelLoad = false; // ✅
      _loadData();
    }
  }

  ///
  Future<void> _refreshCurrentPlaylist(PlaylistProvider playlistProvider,
      ChannelProvider channelProvider) async {
    ServiceLocator.log.i('', tag: 'HomeScreen');

    final activePlaylist = playlistProvider.activePlaylist;
    if (activePlaylist == null) {
      ServiceLocator.log.w('', tag: 'HomeScreen');
      return;
    }

    if (!mounted) return;

    // Use unified refresh method with callback (silent mode for background refresh)
    await playlistProvider.refreshPlaylistWithCallback(
      playlist: activePlaylist,
      context: context,
      silent: true,
      onComplete: (success, error) async {
        if (!mounted) return;

        if (success) {
          // Reload channels
          if (activePlaylist.id != null) {
            await channelProvider.loadChannels(activePlaylist.id!);

            // Clear logo cache
            clearAllLogoCache();

            // Refresh watch history
            _refreshWatchHistory();

            // Reload EPG
            final epgProvider = context.read<EpgProvider>();
            final settingsProvider = context.read<SettingsProvider>();

            await playlistProvider.loadPlaylists();
            final updatedPlaylist = playlistProvider.activePlaylist;

            if (updatedPlaylist?.epgUrl != null) {
              ServiceLocator.log.d(
                  'HomeScreen:  EPG URL : ${updatedPlaylist!.epgUrl}',
                  tag: 'HomeScreen');
              // Background loading - don't block UI
              await epgProvider.loadEpg(
                updatedPlaylist.epgUrl!,
                fallbackUrl: settingsProvider.epgUrl,
                silent: true,
              );
            } else if (settingsProvider.epgUrl != null) {
              ServiceLocator.log.d(
                  'HomeScreen:  EPG URL : ${settingsProvider.epgUrl}',
                  tag: 'HomeScreen');
              // Background loading - don't block UI
              await epgProvider.loadEpg(settingsProvider.epgUrl!, silent: true);
            }
          }
        }
      },
    );
  }

  ///
  Future<void> _resumeMultiScreen(
      ChannelProvider provider, SettingsProvider settingsProvider) async {
    ServiceLocator.log.i('', tag: 'HomeScreen');

    final channels = provider.channels;
    final multiScreenChannelIds = settingsProvider.lastMultiScreenChannels;
    final multiScreenSourceIndexes =
        settingsProvider.lastMultiScreenSourceIndexes;
    final activeIndex = settingsProvider.activeScreenIndex;

    ServiceLocator.log.d('ID: $multiScreenChannelIds', tag: 'HomeScreen');
    ServiceLocator.log.d(': $activeIndex', tag: 'HomeScreen');

    //  providers
    final favoritesProvider = context.read<FavoritesProvider>();
    NativePlayerChannel.setProviders(
        favoritesProvider, provider, settingsProvider);

    // ID
    final List<int?> restoreScreenChannels = [];
    int initialChannelIndex = 0;
    bool foundFirst = false;

    for (int i = 0; i < multiScreenChannelIds.length; i++) {
      final channelId = multiScreenChannelIds[i];
      if (channelId != null) {
        final index = channels.indexWhere((c) => c.id == channelId);
        if (index >= 0) {
          restoreScreenChannels.add(index);
          if (!foundFirst) {
            initialChannelIndex = index;
            foundFirst = true;
          }
        } else {
          restoreScreenChannels.add(null);
        }
      } else {
        restoreScreenChannels.add(null);
      }
    }

    ServiceLocator.log.d(': $restoreScreenChannels', tag: 'HomeScreen');

    //  Android TV
    if (PlatformDetector.isAndroid) {
      ServiceLocator.log.d(' Android TV ', tag: 'HomeScreen');
      final urls = channels.map((c) => c.url).toList();
      final names = channels.map((c) => c.name).toList();
      final groups = channels.map((c) => c.groupName ?? '').toList();
      final sources = channels.map((c) => c.sources).toList();
      final logos = channels.map((c) => c.logoUrl ?? '').toList();

      await NativePlayerChannel.launchMultiScreen(
        urls: urls,
        names: names,
        groups: groups,
        sources: sources,
        logos: logos,
        initialChannelIndex: initialChannelIndex,
        volumeBoostDb: settingsProvider.volumeBoost,
        defaultScreenPosition: settingsProvider.defaultScreenPosition,
        restoreActiveIndex: activeIndex,
        restoreScreenChannels: restoreScreenChannels,
        showChannelName: settingsProvider.showMultiScreenChannelName,
        onClosed: () {
          ServiceLocator.log.i('', tag: 'HomeScreen');
          // TV
          _refreshWatchHistory();
        },
      );
      ServiceLocator.log.i('', tag: 'HomeScreen');
    } else {
      // Windows/ Flutter
      ServiceLocator.log.d(' Flutter ', tag: 'HomeScreen');
      if (!mounted) return;

      //  MultiScreenProvider
      final multiScreenProvider = context.read<MultiScreenProvider>();

      //
      multiScreenProvider.setVolumeSettings(1.0, settingsProvider.volumeBoost);

      //
      multiScreenProvider.setActiveScreen(activeIndex);

      //
      final futures = <Future>[];
      for (int i = 0; i < multiScreenChannelIds.length && i < 4; i++) {
        final channelId = multiScreenChannelIds[i];
        if (channelId != null) {
          final channel = channels.firstWhere(
            (c) => c.id == channelId,
            orElse: () => channels.first,
          );
          final sourceIndex = (i < multiScreenSourceIndexes.length
                  ? multiScreenSourceIndexes[i]
                  : 0)
              .clamp(0, channel.sourceCount - 1);
          final restoredChannel =
              channel.copyWith(currentSourceIndex: sourceIndex);
          //
          futures
              .add(multiScreenProvider.playChannelOnScreen(i, restoredChannel));
        }
      }

      //
      await Future.wait(futures);

      ServiceLocator.log.d('', tag: 'HomeScreen');

      //
      await Future.delayed(const Duration(milliseconds: 500));

      //
      await multiScreenProvider.reapplyVolumeToAllScreens();

      ServiceLocator.log.i('Flutter ', tag: 'HomeScreen');

      //
      Channel? initialChannel;
      if (initialChannelIndex >= 0 && initialChannelIndex < channels.length) {
        initialChannel = channels[initialChannelIndex];
      } else if (channels.isNotEmpty) {
        initialChannel = channels.first;
      }

      if (initialChannel != null && mounted) {
        Navigator.pushNamed(
          context,
          AppRouter.player,
          arguments: {
            'channelUrl': initialChannel.url,
            'channelName': initialChannel.name,
            'isMultiScreen': true,
          },
        );
      }
    }
  }

  Widget _buildHeaderButton(
      IconData icon, String label, bool isPrimary, VoidCallback? onTap,
      {FocusNode? focusNode}) {
    final isMobile = PlatformDetector.isMobile;
    return TVFocusable(
      focusNode: focusNode, // focusNode
      onSelect: onTap,
      focusScale: 1.0,
      showFocusBorder: false,
      builder: (context, isFocused, child) {
        return Container(
          padding: EdgeInsets.symmetric(
              horizontal: isMobile ? 8 : 14, vertical: isMobile ? 6 : 8),
          decoration: BoxDecoration(
            gradient:
                isPrimary || isFocused ? AppTheme.getGradient(context) : null,
            color:
                isPrimary || isFocused ? null : AppTheme.getGlassColor(context),
            borderRadius: BorderRadius.circular(AppTheme.radiusPill),
            border: Border.all(
                color: isFocused
                    ? AppTheme.getPrimaryColor(context)
                    : AppTheme.getGlassBorderColor(context),
                width: isFocused ? 2 : 1),
          ),
          child: child,
        );
      },
      child: Builder(
        builder: (context) {
          final isDark = Theme.of(context).brightness == Brightness.dark;
          final textColor = isPrimary
              ? Colors.white
              : (isDark ? Colors.white : AppTheme.textPrimaryLight);
          //
          if (isMobile) {
            return Icon(icon, color: textColor, size: 16);
          }
          return Row(
            mainAxisSize: MainAxisSize.min,
            children: [
              Icon(icon, color: textColor, size: 16),
              const SizedBox(width: 6),
              Text(label,
                  style: TextStyle(
                      color: textColor,
                      fontSize: 12,
                      fontWeight: FontWeight.w500)),
            ],
          );
        },
      ),
    );
  }

  Widget _buildThemeToggleButton() {
    final settingsProvider = context.watch<SettingsProvider>();
    final isDarkMode = settingsProvider.themeMode == 'dark';
    final isMobile = PlatformDetector.isMobile;

    return TVFocusable(
      onSelect: () {
        // /
        settingsProvider.setThemeMode(isDarkMode ? 'light' : 'dark');
      },
      focusScale: 1.0,
      showFocusBorder: false,
      builder: (context, isFocused, child) {
        return Container(
          padding: EdgeInsets.symmetric(
              horizontal: isMobile ? 8 : 14, vertical: isMobile ? 6 : 8),
          decoration: BoxDecoration(
            color: isFocused
                ? AppTheme.getGlassColor(context)
                : AppTheme.getGlassColor(context).withOpacity(0.5),
            borderRadius: BorderRadius.circular(AppTheme.radiusPill),
            border: Border.all(
                color: isFocused
                    ? AppTheme.getPrimaryColor(context)
                    : AppTheme.getGlassBorderColor(context),
                width: isFocused ? 2 : 1),
          ),
          child: child,
        );
      },
      child: Builder(
        builder: (context) {
          final themeIsDark = Theme.of(context).brightness == Brightness.dark;
          final textColor =
              themeIsDark ? Colors.white : AppTheme.textPrimaryLight;

          //
          if (isMobile) {
            return Icon(
                isDarkMode ? Icons.light_mode_rounded : Icons.dark_mode_rounded,
                color: textColor,
                size: 16);
          }

          return Row(
            mainAxisSize: MainAxisSize.min,
            children: [
              Icon(
                  isDarkMode
                      ? Icons.light_mode_rounded
                      : Icons.dark_mode_rounded,
                  color: textColor,
                  size: 16),
              const SizedBox(width: 6),
              Text(
                  isDarkMode
                      ? (AppStrings.of(context)?.themeLight ?? '')
                      : (AppStrings.of(context)?.themeDark ?? ''),
                  style: TextStyle(
                      color: textColor,
                      fontSize: 12,
                      fontWeight: FontWeight.w500)),
            ],
          );
        },
      ),
    );
  }

  Widget _buildCategoryChips(ChannelProvider provider) {
    return _ResponsiveCategoryChips(
      groups: provider.getHomeGroups(maxGroups: 8), // ✅
      onGroupTap: (groupName) => Navigator.pushNamed(
          context, AppRouter.channels,
          arguments: {'groupName': groupName}),
    );
  }

  Widget _buildChannelRow(String title, List<Channel> channels,
      {bool showMore = false,
      VoidCallback? onMoreTap,
      bool isFirstRow = false}) {
    // isFirstRow
    if (channels.isEmpty) return const SizedBox.shrink();
    final isMobile = PlatformDetector.isMobile;

    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Row(
          children: [
            Text(title,
                style: TextStyle(
                    color: AppTheme.getTextPrimary(context),
                    fontSize: isMobile ? 14 : 16,
                    fontWeight: FontWeight.w600)),
            const Spacer(),
            if (showMore)
              TVFocusable(
                onSelect: onMoreTap,
                focusScale: 1.0,
                showFocusBorder: false,
                builder: (context, isFocused, child) {
                  return Container(
                    padding: EdgeInsets.symmetric(
                        horizontal: isMobile ? 8 : 10,
                        vertical: isMobile ? 4 : 5),
                    decoration: BoxDecoration(
                      gradient:
                          isFocused ? AppTheme.getGradient(context) : null,
                      borderRadius: BorderRadius.circular(AppTheme.radiusPill),
                    ),
                    child: child,
                  );
                },
                child: Row(
                  mainAxisSize: MainAxisSize.min,
                  children: [
                    Text(AppStrings.of(context)?.more ?? 'More',
                        style: TextStyle(
                            color: AppTheme.getTextMuted(context),
                            fontSize: isMobile ? 10 : 12)),
                    const SizedBox(width: 2),
                    Icon(Icons.chevron_right_rounded,
                        color: AppTheme.getTextMuted(context),
                        size: isMobile ? 14 : 16),
                  ],
                ),
              ),
          ],
        ),
        SizedBox(height: isMobile ? 6 : 8),
        LayoutBuilder(
          builder: (context, constraints) {
            //
            if (channels.isEmpty) {
              return const SizedBox.shrink();
            }

            final availableWidth = constraints.maxWidth;
            //
            final cardsPerRow =
                CardSizeCalculator.calculateHomeCardsPerRow(availableWidth);
            final cardSpacing = CardSizeCalculator.spacing;
            final totalSpacing = (cardsPerRow - 1) * cardSpacing;
            final cardWidth = (availableWidth - totalSpacing) / cardsPerRow;
            final cardHeight = cardWidth / CardSizeCalculator.aspectRatio();

            //
            final displayCount = cardsPerRow.clamp(1, channels.length);

            return SizedBox(
              height: cardHeight,
              child: Row(
                children: List.generate(displayCount, (index) {
                  final channel = channels[index];

                  return Padding(
                    padding: EdgeInsets.only(
                        right: index < displayCount - 1 ? cardSpacing : 0),
                    child: SizedBox(
                      width: cardWidth,
                      child: _OptimizedChannelCard(
                        channel: channel,
                        onTap: () => _playChannel(channel),
                        onUp: isFirstRow && PlatformDetector.isTV
                            ? () {
                                // TV""
                                if (_scrollController.hasClients &&
                                    _scrollController.offset > 0) {
                                  //
                                  _scrollController.animateTo(
                                    0,
                                    duration: const Duration(milliseconds: 300),
                                    curve: Curves.easeOut,
                                  );
                                }
                                // ""
                                _continueButtonFocusNode.requestFocus();
                              }
                            : null,
                      ),
                    ),
                  );
                }),
              ),
            );
          },
        ),
      ],
    );
  }

  Future<void> _playChannel(Channel channel) async {
    ServiceLocator.log
        .i(': ${channel.name} (ID: ${channel.id})', tag: 'HomeScreen');
    // final startTime = DateTime.now();

    // ID
    final settingsProvider = context.read<SettingsProvider>();
    final channelProvider = context.read<ChannelProvider>();
    final favoritesProvider = context.read<FavoritesProvider>();

    //  providers
    NativePlayerChannel.setProviders(
        favoritesProvider, channelProvider, settingsProvider);

    if (settingsProvider.rememberLastChannel && channel.id != null) {
      //
      settingsProvider.saveLastSingleChannel(channel.id);
    }

    //
    if (settingsProvider.enableMultiScreen) {
      // TV
      if (PlatformDetector.isTV && PlatformDetector.isAndroid) {
        // ✅
        final channels = channelProvider.allChannels;

        //
        final clickedIndex = channels.indexWhere((c) => c.url == channel.url);

        // TV
        if (channel.id != null && channel.playlistId != null) {
          await ServiceLocator.watchHistory
              .addWatchHistory(channel.id!, channel.playlistId!);
          ServiceLocator.log.d(
              'HomeScreen: Recorded watch history for channel ${channel.name} (TV multi-screen)');
        }

        //
        final urls = channels.map((c) => c.url).toList();
        final names = channels.map((c) => c.name).toList();
        final groups = channels.map((c) => c.groupName ?? '').toList();
        final sources = channels.map((c) => c.sources).toList();
        final logos = channels.map((c) => c.logoUrl ?? '').toList();

        //
        await NativePlayerChannel.launchMultiScreen(
          urls: urls,
          names: names,
          groups: groups,
          sources: sources,
          logos: logos,
          initialChannelIndex: clickedIndex >= 0 ? clickedIndex : 0,
          volumeBoostDb: settingsProvider.volumeBoost,
          defaultScreenPosition: settingsProvider.defaultScreenPosition,
          showChannelName: settingsProvider.showMultiScreenChannelName,
          onClosed: () {
            ServiceLocator.log.d(
                'HomeScreen: Native multi-screen closed, refreshing watch history');
            // TV
            _refreshWatchHistory();
          },
        );
      } else if (PlatformDetector.isDesktop) {
        //
        final multiScreenProvider = context.read<MultiScreenProvider>();
        final defaultPosition = settingsProvider.defaultScreenPosition;
        // Provider
        multiScreenProvider.setVolumeSettings(
            1.0, settingsProvider.volumeBoost);
        multiScreenProvider.playChannelAtDefaultPosition(
            channel, defaultPosition);

        // MultiScreenProvider
        Navigator.pushNamed(context, AppRouter.player, arguments: {
          'channelUrl': '', // URL
          'channelName': '',
          'channelLogo': null,
        });
      } else {
        //
        context.read<PlayerProvider>().playChannel(channel);
        Navigator.pushNamed(context, AppRouter.player, arguments: {
          'channelUrl': channel.url,
          'channelName': channel.name,
          'channelLogo': channel.logoUrl,
        });
      }
    } else {
      // PlayerProvider.playChannel()
      // PlayerScreen
      Navigator.pushNamed(context, AppRouter.player, arguments: {
        'channelUrl': channel.url,
        'channelName': channel.name,
        'channelLogo': channel.logoUrl,
      });
    }
  }

  List<Channel> _getFavoriteChannels(ChannelProvider provider) {
    final favProvider = context.read<FavoritesProvider>();
    final all = <Channel>[
      ...provider.allChannels,
      ...provider.vodChannels,
      ...provider.seriesChannels,
    ];
    return all
        .where((c) => favProvider.isFavorite(c.id ?? 0))
        .take(20)
        .toList();
  }

  List<Channel> _getUpNextMediaChannels(ChannelProvider provider) {
    final source = <Channel>[
      ...provider.vodChannels,
      ...provider.seriesChannels,
    ];

    if (source.isEmpty) return const [];

    final historyIds =
        _watchHistoryChannels.map((c) => c.id).whereType<int>().toSet();

    final unseen = source
        .where((c) => c.id == null || !historyIds.contains(c.id))
        .toList();
    final prioritized = unseen.isNotEmpty ? unseen : source;
    return prioritized.take(12).toList();
  }

  List<Channel> _getWatchLaterChannels(ChannelProvider provider) {
    final ids = ServiceLocator.watchLater.getIds().toSet();
    if (ids.isEmpty) return const [];

    final all = <Channel>[
      ...provider.allChannels,
      ...provider.vodChannels,
      ...provider.seriesChannels,
    ];

    return all
        .where((c) => c.id != null && ids.contains(c.id))
        .take(20)
        .toList();
  }

  Widget _buildEmptyState() {
    return Center(
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Container(
            width: 100,
            height: 100,
            decoration: BoxDecoration(
                gradient: AppTheme.getGradient(context),
                borderRadius: BorderRadius.circular(24)),
            child: const Icon(Icons.playlist_add_rounded,
                size: 48, color: Colors.white),
          ),
          const SizedBox(height: 20),
          Text(AppStrings.of(context)?.noPlaylistYet ?? 'No Playlists Yet',
              style: TextStyle(
                  color: AppTheme.getTextPrimary(context),
                  fontSize: 20,
                  fontWeight: FontWeight.bold)),
          const SizedBox(height: 8),
          Text(
              AppStrings.of(context)?.addM3uToStart ??
                  'Add M3U playlist to start watching',
              style: TextStyle(
                  color: AppTheme.getTextSecondary(context), fontSize: 13)),
          const SizedBox(height: 24),
          TVFocusable(
            autofocus: false,
            onSelect: () => _showAddPlaylistDialog(),
            focusScale: 1.0,
            showFocusBorder: false,
            builder: (context, isFocused, child) {
              return Container(
                padding:
                    const EdgeInsets.symmetric(horizontal: 24, vertical: 12),
                decoration: BoxDecoration(
                  gradient: AppTheme.getGradient(context),
                  borderRadius: BorderRadius.circular(AppTheme.radiusPill),
                  border: isFocused
                      ? Border.all(
                          color: AppTheme.getPrimaryColor(context), width: 2)
                      : null,
                ),
                child: child,
              );
            },
            child: Row(
              mainAxisSize: MainAxisSize.min,
              children: [
                const Icon(Icons.add_rounded, size: 18, color: Colors.white),
                const SizedBox(width: 8),
                Text(
                  AppStrings.of(context)?.addPlaylist ?? 'Add Playlist',
                  style: const TextStyle(
                      color: Colors.white,
                      fontSize: 14,
                      fontWeight: FontWeight.w500),
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }

  Widget _buildContentLoadingState(
      PlaylistProvider playlistProvider, ChannelProvider channelProvider) {
    final liveCount = channelProvider.allChannels.length;
    final moviesCount = channelProvider.vodChannels.length;
    final seriesCount = channelProvider.seriesChannels.length;
    final progress = playlistProvider.importProgress.clamp(0.0, 1.0);

    return Center(
      child: ConstrainedBox(
        constraints: const BoxConstraints(maxWidth: 980),
        child: Padding(
          padding: const EdgeInsets.symmetric(horizontal: 20, vertical: 16),
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Text(
                'Sincronizando contenido',
                style: TextStyle(
                  color: AppTheme.getTextPrimary(context),
                  fontSize: 24,
                  fontWeight: FontWeight.bold,
                ),
              ),
              const SizedBox(height: 8),
              Text(
                'Descargando LIVE, MOVIES y SERIES…',
                style: TextStyle(
                  color: AppTheme.getTextSecondary(context),
                  fontSize: 14,
                ),
              ),
              const SizedBox(height: 20),
              ClipRRect(
                borderRadius: BorderRadius.circular(8),
                child: LinearProgressIndicator(
                  value: progress > 0 ? progress : null,
                  minHeight: 8,
                  backgroundColor: AppTheme.getCardColor(context),
                  valueColor: AlwaysStoppedAnimation<Color>(
                    AppTheme.getPrimaryColor(context),
                  ),
                ),
              ),
              const SizedBox(height: 8),
              Text(
                '${(progress * 100).toStringAsFixed(0)}%',
                style: TextStyle(
                  color: AppTheme.getTextMuted(context),
                  fontSize: 12,
                ),
              ),
              const SizedBox(height: 22),
              Wrap(
                spacing: 12,
                runSpacing: 12,
                children: [
                  _buildSyncCard(
                    title: 'LIVE TV',
                    count: liveCount,
                    icon: Icons.live_tv_rounded,
                    accent: const Color(0xFF2EA7FF),
                    isLoading: playlistProvider.isLoading && liveCount == 0,
                  ),
                  _buildSyncCard(
                    title: 'MOVIES',
                    count: moviesCount,
                    icon: Icons.movie_rounded,
                    accent: const Color(0xFFE9546B),
                    isLoading: playlistProvider.isLoading && moviesCount == 0,
                  ),
                  _buildSyncCard(
                    title: 'SERIES',
                    count: seriesCount,
                    icon: Icons.video_library_rounded,
                    accent: const Color(0xFF5B87F7),
                    isLoading: playlistProvider.isLoading && seriesCount == 0,
                  ),
                ],
              ),
            ],
          ),
        ),
      ),
    );
  }

  Widget _buildSyncCard({
    required String title,
    required int count,
    required IconData icon,
    required Color accent,
    required bool isLoading,
  }) {
    return Container(
      width: 290,
      height: 160,
      padding: const EdgeInsets.all(16),
      decoration: BoxDecoration(
        gradient: LinearGradient(
          begin: Alignment.topLeft,
          end: Alignment.bottomRight,
          colors: [
            accent.withOpacity(0.28),
            accent.withOpacity(0.12),
            AppTheme.getCardColor(context).withOpacity(0.85),
          ],
        ),
        borderRadius: BorderRadius.circular(14),
        border: Border.all(
          color: AppTheme.getGlassBorderColor(context),
          width: 1,
        ),
      ),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Row(
            children: [
              Icon(icon, color: Colors.white, size: 24),
              const SizedBox(width: 8),
              Expanded(
                child: Text(
                  title,
                  style: const TextStyle(
                    color: Colors.white,
                    fontSize: 16,
                    fontWeight: FontWeight.bold,
                  ),
                ),
              ),
              if (isLoading)
                const SizedBox(
                  width: 16,
                  height: 16,
                  child: CircularProgressIndicator(
                    strokeWidth: 2,
                    valueColor: AlwaysStoppedAnimation<Color>(Colors.white),
                  ),
                )
              else
                const Icon(Icons.check_circle_rounded,
                    color: Colors.white, size: 18),
            ],
          ),
          const Spacer(),
          Text(
            isLoading ? 'Downloading…' : 'Loaded',
            style: const TextStyle(
              color: Color(0xCCFFFFFF),
              fontSize: 13,
              fontWeight: FontWeight.w500,
            ),
          ),
          const SizedBox(height: 4),
          Text(
            '$count items',
            style: const TextStyle(
              color: Colors.white,
              fontSize: 22,
              fontWeight: FontWeight.bold,
            ),
          ),
        ],
      ),
    );
  }

  Widget _buildEmptyChannelsState(PlaylistProvider playlistProvider) {
    final activePlaylist = playlistProvider.activePlaylist;
    return Center(
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Container(
            width: 100,
            height: 100,
            decoration: BoxDecoration(
                gradient: AppTheme.getGradient(context),
                borderRadius: BorderRadius.circular(24)),
            child:
                const Icon(Icons.tv_off_rounded, size: 48, color: Colors.white),
          ),
          const SizedBox(height: 20),
          Text('No Channels',
              style: TextStyle(
                  color: AppTheme.getTextPrimary(context),
                  fontSize: 20,
                  fontWeight: FontWeight.bold)),
          const SizedBox(height: 8),
          Text(
              'The playlist "${activePlaylist?.name ?? 'Unknown'}" has no channels',
              style: TextStyle(
                  color: AppTheme.getTextSecondary(context), fontSize: 13),
              textAlign: TextAlign.center),
          const SizedBox(height: 24),
          Wrap(
            spacing: 12,
            runSpacing: 12,
            alignment: WrapAlignment.center,
            children: [
              TVFocusable(
                autofocus: true,
                onSelect: () => _showAddPlaylistDialog(),
                focusScale: 1.0,
                showFocusBorder: false,
                builder: (context, isFocused, child) {
                  return Container(
                    padding: const EdgeInsets.symmetric(
                        horizontal: 24, vertical: 12),
                    decoration: BoxDecoration(
                      gradient: AppTheme.getGradient(context),
                      borderRadius: BorderRadius.circular(AppTheme.radiusPill),
                      border: isFocused
                          ? Border.all(
                              color: AppTheme.getPrimaryColor(context),
                              width: 2)
                          : null,
                    ),
                    child: child,
                  );
                },
                child: Row(
                  mainAxisSize: MainAxisSize.min,
                  children: [
                    const Icon(Icons.add_rounded,
                        size: 18, color: Colors.white),
                    const SizedBox(width: 8),
                    Text(
                      AppStrings.of(context)?.addPlaylist ?? 'Add Playlist',
                      style: const TextStyle(
                          color: Colors.white,
                          fontSize: 14,
                          fontWeight: FontWeight.w500),
                    ),
                  ],
                ),
              ),
              if (activePlaylist != null)
                TVFocusable(
                  onSelect: () => _refreshCurrentPlaylist(
                      playlistProvider, context.read<ChannelProvider>()),
                  focusScale: 1.0,
                  showFocusBorder: false,
                  builder: (context, isFocused, child) {
                    return Container(
                      padding: const EdgeInsets.symmetric(
                          horizontal: 24, vertical: 12),
                      decoration: BoxDecoration(
                        color: isFocused
                            ? AppTheme.getGlassColor(context)
                            : AppTheme.getGlassColor(context).withOpacity(0.5),
                        borderRadius:
                            BorderRadius.circular(AppTheme.radiusPill),
                        border: Border.all(
                            color: isFocused
                                ? AppTheme.getPrimaryColor(context)
                                : AppTheme.getGlassBorderColor(context),
                            width: isFocused ? 2 : 1),
                      ),
                      child: child,
                    );
                  },
                  child: Row(
                    mainAxisSize: MainAxisSize.min,
                    children: [
                      Icon(Icons.refresh_rounded,
                          size: 18, color: AppTheme.getTextPrimary(context)),
                      const SizedBox(width: 8),
                      Text(
                        AppStrings.of(context)?.refresh ?? 'Refresh',
                        style: TextStyle(
                            color: AppTheme.getTextPrimary(context),
                            fontSize: 14,
                            fontWeight: FontWeight.w500),
                      ),
                    ],
                  ),
                ),
              TVFocusable(
                onSelect: () =>
                    Navigator.pushNamed(context, AppRouter.playlistList),
                focusScale: 1.0,
                showFocusBorder: false,
                builder: (context, isFocused, child) {
                  return Container(
                    padding: const EdgeInsets.symmetric(
                        horizontal: 24, vertical: 12),
                    decoration: BoxDecoration(
                      color: isFocused
                          ? AppTheme.getGlassColor(context)
                          : AppTheme.getGlassColor(context).withOpacity(0.5),
                      borderRadius: BorderRadius.circular(AppTheme.radiusPill),
                      border: Border.all(
                          color: isFocused
                              ? AppTheme.getPrimaryColor(context)
                              : AppTheme.getGlassBorderColor(context),
                          width: isFocused ? 2 : 1),
                    ),
                    child: child,
                  );
                },
                child: Row(
                  mainAxisSize: MainAxisSize.min,
                  children: [
                    Icon(Icons.playlist_play_rounded,
                        size: 18, color: AppTheme.getTextPrimary(context)),
                    const SizedBox(width: 8),
                    Text(
                      AppStrings.of(context)?.playlistList ?? 'Playlists',
                      style: TextStyle(
                          color: AppTheme.getTextPrimary(context),
                          fontSize: 14,
                          fontWeight: FontWeight.w500),
                    ),
                  ],
                ),
              ),
            ],
          ),
        ],
      ),
    );
  }
}

class _NavItem {
  final IconData icon;
  final String label;
  const _NavItem({required this.icon, required this.label});
}

///  -
class _ResponsiveCategoryChips extends StatefulWidget {
  final List<dynamic> groups;
  final Function(String) onGroupTap;

  const _ResponsiveCategoryChips({
    required this.groups,
    required this.onGroupTap,
  });

  @override
  State<_ResponsiveCategoryChips> createState() =>
      _ResponsiveCategoryChipsState();
}

class _ResponsiveCategoryChipsState extends State<_ResponsiveCategoryChips>
    with ThrottledStateMixin {
  bool _isExpanded = false;

  @override
  Widget build(BuildContext context) {
    final isMobile = PlatformDetector.isMobile;

    return LayoutBuilder(
      builder: (context, constraints) {
        final horizontalPadding = isMobile ? 12.0 : 24.0;
        final availableWidth = constraints.maxWidth - horizontalPadding * 2;

        //  chip  +  + padding
        //
        final estimatedChipWidth = isMobile ? 75.0 : 110.0;
        final maxVisibleCount = (availableWidth / estimatedChipWidth).floor();

        //  Wrap
        if (widget.groups.length <= maxVisibleCount || _isExpanded) {
          return _buildExpandedView(isMobile, horizontalPadding);
        }

        //  +
        return _buildCollapsedView(
            maxVisibleCount, isMobile, horizontalPadding);
      },
    );
  }

  Widget _buildExpandedView(bool isMobile, double horizontalPadding) {
    return Padding(
      padding: EdgeInsets.symmetric(horizontal: horizontalPadding),
      child: Align(
        alignment: Alignment.centerLeft,
        child: Wrap(
          spacing: isMobile ? 6 : 8,
          runSpacing: isMobile ? 6 : 8,
          alignment: WrapAlignment.start,
          children: [
            ...widget.groups.map((group) => _buildChip(group.name, isMobile)),
            if (widget.groups.length > 6) _buildCollapseButton(isMobile),
          ],
        ),
      ),
    );
  }

  Widget _buildCollapsedView(
      int maxVisible, bool isMobile, double horizontalPadding) {
    //  4
    final visibleCount = (maxVisible - 1).clamp(3, widget.groups.length);

    return Padding(
      padding: EdgeInsets.symmetric(horizontal: horizontalPadding),
      child: Align(
        alignment: Alignment.centerLeft,
        child: Wrap(
          spacing: isMobile ? 6 : 8,
          runSpacing: isMobile ? 6 : 8,
          alignment: WrapAlignment.start,
          children: [
            ...widget.groups
                .take(visibleCount)
                .map((group) => _buildChip(group.name, isMobile)),
            _buildExpandButton(widget.groups.length - visibleCount, isMobile),
          ],
        ),
      ),
    );
  }

  Widget _buildChip(String name, bool isMobile) {
    return TVFocusable(
      onSelect: () => widget.onGroupTap(name),
      focusScale: 1.0,
      showFocusBorder: false,
      builder: (context, isFocused, child) {
        return Container(
          padding: EdgeInsets.symmetric(
              horizontal: isMobile ? 8 : 12, vertical: isMobile ? 3 : 8), // 53
          decoration: BoxDecoration(
            gradient: isFocused
                ? AppTheme.getGradient(context)
                : AppTheme.getSoftGradient(context),
            borderRadius: BorderRadius.circular(AppTheme.radiusPill),
            border: Border.all(
                color: isFocused
                    ? AppTheme.getPrimaryColor(context)
                    : AppTheme.getGlassBorderColor(context)),
          ),
          child: child,
        );
      },
      child: Row(
        mainAxisSize: MainAxisSize.min,
        children: [
          Icon(CategoryCard.getIconForCategory(name),
              size: isMobile ? 12 : 14,
              color: AppTheme.getTextSecondary(context)),
          SizedBox(width: isMobile ? 4 : 6),
          Text(name,
              style: TextStyle(
                  color: AppTheme.getTextSecondary(context),
                  fontSize: isMobile ? 10 : 12)),
        ],
      ),
    );
  }

  Widget _buildExpandButton(int hiddenCount, bool isMobile) {
    return TVFocusable(
      onSelect: () => immediateSetState(() => _isExpanded = true), //
      focusScale: 1.0,
      showFocusBorder: false,
      builder: (context, isFocused, child) {
        return Container(
          padding: EdgeInsets.symmetric(
              horizontal: isMobile ? 8 : 12, vertical: isMobile ? 3 : 8), // 53
          decoration: BoxDecoration(
            gradient: isFocused
                ? AppTheme.getGradient(context)
                : AppTheme.getSoftGradient(context),
            borderRadius: BorderRadius.circular(AppTheme.radiusPill),
            border: Border.all(
                color: isFocused
                    ? AppTheme.getPrimaryColor(context)
                    : AppTheme.getGlassBorderColor(context)),
          ),
          child: child,
        );
      },
      child: Row(
        mainAxisSize: MainAxisSize.min,
        children: [
          Icon(Icons.more_horiz_rounded,
              size: isMobile ? 12 : 14,
              color: AppTheme.getTextSecondary(context)),
          SizedBox(width: isMobile ? 3 : 4),
          Text('+$hiddenCount',
              style: TextStyle(
                  color: AppTheme.getTextSecondary(context),
                  fontSize: isMobile ? 10 : 12)),
        ],
      ),
    );
  }

  Widget _buildCollapseButton(bool isMobile) {
    return TVFocusable(
      onSelect: () => immediateSetState(() => _isExpanded = false), //
      focusScale: 1.0,
      showFocusBorder: false,
      builder: (context, isFocused, child) {
        return Container(
          padding: EdgeInsets.symmetric(
              horizontal: isMobile ? 8 : 12, vertical: isMobile ? 3 : 8), // 53
          decoration: BoxDecoration(
            gradient: isFocused
                ? AppTheme.getGradient(context)
                : AppTheme.getSoftGradient(context),
            borderRadius: BorderRadius.circular(AppTheme.radiusPill),
            border: Border.all(
                color: isFocused
                    ? AppTheme.getPrimaryColor(context)
                    : AppTheme.getGlassBorderColor(context)),
          ),
          child: child,
        );
      },
      child: Row(
        mainAxisSize: MainAxisSize.min,
        children: [
          Icon(Icons.unfold_less_rounded,
              size: isMobile ? 12 : 14,
              color: AppTheme.getTextSecondary(context)),
          SizedBox(width: isMobile ? 3 : 4),
          Text(AppStrings.of(context)?.collapse ?? 'Collapse',
              style: TextStyle(
                  color: AppTheme.getTextSecondary(context),
                  fontSize: isMobile ? 10 : 12)),
        ],
      ),
    );
  }
}

///  -  Selector
class _OptimizedChannelCard extends StatelessWidget {
  final Channel channel;
  final VoidCallback onTap;
  final VoidCallback? onUp; // onUp

  const _OptimizedChannelCard({
    required this.channel,
    required this.onTap,
    this.onUp, // onUp
  });

  @override
  Widget build(BuildContext context) {
    //  Selector  EPG
    return Selector2<FavoritesProvider, EpgProvider, _ChannelCardData>(
      selector: (_, favProvider, epgProvider) {
        final currentProgram =
            epgProvider.getCurrentProgram(channel.epgId, channel.name);
        final nextProgram =
            epgProvider.getNextProgram(channel.epgId, channel.name);
        return _ChannelCardData(
          isFavorite: favProvider.isFavorite(channel.id ?? 0),
          currentProgram: currentProgram?.title,
          nextProgram: nextProgram?.title,
        );
      },
      builder: (context, data, _) {
        return ChannelCard(
          name: channel.name,
          logoUrl: channel.logoUrl,
          channel: channel, //  channel
          groupName: channel.groupName,
          currentProgram: data.currentProgram,
          nextProgram: data.nextProgram,
          isFavorite: data.isFavorite,
          onFavoriteToggle: () =>
              context.read<FavoritesProvider>().toggleFavorite(channel),
          onTap: onTap,
          onUp: onUp, // onUp
        );
      },
    );
  }
}

///  Selector
class _ChannelCardData {
  final bool isFavorite;
  final String? currentProgram;
  final String? nextProgram;

  _ChannelCardData({
    required this.isFavorite,
    this.currentProgram,
    this.nextProgram,
  });

  @override
  bool operator ==(Object other) {
    if (identical(this, other)) return true;
    return other is _ChannelCardData &&
        other.isFavorite == isFavorite &&
        other.currentProgram == currentProgram &&
        other.nextProgram == nextProgram;
  }

  @override
  int get hashCode => Object.hash(isFavorite, currentProgram, nextProgram);
}

///
class _EmbeddedChannelsScreen extends StatefulWidget {
  const _EmbeddedChannelsScreen();

  @override
  State<_EmbeddedChannelsScreen> createState() =>
      _EmbeddedChannelsScreenState();
}

class _EmbeddedChannelsScreenState extends State<_EmbeddedChannelsScreen> {
  @override
  void initState() {
    super.initState();
    //
    WidgetsBinding.instance.addPostFrameCallback((_) {
      context.read<ChannelProvider>().clearGroupFilter();
    });
  }

  @override
  Widget build(BuildContext context) {
    return const ChannelsScreen(embedded: true);
  }
}

///
class _EmbeddedFavoritesScreen extends StatelessWidget {
  const _EmbeddedFavoritesScreen();

  @override
  Widget build(BuildContext context) {
    return const FavoritesScreen(embedded: true);
  }
}

///
class _EmbeddedPlaylistListScreen extends StatelessWidget {
  const _EmbeddedPlaylistListScreen();

  @override
  Widget build(BuildContext context) {
    return const PlaylistListScreen();
  }
}

///
class _EmbeddedSearchScreen extends StatelessWidget {
  const _EmbeddedSearchScreen();

  @override
  Widget build(BuildContext context) {
    return const SearchScreen(embedded: true);
  }
}

///
class _EmbeddedSettingsScreen extends StatelessWidget {
  const _EmbeddedSettingsScreen();

  @override
  Widget build(BuildContext context) {
    return const SettingsScreen(embedded: true);
  }
}

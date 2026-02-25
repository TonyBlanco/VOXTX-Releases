import 'dart:async';

import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:cached_network_image/cached_network_image.dart';
import 'package:media_kit/media_kit.dart';
import 'package:media_kit_video/media_kit_video.dart';

import '../../../core/theme/app_theme.dart';
import '../../../core/navigation/app_router.dart';
import '../../../core/widgets/tv_focusable.dart';
import '../../../core/widgets/tv_sidebar.dart';
import '../../../core/widgets/channel_card.dart';
import '../../../core/widgets/category_card.dart';
import '../../../core/widgets/auto_scroll_text.dart';
import '../../../core/platform/platform_detector.dart';
import '../../../core/platform/native_player_channel.dart';
import '../../../core/i18n/app_strings.dart';
import '../../../core/services/channel_test_service.dart';
import '../../../core/services/service_locator.dart';
import '../../../core/services/background_test_service.dart';
import '../../../core/services/epg_service.dart';
import '../../../core/models/channel.dart';
import '../../../core/utils/card_size_calculator.dart';
import '../../../core/utils/throttled_state_mixin.dart'; // ✅  mixin

import '../providers/channel_provider.dart';
import '../widgets/channel_test_dialog.dart';
import '../../favorites/providers/favorites_provider.dart';
import '../../settings/providers/settings_provider.dart';
import '../../epg/providers/epg_provider.dart';
import '../../multi_screen/providers/multi_screen_provider.dart';
import '../../playlist/providers/playlist_provider.dart';
import '../../player/providers/player_provider.dart';

class ChannelsScreen extends StatefulWidget {
  final String? groupName;
  final bool embedded; // 

  const ChannelsScreen({
    super.key,
    this.groupName,
    this.embedded = false,
  });

  @override
  State<ChannelsScreen> createState() => _ChannelsScreenState();
}

class _ChannelsScreenState extends State<ChannelsScreen> with ThrottledStateMixin {
  String? _selectedGroup;
  final ScrollController _scrollController = ScrollController();
  final ScrollController _groupScrollController = ScrollController();

  // ✅  Provider 
  List<Channel> _cachedChannels = [];
  bool _isLoadingMore = false;

  // TV
  final List<FocusNode> _groupFocusNodes = [];
  final List<FocusNode> _channelFocusNodes = [];
  int _currentGroupIndex = 0;
  int _lastChannelIndex = 0; // 

  // 
  Timer? _groupSelectTimer;

  // ✅ 
  Timer? _scrollEndTimer;
  Timer? _previewStatusTimer;
  final ChannelTestService _channelTestService = ChannelTestService();
  final Map<String, bool> _channelAvailability = {};
  final Set<String> _channelAvailabilityLoading = {};
  Channel? _previewChannel;

  // Mini player (TV preview panel)
  Player? _miniPlayer;
  VideoController? _miniVideoController;
  Timer? _miniPlayTimer; // debounce before starting stream

  String _tr(String es, String en) {
    final lang = Localizations.localeOf(context).languageCode;
    return lang == 'es' ? es : en;
  }

  @override
  void initState() {
    super.initState();
    _selectedGroup = widget.groupName;

    // Initialize TV mini player
    _miniPlayer = Player();
    _miniVideoController = VideoController(_miniPlayer!);

    // ✅ 
    _scrollController.addListener(_onScroll);

    // 
    if (widget.embedded) {
      WidgetsBinding.instance.addPostFrameCallback((_) {
        context.read<ChannelProvider>().clearGroupFilter();
      });
    } else if (_selectedGroup != null) {
      context.read<ChannelProvider>().selectGroup(_selectedGroup!);

      // ""
      WidgetsBinding.instance.addPostFrameCallback((_) {
        if (PlatformDetector.isTV) {
          // UI
          Future.delayed(const Duration(milliseconds: 300), () {
            if (mounted) {
              // 
              final provider = context.read<ChannelProvider>();
              final groupIndex =
                  provider.groups.indexWhere((g) => g.name == _selectedGroup);
              if (groupIndex >= 0) {
                // +1 ""
                _currentGroupIndex = groupIndex + 1;
              }

              // 
              if (_channelFocusNodes.isNotEmpty) {
                _lastChannelIndex = 0; // 
                _channelFocusNodes[0].requestFocus();
              }
            }
          });
        }
      });
    }
  }

  @override
  void dispose() {
    // 
    try {
      if (mounted) {
        context.read<ChannelProvider>().resumeLogoLoading();
      }
    } catch (e) {
      // Ignore provider error on dispose
    }

    _groupSelectTimer?.cancel();
    _scrollEndTimer?.cancel();
    _previewStatusTimer?.cancel();
    _miniPlayTimer?.cancel();
    _miniPlayer?.dispose();
    _scrollController.dispose();
    _groupScrollController.dispose();
    for (final node in _groupFocusNodes) {
      node.dispose();
    }
    for (final node in _channelFocusNodes) {
      node.dispose();
    }
    super.dispose();
  }

  String _channelKey(Channel channel) => channel.id?.toString() ?? channel.url;

  void _setPreviewChannel(Channel channel) {
    if (!mounted) return;
    if (_previewChannel?.id == channel.id && _previewChannel?.url == channel.url) return;

    immediateSetState(() {
      _previewChannel = channel;
    });
    _scheduleAvailabilityCheck(channel);

    // Debounce mini player — wait 500ms before starting the stream to avoid
    // hammering the server as the user scrolls through channel cards.
    _miniPlayTimer?.cancel();
    _miniPlayTimer = Timer(const Duration(milliseconds: 500), () {
      if (mounted && _miniPlayer != null) {
        final url = channel.sources.isNotEmpty
            ? channel.sources[channel.currentSourceIndex.clamp(0, channel.sources.length - 1)]
            : channel.url;
        _miniPlayer!.open(Media(url));
      }
    });
  }

  void _scheduleAvailabilityCheck(Channel channel) {
    final key = _channelKey(channel);
    if (_channelAvailability.containsKey(key) || _channelAvailabilityLoading.contains(key)) {
      return;
    }

    _previewStatusTimer?.cancel();
    _previewStatusTimer = Timer(const Duration(milliseconds: 500), () async {
      if (!mounted) return;

      _channelAvailabilityLoading.add(key);
      try {
        final result = await _channelTestService.testChannel(channel);
        if (!mounted) return;
        immediateSetState(() {
          _channelAvailability[key] = result.isAvailable;
        });
      } catch (_) {
        if (!mounted) return;
        immediateSetState(() {
          _channelAvailability[key] = false;
        });
      } finally {
        _channelAvailabilityLoading.remove(key);
      }
    });
  }

  Future<void> _playFromPreview(Channel channel) async {
    // Stop mini player before launching fullscreen player
    _miniPlayTimer?.cancel();
    _miniPlayer?.stop();
    Navigator.pushNamed(
      context,
      AppRouter.player,
      arguments: {
        'channelUrl': channel.url,
        'channelName': channel.name,
        'channelLogo': channel.logoUrl,
      },
    );
  }

  Widget _buildMiniPreviewPanel() {
    final channel = _previewChannel;

    return Container(
      width: 300,
      margin: const EdgeInsets.only(right: 12, top: 12, bottom: 12),
      decoration: BoxDecoration(
        color: AppTheme.getCardColor(context),
        borderRadius: BorderRadius.circular(12),
        border: Border.all(color: AppTheme.getGlassBorderColor(context)),
      ),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.stretch,
        children: [
          // ── Video player area ──────────────────────────────────────────
          ClipRRect(
            borderRadius: const BorderRadius.vertical(top: Radius.circular(12)),
            child: AspectRatio(
              aspectRatio: 16 / 9,
              child: channel == null
                  ? Container(
                      color: Colors.black,
                      child: Center(
                        child: Column(
                          mainAxisSize: MainAxisSize.min,
                          children: [
                            Icon(Icons.live_tv_outlined,
                                size: 40,
                                color: AppTheme.getTextMuted(context)
                                    .withOpacity(0.5)),
                            const SizedBox(height: 8),
                            Text(
                              _tr('Selecciona un canal',
                                  'Select a channel'),
                              style: TextStyle(
                                color: AppTheme.getTextMuted(context),
                                fontSize: 11,
                              ),
                            ),
                          ],
                        ),
                      ),
                    )
                  : Stack(
                      fit: StackFit.expand,
                      children: [
                        // Black background
                        Container(color: Colors.black),
                        // Media Kit Video player
                        if (_miniVideoController != null)
                          Video(
                            controller: _miniVideoController!,
                            controls: NoVideoControls,
                          ),
                        // Logo overlay (visible while buffering / on error)
                        if (channel.logoUrl != null &&
                            channel.logoUrl!.isNotEmpty)
                          Positioned(
                            right: 6,
                            top: 6,
                            child: ClipRRect(
                              borderRadius: BorderRadius.circular(4),
                              child: CachedNetworkImage(
                                imageUrl: channel.logoUrl!,
                                width: 36,
                                height: 36,
                                fit: BoxFit.contain,
                                errorWidget: (_, __, ___) =>
                                    const SizedBox.shrink(),
                              ),
                            ),
                          ),
                        // Tap to go fullscreen
                        Positioned.fill(
                          child: Material(
                            color: Colors.transparent,
                            child: InkWell(
                              onTap: channel != null
                                  ? () => _playFromPreview(channel)
                                  : null,
                            ),
                          ),
                        ),
                        // Fullscreen icon hint
                        Positioned(
                          bottom: 6,
                          right: 6,
                          child: Container(
                            padding: const EdgeInsets.all(3),
                            decoration: BoxDecoration(
                              color: Colors.black54,
                              borderRadius: BorderRadius.circular(4),
                            ),
                            child: const Icon(Icons.fullscreen_rounded,
                                color: Colors.white, size: 14),
                          ),
                        ),
                      ],
                    ),
            ),
          ),

          // ── Info area ─────────────────────────────────────────────────
          Expanded(
            child: Padding(
              padding: const EdgeInsets.all(10),
              child: channel == null
                  ? Center(
                      child: Text(
                        _tr('Selecciona un canal para previsualizar',
                            'Select a channel to preview'),
                        textAlign: TextAlign.center,
                        style: TextStyle(
                          color: AppTheme.getTextSecondary(context),
                          fontSize: 11,
                        ),
                      ),
                    )
                  : Consumer2<FavoritesProvider, EpgProvider>(
                      builder: (context, favorites, epgProvider, _) {
                        final key = _channelKey(channel);
                        final isLoading =
                            _channelAvailabilityLoading.contains(key);
                        final isAvailable = _channelAvailability[key];
                        final isFavorite =
                            favorites.isFavorite(channel.id ?? 0);
                        final currentProgram = epgProvider.getCurrentProgram(
                            channel.epgId, channel.name);
                        final nextProgram = epgProvider.getNextProgram(
                            channel.epgId, channel.name);

                        Color statusColor;
                        String statusLabel;
                        if (isLoading) {
                          statusColor = AppTheme.getTextMuted(context);
                          statusLabel =
                              _tr('Comprobando...', 'Checking...');
                        } else if (isAvailable == true) {
                          statusColor = Colors.green;
                          statusLabel = _tr('Activo', 'Active');
                        } else if (isAvailable == false) {
                          statusColor = AppTheme.errorColor;
                          statusLabel =
                              _tr('No disponible', 'Unavailable');
                        } else {
                          statusColor = AppTheme.getTextMuted(context);
                          statusLabel =
                              _tr('Sin comprobar', 'Not checked');
                        }

                        return Column(
                          crossAxisAlignment: CrossAxisAlignment.start,
                          children: [
                            // Channel name
                            Text(
                              channel.name,
                              maxLines: 1,
                              overflow: TextOverflow.ellipsis,
                              style: TextStyle(
                                color: AppTheme.getTextPrimary(context),
                                fontSize: 13,
                                fontWeight: FontWeight.bold,
                              ),
                            ),
                            if (channel.groupName != null) ...[
                              const SizedBox(height: 2),
                              Text(
                                channel.groupName!,
                                maxLines: 1,
                                overflow: TextOverflow.ellipsis,
                                style: TextStyle(
                                  color: AppTheme.getTextMuted(context),
                                  fontSize: 10,
                                ),
                              ),
                            ],

                            // EPG info
                            if (currentProgram != null) ...[
                              const SizedBox(height: 6),
                              Row(
                                children: [
                                  Container(
                                    padding: const EdgeInsets.symmetric(
                                        horizontal: 5, vertical: 1),
                                    decoration: BoxDecoration(
                                      color:
                                          AppTheme.getPrimaryColor(context),
                                      borderRadius:
                                          BorderRadius.circular(3),
                                    ),
                                    child: const Text('NOW',
                                        style: TextStyle(
                                            color: Colors.white,
                                            fontSize: 8,
                                            fontWeight: FontWeight.bold)),
                                  ),
                                  const SizedBox(width: 5),
                                  Expanded(
                                    child: Text(
                                      currentProgram.title,
                                      maxLines: 1,
                                      overflow: TextOverflow.ellipsis,
                                      style: TextStyle(
                                        color:
                                            AppTheme.getTextPrimary(context),
                                        fontSize: 11,
                                        fontWeight: FontWeight.w500,
                                      ),
                                    ),
                                  ),
                                ],
                              ),
                              // Progress bar for current program
                              const SizedBox(height: 3),
                              ClipRRect(
                                borderRadius: BorderRadius.circular(2),
                                child: LinearProgressIndicator(
                                  value: currentProgram.progress,
                                  minHeight: 3,
                                  backgroundColor:
                                      AppTheme.getCardColor(context),
                                  valueColor: AlwaysStoppedAnimation(
                                      AppTheme.getPrimaryColor(context)),
                                ),
                              ),
                              Text(
                                _tr(
                                  'Termina en ${currentProgram.remainingMinutes}min',
                                  'Ends in ${currentProgram.remainingMinutes}min',
                                ),
                                style: TextStyle(
                                  color: AppTheme.getTextMuted(context),
                                  fontSize: 9,
                                ),
                              ),
                            ],
                            if (nextProgram != null) ...[
                              const SizedBox(height: 4),
                              Row(
                                children: [
                                  Container(
                                    padding: const EdgeInsets.symmetric(
                                        horizontal: 5, vertical: 1),
                                    decoration: BoxDecoration(
                                      color: AppTheme.getTextMuted(context)
                                          .withOpacity(0.3),
                                      borderRadius:
                                          BorderRadius.circular(3),
                                    ),
                                    child: const Text('NEXT',
                                        style: TextStyle(
                                            color: Colors.white,
                                            fontSize: 8,
                                            fontWeight: FontWeight.bold)),
                                  ),
                                  const SizedBox(width: 5),
                                  Expanded(
                                    child: Text(
                                      nextProgram.title,
                                      maxLines: 1,
                                      overflow: TextOverflow.ellipsis,
                                      style: TextStyle(
                                        color: AppTheme.getTextSecondary(
                                            context),
                                        fontSize: 10,
                                      ),
                                    ),
                                  ),
                                ],
                              ),
                            ],

                            const Spacer(),

                            // Status row
                            Row(
                              children: [
                                Container(
                                  width: 8,
                                  height: 8,
                                  decoration: BoxDecoration(
                                    color: statusColor,
                                    shape: BoxShape.circle,
                                  ),
                                ),
                                const SizedBox(width: 6),
                                Text(
                                  statusLabel,
                                  style: TextStyle(
                                      color: AppTheme.getTextSecondary(
                                          context),
                                      fontSize: 10),
                                ),
                                const Spacer(),
                                GestureDetector(
                                  onTap: () {
                                    _channelAvailability.remove(key);
                                    _scheduleAvailabilityCheck(channel);
                                    immediateSetState(() {});
                                  },
                                  child: Text(
                                    _tr('Reintentar', 'Retry'),
                                    style: TextStyle(
                                      color: AppTheme.getPrimaryColor(
                                          context),
                                      fontSize: 10,
                                    ),
                                  ),
                                ),
                              ],
                            ),
                            const SizedBox(height: 6),

                            // Action buttons
                            Row(
                              children: [
                                Expanded(
                                  child: SizedBox(
                                    height: 28,
                                    child: OutlinedButton(
                                      style: OutlinedButton.styleFrom(
                                        padding: EdgeInsets.zero,
                                        side: BorderSide(
                                          color:
                                              isFavorite
                                                  ? AppTheme.accentColor
                                                  : AppTheme.getGlassBorderColor(context),
                                        ),
                                      ),
                                      onPressed: () => favorites
                                          .toggleFavorite(channel),
                                      child: Icon(
                                        isFavorite
                                            ? Icons.favorite
                                            : Icons.favorite_border_rounded,
                                        size: 14,
                                        color: isFavorite
                                            ? AppTheme.accentColor
                                            : AppTheme.getTextSecondary(
                                                context),
                                      ),
                                    ),
                                  ),
                                ),
                                const SizedBox(width: 6),
                                Expanded(
                                  flex: 2,
                                  child: SizedBox(
                                    height: 28,
                                    child: ElevatedButton.icon(
                                      style: ElevatedButton.styleFrom(
                                        padding: const EdgeInsets.symmetric(
                                            horizontal: 6),
                                        backgroundColor:
                                            AppTheme.getPrimaryColor(context),
                                        foregroundColor: Colors.white,
                                      ),
                                      onPressed: () =>
                                          _playFromPreview(channel),
                                      icon: const Icon(
                                          Icons.play_arrow_rounded,
                                          size: 14),
                                      label: Text(
                                        _tr('Play', 'Play'),
                                        style: const TextStyle(fontSize: 11),
                                      ),
                                    ),
                                  ),
                                ),
                              ],
                            ),
                          ],
                        );
                      },
                    ),
            ),
          ),
        ],
      ),
    );
  }

  // ✅ 
  void setLogoLoadingScrolling(bool isScrolling) {
    if (!mounted) return;
    try {
      final provider = context.read<ChannelProvider>();
      if (isScrolling) {
        provider.pauseLogoLoading();
      } else {
        provider.resumeLogoLoading();
      }
    } catch (_) {}
  }

  /// ✅  + 
  void _onScroll() {
    // 
    setLogoLoadingScrolling(true);

    // 
    _scrollEndTimer?.cancel();

    // 500ms
    _scrollEndTimer = Timer(const Duration(milliseconds: 500), () {
      setLogoLoadingScrolling(false);
    });

    // ✅ 
    if (!_scrollController.hasClients) return;

    final maxScroll = _scrollController.position.maxScrollExtent;
    final currentScroll = _scrollController.position.pixels;
    final delta = maxScroll - currentScroll;

    // 1000
    if (delta < 1000 && mounted && !_isLoadingMore) {
      final provider = context.read<ChannelProvider>();

      if (provider.hasMore) {
        ServiceLocator.log.i(
            '[ChannelsScreen] : delta=${delta.toStringAsFixed(0)}px, loaded=${provider.loadedChannelCount}/${provider.totalChannelCount}');

        immediateSetState(() => _isLoadingMore = true); // 

        // 
        Future<void> loadFuture;
        if (provider.selectedGroup == null) {
          ServiceLocator.log.d('[ChannelsScreen] ');
          loadFuture = provider.loadAllChannels(loadMore: true);
        } else {
          final playlistProvider = context.read<PlaylistProvider>();
          final activePlaylist = playlistProvider.activePlaylist;
          final playlistId = activePlaylist?.id;
          if (playlistId != null) {
            ServiceLocator.log.d('[ChannelsScreen]  $playlistId ');
            loadFuture = provider.loadChannels(playlistId, loadMore: true);
          } else {
            ServiceLocator.log.w('[ChannelsScreen] playlistId  null');
            immediateSetState(() => _isLoadingMore = false); // 
            return;
          }
        }

        // 
        loadFuture.then((_) {
          ServiceLocator.log.i('[ChannelsScreen] ');
          if (mounted) {
            throttledSetState(() {
              _cachedChannels = provider.filteredChannels;
              ServiceLocator.log
                  .i('[ChannelsScreen] : ${_cachedChannels.length} ');
            });

            // ✅ UI“”
            WidgetsBinding.instance.addPostFrameCallback((_) {
              if (mounted) {
                immediateSetState(() {
                  _isLoadingMore = false;
                });
                ServiceLocator.log.d('[ChannelsScreen] ""');

                // NEW LOGIC: Check again if we're at the bottom and need to load more
                final currentMaxScroll =
                    _scrollController.position.maxScrollExtent;
                final currentScrollPosition = _scrollController.position.pixels;

                const threshold = 0.9; // Moved threshold declaration here

                bool shouldLoadNextPage = false;
                if (currentMaxScroll == 0.0) {
                  // No scrollable content yet, or very little (e.g., first load)
                  shouldLoadNextPage =
                      true; // Always try to load if nothing loaded yet
                } else {
                  shouldLoadNextPage =
                      (currentScrollPosition / currentMaxScroll) > threshold;
                }

                if (shouldLoadNextPage && provider.hasMore) {
                  ServiceLocator.log.d(
                      '[ChannelsScreen] "" (position/max: ${currentScrollPosition.toStringAsFixed(0)}/${currentMaxScroll.toStringAsFixed(0)}, threshold: ${threshold * 100}%)');
                  _onScroll(); // Recursive call, but now with a guaranteed frame break.
                } else {
                  ServiceLocator.log.d(
                      '[ChannelsScreen] "" (position/max: ${currentScrollPosition.toStringAsFixed(0)}/${currentMaxScroll.toStringAsFixed(0)}, hasMore: ${provider.hasMore}, threshold: ${threshold * 100}%)');
                }
              }
            });
          }
        }).catchError((e) {
          ServiceLocator.log.e('[ChannelsScreen] ', error: e);
          if (mounted) {
            immediateSetState(() => _isLoadingMore = false); // 
          }
        });
      }
    }
  }

  @override
  Widget build(BuildContext context) {
    final size = MediaQuery.of(context).size;
    final isTV = PlatformDetector.isTV || size.width > 1200;

    final content = Row(
      children: [
        // Groups Sidebar (for TV and Desktop)
        if (isTV) _buildGroupsSidebar(),
        // Channels Grid
        Expanded(child: _buildChannelsContent()),
        if (isTV) _buildMiniPreviewPanel(),
      ],
    );

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
            selectedIndex: 1, // 
            onRight: () {
              // 
              if (_groupFocusNodes.isNotEmpty &&
                  _currentGroupIndex < _groupFocusNodes.length) {
                _groupFocusNodes[_currentGroupIndex].requestFocus();
              }
            },
            child: content,
          ),
        ),
      );
    }

    // Scaffold
    if (widget.embedded) {
      final isMobile = PlatformDetector.isMobile;
      final isLandscape = isMobile && MediaQuery.of(context).size.width > 700;
      final statusBarHeight =
          isMobile ? MediaQuery.of(context).padding.top : 0.0;
      final topPadding =
          isMobile ? (statusBarHeight > 0 ? statusBarHeight - 15 : 0.0) : 0.0;

      return Stack(
        children: [
          content,
          // 
          if (!isLandscape)
            Positioned(
              left: 8,
              top: topPadding + 8,
              child: Material(
                color: AppTheme.getSurfaceColor(context),
                borderRadius: BorderRadius.circular(8),
                elevation: 2,
                child: InkWell(
                  onTap: () => _showMobileGroupsBottomSheet(context),
                  borderRadius: BorderRadius.circular(8),
                  child: Container(
                    padding: const EdgeInsets.symmetric(
                      horizontal: 12,
                      vertical: 8,
                    ),
                    child: Row(
                      mainAxisSize: MainAxisSize.min,
                      children: [
                        Icon(Icons.menu_rounded,
                            color: AppTheme.getTextPrimary(context), size: 18),
                        const SizedBox(width: 6),
                        Text(
                          _selectedGroup ??
                              (AppStrings.of(context)?.allChannels ?? 'All'),
                          style: TextStyle(
                            color: AppTheme.getTextPrimary(context),
                            fontSize: 13,
                            fontWeight: FontWeight.w500,
                          ),
                        ),
                        const SizedBox(width: 4),
                        Icon(Icons.arrow_drop_down,
                            color: AppTheme.getTextMuted(context), size: 18),
                      ],
                    ),
                  ),
                ),
              ),
            ),
        ],
      );
    }

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
      // 
      drawer: _buildMobileGroupsDrawer(),
    );
  }

  /// 
  void _showMobileGroupsBottomSheet(BuildContext context) {
    final provider = context.read<ChannelProvider>();
    showModalBottomSheet(
      context: context,
      backgroundColor: AppTheme.getSurfaceColor(context),
      shape: const RoundedRectangleBorder(
        borderRadius: BorderRadius.vertical(top: Radius.circular(16)),
      ),
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
                  fontWeight: FontWeight.bold,
                ),
              ),
            ),
            const Divider(height: 1),
            Flexible(
              child: ListView(
                shrinkWrap: true,
                children: [
                  _buildMobileGroupItem(
                    name: AppStrings.of(context)?.allChannels ?? 'All Channels',
                    count: provider.totalChannelCount,
                    isSelected: _selectedGroup == null,
                    onTap: () {
                      immediateSetState(() => _selectedGroup = null); // 
                      provider.clearGroupFilter();
                      Navigator.pop(ctx);
                    },
                  ),
                  ...provider.groups.map((group) => _buildMobileGroupItem(
                        name: group.name,
                        count: group.channelCount,
                        isSelected: _selectedGroup == group.name,
                        onTap: () {
                          immediateSetState(() => _selectedGroup = group.name); // 
                          provider.selectGroup(group.name);
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

  Widget _buildGroupsSidebar() {
    return Consumer<ChannelProvider>(
      builder: (context, provider, _) {
        //  (1"" + )
        final totalGroups = provider.groups.length + 1;
        while (_groupFocusNodes.length < totalGroups) {
          _groupFocusNodes.add(FocusNode());
        }
        while (_groupFocusNodes.length > totalGroups) {
          _groupFocusNodes.removeLast().dispose();
        }

        return FocusTraversalGroup(
          child: Container(
            width: 180,
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
              boxShadow: [
                BoxShadow(
                  color: Colors.black.withOpacity(0.2),
                  blurRadius: 8,
                  offset: const Offset(2, 0),
                ),
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
                              AppTheme.getPrimaryColor(context)
                                  .withOpacity(0.1),
                            ]
                          : [
                              const Color(0xFFE0E0E0),
                              AppTheme.getPrimaryColor(context)
                                  .withOpacity(0.12),
                            ],
                    ),
                    border: Border(
                      bottom: BorderSide(
                        color: AppTheme.getCardColor(context),
                        width: 1,
                      ),
                    ),
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
                            borderRadius: BorderRadius.circular(8),
                          ),
                          child: Icon(
                            Icons.arrow_back_rounded,
                            color: AppTheme.getTextPrimary(context),
                            size: 20,
                          ),
                        ),
                      ),
                      const SizedBox(width: 12),
                      Text(
                        AppStrings.of(context)?.categories ?? 'Categories',
                        style: TextStyle(
                          color: AppTheme.getTextPrimary(context),
                          fontSize: 18,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                    ],
                  ),
                ),

                // All Channels Option
                Padding(
                  padding:
                      const EdgeInsets.symmetric(horizontal: 12, vertical: 8),
                  child: _buildGroupItem(
                    name: AppStrings.of(context)?.allChannels ?? 'All Channels',
                    count: provider.totalChannelCount,
                    isSelected: _selectedGroup == null,
                    focusNode: _groupFocusNodes.isNotEmpty
                        ? _groupFocusNodes[0]
                        : null,
                    groupIndex: 0,
                    onTap: () {
                      immediateSetState(() {
                        _selectedGroup = null;
                        _currentGroupIndex = 0;
                      });
                      provider.clearGroupFilter();
                    },
                  ),
                ),

                Divider(color: AppTheme.getCardColor(context), height: 1),

                // Groups List
                Expanded(
                  child: ListView.builder(
                    controller: _groupScrollController,
                    padding:
                        const EdgeInsets.symmetric(horizontal: 12, vertical: 8),
                    itemCount: provider.groups.length,
                    itemBuilder: (context, index) {
                      final group = provider.groups[index];
                      final focusIndex = index + 1; // +1 ""
                      return _buildGroupItem(
                        name: group.name,
                        count: group.channelCount,
                        isSelected: _selectedGroup == group.name,
                        focusNode: focusIndex < _groupFocusNodes.length
                            ? _groupFocusNodes[focusIndex]
                            : null,
                        groupIndex: focusIndex,
                        onTap: () {
                          immediateSetState(() {
                            _selectedGroup = group.name;
                            _currentGroupIndex = focusIndex;
                          });
                          provider.selectGroup(group.name);
                        },
                      );
                    },
                  ),
                ),
              ],
            ),
          ),
        );
      },
    );
  }

  /// 
  Widget _buildMobileGroupsDrawer() {
    return Consumer<ChannelProvider>(
      builder: (context, provider, _) {
        return Drawer(
          backgroundColor: AppTheme.getSurfaceColor(context),
          width: 220,
          child: SafeArea(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.stretch,
              children: [
                // Header
                Container(
                  padding:
                      const EdgeInsets.symmetric(horizontal: 12, vertical: 10),
                  decoration: const BoxDecoration(
                    gradient: AppTheme.lotusGradient,
                  ),
                  child: Text(
                    AppStrings.of(context)?.categories ?? 'Categories',
                    style: const TextStyle(
                      color: Colors.white,
                      fontSize: 16,
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                ),

                // All Channels Option
                _buildMobileGroupItem(
                  name: AppStrings.of(context)?.allChannels ?? 'All Channels',
                  count: provider.totalChannelCount,
                  isSelected: _selectedGroup == null,
                  onTap: () {
                    immediateSetState(() => _selectedGroup = null); // 
                    provider.clearGroupFilter();
                    Navigator.pop(context);
                  },
                ),

                const Divider(height: 1),

                // Groups List
                Expanded(
                  child: ListView.builder(
                    padding: const EdgeInsets.symmetric(vertical: 8),
                    itemCount: provider.groups.length,
                    itemBuilder: (context, index) {
                      final group = provider.groups[index];
                      return _buildMobileGroupItem(
                        name: group.name,
                        count: group.channelCount,
                        isSelected: _selectedGroup == group.name,
                        onTap: () {
                          immediateSetState(() => _selectedGroup = group.name); // 
                          provider.selectGroup(group.name);
                          Navigator.pop(context);
                        },
                      );
                    },
                  ),
                ),
              ],
            ),
          ),
        );
      },
    );
  }

  /// 
  Widget _buildMobileGroupItem({
    required String name,
    required int count,
    required bool isSelected,
    required VoidCallback onTap,
  }) {
    return ListTile(
      dense: true,
      visualDensity: VisualDensity.compact,
      contentPadding: const EdgeInsets.symmetric(horizontal: 12, vertical: 0),
      leading: Icon(
        CategoryCard.getIconForCategory(name),
        color: isSelected
            ? AppTheme.getPrimaryColor(context)
            : AppTheme.getTextSecondary(context),
        size: 20,
      ),
      title: Text(
        name,
        style: TextStyle(
          color: isSelected
              ? AppTheme.getPrimaryColor(context)
              : AppTheme.getTextPrimary(context),
          fontWeight: isSelected ? FontWeight.w600 : FontWeight.normal,
          fontSize: 13,
        ),
      ),
      trailing: Container(
        padding: const EdgeInsets.symmetric(horizontal: 8, vertical: 2),
        decoration: BoxDecoration(
          color: isSelected
              ? AppTheme.getPrimaryColor(context).withOpacity(0.2)
              : AppTheme.getCardColor(context),
          borderRadius: BorderRadius.circular(10),
        ),
        child: Text(
          count.toString(),
          style: TextStyle(
            color: isSelected
                ? AppTheme.getPrimaryColor(context)
                : AppTheme.getTextMuted(context),
            fontSize: 11,
            fontWeight: FontWeight.w600,
          ),
        ),
      ),
      selected: isSelected,
      selectedTileColor: AppTheme.getPrimaryColor(context).withOpacity(0.1),
      onTap: onTap,
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
                // TV
                _currentGroupIndex = groupIndex;
                _groupSelectTimer?.cancel();
                _groupSelectTimer =
                    Timer(const Duration(milliseconds: 300), () {
                  if (mounted) {
                    // 
                    _lastChannelIndex = 0;
                    _scrollController.jumpTo(0);
                    onTap();
                  }
                });
              }
            : null,
        onRight: PlatformDetector.isTV
            ? () {
                // 
                if (_channelFocusNodes.isNotEmpty) {
                  final targetIndex =
                      _lastChannelIndex.clamp(0, _channelFocusNodes.length - 1);
                  _channelFocusNodes[targetIndex].requestFocus();
                }
              }
            : null,
        onLeft: PlatformDetector.isTV
            ? () {
                // index 1
                final menuNodes = TVSidebar.menuFocusNodes;
                if (menuNodes != null && menuNodes.length > 1) {
                  menuNodes[1].requestFocus(); // 2
                }
              }
            : null,
        focusScale: 1.02,
        showFocusBorder: false,
        builder: (context, isFocused, child) {
          return AnimatedContainer(
            duration: AppTheme.animationFast,
            padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 12),
            decoration: BoxDecoration(
              gradient: isSelected || isFocused
                  ? AppTheme.getSoftGradient(context)
                  : null,
              borderRadius: BorderRadius.circular(10),
              border: Border.all(
                color: isFocused
                    ? AppTheme.getPrimaryColor(context)
                    : isSelected
                        ? AppTheme.getPrimaryColor(context).withOpacity(0.5)
                        : Colors.transparent,
                width: isFocused ? 2 : 1,
              ),
            ),
            child: Row(
              children: [
                // Selection indicator
                AnimatedContainer(
                  duration: AppTheme.animationFast,
                  width: 4,
                  height: 24,
                  decoration: BoxDecoration(
                    color: isSelected
                        ? AppTheme.getPrimaryColor(context)
                        : Colors.transparent,
                    borderRadius: BorderRadius.circular(2),
                  ),
                ),
                const SizedBox(width: 12),

                // Name
                Expanded(
                  child: AutoScrollText(
                    text: name,
                    forceScroll: true,
                    style: TextStyle(
                      color: isSelected
                          ? AppTheme.getPrimaryColor(context)
                          : AppTheme.getTextPrimary(context),
                      fontSize: 12,
                      fontWeight:
                          isSelected ? FontWeight.w600 : FontWeight.normal,
                    ),
                  ),
                ),

                // Count badge
                Container(
                  padding:
                      const EdgeInsets.symmetric(horizontal: 8, vertical: 4),
                  decoration: BoxDecoration(
                    color: isSelected
                        ? AppTheme.getPrimaryColor(context).withOpacity(0.2)
                        : AppTheme.getCardColor(context),
                    borderRadius: BorderRadius.circular(8),
                  ),
                  child: Text(
                    count.toString(),
                    style: TextStyle(
                      color: isSelected
                          ? AppTheme.getPrimaryColor(context)
                          : AppTheme.getTextMuted(context),
                      fontSize: 12,
                      fontWeight: FontWeight.w600,
                    ),
                  ),
                ),
              ],
            ),
          );
        },
        child: const SizedBox.shrink(),
      ),
    );
  }

  Widget _buildChannelsContent() {
    ServiceLocator.log.d('[ChannelsScreen] _buildChannelsContent ');

    // ✅  Consumer 
    return Consumer<ChannelProvider>(
      builder: (context, provider, _) {
        ServiceLocator.log.d(
            '[ChannelsScreen] Consumer builder  - filteredChannels=${provider.filteredChannels.length}, cached=${_cachedChannels.length}');

        // 
        if (_cachedChannels.isEmpty ||
            provider.filteredChannels.length != _cachedChannels.length) {
          ServiceLocator.log.d(
              '[ChannelsScreen] : empty=${_cachedChannels.isEmpty}, lengthChanged=${provider.filteredChannels.length != _cachedChannels.length}');
          WidgetsBinding.instance.addPostFrameCallback((_) {
            if (mounted) {
              throttledSetState(() {
                _cachedChannels = provider.filteredChannels;
                ServiceLocator.log
                    .d('[ChannelsScreen] : ${_cachedChannels.length} ');
              });

              // ✅ 
              Future.delayed(const Duration(milliseconds: 200), () {
                if (mounted && _scrollController.hasClients) {
                  final maxScroll = _scrollController.position.maxScrollExtent;
                  // 
                  if (maxScroll < 100 && provider.hasMore && !_isLoadingMore) {
                    ServiceLocator.log.i(
                        '[ChannelsScreen] (maxScroll=$maxScroll)');
                    _onScroll();
                  }
                }
              });
            }
          });
        }

        final channels = _cachedChannels.isNotEmpty
            ? _cachedChannels
            : provider.filteredChannels;
        ServiceLocator.log.d('[ChannelsScreen] : ${channels.length} ');
        final isMobile = PlatformDetector.isMobile;
        final isLandscape = isMobile && MediaQuery.of(context).size.width > 700;

        // 
        final statusBarHeight =
            isMobile ? MediaQuery.of(context).padding.top : 0.0;
        final topPadding = isMobile
            ? (statusBarHeight > 0 ? statusBarHeight - 15.0 : 0.0)
            : 0.0;

        return CustomScrollView(
          controller: _scrollController,
          // ✅ 
          cacheExtent: 500,
          slivers: [
            // 
            if (isMobile && !isLandscape)
              SliverToBoxAdapter(
                child: SizedBox(height: topPadding),
              ),

            //  SliverPersistentHeader 
            if (isLandscape && widget.embedded)
              SliverPersistentHeader(
                pinned: true,
                delegate: _LandscapeCategoryBarDelegate(
                  provider: provider,
                  selectedGroup: _selectedGroup,
                  channels: channels,
                  statusBarHeight: statusBarHeight,
                  onGroupSelected: (groupName) {
                    immediateSetState(() => _selectedGroup = groupName); // 
                    if (groupName == null) {
                      provider.clearGroupFilter();
                    } else {
                      provider.selectGroup(groupName);
                    }
                  },
                  onTestChannels: () =>
                      _showChannelTestDialog(context, channels),
                  onShowBackgroundTest: () =>
                      _showBackgroundTestProgress(context),
                  onDeleteUnavailable: _selectedGroup ==
                              ChannelProvider.unavailableGroupName &&
                          channels.isNotEmpty
                      ? () => _confirmDeleteAllUnavailable(context, provider)
                      : null,
                ),
              ),

            //  AppBar
            if (!isLandscape || !widget.embedded)
              SliverAppBar(
                pinned: false,
                floating: true,
                primary: false, // SafeArea
                backgroundColor: Colors.transparent,
                toolbarHeight: 56.0,
                expandedHeight: 0,
                collapsedHeight: 56.0,
                titleSpacing: 0,
                leadingWidth: 56,
                flexibleSpace: Container(
                  decoration: BoxDecoration(
                    gradient: LinearGradient(
                      begin: Alignment.topLeft,
                      end: Alignment.bottomRight,
                      colors: Theme.of(context).brightness == Brightness.dark
                          ? [
                              const Color(0xFF0A0A0A).withOpacity(0.95),
                              AppTheme.getPrimaryColor(context)
                                  .withOpacity(0.15),
                            ]
                          : [
                              const Color(0xFFE0E0E0).withOpacity(0.95),
                              AppTheme.getPrimaryColor(context)
                                  .withOpacity(0.12),
                            ],
                    ),
                  ),
                ),
                leading: isMobile && !widget.embedded
                    ? IconButton(
                        icon: Icon(Icons.menu_rounded,
                            color: AppTheme.getTextPrimary(context), size: 24),
                        onPressed: () => Scaffold.of(context).openDrawer(),
                      )
                    : null,
                title: widget.embedded
                    ? null
                    : Text(
                        _selectedGroup ??
                            (AppStrings.of(context)?.allChannels ??
                                'All Channels'),
                        style: TextStyle(
                          color: AppTheme.getTextPrimary(context),
                          fontSize: 20,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                actions: [
                  // Background test progress indicator
                  _BackgroundTestIndicator(
                    onTap: () => _showBackgroundTestProgress(context),
                  ),
                  // Test channels button
                  IconButton(
                    icon: const Icon(Icons.speed_rounded),
                    iconSize: 24,
                    color: AppTheme.getTextSecondary(context),
                    tooltip: 'Test channels',
                    onPressed: channels.isEmpty
                        ? null
                        : () => _showChannelTestDialog(context, channels),
                  ),
                  // Delete all unavailable channels button
                  if (_selectedGroup == ChannelProvider.unavailableGroupName &&
                      channels.isNotEmpty)
                    IconButton(
                      icon: const Icon(Icons.delete_sweep_rounded),
                      iconSize: 24,
                      color: AppTheme.errorColor,
                      tooltip: 'Delete unavailable channels',
                      onPressed: () =>
                          _confirmDeleteAllUnavailable(context, provider),
                    ),
                  // Channel count
                  Center(
                    child: Container(
                      padding: const EdgeInsets.symmetric(
                          horizontal: 12, vertical: 6),
                      margin: EdgeInsets.only(right: isLandscape ? 8 : 16),
                      decoration: BoxDecoration(
                        color:
                            AppTheme.getSurfaceColor(context).withOpacity(0.8),
                        borderRadius: BorderRadius.circular(20),
                      ),
                      child: Text(
                        isLandscape
                            ? '${channels.length}'
                            : '${channels.length} ${AppStrings.of(context)?.channels ?? 'channels'}',
                        style: TextStyle(
                          color: AppTheme.getTextSecondary(context),
                          fontSize: isLandscape ? 11 : 12,
                          fontWeight: FontWeight.w600,
                        ),
                      ),
                    ),
                  ),
                ],
              ),

            // Channels Grid
            if (channels.isEmpty)
              SliverFillRemaining(
                child: Center(
                  child: Column(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Icon(
                        Icons.live_tv_outlined,
                        size: 64,
                        color: AppTheme.getTextMuted(context).withOpacity(0.5),
                      ),
                      const SizedBox(height: 16),
                      Text(
                        AppStrings.of(context)?.noChannelsFound ??
                            'No channels found',
                        style: TextStyle(
                          color: AppTheme.getTextSecondary(context),
                          fontSize: 16,
                        ),
                      ),
                    ],
                  ),
                ),
              )
            else
              SliverPadding(
                padding: EdgeInsets.only(
                  left: isMobile ? (isLandscape ? 4 : 8) : 20,
                  right: isMobile ? (isLandscape ? 4 : 8) : 20,
                  top: isMobile ? (isLandscape ? 4 : 8) : 20, // 4px
                  bottom: isMobile ? (isLandscape ? 4 : 8) : 20,
                ),
                sliver: SliverLayoutBuilder(
                  builder: (context, constraints) {
                    final availableWidth = constraints.crossAxisExtent;
                    final crossAxisCount =
                        CardSizeCalculator.calculateCardsPerRow(availableWidth);

                    ServiceLocator.log.d(
                        '[ChannelsScreen] SliverLayoutBuilder - =$availableWidth, =$crossAxisCount ');

                    return SliverGrid(
                      gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
                        crossAxisCount: crossAxisCount,
                        childAspectRatio: CardSizeCalculator.aspectRatio(),
                        crossAxisSpacing: CardSizeCalculator.spacing,
                        mainAxisSpacing: CardSizeCalculator.spacing,
                      ),
                      delegate: SliverChildBuilderDelegate(
                        (context, index) {
                          // ✅ 1010
                          // if (index < 10 || index >= channels.length - 10) {
                          //   ServiceLocator.log.d(
                          //       '[ChannelsScreen]  #$index/${channels.length}');
                          // }

                          final channel = channels[index];
                          final currentPlayingKey =
                              context.select<PlayerProvider, String?>((provider) {
                            final current = provider.currentChannel;
                            if (current == null) return null;
                            return current.id?.toString() ?? current.url;
                          });
                          final isPlaying =
                              currentPlayingKey == (channel.id?.toString() ?? channel.url);

                          // ✅  select  watch
                          // 
                          final isFavorite =
                              context.select<FavoritesProvider, bool>(
                            (provider) => provider.isFavorite(channel.id ?? 0),
                          );

                          final isUnavailable =
                              ChannelProvider.isUnavailableChannel(
                                  channel.groupName);

                          // ✅  select  EPG  EPG 
                          final currentProgram =
                              context.select<EpgProvider, EpgProgram?>(
                            (provider) => provider.getCurrentProgram(
                                channel.epgId, channel.name),
                          );

                          final nextProgram =
                              context.select<EpgProvider, EpgProgram?>(
                            (provider) => provider.getNextProgram(
                                channel.epgId, channel.name),
                          );

                          // TV
                          if (PlatformDetector.isTV) {
                            while (_channelFocusNodes.length <= index) {
                              _channelFocusNodes.add(FocusNode());
                            }
                          }

                          // TV
                          final isFirstColumn = index % crossAxisCount == 0;

                          // TV
                          final totalRows =
                              (channels.length / crossAxisCount).ceil();
                          final currentRow = index ~/ crossAxisCount;
                          final isLastRow = currentRow == totalRows - 1;

                          return ChannelCard(
                            name: channel.name,
                            logoUrl: channel.logoUrl,
                            channel: channel, //  channel 
                            groupName: isUnavailable
                                ? ChannelProvider.extractOriginalGroup(
                                    channel.groupName)
                                : channel.groupName,
                            currentProgram: currentProgram?.title,
                            nextProgram: nextProgram?.title,
                            isFavorite: isFavorite,
                            isPlaying: isPlaying,
                            isUnavailable: isUnavailable,
                            autofocus: index == 0,
                            focusNode: PlatformDetector.isTV &&
                                    index < _channelFocusNodes.length
                                ? _channelFocusNodes[index]
                                : null,
                            onFocused: PlatformDetector.isTV
                                ? () {
                                    // 
                                    _lastChannelIndex = index;
                                    _setPreviewChannel(channel);
                                  }
                                : null,
                            onLeft: (PlatformDetector.isTV && isFirstColumn)
                                ? () {
                                    // 
                                    ServiceLocator.log.d(
                                        'ChannelsScreen: onLeft pressed, _currentGroupIndex=$_currentGroupIndex, _selectedGroup=$_selectedGroup');
                                    if (_currentGroupIndex <
                                        _groupFocusNodes.length) {
                                      _groupFocusNodes[_currentGroupIndex]
                                          .requestFocus();
                                    }
                                  }
                                : null,
                            onDown: (PlatformDetector.isTV && isLastRow)
                                ? () {
                                    // 
                                  }
                                : null,
                            onFavoriteToggle: () {
                              context
                                  .read<FavoritesProvider>()
                                  .toggleFavorite(channel);
                            },
                            onTest: () => _testSingleChannel(context, channel),
                            onTap: () async {
                              // Stop mini player preview before launching fullscreen
                              _miniPlayTimer?.cancel();
                              _miniPlayer?.stop();

                              final settingsProvider =
                                  context.read<SettingsProvider>();

                              // ID
                              if (settingsProvider.rememberLastChannel &&
                                  channel.id != null) {
                                settingsProvider.setLastChannelId(channel.id);
                              }

                              ServiceLocator.log.d(
                                  'ChannelsScreen: onTap - enableMultiScreen=${settingsProvider.enableMultiScreen}, isDesktop=${PlatformDetector.isDesktop}, isTV=${PlatformDetector.isTV}');

                              // 
                              if (settingsProvider.enableMultiScreen) {
                                // TV 
                                if (PlatformDetector.isTV &&
                                    PlatformDetector.isAndroid) {
                                  ServiceLocator.log.d(
                                      'ChannelsScreen: TV Multi-screen mode, launching native multi-screen player');
                                  final channelProvider =
                                      context.read<ChannelProvider>();
                                  final favoritesProvider =
                                      context.read<FavoritesProvider>();
                                  // ✅ 
                                  final channels = channelProvider.allChannels;

                                  //  providers 
                                  NativePlayerChannel.setProviders(
                                      favoritesProvider,
                                      channelProvider,
                                      settingsProvider);

                                  // 
                                  final clickedIndex = channels
                                      .indexWhere((c) => c.url == channel.url);

                                  // TV
                                    if (channel.id != null) {
                                    await ServiceLocator.watchHistory
                                        .addWatchHistory(
                                        channel.id!, channel.playlistId);
                                    ServiceLocator.log.d(
                                        'ChannelsScreen: Recorded watch history for channel ${channel.name} (TV multi-screen)');
                                  }

                                  // 
                                  final urls =
                                      channels.map((c) => c.url).toList();
                                  final names =
                                      channels.map((c) => c.name).toList();
                                  final groups = channels
                                      .map((c) => c.groupName ?? '')
                                      .toList();
                                  final sources =
                                      channels.map((c) => c.sources).toList();
                                  final logos = channels
                                      .map((c) => c.logoUrl ?? '')
                                      .toList();

                                  // 
                                  await NativePlayerChannel.launchMultiScreen(
                                    urls: urls,
                                    names: names,
                                    groups: groups,
                                    sources: sources,
                                    logos: logos,
                                    initialChannelIndex:
                                        clickedIndex >= 0 ? clickedIndex : 0,
                                    volumeBoostDb: settingsProvider.volumeBoost,
                                    defaultScreenPosition:
                                        settingsProvider.defaultScreenPosition,
                                    showChannelName: settingsProvider
                                        .showMultiScreenChannelName,
                                    onClosed: () {
                                      ServiceLocator.log.d(
                                          'ChannelsScreen: Native multi-screen closed');
                                    },
                                  );
                                } else if (PlatformDetector.isDesktop) {
                                  ServiceLocator.log.d(
                                      'ChannelsScreen: Desktop Multi-screen mode, playing channel: ${channel.name}');
                                  // 
                                  final multiScreenProvider =
                                      context.read<MultiScreenProvider>();
                                  final defaultPosition =
                                      settingsProvider.defaultScreenPosition;
                                  // Provider
                                  multiScreenProvider.setVolumeSettings(
                                      1.0, settingsProvider.volumeBoost);
                                  multiScreenProvider
                                      .playChannelAtDefaultPosition(
                                          channel, defaultPosition);

                                  // MultiScreenProvider
                                  Navigator.pushNamed(
                                    context,
                                    AppRouter.player,
                                    arguments: {
                                      'channelUrl': '', // URL
                                      'channelName': '',
                                      'channelLogo': null,
                                    },
                                  );
                                } else {
                                  // 
                                  Navigator.pushNamed(
                                    context,
                                    AppRouter.player,
                                    arguments: {
                                      'channelUrl': channel.url,
                                      'channelName': channel.name,
                                      'channelLogo': channel.logoUrl,
                                    },
                                  );
                                }
                              } else {
                                // 
                                Navigator.pushNamed(
                                  context,
                                  AppRouter.player,
                                  arguments: {
                                    'channelUrl': channel.url,
                                    'channelName': channel.name,
                                    'channelLogo': channel.logoUrl,
                                  },
                                );
                              }
                            },
                            onLongPress: () =>
                                _showChannelOptions(context, channel),
                          );
                        },
                        childCount: channels.length,
                        // ✅ 
                        addAutomaticKeepAlives: false,
                        // ✅ 
                        addRepaintBoundaries: true,
                      ),
                    );
                  },
                ),
              ),

            // ✅ 
            if (_isLoadingMore)
              SliverToBoxAdapter(
                child: Container(
                  padding: const EdgeInsets.all(20),
                  alignment: Alignment.center,
                  child: Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      const SizedBox(
                        width: 20,
                        height: 20,
                        child: CircularProgressIndicator(strokeWidth: 2),
                      ),
                      const SizedBox(width: 12),
                      Text(
                        'Loading more channels... (${channels.length}/${provider.filteredChannels.length})',
                        style: TextStyle(
                          color: AppTheme.getTextSecondary(context),
                          fontSize: 14,
                        ),
                      ),
                    ],
                  ),
                ),
              ),

            // ✅ 
            if (!provider.hasMore && channels.isNotEmpty)
              SliverToBoxAdapter(
                child: Container(
                  padding: const EdgeInsets.all(20),
                  alignment: Alignment.center,
                  child: Text(
                    'All ${channels.length} channels loaded',
                    style: TextStyle(
                      color: AppTheme.getTextSecondary(context),
                      fontSize: 14,
                    ),
                  ),
                ),
              ),
          ],
        );
      },
    );
  }

  Future<void> _confirmDeleteAllUnavailable(
      BuildContext context, ChannelProvider provider) async {
    final count = provider.unavailableChannelCount;

    final confirm = await showDialog<bool>(
      context: context,
      builder: (context) => AlertDialog(
        backgroundColor: AppTheme.getSurfaceColor(context),
        shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(16)),
        title: Text(
          'Delete unavailable channels',
          style: TextStyle(color: AppTheme.getTextPrimary(context)),
        ),
        content: Text(
          'Delete all $count unavailable channels? This action cannot be undone.',
          style: TextStyle(color: AppTheme.getTextSecondary(context)),
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.of(context).pop(false),
            child: const Text('Cancel'),
          ),
          ElevatedButton(
            onPressed: () => Navigator.of(context).pop(true),
            style: ElevatedButton.styleFrom(
              backgroundColor: AppTheme.errorColor,
            ),
            child: Text(_tr('Eliminar', 'Delete'), style: const TextStyle(color: Colors.white)),
          ),
        ],
      ),
    );

    if (confirm == true && mounted) {
      final deletedCount = await provider.deleteAllUnavailableChannels();

      // 
      immediateSetState(() {
        _selectedGroup = null;
      });
      provider.clearGroupFilter();

      if (mounted) {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: Text(_tr('Se eliminaron $deletedCount canales no disponibles', 'Deleted $deletedCount unavailable channels')),
            backgroundColor: Colors.green,
          ),
        );
      }
    }
  }

  Future<void> _testSingleChannel(BuildContext context, dynamic channel) async {
    final testService = ChannelTestService();
    final channelObj = channel as Channel;

    // 
    ScaffoldMessenger.of(context).showSnackBar(
      SnackBar(
        content: Row(
          children: [
            const SizedBox(
              width: 16,
              height: 16,
              child: CircularProgressIndicator(
                strokeWidth: 2,
                color: Colors.white,
              ),
            ),
            const SizedBox(width: 12),
            Text(_tr('Probando: ${channelObj.name}', 'Testing: ${channelObj.name}')),
          ],
        ),
        duration: const Duration(seconds: 10),
      ),
    );

    final result = await testService.testChannel(channelObj);

    if (mounted) {
      ScaffoldMessenger.of(context).hideCurrentSnackBar();

      // 
      if (result.isAvailable &&
          ChannelProvider.isUnavailableChannel(channelObj.groupName)) {
        final provider = context.read<ChannelProvider>();
        final originalGroup =
            ChannelProvider.extractOriginalGroup(channelObj.groupName);
        await provider.restoreChannel(channelObj.id!);

        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: Row(
              children: [
                const Icon(Icons.check_circle, color: Colors.white, size: 20),
                const SizedBox(width: 12),
                Expanded(
                  child: Text(_tr('${channelObj.name} disponible, restaurado a "$originalGroup"', '${channelObj.name} is available, restored to "$originalGroup"')),
                ),
              ],
            ),
            backgroundColor: Colors.green,
            duration: const Duration(seconds: 3),
          ),
        );
      } else {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: Row(
              children: [
                Icon(
                  result.isAvailable ? Icons.check_circle : Icons.error,
                  color: Colors.white,
                  size: 20,
                ),
                const SizedBox(width: 12),
                Expanded(
                  child: Text(
                    result.isAvailable
                        ? _tr('${channelObj.name} disponible (${result.responseTime}ms)', '${channelObj.name} available (${result.responseTime}ms)')
                        : _tr('${channelObj.name} no disponible: ${result.error}', '${channelObj.name} unavailable: ${result.error}'),
                  ),
                ),
              ],
            ),
            backgroundColor:
                result.isAvailable ? Colors.green : AppTheme.errorColor,
            duration: const Duration(seconds: 3),
          ),
        );
      }
    }
  }

  Future<void> _showChannelTestDialog(
      BuildContext context, List<dynamic> channels) async {
    final result = await showDialog<ChannelTestDialogResult>(
      context: context,
      barrierDismissible: false,
      builder: (context) => ChannelTestDialog(
        channels: channels.cast<Channel>(),
      ),
    );

    if (result == null || !mounted) return;

    // 
    if (result.runInBackground) {
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(
          content: Row(
            children: [
              const Icon(Icons.info_outline, color: Colors.white, size: 20),
              const SizedBox(width: 12),
              Text(_tr('Prueba en segundo plano, quedan ${result.remainingCount} canales', 'Test moved to background, ${result.remainingCount} channels remaining')),
            ],
          ),
          backgroundColor: AppTheme.getPrimaryColor(context),
          duration: const Duration(seconds: 5),
          action: SnackBarAction(
            label: _tr('Ver progreso', 'View progress'),
            textColor: Colors.white,
            onPressed: () => _showBackgroundTestProgress(context),
          ),
        ),
      );
      return;
    }

    // 
    if (result.movedToUnavailable) {
      final unavailableCount =
          result.results.where((r) => !r.isAvailable).length;

      // 
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(
          content: Text(
              _tr('Se movieron $unavailableCount canales no disponibles a "${ChannelProvider.unavailableGroupName}"', 'Moved $unavailableCount unavailable channels to "${ChannelProvider.unavailableGroupName}"')),
          backgroundColor: Colors.orange,
          action: SnackBarAction(
            label: _tr('Ver', 'View'),
            textColor: Colors.white,
            onPressed: () {
              // 
              immediateSetState(() {
                _selectedGroup = ChannelProvider.unavailableGroupName;
              });
              context
                  .read<ChannelProvider>()
                  .selectGroup(ChannelProvider.unavailableGroupName);
            },
          ),
        ),
      );

      // 
      immediateSetState(() {
        _selectedGroup = ChannelProvider.unavailableGroupName;
      });
      context
          .read<ChannelProvider>()
          .selectGroup(ChannelProvider.unavailableGroupName);
    }
  }

  void _showBackgroundTestProgress(BuildContext context) {
    showDialog(
      context: context,
      builder: (context) => const BackgroundTestProgressDialog(),
    );
  }

  // ignore: unused_element
  Future<void> _deleteUnavailableChannels(
      List<ChannelTestResult> results) async {
    final confirm = await showDialog<bool>(
      context: context,
      builder: (context) => AlertDialog(
        backgroundColor: AppTheme.getSurfaceColor(context),
        shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(16)),
        title: Text(
          _tr('Confirmar eliminación', 'Confirm delete'),
          style: TextStyle(color: AppTheme.getTextPrimary(context)),
        ),
        content: Text(
          _tr('¿Eliminar ${results.length} canales no disponibles? Esta acción no se puede deshacer.', 'Delete ${results.length} unavailable channels? This action cannot be undone.'),
          style: TextStyle(color: AppTheme.getTextSecondary(context)),
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.of(context).pop(false),
            child: Text(_tr('Cancelar', 'Cancel')),
          ),
          ElevatedButton(
            onPressed: () => Navigator.of(context).pop(true),
            style: ElevatedButton.styleFrom(
              backgroundColor: AppTheme.errorColor,
            ),
            child: Text(_tr('Eliminar', 'Delete'), style: const TextStyle(color: Colors.white)),
          ),
        ],
      ),
    );

    if (confirm == true && mounted) {
      try {
        // 
        for (final result in results) {
          if (result.channel.id != null) {
            await ServiceLocator.database.delete(
              'channels',
              where: 'id = ?',
              whereArgs: [result.channel.id],
            );
          }
        }

        // 
        if (mounted) {
          context.read<ChannelProvider>().loadAllChannels();
          ScaffoldMessenger.of(context).showSnackBar(
            SnackBar(
              content: Text(_tr('Se eliminaron ${results.length} canales no disponibles', 'Deleted ${results.length} unavailable channels')),
              backgroundColor: Colors.green,
            ),
          );
        }
      } catch (e) {
        if (mounted) {
          ScaffoldMessenger.of(context).showSnackBar(
            SnackBar(
              content: Text(_tr('Error al eliminar: $e', 'Delete failed: $e')),
              backgroundColor: AppTheme.errorColor,
            ),
          );
        }
      }
    }
  }

  void _showChannelOptions(BuildContext context, dynamic channel) {
    final favoritesProvider = context.read<FavoritesProvider>();
    final isFavorite = favoritesProvider.isFavorite(channel.id ?? 0);

    showModalBottomSheet(
      context: context,
      backgroundColor: AppTheme.getSurfaceColor(context),
      shape: const RoundedRectangleBorder(
        borderRadius: BorderRadius.vertical(top: Radius.circular(20)),
      ),
      builder: (context) {
        return Padding(
          padding: const EdgeInsets.all(24),
          child: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              // Channel name
              Text(
                channel.name,
                style: TextStyle(
                  color: AppTheme.getTextPrimary(context),
                  fontSize: 18,
                  fontWeight: FontWeight.bold,
                ),
              ),
              const SizedBox(height: 24),

              // Options
              ListTile(
                leading: Icon(
                  isFavorite ? Icons.favorite : Icons.favorite_border,
                  color: isFavorite
                      ? AppTheme.accentColor
                      : AppTheme.getTextSecondary(context),
                ),
                title: Text(
                  isFavorite
                      ? (AppStrings.of(context)?.removeFavorites ??
                          'Remove from Favorites')
                      : (AppStrings.of(context)?.addFavorites ??
                          'Add to Favorites'),
                  style: TextStyle(color: AppTheme.getTextPrimary(context)),
                ),
                onTap: () async {
                  await favoritesProvider.toggleFavorite(channel);
                  Navigator.pop(context);
                },
              ),

              ListTile(
                leading: Icon(
                  Icons.info_outline_rounded,
                  color: AppTheme.getTextSecondary(context),
                ),
                title: Text(
                  AppStrings.of(context)?.channelInfo ?? 'Channel Info',
                  style: TextStyle(color: AppTheme.getTextPrimary(context)),
                ),
                onTap: () {
                  Navigator.pop(context);
                  // Show channel info dialog
                },
              ),

              ListTile(
                leading: Icon(
                  Icons.speed_rounded,
                  color: AppTheme.getTextSecondary(context),
                ),
                title: Text(
                  '',
                  style: TextStyle(color: AppTheme.getTextPrimary(context)),
                ),
                onTap: () {
                  Navigator.pop(context);
                  _testSingleChannel(context, channel);
                },
              ),

              ListTile(
                leading: Icon(
                  Icons.download_rounded,
                  color: AppTheme.getTextSecondary(context),
                ),
                title: Text(
                  AppStrings.of(context)?.downloadChannel ?? 'Download channel',
                  style: TextStyle(color: AppTheme.getTextPrimary(context)),
                ),
                onTap: () {
                  Navigator.pop(context);
                  _startDownload(context, channel);
                },
              ),

              // 
              if (ChannelProvider.isUnavailableChannel(channel.groupName))
                ListTile(
                  leading: const Icon(
                    Icons.restore_rounded,
                    color: Colors.orange,
                  ),
                  title: Text(
                    ' (${ChannelProvider.extractOriginalGroup(channel.groupName)})',
                    style: TextStyle(color: AppTheme.getTextPrimary(context)),
                  ),
                  onTap: () async {
                    Navigator.pop(context);
                    final provider = context.read<ChannelProvider>();
                    final success = await provider.restoreChannel(channel.id!);
                    if (mounted && success) {
                      ScaffoldMessenger.of(context).showSnackBar(
                        SnackBar(
                          content: Text(' ${channel.name} '),
                          backgroundColor: Colors.green,
                        ),
                      );
                    }
                  },
                ),

              const SizedBox(height: 16),
            ],
          ),
        );
      },
    );
  }

  void _startDownload(BuildContext context, dynamic channel) async {
    final ch = channel as Channel;
    Duration? duration;

    if (ch.isLive) {
      duration = await _showDurationPicker(context);
      if (duration == null) return;
    }

    try {
      await ServiceLocator.offlineDownloads.startDownload(ch, duration: duration);
      if (mounted) {
        final strings = AppStrings.of(context);
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: Text(strings?.downloadStarted ?? 'Download started'),
            action: SnackBarAction(
              label: strings?.offlineDownloads ?? 'Offline',
              onPressed: () =>
                  Navigator.pushNamed(context, AppRouter.offline),
            ),
          ),
        );
      }
    } catch (e) {
      if (mounted) {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(content: Text('Error: $e'), backgroundColor: Colors.red),
        );
      }
    }
  }

  Future<Duration?> _showDurationPicker(BuildContext context) async {
    final strings = AppStrings.of(context);
    return showDialog<Duration>(
      context: context,
      builder: (ctx) {
        return AlertDialog(
          backgroundColor: AppTheme.getSurfaceColor(context),
          title: Text(
            strings?.recordDuration ?? 'Recording duration',
            style: TextStyle(color: AppTheme.getTextPrimary(context)),
          ),
          content: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              _durationOption(ctx, strings?.record30min ?? '30 minutes',
                  const Duration(minutes: 30)),
              _durationOption(ctx, strings?.record1hour ?? '1 hour',
                  const Duration(hours: 1)),
              _durationOption(ctx, strings?.record2hours ?? '2 hours',
                  const Duration(hours: 2)),
              _durationOption(ctx, strings?.recordUnlimited ?? 'Until stopped',
                  const Duration(hours: 12)),
            ],
          ),
          actions: [
            TextButton(
              onPressed: () => Navigator.pop(ctx),
              child: Text(AppStrings.of(context)?.cancel ?? 'Cancel'),
            ),
          ],
        );
      },
    );
  }

  Widget _durationOption(BuildContext context, String label, Duration dur) {
    return ListTile(
      title: Text(label,
          style: TextStyle(color: AppTheme.getTextPrimary(context))),
      onTap: () => Navigator.pop(context, dur),
    );
  }
}

///  Delegate
class _LandscapeCategoryBarDelegate extends SliverPersistentHeaderDelegate {
  final ChannelProvider provider;
  final String? selectedGroup;
  final List<dynamic> channels;
  final Function(String?) onGroupSelected;
  final VoidCallback onTestChannels;
  final VoidCallback onShowBackgroundTest;
  final VoidCallback? onDeleteUnavailable;
  final double statusBarHeight;

  _LandscapeCategoryBarDelegate({
    required this.provider,
    required this.selectedGroup,
    required this.channels,
    required this.onGroupSelected,
    required this.onTestChannels,
    required this.onShowBackgroundTest,
    this.onDeleteUnavailable,
    required this.statusBarHeight,
  });

  @override
  double get minExtent => 40.0 + statusBarHeight;

  @override
  double get maxExtent => 40.0 + statusBarHeight;

  @override
  Widget build(
      BuildContext context, double shrinkOffset, bool overlapsContent) {
    return Container(
      height: 40 + statusBarHeight,
      decoration: BoxDecoration(
        gradient: LinearGradient(
          begin: Alignment.topLeft,
          end: Alignment.bottomRight,
          colors: Theme.of(context).brightness == Brightness.dark
              ? [
                  const Color(0xFF0A0A0A).withOpacity(0.95),
                  AppTheme.getPrimaryColor(context).withOpacity(0.15),
                ]
              : [
                  const Color(0xFFE0E0E0).withOpacity(0.95),
                  AppTheme.getPrimaryColor(context).withOpacity(0.12),
                ],
        ),
      ),
      child: Column(
        children: [
          // 
          SizedBox(height: statusBarHeight - 10),
          // 
          Container(
            height: 40,
            decoration: BoxDecoration(
              border: Border(
                bottom: BorderSide(
                  color: AppTheme.getCardColor(context).withOpacity(0.3),
                  width: 1,
                ),
              ),
            ),
            child: Row(
              children: [
                // 
                Expanded(
                  child: ListView.builder(
                    scrollDirection: Axis.horizontal,
                    padding:
                        const EdgeInsets.symmetric(horizontal: 8, vertical: 4),
                    itemCount: provider.groups.length + 1,
                    itemBuilder: (context, index) {
                      if (index == 0) {
                        final isSelected = selectedGroup == null;
                        return _buildCategoryChip(
                          context: context,
                          name: AppStrings.of(context)?.allChannels ?? 'All',
                          count: provider.totalChannelCount,
                          isSelected: isSelected,
                          onTap: () => onGroupSelected(null),
                        );
                      } else {
                        final group = provider.groups[index - 1];
                        final isSelected = selectedGroup == group.name;
                        return _buildCategoryChip(
                          context: context,
                          name: group.name,
                          count: group.channelCount,
                          isSelected: isSelected,
                          onTap: () => onGroupSelected(group.name),
                        );
                      }
                    },
                  ),
                ),
                // 
                _buildActions(context),
              ],
            ),
          ),
        ],
      ),
    );
  }

  Widget _buildActions(BuildContext context) {
    return Row(
      mainAxisSize: MainAxisSize.min,
      children: [
        // 
        Container(
          width: 1,
          height: 24,
          color: AppTheme.getCardColor(context).withOpacity(0.5),
          margin: const EdgeInsets.symmetric(horizontal: 4),
        ),
        // 
        _BackgroundTestIndicator(onTap: onShowBackgroundTest),
        // 
        IconButton(
          icon: const Icon(Icons.speed_rounded),
          iconSize: 18,
          padding: const EdgeInsets.all(6),
          color: channels.isEmpty
              ? AppTheme.getTextMuted(context).withOpacity(0.3)
              : AppTheme.getTextSecondary(context),
          onPressed: channels.isEmpty ? null : onTestChannels,
        ),
        // 
        if (onDeleteUnavailable != null)
          IconButton(
            icon: const Icon(Icons.delete_sweep_rounded),
            iconSize: 18,
            padding: const EdgeInsets.all(6),
            color: AppTheme.errorColor,
            onPressed: onDeleteUnavailable,
          ),
        // 
        Container(
          padding: const EdgeInsets.symmetric(horizontal: 8, vertical: 4),
          margin: const EdgeInsets.only(right: 8),
          decoration: BoxDecoration(
            color: AppTheme.getSurfaceColor(context).withOpacity(0.8),
            borderRadius: BorderRadius.circular(12),
          ),
          child: Text(
            '${channels.length}',
            style: TextStyle(
              color: AppTheme.getTextSecondary(context),
              fontSize: 11,
              fontWeight: FontWeight.w600,
            ),
          ),
        ),
      ],
    );
  }

  Widget _buildCategoryChip({
    required BuildContext context,
    required String name,
    required int count,
    required bool isSelected,
    required VoidCallback onTap,
  }) {
    return Padding(
      padding: const EdgeInsets.only(right: 6),
      child: Material(
        color: Colors.transparent,
        child: InkWell(
          onTap: onTap,
          borderRadius: BorderRadius.circular(16),
          child: Container(
            padding: const EdgeInsets.symmetric(horizontal: 10, vertical: 6),
            decoration: BoxDecoration(
              gradient: isSelected ? AppTheme.getGradient(context) : null,
              color: isSelected
                  ? null
                  : AppTheme.getCardColor(context).withOpacity(0.5),
              borderRadius: BorderRadius.circular(16),
              border: Border.all(
                color: isSelected
                    ? AppTheme.getPrimaryColor(context)
                    : AppTheme.getGlassBorderColor(context),
                width: isSelected ? 2 : 1,
              ),
            ),
            child: Row(
              mainAxisSize: MainAxisSize.min,
              children: [
                Icon(
                  CategoryCard.getIconForCategory(name),
                  size: 12,
                  color: isSelected
                      ? Colors.white
                      : AppTheme.getTextSecondary(context),
                ),
                const SizedBox(width: 4),
                Text(
                  name,
                  style: TextStyle(
                    color: isSelected
                        ? Colors.white
                        : AppTheme.getTextPrimary(context),
                    fontSize: 11,
                    fontWeight:
                        isSelected ? FontWeight.w600 : FontWeight.normal,
                  ),
                ),
                const SizedBox(width: 3),
                Container(
                  padding:
                      const EdgeInsets.symmetric(horizontal: 5, vertical: 1),
                  decoration: BoxDecoration(
                    color: isSelected
                        ? Colors.white.withOpacity(0.2)
                        : AppTheme.getCardColor(context),
                    borderRadius: BorderRadius.circular(8),
                  ),
                  child: Text(
                    count.toString(),
                    style: TextStyle(
                      color: isSelected
                          ? Colors.white
                          : AppTheme.getTextMuted(context),
                      fontSize: 9,
                      fontWeight: FontWeight.w600,
                    ),
                  ),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }

  @override
  bool shouldRebuild(covariant _LandscapeCategoryBarDelegate oldDelegate) {
    return oldDelegate.selectedGroup != selectedGroup ||
        oldDelegate.provider.groups.length != provider.groups.length ||
        oldDelegate.channels.length != channels.length;
  }
}

/// 
class _BackgroundTestIndicator extends StatefulWidget {
  final VoidCallback onTap;

  const _BackgroundTestIndicator({required this.onTap});

  @override
  State<_BackgroundTestIndicator> createState() =>
      _BackgroundTestIndicatorState();
}

class _BackgroundTestIndicatorState extends State<_BackgroundTestIndicator> with ThrottledStateMixin {
  final BackgroundTestService _service = BackgroundTestService();
  late BackgroundTestProgress _progress;

  @override
  void initState() {
    super.initState();
    _progress = _service.currentProgress;
    _service.addListener(_onProgressUpdate);
  }

  @override
  void dispose() {
    _service.removeListener(_onProgressUpdate);
    super.dispose();
  }

  void _onProgressUpdate(BackgroundTestProgress progress) {
    if (mounted) {
      throttledSetState(() {
        _progress = progress;
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    // 
    if (!_progress.isRunning && !_progress.isComplete) {
      return const SizedBox.shrink();
    }

    return GestureDetector(
      onTap: widget.onTap,
      child: Container(
        margin: const EdgeInsets.only(right: 8),
        padding: const EdgeInsets.symmetric(horizontal: 12, vertical: 6),
        decoration: BoxDecoration(
          color: _progress.isRunning
              ? AppTheme.getPrimaryColor(context).withOpacity(0.2)
              : Colors.orange.withOpacity(0.2),
          borderRadius: BorderRadius.circular(16),
        ),
        child: Row(
          mainAxisSize: MainAxisSize.min,
          children: [
            if (_progress.isRunning) ...[
              SizedBox(
                width: 14,
                height: 14,
                child: CircularProgressIndicator(
                  strokeWidth: 2,
                  color: AppTheme.getPrimaryColor(context),
                ),
              ),
              const SizedBox(width: 8),
              Text(
                '${_progress.completed}/${_progress.total}',
                style: const TextStyle(
                  color: AppTheme.primaryColor,
                  fontSize: 12,
                  fontWeight: FontWeight.w600,
                ),
              ),
            ] else ...[
              const Icon(
                Icons.check_circle_outline,
                size: 16,
                color: Colors.orange,
              ),
              const SizedBox(width: 6),
              Text(
                ' (${_progress.unavailable})',
                style: const TextStyle(
                  color: Colors.orange,
                  fontSize: 12,
                  fontWeight: FontWeight.w600,
                ),
              ),
            ],
          ],
        ),
      ),
    );
  }
}

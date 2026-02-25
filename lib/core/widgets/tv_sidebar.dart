import 'dart:async';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:provider/provider.dart';
import '../theme/app_theme.dart';
import '../navigation/app_router.dart';
import '../i18n/app_strings.dart';
import 'tv_focusable.dart';
import 'channel_logo_widget.dart';
import '../platform/platform_detector.dart';
import '../../features/settings/providers/settings_provider.dart';
import '../services/service_locator.dart';

/// TV
///
class TVSidebar extends StatefulWidget {
  final int selectedIndex;
  final Widget child;
  final VoidCallback? onRight; //

  ///
  static List<FocusNode>? menuFocusNodes;

  ///
  static int? selectedMenuIndex;

  const TVSidebar({
    super.key,
    required this.selectedIndex,
    required this.child,
    this.onRight,
  });

  @override
  State<TVSidebar> createState() => _TVSidebarState();
}

class _TVSidebarState extends State<TVSidebar> {
  final List<FocusNode> _menuFocusNodes = [];
  Timer? _navDelayTimer; //
  int? _pendingNavIndex; //

  @override
  void initState() {
    super.initState();
    // 9
    for (int i = 0; i < 9; i++) {
      _menuFocusNodes.add(FocusNode());
    }
    //
    TVSidebar.menuFocusNodes = _menuFocusNodes;
    TVSidebar.selectedMenuIndex = widget.selectedIndex;

    // Auto-focus the selected menu item when the sidebar first mounts.
    // Without this, on TV the highlight only appears after the first D-Pad
    // keypress, which makes the app feel broken on first launch.
    WidgetsBinding.instance.addPostFrameCallback((_) {
      if (!mounted) return;
      if (!PlatformDetector.isTV && !PlatformDetector.isDesktop) return;
      final idx = widget.selectedIndex.clamp(0, _menuFocusNodes.length - 1);
      _menuFocusNodes[idx].requestFocus();
    });
  }

  @override
  void didUpdateWidget(TVSidebar oldWidget) {
    super.didUpdateWidget(oldWidget);
    if (oldWidget.selectedIndex != widget.selectedIndex) {
      TVSidebar.selectedMenuIndex = widget.selectedIndex;
    }
  }

  @override
  void dispose() {
    _navDelayTimer?.cancel();
    for (final node in _menuFocusNodes) {
      node.dispose();
    }
    // TVSidebar.menuFocusNodes = null;
    // TVSidebar.selectedMenuIndex = null;
    super.dispose();
  }

  List<_NavItem> _getNavItems(BuildContext context) {
    final items = [
      _NavItem(
          icon: Icons.home_rounded,
          label: AppStrings.of(context)?.home ?? 'Home',
          route: null),
      _NavItem(
          icon: Icons.live_tv_rounded,
          label: AppStrings.of(context)?.channels ?? 'Channels',
          route: AppRouter.channels),
      _NavItem(
          icon: Icons.event_note_rounded,
          label: 'Program Guide',
          route: AppRouter.epg),
      _NavItem(
          icon: Icons.movie_rounded,
          label: AppStrings.of(context)?.movies ?? 'Movies',
          route: AppRouter.movies),
      _NavItem(
          icon: Icons.video_library_rounded,
          label: AppStrings.of(context)?.series ?? 'Series',
          route: AppRouter.series),
      _NavItem(
          icon: Icons.playlist_play_rounded,
          label: AppStrings.of(context)?.playlistList ?? 'Playlist List',
          route: AppRouter.playlistList),
      _NavItem(
          icon: Icons.favorite_rounded,
          label: AppStrings.of(context)?.favorites ?? 'Favorites',
          route: AppRouter.favorites),
      _NavItem(
          icon: Icons.search_rounded,
          label: AppStrings.of(context)?.search ?? 'Search',
          route: AppRouter.search),
      _NavItem(
          icon: Icons.settings_rounded,
          label: AppStrings.of(context)?.settings ?? 'Settings',
          route: AppRouter.settings),
    ];
    // ServiceLocator.log.d('TVSidebar: _getNavItems returned ${items.length} items');
    return items;
  }

  void _onNavItemTap(int index, String? route) {
    if (index == widget.selectedIndex) return;

    //
    clearLogoLoadingQueue();

    if (index == 0) {
      //  pop
      Navigator.of(context)
          .popUntil((r) => r.settings.name == AppRouter.home || r.isFirst);
    } else if (route != null) {
      if (widget.selectedIndex == 0) {
        //  push
        Navigator.pushNamed(context, route);
      } else {
        //  pushReplacementNamed
        Navigator.pushReplacementNamed(context, route);
      }
    }
  }

  @override
  Widget build(BuildContext context) {
    final navItems = _getNavItems(context);
    //
    final simpleMenu = context.watch<SettingsProvider>().simpleMenu;
    //
    //
    final shouldExpand = !simpleMenu;
    final width = shouldExpand ? 130.0 : 52.0;

    return Row(
      children: [
        //
        Focus(
          onFocusChange: (hasFocus) {
            // ,
            if (hasFocus && widget.selectedIndex < _menuFocusNodes.length) {
              WidgetsBinding.instance.addPostFrameCallback((_) {
                final targetNode = _menuFocusNodes[widget.selectedIndex];
                if (targetNode.canRequestFocus && !targetNode.hasFocus) {
                  targetNode.requestFocus();
                }
              });
            }
          },
          child: Container(
            width: width,
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
            child: Column(
              children: [
                const SizedBox(height: 12),
                // Logo
                _buildLogo(),
                const SizedBox(height: 16),
                // Nav Items
                Expanded(
                  child: ListView.builder(
                    padding:
                        EdgeInsets.symmetric(horizontal: shouldExpand ? 6 : 4),
                    itemCount: navItems.length,
                    itemBuilder: (context, index) =>
                        _buildNavItem(index, navItems[index]),
                  ),
                ),
                const SizedBox(height: 12),
              ],
            ),
          ),
        ),
        //
        Expanded(child: widget.child),
      ],
    );
  }

  Widget _buildLogo() {
    //
    final simpleMenu = context.watch<SettingsProvider>().simpleMenu;
    final shouldExpand = !simpleMenu;

    return Padding(
      padding: EdgeInsets.symmetric(horizontal: shouldExpand ? 10 : 8),
      child: shouldExpand
          ? Row(
              children: [
                ClipRRect(
                  borderRadius: BorderRadius.circular(6),
                  child: Image.asset('assets/icons/app_icon.png',
                      width: 24, height: 24),
                ),
                const SizedBox(width: 8),
                Expanded(
                  child: ShaderMask(
                    shaderCallback: (bounds) =>
                        AppTheme.getGradient(context).createShader(bounds),
                    child: const Text('VoXtv',
                        style: TextStyle(
                            fontSize: 14,
                            fontWeight: FontWeight.bold,
                            color: Colors.white)),
                  ),
                ),
              ],
            )
          : Center(
              child: ClipRRect(
                borderRadius: BorderRadius.circular(6),
                child: Image.asset('assets/icons/app_icon.png',
                    width: 24, height: 24),
              ),
            ),
    );
  }

  Widget _buildNavItem(int index, _NavItem item) {
    final isSelected = widget.selectedIndex == index;
    final focusNode =
        index < _menuFocusNodes.length ? _menuFocusNodes[index] : null;
    //
    final simpleMenu = context.watch<SettingsProvider>().simpleMenu;
    final shouldExpand = !simpleMenu;

    return Padding(
      padding: const EdgeInsets.symmetric(vertical: 2),
      child: Focus(
        focusNode: focusNode,
        autofocus: index == widget.selectedIndex,
        onFocusChange: (hasFocus) {
          // UI
          if (mounted) setState(() {});

          //
          if (hasFocus && index != widget.selectedIndex) {
            _navDelayTimer?.cancel();
            _pendingNavIndex = index;
            _navDelayTimer = Timer(const Duration(milliseconds: 500), () {
              if (mounted && _pendingNavIndex == index) {
                _onNavItemTap(index, item.route);
              }
            });
          } else if (!hasFocus && _pendingNavIndex == index) {
            //
            _navDelayTimer?.cancel();
            _pendingNavIndex = null;
          }
        },
        onKeyEvent: (node, event) {
          final key = event.logicalKey;

          // Only react to initial press or held key (KeyRepeat), not release
          if (event is! KeyDownEvent && event is! KeyRepeatEvent) {
            return KeyEventResult.ignored;
          }

          // OK / Select / Enter → navigate immediately (no debounce)
          if (key == LogicalKeyboardKey.select ||
              key == LogicalKeyboardKey.enter ||
              key == LogicalKeyboardKey.space) {
            _navDelayTimer?.cancel();
            _pendingNavIndex = null;
            _onNavItemTap(index, item.route);
            return KeyEventResult.handled;
          }

          // Arrow-Right → hand off to content area
          if (key == LogicalKeyboardKey.arrowRight && widget.onRight != null) {
            _navDelayTimer?.cancel();
            _pendingNavIndex = null;
            widget.onRight!();
            return KeyEventResult.handled;
          }

          // Hard boundaries — prevent focus leaving the sidebar list
          if (key == LogicalKeyboardKey.arrowUp && index == 0) {
            return KeyEventResult.handled;
          }
          if (key == LogicalKeyboardKey.arrowDown && index == 8) {
            return KeyEventResult.handled;
          }

          return KeyEventResult.ignored;
        },
        child: MouseRegion(
          cursor: SystemMouseCursors.click,
          child: GestureDetector(
            onTap: () => _onNavItemTap(index, item.route),
            child: Builder(
              builder: (context) {
                //  FocusNode
                final isFocused = focusNode?.hasFocus ?? false;
                //
                //
                final showSelectedHighlight = isSelected;
                final showFocusHighlight = isFocused && !isSelected;

                return Container(
                  padding: EdgeInsets.symmetric(
                      horizontal: shouldExpand ? 10 : 8, vertical: 10),
                  decoration: BoxDecoration(
                    gradient: (showSelectedHighlight || showFocusHighlight)
                        ? AppTheme.getGradient(context)
                        : null,
                    borderRadius: BorderRadius.circular(8),
                    //
                    border: isFocused
                        ? Border.all(
                            color: Colors.white.withOpacity(0.6),
                            width: 2,
                          )
                        : null,
                  ),
                  child: shouldExpand
                      ? Row(
                          children: [
                            Icon(item.icon,
                                color: (showSelectedHighlight ||
                                        showFocusHighlight)
                                    ? Colors.white
                                    : AppTheme.getTextMuted(context),
                                size: 18),
                            const SizedBox(width: 8),
                            Expanded(
                              child: Text(
                                item.label,
                                maxLines: 1,
                                overflow: TextOverflow.ellipsis,
                                style: TextStyle(
                                  color: (showSelectedHighlight ||
                                          showFocusHighlight)
                                      ? Colors.white
                                      : AppTheme.getTextSecondary(context),
                                  fontSize: 12,
                                  fontWeight: (showSelectedHighlight ||
                                          showFocusHighlight)
                                      ? FontWeight.w600
                                      : FontWeight.normal,
                                ),
                              ),
                            ),
                          ],
                        )
                      : Center(
                          child: Icon(item.icon,
                              color:
                                  (showSelectedHighlight || showFocusHighlight)
                                      ? Colors.white
                                      : (isSelected
                                          ? AppTheme.getPrimaryColor(context)
                                          : AppTheme.getTextMuted(context)),
                              size: 18)),
                );
              },
            ),
          ),
        ),
      ),
    );
  }
}

class _NavItem {
  final IconData icon;
  final String label;
  final String? route;
  const _NavItem(
      {required this.icon, required this.label, required this.route});
}

import 'dart:async';

import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:cached_network_image/cached_network_image.dart';
import 'package:media_kit/media_kit.dart';
import 'package:media_kit_video/media_kit_video.dart';
import 'package:intl/intl.dart';

import '../../../core/theme/app_theme.dart';
import '../../../core/platform/platform_detector.dart';
import '../../../core/services/epg_service.dart';
import '../../../core/models/channel.dart';

import '../../channels/providers/channel_provider.dart';
import '../../player/screens/player_screen.dart';
import '../providers/epg_provider.dart';

class EpgScreen extends StatefulWidget {
  final String? channelId;

  const EpgScreen({super.key, this.channelId});

  @override
  State<EpgScreen> createState() => _EpgScreenState();
}

class _EpgScreenState extends State<EpgScreen> {
  Channel? _selectedChannel;
  String? _selectedGroup;
  List<String> _groups = [];

  late final Player _player;
  late final VideoController _videoController;
  bool _playerActive = false;
  Timer? _playDebounce;

  final ScrollController _channelScrollController = ScrollController();
  final ScrollController _programScrollController = ScrollController();
  final ScrollController _groupScrollController = ScrollController();

  String _tr(String es, String en) {
    final lang = Localizations.localeOf(context).languageCode;
    return lang == 'es' ? es : en;
  }

  @override
  void initState() {
    super.initState();
    _player = Player();
    _videoController = VideoController(_player);
    WidgetsBinding.instance.addPostFrameCallback((_) => _initializeChannels());
  }

  void _initializeChannels() {
    if (!mounted) return;
    final channels = context.read<ChannelProvider>().allChannels;
    if (channels.isEmpty) return;

    final seen = <String>{};
    final groups = <String>[];
    for (final ch in channels) {
      final g = ch.groupName;
      if (g != null && g.isNotEmpty && seen.add(g)) groups.add(g);
    }
    groups.sort();

    Channel? target;
    if (widget.channelId != null) {
      try {
        target = channels.firstWhere(
          (c) => c.epgId == widget.channelId || c.id?.toString() == widget.channelId,
        );
      } catch (_) {}
    }
    setState(() {
      _groups = groups;
      _selectedChannel = target ?? channels.first;
      if (_selectedChannel?.groupName != null) {
        _selectedGroup = _selectedChannel!.groupName;
      }
    });
  }

  void _selectGroup(String? group) {
    final all = context.read<ChannelProvider>().allChannels;
    final filtered = group == null ? all : all.where((c) => c.groupName == group).toList();
    setState(() {
      _selectedGroup = group;
      if (filtered.isNotEmpty && !filtered.any((c) => c.url == _selectedChannel?.url)) {
        _selectedChannel = filtered.first;
      }
    });
    _channelScrollController.animateTo(0,
        duration: const Duration(milliseconds: 200), curve: Curves.easeOut);
  }

  void _openFullscreen() {
    final ch = _selectedChannel;
    if (ch == null) return;
    _stopPlaying();
    Navigator.of(context).push(MaterialPageRoute(
      builder: (_) => PlayerScreen(
        channelUrl: ch.url,
        channelName: ch.name,
        channelLogo: ch.logoUrl,
      ),
    ));
  }

  void _selectChannel(Channel channel) {
    setState(() => _selectedChannel = channel);
    _playDebounce?.cancel();
    _playDebounce = Timer(const Duration(milliseconds: 600), () {
      if (mounted) _startPlaying(channel.url);
    });
  }

  void _startPlaying(String url) {
    _player.open(Media(url));
    if (!_playerActive) setState(() => _playerActive = true);
  }

  void _stopPlaying() {
    _playDebounce?.cancel();
    _player.stop();
    if (_playerActive) setState(() => _playerActive = false);
  }

  @override
  void dispose() {
    _playDebounce?.cancel();
    _player.dispose();
    _channelScrollController.dispose();
    _programScrollController.dispose();
    _groupScrollController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: SafeArea(
        child: PlatformDetector.isMobile
            ? _buildMobileLayout()
            : _buildDesktopLayout(),
      ),
    );
  }

  // ─── Layouts ───────────────────────────────────────────────────────────────

  Widget _buildMobileLayout() {
    return Column(
      children: [
        _buildAppBar(),
        _buildMiniPlayerStrip(height: 200),
        Expanded(
          child: Row(
            children: [
              SizedBox(
                width: 140,
                child: Column(
                  children: [
                    _buildGroupChips(compact: true),
                    Expanded(child: _buildChannelList(compact: true)),
                  ],
                ),
              ),
              const VerticalDivider(width: 1),
              Expanded(child: _buildProgramList()),
            ],
          ),
        ),
      ],
    );
  }

  Widget _buildDesktopLayout() {
    return Row(
      children: [
        SizedBox(
          width: 230,
          child: Column(
            children: [
              _buildAppBar(slim: true),
              _buildGroupChips(compact: false),
              Expanded(child: _buildChannelList()),
            ],
          ),
        ),
        const VerticalDivider(width: 1),
        Expanded(
          child: Column(
            children: [
              _buildNowPlayingHeader(),
              _buildDesktopPlayer(),
              Expanded(child: _buildProgramList()),
            ],
          ),
        ),
      ],
    );
  }

  // ─── App Bar ───────────────────────────────────────────────────────────────

  Widget _buildAppBar({bool slim = false}) {
    return Container(
      height: 56,
      padding: const EdgeInsets.symmetric(horizontal: 12),
      decoration: BoxDecoration(
        color: AppTheme.getBackgroundColor(context),
        border: Border(
          bottom: BorderSide(color: AppTheme.getCardColor(context), width: 1),
        ),
      ),
      child: Row(
        children: [
          IconButton(
            icon: const Icon(Icons.arrow_back_rounded),
            color: AppTheme.getTextPrimary(context),
            onPressed: () => Navigator.pop(context),
          ),
          const SizedBox(width: 4),
          Icon(Icons.event_note_rounded,
              color: AppTheme.getPrimaryColor(context), size: 20),
          const SizedBox(width: 8),
          Text(
            _tr('Guía de Programas', 'Program Guide'),
            style: TextStyle(
              color: AppTheme.getTextPrimary(context),
              fontSize: slim ? 15 : 18,
              fontWeight: FontWeight.bold,
            ),
          ),
          const Spacer(),
          const _CurrentTimeBadge(),
        ],
      ),
    );
  }

  // ─── Group Chips ───────────────────────────────────────────────────────────

  Widget _buildGroupChips({required bool compact}) {
    if (_groups.isEmpty) return const SizedBox.shrink();
    return Container(
      height: compact ? 36 : 42,
      decoration: BoxDecoration(
        border: Border(
          bottom: BorderSide(
              color: AppTheme.getCardColor(context).withOpacity(0.5), width: 1),
        ),
      ),
      child: ListView.separated(
        controller: _groupScrollController,
        scrollDirection: Axis.horizontal,
        padding: const EdgeInsets.symmetric(horizontal: 8, vertical: 4),
        itemCount: _groups.length + 1,
        separatorBuilder: (_, __) => const SizedBox(width: 5),
        itemBuilder: (context, index) {
          final isAll = index == 0;
          final group = isAll ? null : _groups[index - 1];
          final isSelected = _selectedGroup == group;
          return GestureDetector(
            onTap: () => _selectGroup(group),
            child: AnimatedContainer(
              duration: const Duration(milliseconds: 150),
              padding: EdgeInsets.symmetric(
                  horizontal: compact ? 8 : 10, vertical: 2),
              decoration: BoxDecoration(
                color: isSelected
                    ? AppTheme.getPrimaryColor(context)
                    : AppTheme.getCardColor(context).withOpacity(0.6),
                borderRadius: BorderRadius.circular(20),
              ),
              child: Text(
                isAll ? _tr('Todos', 'All') : (group ?? ''),
                maxLines: 1,
                style: TextStyle(
                  color: isSelected
                      ? Colors.white
                      : AppTheme.getTextSecondary(context),
                  fontSize: compact ? 10 : 11,
                  fontWeight: isSelected ? FontWeight.w600 : FontWeight.normal,
                ),
              ),
            ),
          );
        },
      ),
    );
  }

  // ─── Now Playing Header (desktop) ─────────────────────────────────────────

  Widget _buildNowPlayingHeader() {
    final ch = _selectedChannel;
    if (ch == null) return const SizedBox.shrink();
    return Consumer<EpgProvider>(builder: (context, epg, _) {
      final current = epg.getCurrentProgram(ch.epgId, ch.name);
      return Container(
        padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 8),
        decoration: BoxDecoration(
          gradient: LinearGradient(
            colors: [
              AppTheme.getPrimaryColor(context).withOpacity(0.2),
              Colors.transparent,
            ],
          ),
        ),
        child: Row(
          children: [
            _ChannelLogo(logoUrl: ch.logoUrl, size: 32),
            const SizedBox(width: 10),
            Expanded(
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(ch.name,
                      style: TextStyle(
                        color: AppTheme.getTextPrimary(context),
                        fontWeight: FontWeight.bold,
                        fontSize: 14,
                      )),
                  if (current != null)
                    Text(current.title,
                        maxLines: 1,
                        overflow: TextOverflow.ellipsis,
                        style: TextStyle(
                          color: AppTheme.getTextSecondary(context),
                          fontSize: 12,
                        )),
                ],
              ),
            ),
            IconButton(
              icon: Icon(Icons.fullscreen_rounded,
                  color: AppTheme.getPrimaryColor(context), size: 26),
              tooltip: _tr('Pantalla completa', 'Full screen'),
              onPressed: _openFullscreen,
            ),
            IconButton(
              icon: Icon(
                _playerActive
                    ? Icons.stop_circle_outlined
                    : Icons.play_circle_outline_rounded,
                color: AppTheme.getPrimaryColor(context),
                size: 28,
              ),
              onPressed: () =>
                  _playerActive ? _stopPlaying() : _startPlaying(ch.url),
            ),
          ],
        ),
      );
    });
  }

  // ─── Players ───────────────────────────────────────────────────────────────

  Widget _buildDesktopPlayer() {
    return AspectRatio(
      aspectRatio: 16 / 9,
      child: Stack(
        fit: StackFit.expand,
        children: [
          Container(color: Colors.black),
          if (_playerActive)
            Video(controller: _videoController, controls: NoVideoControls),
          if (!_playerActive)
            Center(
              child: Column(
                mainAxisSize: MainAxisSize.min,
                children: [
                  Icon(Icons.play_circle_outline_rounded,
                      size: 48,
                      color: AppTheme.getTextMuted(context).withOpacity(0.4)),
                  const SizedBox(height: 8),
                  Text(
                    _selectedChannel == null
                        ? _tr('Selecciona un canal', 'Select a channel')
                        : _tr('Pulsa Play para ver', 'Press Play to watch'),
                    style: TextStyle(
                        color: AppTheme.getTextMuted(context), fontSize: 12),
                  ),
                ],
              ),
            ),
          if (_playerActive)
            Positioned(
              top: 6,
              right: 6,
              child: _OverlayBtn(
                  icon: Icons.fullscreen_rounded, onTap: _openFullscreen),
            ),
        ],
      ),
    );
  }

  Widget _buildMiniPlayerStrip({double height = 180}) {
    final ch = _selectedChannel;
    return SizedBox(
      height: height,
      child: Stack(
        fit: StackFit.expand,
        children: [
          Container(color: Colors.black),
          if (_playerActive)
            Video(controller: _videoController, controls: NoVideoControls),
          if (!_playerActive)
            Center(
              child: InkWell(
                onTap: ch != null ? () => _startPlaying(ch.url) : null,
                child: Column(
                  mainAxisSize: MainAxisSize.min,
                  children: [
                    _ChannelLogo(logoUrl: ch?.logoUrl, size: 48),
                    const SizedBox(height: 8),
                    Row(
                      mainAxisSize: MainAxisSize.min,
                      children: [
                        Icon(Icons.play_circle_filled_rounded,
                            color: AppTheme.getPrimaryColor(context), size: 20),
                        const SizedBox(width: 6),
                        Text(
                          ch?.name ?? _tr('Sin canal', 'No channel'),
                          style: TextStyle(
                            color: AppTheme.getTextPrimary(context),
                            fontWeight: FontWeight.w600,
                            fontSize: 13,
                          ),
                        ),
                      ],
                    ),
                  ],
                ),
              ),
            ),
          if (_playerActive) ...[  
            Positioned(
              top: 6,
              right: 36,
              child: _OverlayBtn(
                  icon: Icons.fullscreen_rounded, onTap: _openFullscreen),
            ),
            Positioned(
              top: 6,
              right: 6,
              child: _OverlayBtn(icon: Icons.close_rounded, onTap: _stopPlaying),
            ),
          ],
        ],
      ),
    );
  }

  // ─── Channel List ──────────────────────────────────────────────────────────

  Widget _buildChannelList({bool compact = false}) {
    return Consumer2<ChannelProvider, EpgProvider>(
      builder: (context, channelProvider, epgProvider, _) {
        final channels = _selectedGroup == null
            ? channelProvider.allChannels
            : channelProvider.allChannels
                .where((c) => c.groupName == _selectedGroup)
                .toList();
        if (channels.isEmpty) {
          return Center(
            child: Text(
              _tr('Sin canales', 'No channels'),
              style: TextStyle(color: AppTheme.getTextSecondary(context)),
            ),
          );
        }

        return ListView.builder(
          controller: _channelScrollController,
          itemCount: channels.length,
          itemExtent: compact ? 52 : 64,
          itemBuilder: (context, index) {
            final ch = channels[index];
            final isSelected = _selectedChannel?.url == ch.url;
            final current = epgProvider.getCurrentProgram(ch.epgId, ch.name);
            return _ChannelListTile(
              channel: ch,
              currentProgram: current,
              isSelected: isSelected,
              compact: compact,
              onTap: () => _selectChannel(ch),
            );
          },
        );
      },
    );
  }

  // ─── Program List ──────────────────────────────────────────────────────────

  Widget _buildProgramList() {
    final ch = _selectedChannel;
    if (ch == null) {
      return Center(
        child: Text(
          _tr('Selecciona un canal', 'Select a channel'),
          style: TextStyle(color: AppTheme.getTextSecondary(context)),
        ),
      );
    }

    return Consumer<EpgProvider>(builder: (context, epgProvider, _) {
      final programs = epgProvider.getTodayPrograms(ch.epgId, ch.name);

      if (programs.isEmpty) {
        return Center(
          child: Padding(
            padding: const EdgeInsets.all(24),
            child: Column(
              mainAxisSize: MainAxisSize.min,
              children: [
                Icon(Icons.event_busy_rounded,
                    size: 48,
                    color: AppTheme.getTextMuted(context).withOpacity(0.4)),
                const SizedBox(height: 12),
                Text(
                  _tr('Sin guía de programas para hoy',
                      'No program guide for today'),
                  style: TextStyle(
                    color: AppTheme.getTextSecondary(context),
                    fontSize: 14,
                  ),
                  textAlign: TextAlign.center,
                ),
                const SizedBox(height: 6),
                Text(
                  _tr('Configura una URL de EPG en Ajustes',
                      'Configure an EPG URL in Settings'),
                  style: TextStyle(
                    color: AppTheme.getTextMuted(context),
                    fontSize: 12,
                  ),
                  textAlign: TextAlign.center,
                ),
              ],
            ),
          ),
        );
      }

      return ListView.builder(
        controller: _programScrollController,
        padding: const EdgeInsets.symmetric(vertical: 8, horizontal: 12),
        itemCount: programs.length,
        itemBuilder: (context, index) {
          final p = programs[index];
          return _ProgramListTile(program: p, isNow: p.isNow);
        },
      );
    });
  }
}

// ─── Overlay Button ───────────────────────────────────────────────────────

class _OverlayBtn extends StatelessWidget {
  final IconData icon;
  final VoidCallback onTap;
  const _OverlayBtn({required this.icon, required this.onTap});

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: onTap,
      child: Container(
        padding: const EdgeInsets.all(4),
        decoration: BoxDecoration(
            color: Colors.black54, borderRadius: BorderRadius.circular(4)),
        child: Icon(icon, color: Colors.white, size: 18),
      ),
    );
  }
}

// ─── Channel Logo ───────────────────────────────────────────────────────────

class _ChannelLogo extends StatelessWidget {
  final String? logoUrl;
  final double size;
  const _ChannelLogo({required this.logoUrl, required this.size});

  @override
  Widget build(BuildContext context) {
    if (logoUrl == null || logoUrl!.isEmpty) return _fallback(context);
    return CachedNetworkImage(
      imageUrl: logoUrl!,
      width: size,
      height: size,
      fit: BoxFit.contain,
      placeholder: (_, __) => _fallback(context),
      errorWidget: (_, __, ___) => _fallback(context),
    );
  }

  Widget _fallback(BuildContext context) => SizedBox(
        width: size,
        height: size,
        child: Icon(Icons.tv_rounded,
            size: size * 0.55,
            color: AppTheme.getTextMuted(context).withOpacity(0.4)),
      );
}

// ─── Channel List Tile ────────────────────────────────────────────────────────

class _ChannelListTile extends StatelessWidget {
  final Channel channel;
  final EpgProgram? currentProgram;
  final bool isSelected;
  final bool compact;
  final VoidCallback onTap;

  const _ChannelListTile({
    required this.channel,
    required this.currentProgram,
    required this.isSelected,
    required this.compact,
    required this.onTap,
  });

  @override
  Widget build(BuildContext context) {
    final size = compact ? 28.0 : 36.0;
    return InkWell(
      onTap: onTap,
      child: AnimatedContainer(
        duration: const Duration(milliseconds: 150),
        padding: EdgeInsets.symmetric(
          horizontal: compact ? 8 : 12,
          vertical: compact ? 6 : 10,
        ),
        decoration: BoxDecoration(
          color: isSelected
              ? AppTheme.getPrimaryColor(context).withOpacity(0.15)
              : null,
          border: Border(
            left: BorderSide(
              color: isSelected
                  ? AppTheme.getPrimaryColor(context)
                  : Colors.transparent,
              width: 3,
            ),
          ),
        ),
        child: Row(
          children: [
            ClipRRect(
              borderRadius: BorderRadius.circular(4),
              child: _ChannelLogo(logoUrl: channel.logoUrl, size: size),
            ),
            SizedBox(width: compact ? 6 : 10),
            Expanded(
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Text(
                    channel.name,
                    maxLines: 1,
                    overflow: TextOverflow.ellipsis,
                    style: TextStyle(
                      color: isSelected
                          ? AppTheme.getPrimaryColor(context)
                          : AppTheme.getTextPrimary(context),
                      fontSize: compact ? 11 : 13,
                      fontWeight:
                          isSelected ? FontWeight.w600 : FontWeight.normal,
                    ),
                  ),
                  if (!compact && currentProgram != null) ...[
                    const SizedBox(height: 2),
                    Text(
                      currentProgram!.title,
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
          ],
        ),
      ),
    );
  }

}

// ─── Program List Tile ────────────────────────────────────────────────────────

class _ProgramListTile extends StatelessWidget {
  final EpgProgram program;
  final bool isNow;

  const _ProgramListTile({required this.program, required this.isNow});

  @override
  Widget build(BuildContext context) {
    final fmt = DateFormat('HH:mm');
    final startStr = fmt.format(program.start);
    final endStr = fmt.format(program.end);

    return Container(
      margin: const EdgeInsets.symmetric(vertical: 3),
      padding: const EdgeInsets.symmetric(horizontal: 12, vertical: 10),
      decoration: BoxDecoration(
        color: isNow
            ? AppTheme.getPrimaryColor(context).withOpacity(0.15)
            : AppTheme.getCardColor(context).withOpacity(0.5),
        borderRadius: BorderRadius.circular(8),
        border: Border.all(
          color: isNow
              ? AppTheme.getPrimaryColor(context).withOpacity(0.6)
              : Colors.transparent,
          width: isNow ? 1.5 : 0,
        ),
      ),
      child: Row(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          // Time column
          SizedBox(
            width: 80,
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Text(
                  '$startStr – $endStr',
                  style: TextStyle(
                    color: isNow
                        ? AppTheme.getPrimaryColor(context)
                        : AppTheme.getTextSecondary(context),
                    fontSize: 11,
                    fontWeight: FontWeight.w600,
                  ),
                ),
                if (isNow) ...[
                  const SizedBox(height: 4),
                  ClipRRect(
                    borderRadius: BorderRadius.circular(2),
                    child: LinearProgressIndicator(
                      value: program.progress,
                      minHeight: 3,
                      backgroundColor: AppTheme.getCardColor(context),
                      valueColor: AlwaysStoppedAnimation(
                          AppTheme.getPrimaryColor(context)),
                    ),
                  ),
                  const SizedBox(height: 2),
                  Text(
                    '${program.remainingMinutes}min',
                    style: TextStyle(
                        color: AppTheme.getTextMuted(context), fontSize: 9),
                  ),
                ],
              ],
            ),
          ),
          const SizedBox(width: 12),
          // Info column
          Expanded(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Row(
                  children: [
                    if (isNow) ...[
                      Container(
                        padding: const EdgeInsets.symmetric(
                            horizontal: 5, vertical: 1),
                        decoration: BoxDecoration(
                          color: AppTheme.getPrimaryColor(context),
                          borderRadius: BorderRadius.circular(3),
                        ),
                        child: const Text('EN VIVO',
                            style: TextStyle(
                                color: Colors.white,
                                fontSize: 8,
                                fontWeight: FontWeight.bold)),
                      ),
                      const SizedBox(width: 6),
                    ],
                    Expanded(
                      child: Text(
                        program.title,
                        maxLines: 2,
                        overflow: TextOverflow.ellipsis,
                        style: TextStyle(
                          color: AppTheme.getTextPrimary(context),
                          fontSize: 13,
                          fontWeight: isNow ? FontWeight.w600 : FontWeight.normal,
                        ),
                      ),
                    ),
                  ],
                ),
                if (program.description != null &&
                    program.description!.isNotEmpty) ...[
                  const SizedBox(height: 3),
                  Text(program.description!,
                      maxLines: 2,
                      overflow: TextOverflow.ellipsis,
                      style: TextStyle(
                          color: AppTheme.getTextMuted(context), fontSize: 11)),
                ],
                if (program.category != null &&
                    program.category!.isNotEmpty) ...[
                  const SizedBox(height: 4),
                  Container(
                    padding:
                        const EdgeInsets.symmetric(horizontal: 6, vertical: 2),
                    decoration: BoxDecoration(
                      color: AppTheme.getCardColor(context),
                      borderRadius: BorderRadius.circular(4),
                    ),
                    child: Text(program.category!,
                        style: TextStyle(
                            color: AppTheme.getTextMuted(context),
                            fontSize: 9)),
                  ),
                ],
              ],
            ),
          ),
        ],
      ),
    );
  }
}

// ─── Current Time Badge ────────────────────────────────────────────────────────

class _CurrentTimeBadge extends StatefulWidget {
  const _CurrentTimeBadge();

  @override
  State<_CurrentTimeBadge> createState() => _CurrentTimeBadgeState();
}

class _CurrentTimeBadgeState extends State<_CurrentTimeBadge> {
  late Timer _timer;
  late DateTime _now;

  @override
  void initState() {
    super.initState();
    _now = DateTime.now();
    _timer = Timer.periodic(
        const Duration(minutes: 1),
        (_) => setState(() => _now = DateTime.now()));
  }

  @override
  void dispose() {
    _timer.cancel();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    final fmt = DateFormat('HH:mm');
    return Container(
      padding: const EdgeInsets.symmetric(horizontal: 10, vertical: 4),
      decoration: BoxDecoration(
        gradient: AppTheme.getGradient(context),
        borderRadius: BorderRadius.circular(12),
      ),
      child: Row(
        mainAxisSize: MainAxisSize.min,
        children: [
          const Icon(Icons.access_time_rounded, color: Colors.white, size: 12),
          const SizedBox(width: 4),
          Text(fmt.format(_now),
              style: const TextStyle(
                  color: Colors.white,
                  fontSize: 12,
                  fontWeight: FontWeight.w600)),
        ],
      ),
    );
  }
}

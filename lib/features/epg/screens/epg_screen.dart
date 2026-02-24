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
import '../providers/epg_provider.dart';

class EpgScreen extends StatefulWidget {
  final String? channelId;

  const EpgScreen({super.key, this.channelId});

  @override
  State<EpgScreen> createState() => _EpgScreenState();
}

class _EpgScreenState extends State<EpgScreen> {
  Channel? _selectedChannel;

  late final Player _player;
  late final VideoController _videoController;
  bool _playerActive = false;
  Timer? _playDebounce;

  final ScrollController _channelScrollController = ScrollController();
  final ScrollController _programScrollController = ScrollController();

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

    Channel? target;
    if (widget.channelId != null) {
      try {
        target = channels.firstWhere(
          (c) => c.epgId == widget.channelId || c.id?.toString() == widget.channelId,
        );
      } catch (_) {}
    }
    setState(() => _selectedChannel = target ?? channels.first);
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
              SizedBox(width: 130, child: _buildChannelList(compact: true)),
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
          width: 220,
          child: Column(
            children: [
              _buildAppBar(slim: true),
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
            if (ch.logoUrl != null && ch.logoUrl!.isNotEmpty)
              CachedNetworkImage(
                imageUrl: ch.logoUrl!,
                width: 32,
                height: 32,
                fit: BoxFit.contain,
                errorWidget: (_, __, ___) => const SizedBox.shrink(),
              ),
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
      child: Container(
        color: Colors.black,
        child: _playerActive
            ? Video(controller: _videoController, controls: NoVideoControls)
            : Center(
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
                        color: AppTheme.getTextMuted(context),
                        fontSize: 12,
                      ),
                    ),
                  ],
                ),
              ),
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
                    if (ch?.logoUrl != null && ch!.logoUrl!.isNotEmpty)
                      CachedNetworkImage(
                        imageUrl: ch.logoUrl!,
                        height: 48,
                        fit: BoxFit.contain,
                        errorWidget: (_, __, ___) => const SizedBox.shrink(),
                      ),
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
          if (_playerActive)
            Positioned(
              top: 6,
              right: 6,
              child: GestureDetector(
                onTap: _stopPlaying,
                child: Container(
                  padding: const EdgeInsets.all(4),
                  decoration: BoxDecoration(
                    color: Colors.black54,
                    borderRadius: BorderRadius.circular(4),
                  ),
                  child: const Icon(Icons.close_rounded,
                      color: Colors.white, size: 16),
                ),
              ),
            ),
        ],
      ),
    );
  }

  // ─── Channel List ──────────────────────────────────────────────────────────

  Widget _buildChannelList({bool compact = false}) {
    return Consumer2<ChannelProvider, EpgProvider>(
      builder: (context, channelProvider, epgProvider, _) {
        final channels = channelProvider.allChannels;
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
              child: channel.logoUrl != null && channel.logoUrl!.isNotEmpty
                  ? CachedNetworkImage(
                      imageUrl: channel.logoUrl!,
                      width: compact ? 28 : 36,
                      height: compact ? 28 : 36,
                      fit: BoxFit.contain,
                      errorWidget: (_, __, ___) =>
                          _placeholder(context, compact),
                    )
                  : _placeholder(context, compact),
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

  Widget _placeholder(BuildContext context, bool compact) => Container(
        width: compact ? 28 : 36,
        height: compact ? 28 : 36,
        decoration: BoxDecoration(
          color: AppTheme.getCardColor(context),
          borderRadius: BorderRadius.circular(4),
        ),
        child: Icon(Icons.tv_rounded,
            size: compact ? 16 : 20,
            color: AppTheme.getTextMuted(context).withOpacity(0.5)),
      );
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

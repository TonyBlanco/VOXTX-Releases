import 'package:flutter/material.dart';
import '../../../core/platform/web_shims/media_kit_shim.dart';
import '../../../core/platform/web_shims/media_kit_video_shim.dart';

import '../../../core/models/channel.dart';
import '../../../core/services/service_locator.dart';

class VideoPlayerWidget extends StatefulWidget {
  final Channel channel;
  final bool autoPlay;
  final bool showControls;
  final bool muted;

  const VideoPlayerWidget({
    super.key,
    required this.channel,
    this.autoPlay = true,
    this.showControls = true,
    this.muted = false,
  });

  @override
  State<VideoPlayerWidget> createState() => _VideoPlayerWidgetState();
}

class _VideoPlayerWidgetState extends State<VideoPlayerWidget> {
  late final Player _player;
  late final VideoController _controller;

  @override
  void initState() {
    super.initState();
    _player = Player();
    _controller = VideoController(_player);
    
    if (widget.muted) {
      _player.setVolume(0);
    }
    
    if (widget.autoPlay) {
      _loadAndPlay();
    }
  }

  @override
  void didUpdateWidget(VideoPlayerWidget oldWidget) {
    super.didUpdateWidget(oldWidget);
    
    // 
    if (widget.muted != oldWidget.muted) {
      _player.setVolume(widget.muted ? 0 : 100);
    }
    
    // 
    if (widget.autoPlay != oldWidget.autoPlay) {
      if (widget.autoPlay) {
        _loadAndPlay();
      } else {
        _player.pause();
      }
    }
    
    // 
    if (widget.channel.url != oldWidget.channel.url) {
      _loadAndPlay();
    }
  }

  void _loadAndPlay() {
    try {
      _player.open(Media(widget.channel.url));
    } catch (e) {
      ServiceLocator.log.d('Error loading channel: $e');
    }
  }

  @override
  void dispose() {
    _player.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Container(
      color: Colors.black,
      child: Video(
        controller: _controller,
        controls: widget.showControls ? AdaptiveVideoControls : NoVideoControls,
      ),
    );
  }
}
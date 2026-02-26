/// Web stub for `package:media_kit_video/media_kit_video.dart`.
///
/// Provides [VideoController] and [Video] widget stubs for web compilation.

import 'package:flutter/widgets.dart';
import 'media_kit_stub.dart';

class VideoController {
  final Player player;
  final VideoControllerConfiguration configuration;

  VideoController(
    this.player, {
    this.configuration = const VideoControllerConfiguration(),
  });

  Future<void> waitUntilFirstFrameRendered() async {}

  int get width => 0;
  int get height => 0;

  Stream<int> get rect => const Stream.empty();

  Future<void> dispose() async {}
}

class VideoControllerConfiguration {
  final bool enableHardwareAcceleration;
  final int? width;
  final int? height;
  final String? hwdec;
  final String? vo;

  const VideoControllerConfiguration({
    this.enableHardwareAcceleration = true,
    this.width,
    this.height,
    this.hwdec,
    this.vo,
  });
}

class Video extends StatelessWidget {
  final VideoController? controller;
  final double? width;
  final double? height;
  final BoxFit fit;
  final Color? fill;
  final Alignment alignment;
  final FilterQuality filterQuality;
  final Widget Function(VideoState)? controls;
  final Map<String, dynamic> subtitleViewConfiguration;
  final bool wakelock;
  final bool pauseUponEnteringBackgroundMode;
  final bool resumeUponEnteringForegroundMode;

  const Video({
    super.key,
    this.controller,
    this.width,
    this.height,
    this.fit = BoxFit.contain,
    this.fill,
    this.alignment = Alignment.center,
    this.filterQuality = FilterQuality.low,
    this.controls,
    this.subtitleViewConfiguration = const {},
    this.wakelock = true,
    this.pauseUponEnteringBackgroundMode = true,
    this.resumeUponEnteringForegroundMode = false,
  });

  @override
  Widget build(BuildContext context) {
    return Container(
      width: width,
      height: height,
      color: fill ?? const Color(0xFF000000),
      child: const Center(
        child: Text(
          'Video not supported on web',
          style: TextStyle(color: Color(0xFFFFFFFF)),
        ),
      ),
    );
  }
}

class VideoState {
  Widget widget(BuildContext context) =>
      const SizedBox.shrink();
}

/// Stub for [AdaptiveVideoControls] — the default controls builder.
Widget AdaptiveVideoControls(VideoState state) => const SizedBox.shrink();

/// Stub for [NoVideoControls] — no controls builder.
Widget NoVideoControls(VideoState state) => const SizedBox.shrink();

/// Stub for [MaterialVideoControls].
Widget MaterialVideoControls(VideoState state) => const SizedBox.shrink();

/// Stub for [MaterialDesktopVideoControls].
Widget MaterialDesktopVideoControls(VideoState state) => const SizedBox.shrink();

/// Subtitle view configuration stub.
class SubtitleViewConfiguration {
  final TextStyle style;
  final TextAlign textAlign;
  final EdgeInsets padding;
  final bool visible;

  const SubtitleViewConfiguration({
    this.style = const TextStyle(),
    this.textAlign = TextAlign.center,
    this.padding = EdgeInsets.zero,
    this.visible = true,
  });
}

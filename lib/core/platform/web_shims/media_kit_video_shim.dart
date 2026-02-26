/// Conditional export: uses [media_kit_video_stub.dart] on web, real package elsewhere.
export 'media_kit_video_stub.dart'
    if (dart.library.io) 'package:media_kit_video/media_kit_video.dart';

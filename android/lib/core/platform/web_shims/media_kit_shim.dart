/// Conditional export: uses [media_kit_stub.dart] on web, real package elsewhere.
export 'media_kit_stub.dart' if (dart.library.io) 'package:media_kit/media_kit.dart';

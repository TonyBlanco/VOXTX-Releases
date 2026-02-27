/// Conditional export: stub on web, real implementation elsewhere.
export 'windows_pip_stub.dart'
    if (dart.library.io) '../windows_pip_channel.dart';

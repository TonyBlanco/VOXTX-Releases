/// Conditional export: stub on web, real Win32 FFI implementation elsewhere.
export 'windows_fullscreen_stub.dart'
    if (dart.library.io) '../windows_fullscreen_native.dart';

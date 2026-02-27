/// Conditional export: stub on web, real window_manager elsewhere.
export 'window_manager_stub.dart'
    if (dart.library.io) 'package:window_manager/window_manager.dart';

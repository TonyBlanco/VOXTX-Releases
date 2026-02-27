/// Conditional export: uses [io_stub.dart] on web, real `dart:io` elsewhere.
///
/// All files that previously did `import 'dart:io';` should instead:
///   import '<relative_path>/web_shims/io_shim.dart';
///
/// This keeps existing code working on native while compiling on web.
export 'io_stub.dart' if (dart.library.io) 'dart:io';

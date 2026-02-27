/// Conditional export: uses [sqflite_ffi_stub.dart] on web, real package elsewhere.
export 'sqflite_ffi_stub.dart'
    if (dart.library.io) 'package:sqflite_common_ffi/sqflite_ffi.dart';

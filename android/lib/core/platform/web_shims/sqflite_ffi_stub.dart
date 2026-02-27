/// Web stub for `package:sqflite_common_ffi/sqflite_ffi.dart`.
///
/// Provides no-op implementations of FFI database initialization
/// so web compilation succeeds.  On web the database is not used (MVP).

/// No-op on web.
void sqfliteFfiInit() {}

/// Placeholder — on web, sqflite's own databaseFactory is used as-is
/// (it will be overridden or guarded by kIsWeb checks).
Object get databaseFactoryFfi => _dummyFactory;

/// Settable top-level variable mirroring sqflite_common's databaseFactory.
/// On web, assignment is a no-op since the database is not used (MVP).
Object _dummyFactory = Object();
set databaseFactory(Object? value) {}
Object get databaseFactory => _dummyFactory;

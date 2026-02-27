/// Conditional export: stub on web, real io_client elsewhere.
export 'http_io_client_stub.dart'
    if (dart.library.io) 'package:http/io_client.dart';

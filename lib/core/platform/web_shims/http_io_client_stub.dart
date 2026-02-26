/// Web stub for `package:http/io_client.dart`.
///
/// On web, IOClient is replaced by a plain http.Client wrapper.
import 'package:http/http.dart' as http;

class IOClient extends http.BaseClient {
  IOClient([Object? inner]);

  @override
  Future<http.StreamedResponse> send(http.BaseRequest request) {
    return http.Client().send(request);
  }
}

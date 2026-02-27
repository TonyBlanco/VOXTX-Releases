/// Web stub for `dart:io`.
///
/// Provides type-compatible shells so that code referencing dart:io types
/// compiles on web.  Every method/getter returns a safe default or throws
/// [UnsupportedError] — the expectation is that all call-sites are guarded
/// by `kIsWeb` or platform checks so these stubs are never executed.
///
// ignore_for_file: non_constant_identifier_names, unused_element
// ignore_for_file: camel_case_types, constant_identifier_names

import 'dart:async';
import 'dart:typed_data';
import 'dart:convert' show Encoding, utf8;

// ---------------------------------------------------------------------------
// Platform
// ---------------------------------------------------------------------------

class Platform {
  Platform._();
  static bool get isAndroid => false;
  static bool get isIOS => false;
  static bool get isWindows => false;
  static bool get isMacOS => false;
  static bool get isLinux => false;
  static bool get isFuchsia => false;
  static String get operatingSystem => 'web';
  static String get operatingSystemVersion => '';
  static String get localeName => 'en';
  static String get resolvedExecutable => '';
  static String get pathSeparator => '/';
  static int get numberOfProcessors => 1;
  static Map<String, String> get environment => const {};
}

// ---------------------------------------------------------------------------
// FileSystemEntity / File / Directory
// ---------------------------------------------------------------------------

enum FileMode { read, write, append, writeOnly, writeOnlyAppend }

class FileStat {
  final DateTime changed;
  final DateTime modified;
  final DateTime accessed;
  final int size;
  FileStat._()
      : changed = DateTime(0),
        modified = DateTime(0),
        accessed = DateTime(0),
        size = 0;
}

abstract class FileSystemEntity {
  String get path;
  Future<bool> exists();
  bool existsSync();
  Future<FileSystemEntity> delete({bool recursive = false});
  Uri get uri;
  Directory get parent;
}

class File implements FileSystemEntity {
  @override
  final String path;
  File(this.path);

  @override
  Future<bool> exists() async => false;
  @override
  bool existsSync() => false;

  @override
  Future<File> delete({bool recursive = false}) async => this;

  @override
  Uri get uri => Uri.file(path);
  @override
  Directory get parent {
    final idx = path.lastIndexOf('/');
    return Directory(idx >= 0 ? path.substring(0, idx) : '.');
  }

  File get absolute => this;

  String readAsStringSync({Encoding encoding = utf8}) =>
      throw UnsupportedError('File.readAsStringSync not supported on web');

  Future<String> readAsString({Encoding encoding = utf8}) =>
      throw UnsupportedError('File.readAsString not supported on web');

  List<int> readAsBytesSync() =>
      throw UnsupportedError('File.readAsBytesSync not supported on web');

  Future<Uint8List> readAsBytes() =>
      throw UnsupportedError('File.readAsBytes not supported on web');

  void writeAsStringSync(String contents,
          {FileMode mode = FileMode.write, Encoding encoding = utf8}) =>
      throw UnsupportedError('File I/O not supported on web');

  Future<File> writeAsString(String contents,
          {FileMode mode = FileMode.write,
          Encoding encoding = utf8,
          bool flush = false}) =>
      throw UnsupportedError('File I/O not supported on web');

  Future<File> writeAsBytes(List<int> bytes,
          {FileMode mode = FileMode.write, bool flush = false}) =>
      throw UnsupportedError('File I/O not supported on web');

  IOSink openWrite(
          {FileMode mode = FileMode.write, Encoding encoding = utf8}) =>
      throw UnsupportedError('File I/O not supported on web');

  Future<int> length() async => 0;
  int lengthSync() => 0;

  Future<FileStat> stat() =>
      throw UnsupportedError('File.stat not supported on web');

  Future<File> create({bool recursive = false, bool exclusive = false}) async =>
      this;

  Future<File> copy(String newPath) =>
      throw UnsupportedError('File.copy not supported on web');

  Future<File> rename(String newPath) =>
      throw UnsupportedError('File.rename not supported on web');
}

class Directory implements FileSystemEntity {
  @override
  final String path;
  Directory(this.path);
  factory Directory.systemTemp() => Directory('/tmp');

  @override
  Future<bool> exists() async => false;
  @override
  bool existsSync() => false;

  @override
  Future<Directory> delete({bool recursive = false}) async => this;

  @override
  Uri get uri => Uri.directory(path);
  @override
  Directory get parent {
    final idx = path.lastIndexOf('/');
    return Directory(idx >= 0 ? path.substring(0, idx) : '.');
  }

  Future<Directory> create({bool recursive = false}) async => this;
  void createSync({bool recursive = false}) {}

  Stream<FileSystemEntity> list(
          {bool recursive = false, bool followLinks = true}) =>
      const Stream.empty();

  List<FileSystemEntity> listSync(
          {bool recursive = false, bool followLinks = true}) =>
      [];
}

// ---------------------------------------------------------------------------
// IOSink
// ---------------------------------------------------------------------------

class IOSink implements StreamSink<List<int>> {
  IOSink._();

  @override
  void add(List<int> data) {}
  @override
  void addError(Object error, [StackTrace? stackTrace]) {}
  @override
  Future addStream(Stream<List<int>> stream) async {}
  @override
  Future close() async {}
  @override
  Future get done => Future.value();

  void write(Object? obj) {}
  void writeln([Object? obj = '']) {}
  void writeAll(Iterable objects, [String separator = '']) {}
  void writeCharCode(int charCode) {}

  Future flush() async {}

  Encoding encoding = utf8;
}

// ---------------------------------------------------------------------------
// HTTP Server
// ---------------------------------------------------------------------------

class HttpServer {
  int get port => 0;
  InternetAddress get address => InternetAddress('127.0.0.1');

  static Future<HttpServer> bind(Object address, int port,
          {int backlog = 0, bool v6Only = false, bool shared = false}) =>
      throw UnsupportedError('HttpServer not supported on web');

  StreamSubscription<HttpRequest> listen(
    void Function(HttpRequest)? onData, {
    Function? onError,
    void Function()? onDone,
    bool? cancelOnError,
  }) =>
      throw UnsupportedError('HttpServer not supported on web');

  Future close({bool force = false}) async {}
}

class HttpRequest {
  Uri get uri => Uri();
  String get method => '';
  HttpHeaders get headers => HttpHeaders._();
  HttpResponse get response => HttpResponse._();
  String get connectionInfo => '';
}

class HttpResponse {
  HttpResponse._();
  int statusCode = 200;
  final HttpHeaders headers = HttpHeaders._();
  Encoding get encoding => utf8;
  set encoding(Encoding e) {}

  void write(Object? obj) {}
  void writeln([Object? obj = '']) {}
  void add(List<int> data) {}
  Future close() async {}
  Future redirect(Uri location, {int status = 302}) async {}
}

// ---------------------------------------------------------------------------
// HTTP Client
// ---------------------------------------------------------------------------

class HttpClient {
  Duration? connectionTimeout;
  Duration idleTimeout = const Duration(seconds: 15);
  int? maxConnectionsPerHost;
  bool autoUncompress = true;
  String? userAgent;

  Future<HttpClientRequest> getUrl(Uri url) =>
      throw UnsupportedError('HttpClient not supported on web');

  Future<HttpClientRequest> headUrl(Uri url) =>
      throw UnsupportedError('HttpClient not supported on web');

  Future<HttpClientRequest> openUrl(String method, Uri url) =>
      throw UnsupportedError('HttpClient not supported on web');

  Future<HttpClientRequest> postUrl(Uri url) =>
      throw UnsupportedError('HttpClient not supported on web');

  void close({bool force = false}) {}
}

class HttpClientRequest {
  bool followRedirects = true;
  int maxRedirects = 5;
  final HttpHeaders headers = HttpHeaders._();

  Future<HttpClientResponse> close() =>
      throw UnsupportedError('HttpClientRequest not supported on web');
}

class HttpClientResponse {
  int get statusCode => 0;
  HttpHeaders get headers => HttpHeaders._();
  List<RedirectInfo> get redirects => [];
  int get contentLength => -1;

  StreamSubscription<List<int>> listen(
    void Function(List<int>)? onData, {
    Function? onError,
    void Function()? onDone,
    bool? cancelOnError,
  }) =>
      throw UnsupportedError('HttpClientResponse not supported on web');

  Future<E> drain<E>([E? futureValue]) async =>
      futureValue as E;
}

class RedirectInfo {
  final int statusCode;
  final String method;
  final Uri location;
  RedirectInfo._()
      : statusCode = 0,
        method = '',
        location = Uri();
}

// ---------------------------------------------------------------------------
// HttpHeaders / ContentType
// ---------------------------------------------------------------------------

class HttpHeaders {
  HttpHeaders._();

  static const String userAgentHeader = 'user-agent';
  static const String locationHeader = 'location';
  static const String contentTypeHeader = 'content-type';
  static const String contentLengthHeader = 'content-length';
  static const String acceptHeader = 'accept';
  static const String hostHeader = 'host';

  void set(String name, Object value, {bool preserveHeaderCase = false}) {}
  void add(String name, Object value, {bool preserveHeaderCase = false}) {}
  String? value(String name) => null;
  List<String>? operator [](String name) => null;
  void removeAll(String name) {}

  ContentType? get contentType => null;
  set contentType(ContentType? ct) {}
}

class ContentType {
  final String primaryType;
  final String subType;
  final String mimeType;
  final String? charset;

  ContentType(this.primaryType, this.subType, {this.charset})
      : mimeType = '$primaryType/$subType';

  static final ContentType html = ContentType('text', 'html', charset: 'utf-8');
  static final ContentType json =
      ContentType('application', 'json', charset: 'utf-8');
  static final ContentType text = ContentType('text', 'plain', charset: 'utf-8');
  static final ContentType binary =
      ContentType('application', 'octet-stream');
}

// ---------------------------------------------------------------------------
// Internet / Network
// ---------------------------------------------------------------------------

class InternetAddressType {
  final int _value;
  const InternetAddressType._(this._value);
  // ignore: constant_identifier_names
  static const InternetAddressType IPv4 = InternetAddressType._(0);
  // ignore: constant_identifier_names
  static const InternetAddressType IPv6 = InternetAddressType._(1);
  static const InternetAddressType any = InternetAddressType._(2);
}

class InternetAddress {
  final String address;
  final String host;
  final InternetAddressType type;

  InternetAddress(this.address, {InternetAddressType? type})
      : host = address,
        type = type ?? InternetAddressType.IPv4;

  static final InternetAddress anyIPv4 = InternetAddress('0.0.0.0');
  static final InternetAddress anyIPv6 = InternetAddress('::');
  static final InternetAddress loopbackIPv4 = InternetAddress('127.0.0.1');
  static final InternetAddress loopbackIPv6 = InternetAddress('::1');

  bool get isLoopback =>
      address == '127.0.0.1' || address == '::1';

  @override
  String toString() => address;
}

class NetworkInterface {
  final String name;
  final List<InternetAddress> addresses;

  NetworkInterface._(this.name, this.addresses);

  static Future<List<NetworkInterface>> list({
    bool includeLoopback = false,
    bool includeLinkLocal = false,
    InternetAddressType type = InternetAddressType.any,
  }) async =>
      [];
}

// ---------------------------------------------------------------------------
// Sockets
// ---------------------------------------------------------------------------

class Socket {
  static Future<Socket> connect(Object host, int port,
          {Object? sourceAddress, int sourcePort = 0, Duration? timeout}) =>
      throw UnsupportedError('Socket not supported on web');

  StreamSubscription<Uint8List> listen(
    void Function(Uint8List)? onData, {
    Function? onError,
    void Function()? onDone,
    bool? cancelOnError,
  }) =>
      throw UnsupportedError('Socket not supported on web');

  void add(List<int> data) {}
  Future close() async {}
  void destroy() {}
  int get port => 0;
  InternetAddress get address => InternetAddress('0.0.0.0');
  InternetAddress get remoteAddress => InternetAddress('0.0.0.0');
  int get remotePort => 0;
}

class RawDatagramSocket {
  bool broadcastEnabled = false;
  bool readEventsEnabled = true;
  bool writeEventsEnabled = true;

  static Future<RawDatagramSocket> bind(Object host, int port,
          {bool reuseAddress = true, bool reusePort = false}) =>
      throw UnsupportedError('RawDatagramSocket not supported on web');

  int send(List<int> buffer, InternetAddress address, int port) => 0;

  Datagram? receive() => null;

  void joinMulticast(InternetAddress group, [NetworkInterface? interface_]) {}
  void leaveMulticast(InternetAddress group, [NetworkInterface? interface_]) {}

  StreamSubscription<RawSocketEvent> listen(
    void Function(RawSocketEvent)? onData, {
    Function? onError,
    void Function()? onDone,
    bool? cancelOnError,
  }) =>
      throw UnsupportedError('RawDatagramSocket not supported on web');

  void close() {}
  int get port => 0;
  InternetAddress get address => InternetAddress('0.0.0.0');
}

enum RawSocketEvent { read, write, readClosed, closed }

class Datagram {
  final Uint8List data;
  final InternetAddress address;
  final int port;
  Datagram(this.data, this.address, this.port);
}

class SocketException implements IOException {
  @override
  final String message;
  final OSError? osError;
  final InternetAddress? address;
  final int? port;

  const SocketException(this.message, {this.osError, this.address, this.port});

  @override
  String toString() => 'SocketException: $message';
}

// ---------------------------------------------------------------------------
// Compression
// ---------------------------------------------------------------------------

class GZipCodec {
  const GZipCodec();
  List<int> decode(List<int> encoded) =>
      throw UnsupportedError('GZipCodec not supported on web');
  List<int> encode(List<int> data) =>
      throw UnsupportedError('GZipCodec not supported on web');
}

// ---------------------------------------------------------------------------
// IOException / OSError
// ---------------------------------------------------------------------------

class IOException implements Exception {
  final String? message;
  const IOException([this.message]);
  @override
  String toString() => message ?? 'IOException';
}

class OSError {
  final String message;
  final int errorCode;
  const OSError([this.message = '', this.errorCode = -1]);
  @override
  String toString() => 'OS Error: $message, errno = $errorCode';
}

// ---------------------------------------------------------------------------
// Process (minimal)
// ---------------------------------------------------------------------------

class ProcessResult {
  final int pid;
  final int exitCode;
  final dynamic stdout;
  final dynamic stderr;
  ProcessResult(this.pid, this.exitCode, this.stdout, this.stderr);
}

class Process {
  static Future<ProcessResult> run(String executable, List<String> arguments,
          {String? workingDirectory,
          Map<String, String>? environment,
          bool includeParentEnvironment = true,
          bool runInShell = false,
          Encoding? stdoutEncoding,
          Encoding? stderrEncoding}) =>
      throw UnsupportedError('Process not supported on web');
}

// ---------------------------------------------------------------------------
// exit() stub
// ---------------------------------------------------------------------------

Never exit(int code) =>
    throw UnsupportedError('exit() not supported on web');

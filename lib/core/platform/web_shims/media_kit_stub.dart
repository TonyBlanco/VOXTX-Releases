/// Web stub for `package:media_kit/media_kit.dart`.
///
/// Provides the type shells used across the codebase so that the web build
/// compiles.  Every constructor / method is a no-op or throws.
// ignore_for_file: unused_field

import 'dart:async';

// ---------------------------------------------------------------------------
// MediaKit bootstrap
// ---------------------------------------------------------------------------

class MediaKit {
  static void ensureInitialized() {
    // No-op on web — media_kit is not available.
  }
}

// ---------------------------------------------------------------------------
// MPVLogLevel
// ---------------------------------------------------------------------------

class MPVLogLevel {
  final String _name;
  const MPVLogLevel._(this._name);
  static const MPVLogLevel none = MPVLogLevel._('none');
  static const MPVLogLevel debug = MPVLogLevel._('debug');
  static const MPVLogLevel info = MPVLogLevel._('info');
  static const MPVLogLevel warn = MPVLogLevel._('warn');
  static const MPVLogLevel error = MPVLogLevel._('error');

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      other is MPVLogLevel && other._name == _name;

  @override
  int get hashCode => _name.hashCode;

  @override
  String toString() => 'MPVLogLevel.$_name';
}

// ---------------------------------------------------------------------------
// PlayerConfiguration
// ---------------------------------------------------------------------------

class PlayerConfiguration {
  final int bufferSize;
  final String? vo;
  final MPVLogLevel logLevel;

  const PlayerConfiguration({
    this.bufferSize = 32 * 1024 * 1024,
    this.vo,
    this.logLevel = MPVLogLevel.error,
  });
}

// ---------------------------------------------------------------------------
// Player
// ---------------------------------------------------------------------------

class Player {
  final PlayerStreams _streams = PlayerStreams();
  final PlayerState _state = PlayerState._();

  Player({PlayerConfiguration? configuration});

  PlayerStreams get stream => _streams;
  PlayerState get state => _state;

  Future<void> open(Playable playable, {bool play = true}) async {}
  Future<void> play() async {}
  Future<void> pause() async {}
  Future<void> playOrPause() async {}
  Future<void> stop() async {}
  Future<void> seek(Duration duration) async {}
  Future<void> setVolume(double volume) async {}
  Future<void> setRate(double rate) async {}
  Future<void> dispose() async {}

  Future<void> setPlaylistMode(PlaylistMode mode) async {}
  Future<void> setAudioTrack(AudioTrack track) async {}
  Future<void> setSubtitleTrack(SubtitleTrack track) async {}
  Future<void> setVideoTrack(VideoTrack track) async {}
  Future<void> setProperty(String property, String value) async {}
}

// ---------------------------------------------------------------------------
// PlayerState
// ---------------------------------------------------------------------------

class PlayerState {
  PlayerState._();
  bool get playing => false;
  bool get completed => false;
  Duration get position => Duration.zero;
  Duration get duration => Duration.zero;
  double get volume => 100.0;
  double get rate => 1.0;
  int? get width => null;
  int? get height => null;
  Tracks get tracks => Tracks();
  double get buffer => 0;
  Duration get buffering => Duration.zero;
}

// ---------------------------------------------------------------------------
// PlayerStreams
// ---------------------------------------------------------------------------

class PlayerStreams {
  Stream<bool> get playing => const Stream.empty();
  Stream<bool> get completed => const Stream.empty();
  Stream<Duration> get position => const Stream.empty();
  Stream<Duration> get duration => const Stream.empty();
  Stream<Duration> get buffer => const Stream.empty();
  Stream<bool> get buffering => const Stream.empty();
  Stream<double> get volume => const Stream.empty();
  Stream<double> get rate => const Stream.empty();
  Stream<int?> get width => const Stream.empty();
  Stream<int?> get height => const Stream.empty();
  Stream<String> get error => const Stream.empty();
  Stream<Tracks> get tracks => const Stream.empty();
  Stream<PlayerLog> get log => const Stream.empty();
}

// ---------------------------------------------------------------------------
// Playable / Media / Playlist
// ---------------------------------------------------------------------------

abstract class Playable {}

class Media extends Playable {
  final String uri;
  final Map<String, String>? extras;
  final Map<String, String>? httpHeaders;
  Media(this.uri, {this.extras, this.httpHeaders});
}

class Playlist extends Playable {
  final List<Media> medias;
  final int index;
  Playlist(this.medias, {this.index = 0});
}

enum PlaylistMode { none, single, loop }

// ---------------------------------------------------------------------------
// Tracks & Track types
// ---------------------------------------------------------------------------

class Track {
  final String id;
  final String? title;
  final String? language;
  final String? codec;
  final double? fps;
  final int? w;
  final int? h;
  Track(this.id, {this.title, this.language, this.codec, this.fps, this.w, this.h});
}

class AudioTrack extends Track {
  AudioTrack._() : super('');
  AudioTrack.auto() : super('auto');
  AudioTrack.no() : super('no');
  AudioTrack.uri(String uri, {String? title, String? language})
      : super(uri, title: title, language: language);
}

class SubtitleTrack extends Track {
  SubtitleTrack._() : super('');
  SubtitleTrack.auto() : super('auto');
  SubtitleTrack.no() : super('no');
  SubtitleTrack.uri(String uri, {String? title, String? language})
      : super(uri, title: title, language: language);
}

class VideoTrack extends Track {
  VideoTrack._() : super('');
  VideoTrack.auto() : super('auto');
  VideoTrack.no() : super('no');
}

class Tracks {
  final List<VideoTrack> video;
  final List<AudioTrack> audio;
  final List<SubtitleTrack> subtitle;
  Tracks({this.video = const [], this.audio = const [], this.subtitle = const []});
}

// ---------------------------------------------------------------------------
// PlayerLog
// ---------------------------------------------------------------------------

class PlayerLog {
  final String prefix;
  final MPVLogLevel level;
  final String text;
  PlayerLog({this.prefix = '', this.level = MPVLogLevel.error, this.text = ''});
}

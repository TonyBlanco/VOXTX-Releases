import 'package:flutter_test/flutter_test.dart';
import 'package:VoxTv/core/models/channel.dart';

void main() {
  group('Channel.type – stored channelType priority', () {
    Channel _make({
      String channelType = 'live',
      String? groupName,
      String url = 'http://server/stream/123',
    }) {
      return Channel(
        playlistId: 1,
        name: 'Test Channel',
        url: url,
        groupName: groupName,
        channelType: channelType,
      );
    }

    // ── Xtream VOD/Series stored type is always trusted ──────────────────

    test('channelType=vod → ChannelType.vod regardless of group or URL', () {
      final ch = _make(
        channelType: 'vod',
        groupName: 'Live TV',
        url: 'http://server/live/user/pass/1.ts',
      );
      expect(ch.type, ChannelType.vod);
      expect(ch.isSeekable, isTrue);
      expect(ch.isLive, isFalse);
    });

    test('channelType=series → ChannelType.vod (seekable)', () {
      final ch = _make(
        channelType: 'series',
        groupName: 'Live TV',
        url: 'http://server/live/user/pass/1.ts',
      );
      expect(ch.type, ChannelType.vod);
      expect(ch.isSeekable, isTrue);
    });

    // ── Xtream live: URL /live/ takes priority over group name ───────────

    test('channelType=live with /live/ URL → live even if group says "Movie"', () {
      final ch = _make(
        channelType: 'live',
        groupName: 'Movie Channels',
        url: 'http://server/live/user/pass/456.ts',
      );
      expect(ch.type, ChannelType.live);
      expect(ch.isLive, isTrue);
      expect(ch.isSeekable, isFalse);
    });

    test('channelType=live with /live/ URL → live even if group says "Documentary"', () {
      final ch = _make(
        channelType: 'live',
        groupName: 'Documentary HD',
        url: 'http://server/live/user/pass/789.m3u8',
      );
      expect(ch.type, ChannelType.live);
      expect(ch.isLive, isTrue);
    });

    test('channelType=live with /live/ URL → live even if group says "Anime"', () {
      final ch = _make(
        channelType: 'live',
        groupName: 'Anime & Series',
        url: 'http://server/live/user/pass/100.ts',
      );
      expect(ch.type, ChannelType.live);
    });

    // ── M3U heuristic still works (no /live/ in URL) ─────────────────────

    // ── M3U heuristic (no /live/ in URL, channelType defaults to 'live') ──

    test('M3U: group "Movies" → VOD', () {
      final ch = _make(
        groupName: 'Movies',
        url: 'http://server/stream1',
      );
      expect(ch.type, ChannelType.vod);
    });

    test('M3U: group "Live TV" → live', () {
      final ch = _make(
        groupName: 'Live TV',
        url: 'http://server/stream1',
      );
      expect(ch.type, ChannelType.live);
    });

    test('M3U: .mp4 URL → VOD regardless of group', () {
      final ch = _make(
        groupName: 'Misc',
        url: 'http://server/video.mp4',
      );
      expect(ch.type, ChannelType.vod);
    });

    test('M3U: /live/ URL overrides group heuristic', () {
      final ch = _make(
        channelType: 'live',
        groupName: 'Movies',
        url: 'http://server/live/user/pass/1.ts',
      );
      expect(ch.type, ChannelType.live);
    });

    test('M3U: group "Replay" → replay', () {
      final ch = _make(
        channelType: 'live',
        groupName: 'Replay & Catchup',
        url: 'http://server/stream/123',
      );
      expect(ch.type, ChannelType.replay);
    });

    test('M3U: .m3u8 URL with unmatched group → live', () {
      final ch = _make(
        channelType: 'live',
        groupName: 'Misc',
        url: 'http://server/stream/channel1.m3u8',
      );
      expect(ch.type, ChannelType.live);
    });

    test('M3U: unknown group & URL → unknown', () {
      final ch = _make(
        channelType: 'live',
        groupName: 'Misc Stuff',
        url: 'http://server/random/path',
      );
      expect(ch.type, ChannelType.unknown);
    });

    // ── isSeekable / isLive consistency ──────────────────────────────────

    test('isSeekable is true for VOD and replay, false for live', () {
      expect(_make(channelType: 'vod').isSeekable, isTrue);
      expect(_make(channelType: 'series').isSeekable, isTrue);
      expect(
        _make(url: 'http://s/live/u/p/1.ts').isSeekable,
        isFalse,
      );
    });

    test('isLive is true only for live type', () {
      expect(
        _make(url: 'http://s/live/u/p/1.ts').isLive,
        isTrue,
      );
      expect(_make(channelType: 'vod').isLive, isFalse);
      expect(_make(channelType: 'series').isLive, isFalse);
    });
  });
}

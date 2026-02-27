import 'package:shared_preferences/shared_preferences.dart';

class WatchLaterService {
  static const String _keyWatchLaterChannelIds = 'watch_later_channel_ids';

  final SharedPreferences _prefs;
  final Set<int> _ids = {};

  WatchLaterService(this._prefs) {
    _load();
  }

  void _load() {
    final raw = _prefs.getStringList(_keyWatchLaterChannelIds) ?? const <String>[];
    _ids
      ..clear()
      ..addAll(raw.map(int.tryParse).whereType<int>());
  }

  List<int> getIds() => _ids.toList();

  bool contains(int? channelId) {
    if (channelId == null) return false;
    return _ids.contains(channelId);
  }

  Future<void> add(int? channelId) async {
    if (channelId == null) return;
    _ids.add(channelId);
    await _save();
  }

  Future<void> remove(int? channelId) async {
    if (channelId == null) return;
    _ids.remove(channelId);
    await _save();
  }

  Future<bool> toggle(int? channelId) async {
    if (channelId == null) return false;
    if (_ids.contains(channelId)) {
      _ids.remove(channelId);
      await _save();
      return false;
    }
    _ids.add(channelId);
    await _save();
    return true;
  }

  Future<void> _save() async {
    final values = _ids.map((id) => id.toString()).toList();
    await _prefs.setStringList(_keyWatchLaterChannelIds, values);
  }
}

import 'dart:async';
import 'service_locator.dart';

/// 
/// 
class AutoRefreshService {
  static final AutoRefreshService _instance = AutoRefreshService._internal();
  factory AutoRefreshService() => _instance;
  AutoRefreshService._internal();

  Timer? _timer;
  bool _isEnabled = false;
  int _intervalHours = 24;
  DateTime? _lastRefreshTime;
  Function()? _onRefreshCallback;

  bool get isEnabled => _isEnabled;
  int get intervalHours => _intervalHours;
  DateTime? get lastRefreshTime => _lastRefreshTime;

  /// 
  void start({required int intervalHours, required Function() onRefresh}) {
    stop(); // 

    _isEnabled = true;
    _intervalHours = intervalHours;
    _onRefreshCallback = onRefresh;

    ServiceLocator.log.i(': $intervalHours', tag: 'AutoRefresh');

    // 
    _timer = Timer.periodic(const Duration(hours: 1), (timer) {
      _checkAndRefresh();
    });
  }

  /// 
  void stop() {
    _timer?.cancel();
    _timer = null;
    _isEnabled = false;
    _onRefreshCallback = null;
    ServiceLocator.log.i('', tag: 'AutoRefresh');
  }

  /// 
  void checkOnStartup() {
    if (!_isEnabled || _onRefreshCallback == null) {
      ServiceLocator.log.d('AutoRefresh: ');
      return;
    }
    
    ServiceLocator.log.d('', tag: 'AutoRefresh');
    _checkAndRefresh();
  }

  /// 
  void _checkAndRefresh() {
    if (!_isEnabled || _onRefreshCallback == null) {
      ServiceLocator.log.d('AutoRefresh: ');
      return;
    }

    final now = DateTime.now();
    
    ServiceLocator.log.d('AutoRefresh: ');
    ServiceLocator.log.d('AutoRefresh: : $now');
    ServiceLocator.log.d('AutoRefresh: : $_lastRefreshTime');
    ServiceLocator.log.d('AutoRefresh: : $_intervalHours ');
    
    // 
    if (_lastRefreshTime == null) {
      ServiceLocator.log.d('', tag: 'AutoRefresh');
      _lastRefreshTime = now;
      _saveLastRefreshTime();
      return;
    }
    
    // 
    final hoursSinceLastRefresh = now.difference(_lastRefreshTime!).inHours;
    ServiceLocator.log.d('AutoRefresh: : $hoursSinceLastRefresh ');
    
    if (hoursSinceLastRefresh >= _intervalHours) {
      ServiceLocator.log.i('($hoursSinceLastRefresh >= $_intervalHours)', tag: 'AutoRefresh');
      _lastRefreshTime = now;
      _saveLastRefreshTime();
      _onRefreshCallback!();
    } else {
      final remainingHours = _intervalHours - hoursSinceLastRefresh;
      ServiceLocator.log.d(' $remainingHours ', tag: 'AutoRefresh');
    }
  }

  /// 
  Future<void> loadLastRefreshTime() async {
    try {
      final timestamp = ServiceLocator.prefs.getInt('last_auto_refresh_time');
      if (timestamp != null) {
        _lastRefreshTime = DateTime.fromMillisecondsSinceEpoch(timestamp);
        ServiceLocator.log.d(': $_lastRefreshTime', tag: 'AutoRefresh');
      }
    } catch (e) {
      ServiceLocator.log.e('', tag: 'AutoRefresh', error: e);
    }
  }

  /// 
  Future<void> _saveLastRefreshTime() async {
    try {
      if (_lastRefreshTime != null) {
        await ServiceLocator.prefs.setInt(
          'last_auto_refresh_time',
          _lastRefreshTime!.millisecondsSinceEpoch,
        );
      }
    } catch (e) {
      ServiceLocator.log.d('AutoRefresh: : $e');
    }
  }

  /// 
  void manualRefresh() {
    _lastRefreshTime = DateTime.now();
    _saveLastRefreshTime();
    ServiceLocator.log.d('AutoRefresh: ');
  }

  /// 
  int? getHoursUntilNextRefresh() {
    if (_lastRefreshTime == null || !_isEnabled) return null;
    
    final now = DateTime.now();
    final elapsed = now.difference(_lastRefreshTime!).inHours;
    final remaining = _intervalHours - elapsed;
    
    return remaining > 0 ? remaining : 0;
  }
}

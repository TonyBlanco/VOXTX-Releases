import 'dart:async';
import 'package:flutter/widgets.dart';

/// ✅  setState Mixin setState 
/// 
/// 
/// ```dart
/// class MyWidget extends StatefulWidget {
///   ...
/// }
/// 
/// class _MyWidgetState extends State<MyWidget> with ThrottledStateMixin {
///   void someMethod() {
///     //  setState100ms
///     throttledSetState(() {
///       _someValue = newValue;
///     });
///     
///     //  setState
///     immediateSetState(() {
///       _importantValue = newValue;
///     });
///   }
/// }
/// ```
mixin ThrottledStateMixin<T extends StatefulWidget> on State<T> {
  Timer? _setStateTimer;
  VoidCallback? _pendingSetState;
  static const _throttleDuration = Duration(milliseconds: 300);

  ///  setState100ms
  void throttledSetState(VoidCallback fn) {
    _pendingSetState = fn;
    
    // 
    if (_setStateTimer?.isActive ?? false) {
      return;
    }

    // 
    _setStateTimer = Timer(_throttleDuration, () {
      if (_pendingSetState != null && mounted) {
        setState(_pendingSetState!);
        _pendingSetState = null;
      }
    });
  }

  ///  setState
  void immediateSetState(VoidCallback fn) {
    _setStateTimer?.cancel();
    _pendingSetState = null;
    if (mounted) {
      setState(fn);
    }
  }

  ///  setState /
  void clearPendingSetState() {
    _setStateTimer?.cancel();
    _pendingSetState = null;
  }

  @override
  void dispose() {
    clearPendingSetState();
    super.dispose();
  }
}

// tv_focus_manager.dart
// Centralised Android TV / D-Pad focus helpers.
//
// Public API:
//   TvFocusManager.instance          — singleton: save / restore focus around
//                                       dialogs, menus, and the player screen
//   TvScreenWrapper                  — per-screen FocusTraversalGroup + auto
//                                       initial-focus on mount
//   TvAppFocusWrapper                — root-level FocusTraversalGroup injected
//                                       in MaterialApp.builder when isTV == true
//   TvTextField                      — drop-in TextField that activates the
//                                       Android TV virtual keyboard correctly
//                                       and restores D-Pad focus after editing

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

import '../platform/platform_detector.dart';

// ---------------------------------------------------------------------------
// 1. TvFocusManager — navigation-level save / restore
// ---------------------------------------------------------------------------

/// Singleton that saves the currently focused widget before pushing a new
/// route (dialog, menu, player) and restores it as soon as the route is
/// popped.  Use it like this:
///
/// ```dart
/// TvFocusManager.instance.saveFocus();
/// await showDialog(...);
/// TvFocusManager.instance.restoreFocus();
/// ```
class TvFocusManager {
  TvFocusManager._();
  static final instance = TvFocusManager._();

  FocusNode? _savedFocus;

  /// Snapshot the currently focused [FocusNode] so it can be resurrected.
  void saveFocus() {
    _savedFocus = FocusManager.instance.primaryFocus;
  }

  /// Re-request focus on the previously saved [FocusNode].
  /// Safe to call even when the node has been disposed or unmounted.
  void restoreFocus() {
    final node = _savedFocus;
    _savedFocus = null;

    if (node == null) return;

    WidgetsBinding.instance.addPostFrameCallback((_) {
      if (node.context != null && node.canRequestFocus) {
        node.requestFocus();
      }
    });
  }

  /// Convenience: give focus to the first focusable descendant in [context].
  /// Call this from a screen's `initState` via `addPostFrameCallback`.
  static void requestFirstFocus(BuildContext context) {
    if (!PlatformDetector.isTV && !PlatformDetector.isDesktop) return;
    WidgetsBinding.instance.addPostFrameCallback((_) {
      if (context.mounted) {
        FocusScope.of(context).nextFocus();
      }
    });
  }
}

// ---------------------------------------------------------------------------
// 2. TvScreenWrapper — per-screen traversal group + auto focus
// ---------------------------------------------------------------------------

/// Wrap every full screen in a [TvScreenWrapper] so that:
///   • Arrow-key traversal is scoped to the screen (no "leaking" out).
///   • The first focusable widget is highlighted automatically when the screen
///     appears, so the user never starts from a blank state.
///
/// ```dart
/// @override
/// Widget build(BuildContext context) {
///   return TvScreenWrapper(
///     child: Scaffold(...),
///   );
/// }
/// ```
///
/// If you want to control which widget receives the first focus (e.g. the
/// "play" button), pass [initialFocusNode]:
///
/// ```dart
/// TvScreenWrapper(
///   initialFocusNode: _playButtonFocusNode,
///   child: ...,
/// )
/// ```
class TvScreenWrapper extends StatefulWidget {
  const TvScreenWrapper({
    super.key,
    required this.child,
    this.initialFocusNode,
    this.autoFocus = true,
    this.traversalPolicy,
  });

  final Widget child;

  /// If provided, this node will be focused when the screen mounts.
  final FocusNode? initialFocusNode;

  /// Whether to request focus automatically on mount (default: true).
  final bool autoFocus;

  /// Override the traversal policy. Defaults to [ReadingOrderTraversalPolicy].
  final FocusTraversalPolicy? traversalPolicy;

  @override
  State<TvScreenWrapper> createState() => _TvScreenWrapperState();
}

class _TvScreenWrapperState extends State<TvScreenWrapper> {
  @override
  void initState() {
    super.initState();
    if (widget.autoFocus && (PlatformDetector.isTV || PlatformDetector.isDesktop)) {
      WidgetsBinding.instance.addPostFrameCallback((_) {
        if (!mounted) return;
        final node = widget.initialFocusNode;
        if (node != null && node.canRequestFocus) {
          node.requestFocus();
        } else {
          FocusScope.of(context).nextFocus();
        }
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    return FocusTraversalGroup(
      policy: widget.traversalPolicy ?? ReadingOrderTraversalPolicy(),
      child: widget.child,
    );
  }
}

// ---------------------------------------------------------------------------
// 3. TvAppFocusWrapper — root MaterialApp.builder wrapper
// ---------------------------------------------------------------------------

/// Inject one [FocusTraversalGroup] at the very root of the widget tree.
/// Without a root group the framework cannot determine a traversal scope for
/// arrow keys and `FocusTraversalPolicy.nextFocus` calls have no effect.
///
/// Used in [MaterialApp.builder]:
///
/// ```dart
/// builder: (context, child) {
///   Widget built = MediaQuery(..., child: child!);
///   if (PlatformDetector.isTV) built = TvAppFocusWrapper(child: built);
///   return built;
/// }
/// ```
class TvAppFocusWrapper extends StatelessWidget {
  const TvAppFocusWrapper({super.key, required this.child});

  final Widget child;

  @override
  Widget build(BuildContext context) {
    return FocusTraversalGroup(
      policy: ReadingOrderTraversalPolicy(),
      child: child,
    );
  }
}

// ---------------------------------------------------------------------------
// 4. TvTextField — keyboard-safe TextField for Android TV
// ---------------------------------------------------------------------------

/// A drop-in replacement for [TextField] that works correctly on Android TV:
///
/// • Registers a dedicated [FocusNode] so the IME can track it.
/// • Enables the soft keyboard via [TextInputAction] when the field is focused
///   (i.e. the user pressed OK / centre D-Pad).
/// • After the user submits (or dismisses) editing, focus returns to the next
///   logical item in the FocusTraversalGroup — no focus trap.
///
/// Usage mirrors [TextField]:
///
/// ```dart
/// TvTextField(
///   controller: _searchController,
///   hintText: 'Search channels…',
///   onSubmitted: (value) { /* handle search */ },
/// )
/// ```
class TvTextField extends StatefulWidget {
  const TvTextField({
    super.key,
    this.controller,
    this.focusNode,
    this.hintText,
    this.labelText,
    this.prefixIcon,
    this.suffixIcon,
    this.obscureText = false,
    this.keyboardType,
    this.textInputAction = TextInputAction.done,
    this.style,
    this.decoration,
    this.onChanged,
    this.onSubmitted,
    this.onEditingComplete,
    this.autofocus = false,
    this.maxLines = 1,
    this.minLines,
    this.enabled = true,
    this.textCapitalization = TextCapitalization.none,
  });

  final TextEditingController? controller;
  final FocusNode? focusNode;
  final String? hintText;
  final String? labelText;
  final Widget? prefixIcon;
  final Widget? suffixIcon;
  final bool obscureText;
  final TextInputType? keyboardType;
  final TextInputAction textInputAction;
  final TextStyle? style;
  final InputDecoration? decoration;
  final ValueChanged<String>? onChanged;
  final ValueChanged<String>? onSubmitted;
  final VoidCallback? onEditingComplete;
  final bool autofocus;
  final int maxLines;
  final int? minLines;
  final bool enabled;
  final TextCapitalization textCapitalization;

  @override
  State<TvTextField> createState() => _TvTextFieldState();
}

class _TvTextFieldState extends State<TvTextField> {
  late FocusNode _focusNode;
  bool _ownsNode = false;

  @override
  void initState() {
    super.initState();
    if (widget.focusNode != null) {
      _focusNode = widget.focusNode!;
    } else {
      _focusNode = FocusNode();
      _ownsNode = true;
    }
  }

  @override
  void dispose() {
    if (_ownsNode) _focusNode.dispose();
    super.dispose();
  }

  void _handleSubmitted(String value) {
    widget.onSubmitted?.call(value);

    if (PlatformDetector.isTV) {
      // Dismiss keyboard and hand focus back to the traversal group.
      _focusNode.unfocus();
      WidgetsBinding.instance.addPostFrameCallback((_) {
        if (mounted) FocusScope.of(context).nextFocus();
      });
    }
  }

  void _handleEditingComplete() {
    widget.onEditingComplete?.call();

    if (PlatformDetector.isTV) {
      _focusNode.unfocus();
      WidgetsBinding.instance.addPostFrameCallback((_) {
        if (mounted) FocusScope.of(context).nextFocus();
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    final effectiveDecoration = (widget.decoration ??
            InputDecoration(
              hintText: widget.hintText,
              labelText: widget.labelText,
              prefixIcon: widget.prefixIcon,
              suffixIcon: widget.suffixIcon,
            ))
        .applyDefaults(Theme.of(context).inputDecorationTheme);

    return TextField(
      controller: widget.controller,
      focusNode: _focusNode,
      obscureText: widget.obscureText,
      keyboardType: widget.keyboardType,
      textInputAction: widget.textInputAction,
      style: widget.style,
      decoration: effectiveDecoration,
      onChanged: widget.onChanged,
      onSubmitted: _handleSubmitted,
      onEditingComplete: _handleEditingComplete,
      autofocus: widget.autofocus,
      maxLines: widget.maxLines,
      minLines: widget.minLines,
      enabled: widget.enabled,
      textCapitalization: widget.textCapitalization,
      // On TV, the keyboard is triggered by focus; keep it touchable so
      // that the standard IME path fires when the user presses OK.
      keyboardAppearance: Brightness.dark,
    );
  }
}

// ---------------------------------------------------------------------------
// 5. TvKeyboardListener — raw D-Pad event helper for custom widgets
// ---------------------------------------------------------------------------

/// Convenience widget that listens for D-Pad / arrow-key events and exposes
/// typed callbacks.  Handles both [KeyDownEvent] *and* [KeyRepeatEvent] so
/// held keys work on Xiaomi Mi Box and similar devices.
///
/// Use this when building custom lists, carousels, or grids that need to
/// intercept arrow keys before the framework traversal runs.
///
/// ```dart
/// TvKeyboardListener(
///   onLeft:  () => _scrollLeft(),
///   onRight: () => _scrollRight(),
///   child: HorizontalCarousel(...),
/// )
/// ```
class TvKeyboardListener extends StatelessWidget {
  const TvKeyboardListener({
    super.key,
    required this.child,
    this.focusNode,
    this.onUp,
    this.onDown,
    this.onLeft,
    this.onRight,
    this.onSelect,
    this.autofocus = false,
  });

  final Widget child;
  final FocusNode? focusNode;
  final VoidCallback? onUp;
  final VoidCallback? onDown;
  final VoidCallback? onLeft;
  final VoidCallback? onRight;
  final VoidCallback? onSelect;
  final bool autofocus;

  KeyEventResult _handleKey(FocusNode node, KeyEvent event) {
    // Accept both initial press and held-key repeats (Xiaomi Mi Box sends
    // KeyRepeatEvent for every ~50 ms the user holds an arrow).
    if (event is! KeyDownEvent && event is! KeyRepeatEvent) {
      return KeyEventResult.ignored;
    }

    switch (event.logicalKey) {
      case LogicalKeyboardKey.arrowUp:
        if (onUp != null) { onUp!(); return KeyEventResult.handled; }
      case LogicalKeyboardKey.arrowDown:
        if (onDown != null) { onDown!(); return KeyEventResult.handled; }
      case LogicalKeyboardKey.arrowLeft:
        if (onLeft != null) { onLeft!(); return KeyEventResult.handled; }
      case LogicalKeyboardKey.arrowRight:
        if (onRight != null) { onRight!(); return KeyEventResult.handled; }
      case LogicalKeyboardKey.select:
      case LogicalKeyboardKey.enter:
        if (onSelect != null) { onSelect!(); return KeyEventResult.handled; }
    }

    return KeyEventResult.ignored;
  }

  @override
  Widget build(BuildContext context) {
    return Focus(
      focusNode: focusNode,
      autofocus: autofocus,
      onKeyEvent: _handleKey,
      child: child,
    );
  }
}

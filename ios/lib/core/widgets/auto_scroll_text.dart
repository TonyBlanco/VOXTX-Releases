import 'dart:async';
import 'package:flutter/material.dart';

class AutoScrollText extends StatefulWidget {
  final String text;
  final TextStyle? style;
  final double scrollSpeed;
  final Duration scrollDelay;
  final TextAlign textAlign;
  final bool forceScroll; // 

  const AutoScrollText({
    super.key,
    required this.text,
    this.style,
    this.scrollSpeed = 30.0,
    this.scrollDelay = const Duration(milliseconds: 1000),
    this.textAlign = TextAlign.left,
    this.forceScroll = false, // false
    double? width, // 
  });

  @override
  State<AutoScrollText> createState() => _AutoScrollTextState();
}

class _AutoScrollTextState extends State<AutoScrollText>
    with SingleTickerProviderStateMixin {
  late AnimationController _controller;
  late Animation<double> _animation;
  bool _isOverflowing = false;
  bool _isHovering = false;
  double _scrollDistance = 0;
  final GlobalKey _textKey = GlobalKey();

  @override
  void initState() {
    super.initState();
    _controller = AnimationController(
        vsync: this, duration: const Duration(seconds: 2) // 
        );

    _animation = Tween<double>(begin: 0.0, end: 1.0).animate(
      CurvedAnimation(parent: _controller, curve: Curves.linear),
    );

    WidgetsBinding.instance.addPostFrameCallback((_) => _checkOverflow());
  }

  @override
  void didUpdateWidget(AutoScrollText oldWidget) {
    super.didUpdateWidget(oldWidget);
    if (oldWidget.text != widget.text || oldWidget.style != widget.style) {
      // 
      _controller.stop();
      _controller.reset();
      _checkOverflow();
    }
    
    //  forceScroll 
    if (oldWidget.forceScroll != widget.forceScroll) {
      if (widget.forceScroll && _isOverflowing) {
        _startScrolling();
      } else if (!widget.forceScroll && !_isHovering) {
        _controller.stop();
        _controller.animateTo(0, duration: const Duration(milliseconds: 300));
      }
    }
  }

  void _checkOverflow() {
    // 
    WidgetsBinding.instance.addPostFrameCallback((_) {
      if (!mounted) return;

      final RenderBox? renderBox =
          _textKey.currentContext?.findRenderObject() as RenderBox?;
      if (renderBox != null) {
        final textPainter = TextPainter(
          text: TextSpan(text: widget.text, style: widget.style),
          maxLines: 1,
          textDirection: TextDirection.ltr,
        )..layout();

        final containerWidth = renderBox.size.width;
        final textWidth = textPainter.width;

        if (textWidth > containerWidth) {
          final distance = textWidth - containerWidth + 20; // 
          final durationSeconds = distance / widget.scrollSpeed;

          setState(() {
            _isOverflowing = true;
            _scrollDistance = distance;
            _controller.duration =
                Duration(milliseconds: (durationSeconds * 1000).toInt());
          });

          //  Hover 
          if (_isHovering || widget.forceScroll) {
            _startScrolling();
          }
        } else {
          if (_isOverflowing) {
            setState(() {
              _isOverflowing = false;
            });
            _controller.reset();
          }
        }
      }
    });
  }

  void _onHover(bool hovering) {
    setState(() {
      _isHovering = hovering;
    });

    if (hovering || widget.forceScroll) {
      //  Hover 
      _checkOverflow();
    } else {
      // Hover 
      _controller.stop();
      _controller.animateTo(0, duration: const Duration(milliseconds: 300));
    }
  }

  void _startScrolling() {
    // 
    Future.delayed(widget.scrollDelay, () {
      if (mounted && (_isHovering || widget.forceScroll) && _isOverflowing) {
        if (!_controller.isAnimating) {
          _controller.repeat(reverse: true);
        }
      }
    });
  }

  @override
  void dispose() {
    _controller.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    //  MouseRegion  Hover
    return MouseRegion(
      onEnter: (_) => _onHover(true),
      onExit: (_) => _onHover(false),
      child: !_isOverflowing
          ? Text(
              widget.text,
              key: _textKey,
              style: widget.style,
              maxLines: 1,
              overflow: TextOverflow.ellipsis,
              textAlign: widget.textAlign,
            )
          : ClipRect(
              child: AnimatedBuilder(
                animation: _animation,
                builder: (context, child) {
                  return Transform.translate(
                    offset: Offset(-_animation.value * _scrollDistance, 0),
                    child: Text(
                      widget.text,
                      key: _textKey, //  Key 
                      style: widget.style,
                      maxLines: 1,
                      overflow: TextOverflow.visible, // 
                      softWrap: false,
                    ),
                  );
                },
              ),
            ),
    );
  }
}

import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../theme/app_theme.dart';
import '../i18n/app_strings.dart';
import '../../features/settings/providers/settings_provider.dart';
import 'tv_focusable.dart';
import '../services/service_locator.dart';

/// 
/// 
class CustomColorPickerDialog extends StatefulWidget {
  const CustomColorPickerDialog({super.key});

  @override
  State<CustomColorPickerDialog> createState() => _CustomColorPickerDialogState();
}

class _CustomColorPickerDialogState extends State<CustomColorPickerDialog> {
  Color _selectedColor = const Color(0xFFB39DDB); // 
  final FocusNode _firstColorFocusNode = FocusNode();
  
  @override
  void initState() {
    super.initState();
    
    // 
    _loadCurrentCustomColor();
    
    // 
    WidgetsBinding.instance.addPostFrameCallback((_) {
      if (mounted) {
        _firstColorFocusNode.requestFocus();
      }
    });
  }
  
  /// 
  void _loadCurrentCustomColor() {
    final settings = context.read<SettingsProvider>();
    
    // ID
    final isDarkMode = _isDarkMode(context, settings);
    final currentSchemeId = isDarkMode 
        ? settings.darkColorScheme 
        : settings.lightColorScheme;
    
    // 
    if (currentSchemeId.startsWith('custom_')) {
      try {
        // : custom_AARRGGBB
        final colorHex = currentSchemeId.substring(7); //  "custom_" 
        final colorValue = int.parse(colorHex, radix: 16);
        _selectedColor = Color(colorValue);
      } catch (e) {
        // 
        ServiceLocator.log.d('Failed to parse custom color: $e');
      }
    }
  }
  
  @override
  void dispose() {
    _firstColorFocusNode.dispose();
    super.dispose();
  }
  
  //  - 
  static const List<Color> _presetColors = [
    // 
    Color(0xFFF8BBD0), // 
    Color(0xFFF48FB1),
    Color(0xFFE1BEE7), // 
    Color(0xFFCE93D8),
    Color(0xFFD1C4E9), // 
    Color(0xFFB39DDB),
    
    // 
    Color(0xFFBBDEFB), // 
    Color(0xFF90CAF9),
    Color(0xFFB3E5FC), // 
    Color(0xFF81D4FA),
    Color(0xFFB2EBF2), // 
    Color(0xFF80DEEA),
    
    // 
    Color(0xFFC8E6C9), // 
    Color(0xFFA5D6A7),
    Color(0xFFB2DFDB), // 
    Color(0xFF80CBC4),
    Color(0xFFDCEDC8), // 
    Color(0xFFC5E1A5),
    
    // 
    Color(0xFFFFF9C4), // 
    Color(0xFFFFF59D),
    Color(0xFFFFECB3), // 
    Color(0xFFFFE082),
    Color(0xFFFFE0B2), // 
    Color(0xFFFFCC80),
    
    // 
    Color(0xFFFFCCBC), // 
    Color(0xFFFFAB91),
    Color(0xFFFFCDD2), // 
    Color(0xFFEF9A9A),
    Color(0xFFF8BBD0), // 
    Color(0xFFF48FB1),
    
    // 
    Color(0xFFCFD8DC), // 
    Color(0xFFB0BEC5),
    Color(0xFFE0E0E0), // 
    Color(0xFFBDBDBD),
    Color(0xFFEEEEEE), // 
    Color(0xFFF5F5F5),
  ];

  @override
  Widget build(BuildContext context) {
    final strings = AppStrings.of(context);
    
    return PopScope(
      canPop: true,
      onPopInvoked: (didPop) {
        // 
      },
      child: Dialog(
        backgroundColor: AppTheme.getSurfaceColor(context),
        shape: RoundedRectangleBorder(
          borderRadius: BorderRadius.circular(16),
        ),
        child: Container(
          constraints: const BoxConstraints(maxWidth: 500, maxHeight: 550),
          padding: const EdgeInsets.all(24),
          child: Column(
            mainAxisSize: MainAxisSize.min,
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              // 
              Row(
                children: [
                  Expanded(
                    child: Text(
                      strings?.customColorPicker ?? 'Custom Color Picker',
                      style: TextStyle(
                        color: AppTheme.getTextPrimary(context),
                        fontSize: 20,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                  ),
                  TVFocusable(
                    onSelect: () => Navigator.pop(context),
                    focusScale: 1.0,
                    showFocusBorder: false,
                    builder: (context, isFocused, child) {
                      return Container(
                        decoration: BoxDecoration(
                          color: isFocused 
                              ? AppTheme.getFocusBackgroundColor(context) 
                              : Colors.transparent,
                          borderRadius: BorderRadius.circular(8),
                        ),
                        child: child,
                      );
                    },
                    child: IconButton(
                      icon: const Icon(Icons.close_rounded),
                      onPressed: () => Navigator.pop(context),
                      color: AppTheme.getTextMuted(context),
                    ),
                  ),
                ],
              ),
              const SizedBox(height: 24),
              
              // 
              _buildColorPreview(),
              const SizedBox(height: 24),
              
              // 
              Expanded(
                child: _buildColorPalette(),
              ),
              
              const SizedBox(height: 16),
              
              // 
              Center(
                child: Text(
                  'Press OK to apply color · Back to cancel',
                  style: TextStyle(
                    color: AppTheme.getTextMuted(context),
                    fontSize: 12,
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }

  /// 
  Widget _buildColorPreview() {
    return Container(
      width: double.infinity,
      height: 80,
      decoration: BoxDecoration(
        color: _selectedColor,
        borderRadius: BorderRadius.circular(12),
        boxShadow: [
          BoxShadow(
            color: _selectedColor.withOpacity(0.4),
            blurRadius: 20,
            spreadRadius: 2,
          ),
        ],
      ),
      child: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text(
              AppStrings.of(context)?.selectedColor ?? 'Selected Color',
              style: TextStyle(
                color: _getContrastColor(_selectedColor),
                fontSize: 14,
                fontWeight: FontWeight.w500,
              ),
            ),
            const SizedBox(height: 4),
            Text(
              '#${_selectedColor.value.toRadixString(16).substring(2).toUpperCase()}',
              style: TextStyle(
                color: _getContrastColor(_selectedColor),
                fontSize: 16,
                fontWeight: FontWeight.bold,
                fontFamily: 'monospace',
              ),
            ),
          ],
        ),
      ),
    );
  }

  /// 
  Widget _buildColorPalette() {
    return FocusTraversalGroup(
      child: GridView.builder(
        gridDelegate: const SliverGridDelegateWithFixedCrossAxisCount(
          crossAxisCount: 6,
          crossAxisSpacing: 12,
          mainAxisSpacing: 12,
          childAspectRatio: 1.0,
        ),
        itemCount: _presetColors.length,
        itemBuilder: (context, index) {
          final color = _presetColors[index];
          final isSelected = color.value == _selectedColor.value;
          
          return TVFocusable(
            focusNode: index == 0 ? _firstColorFocusNode : null,
            autofocus: index == 0,
            onSelect: () {
              // OK
              setState(() {
                _selectedColor = color;
              });
              _applyColor(context);
            },
            focusScale: 1.0,
            showFocusBorder: false,
            builder: (context, isFocused, child) {
              // 
              final isLightColor = _isLightColor(color);
              final borderColor = isLightColor ? Colors.black : Colors.white;
              
              return AnimatedContainer(
                duration: const Duration(milliseconds: 200),
                decoration: BoxDecoration(
                  color: color,
                  borderRadius: BorderRadius.circular(12),
                  border: Border.all(
                    color: isSelected 
                        ? borderColor
                        : isFocused
                            ? borderColor.withOpacity(0.8)
                            : Colors.transparent,
                    width: isSelected ? 3 : isFocused ? 2 : 1,
                  ),
                  boxShadow: [
                    if (isFocused || isSelected)
                      BoxShadow(
                        color: Colors.black.withOpacity(0.4),
                        blurRadius: isFocused ? 16 : 12,
                        spreadRadius: isFocused ? 3 : 2,
                      ),
                  ],
                ),
                child: child,
              );
            },
            child: Material(
              color: Colors.transparent,
              child: InkWell(
                onTap: () {
                  setState(() {
                    _selectedColor = color;
                  });
                  _applyColor(context);
                },
                borderRadius: BorderRadius.circular(12),
                child: Center(
                  child: isSelected
                      ? Icon(
                          Icons.check_rounded,
                          color: _getContrastColor(color),
                          size: 28,
                        )
                      : null,
                ),
              ),
            ),
          );
        },
      ),
    );
  }

  /// 
  bool _isLightColor(Color color) {
    final luminance = (0.299 * color.red + 0.587 * color.green + 0.114 * color.blue) / 255;
    return luminance > 0.7; // 0.7
  }

  /// 
  void _applyColor(BuildContext context) {
    final settings = context.read<SettingsProvider>();
    final strings = AppStrings.of(context);
    
    // ID
    final customSchemeId = 'custom_${_selectedColor.value.toRadixString(16)}';
    
    // 
    final isDarkMode = _isDarkMode(context, settings);
    if (isDarkMode) {
      settings.setDarkColorScheme(customSchemeId);
    } else {
      settings.setLightColorScheme(customSchemeId);
    }
    
    // 
    Navigator.pop(context);
    
    // 
    Future.delayed(const Duration(milliseconds: 100), () {
      if (context.mounted) {
        // 
        Navigator.pop(context);
        
        // 
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: Text(
              strings?.customColorApplied ?? 'Custom color applied',
            ),
            backgroundColor: AppTheme.successColor,
            duration: const Duration(seconds: 2),
          ),
        );
      }
    });
  }

  /// 
  bool _isDarkMode(BuildContext context, SettingsProvider settings) {
    if (settings.themeMode == 'dark') {
      return true;
    } else if (settings.themeMode == 'light') {
      return false;
    } else {
      final brightness = MediaQuery.of(context).platformBrightness;
      return brightness == Brightness.dark;
    }
  }

  /// 
  Color _getContrastColor(Color color) {
    // 
    final luminance = (0.299 * color.red + 0.587 * color.green + 0.114 * color.blue) / 255;
    return luminance > 0.5 ? Colors.black : Colors.white;
  }
}

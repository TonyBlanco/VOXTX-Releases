import 'package:flutter/material.dart';
import 'color_scheme_data.dart';

/// 
/// 
class ColorSchemeManager {
  // 
  static final ColorSchemeManager instance = ColorSchemeManager._();
  
  ColorSchemeManager._();
  
  // ============  ============
  static const List<ColorSchemeData> darkSchemes = [
    darkLotus,
    darkOcean,
    darkForest,
    darkSunset,
    darkLavender,
    darkMidnight,
  ];
  
  // ============  ============
  static const List<ColorSchemeData> lightSchemes = [
    lightLotus,
    lightSky,
    lightSpring,
    lightCoral,
    lightViolet,
    lightClassic,
  ];
  
  ///  ID 
  ///  Lotus 
  /// : custom_AARRGGBB
  ColorSchemeData getDarkScheme(String id) {
    // 
    if (id.startsWith('custom_')) {
      return _createCustomScheme(id, isDark: true);
    }
    
    try {
      return darkSchemes.firstWhere((scheme) => scheme.id == id);
    } catch (_) {
      // 
      return darkLotus;
    }
  }
  
  ///  ID 
  ///  Lotus Light 
  /// : custom_AARRGGBB
  ColorSchemeData getLightScheme(String id) {
    // 
    if (id.startsWith('custom_')) {
      return _createCustomScheme(id, isDark: false);
    }
    
    try {
      return lightSchemes.firstWhere((scheme) => scheme.id == id);
    } catch (_) {
      // 
      return lightLotus;
    }
  }
  
  /// ID
  /// ID: custom_AARRGGBB (: custom_ffe91e63)
  ColorSchemeData _createCustomScheme(String id, {required bool isDark}) {
    try {
      // 
      final colorHex = id.substring(7); //  "custom_" 
      final colorValue = int.parse(colorHex, radix: 16);
      final primaryColor = Color(colorValue);
      
      // 
      final hsl = HSLColor.fromColor(primaryColor);
      final secondaryColor = hsl.withHue((hsl.hue + 20) % 360).toColor();
      
      return ColorSchemeData(
        id: id,
        nameKey: 'colorSchemeCustom',
        primaryColor: primaryColor,
        secondaryColor: secondaryColor,
        backgroundColor: isDark ? null : const Color(0xFFF5F5F5),
        descriptionKey: 'colorSchemeCustom',
      );
    } catch (e) {
      // 
      return isDark ? darkLotus : lightLotus;
    }
  }
  
  /// 
  List<ColorSchemeData> getAllDarkSchemes() {
    return darkSchemes;
  }
  
  /// 
  List<ColorSchemeData> getAllLightSchemes() {
    return lightSchemes;
  }
  
  ///  ID 
  bool isDarkSchemeValid(String id) {
    return darkSchemes.any((scheme) => scheme.id == id);
  }
  
  ///  ID 
  bool isLightSchemeValid(String id) {
    return lightSchemes.any((scheme) => scheme.id == id);
  }
}

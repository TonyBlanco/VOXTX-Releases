import 'package:flutter/material.dart';

/// 
/// 
class ColorSchemeData {
  ///  'lotus', 'ocean'
  final String id;
  
  ///  'colorSchemeLotus'
  final String nameKey;
  
  /// 1
  final Color primaryColor;
  
  /// 2
  final Color secondaryColor;
  
  /// 
  final Color? backgroundColor;
  
  /// 
  final String descriptionKey;
  
  const ColorSchemeData({
    required this.id,
    required this.nameKey,
    required this.primaryColor,
    required this.secondaryColor,
    this.backgroundColor,
    required this.descriptionKey,
  });
  
  /// 
  LinearGradient get gradient => LinearGradient(
    begin: Alignment.topLeft,
    end: Alignment.bottomRight,
    colors: [primaryColor, secondaryColor],
  );
  
  /// 1
  Color get focusColor => primaryColor;
  
  /// 1
  Color get focusBorderColor {
    final hsl = HSLColor.fromColor(primaryColor);
    return hsl.withLightness((hsl.lightness + 0.2).clamp(0.0, 1.0)).toColor();
  }
  
  /// 40% 
  LinearGradient get softGradient => LinearGradient(
    begin: Alignment.topLeft,
    end: Alignment.bottomRight,
    colors: [
      primaryColor.withOpacity(0.4),
      secondaryColor.withOpacity(0.4),
    ],
  );
}


// ============  ============

/// Lotus- 
const darkLotus = ColorSchemeData(
  id: 'lotus',
  nameKey: 'colorSchemeLotus',
  primaryColor: Color(0xFFE91E8C),
  secondaryColor: Color(0xFF9C27B0),
  descriptionKey: 'colorSchemeDescLotus',
);

/// Ocean- 
const darkOcean = ColorSchemeData(
  id: 'ocean',
  nameKey: 'colorSchemeOcean',
  primaryColor: Color(0xFF0EA5E9),
  secondaryColor: Color(0xFF0284C7),
  descriptionKey: 'colorSchemeDescOcean',
);

/// Forest- 
const darkForest = ColorSchemeData(
  id: 'forest',
  nameKey: 'colorSchemeForest',
  primaryColor: Color(0xFF10B981),
  secondaryColor: Color(0xFF059669),
  descriptionKey: 'colorSchemeDescForest',
);

/// Sunset- 
const darkSunset = ColorSchemeData(
  id: 'sunset',
  nameKey: 'colorSchemeSunset',
  primaryColor: Color(0xFFF97316),
  secondaryColor: Color(0xFFDC2626),
  descriptionKey: 'colorSchemeDescSunset',
);

/// Lavender- 
const darkLavender = ColorSchemeData(
  id: 'lavender',
  nameKey: 'colorSchemeLavender',
  primaryColor: Color(0xFF8B5CF6),
  secondaryColor: Color(0xFF6D28D9),
  descriptionKey: 'colorSchemeDescLavender',
);

/// Midnight- 
const darkMidnight = ColorSchemeData(
  id: 'midnight',
  nameKey: 'colorSchemeMidnight',
  primaryColor: Color(0xFF1E40AF),
  secondaryColor: Color(0xFF1E3A8A),
  descriptionKey: 'colorSchemeDescMidnight',
);

// ============  ============

/// Lotus Light-  + 
const lightLotus = ColorSchemeData(
  id: 'lotus-light',
  nameKey: 'colorSchemeLotusLight',
  primaryColor: Color(0xFFDB2777),
  secondaryColor: Color(0xFF7C3AED),
  backgroundColor: Color(0xFFF5F5F5),
  descriptionKey: 'colorSchemeDescLotusLight',
);

/// Sky-  + 
const lightSky = ColorSchemeData(
  id: 'sky',
  nameKey: 'colorSchemeSky',
  primaryColor: Color(0xFF0284C7),
  secondaryColor: Color(0xFF0369A1),
  backgroundColor: Color(0xFFF0F9FF),
  descriptionKey: 'colorSchemeDescSky',
);

/// Spring-  + 
const lightSpring = ColorSchemeData(
  id: 'spring',
  nameKey: 'colorSchemeSpring',
  primaryColor: Color(0xFF059669),
  secondaryColor: Color(0xFF047857),
  backgroundColor: Color(0xFFF0FDF4),
  descriptionKey: 'colorSchemeDescSpring',
);

/// Coral-  + 
const lightCoral = ColorSchemeData(
  id: 'coral',
  nameKey: 'colorSchemeCoral',
  primaryColor: Color(0xFFEA580C),
  secondaryColor: Color(0xFFC2410C),
  backgroundColor: Color(0xFFFFF7ED),
  descriptionKey: 'colorSchemeDescCoral',
);

/// Violet-  + 
const lightViolet = ColorSchemeData(
  id: 'violet',
  nameKey: 'colorSchemeViolet',
  primaryColor: Color(0xFF7C3AED),
  secondaryColor: Color(0xFF6D28D9),
  backgroundColor: Color(0xFFFAF5FF),
  descriptionKey: 'colorSchemeDescViolet',
);

/// Classic-  + 
const lightClassic = ColorSchemeData(
  id: 'classic',
  nameKey: 'colorSchemeClassic',
  primaryColor: Color(0xFF475569),
  secondaryColor: Color(0xFF334155),
  backgroundColor: Color(0xFFFFFFFF),
  descriptionKey: 'colorSchemeDescClassic',
);

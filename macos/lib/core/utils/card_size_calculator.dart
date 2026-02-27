import '../platform/platform_detector.dart';
import '../services/service_locator.dart';

/// 
/// 
class CardSizeCalculator {
  /// 
  static double get spacing => PlatformDetector.isMobile ? 6.0 : 7.0;
  
  /// :- EPG
  /// 
  /// EPG
  // static double get aspectRatio => PlatformDetector.isMobile ? 0.85 : 1;
  static double aspectRatio() {
    if (PlatformDetector.isMobile) {
      return 0.85;
    } else if (PlatformDetector.isTV) {
      return 0.9;
    } else {
      return 1;
    }
  }

  
  /// Grid
  static int calculateCardsPerRow(double availableWidth) {
    int cardsPerRow;
    String mode;
    
    if (PlatformDetector.isMobile) {
      // 
      if (availableWidth > 700) {
        //  - 
        mode = '';
        if (availableWidth > 900) {
          cardsPerRow = 10;
        } else if (availableWidth > 800) {
          cardsPerRow = 9;
        } else {
          cardsPerRow = 9;
        }
      } else {
        // 
        mode = '';
        if (availableWidth > 450) {
          cardsPerRow = 6;
        } else if (availableWidth > 350) {
          cardsPerRow = 5;
        } else if (availableWidth > 250) {
          cardsPerRow = 4;
        } else {
          cardsPerRow = 3;
        }
      }
      // ServiceLocator.log.d(' - $mode: =${availableWidth.toStringAsFixed(1)}px, =$cardsPerRow', tag: 'CardSize');
      return cardsPerRow;
    } else if (PlatformDetector.isTV) {
      // TV
      if (availableWidth > 1800) {
        cardsPerRow = 14;
      } else if (availableWidth > 1600) {
        cardsPerRow = 14;
      } else if (availableWidth > 1400) {
        cardsPerRow = 12;
      } else if (availableWidth > 1200) {
        cardsPerRow = 11;
      } else if (availableWidth > 1000) {
        cardsPerRow = 10;
      } else if (availableWidth > 800) {
        cardsPerRow = 9;
      } else if (availableWidth > 780) {
        cardsPerRow = 8;
      } else if (availableWidth > 750) {
        cardsPerRow = 8;
      } else if (availableWidth > 700) {
        cardsPerRow = 7;
      } else if (availableWidth > 600) {
        cardsPerRow = 7;
      } else {
        cardsPerRow = 6;
      }
      // ServiceLocator.log.d(' - TV: =${availableWidth.toStringAsFixed(1)}px, =$cardsPerRow', tag: 'CardSize');
      return cardsPerRow;
    } else {
      // Windows/Desktop
      if (availableWidth > 1800) {
        cardsPerRow = 13;
      } else if (availableWidth > 1600) {
        cardsPerRow = 12;
      } else if (availableWidth > 1400) {
        cardsPerRow = 11;
      } else if (availableWidth > 1200) {
        cardsPerRow = 10;
      } else if (availableWidth > 1000) {
        cardsPerRow = 9;
      } else if (availableWidth > 800) {
        cardsPerRow = 7;
      } else if (availableWidth > 780) {
        cardsPerRow = 6;
      } else if (availableWidth > 750) {
        cardsPerRow = 5;
      } else if (availableWidth > 725) {
        cardsPerRow = 5;
      } else if (availableWidth > 700) {
        cardsPerRow = 5;
      } else if (availableWidth > 600) {
        cardsPerRow = 4;
      } else {
        cardsPerRow = 3;
      }
      // ServiceLocator.log.d(' - Desktop: =${availableWidth.toStringAsFixed(1)}px, =$cardsPerRow', tag: 'CardSize');
      return cardsPerRow;
    }
  }
  
  /// 
  static int calculateHomeCardsPerRow(double availableWidth) {
    int cardsPerRow;
    String mode;
    
    if (PlatformDetector.isMobile) {
      // 
      if (availableWidth > 700) {
        //  - 
        mode = '';
        if (availableWidth > 900) {
          cardsPerRow = 10;
        } else if (availableWidth > 800) {
          cardsPerRow = 9;
        } else {
          cardsPerRow = 9;
        }
      } else {
        // 
        mode = '';
        if (availableWidth > 450) {
          cardsPerRow = 5;
        } else if (availableWidth > 350) {
          cardsPerRow = 4;
        } else if (availableWidth > 250) {
          cardsPerRow = 4;
        } else {
          cardsPerRow = 3;
        }
      }
      // ServiceLocator.log.d(' - $mode: =${availableWidth.toStringAsFixed(1)}px, =$cardsPerRow', tag: 'CardSize');
      return cardsPerRow;
    } else if (PlatformDetector.isTV) {
      // TV1800px
      if (availableWidth > 1800) {
        cardsPerRow = 18;
      } else if (availableWidth > 1600) {
        cardsPerRow = 16;
      } else if (availableWidth > 1400) {
        cardsPerRow = 14;
      } else if (availableWidth > 1200) {
        cardsPerRow = 13;
      } else if (availableWidth > 1000) {
        cardsPerRow = 12;
      } else if (availableWidth > 800) {
        cardsPerRow = 10;
      } else if (availableWidth > 780) {
        cardsPerRow = 9;
      } else if (availableWidth > 750) {
        cardsPerRow = 9;
      } else if (availableWidth > 700) {
        cardsPerRow = 8;
      } else if (availableWidth > 600) {
        cardsPerRow = 7;
      } else {
        cardsPerRow = 6;
      }
      // ServiceLocator.log.d(' - TV: =${availableWidth.toStringAsFixed(1)}px, =$cardsPerRow', tag: 'CardSize');
      return cardsPerRow;
    } else {
      // Windows
      if (availableWidth > 1800) {
        cardsPerRow = 13;
      } else if (availableWidth > 1600) {
        cardsPerRow = 12;
      } else if (availableWidth > 1400) {
        cardsPerRow = 11;
      } else if (availableWidth > 1200) {
        cardsPerRow = 10;
      } else if (availableWidth > 1000) {
        cardsPerRow = 9;
      } else if (availableWidth > 800) {
        cardsPerRow = 7;
      } else if (availableWidth > 780) {
        cardsPerRow = 6;
      } else if (availableWidth > 750) {
        cardsPerRow = 5;
      } else if (availableWidth > 700) {
        cardsPerRow = 5;
      } else if (availableWidth > 600) {
        cardsPerRow = 4;
      } else {
        cardsPerRow = 5;
      }
      // ServiceLocator.log.d(' - Desktop: =${availableWidth.toStringAsFixed(1)}px, =$cardsPerRow', tag: 'CardSize');
      return cardsPerRow;
    }
  }
  
  /// 
  static double calculateCardWidth(double availableWidth) {
    final cardsPerRow = calculateCardsPerRow(availableWidth);
    final totalSpacing = (cardsPerRow + 1) * spacing;
    return (availableWidth - totalSpacing) / cardsPerRow;
  }
  
  /// 
  static double calculateCardHeight(double availableWidth) {
    return calculateCardWidth(availableWidth) / aspectRatio();
  }
  
  /// GridViewcrossAxisCount
  static int getGridCrossAxisCount(double availableWidth) {
    return calculateCardsPerRow(availableWidth);
  }
  
  /// GridViewchildAspectRatio
  static double getGridChildAspectRatio() {
    return aspectRatio();
  }
  
  /// GridViewcrossAxisSpacing
  static double getGridCrossAxisSpacing() {
    return spacing;
  }
  
  /// GridViewmainAxisSpacing
  static double getGridMainAxisSpacing() {
    return spacing;
  }
}

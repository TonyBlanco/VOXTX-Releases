# Changelog

## [1.5.22] - 2026-02-24
### Novedades
- **Guía de Programas — Selector de categoría**: Chips horizontales para filtrar canales por grupo. Al abrir se pre-selecciona el grupo del canal activo
- **Botón Pantalla Completa en EPG**: Icono ⛶ en el header del canal y superpuesto en el player para abrir el reproductor nativo a pantalla completa
- **Logos sin cuadro X**: Nuevo widget `_ChannelLogo` — muestra icono de TV durante carga y si falla, sin spinners ni errores visuales

All notable changes to VoxTvIPTV will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [1.5.21] - 2026-02-24

### Added
- **Guía de Programas (EPG Screen)**: Pantalla completa reemplazando el placeholder "Coming Soon"
  - Vista móvil: mini player + lista de canales lateral + programación del día
  - Vista escritorio/TV: sidebar de canales (220px) + player 16:9 + lista de programas
  - Programa actual resaltado con badge "EN VIVO", barra de progreso y tiempo restante
  - Descripción, categorías y horarios de cada programa
  - Reloj en tiempo real actualizado cada minuto
- **Mini player real en panel de previsualización TV**: El panel lateral de LIVE ahora reproduce el stream en vivo al navegar sobre un canal (debounce 500ms)
- **EPG en sidebar TV**: Acceso directo a Guía de Programas desde la barra lateral

### Fixed
- **EPG no aparecía en tarjetas de canales LIVE**: Race condition en `epg_service.dart` — los datos se asignaban dentro de `scheduleMicrotask` pero `return true` ocurría antes de que el microtask se ejecutara
- **EPG nunca notificaba actualizaciones en background**: `EpgProvider.loadEpg(silent: true)` nunca llamaba `notifyListeners()` al terminar, por lo que la UI no se reconstruía con los datos EPG

## [1.5.20] - 2026-02-24

### Changed
- Eliminados todos los textos en chino residuales del fork original (shnulaa/FlutterIPTV)
- Segunda lista de prueba (B1G Smasters) precargada al primer inicio
- Playlists vacías con URL se descargan automáticamente en background

### Fixed
- Cadena de log rota en redirect_cache_service (residuo del strip de chino)

## [1.5.19] - 2026-02-24

### Added
- Failover con backoff exponencial (500ms → 1s → 2s, 3 reintentos) al fallar un stream
- Continue watching: posición de reproducción guardada en VOD, reanuda desde donde lo dejaste
- Selección de pista de calidad de vídeo directamente desde el reproductor
- Controles parentales funcionales con PIN configurable desde Ajustes
- Barra de progreso en las tarjetas de canal VOD con posición guardada
- Historial de reproducción activado por defecto en la pantalla de inicio

## [1.5.18] - 2026-02-24

### Changed
- Splash: duración mínima aumentada a 13 segundos para dar tiempo a cargar las listas
- Splash: barras animadas tipo ecualizador/señal visibles mientras carga los canales
- Splash: texto de estado en tiempo real (Cargando listas, Verificando actualizaciones...)

## [1.5.17] - 2026-02-24

### Fixed
- Splash startup now keeps a guaranteed minimum on-screen duration before entering Home
- Logo is rendered without rounded-square background container to preserve transparent icon appearance
- Loading bar shimmer animation now updates continuously (fixed frozen frame issue)

### Changed
- Startup animation motion is now more visible (floating logo + stronger glow pulse)

## [1.5.16] - 2026-02-24

### Added
- New animated OTT-style splash screen (logo reveal, ambient pulse, cinematic loading bar)

### Changed
- Replaced basic red spinner startup effect with a more professional startup animation

## [1.5.15] - 2026-02-24

### Fixed
- Spanish localization expanded in Settings (General/Developer/About sections)
- Utilities labels now respect Spanish language selection (Export Logs/Clear Logs and related texts)

## [1.5.14] - 2026-02-24

### Fixed
- OTA update dialogs are now fully localized (removed hardcoded Chinese texts)
- Removed hardcoded private Xtream preset credentials from app flows
- OTA download URLs now use direct GitHub release links for better device compatibility

## [1.5.13] - 2026-02-24

### Added
- Xtream provider presets in Xtream dialog
- Xtream import options: include/exclude VOD+Series and include/exclude TV Guide (EPG)
- Detailed Xtream import progress view with account status and LIVE/MOVIES/SERIES counters
- Quick Xtream access added to Playlist Manager (TV/Desktop)

### Changed
- Xtream import UX now validates account and shows provider metrics before ingest
- Import progress now reaches explicit 100% success state (green)

### Fixed
- Corrected misleading LIVE-only top summary by showing separate LIVE/MOVIES/SERIES totals
- Improved update note language fallback behavior for OTA dialogs

## [1.5.12] - 2026-02-24

### Added
- Channels mini preview panel for TV/Desktop with quick actions (play/favorite)
- Channel availability status indicator in preview flow

### Changed
- App update source migrated to `TonyBlanco/VOXTX-Android` (`master`)
- In-app release links and update metadata now point to the new repository
- README structure updated: `README.md` in Spanish and `README_EN.md` in English
- Repository/documentation links aligned with `VOXTX-Android`

### Fixed
- Stabilized Movies/Series behavior after regressions in recent iterations
- Restored and improved modal-based details flow in Movies
- Fixed Series episodes flow to fetch and display episode data reliably
- Resolved parser/structure issues that were causing release build failures

## [1.1.30] - 2024-12-21

### Added
- **Player Category Panel**: Press LEFT key to open category/channel panel in player
- Auto-locate current playing channel when opening category panel
- Double-press BACK to exit player (prevents accidental exit)

### Changed
- Category order now preserves M3U file original order (instead of alphabetical)
- Disabled LEFT/RIGHT seek for live streams (not applicable)

### Fixed
- Fixed status indicator color not updating (LIVE/Buffering/Offline)
- Fixed category selection highlight not clearing properly

## [1.1.28] - 2024-12-21

### Added
- **Lotus Theme UI**: Pure black background with pink/purple gradient accents
- **TV Sidebar Navigation**: Auto-collapsing sidebar (expands on focus)
- **Native ExoPlayer**: Media3 ExoPlayer for Android TV 4K playback
- Glassmorphism style cards for desktop/mobile
- Channel long-press menu on TV (favorite/test)
- Default channel logo for missing thumbnails
- Recommended channels with refresh button

### Changed
- TV interface optimized: removed animations for smooth performance
- Home screen redesigned with compact header and horizontal category chips
- Channel rows show max 7 items with "More" button
- Favorites section moved to bottom (only shows if has favorites)

### Fixed
- Fixed recommended channels not showing on first load
- Fixed Android TV app icon not using custom icon

## [1.0.15] - 2024-12-14

### Added
- Added video resolution display in player status bar
- Added fullscreen toggle button in player controls
- Added favorite toggle button in player top bar

### Changed
- Removed limit on Home screen categories (shows all now)
- Changed Home screen "All Channels" section to show 10 random channels

## [1.0.13] - 2024-12-14

### Fixed
- Fixed URL parsing for M3U lines containing specific suffix formats (e.g. `$`)

## [1.0.12] - 2024-12-14

### Added
- Added support for local channel logos (images from local storage)
- Improved channel logo rendering support

## [1.0.11] - 2024-12-14

### Fixed
- Fixed player controls not disappearing when mouse leaves the window
- Fixed player status getting stuck on "Buffering" or "Loading" after playback starts
- Fixed issue where pause/play was required to sync player state

## [1.0.10] - 2024-12-14

### Fixed
- Fixed navigation bar disappearing on Windows (added mouse hover detection)
- Fixed issue where video audio continues playing after exiting player screen
- Improved player controls visibility logic

## [1.0.9] - 2024-12-14

### Fixed
- Fixed issue where channel list would not update after adding/importing a playlist until restart
- Improved UI responsiveness during playlist operations

## [1.0.8] - 2024-12-14

### Fixed
- Fixed database migration error (`no such column: channel_count`) for existing users
- Updated database schema version to 2

## [1.0.7] - 2024-12-14

### Fixed
- Fixed "Database not initialized" error on Windows by initializing FFI engine early in `main.dart`
- Implemented "From File" playlist import functionality with performance optimization

## [1.0.6] - 2024-12-14

### Fixed
- Upgraded Gradle Wrapper to 8.0 to fix Android build failure

## [1.0.5] - 2024-12-14

### Fixed
- Fixed GitHub Actions ZIP creation failure by adding `-Force` parameter

## [1.0.4] - 2024-12-14

### Fixed
- Fixed GitHub Actions build failure by aligning Flutter version (3.16.9) with local environment
- Resolved `win32` compatibility issues

## [1.0.3] - 2024-12-14

### Fixed
- Fixed critical startup crash (LateInitializationError)
- Fixed "app not responding" during M3U import using batch database insert
- Fixed video playback continuing after exiting player screen (audio playing in background)
- Fixed Windows CI build failure due to package name casing
- Optimized cold start time significantly by moving heavy initialization to Splash Screen
- Switched to Dio for more robust playlist downloading

## [1.0.2] - 2024-12-13

### Fixed
- Fixed Android build configuration (SDK version and Gradle settings)
- Fixed Windows CI build by auto-generating platform files
- Updated compileSdk to 34 to support latest dependencies

## [1.0.1] - 2024-12-13

### Fixed
- Fixed multiple import path errors in providers and screens
- Fixed `TVFocusable` widget const constructor issues
- Removed unused `google_fonts` dependency
- Fixed `shortcuts` map type issue in `main.dart`

## [1.0.0] - 2024-12-13

### Added
- Initial release of FlutterIPTV
- **Multi-Platform Support**
  - Windows (PC) with keyboard/mouse navigation
  - Android Mobile with touch-optimized interface
  - Android TV with full D-Pad/Remote navigation
- **Video Player**
  - High-quality playback using media_kit (libmpv)
  - Support for HLS, DASH, RTMP/RTSP streams
  - Hardware-accelerated decoding
  - Playback speed control (0.5x - 2.0x)
  - Volume control with mute toggle
- **Playlist Management**
  - Import M3U/M3U8 playlists from URL
  - Import local playlist files
  - Automatic playlist refresh
  - Multiple playlist support
- **Channel Features**
  - Automatic grouping by categories
  - Channel search by name or group
  - Favorites with drag-and-drop reordering
  - Watch history tracking
- **Settings**
  - Playback buffer configuration
  - Auto-play preferences
  - Last channel memory
  - Parental control with PIN
- **UI/UX**
  - Beautiful dark theme optimized for TV
  - Smooth animations and transitions
  - Focus-based navigation for TV remotes
  - Responsive design for all screen sizes

### Technical
- Flutter 3.x compatible
- Provider state management
- SQLite local database
- MediaKit video player integration
- Platform channel for Android TV detection

---

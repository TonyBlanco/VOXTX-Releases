# VOXTX — Platform Strategy & Agent Guide

> **Documento de referencia para agentes AI.**  
> Contiene el audit completo de Android (plataforma base) y los pasos exactos para implementar macOS, Windows, iOS y WebOS.

---

## Arquitectura de Repositorios

La estrategia es **un repo de código fuente por plataforma** + **un repo de releases compartido**.

| Repo | Visibilidad | Propósito |
|------|-------------|-----------|
| `TonyBlanco/VOXTX-Android` | Privado | Código fuente Android Mobile + Android TV ← **repo actual** |
| `TonyBlanco/VOXTX-macOS` | Privado | Código fuente macOS ← **crear** |
| `TonyBlanco/VOXTX-Windows` | Privado | Código fuente Windows ← **crear** |
| `TonyBlanco/VOXTX-iOS` | Privado | Código fuente iOS ← **crear** |
| `TonyBlanco/VOXTX-WebOS` | Privado | Código fuente WebOS/Web ← **crear** |
| `TonyBlanco/VOXTX-Releases` | **Público** | Solo `version.json` + release assets (DMG, EXE, APK...) |

### Reglas absolutas de repos
- El código fuente **NUNCA** va a `VOXTX-Releases` (es público)
- Cada repo de plataforma **NUNCA** pushea a los otros repos de plataforma
- `VOXTX-Releases` solo se actualiza via clon temporal en `/tmp` (igual que Android)
- Si un feature se arregla en Android, portarlo manualmente a los demás repos

---

## Crear un nuevo repo de plataforma (pasos para el agente)

```bash
# 1. En GitHub: crear repo PRIVADO TonyBlanco/VOXTX-[PLATFORM]
#    (via gh CLI o web — sin README, sin .gitignore, vacío)

gh repo create TonyBlanco/VOXTX-macOS --private --description "VOXTX IPTV player - macOS"

# 2. Desde el workspace actual, añadir el nuevo remote
git remote add macos https://github.com/TonyBlanco/VOXTX-macOS.git

# 3. Push inicial con orphan branch limpio (SIN historial de android)
git checkout --orphan macos-main
git add -A
git commit -m "initial: VOXTX macOS branch from Android base vX.X.X"
git push macos macos-main:main
git checkout master  # volver a la rama principal
git branch -D macos-main

# 4. Verificar remotes
git remote -v
# origin  → shnulaa/FlutterIPTV (NUNCA PUSH)
# voxtx   → VOXTX-Android
# macos   → VOXTX-macOS
# windows → VOXTX-Windows
# ios     → VOXTX-iOS
# webos   → VOXTX-WebOS
```

> **Nota**: Cada plataforma trabaja desde su propio branch local derivado de `master`:
> - `master` → base compartida (Android)
> - `platform/macos` → trabajo macOS → push a `macos` remote
> - `platform/windows` → trabajo Windows → push a `windows` remote
> - etc.

---

## PLATAFORMA: Android — ESTADO: ✅ Completo (base de referencia)

### Features implementados

| Feature | Archivo clave | Estado |
|---------|--------------|--------|
| Reproductor media_kit | `player/providers/player_provider.dart` | ✅ |
| Retries + exponential backoff | `player_provider.dart` _setError() | ✅ |
| Auto-detect + switch fuentes | `_checkAndSwitchToNextSource()` | ✅ |
| Hardware decoding (hwdec) | media_kit config en `_initMediaKit()` | ✅ |
| Redirect cache (302 resolver) | `redirect_cache_service.dart` | ✅ |
| Native ExoPlayer (Android TV) | `native_player_channel.dart` | ✅ |
| D-Pad navigation completa | `tv_focusable.dart`, `tv_sidebar.dart` | ✅ v1.5.23/v1.5.25 |
| TV Sidebar — onKeyEvent (fix) | `tv_sidebar.dart` onKey → onKeyEvent | ✅ v1.5.25 |
| TV Xtream dialog — FocusNode chain | `add_xtream_dialog.dart` 4 TextFields | ✅ v1.5.25 |
| TvAppFocusWrapper + ReadingOrderPolicy | `main.dart` raíz MaterialApp | ✅ v1.5.23 |
| TvFocusManager save/restore | `tv_focus_manager.dart` | ✅ v1.5.23 |
| TVFocusable KeyRepeatEvent | `tv_focusable.dart` | ✅ v1.5.23 |
| TvTextField D-Pad compatible | `tv_text_field.dart` | ✅ v1.5.23 |
| Platform detection | `platform_detector.dart` | ✅ |
| EPG Screen + category chips | `epg/screens/epg_screen.dart` | ✅ v1.5.22 |
| EPG fullscreen button | `epg_screen.dart` _openFullscreen() | ✅ v1.5.22 |
| Channel logo placeholder fix | `_ChannelLogo` widget en epg_screen | ✅ v1.5.22 |
| Error sanitizer (CJK) | `player_screen.dart` _sanitizeError() | ✅ v1.5.23 |
| APK reducido (~40 MB) | Eliminadas 13 fuentes no usadas | ✅ v1.5.24 |
| Memory leak fix (larga duración) | `_DlnaAwareAppState` removeListener | ✅ v1.5.24 |
| Crash capture silencioso | `platformDispatcher.onError` en main | ✅ v1.5.24 |
| QR Search — persistente (no desconecta) | `qr_search_dialog.dart` sin pop() | ✅ v1.5.26 |
| QR Search — banner confirmación | `qr_search_dialog.dart` Timer 3 s | ✅ v1.5.26 |
| Mando remoto móvil (HTTP) | `remote_control.html` + `/remote` route | ✅ v1.5.26 |
| API remoto POST /api/remote | `local_server_service.dart` | ✅ v1.5.26 |
| Páginas móviles EN/ES (sin chino) | `search_channels.html`, `import_playlist.html` | ✅ v1.5.26 |
| Subtítulos / audio tracks UI | `player_provider.dart` + `player_screen.dart` | ✅ v1.5.27 (otro agente) |
| Mando remoto — nav (home/epg/favs/back/stop) | `qr_search_dialog.dart` `_handleRemoteCommand()` | ✅ v1.5.28 |
| Playlist CRUD (M3U/URL/archivo) | `playlist/` + file_picker | ✅ |
| VOD Movies + Series | `movies/`, `series/` features | ✅ |
| Multi-screen (2-4 canales) | `multi_screen/` feature | ✅ |
| Favorites | `favorites/` feature | ✅ |
| Search | `search/` feature | ✅ |
| DLNA cast | `dlna_service.dart` | ✅ Android + Windows |
| In-app update (APK download) | `update_service.dart` | ✅ |
| Update URL | `VOXTX-Android/releases/version.json` | ✅ |
| Parental control PIN | `settings_provider.dart` | ✅ |
| Watch history | `watch_history_service.dart` | ✅ |
| Auto-refresh playlists | `auto_refresh_service.dart` | ✅ |
| Screen brightness control | `screen_brightness` package | ✅ |
| Wakelock | `wakelock_plus` package | ✅ |
| Volume normalization / boost | `player_provider.dart` | ✅ |
| Color themes (sistema) | `app_theme.dart`, `color_scheme_*` | ✅ |
| QR log export | `qr_log_export_dialog.dart` | ✅ |
| Channel test service | `channel_test_service.dart` | ✅ |
| Channel logo service (cache) | `channel_logo_service.dart` | ✅ |
| i18n ES/EN | `app_strings.dart` | ✅ |
| SQLite (sqflite) | `database_helper.dart` | ✅ |

### Pendiente en Android

| Feature | Prioridad | Notas |
|---------|-----------|-------|
| Download canal offline | Media | `dio` ya en pubspec. Nuevo `offline_download_service.dart` + UI en `channel_card` / opciones de canal. **No toca `player_provider.dart` ni `player_screen.dart`** |
| Chromecast | Baja | Solo DLNA. Requiere `flutter_cast_framework` + Activity nativa Kotlin + botón en `player_screen.dart` (esperar a que el otro agente termine su PR) |
| Voice search (Android TV) | Baja | `SearchManager` en Activity nativa + canal Dart nuevo. Solo toca `android/` y un nuevo `voice_search_channel.dart` |
| Channel zapping mando remoto (ch±) | Baja | `_handleRemoteCommand` ya tiene el TODO. Necesita index canal actual global en `ChannelProvider` |

### Dependencias Android relevantes (pubspec.yaml)

```yaml
media_kit_libs_android_video: ^1.3.6   # video nativo android
sqflite: ^2.3.0                         # DB en android/iOS/mac
screen_brightness: ^2.1.7               # android + iOS
wakelock_plus: ^1.1.6                   # android + iOS + desktop
device_info_plus: ^12.3.0               # arch detection para update
```

---

## PLATAFORMA: macOS — ESTADO: 🔴 No iniciado

### Que ya funciona "gratis" (hereda de Android/Desktop)
- `PlatformDetector.isDesktop` = true → layout desktop ya activado
- `window_manager` package ya incluido (soporta macOS)
- `sqflite` funciona en macOS
- `file_picker` funciona en macOS
- `media_kit` soporta macOS nativo (AVFoundation)

### Pasos de implementación para el agente

#### Paso 1 — Crear repo y branch
```bash
gh repo create TonyBlanco/VOXTX-macOS --private
git remote add macos https://github.com/TonyBlanco/VOXTX-macOS.git
git checkout -b platform/macos
```

#### Paso 2 — Añadir dependencia media_kit para macOS
```yaml
# pubspec.yaml — añadir bajo media_kit_libs_android_video:
media_kit_libs_macos_video: ^1.0.4
```
```bash
flutter pub get
```

#### Paso 3 — Configurar macOS entitlements
Archivo: `macos/Runner/DebugProfile.entitlements` y `Release.entitlements`
```xml
<!-- Añadir estas claves -->
<key>com.apple.security.network.client</key>     <!-- HTTP requests -->
<true/>
<key>com.apple.security.files.user-selected.read-write</key>  <!-- file_picker -->
<true/>
<key>com.apple.security.cs.allow-jit</key>       <!-- media_kit rendering -->
<true/>
```

#### Paso 4 — Configurar window_manager para macOS
En `main.dart` donde ya existe la lógica Windows, añadir macOS:
```dart
// Buscar el bloque: if (Platform.isWindows) { ... windowManager.init ... }
// Añadir: } else if (Platform.isMacOS) {
if (Platform.isWindows || Platform.isMacOS) {
  await windowManager.ensureInitialized();
  WindowOptions windowOptions = const WindowOptions(
    size: Size(1280, 720),
    minimumSize: Size(800, 600),
    center: true,
    title: 'VOXTX',
    titleBarStyle: TitleBarStyle.hidden,  // macOS traffic light custom
  );
  windowManager.waitUntilReadyToShow(windowOptions, () async {
    await windowManager.show();
    await windowManager.focus();
  });
}
```

#### Paso 5 — Fullscreen macOS
Crear `lib/core/platform/macos_fullscreen_channel.dart` (similar a `windows_fullscreen_native.dart`):
```dart
// En macOS, windowManager.setFullScreen(true) funciona directamente
// No hace falta canal nativo
import 'package:window_manager/window_manager.dart';
class MacOSFullscreen {
  static Future<void> enterFullscreen() => windowManager.setFullScreen(true);
  static Future<void> exitFullscreen() => windowManager.setFullScreen(false);
  static Future<bool> isFullscreen() => windowManager.isFullScreen();
}
```

#### Paso 6 — Actualizar platform_detector.dart
```dart
// Añadir getter macOS donde sólo hay isWindows:
static bool get isMacOS => _currentPlatform == PlatformType.macos;
```

#### Paso 7 — DLNA en macOS
En `dlna_service.dart`, el bloque:
```dart
if (Platform.isAndroid) { ... }
else if (Platform.isWindows) { ... }
// Añadir:
else if (Platform.isMacOS) {
  // network interface discovery para macOS — mismo código que Windows
}
```

#### Paso 8 — Update service para macOS
En `update_service.dart`:
```dart
// Añadir URL del asset macOS en version.json:
// "macos": "https://github.com/TonyBlanco/VOXTX-Releases/releases/download/vX.X.X/VoxTV-macOS.dmg"

// En el bloque de selección de asset:
} else if (Platform.isMacOS) {
  return update.assets['macos'];
}
```

#### Paso 9 — Build y test

> [!IMPORTANT]
> **Fix requerido**: `sqflite_common_ffi` intenta descargar `libsqlite3.arm64.macos.dylib` de GitHub durante el build.
> Si hay error de red, usar la SQLite del sistema con esta variable de entorno:
> ```bash
> SQLITE3_USE_SYSTEM_LIBRARY=1 flutter run -d macos   # debug
> SQLITE3_USE_SYSTEM_LIBRARY=1 flutter build macos --release  # release
> ```

```bash
# Debug (prueba local)
SQLITE3_USE_SYSTEM_LIBRARY=1 flutter run -d macos

# Release (distribución)
SQLITE3_USE_SYSTEM_LIBRARY=1 flutter build macos --release
open build/macos/Build/Products/Release/flutter_iptv.app
# Crear DMG:
hdiutil create -volname "VOXTX" -srcfolder build/macos/Build/Products/Release/flutter_iptv.app -ov -format UDZO VOXTX-macOS.dmg
```

#### Paso 10 — Release macOS
```bash
git add -A && git commit -m "feat: macOS support"
git push macos platform/macos:main

# Subir DMG al release de VOXTX-Releases (puede ser el mismo tag que Android o uno independiente)
gh release create vX.X.X-macos VOXTX-macOS.dmg \
  --repo TonyBlanco/VOXTX-Releases \
  --title "vX.X.X - macOS"
```

### Pendiente macOS (no bloqueante para lanzar)
- Code signing (Apple Developer account) para distribución fuera de App Store
- Notarization (`xcrun notarytool`)
- Menu bar (NSMenu) con acciones rápidas
- Touch Bar support (MacBook Pro antiguos)

---

## PLATAFORMA: Windows — ESTADO: ⚠️ Funcional, falta pulir

### Ya implementado
- `windows_fullscreen_native.dart` — fullscreen por MethodChannel nativo
- `windows_pip_channel.dart` — Picture-in-Picture
- `window_title_bar.dart` — barra título custom
- `window_manager` config en `main.dart`
- Hardware decoding D3D11VA / DXVA2
- In-app update con descarga de .exe

### Pendiente Windows

| Feature | Archivo a crear/modificar | Pasos |
|---------|--------------------------|-------|
| Systray / minimizar a bandeja | `windows/runner/` + plugin `system_tray` | Añadir pub `system_tray`, crear canal MethodChannel en C++ |
| Atajos de teclado globales | `windows/runner/win32_window.cpp` | Capturar `WM_HOTKEY` en el loop Win32 |
| MSIX packaging | `windows/` + `msix` pub package | `flutter pub add msix`, configurar `msix_config` en pubspec |
| Auto-arranque con Windows | Registro HKCU\...\Run | Via `win32` package o MethodChannel |
| Installer (Inno Setup) | Script `.iss` externo | Ya existe setup básico, revisar iconos |

#### Paso — MSIX (Windows Store)
```bash
flutter pub add msix

# pubspec.yaml — añadir sección:
msix_config:
  display_name: VOXTX
  publisher_display_name: TonyBlanco
  identity_name: TonyBlanco.VOXTX
  msix_version: 1.5.22.0
  logo_path: assets/icons/icon.png
  capabilities: internetClient, privateNetworkClientServer

flutter pub run msix:create
```

---

## PLATAFORMA: iOS — ESTADO: 🔴 No iniciado

### Que ya funciona "gratis"
- `media_kit` soporta iOS (usa AVFoundation internamente)
- `screen_brightness` funciona en iOS
- `wakelock_plus` funciona en iOS
- `file_picker` funciona en iOS
- `shared_preferences` funciona
- `sqflite` funciona

### Pasos de implementación para el agente

#### Paso 1 — Crear repo y branch
```bash
gh repo create TonyBlanco/VOXTX-iOS --private
git remote add ios-remote https://github.com/TonyBlanco/VOXTX-iOS.git
git checkout -b platform/ios
```

#### Paso 2 — Añadir dependencia media_kit iOS
`media_kit_libs_video` (ya incluido como genérico) cubre iOS.
Verificar en pubspec que existe:
```yaml
media_kit_libs_video: ^1.0.5  # cubre iOS + macOS + Linux
```

#### Paso 3 — Info.plist
Archivo: `ios/Runner/Info.plist` — añadir:
```xml
<key>NSAppTransportSecurity</key>
<dict>
  <key>NSAllowsArbitraryLoads</key><true/>   <!-- streams HTTP -->
</dict>
<key>UIBackgroundModes</key>
<array>
  <string>audio</string>   <!-- reproducir en background -->
</array>
```

#### Paso 4 — Safe areas
En los layouts, envolver con `SafeArea()` donde no se haga ya.
Especialmente en `player_screen.dart` y `home_screen.dart`.

#### Paso 5 — PiP iOS nativo
iOS 15+ soporta PiP via AVKit. Requiere `AVPictureInPictureController` en Swift:
```
ios/Runner/PipHandler.swift  ← crear canal MethodChannel
```
Después en Dart, actualizar `player_provider.dart`:
```dart
} else if (Platform.isIOS) {
  await _iosPipChannel.invokeMethod('enablePip');
}
```

#### Paso 6 — In-app update iOS
iOS no permite descargar e instalar APK/IPA fuera de la App Store.
La UI de update debe mostrar un enlace a App Store en lugar del botón de descarga:
```dart
// en update_service.dart:
} else if (Platform.isIOS) {
  // Abrir App Store URL, no descargar nada
  await launchUrl(Uri.parse('https://apps.apple.com/app/voxtx/idXXXXXXXXX'));
}
```

#### Paso 7 — AirPlay
media_kit en iOS ya enruta audio/video por AirPlay automáticamente si el dispositivo está conectado.
No requiere código adicional para el caso básico.

#### Paso 8 — Build y distribución
```bash
flutter build ios --release
# Para TestFlight:
flutter build ipa
# El .ipa generado va a Xcode Organizer o altool/xcrun para subir a App Store Connect
```

### Lo que NO aplica en iOS (vs Android)
- No hay in-app APK install
- No hay `file_picker` para importar playlists desde filesystem (usar URL o iCloud)
- No hay screen_brightness seguro en todas las versiones (requiere entitlement)
- No hay DLNA sin una librería adicional (no hay soporte nativo)

---

## PLATAFORMA: WebOS (LG Smart TV) — ESTADO: 🔴 No iniciado, más complejo

### Contexto
WebOS no es una plataforma Flutter nativa. Requiere **Flutter Web** + **packaging con LG ares-cli**.
Samsung Tizen es diferente y requiere su propio SDK (Tizen Flutter plugin).

### Limitaciones críticas
- `media_kit` **NO soporta web** — necesita reemplazo con `video_player` web o HLS.js via `dart:html`
- `sqflite` NO funciona en web — hay que migrar a `sembast` o `IndexedDB`
- `screen_brightness` NO funciona en web
- `wakelock_plus` funciona en web via `navigator.wakeLock` API
- `file_picker` funciona en web con limitaciones
- `window_manager` NO funciona en web

### Arquitectura recomendada para WebOS

```
Flutter Web build → index.html + main.dart.js
  ↓
LG ares-cli packaging → appinfo.json + .ipk package
  ↓
Deploy a TV via SSH o LG Developer Mode
```

### Pasos de implementación para el agente

#### Paso 1 — Crear repo y branch
```bash
gh repo create TonyBlanco/VOXTX-WebOS --private
git remote add webos https://github.com/TonyBlanco/VOXTX-WebOS.git
git checkout -b platform/webos
```

#### Paso 2 — Instalar LG ares-cli
```bash
npm install -g @webosose/ares-cli
ares-setup-device  # configurar TV en modo developer
```

#### Paso 3 — Reemplazar video player para web
Añadir a pubspec:
```yaml
# Solo para web — usar condicionalmente
video_player: ^2.9.2   # ya incluido — funciona en web via HTML5 video
```
Crear `lib/core/services/web_player_service.dart`:
```dart
// Usar kIsWeb para seleccionar el player:
// kIsWeb → video_player (HTML5 <video>) con soporte HLS via hls.js
// !kIsWeb → media_kit
```

#### Paso 4 — Reemplazar SQLite para web
```yaml
sembast: ^3.4.9         # KV store que funciona en web via IndexedDB
```
Crear `lib/core/database/web_database_helper.dart` implementando la misma interfaz que `database_helper.dart`.

#### Paso 5 — D-Pad para WebOS (LG Magic Remote)
El Magic Remote de LG genera eventos de teclado estándar:
- `ArrowUp/Down/Left/Right` → navigación
- `Enter` → select
- `Escape/Back` → navegación atrás
- Botones de color (rojo/verde/amarillo/azul)

El sistema de `tv_focusable.dart` ya maneja teclas de cursor — funciona sin cambios.

#### Paso 6 — appinfo.json para LG WebOS
Crear `webos/appinfo.json`:
```json
{
  "id": "com.tonyblanco.voxtv",
  "version": "1.5.22",
  "vendor": "TonyBlanco",
  "type": "web",
  "main": "index.html",
  "title": "VOXTV",
  "icon": "icon.png",
  "largeIcon": "icon_large.png",
  "bgColor": "#000000",
  "iconColor": "#000000",
  "splashBackground": "#000000",
  "requiredPermissions": [
    "NETWORK_ACCESS",
    "LOCAL_STORAGE",
    "MEDIA_OPERATION"
  ]
}
```

#### Paso 7 — Build y packaging
```bash
# 1. Build Flutter web
flutter build web --release --web-renderer canvaskit

# 2. Copiar build/web/* al directorio del paquete webos
cp -r build/web/* webos/

# 3. Crear paquete .ipk con ares-cli
ares-package webos/ -o build/

# 4. Instalar en TV (en Developer Mode)
ares-install --device MyTV build/com.tonyblanco.voxtv_1.5.22_all.ipk

# 5. Lanzar
ares-launch --device MyTV com.tonyblanco.voxtv
```

### Consideraciones adicionales WebOS
- LG WebOS 3.x y anteriores tienen soporte web limitado (pueden no soportar canvas WebGL)
- WebOS 4+ (2018+) usa Chromium y soporta `canvaskit` renderer de Flutter
- Para TVs LG más antiguas, usar `--web-renderer html` (más compatible, peor calidad)
- El repositorio de apps oficial de LG es LG Content Store — requiere proceso de certificación

---

## Estado del app por plataforma — Resumen rápido

```
Android Mobile  ████████████████████  100%  ✅ Producción (v1.5.28)
Android TV      ████████████████████   99%  ✅ Producción — nav remoto ✅ (falta: download offline, voice search, ch±)
Windows         ████████████░░░░░░░░   65%  ⚠️ Funcional, sin systray/MSIX
macOS           █████░░░░░░░░░░░░░░░   25%  🔴 Solo detección de plataforma
iOS             ████░░░░░░░░░░░░░░░░   20%  🔴 Solo detección de plataforma
WebOS           ██░░░░░░░░░░░░░░░░░░   10%  🔴 kIsWeb detectado, sin trabajo
```

---

## Orden de prioridad recomendado

1. **macOS** — Más rápido de implementar (hereda mucho de Windows), mismo Flutter build
2. **Windows** — Pulir systray, MSIX packaging
3. **iOS** — Requiere Apple Developer account + Xcode
4. **WebOS** — El más complejo por cambio de player y DB

---

## version.json extendido (futuro — todos las plataformas)

Cuando haya releases para múltiples plataformas, `version.json` en `VOXTX-Releases` quedará así:

```json
{
  "version": "1.5.22",
  "build": 182,
  "releaseDate": "2026-02-24",
  "assets": {
    "windows": "https://github.com/TonyBlanco/VOXTX-Releases/releases/download/v1.5.22/VoxTV-Windows-Setup.exe",
    "macos": "https://github.com/TonyBlanco/VOXTX-Releases/releases/download/v1.5.22/VoxTV-macOS.dmg",
    "android_mobile": {
      "arm64-v8a": "https://github.com/TonyBlanco/VOXTX-Releases/releases/download/v1.5.22/app-arm64-v8a-release.apk",
      "armeabi-v7a": "https://github.com/TonyBlanco/VOXTX-Releases/releases/download/v1.5.22/app-armeabi-v7a-release.apk",
      "x86_64": "https://github.com/TonyBlanco/VOXTX-Releases/releases/download/v1.5.22/app-x86_64-release.apk"
    },
    "android_tv": {
      "arm64-v8a": "https://github.com/TonyBlanco/VOXTX-Releases/releases/download/v1.5.22/app-arm64-v8a-release.apk",
      "armeabi-v7a": "https://github.com/TonyBlanco/VOXTX-Releases/releases/download/v1.5.22/app-armeabi-v7a-release.apk",
      "x86_64": "https://github.com/TonyBlanco/VOXTX-Releases/releases/download/v1.5.22/app-x86_64-release.apk"
    },
    "ios": "https://apps.apple.com/app/voxtv/idXXXXXXXXX"
  },
  "changelog": {
    "es": "- Descripción en español",
    "en": "- English description"
  },
  "minVersion": "1.0.0"
}
```

---

## Errores comunes por plataforma (para agentes)

| Plataforma | Error frecuente | Solución |
|-----------|----------------|---------|
| macOS | `NSAppTransportSecurity` bloquea HTTP streams | Añadir `NSAllowsArbitraryLoads` en Info.plist |
| macOS | Sandbox bloquea file_picker | Entitlement `com.apple.security.files.user-selected.read-write` |
| macOS | media_kit sin video | Falta `media_kit_libs_macos_video` en pubspec |
| iOS | `PlatformException` en brightness | `screen_brightness` requiere entitlement en iOS |
| iOS | No puede instalar IPA directo | Solo via TestFlight o App Store — nunca descarga directa |
| Windows | MSIX requiere certificado | Usar self-signed para desarrollo, CA real para Store |
| WebOS | Pantalla en negro | Cambiar `--web-renderer html` en lugar de `canvaskit` |
| WebOS | Streams no reproducen | Añadir HLS.js como `<script>` en `web/index.html` |
| Todos | `sqflite` crash en web | Usar `sembast` para web, `sqflite` para el resto |
| Android | Gradle downgrade (7.x) rompe la build | `gradle-wrapper.properties` debe mantener `gradle-8.14-all.zip` — NO aceptar sugerencias de downgrade del IDE |

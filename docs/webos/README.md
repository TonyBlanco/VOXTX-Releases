# VOXTV — WebOS (LG Smart TV) Guide

## Overview

VOXTV on WebOS uses **Flutter Web** compiled to JavaScript, packaged as a
web-type LG app via `ares-cli`. The app runs inside the Chromium-based browser
engine on LG TVs (WebOS 4+, 2018 and newer).

### Current state: MVP

The MVP compiles successfully but has no video playback or local database.
Platform-specific native code (`media_kit`, `sqflite_common_ffi`,
`window_manager`, `windows_fullscreen_native`, `windows_pip_channel`) is
replaced by **web shims** — stub files that provide the same type surface with
no-op implementations.

---

## Architecture

```
lib/core/platform/web_shims/
├── media_kit_shim.dart          ← conditional export
├── media_kit_stub.dart          ← Player, Media, VideoController stubs
├── media_kit_video_shim.dart
├── media_kit_video_stub.dart    ← Video widget (shows placeholder)
├── sqflite_ffi_shim.dart
├── sqflite_ffi_stub.dart        ← sqfliteFfiInit() no-op
├── window_manager_shim.dart
├── window_manager_stub.dart     ← windowManager no-ops
├── windows_fullscreen_shim.dart
├── windows_fullscreen_stub.dart
├── windows_pip_shim.dart
├── windows_pip_stub.dart
├── http_io_client_shim.dart
├── http_io_client_stub.dart
├── io_shim.dart                 ← (unused — dart:io works on Flutter web)
└── io_stub.dart                 ← (unused — dart:io works on Flutter web)

webos/
├── appinfo.json                 ← LG app manifest
├── icon.png                     ← 80×80
├── largeIcon.png                ← 130×130
├── index.html                   ← Flutter web entry point
├── main.dart.js                 ← compiled app
├── flutter.js, flutter_bootstrap.js, flutter_service_worker.js
├── assets/                      ← Flutter assets (fonts, images, etc.)
└── canvaskit/                   ← CanvasKit WASM renderer
```

### How shims work

Each shim uses Dart's conditional export mechanism:

```dart
// media_kit_shim.dart
export 'media_kit_stub.dart'           // ← used on web (dart.library.io = false)
    if (dart.library.io) 'package:media_kit/media_kit.dart';  // ← used on native
```

On native platforms, `dart.library.io` is `true`, so the real package is used.
On web, it's `false`, so the stub is used. **No conditional imports in
application code** — every file just imports the shim.

### Key insight: `dart:io` on Flutter Web

`dart:io` **compiles on Flutter web** — the Dart SDK provides a stub library
where all types exist but throw `UnsupportedError` at runtime. This means
`import 'dart:io'` does NOT need to be replaced. Only packages that depend on
`dart:ffi` (truly unavailable on web) need shims.

---

## Build & Deploy

### Prerequisites

```bash
# Install LG ares-cli
npm install -g @webosose/ares-cli

# Enable Developer Mode on LG TV:
# 1. Install "Developer Mode" app from LG Content Store
# 2. Sign in with LG developer account
# 3. Enable Dev Mode, note the TV's IP
# 4. Setup device:
ares-setup-device
```

### Build

```bash
# Build Flutter web (release, canvaskit renderer)
flutter build web --release --web-renderer canvaskit

# Copy build output into webos packaging directory
cp -r build/web/* webos/

# Package as .ipk
ares-package webos/ -o build/

# Install on TV
ares-install --device MyTV build/com.tonyblanco.voxtv_1.5.36_all.ipk

# Launch
ares-launch --device MyTV com.tonyblanco.voxtv
```

### Debug

```bash
# Open Chrome DevTools inspector for the app
ares-inspect --device MyTV --app com.tonyblanco.voxtv --open

# View app logs
ares-log --device MyTV

# Uninstall
ares-install --device MyTV --remove com.tonyblanco.voxtv
```

### Other useful commands

```bash
ares-setup-device --list           # list configured devices
ares-device-info --device MyTV     # device info (webOS version, etc.)
ares-novacom --device MyTV --getkey  # get developer mode passphrase
ares-server webos/                 # local HTTP server for quick testing
ares-launch --device MyTV --hosted # launch hosted app (dev mode)
```

---

## Troubleshooting

| Problem | Solution |
|---------|----------|
| Black screen on old LG TV | Use `--web-renderer html` instead of `canvaskit` |
| Streams don't play | Integrate HLS.js as `<script>` in `web/index.html` |
| Developer Mode expires | Re-enable every 50 hours (LG limitation) |
| App crashes on launch | Check `ares-inspect` console for JS errors |
| Performance issues | Use `html` renderer; canvaskit is GPU-heavy |

---

## Roadmap

1. **Video playback** — Integrate `video_player` web or HLS.js via JS interop
2. **Local storage** — Replace SQLite with `shared_preferences` / IndexedDB
3. **WebOS 3.x testing** — Verify HTML renderer compatibility
4. **LG Content Store** — Certification process for public distribution

# TODO Android — Pendiente de implementar

> **Fecha**: 26 febrero 2026  
> **Versión actual**: v1.5.35+195  
> **Branch**: `voxtx/master`

---

## Completadas en v1.5.35

### 1. ✅ Channel zapping mando remoto (ch±)
**Commit**: `c4cf6b90`  
**Archivos modificados**:
- `lib/features/channels/providers/channel_provider.dart` — `nextChannel()`, `previousChannel()`, `currentChannelIndex`
- `lib/features/search/widgets/qr_search_dialog.dart` — handlers `channel_up` / `channel_down`

---

### 3. ✅ Offline — reanudar descarga interrumpida
**Commit**: `7d9265e6`  
**Archivos modificados**:
- `lib/core/services/offline_download_service.dart` — `resumeDownload()`, HTTP Range header

---

### 4. ✅ Voice search (Android TV)
**Commit**: `8850e6d5`  
**Archivos creados/modificados**:
- `lib/core/platform/voice_search_channel.dart` — nuevo canal Dart
- `android/app/src/main/kotlin/.../MainActivity.kt` — `RecognizerIntent` handler
- `lib/features/search/screens/search_screen.dart` — botón micrófono

---

## Pendiente (próximas versiones)

### 2. ⏸️ EPG zapping por categoría (D-Pad filtrado)
**Estado**: Requiere QA en Android TV Box antes de implementar  
**Notas**: El EPG screen no usa TVFocusable. Necesita testing real para validar UX.

### 5. 🔜 Subtítulos externos (.srt/.vtt)
**Riesgo**: 🟡 Medio — toca `player_screen.dart`

### 6. 🔴 Chromecast
**Estado**: HOLD — esperar que agente macOS termine sus cambios en `player_screen.dart`

---

## QA pendiente (sin código nuevo)

Estos features ya existen pero necesitan testing en **Xiaomi Box**:

- [ ] Download canal offline — ¿funciona sin ANR?
- [ ] Mando remoto nav (home/epg/back) — ¿responde?
- [ ] D-Pad en diálogos (Xtream, playlist add)
- [ ] EPG fullscreen — ¿D-Pad navega correctamente?
- [ ] OTA update v1.5.35 — ¿descarga e instala?
- [ ] Voice search — ¿funciona en Xiaomi Box?
- [ ] Channel zapping CH+/CH- — ¿funciona desde mando remoto?

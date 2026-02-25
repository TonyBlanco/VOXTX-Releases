# VOXTV — App Features & Marketing Brief

> **Versión actual**: 1.5.34 · Android Mobile / Android TV / Android TV Box / PICO VR / macOS / Windows

---

## Tagline

**"Tu IPTV. Tus reglas. En cualquier pantalla."**

> VOXTV es un reproductor IPTV profesional de código cerrado, sin anuncios, sin suscripción y con soporte nativo para los dispositivos donde realmente lo necesitas: Android TV Box, PICO VR, mando remoto móvil y multi-pantalla.

---

## Lo que nos hace únicos (vs competencia)

| Característica | VOXTV | IPTV Smarters | TiviMate | OTT Navigator |
|---------------|-------|--------------|----------|--------------|
| PICO VR — 3D nativo SBS / Over-Under | ✅ | ❌ | ❌ | ❌ |
| Mando remoto vía QR + móvil (HTTP) | ✅ | ❌ | ❌ | ❌ |
| Multi-pantalla (2–4 canales simultáneos) | ✅ | ❌ | ❌ | ❌ |
| Sin cuenta obligatoria | ✅ | ❌ | ✅ | ✅ |
| Sin anuncios | ✅ | ❌ | Pago | Pago |
| Primera imagen sin frame verde (TV Box) | ✅ | Variable | Variable | Variable |
| OTA Update integrado (APK directo) | ✅ | ❌ | Limitado | ❌ |
| D-Pad completo (Android TV) | ✅ | Parcial | ✅ | ✅ |
| macOS nativo (Apple Silicon) | ✅ | ❌ | ❌ | ❌ |
| DLNA cast | ✅ | ❌ | ❌ | ❌ |
| Descarga canales offline | ✅ | ❌ | ❌ | ❌ |

---

## Features actuales (v1.5.34)

### Reproducción
- **Media engine**: media_kit (libmpv) con hardware decoding — H.264, H.265/HEVC, AV1
- **Fuentes múltiples por canal** con auto-switch y reintentos exponenciales
- **Redirect cache** — resuelve URLs 302 en caché para reducir latencia
- **ExoPlayer nativo** en Android TV (mejor rendimiento en hardware dedicado)
- **Volume boost / normalización** — volumen por encima del 100%
- **Subtítulos y pistas de audio** con selector en pantalla
- **Brillo ajustable** con gesto o slider
- **Wakelock** — pantalla siempre activa durante reproducción
- **Picture-in-Picture** (Android 8+)
- **Sin frame verde al inicio** en Android TV Box / PICO VR (overlay con fade 350ms)

### PICO VR — 3D Mode (exclusivo)
- Detecta automáticamente si hay un player PICO instalado
- Lanza el canal en el reproductor nativo de PICO con metadatos 3D correctos
- Modos: **Side-by-Side (SBS)** y **Over/Under (OU)**
- Modo recordado entre sesiones
- Funciona con cualquier canal IPTV convencional — no requiere contenido 3D especial

### Listas y contenido
- **Playlists M3U** — URL remota, archivo local o texto manual
- **Xtream Codes API** (username/password)
- **Auto-refresh** programable de playlists
- **VOD** — Películas y Series con carátulas
- **EPG** — guía de programación con vista compacta y fullscreen, chips de categoría
- **Favoritos** con grupos personalizados
- **Historial de reproducción**
- **Descarga de canales offline**
- **Búsqueda** en tiempo real

### TV & Mando a distancia
- **D-Pad completo** en Android TV — navegación 100% sin ratón
- **Mando remoto móvil** — escanea QR desde el teléfono, controla la TV desde el navegador
  - HTTP server local con interfaz web ES/EN
  - Acciones: play/pause, siguiente, anterior, EPG, favoritos, inicio, atrás, stop
- **QR Search** — busca canales desde el móvil sin tocar el mando
- **Zapping** (próximamente: ch± desde mando remoto)

### Multi-pantalla
- 2, 3 o 4 canales simultáneos en la misma pantalla
- Cada ventana independiente con su propio player
- Ideal para monitoreo deportivo o noticias

### Personalización
- **10+ temas de color** con soporte modo oscuro del sistema
- **i18n** — Español e Inglés
- **Control parental** con PIN
- **DLNA cast** — envía stream a TV o altavoz compatible (Android + Windows)
- **Logos de canales** con caché local automático

### Calidad y fiabilidad
- **Crash capture silencioso** — errores reportados sin cierre forzado
- **Log export por QR** — diagnóstico remoto sin cables
- **Test de canales** — verifica disponibilidad de todos los canales de la lista
- **Background test service** — comprueba canales en segundo plano
- APK optimizado ≈ 40 MB

### Actualización OTA
- Comprueba versión en `version.json` alojado en GitHub
- Descarga APK directamente en la app
- Instalación con un toque (pide permiso automáticamente si necesario)
- URL de releases: `TonyBlanco/VOXTX-Releases` (público)

### Seguridad y privacidad
- **Sin cuenta** — no requiere registro ni email
- **Sin telemetría** — ningún dato enviado a servidores externos
- **Aviso legal** en primer inicio (aceptación explícita)

---

## Plataformas disponibles

| Plataforma | Estado | Notas |
|-----------|--------|-------|
| Android Mobile (ARM64/v7a/x86_64) | ✅ Producción | APK en VOXTX-Releases |
| Android TV Box (Fire TV, Xiaomi Box, etc.) | ✅ Producción | D-Pad + ExoPlayer |
| PICO VR (PICO 4, PICO Neo) | ✅ Producción | 3D mode exclusivo |
| macOS (Apple Silicon + Intel) | ✅ Beta | Funcional, en pulido |
| Windows 10/11 | ✅ Beta | Funcional, sin systray aún |
| iOS | 🛠️ Próximamente | En desarrollo |

---

## Próximamente (roadmap)

| Feature | Descripción |
|---------|-------------|
| **Chromecast** | Cast directo a Chromecast sin pasar por DLNA |
| **Voice search** (Android TV) | Búsqueda por voz con el mando de Android TV |
| **Channel zapping** (ch±) | Cambio de canal con botones del mando remoto web |
| **iOS** | App nativa iPhone/iPad |
| **macOS App Store** | Distribución vía App Store con notarización |
| **WebOS / LG Smart TV** | Versión web empaquetada para LG ares-cli |

---

## Comparativa técnica vs IPTV Smarters

IPTV Smarters usa una arquitectura basada en ExoPlayer únicamente con una capa WebView para la UI (código obfuscado con Proguard). VOXTV usa media_kit (libmpv) que soporta más codecs, más protocolos (HLS, DASH, TS, RTP, RTSP, RTMP) sin depender de la API de ExoPlayer de Android, lo que le da mayor compatibilidad cross-platform y control sobre el renderizado.

| Aspecto | VOXTV | IPTV Smarters |
|---------|-------|--------------|
| Engine | media_kit (libmpv) + ExoPlayer nativo Android | ExoPlayer / ijkplayer |
| UI | Flutter nativo 60/120fps | WebView hybrid |
| Codecs | Todos (según libmpv) | H.264, H.265 (ExoPlayer limits) |
| Protocolos | HLS, DASH, TS, RTSP, RTMP, RTP, HTTP | HLS, DASH (limitado) |
| Plataformas | Android, macOS, Windows, iOS (próx.) | Android, iOS |
| Offline | ✅ | ❌ |
| 3D/VR | ✅ PICO nativo | ❌ |
| Sin ads | ✅ | ❌ (versión gratuita con anuncios) |

---

*Documento interno — uso para marketing, description de tiendas y comunicación con usuarios.*

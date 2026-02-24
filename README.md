# VoXTV

<p align="center">
  <img src="assets/icons/app_icon.png" width="120" alt="Logo de VoXTV">
</p>

<p align="center">
  <strong>Reproductor IPTV moderno para Windows, Android y Android TV</strong>
</p>

<p align="center">
  <a href="https://github.com/TonyBlanco/VOXTX-Android/releases">
    <img src="https://img.shields.io/github/v/release/TonyBlanco/VOXTX-Android?include_prereleases" alt="Última versión">
  </a>
  <a href="https://github.com/TonyBlanco/VOXTX-Android/actions/workflows/build-release.yml">
    <img src="https://github.com/TonyBlanco/VOXTX-Android/actions/workflows/build-release.yml/badge.svg?branch=master" alt="Estado de compilación">
  </a>
  <a href="https://github.com/TonyBlanco/VOXTX-Android/releases">
    <img src="https://img.shields.io/github/downloads/TonyBlanco/VOXTX-Android/total" alt="Descargas">
  </a>
</p>

<p align="center">
  <strong>Español</strong> | <a href="README_EN.md">English</a>
</p>

VoXTV es un reproductor IPTV de alto rendimiento desarrollado con Flutter, optimizado para escritorio, móvil y TV.

## Aviso legal

1. Esta aplicación es solo un reproductor multimedia y no provee, aloja ni distribuye contenido audiovisual.
2. La app no incluye listas M3U/M3U8/TXT preconfiguradas.
3. Cada usuario es responsable de usar fuentes y contenidos legales.
4. El desarrollador no asume responsabilidad por el contenido reproducido por terceros.

## Descargas

Descarga la versión más reciente desde:

- Releases: https://github.com/TonyBlanco/VOXTX-Android/releases/latest

Plataformas disponibles:

- Windows x64 (`.exe`)
- Android móvil (`arm64-v8a`, `armeabi-v7a`, `x86_64`)
- Android TV (`arm64-v8a`, `armeabi-v7a`, `x86_64`)

## Funciones principales

- Reproducción IPTV con soporte para múltiples formatos (HLS, MP4, MKV, RTMP/RTSP)
- Gestión de listas M3U/M3U8/TXT por URL, archivo local y QR
- Favoritos, historial y búsqueda de canales
- Soporte para multi-fuente y modo multiventana
- EPG (XMLTV) y soporte DLNA

## Desarrollo

Requisitos:

- Flutter SDK `>=3.5.0`
- Android Studio (Android/TV)
- Visual Studio (Windows)

Comandos básicos:

```bash
git clone https://github.com/TonyBlanco/VOXTX-Android.git
cd VOXTX-Android
flutter pub get

# Ejecutar
flutter run -d windows
flutter run -d <android_device>

# Compilar release
flutter build windows
flutter build apk --release
```

## Soporte

- Issues: https://github.com/TonyBlanco/VOXTX-Android/issues
- Repositorio: https://github.com/TonyBlanco/VOXTX-Android

## Licencia

MIT

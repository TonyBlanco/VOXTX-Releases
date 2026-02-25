# Observaciones Adicionales y Mejoras Identificadas

**Proyecto:** VoxTv  
**Versión analizada:** 1.5.22+182  
**Archivos revisados:** `pubspec.yaml` y `main.dart`  
**Fecha:** 25 de febrero de 2026  

## Introducción

Se realizó un análisis detallado de los dos archivos proporcionados. A continuación se presentan las mejoras identificadas que van más allá de los problemas de navegación D-Pad en Android TV. El enfoque se centra en **mantenibilidad**, **rendimiento**, **tamaño del APK**, **seguridad** y **buenas prácticas de Flutter 2026**.

---

## 1. Mejoras recomendadas en `pubspec.yaml`

| Área                        | Observación actual                                      | Mejora recomendada                                                                 | Beneficio esperado                              |
|-----------------------------|---------------------------------------------------------|------------------------------------------------------------------------------------|-------------------------------------------------|
| Dependencias principales    | Versiones algo desactualizadas (febrero 2026)           | Actualizar a las últimas estables:<br>• `provider: ^6.1.5+1`<br>• `media_kit:*` family a ^2.x<br>• `dio: ^5.9.1`<br>• `shared_preferences: ^2.5.4`<br>• `sqflite: ^2.4.2` | Corrección de bugs, mejor rendimiento en TV y seguridad |
| Duplicidad de reproductores | `media_kit` + `video_player: ^2.9.2`                    | Eliminar completamente `video_player` y todas sus dependencias                     | Reducción del APK entre 8-12 MB                 |
| Assets de fuentes           | 11 familias completas (SimHei, MicrosoftYaHei, Arial, etc.) | 1. Subsetear fuentes<br>2. Mantener solo las realmente usadas<br>3. Considerar `google_fonts` con caché offline | Reducción >5 MB en el bundle                    |
| Linter                      | Solo `flutter_lints: ^3.0.1`                            | Crear archivo `analysis_options.yaml` con reglas personalizadas                     | Código más limpio y detección temprana de errores |
| Iconos                      | `flutter_launcher_icons` en dev_dependencies            | Actualizar a ^0.14.0 y crear `flutter_launcher_icons.yaml`                         | Iconos adaptativos correctos para Android TV    |
| SDK y versión               | `sdk: '>=3.5.0 <4.0.0'`                                 | Agregar `flutter: ">=3.27.0"` en environment                                       | Mejor compatibilidad con Android TV 14          |

---

## 2. Mejoras recomendadas en `main.dart`

| Área                              | Problema observado                                           | Recomendación concreta                                                                 | Impacto esperado                              |
|-----------------------------------|--------------------------------------------------------------|----------------------------------------------------------------------------------------|-----------------------------------------------|
| Responsabilidad única             | `_DlnaAwareAppState` maneja >300 líneas (orientación, DLNA, auto-refresh, etc.) | Extraer a servicios separados: `OrientationService`, `DlnaService`, etc.               | Código legible y fácilmente testable          |
| Uso excesivo de `context.read()`  | Múltiples `context.read()` dentro de listeners e `initState` | Usar `Consumer` / `Selector` o pasar providers explícitamente                          | Evita memory leaks y rebuilds innecesarios    |
| Inicialización asíncrona          | Múltiples `addPostFrameCallback` y awaits mezclados          | Crear un `AppInitializer` service centralizado                                         | Inicio más predecible y sin race conditions   |
| Manejo de plataforma              | Repetición de `if (Platform.isWindows)`, `if (Platform.isAndroid)` | Centralizar todo en `PlatformDetector` y crear extensiones (`context.isTV`, etc.)      | Código más limpio y mantenible                |
| Shortcuts y acciones              | Solo select/enter (parcial)                                  | Ampliar con todas las teclas del remote (incluyendo volumen, mute, etc.)               | Preparación completa para Android TV          |
| Dispose incompleto                | No se remueven todos los listeners                           | Añadir `removeListener` en `dispose()` para cada provider                              | Prevención de memory leaks en sesiones largas  |
| Anidamiento de Consumer           | `MultiProvider` → `Consumer` → otro `Consumer`               | Reducir anidamiento usando `Selector` o `listen: false`                                | Mejor rendimiento en pantallas complejas      |
| Error handling global             | Solo `FlutterError.onError`                                  | Agregar `PlatformDispatcher.instance.onError` y manejo de Zone global                  | Captura completa de crashes en producción     |

---

## Prioridad de implementación recomendada

**Alta prioridad (1-2 días)**  
- Actualizar dependencias + eliminar `video_player`  
- Crear `analysis_options.yaml`  
- Extraer lógica de `_DlnaAwareAppState`

**Media prioridad (3-5 días)**  
- Optimizar fuentes y assets  
- Mejorar inicialización y dispose  
- Aplicar solución completa de `AndroidTvFocusManager`

**Baja prioridad**  
- Migración opcional a Riverpod (solo si se prevé crecimiento grande)

---

**Nota final**  
Todas las mejoras propuestas son compatibles con la arquitectura actual (Provider + ServiceLocator + AppRouter) y no afectan el funcionamiento en Windows ni Android Mobile.


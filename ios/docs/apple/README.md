# Apple Store Submission Pack (macOS)

Este paquete documenta qué se preparó para macOS y qué falta para enviar a Apple.

## Artefactos generados
- `dist/VOXTV-macos-release.dmg`
- `dist/SHA256SUMS.txt`

## Documentos
- `docs/apple/01_submission_checklist.md`
- `docs/apple/02_privacy_nutrition_label_template.md`
- `docs/apple/03_review_notes_template.md`
- `docs/apple/04_signing_notarization_guide.md`

## Datos actuales del proyecto
- App name: `VOXTV`
- Bundle ID: `com.voxtv.player`
- Versión Flutter (`pubspec.yaml`): `1.5.32+192`

## Nota importante
Para **Mac App Store**, Apple no usa DMG para el envío. El envío se hace con
`Archive` desde Xcode y subida a App Store Connect/Transporter (firmado con
certificado **Apple Distribution** y perfil de provisión Mac App Store).

El DMG incluido es para QA/distribución manual interna.

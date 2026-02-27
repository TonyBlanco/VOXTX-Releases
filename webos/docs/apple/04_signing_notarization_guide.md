# Firma, Notarización y Envío (macOS)

## 1) Build release local
```bash
flutter build macos --release
```

Artefacto local:
- `build/macos/Build/Products/Release/VOXTV.app`

## 2) DMG (QA interno)
```bash
hdiutil create -volname "VOXTV" \
  -srcfolder dist/release-macos \
  -ov -format UDZO dist/VOXTV-macos-release.dmg
```

## 3) Mac App Store (no DMG)
Para App Store usar Xcode:
1. `open macos/Runner.xcworkspace`
2. Seleccionar target `Runner` + configuración `Release`
3. Verificar Signing (Apple Distribution + Mac App Store profile)
4. `Product > Archive`
5. `Distribute App > App Store Connect > Upload`

## 4) Entitlements actuales
Release entitlements actuales:
- `com.apple.security.app-sandbox = true`
- `com.apple.security.network.client = true`
- `com.apple.security.files.user-selected.read-write = true`

Revisar que no haya capacidades extra no justificadas antes del envío.

## 5) Verificaciones recomendadas
```bash
codesign -dv --verbose=4 build/macos/Build/Products/Release/VOXTV.app
spctl -a -vv build/macos/Build/Products/Release/VOXTV.app
```

## 6) Checksums
```bash
shasum -a 256 dist/VOXTV-macos-release.dmg
```

# Checklist de Envío a Apple (macOS)

## 1. Cuenta y acceso
- [ ] Membresía activa Apple Developer Program
- [ ] Acceso a App Store Connect con permisos de App Manager
- [ ] App creada en App Store Connect con bundle id correcto

## 2. Identidad de la app
- [ ] App Name: `VOXTV`
- [ ] Bundle ID: `com.voxtv.player`
- [ ] Versión marketing y build definidos
- [ ] Icono de app y metadata finalizados

## 3. Firma y distribución
- [ ] Certificado `Apple Distribution` instalado en Keychain
- [ ] Perfil de provisión para **Mac App Store** instalado
- [ ] En Xcode Runner target: Signing automático/manual correcto
- [ ] Entitlements validados para sandbox

## 4. Seguridad y cumplimiento
- [ ] Política de privacidad pública (URL) disponible
- [ ] Privacy Nutrition Label completado en App Store Connect
- [ ] Export Compliance contestado (encryption)
- [ ] Copyright/licencias de contenido validadas

## 5. Build y subida
- [ ] `flutter build macos --release` OK
- [ ] Archive desde Xcode (`Product > Archive`) OK
- [ ] Upload a App Store Connect OK
- [ ] Build procesado y visible en TestFlight/App Store Connect

## 6. Revisión Apple
- [ ] Capturas de pantalla macOS
- [ ] Descripción corta/larga final
- [ ] Notas para reviewer completas
- [ ] Credenciales demo (si aplica)

## 7. Post-envío
- [ ] Monitoreo de estado de revisión
- [ ] Plan de respuesta a rechazo (appeal/fix)

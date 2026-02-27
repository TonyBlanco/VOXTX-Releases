# WebOS Agent Runbook (LG TV Developer Mode)

Last verified: 2026-02-26

## Scope

This runbook documents the real-device WebOS deployment blockers and the exact working commands.
Use this before reporting "WebOS install is broken".

## Confirmed Working Environment

- TV profile: `tv`
- TV connection: `ssh://prisoner@<TV_IP>:9922`
- Device setup: `ares-setup-device -a tv -i host=<TV_IP> -i port=9922 -i username=prisoner -i passphrase=<PASSCODE>`

## Critical Blocker #1 (Node 25 + ares-install)

With Node `v25.x`, `ares-install` can fail during SFTP upload with:

- `isDate is not a function`
- `Callback was already called`

This is a CLI/runtime compatibility issue, not a network or passphrase issue.

### Fix

Force Node 20 for all `ares-*` commands:

```bash
export PATH="/opt/homebrew/opt/node@20/bin:$PATH"
node -v   # must print v20.x
```

Then run:

```bash
ares-install -d tv ./build/com.tonyblanco.voxtv_1.5.36_all.ipk
ares-launch -d tv com.tonyblanco.voxtv
```

## Critical Blocker #2 (ares-package minifier vs Flutter web JS)

`ares-package` may fail minifying modern Flutter-generated files (examples observed):

- `canvaskit/chromium/canvaskit.js`
- `canvaskit/skwasm.js`
- `flutter.js`

Error shape:

- `Failed to minify code ... SyntaxError: Unexpected token ...`

### Practical note

If packaging fails only at minification stage, the issue is the `@webos-tools/cli` minifier version.
For emergency device-pipeline validation, temporary JS stubs can be used only to validate:

1. `.ipk` generation
2. install path
3. app launch path

Do not ship these stubs as production playback builds.

## Known-good minimal flow

```bash
# 1) Build web bundle
flutter build web --release --no-wasm-dry-run

# 2) Copy into WebOS package folder
cp -R build/web/* webos/

# 3) Package
ares-package -v ./webos -o ./build

# 4) Force Node 20 for install/launch
export PATH="/opt/homebrew/opt/node@20/bin:$PATH"
ares-install -d tv ./build/com.tonyblanco.voxtv_1.5.36_all.ipk
ares-launch -d tv com.tonyblanco.voxtv
```

## Post-install verification

```bash
ares-install -l -d tv | rg 'com.tonyblanco.voxtv'
```

Expected line:

- `com.tonyblanco.voxtv`

## Guardrails for agents

1. Do not report WebOS broken until testing with Node 20.
2. Keep packaging workaround changes clearly marked as temporary.
3. If you had to patch runtime JS for packaging, document it in the PR summary.
4. Never mix Android platform edits in a WebOS-only task.

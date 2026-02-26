#!/usr/bin/env bash
# ============================================================================
# build_webos_legacy.sh — Build, transpile & deploy VOXTV to webOS 5+ (Chrome 68)
#
# Usage:  ./scripts/build_webos_legacy.sh [device]   (default: tv)
#
# Prerequisites:
#   brew install binaryen          (wasm-opt for WASM downleveling)
#   npm install -g @webosose/ares-cli
#   Node 20 must be at /opt/homebrew/opt/node@20/bin  (ares-cli compat)
# ============================================================================
set -euo pipefail

APP_ID="com.tonyblanco.voxtv"
DEVICE="${1:-tv}"

# ── 1. Flutter web build ────────────────────────────────────────────────────
echo "[1/8] Build Flutter web (dart2js + CanvasKit)"
flutter build web --release --no-wasm-dry-run

# ── 2. Copy build output → webos/ ───────────────────────────────────────────
echo "[2/8] Sync build/web → webos/"
rsync -a --delete --exclude='appinfo.json' --exclude='icon.png' --exclude='largeIcon.png' --exclude='.gitignore' build/web/ webos/

# ── 3. Fix base href for packaged app ───────────────────────────────────────
echo "[3/8] Fix <base href> for packaged app (file:// protocol)"
sed -i '' 's|<base href="[^"]*">|<base href="./">|' webos/index.html || true

# ── 4. Downlevel CanvasKit WASM → Chrome 68 MVP ────────────────────────────
# Chrome 68 (webOS 5.x) does NOT support WASM features:
#   - sign-extension (Chrome 74+)
#   - mutable-globals import/export (Chrome 74+)
# wasm-opt rewrites sign-ext instructions to MVP shl+shr equivalents and
# strips the feature-requirement metadata from the binary.
echo "[4/8] Downlevel WASM → MVP (Chrome 68 compat)"
command -v wasm-opt >/dev/null 2>&1 || { echo "ERROR: wasm-opt not found. Run: brew install binaryen"; exit 1; }
for wasm_file in $(find webos/canvaskit -name 'canvaskit.wasm'); do
  echo "  ↳ $(basename "$wasm_file")"
  wasm-opt "$wasm_file" \
    --signext-lowering \
    --strip-target-features \
    --enable-mutable-globals \
    -o "${wasm_file}.tmp"
  mv "${wasm_file}.tmp" "$wasm_file"
done

# ── 5. Transpile JS → Chrome 68 syntax ─────────────────────────────────────
# esbuild converts optional chaining (?.), nullish coalescing (??), logical
# assignment (??=, ||=, &&=), and other syntax Chrome 68 doesn't understand.
echo "[5/8] Transpile JS → Chrome 68 syntax"
TMP_JS="$(mktemp -d /tmp/webos_legacy_js.XXXXXX)"
find webos -type f -name '*.js' -print0 | xargs -0 npx -y esbuild --target=chrome68 --outbase=webos --outdir="$TMP_JS" --log-level=error
rsync -a "$TMP_JS"/ webos/
rm -rf "$TMP_JS"

# Sanity check: no modern tokens should remain in runtime files
if grep -qE '\?\.|(\?\?=)' webos/flutter.js webos/flutter_bootstrap.js 2>/dev/null; then
  echo "[WARN] Modern JS tokens detected after transpile — esbuild may have missed some."
fi

# ── 6. Remove skwasm binaries (not needed for dart2js build) ────────────────
echo "[6/8] Remove unused skwasm/wimp binaries"
rm -f webos/canvaskit/skwasm*.wasm webos/canvaskit/skwasm*.js webos/canvaskit/skwasm*.symbols 2>/dev/null || true
rm -f webos/canvaskit/wimp.wasm webos/canvaskit/wimp.js webos/canvaskit/wimp.js.symbols 2>/dev/null || true

# ── 7. Package IPK ──────────────────────────────────────────────────────────
echo "[7/8] Package IPK"
ares-package --no-minify ./webos -o ./build
IPK="$(ls -t build/${APP_ID}_*_all.ipk 2>/dev/null | head -1)"
if [[ -z "$IPK" ]]; then
  echo "ERROR: ares-package did not produce an IPK"; exit 1
fi
echo "  ↳ $IPK ($(du -h "$IPK" | cut -f1))"

# ── 8. Install & launch ────────────────────────────────────────────────────
echo "[8/8] Install & launch on device: $DEVICE"
export PATH="/opt/homebrew/opt/node@20/bin:$PATH"
echo "  node $(node -v)"
ares-install -d "$DEVICE" "$IPK"
ares-launch -d "$DEVICE" "$APP_ID"

echo ""
echo "✅ Done. Debug:  ares-inspect --app $APP_ID -d $DEVICE --open"
echo "   Logs:   ares-log -d $DEVICE"

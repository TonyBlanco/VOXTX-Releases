# VOXTV — Agent Workflow Guide

> **READ THIS BEFORE ANY COMMIT, BUILD, OR RELEASE.**  
> This document tells AI agents exactly how to work with this repo.

---

> ## 🚨 REGLA CRÍTICA — RELEASES DE APKs
> **VOXTX-Android es PRIVADO. Los usuarios NO pueden descargar APKs de ahí.**  
> **TODOS los `gh release create` con APKs DEBEN usar `--repo TonyBlanco/VOXTX-Releases`.**  
> Esto incluye: `gh release create`, las URLs en `version.json`, y `_githubReleasesUrl` en `update_service.dart`.  
> ⛔ NUNCA usar `--repo TonyBlanco/VOXTX-Android` para releases de APKs. Los usuarios no podrán descargar nada.

---

## Git Remotes (this repo only)

```
origin  https://github.com/shnulaa/FlutterIPTV.git      ← UPSTREAM FORK — NEVER PUSH HERE
voxtx   https://github.com/TonyBlanco/VOXTX-Android.git ← PRIVATE DEV REPO — push all dev work here
```

| Remote | Purpose | Push? |
|--------|---------|:-----:|
| `origin` | Upstream fork (read-only reference) | ❌ NEVER |
| `voxtx` | Private dev work | ✅ YES |

> **⚠️ VOXTX-Releases (`https://github.com/TonyBlanco/VOXTX-Releases`) — REGLA ABSOLUTA:**  
> En este repo **solo se publican dos cosas**:
> 1. **APKs** — como assets de un GitHub Release (via `gh release create`)
> 2. **`version.json`** — el manifest que la app usa para detectar actualizaciones
>
> **NUNCA** añadirlo como remote. **NUNCA** hacer `git push` de código fuente ni branches.  
> Es un repo público — cualquier cosa que se suba es visible para todo el mundo.

---

## Version Numbers

File: `pubspec.yaml`
```yaml
version: MAJOR.MINOR.PATCH+BUILD
# Example: 1.5.21+181
```
- **PATCH** (+1) — bug fixes, small improvements  
- **MINOR** (+1, PATCH→0) — new features  
- **BUILD** always +1 from previous, never reset  

---

## Full Release Process (step by step)

### 1. Bump version
```bash
# Edit pubspec.yaml
version: 1.5.XX+YYY   # increment both
```

### 2. Update CHANGELOG.md and docs/version.json

**CHANGELOG.md** — add entry at the top under `## [Unreleased]`:
```markdown
## [1.5.XX] - YYYY-MM-DD

### Added
- ...

### Fixed
- ...
```

**version.json (repo root)** — this is what the app checks to detect a new version. The app fetches:
```
https://raw.githubusercontent.com/TonyBlanco/VOXTX-Releases/main/version.json
```
**Must be updated on every release or the app will never show the update notification.**

Also keep `docs/version.json` in sync (used by the GitHub Pages website).
```json
{
  "version": "1.5.XX",
  "build": YYY,
  "releaseDate": "YYYY-MM-DD",
  "assets": {
    "windows": "https://github.com/TonyBlanco/VOXTX-Releases/releases/download/v1.5.XX/flutteriptv-Windows-x64-Setup.exe",
    "android_mobile": {
      "arm64-v8a": "https://github.com/TonyBlanco/VOXTX-Releases/releases/download/v1.5.XX/app-arm64-v8a-release.apk",
      "armeabi-v7a": "https://github.com/TonyBlanco/VOXTX-Releases/releases/download/v1.5.XX/app-armeabi-v7a-release.apk",
      "x86_64": "https://github.com/TonyBlanco/VOXTX-Releases/releases/download/v1.5.XX/app-x86_64-release.apk"
    },
    "android_tv": {
      "arm64-v8a": "https://github.com/TonyBlanco/VOXTX-Releases/releases/download/v1.5.XX/app-arm64-v8a-release.apk",
      "armeabi-v7a": "https://github.com/TonyBlanco/VOXTX-Releases/releases/download/v1.5.XX/app-armeabi-v7a-release.apk",
      "x86_64": "https://github.com/TonyBlanco/VOXTX-Releases/releases/download/v1.5.XX/app-x86_64-release.apk"
    }
  },
  "changelog": {
    "es": "- Resumen en español",
    "en": "- English summary",
    "zh": "- English summary"
  },
  "minVersion": "1.0.0"
}
```
> APK filenames in the release assets are always the default Flutter names:  
> `app-arm64-v8a-release.apk`, `app-armeabi-v7a-release.apk`, `app-x86_64-release.apk`

### 3. Build APKs
```bash
flutter build apk --release --split-per-abi
# Output: build/app/outputs/flutter-apk/
#   app-arm64-v8a-release.apk     ← Android TV + modern phones (64-bit)
#   app-armeabi-v7a-release.apk   ← 32-bit Android
#   app-x86_64-release.apk        ← Emulators
```

### 4. Commit and tag
```bash
git add -A
git commit -m "v1.5.XX - short description"
git tag v1.5.XX
```

### 5. Push to private dev repo
```bash
git pull --rebase voxtx master   # always pull before push
git push voxtx master
git push voxtx v1.5.XX
```

### 6. Update version.json in VOXTX-Releases

**NEVER** add VOXTX-Releases as a remote in this repo. Clone it separately, edit `version.json`, push, then delete the clone:

```bash
cd /tmp
git clone https://github.com/TonyBlanco/VOXTX-Releases.git voxtx-releases-tmp
cd voxtx-releases-tmp
# Edit version.json: bump version, build, changelog, and APK download URLs
git add version.json
git commit -m "version: bump to v1.5.XX"
git push origin main
cd /tmp && rm -rf voxtx-releases-tmp
```

> VOXTX-Releases must contain ONLY `version.json`. No source code, no branches from this repo, ever.

### 7. Create GitHub Release with APKs

Write release notes to a temp file first (avoids shell escaping issues):
```bash
# Create /tmp/release_notes.md with the release description, then:

gh release create v1.5.XX \
  "build/app/outputs/flutter-apk/app-arm64-v8a-release.apk" \
  "build/app/outputs/flutter-apk/app-armeabi-v7a-release.apk" \
  "build/app/outputs/flutter-apk/app-x86_64-release.apk" \
  --repo TonyBlanco/VOXTX-Releases \
  --title "v1.5.XX - Description" \
  --notes-file /tmp/release_notes.md
```

> **IMPORTANT**: Always use `--notes-file` not `--notes` to avoid shell multi-line escaping errors.

---

## Checking for Errors Before Building

```bash
flutter analyze --no-fatal-infos 2>&1 | grep "error:" | head -20
```

Only block a build on **compile errors** (`error:`).  
Ignore **info/warning** lines (unused imports, lint hints) unless they are new and introduced by your changes.

---

## Common Mistakes AI Agents Must Avoid

| Mistake | Correct Action |
|---------|---------------|
| Pushing to `origin` | `origin` is the upstream fork — never push |
| **`gh release create --repo TonyBlanco/VOXTX-Android`** | **⛔ VOXTX-Android es PRIVADO — APKs van SIEMPRE a `--repo TonyBlanco/VOXTX-Releases`** |
| **APK URLs in `version.json` pointing to VOXTX-Android** | **⛔ PRIVADO — usar `VOXTX-Releases/releases/download/...`** |
| **Adding VOXTX-Releases as a git remote in this repo** | **FORBIDDEN — it caused 319MB source code to leak to the public releases repo; use a separate `/tmp` clone instead** |
| **Doing `git push [any-remote] [anything]` to VOXTX-Releases** | **Only update VOXTX-Releases via a separate clone in /tmp; then delete that clone** |
| Pushing APKs only to `voxtx` | APKs go to VOXTX-Releases via `gh release create --repo TonyBlanco/VOXTX-Releases` |
| **Creating GitHub Release on VOXTX-Android** | **FORBIDDEN — ⚠️ v1.5.30–v1.5.33 were mistakenly published to VOXTX-Android. Always use `--repo TonyBlanco/VOXTX-Releases`** |
| **version.json asset URLs pointing to VOXTX-Android** | **Must always point to `VOXTX-Releases/releases/download/...` — the app and the "Update now" button both rely on this** |
| Using `git push` without specifying remote | Always specify: `git push voxtx master` |
| Creating GitHub Release on wrong repo | Always `--repo TonyBlanco/VOXTX-Releases` |
| Using `--notes` with multi-line text | Write to a file, use `--notes-file` |
| Forgetting to increment BUILD number | `version: X.Y.Z+BUILD` — both must increment |
| **Forgetting to update `docs/version.json`** | **Keep in sync for the GitHub Pages website** |
| **Forgetting to update root `version.json` in VOXTX-Releases** | **The app fetches this URL — 404 = no update detected** |
| `git push` fails (rejected) | Run `git pull --rebase voxtx master` first |

---

## Project Structure Quick Reference

```
lib/
  core/
    services/epg_service.dart       — EPG parser (EpgProgram, EpgService)
    services/service_locator.dart   — Global singletons (db, log, prefs)
    theme/app_theme.dart            — AppTheme static helpers (use these, not hardcoded colors)
    navigation/app_router.dart      — All route names and route generation
    widgets/tv_sidebar.dart         — TV sidebar nav (9 items, indices 0–8)
    platform/platform_detector.dart — PlatformDetector.isTV / isMobile / isDesktop
  features/
    channels/   — LIVE channels screen + ChannelProvider
    epg/        — EPG screen + EpgProvider
    player/     — Full-screen player (media_kit + native ExoPlayer)
    home/       — Home screen (TV uses TVSidebar, mobile uses bottom nav)
    settings/   — Settings screen + SettingsProvider
```

---

## TV Sidebar Nav Items (current order)

| Index | Icon | Route |
|-------|------|-------|
| 0 | home_rounded | `null` → pops to home |
| 1 | live_tv_rounded | `/channels` |
| 2 | event_note_rounded | `/epg` |
| 3 | movie_rounded | `/movies` |
| 4 | video_library_rounded | `/series` |
| 5 | playlist_play_rounded | `/playlist-list` |
| 6 | favorite_rounded | `/favorites` |
| 7 | search_rounded | `/search` |
| 8 | settings_rounded | `/settings` |

FocusNode count in `tv_sidebar.dart` must match item count (currently `i < 9`).  
Keyboard boundary: `index == 8` blocks arrow-down on last item.

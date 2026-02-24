# VOXTV — Agent Workflow Guide

> **READ THIS BEFORE ANY COMMIT, BUILD, OR RELEASE.**  
> This document tells AI agents exactly how to work with this repo.

---

## Git Remotes

```
origin    https://github.com/shnulaa/FlutterIPTV.git    ← UPSTREAM FORK — NEVER PUSH HERE
voxtx     https://github.com/TonyBlanco/VOXTX-Android.git   ← PRIVATE DEV REPO
releases  https://github.com/TonyBlanco/VOXTX-Releases.git  ← PUBLIC RELEASES REPO
```

| Remote | Purpose | Push dev commits? | Push release tags? | Push APKs? |
|--------|---------|:-----------------:|:-----------------:|:----------:|
| `origin` | Upstream fork (read-only reference) | ❌ NEVER | ❌ NEVER | ❌ NEVER |
| `voxtx` | Private dev work | ✅ YES | ✅ YES | ❌ |
| `releases` | Public releases for users | ✅ YES (master only) | ✅ YES | ✅ via `gh release` |

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

### 2. Update CHANGELOG.md
Add entry at the top under `## [Unreleased]`:
```markdown
## [1.5.XX] - YYYY-MM-DD

### Added
- ...

### Fixed
- ...
```

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

### 6. Push to public releases repo
```bash
git push releases master
git push releases v1.5.XX
```

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
| Pushing APKs only to `voxtx` | APKs + GitHub Release go to `releases` |
| Using `git push` without specifying remote | Always specify: `git push voxtx` or `git push releases` |
| Creating GitHub Release on wrong repo | Always `--repo TonyBlanco/VOXTX-Releases` |
| Using `--notes` with multi-line text | Write to a file, use `--notes-file` |
| Forgetting to increment BUILD number | `version: X.Y.Z+BUILD` — both must increment |
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

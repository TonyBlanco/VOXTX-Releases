# Android Update and Release Guide

Last updated: 2026-02-26

## Goal

Prevent Android update failures caused by wrong repo publishing, stale manifests, or mismatched version/build.

## Source of Truth

- App checks updates from:
  - `https://raw.githubusercontent.com/TonyBlanco/VOXTX-Releases/main/version.json`
- Release assets must be in:
  - `https://github.com/TonyBlanco/VOXTX-Releases/releases`

## Mandatory Rules

1. Never publish APK releases to `VOXTX-Android` (private).
2. Always publish APK releases to `TonyBlanco/VOXTX-Releases`.
3. Keep `version.json` and `docs/version.json` synchronized.
4. Ensure `version`, `build`, `releaseDate`, and Android asset URLs match across both files.
5. Use default Flutter APK filenames in manifest URLs:
   - `app-arm64-v8a-release.apk`
   - `app-armeabi-v7a-release.apk`
   - `app-x86_64-release.apk`

## Update Detection Logic

Update is available when:

1. `latest.version > current.version`, or
2. `latest.version == current.version` and `latest.build > current.build`

This means build-only releases are supported, but only if `build` is correctly incremented in the manifest.

## GitHub Actions Requirements

- Workflow `.github/workflows/build-release.yml` is configured to publish to:
  - `RELEASES_REPO=TonyBlanco/VOXTX-Releases`
- Required secret:
  - `VOXTX_RELEASES_TOKEN`

If this secret is missing, the release step will fail even if the build succeeds.

## Pre-release Checklist

1. `pubspec.yaml` version bumped (`MAJOR.MINOR.PATCH+BUILD`).
2. `version.json` updated.
3. `docs/version.json` updated with same data.
4. URLs point to `VOXTX-Releases/releases/download/vX.Y.Z/...`.
5. Tag matches manifest version (`vX.Y.Z`).
6. CI has `VOXTX_RELEASES_TOKEN`.

## Fast Diagnostics (when TV/Android says no update)

1. Compare installed app version/build with manifest version/build.
2. Verify remote `VOXTX-Releases/main/version.json` exists and is latest.
3. Confirm Android URLs in manifest match actual uploaded asset names.
4. Confirm release was created in `VOXTX-Releases`, not `VOXTX-Android`.
5. Re-run manual check from app settings.

package com.google.ads.interactivemedia.v3.internal;

import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
final class xw {
    public static void a(Surface surface, float f9) {
        try {
            surface.setFrameRate(f9, f9 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e9) {
            cd.c("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e9);
        }
    }
}

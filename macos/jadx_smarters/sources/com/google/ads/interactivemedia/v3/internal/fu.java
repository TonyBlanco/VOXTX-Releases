package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes3.dex */
final class fu {
    public static iw a(Context context, gc gcVar, boolean z9) {
        is isVarK = is.k(context);
        if (isVarK == null) {
            cd.e("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new iw(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z9) {
            gcVar.M(isVarK);
        }
        return new iw(isVarK.j());
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes3.dex */
final class ri {
    public static void a(rd rdVar, iw iwVar) {
        LogSessionId logSessionIdA = iwVar.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        rdVar.f24359b.setString("log-session-id", logSessionIdA.getStringId());
    }
}

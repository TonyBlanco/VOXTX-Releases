package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes3.dex */
final class jx {
    public static void a(AudioTrack audioTrack, iw iwVar) {
        LogSessionId logSessionIdA = iwVar.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionIdA);
    }
}

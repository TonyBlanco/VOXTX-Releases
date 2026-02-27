package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes3.dex */
final class of {
    public static void a(MediaDrm mediaDrm, byte[] bArr, iw iwVar) {
        LogSessionId logSessionIdA = iwVar.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        af.s(playbackComponent);
        playbackComponent.setLogSessionId(logSessionIdA);
    }

    public static boolean b(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }
}

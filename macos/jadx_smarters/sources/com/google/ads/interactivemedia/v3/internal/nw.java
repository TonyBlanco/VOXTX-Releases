package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaDrm;

/* JADX INFO: loaded from: classes3.dex */
final class nw {
    public static int a(Throwable th) {
        return cq.i(cq.j(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }

    public static boolean b(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }
}

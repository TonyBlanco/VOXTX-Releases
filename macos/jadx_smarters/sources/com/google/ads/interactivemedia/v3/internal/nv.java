package com.google.ads.interactivemedia.v3.internal;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;

/* JADX INFO: loaded from: classes3.dex */
final class nv {
    public static boolean a(Throwable th) {
        return th instanceof DeniedByServerException;
    }

    public static boolean b(Throwable th) {
        return th instanceof NotProvisionedException;
    }
}

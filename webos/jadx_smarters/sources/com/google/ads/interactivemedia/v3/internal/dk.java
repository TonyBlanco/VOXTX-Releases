package com.google.ads.interactivemedia.v3.internal;

import android.system.ErrnoException;
import android.system.OsConstants;

/* JADX INFO: loaded from: classes3.dex */
final class dk {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}

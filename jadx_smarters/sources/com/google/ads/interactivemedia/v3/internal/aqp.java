package com.google.ads.interactivemedia.v3.internal;

import android.os.StrictMode;
import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes3.dex */
@Hide
public final class aqp {
    public static Object a(atq atqVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return atqVar.a();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}

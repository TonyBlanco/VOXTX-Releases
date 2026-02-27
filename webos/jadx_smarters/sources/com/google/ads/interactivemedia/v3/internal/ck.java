package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class ck implements bn {
    @Override // com.google.ads.interactivemedia.v3.internal.bn
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bn
    public final bv b(Looper looper, Handler.Callback callback) {
        return new cm(new Handler(looper, callback));
    }
}

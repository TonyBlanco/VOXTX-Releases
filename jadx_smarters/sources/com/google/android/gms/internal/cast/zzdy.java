package com.google.android.gms.internal.cast;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdy extends Handler {
    private final Looper zza;

    public zzdy() {
        this.zza = Looper.getMainLooper();
    }

    public zzdy(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }
}

package com.google.android.gms.internal.cast;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdx {
    public static final int zza;

    static {
        zza = Build.VERSION.SDK_INT >= 23 ? 67108864 : 0;
    }
}

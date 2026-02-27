package com.google.android.gms.internal.cast;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzeq implements Serializable {
    public static zzeq zzb(Object obj) {
        return obj == null ? zzem.zza : new zzev(obj);
    }

    public abstract Object zza();
}

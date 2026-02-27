package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzii implements Serializable {
    public static zzii zzc() {
        return zzie.zza;
    }

    public static zzii zzd(Object obj) {
        return new zzik(obj);
    }

    public abstract Object zza();

    public abstract boolean zzb();
}

package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzei {
    private static final ThreadLocal zza = new zzec();

    public static zzei zzb() {
        return (zzei) zza.get();
    }

    public abstract void zza(zzef zzefVar);
}

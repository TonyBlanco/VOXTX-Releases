package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzajs {
    private static final zzajs zza = new zzajv();
    private static final zzajs zzb = new zzajx();

    private zzajs() {
    }

    public static zzajs zza() {
        return zza;
    }

    public static zzajs zzb() {
        return zzb;
    }

    public abstract <L> List<L> zza(Object obj, long j9);

    public abstract <L> void zza(Object obj, Object obj2, long j9);

    public abstract void zzb(Object obj, long j9);
}

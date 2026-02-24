package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzva {
    final Unsafe zza;

    public zzva(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j9);

    public abstract float zzb(Object obj, long j9);

    public abstract void zzc(Object obj, long j9, boolean z9);

    public abstract void zzd(Object obj, long j9, byte b9);

    public abstract void zze(Object obj, long j9, double d9);

    public abstract void zzf(Object obj, long j9, float f9);

    public abstract boolean zzg(Object obj, long j9);
}

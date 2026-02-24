package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public class zzke {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public /* synthetic */ zzke(zzkd zzkdVar) {
    }

    public static int zzb(int i9) {
        return (i9 >>> 1) ^ (-(i9 & 1));
    }

    public static long zzc(long j9) {
        return (j9 >>> 1) ^ (-(1 & j9));
    }
}

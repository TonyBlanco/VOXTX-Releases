package com.google.android.recaptcha.internal;

import j$.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzj {

    @NotNull
    public static final zzj zza = new zzj();

    @NotNull
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    private zzj() {
    }

    public static final void zza(int i9, long j9) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer numValueOf = Integer.valueOf(i9);
        Object zziVar = concurrentHashMap.get(numValueOf);
        if (zziVar == null) {
            zziVar = new zzi();
        }
        zzi zziVar2 = (zzi) zziVar;
        zziVar2.zzg(zziVar2.zzb() + 1);
        zziVar2.zzf(zziVar2.zzd() + j9);
        zziVar2.zze(Math.max(j9, zziVar2.zzc()));
        concurrentHashMap.put(numValueOf, zziVar2);
    }
}

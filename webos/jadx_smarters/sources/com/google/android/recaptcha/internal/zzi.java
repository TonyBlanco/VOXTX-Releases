package com.google.android.recaptcha.internal;

import E8.o;
import m8.AbstractC2238a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzi implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    @NotNull
    public final String toString() {
        return "avgExecutionTime: " + o.c0(String.valueOf(this.zzb / ((long) this.zza)), 10, (char) 0, 2, null) + " us| maxExecutionTime: " + o.c0(String.valueOf(this.zzc), 10, (char) 0, 2, null) + " us| totalTime: " + o.c0(String.valueOf(this.zzb), 10, (char) 0, 2, null) + " us| #Usages: " + o.c0(String.valueOf(this.zza), 5, (char) 0, 2, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NotNull zzi zziVar) {
        return AbstractC2238a.a(Long.valueOf(this.zzb), Long.valueOf(zziVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j9) {
        this.zzc = j9;
    }

    public final void zzf(long j9) {
        this.zzb = j9;
    }

    public final void zzg(int i9) {
        this.zza = i9;
    }
}

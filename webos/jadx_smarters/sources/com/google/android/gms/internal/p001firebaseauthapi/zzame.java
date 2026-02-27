package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzame<T, B> {
    public abstract int zza(T t9);

    public abstract B zza();

    public abstract T zza(T t9, T t10);

    public abstract void zza(B b9, int i9, int i10);

    public abstract void zza(B b9, int i9, long j9);

    public abstract void zza(B b9, int i9, zzahp zzahpVar);

    public abstract void zza(B b9, int i9, T t9);

    public abstract void zza(T t9, zzana zzanaVar) throws IOException;

    public abstract boolean zza(zzalc zzalcVar);

    public final boolean zza(B b9, zzalc zzalcVar) throws IOException {
        int iZzd = zzalcVar.zzd();
        int i9 = iZzd >>> 3;
        int i10 = iZzd & 7;
        if (i10 == 0) {
            zzb(b9, i9, zzalcVar.zzl());
            return true;
        }
        if (i10 == 1) {
            zza(b9, i9, zzalcVar.zzk());
            return true;
        }
        if (i10 == 2) {
            zza((Object) b9, i9, zzalcVar.zzp());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw zzaji.zza();
            }
            zza((Object) b9, i9, zzalcVar.zzf());
            return true;
        }
        B bZza = zza();
        int i11 = 4 | (i9 << 3);
        while (zzalcVar.zzc() != Integer.MAX_VALUE && zza((Object) bZza, zzalcVar)) {
        }
        if (i11 != zzalcVar.zzd()) {
            throw zzaji.zzb();
        }
        zza(b9, i9, zze(bZza));
        return true;
    }

    public abstract int zzb(T t9);

    public abstract void zzb(B b9, int i9, long j9);

    public abstract void zzb(T t9, zzana zzanaVar) throws IOException;

    public abstract void zzb(Object obj, B b9);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t9);

    public abstract T zzd(Object obj);

    public abstract T zze(B b9);

    public abstract void zzf(Object obj);
}

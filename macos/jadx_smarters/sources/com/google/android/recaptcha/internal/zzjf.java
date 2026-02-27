package com.google.android.recaptcha.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzjf {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract void zzh(Object obj, int i9, int i10);

    public abstract void zzi(Object obj, int i9, long j9);

    public abstract void zzj(Object obj, int i9, Object obj2);

    public abstract void zzk(Object obj, int i9, zzez zzezVar);

    public abstract void zzl(Object obj, int i9, long j9);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public abstract void zzp(Object obj, zzjx zzjxVar) throws IOException;

    public abstract void zzq(Object obj, zzjx zzjxVar) throws IOException;

    public final boolean zzr(Object obj, zzik zzikVar) throws IOException {
        int iZzd = zzikVar.zzd();
        int i9 = iZzd >>> 3;
        int i10 = iZzd & 7;
        if (i10 == 0) {
            zzl(obj, i9, zzikVar.zzl());
            return true;
        }
        if (i10 == 1) {
            zzi(obj, i9, zzikVar.zzk());
            return true;
        }
        if (i10 == 2) {
            zzk(obj, i9, zzikVar.zzp());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw zzgy.zza();
            }
            zzh(obj, i9, zzikVar.zzf());
            return true;
        }
        Object objZzf = zzf();
        int i11 = i9 << 3;
        while (zzikVar.zzc() != Integer.MAX_VALUE && zzr(objZzf, zzikVar)) {
        }
        if ((4 | i11) != zzikVar.zzd()) {
            throw zzgy.zzb();
        }
        zzg(objZzf);
        zzj(obj, i9, objZzf);
        return true;
    }

    public abstract boolean zzs(zzik zzikVar);
}

package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzna extends zzsh implements zztq {
    private static final zzna zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private zzmc zzg;

    static {
        zzna zznaVar = new zzna();
        zzb = zznaVar;
        zzsh.zzG(zzna.class, zznaVar);
    }

    private zzna() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzhy.zza(), "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzna();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzmz(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

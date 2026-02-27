package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzod extends zzsh implements zztq {
    private static final zzod zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private int zzg;

    static {
        zzod zzodVar = new zzod();
        zzb = zzodVar;
        zzsh.zzG(zzod.class, zzodVar);
    }

    private zzod() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"zzd", "zze", zzjf.zza(), "zzf", "zzg", zzha.zza()});
        }
        if (i10 == 3) {
            return new zzod();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzoc(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

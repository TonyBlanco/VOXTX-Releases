package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzof extends zzsh implements zztq {
    private static final zzof zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        zzof zzofVar = new zzof();
        zzb = zzofVar;
        zzsh.zzG(zzof.class, zzofVar);
    }

    private zzof() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဆ\u0005", new Object[]{"zzd", "zze", "zzf", zzji.zza(), "zzg", "zzh", "zzi", zzhv.zza(), "zzj"});
        }
        if (i10 == 3) {
            return new zzof();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzoe(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

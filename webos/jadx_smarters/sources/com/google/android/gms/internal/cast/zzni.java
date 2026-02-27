package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzni extends zzsh implements zztq {
    private static final zzni zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private zzof zzi;
    private int zzj;

    static {
        zzni zzniVar = new zzni();
        zzb = zzniVar;
        zzsh.zzG(zzni.class, zzniVar);
    }

    private zzni() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006ဌ\u0005", new Object[]{"zzd", "zze", "zzf", zzie.zza(), "zzg", zzik.zza(), "zzh", zzgx.zza(), "zzi", "zzj", zzih.zza()});
        }
        if (i10 == 3) {
            return new zzni();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zznh(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

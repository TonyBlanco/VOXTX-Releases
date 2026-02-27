package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzoj extends zzsh implements zztq {
    private static final zzoj zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    static {
        zzoj zzojVar = new zzoj();
        zzb = zzojVar;
        zzsh.zzG(zzoj.class, zzojVar);
    }

    private zzoj() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzjl.zza(), "zzj", zzjl.zza(), "zzk"});
        }
        if (i10 == 3) {
            return new zzoj();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzoi(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

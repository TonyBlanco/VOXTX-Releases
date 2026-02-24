package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzop extends zzsh implements zztq {
    private static final zzop zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzh = "";
    private String zzk = "";

    static {
        zzop zzopVar = new zzop();
        zzb = zzopVar;
        zzsh.zzG(zzop.class, zzopVar);
    }

    private zzop() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i10 == 3) {
            return new zzop();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzoo(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

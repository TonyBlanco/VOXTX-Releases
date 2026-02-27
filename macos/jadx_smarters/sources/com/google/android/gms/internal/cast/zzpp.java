package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpp extends zzsh implements zztq {
    private static final zzpp zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;

    static {
        zzpp zzppVar = new zzpp();
        zzb = zzppVar;
        zzsh.zzG(zzpp.class, zzppVar);
    }

    private zzpp() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", zzlk.zza(), "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzpp();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzpo(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

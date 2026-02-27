package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmy extends zzsh implements zztq {
    private static final zzmy zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private long zzg;

    static {
        zzmy zzmyVar = new zzmy();
        zzb = zzmyVar;
        zzsh.zzG(zzmy.class, zzmyVar);
    }

    private zzmy() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001စ\u0000\u0002:\u0000\u00035\u0000\u00048\u0000", new Object[]{"zzf", "zze", "zzd", "zzg"});
        }
        if (i10 == 3) {
            return new zzmy();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzmx(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzng extends zzsh implements zztq {
    private static final zzng zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private zzsp zzh = zzsh.zzz();

    static {
        zzng zzngVar = new zzng();
        zzb = zzngVar;
        zzsh.zzG(zzng.class, zzngVar);
    }

    private zzng() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zznf.class});
        }
        if (i10 == 3) {
            return new zzng();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zznd(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

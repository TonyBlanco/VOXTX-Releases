package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgl extends zzsh implements zztq {
    private static final zzgl zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private zzgh zzi;
    private int zzj;

    static {
        zzgl zzglVar = new zzgl();
        zzb = zzglVar;
        zzsh.zzG(zzgl.class, zzglVar);
    }

    private zzgl() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004\u0006ဌ\u0005", new Object[]{"zzd", "zze", "zzf", zzgk.zza, "zzg", "zzh", "zzi", "zzj", zzgj.zza});
        }
        if (i10 == 3) {
            return new zzgl();
        }
        zzfz zzfzVar = null;
        if (i10 == 4) {
            return new zzgi(zzfzVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzor extends zzsh implements zztq {
    private static final zzor zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzor zzorVar = new zzor();
        zzb = zzorVar;
        zzsh.zzG(zzor.class, zzorVar);
    }

    private zzor() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", zzjr.zza(), "zzg"});
        }
        if (i10 == 3) {
            return new zzor();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzoq(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

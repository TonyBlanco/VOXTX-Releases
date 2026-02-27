package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmm extends zzsh implements zztq {
    private static final zzmm zzb;
    private int zzd;
    private int zze;

    static {
        zzmm zzmmVar = new zzmm();
        zzb = zzmmVar;
        zzsh.zzG(zzmm.class, zzmmVar);
    }

    private zzmm() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzd", "zze", zzhd.zza()});
        }
        if (i10 == 3) {
            return new zzmm();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzml(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

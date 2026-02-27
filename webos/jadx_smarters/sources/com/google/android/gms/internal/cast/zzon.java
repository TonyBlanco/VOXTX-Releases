package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzon extends zzsh implements zztq {
    private static final zzon zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzon zzonVar = new zzon();
        zzb = zzonVar;
        zzsh.zzG(zzon.class, zzonVar);
    }

    private zzon() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzon();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzom(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

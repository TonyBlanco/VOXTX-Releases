package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlx extends zzsh implements zztq {
    private static final zzsn zzb = new zzlv();
    private static final zzlx zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzsm zzh = zzsh.zzx();

    static {
        zzlx zzlxVar = new zzlx();
        zzd = zzlxVar;
        zzsh.zzG(zzlx.class, zzlxVar);
    }

    private zzlx() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001e", new Object[]{"zze", "zzf", "zzg", "zzh", zzln.zzb()});
        }
        if (i10 == 3) {
            return new zzlx();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzlw(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzd;
    }
}

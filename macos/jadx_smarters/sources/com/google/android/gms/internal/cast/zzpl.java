package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpl extends zzsh implements zztq {
    private static final zzpl zzb;
    private int zzd;
    private int zze;
    private zzsp zzf = zzsh.zzz();
    private zzsp zzg = zzsh.zzz();
    private int zzh;

    static {
        zzpl zzplVar = new zzpl();
        zzb = zzplVar;
        zzsh.zzG(zzpl.class, zzplVar);
    }

    private zzpl() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzd", "zze", zzky.zza(), "zzf", zzon.class, "zzg", zzon.class, "zzh"});
        }
        if (i10 == 3) {
            return new zzpl();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzpk(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

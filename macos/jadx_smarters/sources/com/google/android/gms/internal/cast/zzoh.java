package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzoh extends zzsh implements zztq {
    private static final zzoh zzb;
    private int zzd;
    private long zze;
    private zzso zzf = zzsh.zzy();
    private zzso zzg = zzsh.zzy();

    static {
        zzoh zzohVar = new zzoh();
        zzb = zzohVar;
        zzsh.zzG(zzoh.class, zzohVar);
    }

    private zzoh() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzoh();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzog(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

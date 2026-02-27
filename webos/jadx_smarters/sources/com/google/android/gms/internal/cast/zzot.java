package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzot extends zzsh implements zztq {
    private static final zzot zzb;
    private int zzd;
    private zzsp zze = zzsh.zzz();
    private zzsp zzf = zzsh.zzz();
    private zzpd zzg;

    static {
        zzot zzotVar = new zzot();
        zzb = zzotVar;
        zzsh.zzG(zzot.class, zzotVar);
    }

    private zzot() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzd", "zze", zzpj.class, "zzf", zzna.class, "zzg"});
        }
        if (i10 == 3) {
            return new zzot();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzos(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

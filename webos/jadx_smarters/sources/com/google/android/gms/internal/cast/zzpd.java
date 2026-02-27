package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpd extends zzsh implements zztq {
    private static final zzpd zzb;
    private int zzd;
    private zzmc zze;

    static {
        zzpd zzpdVar = new zzpd();
        zzb = zzpdVar;
        zzsh.zzG(zzpd.class, zzpdVar);
    }

    private zzpd() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzpd();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzpc(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

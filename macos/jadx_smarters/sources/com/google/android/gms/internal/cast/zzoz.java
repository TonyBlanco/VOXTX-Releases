package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzoz extends zzsh implements zztq {
    private static final zzoz zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private zzsp zzg = zzsh.zzz();

    static {
        zzoz zzozVar = new zzoz();
        zzb = zzozVar;
        zzsh.zzG(zzoz.class, zzozVar);
    }

    private zzoz() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", zzpb.class});
        }
        if (i10 == 3) {
            return new zzoz();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzoy(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

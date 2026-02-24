package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzob extends zzsh implements zztq {
    private static final zzob zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzob zzobVar = new zzob();
        zzb = zzobVar;
        zzsh.zzG(zzob.class, zzobVar);
    }

    private zzob() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzob();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzoa(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

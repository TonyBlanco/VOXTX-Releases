package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzph extends zzsh implements zztq {
    private static final zzph zzb;
    private int zzd;
    private String zze = "";

    static {
        zzph zzphVar = new zzph();
        zzb = zzphVar;
        zzsh.zzG(zzph.class, zzphVar);
    }

    private zzph() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzph();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzpg(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

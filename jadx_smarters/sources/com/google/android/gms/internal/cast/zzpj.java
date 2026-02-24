package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpj extends zzsh implements zztq {
    private static final zzpj zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private zzmc zzg;

    static {
        zzpj zzpjVar = new zzpj();
        zzb = zzpjVar;
        zzsh.zzG(zzpj.class, zzpjVar);
    }

    private zzpj() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzks.zza(), "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzpj();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzpi(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

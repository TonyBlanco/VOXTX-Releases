package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzov extends zzsh implements zztq {
    private static final zzov zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzov zzovVar = new zzov();
        zzb = zzovVar;
        zzsh.zzG(zzov.class, zzovVar);
    }

    private zzov() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", zzka.zza(), "zzf", zzka.zza()});
        }
        if (i10 == 3) {
            return new zzov();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzou(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

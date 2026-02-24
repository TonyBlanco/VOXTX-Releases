package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmc extends zzsh implements zztq {
    private static final zzmc zzb;
    private int zzd;
    private int zze;
    private double zzf;
    private double zzg;
    private double zzh;
    private double zzi;

    static {
        zzmc zzmcVar = new zzmc();
        zzb = zzmcVar;
        zzsh.zzG(zzmc.class, zzmcVar);
    }

    private zzmc() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new zzmc();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzmb(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

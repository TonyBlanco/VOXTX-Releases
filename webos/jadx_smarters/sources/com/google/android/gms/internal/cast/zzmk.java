package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmk extends zzsh implements zztq {
    private static final zzmk zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzmk zzmkVar = new zzmk();
        zzb = zzmkVar;
        zzsh.zzG(zzmk.class, zzmkVar);
    }

    private zzmk() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဌ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", zziz.zza(), "zzh"});
        }
        if (i10 == 3) {
            return new zzmk();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzmj(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

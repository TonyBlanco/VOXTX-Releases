package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zznz extends zzsh implements zztq {
    private static final zznz zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        zznz zznzVar = new zznz();
        zzb = zznzVar;
        zzsh.zzG(zznz.class, zznzVar);
    }

    private zznz() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔌ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"zzd", "zze", zzjc.zza(), "zzf", "zzg", zzlt.zza()});
        }
        if (i10 == 3) {
            return new zznz();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzny(zzluVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

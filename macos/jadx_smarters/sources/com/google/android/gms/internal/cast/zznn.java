package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zznn extends zzsh implements zztq {
    private static final zznn zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private zzsm zzg = zzsh.zzx();
    private zzsm zzh = zzsh.zzx();
    private zzsp zzi = zzsh.zzz();
    private zzsp zzj = zzsh.zzz();
    private int zzk;

    static {
        zznn zznnVar = new zznn();
        zzb = zznnVar;
        zzsh.zzG(zznn.class, zznnVar);
    }

    private zznn() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001င\u0000\u0002ဌ\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007ဌ\u0002", new Object[]{"zzd", "zze", "zzf", zziq.zza(), "zzg", "zzh", "zzi", "zzj", "zzk", zzie.zza()});
        }
        if (i10 == 3) {
            return new zznn();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zznm(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

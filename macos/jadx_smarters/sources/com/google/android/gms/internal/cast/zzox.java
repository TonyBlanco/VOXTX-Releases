package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzox extends zzsh implements zztq {
    private static final zzox zzb;
    private int zzd;
    private zznc zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;
    private zzsp zzk = zzsh.zzz();

    static {
        zzox zzoxVar = new zzox();
        zzb = zzoxVar;
        zzsh.zzG(zzox.class, zzoxVar);
    }

    private zzox() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဂ\u0005\u0007\u001b", new Object[]{"zzd", "zze", "zzf", zzkg.zza(), "zzg", zzkd.zza(), "zzh", zzie.zza(), "zzi", zzha.zza(), "zzj", "zzk", zznc.class});
        }
        if (i10 == 3) {
            return new zzox();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzow(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

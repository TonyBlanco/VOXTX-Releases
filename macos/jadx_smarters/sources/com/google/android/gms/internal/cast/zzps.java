package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzps extends zzsh implements zztq {
    private static final zzsn zzb = new zzpq();
    private static final zzps zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzi;
    private long zzk;
    private zzsm zzh = zzsh.zzx();
    private zzsp zzj = zzsh.zzz();

    static {
        zzps zzpsVar = new zzps();
        zzd = zzpsVar;
        zzsh.zzG(zzps.class, zzpsVar);
    }

    private zzps() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzd, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001e\u0005ဌ\u0002\u0006\u001b\u0007ဂ\u0003", new Object[]{"zze", "zzf", zzlk.zza(), "zzg", zzie.zza(), "zzh", zzlh.zza(), "zzi", zzhm.zza(), "zzj", zzpp.class, "zzk"});
        }
        if (i10 == 3) {
            return new zzps();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzpr(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzd;
    }
}

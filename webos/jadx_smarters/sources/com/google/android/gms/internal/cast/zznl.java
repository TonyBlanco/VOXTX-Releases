package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zznl extends zzsh implements zztq {
    private static final zzsn zzb = new zznj();
    private static final zznl zzd;
    private int zze;
    private boolean zzg;
    private boolean zzh;
    private zzps zzi;
    private boolean zzj;
    private long zzl;
    private long zzm;
    private String zzf = "";
    private zzsm zzk = zzsh.zzx();

    static {
        zznl zznlVar = new zznl();
        zzd = zznlVar;
        zzsh.zzG(zznl.class, zznlVar);
    }

    private zznl() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzd, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဇ\u0004\u0005,\u0006ဇ\u0002\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zze", "zzf", "zzg", "zzi", "zzj", "zzk", zzlh.zza(), "zzh", "zzl", "zzm"});
        }
        if (i10 == 3) {
            return new zznl();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zznk(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzd;
    }
}

package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgh extends zzsh implements zztq {
    private static final zzgh zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;

    static {
        zzgh zzghVar = new zzgh();
        zzb = zzghVar;
        zzsh.zzG(zzgh.class, zzghVar);
    }

    private zzgh() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007\tင\b\nင\t\u000bင\n\fဇ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", zzgd.zza, "zzh", zzge.zza, "zzi", zzgb.zza, "zzj", zzgf.zza, "zzk", zzgg.zza, "zzl", zzga.zza, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i10 == 3) {
            return new zzgh();
        }
        zzfz zzfzVar = null;
        if (i10 == 4) {
            return new zzgc(zzfzVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

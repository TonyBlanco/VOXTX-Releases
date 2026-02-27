package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfs extends zzgo implements zzhz {
    private static final zzfs zzb;
    private int zzd;
    private long zzg;
    private long zzh;
    private double zzi;
    private byte zzl = 2;
    private zzgv zze = zzii.zze();
    private String zzf = "";
    private zzez zzj = zzez.zzb;
    private String zzk = "";

    static {
        zzfs zzfsVar = new zzfs();
        zzb = zzfsVar;
        zzgo.zzC(zzfs.class, zzfsVar);
    }

    private zzfs() {
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i10 == 2) {
            return new zzij(zzb, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"zzd", "zze", zzfr.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i10 == 3) {
            return new zzfs();
        }
        zzfm zzfmVar = null;
        if (i10 == 4) {
            return new zzfp(zzfmVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

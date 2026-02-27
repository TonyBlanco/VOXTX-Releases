package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlz extends zzgo implements zzhz {
    private static final zzlz zzb;
    private String zzd = "";
    private String zze = "";
    private int zzf;
    private int zzg;

    static {
        zzlz zzlzVar = new zzlz();
        zzb = zzlzVar;
        zzgo.zzC(zzlz.class, zzlzVar);
    }

    private zzlz() {
    }

    public static zzlz zzg(byte[] bArr) throws zzgy {
        return (zzlz) zzgo.zzu(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzlz();
        }
        zzlv zzlvVar = null;
        if (i10 == 4) {
            return new zzly(zzlvVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzmf zzi() {
        zzmf zzmfVarZzb = zzmf.zzb(this.zzf);
        return zzmfVarZzb == null ? zzmf.UNRECOGNIZED : zzmfVarZzb;
    }

    public final String zzj() {
        return this.zzd;
    }

    public final String zzk() {
        return this.zze;
    }
}

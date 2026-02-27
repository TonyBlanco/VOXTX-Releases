package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmd extends zzgo implements zzhz {
    private static final zzmd zzb;
    private int zzd;

    static {
        zzmd zzmdVar = new zzmd();
        zzb = zzmdVar;
        zzgo.zzC(zzmd.class, zzmdVar);
    }

    private zzmd() {
    }

    public static zzmd zzg(byte[] bArr) throws zzgy {
        return (zzmd) zzgo.zzu(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zzd"});
        }
        if (i10 == 3) {
            return new zzmd();
        }
        zzlv zzlvVar = null;
        if (i10 == 4) {
            return new zzmc(zzlvVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzmf zzi() {
        zzmf zzmfVarZzb = zzmf.zzb(this.zzd);
        return zzmfVarZzb == null ? zzmf.UNRECOGNIZED : zzmfVarZzb;
    }
}

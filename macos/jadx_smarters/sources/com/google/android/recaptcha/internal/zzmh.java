package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmh extends zzgo implements zzhz {
    private static final zzmh zzb;
    private zzgv zzd = zzgo.zzw();

    static {
        zzmh zzmhVar = new zzmh();
        zzb = zzmhVar;
        zzgo.zzC(zzmh.class, zzmhVar);
    }

    private zzmh() {
    }

    public static zzmh zzg(byte[] bArr) throws zzgy {
        return (zzmh) zzgo.zzu(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzmv.class});
        }
        if (i10 == 3) {
            return new zzmh();
        }
        zzlv zzlvVar = null;
        if (i10 == 4) {
            return new zzmg(zzlvVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzi() {
        return this.zzd;
    }
}

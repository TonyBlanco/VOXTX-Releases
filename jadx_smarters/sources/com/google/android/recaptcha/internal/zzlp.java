package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlp extends zzgo implements zzhz {
    private static final zzlp zzb;
    private zzgv zzd = zzgo.zzw();

    static {
        zzlp zzlpVar = new zzlp();
        zzb = zzlpVar;
        zzgo.zzC(zzlp.class, zzlpVar);
    }

    private zzlp() {
    }

    public static zzlp zzg() {
        return zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zzd"});
        }
        if (i10 == 3) {
            return new zzlp();
        }
        zzln zzlnVar = null;
        if (i10 == 4) {
            return new zzlo(zzlnVar);
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

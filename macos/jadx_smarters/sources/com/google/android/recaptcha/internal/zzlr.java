package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlr extends zzgo implements zzhz {
    private static final zzlr zzb;
    private zzlp zzd;
    private zzlp zze;

    static {
        zzlr zzlrVar = new zzlr();
        zzb = zzlrVar;
        zzgo.zzC(zzlr.class, zzlrVar);
    }

    private zzlr() {
    }

    public static zzlr zzj(InputStream inputStream) throws IOException {
        return (zzlr) zzgo.zzt(zzb, inputStream);
    }

    public final zzlp zzf() {
        zzlp zzlpVar = this.zzd;
        return zzlpVar == null ? zzlp.zzg() : zzlpVar;
    }

    public final zzlp zzg() {
        zzlp zzlpVar = this.zze;
        return zzlpVar == null ? zzlp.zzg() : zzlpVar;
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzlr();
        }
        zzln zzlnVar = null;
        if (i10 == 4) {
            return new zzlq(zzlnVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

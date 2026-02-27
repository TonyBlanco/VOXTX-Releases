package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlu extends zzgo implements zzhz {
    private static final zzlu zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzlu zzluVar = new zzlu();
        zzb = zzluVar;
        zzgo.zzC(zzlu.class, zzluVar);
    }

    private zzlu() {
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0014\u0001\u0000\u0001\u0014\u0014\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000\u0003?\u0000\u0004?\u0000\u0005?\u0000\u0006?\u0000\u0007?\u0000\b?\u0000\t?\u0000\n?\u0000\u000b?\u0000\f?\u0000\r?\u0000\u000e?\u0000\u000f?\u0000\u0010?\u0000\u0011?\u0000\u0012?\u0000\u0013?\u0000\u0014?\u0000", new Object[]{"zze", "zzd"});
        }
        if (i10 == 3) {
            return new zzlu();
        }
        zzls zzlsVar = null;
        if (i10 == 4) {
            return new zzlt(zzlsVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

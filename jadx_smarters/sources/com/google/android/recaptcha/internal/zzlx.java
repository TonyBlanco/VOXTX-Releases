package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlx extends zzgo implements zzhz {
    private static final zzlx zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        zzlx zzlxVar = new zzlx();
        zzb = zzlxVar;
        zzgo.zzC(zzlx.class, zzlxVar);
    }

    private zzlx() {
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzlx();
        }
        zzlv zzlvVar = null;
        if (i10 == 4) {
            return new zzlw(zzlvVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzks extends zzgo implements zzhz {
    private static final zzks zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzks zzksVar = new zzks();
        zzb = zzksVar;
        zzgo.zzC(zzks.class, zzksVar);
    }

    private zzks() {
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzks();
        }
        zzkq zzkqVar = null;
        if (i10 == 4) {
            return new zzkr(zzkqVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlm extends zzgo implements zzhz {
    private static final zzlm zzb;
    private int zzd;
    private boolean zze;
    private zzfw zzf;
    private zzjd zzg;
    private int zzh;
    private zzkm zzi;
    private zzgv zzj = zzgo.zzw();

    static {
        zzlm zzlmVar = new zzlm();
        zzb = zzlmVar;
        zzgo.zzC(zzlm.class, zzlmVar);
    }

    private zzlm() {
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002\u0007\u0003\t\u0004\t\u0005\f\u0006\t\u0007\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzld.class});
        }
        if (i10 == 3) {
            return new zzlm();
        }
        zzlk zzlkVar = null;
        if (i10 == 4) {
            return new zzll(zzlkVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

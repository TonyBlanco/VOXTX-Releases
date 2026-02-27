package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkp extends zzgo implements zzhz {
    private static final zzkp zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzkp zzkpVar = new zzkp();
        zzb = zzkpVar;
        zzgo.zzC(zzkp.class, zzkpVar);
    }

    private zzkp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new zzkp();
        }
        zzkn zzknVar = null;
        if (i10 == 4) {
            return new zzko(zzknVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmb extends zzgo implements zzhz {
    private static final zzmb zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzmb zzmbVar = new zzmb();
        zzb = zzmbVar;
        zzgo.zzC(zzmb.class, zzmbVar);
    }

    private zzmb() {
    }

    public static zzma zzf() {
        return (zzma) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzmb zzmbVar, String str) {
        str.getClass();
        zzmbVar.zzd = str;
    }

    public static /* synthetic */ void zzj(zzmb zzmbVar, String str) {
        str.getClass();
        zzmbVar.zze = str;
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
            return new zzmb();
        }
        zzlv zzlvVar = null;
        if (i10 == 4) {
            return new zzma(zzlvVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

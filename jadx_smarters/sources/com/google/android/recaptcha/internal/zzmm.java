package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmm extends zzgo implements zzhz {
    private static final zzmm zzb;
    private int zzd = 0;
    private Object zze;
    private int zzf;

    static {
        zzmm zzmmVar = new zzmm();
        zzb = zzmmVar;
        zzgo.zzC(zzmm.class, zzmmVar);
    }

    private zzmm() {
    }

    public static /* synthetic */ void zzG(zzmm zzmmVar, String str) {
        str.getClass();
        zzmmVar.zzd = 11;
        zzmmVar.zze = str;
    }

    public static /* synthetic */ void zzH(zzmm zzmmVar, boolean z9) {
        zzmmVar.zzd = 1;
        zzmmVar.zze = Boolean.valueOf(z9);
    }

    public static /* synthetic */ void zzI(zzmm zzmmVar, zzez zzezVar) {
        zzmmVar.zzd = 2;
        zzmmVar.zze = zzezVar;
    }

    public static /* synthetic */ void zzJ(zzmm zzmmVar, String str) {
        str.getClass();
        zzmmVar.zzd = 3;
        zzmmVar.zze = str;
    }

    public static /* synthetic */ void zzK(zzmm zzmmVar, int i9) {
        zzmmVar.zzd = 4;
        zzmmVar.zze = Integer.valueOf(i9);
    }

    public static /* synthetic */ void zzL(zzmm zzmmVar, int i9) {
        zzmmVar.zzd = 5;
        zzmmVar.zze = Integer.valueOf(i9);
    }

    public static zzml zzf() {
        return (zzml) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzmm zzmmVar, long j9) {
        zzmmVar.zzd = 7;
        zzmmVar.zze = Long.valueOf(j9);
    }

    public static /* synthetic */ void zzj(zzmm zzmmVar, float f9) {
        zzmmVar.zzd = 9;
        zzmmVar.zze = Float.valueOf(f9);
    }

    public static /* synthetic */ void zzk(zzmm zzmmVar, double d9) {
        zzmmVar.zzd = 10;
        zzmmVar.zze = Double.valueOf(d9);
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzgo.zzz(zzb, "\u0000\f\u0001\u0000\u0001\f\f\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000\f\u000b", new Object[]{"zze", "zzd", "zzf"});
        }
        if (i10 == 3) {
            return new zzmm();
        }
        zzlv zzlvVar = null;
        if (i10 == 4) {
            return new zzml(zzlvVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

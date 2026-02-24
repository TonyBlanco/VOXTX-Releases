package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlg extends zzgo implements zzhz {
    private static final zzlg zzb;
    private zzfw zzd;
    private zzjd zze;
    private zzfw zzf;
    private zzjd zzg;

    static {
        zzlg zzlgVar = new zzlg();
        zzb = zzlgVar;
        zzgo.zzC(zzlg.class, zzlgVar);
    }

    private zzlg() {
    }

    public static /* synthetic */ void zzG(zzlg zzlgVar, zzfw zzfwVar) {
        zzfwVar.getClass();
        zzlgVar.zzf = zzfwVar;
    }

    public static zzlf zzf() {
        return (zzlf) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzlg zzlgVar, zzfw zzfwVar) {
        zzfwVar.getClass();
        zzlgVar.zzd = zzfwVar;
    }

    public static /* synthetic */ void zzj(zzlg zzlgVar, zzjd zzjdVar) {
        zzjdVar.getClass();
        zzlgVar.zzg = zzjdVar;
    }

    public static /* synthetic */ void zzk(zzlg zzlgVar, zzjd zzjdVar) {
        zzjdVar.getClass();
        zzlgVar.zze = zzjdVar;
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzlg();
        }
        zzle zzleVar = null;
        if (i10 == 4) {
            return new zzlf(zzleVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

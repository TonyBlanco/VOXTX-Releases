package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkg extends zzgo implements zzhz {
    private static final zzkg zzb;
    private int zzd;
    private zzfw zze;
    private int zzf;

    static {
        zzkg zzkgVar = new zzkg();
        zzb = zzkgVar;
        zzgo.zzC(zzkg.class, zzkgVar);
    }

    private zzkg() {
    }

    public static zzkf zzf() {
        return (zzkf) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzkg zzkgVar, zzfw zzfwVar) {
        zzfwVar.getClass();
        zzkgVar.zze = zzfwVar;
        zzkgVar.zzd |= 1;
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzkg();
        }
        zzke zzkeVar = null;
        if (i10 == 4) {
            return new zzkf(zzkeVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

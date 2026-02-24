package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfw extends zzgo implements zzhz {
    private static final zzfw zzb;
    private long zzd;
    private int zze;

    static {
        zzfw zzfwVar = new zzfw();
        zzb = zzfwVar;
        zzgo.zzC(zzfw.class, zzfwVar);
    }

    private zzfw() {
    }

    public static zzfv zzi() {
        return (zzfv) zzb.zzp();
    }

    public final int zzf() {
        return this.zze;
    }

    public final long zzg() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new zzij(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzfw();
        }
        zzfu zzfuVar = null;
        if (i10 == 4) {
            return new zzfv(zzfuVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

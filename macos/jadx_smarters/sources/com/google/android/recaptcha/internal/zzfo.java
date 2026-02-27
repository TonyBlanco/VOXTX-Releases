package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfo extends zzgk implements zzhz {
    private static final zzfo zzd;
    private int zze;
    private boolean zzf;
    private byte zzh = 2;
    private zzgv zzg = zzii.zze();

    static {
        zzfo zzfoVar = new zzfo();
        zzd = zzfoVar;
        zzgo.zzC(zzfo.class, zzfoVar);
    }

    private zzfo() {
    }

    public static zzfo zzg() {
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i10 == 2) {
            return new zzij(zzd, "\u0001\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0001\u0001\u0001ဇ\u0000ϧЛ", new Object[]{"zze", "zzf", "zzg", zzfs.class});
        }
        if (i10 == 3) {
            return new zzfo();
        }
        zzfm zzfmVar = null;
        if (i10 == 4) {
            return new zzfn(zzfmVar);
        }
        if (i10 == 5) {
            return zzd;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

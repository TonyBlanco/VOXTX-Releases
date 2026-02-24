package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzla extends zzgo implements zzhz {
    private static final zzla zzb;
    private zzgv zzd = zzgo.zzw();

    static {
        zzla zzlaVar = new zzla();
        zzb = zzlaVar;
        zzgo.zzC(zzla.class, zzlaVar);
    }

    private zzla() {
    }

    public static zzkz zzf() {
        return (zzkz) zzb.zzp();
    }

    public static zzla zzi(byte[] bArr) throws zzgy {
        return (zzla) zzgo.zzu(zzb, bArr);
    }

    public static /* synthetic */ void zzk(zzla zzlaVar, zzkx zzkxVar) {
        zzkxVar.getClass();
        zzgv zzgvVar = zzlaVar.zzd;
        if (!zzgvVar.zzc()) {
            zzlaVar.zzd = zzgo.zzx(zzgvVar);
        }
        zzlaVar.zzd.add(zzkxVar);
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzkx.class});
        }
        if (i10 == 3) {
            return new zzla();
        }
        zzky zzkyVar = null;
        if (i10 == 4) {
            return new zzkz(zzkyVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzj() {
        return this.zzd;
    }
}

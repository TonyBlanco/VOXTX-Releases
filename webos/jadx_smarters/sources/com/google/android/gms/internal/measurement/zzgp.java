package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgp extends zzlb implements zzmj {
    private static final zzgp zza;
    private zzli zzd = zzlb.zzbH();

    static {
        zzgp zzgpVar = new zzgp();
        zza = zzgpVar;
        zzlb.zzbO(zzgp.class, zzgpVar);
    }

    private zzgp() {
    }

    public static zzgp zzc() {
        return zza;
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final List zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzlb.zzbL(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzgr.class});
        }
        if (i10 == 3) {
            return new zzgp();
        }
        zzgn zzgnVar = null;
        if (i10 == 4) {
            return new zzgo(zzgnVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zza;
    }
}

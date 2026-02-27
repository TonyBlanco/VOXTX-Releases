package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgk extends zzlb implements zzmj {
    private static final zzgk zza;
    private int zzd;
    private int zze;
    private zzlh zzf = zzlb.zzbF();

    static {
        zzgk zzgkVar = new zzgk();
        zza = zzgkVar;
        zzlb.zzbO(zzgk.class, zzgkVar);
    }

    private zzgk() {
    }

    public static zzgj zzd() {
        return (zzgj) zza.zzbA();
    }

    public static /* synthetic */ void zzg(zzgk zzgkVar, int i9) {
        zzgkVar.zzd |= 1;
        zzgkVar.zze = i9;
    }

    public static /* synthetic */ void zzh(zzgk zzgkVar, Iterable iterable) {
        zzlh zzlhVar = zzgkVar.zzf;
        if (!zzlhVar.zzc()) {
            zzgkVar.zzf = zzlb.zzbG(zzlhVar);
        }
        zzjk.zzbw(iterable, zzgkVar.zzf);
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final long zzc(int i9) {
        return this.zzf.zza(i9);
    }

    public final List zzf() {
        return this.zzf;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzlb.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzgk();
        }
        zzfk zzfkVar = null;
        if (i10 == 4) {
            return new zzgj(zzfkVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zza;
    }
}

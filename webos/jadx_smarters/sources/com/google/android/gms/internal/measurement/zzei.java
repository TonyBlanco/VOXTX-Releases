package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzei extends zzlb implements zzmj {
    private static final zzei zza;
    private int zzd;
    private int zze;
    private zzli zzf = zzlb.zzbH();
    private zzli zzg = zzlb.zzbH();
    private boolean zzh;
    private boolean zzi;

    static {
        zzei zzeiVar = new zzei();
        zza = zzeiVar;
        zzlb.zzbO(zzei.class, zzeiVar);
    }

    private zzei() {
    }

    public static /* synthetic */ void zzi(zzei zzeiVar, int i9, zzet zzetVar) {
        zzetVar.getClass();
        zzli zzliVar = zzeiVar.zzf;
        if (!zzliVar.zzc()) {
            zzeiVar.zzf = zzlb.zzbI(zzliVar);
        }
        zzeiVar.zzf.set(i9, zzetVar);
    }

    public static /* synthetic */ void zzj(zzei zzeiVar, int i9, zzek zzekVar) {
        zzekVar.getClass();
        zzli zzliVar = zzeiVar.zzg;
        if (!zzliVar.zzc()) {
            zzeiVar.zzg = zzlb.zzbI(zzliVar);
        }
        zzeiVar.zzg.set(i9, zzekVar);
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzg.size();
    }

    public final int zzc() {
        return this.zzf.size();
    }

    public final zzek zze(int i9) {
        return (zzek) this.zzg.get(i9);
    }

    public final zzet zzf(int i9) {
        return (zzet) this.zzf.get(i9);
    }

    public final List zzg() {
        return this.zzg;
    }

    public final List zzh() {
        return this.zzf;
    }

    public final boolean zzk() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzlb.zzbL(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", zzet.class, "zzg", zzek.class, "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new zzei();
        }
        zzeg zzegVar = null;
        if (i10 == 4) {
            return new zzeh(zzegVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zza;
    }
}

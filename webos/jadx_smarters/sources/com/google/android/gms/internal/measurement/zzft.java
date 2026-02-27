package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzft extends zzlb implements zzmj {
    private static final zzft zza;
    private int zzd;
    private zzli zze = zzlb.zzbH();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        zzft zzftVar = new zzft();
        zza = zzftVar;
        zzlb.zzbO(zzft.class, zzftVar);
    }

    private zzft() {
    }

    public static zzfs zze() {
        return (zzfs) zza.zzbA();
    }

    public static /* synthetic */ void zzj(zzft zzftVar, int i9, zzfx zzfxVar) {
        zzfxVar.getClass();
        zzftVar.zzv();
        zzftVar.zze.set(i9, zzfxVar);
    }

    public static /* synthetic */ void zzk(zzft zzftVar, zzfx zzfxVar) {
        zzfxVar.getClass();
        zzftVar.zzv();
        zzftVar.zze.add(zzfxVar);
    }

    public static /* synthetic */ void zzm(zzft zzftVar, Iterable iterable) {
        zzftVar.zzv();
        zzjk.zzbw(iterable, zzftVar.zze);
    }

    public static /* synthetic */ void zzo(zzft zzftVar, int i9) {
        zzftVar.zzv();
        zzftVar.zze.remove(i9);
    }

    public static /* synthetic */ void zzp(zzft zzftVar, String str) {
        str.getClass();
        zzftVar.zzd |= 1;
        zzftVar.zzf = str;
    }

    public static /* synthetic */ void zzq(zzft zzftVar, long j9) {
        zzftVar.zzd |= 2;
        zzftVar.zzg = j9;
    }

    public static /* synthetic */ void zzr(zzft zzftVar, long j9) {
        zzftVar.zzd |= 4;
        zzftVar.zzh = j9;
    }

    private final void zzv() {
        zzli zzliVar = this.zze;
        if (zzliVar.zzc()) {
            return;
        }
        this.zze = zzlb.zzbI(zzliVar);
    }

    public final int zza() {
        return this.zzi;
    }

    public final int zzb() {
        return this.zze.size();
    }

    public final long zzc() {
        return this.zzh;
    }

    public final long zzd() {
        return this.zzg;
    }

    public final zzfx zzg(int i9) {
        return (zzfx) this.zze.get(i9);
    }

    public final String zzh() {
        return this.zzf;
    }

    public final List zzi() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzlb.zzbL(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", zzfx.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new zzft();
        }
        zzfk zzfkVar = null;
        if (i10 == 4) {
            return new zzfs(zzfkVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zza;
    }

    public final boolean zzs() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzt() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzu() {
        return (this.zzd & 2) != 0;
    }
}

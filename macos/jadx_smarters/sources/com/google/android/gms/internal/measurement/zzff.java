package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzff extends zzlb implements zzmj {
    private static final zzff zza;
    private int zzd;
    private long zze;
    private int zzg;
    private boolean zzl;
    private String zzf = "";
    private zzli zzh = zzlb.zzbH();
    private zzli zzi = zzlb.zzbH();
    private zzli zzj = zzlb.zzbH();
    private String zzk = "";
    private zzli zzm = zzlb.zzbH();
    private zzli zzn = zzlb.zzbH();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        zzff zzffVar = new zzff();
        zza = zzffVar;
        zzlb.zzbO(zzff.class, zzffVar);
    }

    private zzff() {
    }

    public static zzfe zze() {
        return (zzfe) zza.zzbA();
    }

    public static zzff zzg() {
        return zza;
    }

    public static /* synthetic */ void zzq(zzff zzffVar, int i9, zzfd zzfdVar) {
        zzfdVar.getClass();
        zzli zzliVar = zzffVar.zzi;
        if (!zzliVar.zzc()) {
            zzffVar.zzi = zzlb.zzbI(zzliVar);
        }
        zzffVar.zzi.set(i9, zzfdVar);
    }

    public final int zza() {
        return this.zzm.size();
    }

    public final int zzb() {
        return this.zzi.size();
    }

    public final long zzc() {
        return this.zze;
    }

    public final zzfd zzd(int i9) {
        return (zzfd) this.zzi.get(i9);
    }

    public final String zzh() {
        return this.zzf;
    }

    public final String zzi() {
        return this.zzq;
    }

    public final String zzj() {
        return this.zzp;
    }

    public final String zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzlb.zzbL(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007\u000eဈ\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzfj.class, "zzi", zzfd.class, "zzj", zzei.class, "zzk", "zzl", "zzm", zzgt.class, "zzn", zzfb.class, "zzo", "zzp", "zzq", "zzr"});
        }
        if (i10 == 3) {
            return new zzff();
        }
        zzez zzezVar = null;
        if (i10 == 4) {
            return new zzfe(zzezVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zza;
    }

    public final List zzm() {
        return this.zzj;
    }

    public final List zzn() {
        return this.zzn;
    }

    public final List zzo() {
        return this.zzm;
    }

    public final List zzp() {
        return this.zzh;
    }

    public final boolean zzs() {
        return this.zzl;
    }

    public final boolean zzt() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzu() {
        return (this.zzd & 1) != 0;
    }
}

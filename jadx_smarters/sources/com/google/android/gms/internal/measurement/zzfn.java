package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfn extends zzlb implements zzmj {
    private static final zzfn zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzfn zzfnVar = new zzfn();
        zza = zzfnVar;
        zzlb.zzbO(zzfn.class, zzfnVar);
    }

    private zzfn() {
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzlb.zzbL(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i10 == 3) {
            return new zzfn();
        }
        zzfk zzfkVar = null;
        if (i10 == 4) {
            return new zzfm(zzfkVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zza;
    }
}

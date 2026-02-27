package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfv extends zzlb implements zzmj {
    private static final zzfv zza;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        zzfv zzfvVar = new zzfv();
        zza = zzfvVar;
        zzlb.zzbO(zzfv.class, zzfvVar);
    }

    private zzfv() {
    }

    public static zzfu zza() {
        return (zzfu) zza.zzbA();
    }

    public static /* synthetic */ void zzc(zzfv zzfvVar, String str) {
        str.getClass();
        zzfvVar.zzd |= 1;
        zzfvVar.zze = str;
    }

    public static /* synthetic */ void zzd(zzfv zzfvVar, long j9) {
        zzfvVar.zzd |= 2;
        zzfvVar.zzf = j9;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzlb.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzfv();
        }
        zzfk zzfkVar = null;
        if (i10 == 4) {
            return new zzfu(zzfkVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zza;
    }
}

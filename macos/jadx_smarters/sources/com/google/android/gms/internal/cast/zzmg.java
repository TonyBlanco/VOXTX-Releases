package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmg extends zzsh implements zztq {
    private static final zzmg zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzmg zzmgVar = new zzmg();
        zzb = zzmgVar;
        zzsh.zzG(zzmg.class, zzmgVar);
    }

    private zzmg() {
    }

    public static zzmf zza() {
        return (zzmf) zzb.zzu();
    }

    public static /* synthetic */ void zzd(zzmg zzmgVar, String str) {
        str.getClass();
        zzmgVar.zzd |= 1;
        zzmgVar.zze = str;
    }

    public static /* synthetic */ void zze(zzmg zzmgVar, String str) {
        str.getClass();
        zzmgVar.zzd |= 2;
        zzmgVar.zzf = str;
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzmg();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzmf(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zznc extends zzsh implements zztq {
    private static final zznc zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zznc zzncVar = new zznc();
        zzb = zzncVar;
        zzsh.zzG(zznc.class, zzncVar);
    }

    private zznc() {
    }

    public static zznb zza() {
        return (zznb) zzb.zzu();
    }

    public static /* synthetic */ void zzd(zznc zzncVar, String str) {
        str.getClass();
        zzncVar.zzd |= 1;
        zzncVar.zze = str;
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
            return new zznc();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zznb(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzms extends zzsh implements zztq {
    private static final zzms zzb;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        zzms zzmsVar = new zzms();
        zzb = zzmsVar;
        zzsh.zzG(zzms.class, zzmsVar);
    }

    private zzms() {
    }

    public static zzmr zza() {
        return (zzmr) zzb.zzu();
    }

    public static /* synthetic */ void zzd(zzms zzmsVar, String str) {
        str.getClass();
        zzmsVar.zzd |= 1;
        zzmsVar.zze = str;
    }

    public static /* synthetic */ void zze(zzms zzmsVar, long j9) {
        zzmsVar.zzd |= 2;
        zzmsVar.zzf = j9;
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzms();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzmr(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

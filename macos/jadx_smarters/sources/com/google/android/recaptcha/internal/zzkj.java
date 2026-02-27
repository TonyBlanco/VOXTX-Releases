package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkj extends zzgo implements zzhz {
    private static final zzgu zzb = new zzkh();
    private static final zzkj zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zzgt zzk = zzgo.zzv();

    static {
        zzkj zzkjVar = new zzkj();
        zzd = zzkjVar;
        zzgo.zzC(zzkj.class, zzkjVar);
    }

    private zzkj() {
    }

    public static /* synthetic */ void zzG(zzkj zzkjVar, String str) {
        str.getClass();
        zzkjVar.zzf = str;
    }

    public static /* synthetic */ void zzI(zzkj zzkjVar, String str) {
        str.getClass();
        zzkjVar.zzh = str;
    }

    public static zzki zzf() {
        return (zzki) zzd.zzp();
    }

    public static /* synthetic */ void zzj(zzkj zzkjVar, String str) {
        str.getClass();
        zzkjVar.zzi = str;
    }

    public static /* synthetic */ void zzk(zzkj zzkjVar, String str) {
        str.getClass();
        zzkjVar.zzj = str;
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzgo.zzz(zzd, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007,", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i10 == 3) {
            return new zzkj();
        }
        zzkh zzkhVar = null;
        if (i10 == 4) {
            return new zzki(zzkhVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzd;
    }
}

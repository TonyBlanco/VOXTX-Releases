package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgu extends zzcs implements zzed {
    private static final zzgu zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        zzgu zzguVar = new zzgu();
        zzb = zzguVar;
        zzcs.zzt(zzgu.class, zzguVar);
    }

    private zzgu() {
    }

    public static /* synthetic */ void zzA(zzgu zzguVar, String str) {
        str.getClass();
        zzguVar.zzd |= 1;
        zzguVar.zze = str;
    }

    public static /* synthetic */ void zzB(zzgu zzguVar, String str) {
        str.getClass();
        zzguVar.zzd |= 2;
        zzguVar.zzf = str;
    }

    public static /* synthetic */ void zzC(zzgu zzguVar, int i9) {
        zzguVar.zzd |= 4;
        zzguVar.zzg = i9;
    }

    public static zzgt zzy() {
        return (zzgt) zzb.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final Object zzx(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzcs.zzq(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzgu();
        }
        zzgs zzgsVar = null;
        if (i10 == 4) {
            return new zzgt(zzgsVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

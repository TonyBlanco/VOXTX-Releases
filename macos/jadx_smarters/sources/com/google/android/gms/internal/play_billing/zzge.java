package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class zzge extends zzcs implements zzed {
    private static final zzge zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        zzge zzgeVar = new zzge();
        zzb = zzgeVar;
        zzcs.zzt(zzge.class, zzgeVar);
    }

    private zzge() {
    }

    public static /* synthetic */ void zzA(zzge zzgeVar, zzhb zzhbVar) {
        zzhbVar.getClass();
        zzgeVar.zzf = zzhbVar;
        zzgeVar.zze = 2;
    }

    public static /* synthetic */ void zzB(zzge zzgeVar, int i9) {
        zzgeVar.zzg = i9 - 1;
        zzgeVar.zzd |= 1;
    }

    public static zzgd zzy() {
        return (zzgd) zzb.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final Object zzx(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzcs.zzq(zzb, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzgb.zza, zzhb.class, zzho.class});
        }
        if (i10 == 3) {
            return new zzge();
        }
        zzgc zzgcVar = null;
        if (i10 == 4) {
            return new zzgd(zzgcVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhl extends zzcs implements zzed {
    private static final zzhl zzb;
    private int zzd;
    private int zze;

    static {
        zzhl zzhlVar = new zzhl();
        zzb = zzhlVar;
        zzcs.zzt(zzhl.class, zzhlVar);
    }

    private zzhl() {
    }

    public static zzhl zzz() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final Object zzx(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzcs.zzq(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzhk.zza});
        }
        if (i10 == 3) {
            return new zzhl();
        }
        zzhi zzhiVar = null;
        if (i10 == 4) {
            return new zzhj(zzhiVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

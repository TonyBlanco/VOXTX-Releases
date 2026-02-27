package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpu extends zzsh implements zztq {
    private static final zzpu zzb;
    private int zzd;
    private String zze = "";
    private long zzf;
    private long zzg;
    private zzpw zzh;

    static {
        zzpu zzpuVar = new zzpu();
        zzb = zzpuVar;
        zzsh.zzG(zzpu.class, zzpuVar);
    }

    private zzpu() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new zzpu();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzpt(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

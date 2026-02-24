package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpf extends zzsh implements zztq {
    private static final zzpf zzb;
    private int zzd;
    private long zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;

    static {
        zzpf zzpfVar = new zzpf();
        zzb = zzpfVar;
        zzsh.zzG(zzpf.class, zzpfVar);
    }

    private zzpf() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new zzpf();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzpe(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

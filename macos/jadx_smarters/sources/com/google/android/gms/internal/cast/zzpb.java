package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpb extends zzsh implements zztq {
    private static final zzpb zzb;
    private int zzd;
    private String zze = "";
    private zzsp zzf = zzsh.zzz();
    private zzsp zzg = zzsh.zzz();
    private boolean zzh;

    static {
        zzpb zzpbVar = new zzpb();
        zzb = zzpbVar;
        zzsh.zzG(zzpb.class, zzpbVar);
    }

    private zzpb() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzd", "zze", "zzf", zznr.class, "zzg", zznc.class, "zzh"});
        }
        if (i10 == 3) {
            return new zzpb();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzpa(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

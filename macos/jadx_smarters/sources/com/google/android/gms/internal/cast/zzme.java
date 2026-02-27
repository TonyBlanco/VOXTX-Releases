package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzme extends zzsh implements zztq {
    private static final zzme zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private zzsp zzi = zzsh.zzz();
    private zzsp zzj = zzsh.zzz();
    private String zzk = "";

    static {
        zzme zzmeVar = new zzme();
        zzb = zzmeVar;
        zzsh.zzG(zzme.class, zzmeVar);
    }

    private zzme() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzd", "zze", zzgo.zza(), "zzf", "zzg", zzie.zza(), "zzh", "zzi", zzon.class, "zzj", zzon.class, "zzk"});
        }
        if (i10 == 3) {
            return new zzme();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzmd(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmo extends zzsh implements zztq {
    private static final zzmo zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;

    static {
        zzmo zzmoVar = new zzmo();
        zzb = zzmoVar;
        zzsh.zzG(zzmo.class, zzmoVar);
    }

    private zzmo() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", zzka.zza(), "zzf", zzju.zza(), "zzg", zzjx.zza(), "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new zzmo();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzmn(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

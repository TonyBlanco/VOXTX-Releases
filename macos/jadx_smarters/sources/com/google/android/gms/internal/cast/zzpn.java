package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpn extends zzsh implements zztq {
    private static final zzpn zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private zzsp zzg = zzsh.zzz();
    private zzsp zzh = zzsh.zzz();
    private int zzi;

    static {
        zzpn zzpnVar = new zzpn();
        zzb = zzpnVar;
        zzsh.zzG(zzpn.class, zzpnVar);
    }

    private zzpn() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b\u0004\u001b\u0005ဌ\u0002", new Object[]{"zzd", "zze", zzlb.zza(), "zzf", zzle.zza(), "zzg", zznc.class, "zzh", zznc.class, "zzi", zzie.zza()});
        }
        if (i10 == 3) {
            return new zzpn();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzpm(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

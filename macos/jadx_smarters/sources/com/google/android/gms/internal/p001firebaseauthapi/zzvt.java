package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzvt extends zzajc<zzvt, zza> implements zzakp {
    private static final zzvt zzc;
    private static volatile zzakw<zzvt> zzd;
    private String zze = "";
    private zzajj<zzvf> zzf = zzajc.zzp();

    public static final class zza extends zzajc.zza<zzvt, zza> implements zzakp {
        private zza() {
            super(zzvt.zzc);
        }

        public /* synthetic */ zza(zzvv zzvvVar) {
            this();
        }
    }

    static {
        zzvt zzvtVar = new zzvt();
        zzc = zzvtVar;
        zzajc.zza((Class<zzvt>) zzvt.class, zzvtVar);
    }

    private zzvt() {
    }

    public static zzvt zzb() {
        return zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvt>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzvv zzvvVar = null;
        switch (zzvv.zza[i9 - 1]) {
            case 1:
                return new zzvt();
            case 2:
                return new zza(zzvvVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzvf.class});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvt> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zzvt.class) {
                        try {
                            zzakw<zzvt> zzakwVar2 = zzd;
                            ?? r22 = zzakwVar2;
                            if (zzakwVar2 == null) {
                                ?? zzcVar = new zzajc.zzc(zzc);
                                zzd = zzcVar;
                                r22 = zzcVar;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return obj3;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

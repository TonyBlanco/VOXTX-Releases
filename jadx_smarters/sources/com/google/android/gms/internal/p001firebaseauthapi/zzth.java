package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zzth extends zzajc<zzth, zza> implements zzakp {
    private static final zzth zzc;
    private static volatile zzakw<zzth> zzd;

    public static final class zza extends zzajc.zza<zzth, zza> implements zzakp {
        private zza() {
            super(zzth.zzc);
        }

        public /* synthetic */ zza(zzti zztiVar) {
            this();
        }
    }

    static {
        zzth zzthVar = new zzth();
        zzc = zzthVar;
        zzajc.zza((Class<zzth>) zzth.class, zzthVar);
    }

    private zzth() {
    }

    public static zzth zza(zzahp zzahpVar, zzaio zzaioVar) throws zzaji {
        return (zzth) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    public static zzth zzb() {
        return zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzth>] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzti zztiVar = null;
        switch (zzti.zza[i9 - 1]) {
            case 1:
                return new zzth();
            case 2:
                return new zza(zztiVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzc;
            case 5:
                zzakw<zzth> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zzth.class) {
                        try {
                            zzakw<zzth> zzakwVar2 = zzd;
                            ?? r12 = zzakwVar2;
                            if (zzakwVar2 == null) {
                                ?? zzcVar = new zzajc.zzc(zzc);
                                zzd = zzcVar;
                                r12 = zzcVar;
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

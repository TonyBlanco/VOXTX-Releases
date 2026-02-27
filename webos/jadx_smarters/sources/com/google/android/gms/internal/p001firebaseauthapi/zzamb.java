package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamb extends zzajc<zzamb, zza> implements zzakp {
    private static final zzamb zzc;
    private static volatile zzakw<zzamb> zzd;
    private long zze;
    private int zzf;

    public static final class zza extends zzajc.zza<zzamb, zza> implements zzakp {
        private zza() {
            super(zzamb.zzc);
        }

        public /* synthetic */ zza(zzama zzamaVar) {
            this();
        }

        public final zza zza(int i9) {
            if (!this.zza.zzu()) {
                zzj();
            }
            ((zzamb) this.zza).zza(i9);
            return this;
        }

        public final zza zza(long j9) {
            if (!this.zza.zzu()) {
                zzj();
            }
            ((zzamb) this.zza).zza(j9);
            return this;
        }
    }

    static {
        zzamb zzambVar = new zzamb();
        zzc = zzambVar;
        zzajc.zza((Class<zzamb>) zzamb.class, zzambVar);
    }

    private zzamb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i9) {
        this.zzf = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(long j9) {
        this.zze = j9;
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzamb>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzama zzamaVar = null;
        switch (zzama.zza[i9 - 1]) {
            case 1:
                return new zzamb();
            case 2:
                return new zza(zzamaVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzamb> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zzamb.class) {
                        try {
                            zzakw<zzamb> zzakwVar2 = zzd;
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

    public final long zzb() {
        return this.zze;
    }
}

package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsu extends zzajc<zzsu, zza> implements zzakp {
    private static final zzsu zzc;
    private static volatile zzakw<zzsu> zzd;
    private int zze;
    private zzahp zzf = zzahp.zza;

    public static final class zza extends zzajc.zza<zzsu, zza> implements zzakp {
        private zza() {
            super(zzsu.zzc);
        }

        public /* synthetic */ zza(zzst zzstVar) {
            this();
        }

        public final zza zza(int i9) {
            zzi();
            ((zzsu) this.zza).zza(i9);
            return this;
        }

        public final zza zza(zzahp zzahpVar) {
            zzi();
            ((zzsu) this.zza).zza(zzahpVar);
            return this;
        }
    }

    static {
        zzsu zzsuVar = new zzsu();
        zzc = zzsuVar;
        zzajc.zza((Class<zzsu>) zzsu.class, zzsuVar);
    }

    private zzsu() {
    }

    public static zzsu zza(zzahp zzahpVar, zzaio zzaioVar) throws zzaji {
        return (zzsu) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i9) {
        this.zze = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahp zzahpVar) {
        zzahpVar.getClass();
        this.zzf = zzahpVar;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsu>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzst zzstVar = null;
        switch (zzst.zza[i9 - 1]) {
            case 1:
                return new zzsu();
            case 2:
                return new zza(zzstVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsu> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zzsu.class) {
                        try {
                            zzakw<zzsu> zzakwVar2 = zzd;
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

    public final zzahp zzd() {
        return this.zzf;
    }
}

package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zztd extends zzajc<zztd, zza> implements zzakp {
    private static final zztd zzc;
    private static volatile zzakw<zztd> zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzajc.zza<zztd, zza> implements zzakp {
        private zza() {
            super(zztd.zzc);
        }

        public /* synthetic */ zza(zzte zzteVar) {
            this();
        }

        public final zza zza(int i9) {
            zzi();
            ((zztd) this.zza).zza(i9);
            return this;
        }
    }

    static {
        zztd zztdVar = new zztd();
        zzc = zztdVar;
        zzajc.zza((Class<zztd>) zztd.class, zztdVar);
    }

    private zztd() {
    }

    public static zztd zza(zzahp zzahpVar, zzaio zzaioVar) throws zzaji {
        return (zztd) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i9) {
        this.zze = i9;
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztd>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzte zzteVar = null;
        switch (zzte.zza[i9 - 1]) {
            case 1:
                return new zztd();
            case 2:
                return new zza(zzteVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztd> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zztd.class) {
                        try {
                            zzakw<zztd> zzakwVar2 = zzd;
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

    public final int zzb() {
        return this.zzf;
    }
}

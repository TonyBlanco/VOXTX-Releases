package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsa extends zzajc<zzsa, zza> implements zzakp {
    private static final zzsa zzc;
    private static volatile zzakw<zzsa> zzd;
    private int zze;
    private int zzf;
    private zzsb zzg;

    public static final class zza extends zzajc.zza<zzsa, zza> implements zzakp {
        private zza() {
            super(zzsa.zzc);
        }

        public /* synthetic */ zza(zzrz zzrzVar) {
            this();
        }

        public final zza zza(int i9) {
            zzi();
            ((zzsa) this.zza).zza(i9);
            return this;
        }

        public final zza zza(zzsb zzsbVar) {
            zzi();
            ((zzsa) this.zza).zza(zzsbVar);
            return this;
        }
    }

    static {
        zzsa zzsaVar = new zzsa();
        zzc = zzsaVar;
        zzajc.zza((Class<zzsa>) zzsa.class, zzsaVar);
    }

    private zzsa() {
    }

    public static zzsa zza(zzahp zzahpVar, zzaio zzaioVar) throws zzaji {
        return (zzsa) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i9) {
        this.zzf = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzsb zzsbVar) {
        zzsbVar.getClass();
        this.zzg = zzsbVar;
        this.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsa>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzrz zzrzVar = null;
        switch (zzrz.zza[i9 - 1]) {
            case 1:
                return new zzsa();
            case 2:
                return new zza(zzrzVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsa> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zzsa.class) {
                        try {
                            zzakw<zzsa> zzakwVar2 = zzd;
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

    public final zzsb zzd() {
        zzsb zzsbVar = this.zzg;
        return zzsbVar == null ? zzsb.zzd() : zzsbVar;
    }
}

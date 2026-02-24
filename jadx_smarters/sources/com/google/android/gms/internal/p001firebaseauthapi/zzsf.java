package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsf extends zzajc<zzsf, zza> implements zzakp {
    private static final zzsf zzc;
    private static volatile zzakw<zzsf> zzd;
    private int zze;
    private zzsj zzf;
    private zzug zzg;

    public static final class zza extends zzajc.zza<zzsf, zza> implements zzakp {
        private zza() {
            super(zzsf.zzc);
        }

        public /* synthetic */ zza(zzsg zzsgVar) {
            this();
        }

        public final zza zza(zzsj zzsjVar) {
            zzi();
            ((zzsf) this.zza).zza(zzsjVar);
            return this;
        }

        public final zza zza(zzug zzugVar) {
            zzi();
            ((zzsf) this.zza).zza(zzugVar);
            return this;
        }
    }

    static {
        zzsf zzsfVar = new zzsf();
        zzc = zzsfVar;
        zzajc.zza((Class<zzsf>) zzsf.class, zzsfVar);
    }

    private zzsf() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzsf zza(zzahp zzahpVar, zzaio zzaioVar) throws zzaji {
        return (zzsf) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzsj zzsjVar) {
        zzsjVar.getClass();
        this.zzf = zzsjVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzug zzugVar) {
        zzugVar.getClass();
        this.zzg = zzugVar;
        this.zze |= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsf>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzsg zzsgVar = null;
        switch (zzsg.zza[i9 - 1]) {
            case 1:
                return new zzsf();
            case 2:
                return new zza(zzsgVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsf> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zzsf.class) {
                        try {
                            zzakw<zzsf> zzakwVar2 = zzd;
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

    public final zzsj zzc() {
        zzsj zzsjVar = this.zzf;
        return zzsjVar == null ? zzsj.zzd() : zzsjVar;
    }

    public final zzug zzd() {
        zzug zzugVar = this.zzg;
        return zzugVar == null ? zzug.zze() : zzugVar;
    }
}

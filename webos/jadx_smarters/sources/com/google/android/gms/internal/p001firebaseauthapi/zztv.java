package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zztv extends zzajc<zztv, zza> implements zzakp {
    private static final zztv zzc;
    private static volatile zzakw<zztv> zzd;
    private int zze;
    private int zzf;
    private zzahp zzg = zzahp.zza;

    public static final class zza extends zzajc.zza<zztv, zza> implements zzakp {
        private zza() {
            super(zztv.zzc);
        }

        public /* synthetic */ zza(zztw zztwVar) {
            this();
        }

        public final zza zza(zzahp zzahpVar) {
            zzi();
            ((zztv) this.zza).zza(zzahpVar);
            return this;
        }

        public final zza zza(zzty zztyVar) {
            zzi();
            ((zztv) this.zza).zza(zztyVar);
            return this;
        }

        public final zza zza(zzub zzubVar) {
            zzi();
            ((zztv) this.zza).zza(zzubVar);
            return this;
        }
    }

    static {
        zztv zztvVar = new zztv();
        zzc = zztvVar;
        zzajc.zza((Class<zztv>) zztv.class, zztvVar);
    }

    private zztv() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahp zzahpVar) {
        zzahpVar.getClass();
        this.zzg = zzahpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzty zztyVar) {
        this.zze = zztyVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzub zzubVar) {
        this.zzf = zzubVar.zza();
    }

    public static zztv zzc() {
        return zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztv>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zztw zztwVar = null;
        switch (zztw.zza[i9 - 1]) {
            case 1:
                return new zztv();
            case 2:
                return new zza(zztwVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztv> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zztv.class) {
                        try {
                            zzakw<zztv> zzakwVar2 = zzd;
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

    public final zzty zzd() {
        zzty zztyVarZza = zzty.zza(this.zze);
        return zztyVarZza == null ? zzty.UNRECOGNIZED : zztyVarZza;
    }

    public final zzub zze() {
        zzub zzubVarZza = zzub.zza(this.zzf);
        return zzubVarZza == null ? zzub.UNRECOGNIZED : zzubVarZza;
    }

    public final zzahp zzf() {
        return this.zzg;
    }
}

package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zztq extends zzajc<zztq, zza> implements zzakp {
    private static final zztq zzc;
    private static volatile zzakw<zztq> zzd;
    private int zze;
    private zztv zzf;
    private zztm zzg;
    private int zzh;

    public static final class zza extends zzajc.zza<zztq, zza> implements zzakp {
        private zza() {
            super(zztq.zzc);
        }

        public /* synthetic */ zza(zztp zztpVar) {
            this();
        }

        public final zza zza(zztk zztkVar) {
            zzi();
            ((zztq) this.zza).zza(zztkVar);
            return this;
        }

        public final zza zza(zztm zztmVar) {
            zzi();
            ((zztq) this.zza).zza(zztmVar);
            return this;
        }

        public final zza zza(zztv zztvVar) {
            zzi();
            ((zztq) this.zza).zza(zztvVar);
            return this;
        }
    }

    static {
        zztq zztqVar = new zztq();
        zzc = zztqVar;
        zzajc.zza((Class<zztq>) zztq.class, zztqVar);
    }

    private zztq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zztk zztkVar) {
        this.zzh = zztkVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zztm zztmVar) {
        zztmVar.getClass();
        this.zzg = zztmVar;
        this.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zztv zztvVar) {
        zztvVar.getClass();
        this.zzf = zztvVar;
        this.zze |= 1;
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zztq zze() {
        return zzc;
    }

    public final zztk zza() {
        zztk zztkVarZza = zztk.zza(this.zzh);
        return zztkVarZza == null ? zztk.UNRECOGNIZED : zztkVarZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztq>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zztp zztpVar = null;
        switch (zztp.zza[i9 - 1]) {
            case 1:
                return new zztq();
            case 2:
                return new zza(zztpVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztq> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zztq.class) {
                        try {
                            zzakw<zztq> zzakwVar2 = zzd;
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

    public final zztm zzb() {
        zztm zztmVar = this.zzg;
        return zztmVar == null ? zztm.zzc() : zztmVar;
    }

    public final zztv zzf() {
        zztv zztvVar = this.zzf;
        return zztvVar == null ? zztv.zzc() : zztvVar;
    }
}

package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zzuc extends zzajc<zzuc, zza> implements zzakp {
    private static final zzuc zzc;
    private static volatile zzakw<zzuc> zzd;
    private int zze;
    private int zzf;
    private zzuh zzg;
    private zzahp zzh = zzahp.zza;

    public static final class zza extends zzajc.zza<zzuc, zza> implements zzakp {
        private zza() {
            super(zzuc.zzc);
        }

        public /* synthetic */ zza(zzue zzueVar) {
            this();
        }

        public final zza zza(int i9) {
            zzi();
            ((zzuc) this.zza).zza(i9);
            return this;
        }

        public final zza zza(zzahp zzahpVar) {
            zzi();
            ((zzuc) this.zza).zza(zzahpVar);
            return this;
        }

        public final zza zza(zzuh zzuhVar) {
            zzi();
            ((zzuc) this.zza).zza(zzuhVar);
            return this;
        }
    }

    static {
        zzuc zzucVar = new zzuc();
        zzc = zzucVar;
        zzajc.zza((Class<zzuc>) zzuc.class, zzucVar);
    }

    private zzuc() {
    }

    public static zzuc zza(zzahp zzahpVar, zzaio zzaioVar) throws zzaji {
        return (zzuc) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i9) {
        this.zzf = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahp zzahpVar) {
        zzahpVar.getClass();
        this.zzh = zzahpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzuh zzuhVar) {
        zzuhVar.getClass();
        this.zzg = zzuhVar;
        this.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzuc zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzuc>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzue zzueVar = null;
        switch (zzue.zza[i9 - 1]) {
            case 1:
                return new zzuc();
            case 2:
                return new zza(zzueVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzuc> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zzuc.class) {
                        try {
                            zzakw<zzuc> zzakwVar2 = zzd;
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

    public final zzuh zze() {
        zzuh zzuhVar = this.zzg;
        return zzuhVar == null ? zzuh.zze() : zzuhVar;
    }

    public final zzahp zzf() {
        return this.zzh;
    }
}

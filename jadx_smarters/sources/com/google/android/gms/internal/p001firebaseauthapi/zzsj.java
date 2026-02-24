package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsj extends zzajc<zzsj, zza> implements zzakp {
    private static final zzsj zzc;
    private static volatile zzakw<zzsj> zzd;
    private int zze;
    private zzsm zzf;
    private int zzg;

    public static final class zza extends zzajc.zza<zzsj, zza> implements zzakp {
        private zza() {
            super(zzsj.zzc);
        }

        public /* synthetic */ zza(zzsk zzskVar) {
            this();
        }

        public final zza zza(int i9) {
            zzi();
            ((zzsj) this.zza).zza(i9);
            return this;
        }

        public final zza zza(zzsm zzsmVar) {
            zzi();
            ((zzsj) this.zza).zza(zzsmVar);
            return this;
        }
    }

    static {
        zzsj zzsjVar = new zzsj();
        zzc = zzsjVar;
        zzajc.zza((Class<zzsj>) zzsj.class, zzsjVar);
    }

    private zzsj() {
    }

    public static zzsj zza(zzahp zzahpVar, zzaio zzaioVar) throws zzaji {
        return (zzsj) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i9) {
        this.zzg = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzsm zzsmVar) {
        zzsmVar.getClass();
        this.zzf = zzsmVar;
        this.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzsj zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsj>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzsk zzskVar = null;
        switch (zzsk.zza[i9 - 1]) {
            case 1:
                return new zzsj();
            case 2:
                return new zza(zzskVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsj> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zzsj.class) {
                        try {
                            zzakw<zzsj> zzakwVar2 = zzd;
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

    public final zzsm zze() {
        zzsm zzsmVar = this.zzf;
        return zzsmVar == null ? zzsm.zzd() : zzsmVar;
    }
}

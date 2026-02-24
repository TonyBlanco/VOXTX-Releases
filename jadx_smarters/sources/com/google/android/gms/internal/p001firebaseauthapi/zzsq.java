package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsq extends zzajc<zzsq, zza> implements zzakp {
    private static final zzsq zzc;
    private static volatile zzakw<zzsq> zzd;
    private int zze;
    private zzsr zzf;
    private int zzg;

    public static final class zza extends zzajc.zza<zzsq, zza> implements zzakp {
        private zza() {
            super(zzsq.zzc);
        }

        public /* synthetic */ zza(zzsp zzspVar) {
            this();
        }

        public final zza zza(int i9) {
            zzi();
            ((zzsq) this.zza).zza(i9);
            return this;
        }

        public final zza zza(zzsr zzsrVar) {
            zzi();
            ((zzsq) this.zza).zza(zzsrVar);
            return this;
        }
    }

    static {
        zzsq zzsqVar = new zzsq();
        zzc = zzsqVar;
        zzajc.zza((Class<zzsq>) zzsq.class, zzsqVar);
    }

    private zzsq() {
    }

    public static zzsq zza(zzahp zzahpVar, zzaio zzaioVar) throws zzaji {
        return (zzsq) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i9) {
        this.zzg = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzsr zzsrVar) {
        zzsrVar.getClass();
        this.zzf = zzsrVar;
        this.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsq>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzsp zzspVar = null;
        switch (zzsp.zza[i9 - 1]) {
            case 1:
                return new zzsq();
            case 2:
                return new zza(zzspVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsq> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zzsq.class) {
                        try {
                            zzakw<zzsq> zzakwVar2 = zzd;
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

    public final zzsr zzd() {
        zzsr zzsrVar = this.zzf;
        return zzsrVar == null ? zzsr.zzd() : zzsrVar;
    }
}

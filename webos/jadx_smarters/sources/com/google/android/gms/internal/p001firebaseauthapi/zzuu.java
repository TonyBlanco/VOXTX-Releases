package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zzuu extends zzajc<zzuu, zza> implements zzakp {
    private static final zzuu zzc;
    private static volatile zzakw<zzuu> zzd;
    private int zze;
    private int zzf;
    private zzuv zzg;
    private zzahp zzh = zzahp.zza;

    public static final class zza extends zzajc.zza<zzuu, zza> implements zzakp {
        private zza() {
            super(zzuu.zzc);
        }

        public /* synthetic */ zza(zzut zzutVar) {
            this();
        }

        public final zza zza(int i9) {
            zzi();
            ((zzuu) this.zza).zza(0);
            return this;
        }

        public final zza zza(zzahp zzahpVar) {
            zzi();
            ((zzuu) this.zza).zza(zzahpVar);
            return this;
        }

        public final zza zza(zzuv zzuvVar) {
            zzi();
            ((zzuu) this.zza).zza(zzuvVar);
            return this;
        }
    }

    static {
        zzuu zzuuVar = new zzuu();
        zzc = zzuuVar;
        zzajc.zza((Class<zzuu>) zzuu.class, zzuuVar);
    }

    private zzuu() {
    }

    public static zzuu zza(zzahp zzahpVar, zzaio zzaioVar) throws zzaji {
        return (zzuu) zzajc.zza(zzc, zzahpVar, zzaioVar);
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
    public final void zza(zzuv zzuvVar) {
        zzuvVar.getClass();
        this.zzg = zzuvVar;
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
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzuu>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzut zzutVar = null;
        switch (zzut.zza[i9 - 1]) {
            case 1:
                return new zzuu();
            case 2:
                return new zza(zzutVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzuu> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zzuu.class) {
                        try {
                            zzakw<zzuu> zzakwVar2 = zzd;
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

    public final zzuv zzd() {
        zzuv zzuvVar = this.zzg;
        return zzuvVar == null ? zzuv.zze() : zzuvVar;
    }

    public final zzahp zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        return (this.zze & 1) != 0;
    }
}

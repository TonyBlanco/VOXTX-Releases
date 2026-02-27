package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zzuv extends zzajc<zzuv, zza> implements zzakp {
    private static final zzuv zzc;
    private static volatile zzakw<zzuv> zzd;
    private int zze;
    private int zzf;
    private zzur zzg;
    private zzahp zzh = zzahp.zza;

    public static final class zza extends zzajc.zza<zzuv, zza> implements zzakp {
        private zza() {
            super(zzuv.zzc);
        }

        public /* synthetic */ zza(zzuw zzuwVar) {
            this();
        }

        public final zza zza(int i9) {
            zzi();
            ((zzuv) this.zza).zza(0);
            return this;
        }

        public final zza zza(zzahp zzahpVar) {
            zzi();
            ((zzuv) this.zza).zza(zzahpVar);
            return this;
        }

        public final zza zza(zzur zzurVar) {
            zzi();
            ((zzuv) this.zza).zza(zzurVar);
            return this;
        }
    }

    static {
        zzuv zzuvVar = new zzuv();
        zzc = zzuvVar;
        zzajc.zza((Class<zzuv>) zzuv.class, zzuvVar);
    }

    private zzuv() {
    }

    public static zzuv zza(zzahp zzahpVar, zzaio zzaioVar) throws zzaji {
        return (zzuv) zzajc.zza(zzc, zzahpVar, zzaioVar);
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
    public final void zza(zzur zzurVar) {
        zzurVar.getClass();
        this.zzg = zzurVar;
        this.zze |= 1;
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzuv zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzuv>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzuw zzuwVar = null;
        switch (zzuw.zza[i9 - 1]) {
            case 1:
                return new zzuv();
            case 2:
                return new zza(zzuwVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzuv> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zzuv.class) {
                        try {
                            zzakw<zzuv> zzakwVar2 = zzd;
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

    public final zzur zzb() {
        zzur zzurVar = this.zzg;
        return zzurVar == null ? zzur.zzf() : zzurVar;
    }

    public final zzahp zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zze & 1) != 0;
    }
}

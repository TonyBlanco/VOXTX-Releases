package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsi extends zzajc<zzsi, zza> implements zzakp {
    private static final zzsi zzc;
    private static volatile zzakw<zzsi> zzd;
    private int zze;
    private int zzf;
    private zzsm zzg;
    private zzahp zzh = zzahp.zza;

    public static final class zza extends zzajc.zza<zzsi, zza> implements zzakp {
        private zza() {
            super(zzsi.zzc);
        }

        public /* synthetic */ zza(zzsh zzshVar) {
            this();
        }

        public final zza zza(int i9) {
            zzi();
            ((zzsi) this.zza).zza(0);
            return this;
        }

        public final zza zza(zzahp zzahpVar) {
            zzi();
            ((zzsi) this.zza).zza(zzahpVar);
            return this;
        }

        public final zza zza(zzsm zzsmVar) {
            zzi();
            ((zzsi) this.zza).zza(zzsmVar);
            return this;
        }
    }

    static {
        zzsi zzsiVar = new zzsi();
        zzc = zzsiVar;
        zzajc.zza((Class<zzsi>) zzsi.class, zzsiVar);
    }

    private zzsi() {
    }

    public static zzsi zza(zzahp zzahpVar, zzaio zzaioVar) throws zzaji {
        return (zzsi) zzajc.zza(zzc, zzahpVar, zzaioVar);
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
    public final void zza(zzsm zzsmVar) {
        zzsmVar.getClass();
        this.zzg = zzsmVar;
        this.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzsi zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsi>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzsh zzshVar = null;
        switch (zzsh.zza[i9 - 1]) {
            case 1:
                return new zzsi();
            case 2:
                return new zza(zzshVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsi> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zzsi.class) {
                        try {
                            zzakw<zzsi> zzakwVar2 = zzd;
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
        zzsm zzsmVar = this.zzg;
        return zzsmVar == null ? zzsm.zzd() : zzsmVar;
    }

    public final zzahp zzf() {
        return this.zzh;
    }
}

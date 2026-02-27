package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zztr extends zzajc<zztr, zza> implements zzakp {
    private static final zztr zzc;
    private static volatile zzakw<zztr> zzd;
    private int zze;
    private int zzf;
    private zztu zzg;
    private zzahp zzh = zzahp.zza;

    public static final class zza extends zzajc.zza<zztr, zza> implements zzakp {
        private zza() {
            super(zztr.zzc);
        }

        public /* synthetic */ zza(zzts zztsVar) {
            this();
        }

        public final zza zza(int i9) {
            zzi();
            ((zztr) this.zza).zza(0);
            return this;
        }

        public final zza zza(zzahp zzahpVar) {
            zzi();
            ((zztr) this.zza).zza(zzahpVar);
            return this;
        }

        public final zza zza(zztu zztuVar) {
            zzi();
            ((zztr) this.zza).zza(zztuVar);
            return this;
        }
    }

    static {
        zztr zztrVar = new zztr();
        zzc = zztrVar;
        zzajc.zza((Class<zztr>) zztr.class, zztrVar);
    }

    private zztr() {
    }

    public static zztr zza(zzahp zzahpVar, zzaio zzaioVar) throws zzaji {
        return (zztr) zzajc.zza(zzc, zzahpVar, zzaioVar);
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
    public final void zza(zztu zztuVar) {
        zztuVar.getClass();
        this.zzg = zztuVar;
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
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztr>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzts zztsVar = null;
        switch (zzts.zza[i9 - 1]) {
            case 1:
                return new zztr();
            case 2:
                return new zza(zztsVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztr> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zztr.class) {
                        try {
                            zzakw<zztr> zzakwVar2 = zzd;
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

    public final zztu zzd() {
        zztu zztuVar = this.zzg;
        return zztuVar == null ? zztu.zze() : zztuVar;
    }

    public final zzahp zze() {
        return this.zzh;
    }
}

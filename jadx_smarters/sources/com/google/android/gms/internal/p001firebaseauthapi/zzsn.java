package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsn extends zzajc<zzsn, zza> implements zzakp {
    private static final zzsn zzc;
    private static volatile zzakw<zzsn> zzd;
    private int zze;
    private int zzf;
    private zzsr zzg;
    private zzahp zzh = zzahp.zza;

    public static final class zza extends zzajc.zza<zzsn, zza> implements zzakp {
        private zza() {
            super(zzsn.zzc);
        }

        public /* synthetic */ zza(zzso zzsoVar) {
            this();
        }

        public final zza zza(int i9) {
            zzi();
            ((zzsn) this.zza).zza(0);
            return this;
        }

        public final zza zza(zzahp zzahpVar) {
            zzi();
            ((zzsn) this.zza).zza(zzahpVar);
            return this;
        }

        public final zza zza(zzsr zzsrVar) {
            zzi();
            ((zzsn) this.zza).zza(zzsrVar);
            return this;
        }
    }

    static {
        zzsn zzsnVar = new zzsn();
        zzc = zzsnVar;
        zzajc.zza((Class<zzsn>) zzsn.class, zzsnVar);
    }

    private zzsn() {
    }

    public static zzsn zza(zzahp zzahpVar, zzaio zzaioVar) throws zzaji {
        return (zzsn) zzajc.zza(zzc, zzahpVar, zzaioVar);
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
    public final void zza(zzsr zzsrVar) {
        zzsrVar.getClass();
        this.zzg = zzsrVar;
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
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsn>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzso zzsoVar = null;
        switch (zzso.zza[i9 - 1]) {
            case 1:
                return new zzsn();
            case 2:
                return new zza(zzsoVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsn> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zzsn.class) {
                        try {
                            zzakw<zzsn> zzakwVar2 = zzd;
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
        zzsr zzsrVar = this.zzg;
        return zzsrVar == null ? zzsr.zzd() : zzsrVar;
    }

    public final zzahp zze() {
        return this.zzh;
    }
}

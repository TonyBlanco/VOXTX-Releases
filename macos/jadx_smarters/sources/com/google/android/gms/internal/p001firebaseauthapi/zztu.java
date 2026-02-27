package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zztu extends zzajc<zztu, zza> implements zzakp {
    private static final zztu zzc;
    private static volatile zzakw<zztu> zzd;
    private int zze;
    private int zzf;
    private zztq zzg;
    private zzahp zzh;
    private zzahp zzi;

    public static final class zza extends zzajc.zza<zztu, zza> implements zzakp {
        private zza() {
            super(zztu.zzc);
        }

        public /* synthetic */ zza(zztt zzttVar) {
            this();
        }

        public final zza zza(int i9) {
            zzi();
            ((zztu) this.zza).zza(0);
            return this;
        }

        public final zza zza(zzahp zzahpVar) {
            zzi();
            ((zztu) this.zza).zza(zzahpVar);
            return this;
        }

        public final zza zza(zztq zztqVar) {
            zzi();
            ((zztu) this.zza).zza(zztqVar);
            return this;
        }

        public final zza zzb(zzahp zzahpVar) {
            zzi();
            ((zztu) this.zza).zzb(zzahpVar);
            return this;
        }
    }

    static {
        zztu zztuVar = new zztu();
        zzc = zztuVar;
        zzajc.zza((Class<zztu>) zztu.class, zztuVar);
    }

    private zztu() {
        zzahp zzahpVar = zzahp.zza;
        this.zzh = zzahpVar;
        this.zzi = zzahpVar;
    }

    public static zztu zza(zzahp zzahpVar, zzaio zzaioVar) throws zzaji {
        return (zztu) zzajc.zza(zzc, zzahpVar, zzaioVar);
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
    public final void zza(zztq zztqVar) {
        zztqVar.getClass();
        this.zzg = zztqVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzahp zzahpVar) {
        zzahpVar.getClass();
        this.zzi = zzahpVar;
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zztu zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztu>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zztt zzttVar = null;
        switch (zztt.zza[i9 - 1]) {
            case 1:
                return new zztu();
            case 2:
                return new zza(zzttVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztu> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zztu.class) {
                        try {
                            zzakw<zztu> zzakwVar2 = zzd;
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

    public final zztq zzb() {
        zztq zztqVar = this.zzg;
        return zztqVar == null ? zztq.zze() : zztqVar;
    }

    public final zzahp zzf() {
        return this.zzh;
    }

    public final zzahp zzg() {
        return this.zzi;
    }
}

package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zztm extends zzajc<zztm, zza> implements zzakp {
    private static final zztm zzc;
    private static volatile zzakw<zztm> zzd;
    private int zze;
    private zzvb zzf;

    public static final class zza extends zzajc.zza<zztm, zza> implements zzakp {
        private zza() {
            super(zztm.zzc);
        }

        public /* synthetic */ zza(zztl zztlVar) {
            this();
        }

        public final zza zza(zzvb zzvbVar) {
            zzi();
            ((zztm) this.zza).zza(zzvbVar);
            return this;
        }
    }

    static {
        zztm zztmVar = new zztm();
        zzc = zztmVar;
        zzajc.zza((Class<zztm>) zztm.class, zztmVar);
    }

    private zztm() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzvb zzvbVar) {
        zzvbVar.getClass();
        this.zzf = zzvbVar;
        this.zze |= 1;
    }

    public static zztm zzc() {
        return zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztm>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zztl zztlVar = null;
        switch (zztl.zza[i9 - 1]) {
            case 1:
                return new zztm();
            case 2:
                return new zza(zztlVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztm> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zztm.class) {
                        try {
                            zzakw<zztm> zzakwVar2 = zzd;
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

    public final zzvb zzd() {
        zzvb zzvbVar = this.zzf;
        return zzvbVar == null ? zzvb.zzc() : zzvbVar;
    }
}

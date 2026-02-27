package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsm extends zzajc<zzsm, zza> implements zzakp {
    private static final zzsm zzc;
    private static volatile zzakw<zzsm> zzd;
    private int zze;

    public static final class zza extends zzajc.zza<zzsm, zza> implements zzakp {
        private zza() {
            super(zzsm.zzc);
        }

        public /* synthetic */ zza(zzsl zzslVar) {
            this();
        }

        public final zza zza(int i9) {
            zzi();
            ((zzsm) this.zza).zza(i9);
            return this;
        }
    }

    static {
        zzsm zzsmVar = new zzsm();
        zzc = zzsmVar;
        zzajc.zza((Class<zzsm>) zzsm.class, zzsmVar);
    }

    private zzsm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i9) {
        this.zze = i9;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzsm zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsm>] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzsl zzslVar = null;
        switch (zzsl.zza[i9 - 1]) {
            case 1:
                return new zzsm();
            case 2:
                return new zza(zzslVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsm> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zzsm.class) {
                        try {
                            zzakw<zzsm> zzakwVar2 = zzd;
                            ?? r12 = zzakwVar2;
                            if (zzakwVar2 == null) {
                                ?? zzcVar = new zzajc.zzc(zzc);
                                zzd = zzcVar;
                                r12 = zzcVar;
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
}

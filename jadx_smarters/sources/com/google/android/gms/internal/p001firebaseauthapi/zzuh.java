package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zzuh extends zzajc<zzuh, zza> implements zzakp {
    private static final zzuh zzc;
    private static volatile zzakw<zzuh> zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzajc.zza<zzuh, zza> implements zzakp {
        private zza() {
            super(zzuh.zzc);
        }

        public /* synthetic */ zza(zzui zzuiVar) {
            this();
        }

        public final zza zza(int i9) {
            zzi();
            ((zzuh) this.zza).zza(i9);
            return this;
        }

        public final zza zza(zzub zzubVar) {
            zzi();
            ((zzuh) this.zza).zza(zzubVar);
            return this;
        }
    }

    static {
        zzuh zzuhVar = new zzuh();
        zzc = zzuhVar;
        zzajc.zza((Class<zzuh>) zzuh.class, zzuhVar);
    }

    private zzuh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i9) {
        this.zzf = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzub zzubVar) {
        this.zze = zzubVar.zza();
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzuh zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzuh>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzui zzuiVar = null;
        switch (zzui.zza[i9 - 1]) {
            case 1:
                return new zzuh();
            case 2:
                return new zza(zzuiVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzuh> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zzuh.class) {
                        try {
                            zzakw<zzuh> zzakwVar2 = zzd;
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

    public final zzub zzb() {
        zzub zzubVarZza = zzub.zza(this.zze);
        return zzubVarZza == null ? zzub.UNRECOGNIZED : zzubVarZza;
    }
}

package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zzuy extends zzajc<zzuy, zzb> implements zzakp {
    private static final zzuy zzc;
    private static volatile zzakw<zzuy> zzd;
    private String zze = "";
    private zzahp zzf = zzahp.zza;
    private int zzg;

    public enum zza implements zzaje {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        private static final zzajh<zza> zzg = new zzva();
        private final int zzi;

        zza(int i9) {
            this.zzi = i9;
        }

        public static zza zza(int i9) {
            if (i9 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i9 == 1) {
                return SYMMETRIC;
            }
            if (i9 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i9 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i9 != 4) {
                return null;
            }
            return REMOTE;
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(zza.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=");
                sb.append(zza());
            }
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaje
        public final int zza() {
            if (this != UNRECOGNIZED) {
                return this.zzi;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class zzb extends zzajc.zza<zzuy, zzb> implements zzakp {
        private zzb() {
            super(zzuy.zzc);
        }

        public /* synthetic */ zzb(zzux zzuxVar) {
            this();
        }

        public final zzb zza(zzahp zzahpVar) {
            zzi();
            ((zzuy) this.zza).zza(zzahpVar);
            return this;
        }

        public final zzb zza(zza zzaVar) {
            zzi();
            ((zzuy) this.zza).zza(zzaVar);
            return this;
        }

        public final zzb zza(String str) {
            zzi();
            ((zzuy) this.zza).zza(str);
            return this;
        }
    }

    static {
        zzuy zzuyVar = new zzuy();
        zzc = zzuyVar;
        zzajc.zza((Class<zzuy>) zzuy.class, zzuyVar);
    }

    private zzuy() {
    }

    public static zzb zza() {
        return zzc.zzm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahp zzahpVar) {
        zzahpVar.getClass();
        this.zzf = zzahpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zza zzaVar) {
        this.zzg = zzaVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str) {
        str.getClass();
        this.zze = str;
    }

    public static zzuy zzd() {
        return zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzuy>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzux zzuxVar = null;
        switch (zzux.zza[i9 - 1]) {
            case 1:
                return new zzuy();
            case 2:
                return new zzb(zzuxVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzuy> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zzuy.class) {
                        try {
                            zzakw<zzuy> zzakwVar2 = zzd;
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

    public final zza zzb() {
        zza zzaVarZza = zza.zza(this.zzg);
        return zzaVarZza == null ? zza.UNRECOGNIZED : zzaVarZza;
    }

    public final zzahp zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }
}

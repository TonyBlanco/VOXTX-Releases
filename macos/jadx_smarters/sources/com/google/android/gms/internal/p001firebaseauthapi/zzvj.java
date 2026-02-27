package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zzvj extends zzajc<zzvj, zzb> implements zzakp {
    private static final zzvj zzc;
    private static volatile zzakw<zzvj> zzd;
    private int zze;
    private zzajj<zza> zzf = zzajc.zzp();

    public static final class zza extends zzajc<zza, C0257zza> implements zzakp {
        private static final zza zzc;
        private static volatile zzakw<zza> zzd;
        private String zze = "";
        private int zzf;
        private int zzg;
        private int zzh;

        /* JADX INFO: renamed from: com.google.android.gms.internal.firebase-auth-api.zzvj$zza$zza, reason: collision with other inner class name */
        public static final class C0257zza extends zzajc.zza<zza, C0257zza> implements zzakp {
            private C0257zza() {
                super(zza.zzc);
            }

            public /* synthetic */ C0257zza(zzvi zzviVar) {
                this();
            }

            public final C0257zza zza(int i9) {
                zzi();
                ((zza) this.zza).zza(i9);
                return this;
            }

            public final C0257zza zza(zzuz zzuzVar) {
                zzi();
                ((zza) this.zza).zza(zzuzVar);
                return this;
            }

            public final C0257zza zza(zzvs zzvsVar) {
                zzi();
                ((zza) this.zza).zza(zzvsVar);
                return this;
            }

            public final C0257zza zza(String str) {
                zzi();
                ((zza) this.zza).zza(str);
                return this;
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzajc.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i9) {
            this.zzg = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzuz zzuzVar) {
            this.zzf = zzuzVar.zza();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzvs zzvsVar) {
            this.zzh = zzvsVar.zza();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze = str;
        }

        public static C0257zza zzb() {
            return zzc.zzm();
        }

        public final int zza() {
            return this.zzg;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvj$zza>] */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v18 */
        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
        public final Object zza(int i9, Object obj, Object obj2) {
            zzvi zzviVar = null;
            switch (zzvi.zza[i9 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0257zza(zzviVar);
                case 3:
                    return zzajc.zza(zzc, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzakw<zza> zzakwVar = zzd;
                    Object obj3 = zzakwVar;
                    if (zzakwVar == null) {
                        synchronized (zza.class) {
                            try {
                                zzakw<zza> zzakwVar2 = zzd;
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
    }

    public static final class zzb extends zzajc.zza<zzvj, zzb> implements zzakp {
        private zzb() {
            super(zzvj.zzc);
        }

        public /* synthetic */ zzb(zzvi zzviVar) {
            this();
        }

        public final zzb zza(int i9) {
            zzi();
            ((zzvj) this.zza).zzc(i9);
            return this;
        }

        public final zzb zza(zza zzaVar) {
            zzi();
            ((zzvj) this.zza).zza(zzaVar);
            return this;
        }
    }

    static {
        zzvj zzvjVar = new zzvj();
        zzc = zzvjVar;
        zzajc.zza((Class<zzvj>) zzvj.class, zzvjVar);
    }

    private zzvj() {
    }

    public static zzb zza() {
        return zzc.zzm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zza zzaVar) {
        zzaVar.getClass();
        zzajj<zza> zzajjVar = this.zzf;
        if (!zzajjVar.zzc()) {
            this.zzf = zzajc.zza(zzajjVar);
        }
        this.zzf.add(zzaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(int i9) {
        this.zze = i9;
    }

    public final zza zza(int i9) {
        return this.zzf.get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvj>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzvi zzviVar = null;
        switch (zzvi.zza[i9 - 1]) {
            case 1:
                return new zzvj();
            case 2:
                return new zzb(zzviVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zza.class});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvj> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zzvj.class) {
                        try {
                            zzakw<zzvj> zzakwVar2 = zzd;
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
}

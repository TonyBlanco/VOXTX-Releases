package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzvg extends zzajc<zzvg, zza> implements zzakp {
    private static final zzvg zzc;
    private static volatile zzakw<zzvg> zzd;
    private int zze;
    private zzajj<zzb> zzf = zzajc.zzp();

    public static final class zza extends zzajc.zza<zzvg, zza> implements zzakp {
        private zza() {
            super(zzvg.zzc);
        }

        public /* synthetic */ zza(zzvh zzvhVar) {
            this();
        }

        public final int zza() {
            return ((zzvg) this.zza).zza();
        }

        public final zza zza(int i9) {
            zzi();
            ((zzvg) this.zza).zzc(i9);
            return this;
        }

        public final zza zza(zzb zzbVar) {
            zzi();
            ((zzvg) this.zza).zza(zzbVar);
            return this;
        }

        public final zzb zzb(int i9) {
            return ((zzvg) this.zza).zza(i9);
        }

        public final List<zzb> zzb() {
            return Collections.unmodifiableList(((zzvg) this.zza).zze());
        }
    }

    public static final class zzb extends zzajc<zzb, zza> implements zzakp {
        private static final zzb zzc;
        private static volatile zzakw<zzb> zzd;
        private int zze;
        private zzuy zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        public static final class zza extends zzajc.zza<zzb, zza> implements zzakp {
            private zza() {
                super(zzb.zzc);
            }

            public /* synthetic */ zza(zzvh zzvhVar) {
                this();
            }

            public final zza zza(int i9) {
                zzi();
                ((zzb) this.zza).zza(i9);
                return this;
            }

            public final zza zza(zzuy zzuyVar) {
                zzi();
                ((zzb) this.zza).zza(zzuyVar);
                return this;
            }

            public final zza zza(zzuz zzuzVar) {
                zzi();
                ((zzb) this.zza).zza(zzuzVar);
                return this;
            }

            public final zza zza(zzvs zzvsVar) {
                zzi();
                ((zzb) this.zza).zza(zzvsVar);
                return this;
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzajc.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i9) {
            this.zzh = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzuy zzuyVar) {
            zzuyVar.getClass();
            this.zzf = zzuyVar;
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzuz zzuzVar) {
            this.zzg = zzuzVar.zza();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzvs zzvsVar) {
            this.zzi = zzvsVar.zza();
        }

        public static zza zzd() {
            return zzc.zzm();
        }

        public final int zza() {
            return this.zzh;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvg$zzb>] */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v18 */
        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
        public final Object zza(int i9, Object obj, Object obj2) {
            zzvh zzvhVar = null;
            switch (zzvh.zza[i9 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(zzvhVar);
                case 3:
                    return zzajc.zza(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzakw<zzb> zzakwVar = zzd;
                    Object obj3 = zzakwVar;
                    if (zzakwVar == null) {
                        synchronized (zzb.class) {
                            try {
                                zzakw<zzb> zzakwVar2 = zzd;
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

        public final zzuy zzb() {
            zzuy zzuyVar = this.zzf;
            return zzuyVar == null ? zzuy.zzd() : zzuyVar;
        }

        public final zzuz zzc() {
            zzuz zzuzVarZza = zzuz.zza(this.zzg);
            return zzuzVarZza == null ? zzuz.UNRECOGNIZED : zzuzVarZza;
        }

        public final zzvs zzf() {
            zzvs zzvsVarZza = zzvs.zza(this.zzi);
            return zzvsVarZza == null ? zzvs.UNRECOGNIZED : zzvsVarZza;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }
    }

    static {
        zzvg zzvgVar = new zzvg();
        zzc = zzvgVar;
        zzajc.zza((Class<zzvg>) zzvg.class, zzvgVar);
    }

    private zzvg() {
    }

    public static zzvg zza(InputStream inputStream, zzaio zzaioVar) throws IOException {
        return (zzvg) zzajc.zza(zzc, inputStream, zzaioVar);
    }

    public static zzvg zza(byte[] bArr, zzaio zzaioVar) throws zzaji {
        return (zzvg) zzajc.zza(zzc, bArr, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzb zzbVar) {
        zzbVar.getClass();
        zzajj<zzb> zzajjVar = this.zzf;
        if (!zzajjVar.zzc()) {
            this.zzf = zzajc.zza(zzajjVar);
        }
        this.zzf.add(zzbVar);
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(int i9) {
        this.zze = i9;
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final zzb zza(int i9) {
        return this.zzf.get(i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvg>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzvh zzvhVar = null;
        switch (zzvh.zza[i9 - 1]) {
            case 1:
                return new zzvg();
            case 2:
                return new zza(zzvhVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzb.class});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvg> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zzvg.class) {
                        try {
                            zzakw<zzvg> zzakwVar2 = zzd;
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

    public final int zzb() {
        return this.zze;
    }

    public final List<zzb> zze() {
        return this.zzf;
    }
}

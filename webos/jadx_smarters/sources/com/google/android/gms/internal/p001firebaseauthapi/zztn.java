package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zztn extends zzajc<zztn, zza> implements zzakp {
    private static final zztn zzc;
    private static volatile zzakw<zztn> zzd;
    private int zze;
    private zztq zzf;

    public static final class zza extends zzajc.zza<zztn, zza> implements zzakp {
        private zza() {
            super(zztn.zzc);
        }

        public /* synthetic */ zza(zzto zztoVar) {
            this();
        }

        public final zza zza(zztq zztqVar) {
            zzi();
            ((zztn) this.zza).zza(zztqVar);
            return this;
        }
    }

    static {
        zztn zztnVar = new zztn();
        zzc = zztnVar;
        zzajc.zza((Class<zztn>) zztn.class, zztnVar);
    }

    private zztn() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zztn zza(zzahp zzahpVar, zzaio zzaioVar) throws zzaji {
        return (zztn) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zztq zztqVar) {
        zztqVar.getClass();
        this.zzf = zztqVar;
        this.zze |= 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztn>] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzto zztoVar = null;
        switch (zzto.zza[i9 - 1]) {
            case 1:
                return new zztn();
            case 2:
                return new zza(zztoVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztn> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zztn.class) {
                        try {
                            zzakw<zztn> zzakwVar2 = zzd;
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

    public final zztq zzc() {
        zztq zztqVar = this.zzf;
        return zztqVar == null ? zztq.zze() : zztqVar;
    }
}

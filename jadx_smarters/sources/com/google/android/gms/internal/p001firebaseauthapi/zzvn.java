package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
public final class zzvn extends zzajc<zzvn, zza> implements zzakp {
    private static final zzvn zzc;
    private static volatile zzakw<zzvn> zzd;
    private String zze = "";

    public static final class zza extends zzajc.zza<zzvn, zza> implements zzakp {
        private zza() {
            super(zzvn.zzc);
        }

        public /* synthetic */ zza(zzvm zzvmVar) {
            this();
        }

        public final zza zza(String str) {
            zzi();
            ((zzvn) this.zza).zza(str);
            return this;
        }
    }

    static {
        zzvn zzvnVar = new zzvn();
        zzc = zzvnVar;
        zzajc.zza((Class<zzvn>) zzvn.class, zzvnVar);
    }

    private zzvn() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzvn zza(zzahp zzahpVar, zzaio zzaioVar) throws zzaji {
        return (zzvn) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str) {
        str.getClass();
        this.zze = str;
    }

    public static zzvn zzc() {
        return zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvn>] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajc
    public final Object zza(int i9, Object obj, Object obj2) {
        zzvm zzvmVar = null;
        switch (zzvm.zza[i9 - 1]) {
            case 1:
                return new zzvn();
            case 2:
                return new zza(zzvmVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvn> zzakwVar = zzd;
                Object obj3 = zzakwVar;
                if (zzakwVar == null) {
                    synchronized (zzvn.class) {
                        try {
                            zzakw<zzvn> zzakwVar2 = zzd;
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

    public final String zzd() {
        return this.zze;
    }
}

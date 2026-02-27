package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class zzgn {
    private static final zzxt zza;
    private static final zznz<zzgk, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzgl, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.firebase-auth-api.zzgo, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        zzxt zzxtVarZzb = zzpf.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zza = zzxtVarZzb;
        zzb = zznz.zza(new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgm
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzob
            public final zzov zza(zzch zzchVar) {
                return zzor.zzb((zzvb) ((zzajc) zzvb.zza().zza("type.googleapis.com/google.crypto.tink.KmsAeadKey").zza(((zzvn) ((zzajc) zzvn.zza().zza(((zzgk) zzchVar).zzb()).zzf())).zzi()).zza(zzvs.RAW).zzf()));
            }
        }, zzgk.class, zzor.class);
        zzc = zznv.zza(new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgp
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zznx
            public final zzch zza(zzov zzovVar) {
                return zzgn.zzb((zzor) zzovVar);
            }
        }, zzxtVarZzb, zzor.class);
        zzd = zzmx.zza(new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgo
        }, zzgl.class, zzos.class);
        zze = zzmu.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgr
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzmv
            public final zzbt zza(zzov zzovVar, zzcs zzcsVar) {
                return zzgn.zzb((zzos) zzovVar, zzcsVar);
            }
        }, zzxtVarZzb, zzos.class);
    }

    public static void zza() throws GeneralSecurityException {
        zznu zznuVarZza = zznu.zza();
        zznuVarZza.zza(zzb);
        zznuVarZza.zza(zzc);
        zznuVarZza.zza(zzd);
        zznuVarZza.zza(zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgk zzb(zzor zzorVar) throws GeneralSecurityException {
        if (!zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + zzorVar.zza().zzf());
        }
        try {
            zzvn zzvnVarZza = zzvn.zza(zzorVar.zza().zze(), zzaio.zza());
            if (zzorVar.zza().zzd() == zzvs.RAW) {
                return zzgk.zza(zzvnVarZza.zzd());
            }
            throw new GeneralSecurityException("Only key templates with RAW are accepted, but got " + String.valueOf(zzorVar.zza().zzd()) + " with format " + String.valueOf(zzvnVarZza));
        } catch (zzaji e9) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgl zzb(zzos zzosVar, zzcs zzcsVar) throws GeneralSecurityException {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        if (zzosVar.zzc() != zzvs.RAW) {
            throw new GeneralSecurityException("KmsAeadKey are only accepted with RAW, got " + String.valueOf(zzosVar.zzc()));
        }
        try {
            zzvk zzvkVarZza = zzvk.zza(zzosVar.zzd(), zzaio.zza());
            if (zzvkVarZza.zza() == 0) {
                return zzgl.zza(zzgk.zza(zzvkVarZza.zzd().zzd()));
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(zzvkVarZza));
        } catch (zzaji e9) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e9);
        }
    }
}

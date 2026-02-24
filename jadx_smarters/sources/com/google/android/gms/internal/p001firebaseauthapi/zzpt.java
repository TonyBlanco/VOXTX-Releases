package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzph;
import com.google.android.gms.internal.p001firebaseauthapi.zzpo;
import com.google.android.gms.internal.p001firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class zzpt {
    private static final zzxt zza;
    private static final zznz<zzpo, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzph, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.firebase-auth-api.zzmz, com.google.android.gms.internal.firebase-auth-api.zzpu] */
    static {
        zzxt zzxtVarZzb = zzpf.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zza = zzxtVarZzb;
        zzb = zznz.zza(new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzps
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzob
            public final zzov zza(zzch zzchVar) {
                return zzpt.zza((zzpo) zzchVar);
            }
        }, zzpo.class, zzor.class);
        zzc = zznv.zza(new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpv
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zznx
            public final zzch zza(zzov zzovVar) {
                return zzpt.zzb((zzor) zzovVar);
            }
        }, zzxtVarZzb, zzor.class);
        zzd = zzmx.zza(new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpu
        }, zzph.class, zzos.class);
        zze = zzmu.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpx
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzmv
            public final zzbt zza(zzov zzovVar, zzcs zzcsVar) {
                return zzpt.zzb((zzos) zzovVar, zzcsVar);
            }
        }, zzxtVarZzb, zzos.class);
    }

    public static /* synthetic */ zzor zza(zzpo zzpoVar) throws GeneralSecurityException {
        zzvs zzvsVar;
        zzvb.zza zzaVarZza = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.AesCmacKey").zza(((zzsa) ((zzajc) zzsa.zzb().zza((zzsb) ((zzajc) zzsb.zzb().zza(zzpoVar.zzb()).zzf())).zza(zzpoVar.zzc()).zzf())).zzi());
        zzpo.zzb zzbVarZze = zzpoVar.zze();
        if (zzpo.zzb.zza.equals(zzbVarZze)) {
            zzvsVar = zzvs.TINK;
        } else if (zzpo.zzb.zzb.equals(zzbVarZze)) {
            zzvsVar = zzvs.CRUNCHY;
        } else if (zzpo.zzb.zzd.equals(zzbVarZze)) {
            zzvsVar = zzvs.RAW;
        } else {
            if (!zzpo.zzb.zzc.equals(zzbVarZze)) {
                throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzbVarZze));
            }
            zzvsVar = zzvs.LEGACY;
        }
        return zzor.zzb((zzvb) ((zzajc) zzaVarZza.zza(zzvsVar).zzf()));
    }

    private static zzpo.zzb zza(zzvs zzvsVar) throws GeneralSecurityException {
        int i9 = zzpw.zza[zzvsVar.ordinal()];
        if (i9 == 1) {
            return zzpo.zzb.zza;
        }
        if (i9 == 2) {
            return zzpo.zzb.zzb;
        }
        if (i9 == 3) {
            return zzpo.zzb.zzc;
        }
        if (i9 == 4) {
            return zzpo.zzb.zzd;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzvsVar.zza());
    }

    public static void zza() throws GeneralSecurityException {
        zznu zznuVarZza = zznu.zza();
        zznuVarZza.zza(zzb);
        zznuVarZza.zza(zzc);
        zznuVarZza.zza(zzd);
        zznuVarZza.zza(zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzph zzb(zzos zzosVar, zzcs zzcsVar) throws GeneralSecurityException {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzrw zzrwVarZza = zzrw.zza(zzosVar.zzd(), zzaio.zza());
            if (zzrwVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return new zzph.zza().zza(zzpo.zzd().zza(zzrwVarZza.zze().zzb()).zzb(zzrwVarZza.zzd().zza()).zza(zza(zzosVar.zzc())).zza()).zza(zzxu.zza(zzrwVarZza.zze().zzg(), zzcs.zza(zzcsVar))).zza(zzosVar.zze()).zza();
        } catch (zzaji | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzpo zzb(zzor zzorVar) throws GeneralSecurityException {
        if (zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzsa zzsaVarZza = zzsa.zza(zzorVar.zza().zze(), zzaio.zza());
                return zzpo.zzd().zza(zzsaVarZza.zza()).zzb(zzsaVarZza.zzd().zza()).zza(zza(zzorVar.zza().zzd())).zza();
            } catch (zzaji e9) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e9);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + zzorVar.zza().zzf());
    }
}

package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzdw;
import com.google.android.gms.internal.p001firebaseauthapi.zzed;
import com.google.android.gms.internal.p001firebaseauthapi.zzsq;
import com.google.android.gms.internal.p001firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class zzef {
    private static final zzxt zza;
    private static final zznz<zzed, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzdw, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.firebase-auth-api.zzek, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        zzxt zzxtVarZzb = zzpf.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zza = zzxtVarZzb;
        zzb = zznz.zza(new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzei
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzob
            public final zzov zza(zzch zzchVar) {
                return zzef.zza((zzed) zzchVar);
            }
        }, zzed.class, zzor.class);
        zzc = zznv.zza(new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeh
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zznx
            public final zzch zza(zzov zzovVar) {
                return zzef.zzb((zzor) zzovVar);
            }
        }, zzxtVarZzb, zzor.class);
        zzd = zzmx.zza(new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzek
        }, zzdw.class, zzos.class);
        zze = zzmu.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzej
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzmv
            public final zzbt zza(zzov zzovVar, zzcs zzcsVar) {
                return zzef.zzb((zzos) zzovVar, zzcsVar);
            }
        }, zzxtVarZzb, zzos.class);
    }

    private static zzed.zzb zza(zzvs zzvsVar) throws GeneralSecurityException {
        int i9 = zzem.zza[zzvsVar.ordinal()];
        if (i9 == 1) {
            return zzed.zzb.zza;
        }
        if (i9 == 2 || i9 == 3) {
            return zzed.zzb.zzb;
        }
        if (i9 == 4) {
            return zzed.zzb.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzvsVar.zza());
    }

    public static /* synthetic */ zzor zza(zzed zzedVar) throws GeneralSecurityException {
        zzvs zzvsVar;
        zzvb.zza zzaVarZza = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzsq.zza zzaVarZzb = zzsq.zzb();
        if (zzedVar.zzd() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(zzedVar.zzd())));
        }
        zzvb.zza zzaVarZza2 = zzaVarZza.zza(((zzsq) ((zzajc) zzaVarZzb.zza((zzsr) ((zzajc) zzsr.zzb().zza(zzedVar.zzb()).zzf())).zza(zzedVar.zzc()).zzf())).zzi());
        zzed.zzb zzbVarZzf = zzedVar.zzf();
        if (zzed.zzb.zza.equals(zzbVarZzf)) {
            zzvsVar = zzvs.TINK;
        } else if (zzed.zzb.zzb.equals(zzbVarZzf)) {
            zzvsVar = zzvs.CRUNCHY;
        } else {
            if (!zzed.zzb.zzc.equals(zzbVarZzf)) {
                throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzbVarZzf));
            }
            zzvsVar = zzvs.RAW;
        }
        return zzor.zzb((zzvb) ((zzajc) zzaVarZza2.zza(zzvsVar).zzf()));
    }

    public static void zza() throws GeneralSecurityException {
        zznu zznuVarZza = zznu.zza();
        zznuVarZza.zza(zzb);
        zznuVarZza.zza(zzc);
        zznuVarZza.zza(zzd);
        zznuVarZza.zza(zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdw zzb(zzos zzosVar, zzcs zzcsVar) throws GeneralSecurityException {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzsn zzsnVarZza = zzsn.zza(zzosVar.zzd(), zzaio.zza());
            if (zzsnVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return new zzdw.zza().zza(zzed.zze().zzb(zzsnVarZza.zze().zzb()).zza(zzsnVarZza.zzd().zza()).zzc(16).zza(zza(zzosVar.zzc())).zza()).zza(zzxu.zza(zzsnVarZza.zze().zzg(), zzcs.zza(zzcsVar))).zza(zzosVar.zze()).zza();
        } catch (zzaji unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzed zzb(zzor zzorVar) throws GeneralSecurityException {
        if (zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzsq zzsqVarZza = zzsq.zza(zzorVar.zza().zze(), zzaio.zza());
                return zzed.zze().zzb(zzsqVarZza.zza()).zza(zzsqVarZza.zzd().zza()).zzc(16).zza(zza(zzorVar.zza().zzd())).zza();
            } catch (zzaji e9) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e9);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + zzorVar.zza().zzf());
    }
}

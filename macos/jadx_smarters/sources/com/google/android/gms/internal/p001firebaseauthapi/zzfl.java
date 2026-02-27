package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzfc;
import com.google.android.gms.internal.p001firebaseauthapi.zzfj;
import com.google.android.gms.internal.p001firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class zzfl {
    private static final zzxt zza;
    private static final zznz<zzfj, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzfc, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.firebase-auth-api.zzfq, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        zzxt zzxtVarZzb = zzpf.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zza = zzxtVarZzb;
        zzb = zznz.zza(new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfo
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzob
            public final zzov zza(zzch zzchVar) {
                return zzfl.zza((zzfj) zzchVar);
            }
        }, zzfj.class, zzor.class);
        zzc = zznv.zza(new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfn
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zznx
            public final zzch zza(zzov zzovVar) {
                return zzfl.zzb((zzor) zzovVar);
            }
        }, zzxtVarZzb, zzor.class);
        zzd = zzmx.zza(new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfq
        }, zzfc.class, zzos.class);
        zze = zzmu.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfp
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzmv
            public final zzbt zza(zzov zzovVar, zzcs zzcsVar) {
                return zzfl.zzb((zzos) zzovVar, zzcsVar);
            }
        }, zzxtVarZzb, zzos.class);
    }

    private static zzfj.zzb zza(zzvs zzvsVar) throws GeneralSecurityException {
        int i9 = zzfs.zza[zzvsVar.ordinal()];
        if (i9 == 1) {
            return zzfj.zzb.zza;
        }
        if (i9 == 2 || i9 == 3) {
            return zzfj.zzb.zzb;
        }
        if (i9 == 4) {
            return zzfj.zzb.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzvsVar.zza());
    }

    public static /* synthetic */ zzor zza(zzfj zzfjVar) throws GeneralSecurityException {
        zzvs zzvsVar;
        zzvb.zza zzaVarZza = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey").zza(((zzsz) ((zzajc) zzsz.zzc().zza(zzfjVar.zzb()).zzf())).zzi());
        zzfj.zzb zzbVarZzd = zzfjVar.zzd();
        if (zzfj.zzb.zza.equals(zzbVarZzd)) {
            zzvsVar = zzvs.TINK;
        } else if (zzfj.zzb.zzb.equals(zzbVarZzd)) {
            zzvsVar = zzvs.CRUNCHY;
        } else {
            if (!zzfj.zzb.zzc.equals(zzbVarZzd)) {
                throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzbVarZzd));
            }
            zzvsVar = zzvs.RAW;
        }
        return zzor.zzb((zzvb) ((zzajc) zzaVarZza.zza(zzvsVar).zzf()));
    }

    public static void zza() throws GeneralSecurityException {
        zznu zznuVarZza = zznu.zza();
        zznuVarZza.zza(zzb);
        zznuVarZza.zza(zzc);
        zznuVarZza.zza(zzd);
        zznuVarZza.zza(zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfc zzb(zzos zzosVar, zzcs zzcsVar) throws GeneralSecurityException {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzsy zzsyVarZza = zzsy.zza(zzosVar.zzd(), zzaio.zza());
            if (zzsyVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return new zzfc.zza().zza(zzfj.zzc().zza(zzsyVarZza.zzd().zzb()).zza(zza(zzosVar.zzc())).zza()).zza(zzxu.zza(zzsyVarZza.zzd().zzg(), zzcs.zza(zzcsVar))).zza(zzosVar.zze()).zza();
        } catch (zzaji unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfj zzb(zzor zzorVar) throws GeneralSecurityException {
        if (!zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + zzorVar.zza().zzf());
        }
        try {
            zzsz zzszVarZza = zzsz.zza(zzorVar.zza().zze(), zzaio.zza());
            if (zzszVarZza.zzb() == 0) {
                return zzfj.zzc().zza(zzszVarZza.zza()).zza(zza(zzorVar.zza().zzd())).zza();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzaji e9) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e9);
        }
    }
}

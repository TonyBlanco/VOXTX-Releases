package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzfv;
import com.google.android.gms.internal.p001firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class zzfx {
    private static final zzxt zza;
    private static final zznz<zzfv, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzfr, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.firebase-auth-api.zzgb, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        zzxt zzxtVarZzb = zzpf.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza = zzxtVarZzb;
        zzb = zznz.zza(new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfz
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzob
            public final zzov zza(zzch zzchVar) {
                return zzfx.zza((zzfv) zzchVar);
            }
        }, zzfv.class, zzor.class);
        zzc = zznv.zza(new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfy
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zznx
            public final zzch zza(zzov zzovVar) {
                return zzfx.zzb((zzor) zzovVar);
            }
        }, zzxtVarZzb, zzor.class);
        zzd = zzmx.zza(new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgb
        }, zzfr.class, zzos.class);
        zze = zzmu.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzga
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzmv
            public final zzbt zza(zzov zzovVar, zzcs zzcsVar) {
                return zzfx.zzb((zzos) zzovVar, zzcsVar);
            }
        }, zzxtVarZzb, zzos.class);
    }

    private static zzfv.zza zza(zzvs zzvsVar) throws GeneralSecurityException {
        int i9 = zzgd.zza[zzvsVar.ordinal()];
        if (i9 == 1) {
            return zzfv.zza.zza;
        }
        if (i9 == 2 || i9 == 3) {
            return zzfv.zza.zzb;
        }
        if (i9 == 4) {
            return zzfv.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzvsVar.zza());
    }

    public static /* synthetic */ zzor zza(zzfv zzfvVar) throws GeneralSecurityException {
        zzvs zzvsVar;
        zzvb.zza zzaVarZza = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").zza(zzth.zzb().zzi());
        zzfv.zza zzaVarZzb = zzfvVar.zzb();
        if (zzfv.zza.zza.equals(zzaVarZzb)) {
            zzvsVar = zzvs.TINK;
        } else if (zzfv.zza.zzb.equals(zzaVarZzb)) {
            zzvsVar = zzvs.CRUNCHY;
        } else {
            if (!zzfv.zza.zzc.equals(zzaVarZzb)) {
                throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzaVarZzb));
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
    public static zzfr zzb(zzos zzosVar, zzcs zzcsVar) throws GeneralSecurityException {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zztg zztgVarZza = zztg.zza(zzosVar.zzd(), zzaio.zza());
            if (zztgVarZza.zza() == 0) {
                return zzfr.zza(zza(zzosVar.zzc()), zzxu.zza(zztgVarZza.zzd().zzg(), zzcs.zza(zzcsVar)), zzosVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzaji unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfv zzb(zzor zzorVar) throws GeneralSecurityException {
        if (zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzth.zza(zzorVar.zza().zze(), zzaio.zza());
                return zzfv.zza(zza(zzorVar.zza().zzd()));
            } catch (zzaji e9) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e9);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + zzorVar.zza().zzf());
    }
}

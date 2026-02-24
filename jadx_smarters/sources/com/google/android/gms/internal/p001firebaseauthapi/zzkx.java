package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
final class zzkx {
    public static zzwo zza(zzty zztyVar) throws GeneralSecurityException {
        int i9 = zzkw.zzb[zztyVar.ordinal()];
        if (i9 == 1) {
            return zzwo.NIST_P256;
        }
        if (i9 == 2) {
            return zzwo.NIST_P384;
        }
        if (i9 == 3) {
            return zzwo.NIST_P521;
        }
        throw new GeneralSecurityException("unknown curve type: " + String.valueOf(zztyVar));
    }

    public static zzwr zza(zztk zztkVar) throws GeneralSecurityException {
        int i9 = zzkw.zzc[zztkVar.ordinal()];
        if (i9 == 1) {
            return zzwr.UNCOMPRESSED;
        }
        if (i9 == 2) {
            return zzwr.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (i9 == 3) {
            return zzwr.COMPRESSED;
        }
        throw new GeneralSecurityException("unknown point format: " + String.valueOf(zztkVar));
    }

    public static String zza(zzub zzubVar) throws NoSuchAlgorithmException {
        int i9 = zzkw.zza[zzubVar.ordinal()];
        if (i9 == 1) {
            return "HmacSha1";
        }
        if (i9 == 2) {
            return "HmacSha224";
        }
        if (i9 == 3) {
            return "HmacSha256";
        }
        if (i9 == 4) {
            return "HmacSha384";
        }
        if (i9 == 5) {
            return "HmacSha512";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + String.valueOf(zzubVar));
    }

    public static void zza(zztq zztqVar) throws GeneralSecurityException {
        zzwp.zza(zza(zztqVar.zzf().zzd()));
        zza(zztqVar.zzf().zze());
        if (zztqVar.zza() == zztk.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        zzct.zza(zztqVar.zzb().zzd());
    }
}

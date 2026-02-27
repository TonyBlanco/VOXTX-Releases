package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlt {
    private static final byte[] zzn;
    private static final byte[] zzo;
    private static final byte[] zzp;
    public static final byte[] zza = zza(1, 0);
    private static final byte[] zzm = zza(1, 2);
    public static final byte[] zzb = zza(2, 32);
    public static final byte[] zzc = zza(2, 16);
    public static final byte[] zzd = zza(2, 17);
    public static final byte[] zze = zza(2, 18);
    public static final byte[] zzf = zza(2, 1);
    public static final byte[] zzg = zza(2, 2);
    public static final byte[] zzh = zza(2, 3);
    public static final byte[] zzi = zza(2, 1);
    public static final byte[] zzj = zza(2, 2);
    public static final byte[] zzk = zza(2, 3);
    public static final byte[] zzl = new byte[0];

    static {
        Charset charset = zzpf.zza;
        zzn = "KEM".getBytes(charset);
        zzo = "HPKE".getBytes(charset);
        zzp = "HPKE-v1".getBytes(charset);
    }

    public static int zza(zzuo zzuoVar) throws GeneralSecurityException {
        int i9 = zzls.zza[zzuoVar.ordinal()];
        if (i9 == 1) {
            return 32;
        }
        if (i9 == 2) {
            return 48;
        }
        if (i9 == 3) {
            return 66;
        }
        if (i9 == 4) {
            return 32;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static void zza(zzur zzurVar) throws GeneralSecurityException {
        if (zzurVar.zzc() == zzuo.KEM_UNKNOWN || zzurVar.zzc() == zzuo.UNRECOGNIZED) {
            throw new GeneralSecurityException("Invalid KEM param: " + zzurVar.zzc().name());
        }
        if (zzurVar.zzb() == zzum.KDF_UNKNOWN || zzurVar.zzb() == zzum.UNRECOGNIZED) {
            throw new GeneralSecurityException("Invalid KDF param: " + zzurVar.zzb().name());
        }
        if (zzurVar.zza() == zzuk.AEAD_UNKNOWN || zzurVar.zza() == zzuk.UNRECOGNIZED) {
            throw new GeneralSecurityException("Invalid AEAD param: " + zzurVar.zza().name());
        }
    }

    private static byte[] zza(int i9, int i10) {
        byte[] bArr = new byte[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            bArr[i11] = (byte) (i10 >> (((i9 - i11) - 1) * 8));
        }
        return bArr;
    }

    public static byte[] zza(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzwg.zza(zzp, bArr2, str.getBytes(zzpf.zza), bArr);
    }

    public static byte[] zza(String str, byte[] bArr, byte[] bArr2, int i9) throws GeneralSecurityException {
        return zzwg.zza(zza(2, i9), zzp, bArr2, str.getBytes(zzpf.zza), bArr);
    }

    public static byte[] zza(byte[] bArr) throws GeneralSecurityException {
        return zzwg.zza(zzn, bArr);
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return zzwg.zza(zzo, bArr, bArr2, bArr3);
    }

    public static int zzb(zzuo zzuoVar) throws GeneralSecurityException {
        int i9 = zzls.zza[zzuoVar.ordinal()];
        if (i9 == 1) {
            return 65;
        }
        if (i9 == 2) {
            return 97;
        }
        if (i9 == 3) {
            return 133;
        }
        if (i9 == 4) {
            return 32;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static zzwo zzc(zzuo zzuoVar) throws GeneralSecurityException {
        int i9 = zzls.zza[zzuoVar.ordinal()];
        if (i9 == 1) {
            return zzwo.NIST_P256;
        }
        if (i9 == 2) {
            return zzwo.NIST_P384;
        }
        if (i9 == 3) {
            return zzwo.NIST_P521;
        }
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }
}

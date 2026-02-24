package com.google.android.gms.internal.p001firebaseauthapi;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class zzxl implements zzrx {
    private static final zzif.zza zza = zzif.zza.zza;
    private final SecretKey zzb;
    private byte[] zzc;
    private byte[] zzd;

    public zzxl(byte[] bArr) throws GeneralSecurityException {
        zzxo.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        this.zzb = secretKeySpec;
        Cipher cipherZza = zza();
        cipherZza.init(1, secretKeySpec);
        byte[] bArrZzb = zzrd.zzb(cipherZza.doFinal(new byte[16]));
        this.zzc = bArrZzb;
        this.zzd = zzrd.zzb(bArrZzb);
    }

    private static Cipher zza() throws GeneralSecurityException {
        if (zza.zza()) {
            return zzwt.zza.zza("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzrx
    public final byte[] zza(byte[] bArr, int i9) throws GeneralSecurityException {
        if (i9 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherZza = zza();
        cipherZza.init(1, this.zzb);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        byte[] bArrZza = (iMax << 4) == bArr.length ? zzwg.zza(bArr, (iMax - 1) << 4, this.zzc, 0, 16) : zzwg.zza(zzrd.zza(Arrays.copyOfRange(bArr, (iMax - 1) << 4, bArr.length)), this.zzd);
        byte[] bArrDoFinal = new byte[16];
        for (int i10 = 0; i10 < iMax - 1; i10++) {
            bArrDoFinal = cipherZza.doFinal(zzwg.zza(bArrDoFinal, 0, bArr, i10 << 4, 16));
        }
        return Arrays.copyOf(cipherZza.doFinal(zzwg.zza(bArrZza, bArrDoFinal)), i9);
    }
}

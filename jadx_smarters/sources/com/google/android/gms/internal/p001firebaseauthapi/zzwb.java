package com.google.android.gms.internal.p001firebaseauthapi;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwb implements zzxi {
    private static final zzif.zza zza = zzif.zza.zzb;
    private static final ThreadLocal<Cipher> zzb = new zzwa();
    private final SecretKeySpec zzc;
    private final int zzd;
    private final int zze;

    public zzwb(byte[] bArr, int i9) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzxo.zza(bArr.length);
        this.zzc = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        int blockSize = zzb.get().getBlockSize();
        this.zze = blockSize;
        if (i9 < 12 || i9 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.zzd = i9;
    }

    private final void zza(byte[] bArr, int i9, int i10, byte[] bArr2, int i11, byte[] bArr3, boolean z9) throws GeneralSecurityException {
        Cipher cipher = zzb.get();
        byte[] bArr4 = new byte[this.zze];
        System.arraycopy(bArr3, 0, bArr4, 0, this.zzd);
        cipher.init(z9 ? 1 : 2, this.zzc, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i9, i10, bArr2, i11) != i10) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzxi
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i9 = this.zzd;
        if (length < i9) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, 0, bArr2, 0, i9);
        int length2 = bArr.length;
        int i10 = this.zzd;
        byte[] bArr3 = new byte[length2 - i10];
        zza(bArr, i10, bArr.length - i10, bArr3, 0, bArr2, false);
        return bArr3;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzxi
    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i9 = this.zzd;
        if (length > a.e.API_PRIORITY_OTHER - i9) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (a.e.API_PRIORITY_OTHER - this.zzd));
        }
        byte[] bArr2 = new byte[bArr.length + i9];
        byte[] bArrZza = zzou.zza(i9);
        System.arraycopy(bArrZza, 0, bArr2, 0, this.zzd);
        zza(bArr, 0, bArr.length, bArr2, this.zzd, bArrZza, true);
        return bArr2;
    }
}

package com.google.android.gms.internal.p001firebaseauthapi;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class zzie implements zzbg {
    private static final ThreadLocal<Cipher> zza = new zzid();
    private static final boolean zzb = zza();
    private final SecretKey zzc;
    private final byte[] zzd;

    public zzie(byte[] bArr) throws GeneralSecurityException {
        this(bArr, new byte[0]);
    }

    private zzie(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.zzd = bArr2;
        zzxo.zza(bArr.length);
        this.zzc = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
    }

    private static AlgorithmParameterSpec zza(byte[] bArr, int i9, int i10) throws GeneralSecurityException {
        if (zzb) {
            return new GCMParameterSpec(128, bArr, 0, i10);
        }
        if (zzxp.zza()) {
            return new IvParameterSpec(bArr, 0, i10);
        }
        throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
    }

    private static boolean zza() {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecZza = zza(bArr, 0, 12);
        ThreadLocal<Cipher> threadLocal = zza;
        threadLocal.get().init(2, this.zzc, algorithmParameterSpecZza);
        if (bArr2 != null && bArr2.length != 0) {
            threadLocal.get().updateAAD(bArr2);
        }
        return threadLocal.get().doFinal(bArr, 12, bArr.length - 12);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        if (bArr3.length == 0) {
            return zzc(bArr, bArr2);
        }
        if (zzpf.zza(bArr3, bArr)) {
            return zzc(Arrays.copyOfRange(bArr, this.zzd.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrZza = zzou.zza(12);
        System.arraycopy(bArrZza, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecZza = zza(bArrZza, 0, bArrZza.length);
        ThreadLocal<Cipher> threadLocal = zza;
        threadLocal.get().init(1, this.zzc, algorithmParameterSpecZza);
        if (bArr2 != null && bArr2.length != 0) {
            threadLocal.get().updateAAD(bArr2);
        }
        int iDoFinal = threadLocal.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal != bArr.length + 16) {
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr.length)));
        }
        byte[] bArr4 = this.zzd;
        return bArr4.length == 0 ? bArr3 : zzwg.zza(bArr4, bArr3);
    }
}

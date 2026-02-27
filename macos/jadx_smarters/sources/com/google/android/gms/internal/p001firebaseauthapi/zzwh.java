package com.google.android.gms.internal.p001firebaseauthapi;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwh implements zzbp {
    private static final zzif.zza zza = zzif.zza.zza;
    private static final Collection<Integer> zzb = Arrays.asList(64);
    private static final byte[] zzc = new byte[16];
    private static final byte[] zzd = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    private final zzxl zze;
    private final byte[] zzf;
    private final byte[] zzg;

    public zzwh(byte[] bArr) throws GeneralSecurityException {
        this(bArr, zzxt.zza(new byte[0]));
    }

    private zzwh(byte[] bArr, zzxt zzxtVar) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (zzb.contains(Integer.valueOf(bArr.length))) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.zzf = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.zze = new zzxl(bArrCopyOfRange);
            this.zzg = zzxtVar.zzb();
            return;
        }
        throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzbp
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZza;
        int length = bArr.length;
        byte[] bArr3 = this.zzg;
        if (length < bArr3.length + 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        if (!zzpf.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipherZza = zzwt.zza.zza("AES/CTR/NoPadding");
        byte[] bArr4 = this.zzg;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr4.length + 16);
        byte[] bArr5 = (byte[]) bArrCopyOfRange.clone();
        bArr5[8] = (byte) (bArr5[8] & 127);
        bArr5[12] = (byte) (bArr5[12] & 127);
        cipherZza.init(2, new SecretKeySpec(this.zzf, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(bArr5));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, this.zzg.length + 16, bArr.length);
        byte[] bArrDoFinal = cipherZza.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && zzxp.zza()) {
            bArrDoFinal = new byte[0];
        }
        byte[][] bArr6 = {bArr2, bArrDoFinal};
        byte[] bArrZza2 = this.zze.zza(zzc, 16);
        for (int i9 = 0; i9 <= 0; i9++) {
            byte[] bArr7 = bArr6[i9];
            if (bArr7 == null) {
                bArr7 = new byte[0];
            }
            bArrZza2 = zzwg.zza(zzrd.zzb(bArrZza2), this.zze.zza(bArr7, 16));
        }
        byte[] bArr8 = bArr6[1];
        if (bArr8.length < 16) {
            bArrZza = zzwg.zza(zzrd.zza(bArr8), zzrd.zzb(bArrZza2));
        } else {
            if (bArr8.length < bArrZza2.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr8.length - bArrZza2.length;
            bArrZza = Arrays.copyOf(bArr8, bArr8.length);
            for (int i10 = 0; i10 < bArrZza2.length; i10++) {
                int i11 = length2 + i10;
                bArrZza[i11] = (byte) (bArrZza[i11] ^ bArrZza2[i10]);
            }
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, this.zze.zza(bArrZza, 16))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }
}

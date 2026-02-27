package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class bio implements azr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21508a = bch.f21049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Collection f21509b = Arrays.asList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f21510c = new byte[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bja f21511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f21512e;

    public bio(byte[] bArr) throws GeneralSecurityException {
        if (!bch.a(f21508a)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        Collection collection = f21509b;
        int length = bArr.length;
        if (collection.contains(Integer.valueOf(length))) {
            int i9 = length >> 1;
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i9);
            this.f21512e = Arrays.copyOfRange(bArr, i9, length);
            this.f21511d = new bja(bArrCopyOfRange);
            return;
        }
        throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azr
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZ;
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) biv.f21524a.a("AES/CTR/NoPadding");
        byte[][] bArr3 = {bArr2, bArr};
        byte[] bArrA = this.f21511d.a(f21510c, 16);
        for (int i9 = 0; i9 <= 0; i9++) {
            byte[] bArr4 = bArr3[i9];
            if (bArr4 == null) {
                bArr4 = new byte[0];
            }
            bArrA = bjh.z(com.google.ads.interactivemedia.v3.impl.data.ag.b(bArrA), this.f21511d.a(bArr4, 16));
        }
        byte[] bArr5 = bArr3[1];
        int length = bArr5.length;
        if (length >= 16) {
            int length2 = bArrA.length;
            if (length < length2) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int i10 = length - length2;
            bArrZ = Arrays.copyOf(bArr5, length);
            for (int i11 = 0; i11 < bArrA.length; i11++) {
                int i12 = i10 + i11;
                bArrZ[i12] = (byte) (bArrZ[i12] ^ bArrA[i11]);
            }
        } else {
            bArrZ = bjh.z(com.google.ads.interactivemedia.v3.impl.data.ag.a(bArr5), com.google.ads.interactivemedia.v3.impl.data.ag.b(bArrA));
        }
        byte[] bArrA2 = this.f21511d.a(bArrZ, 16);
        byte[] bArr6 = (byte[]) bArrA2.clone();
        bArr6[8] = (byte) (bArr6[8] & 127);
        bArr6[12] = (byte) (bArr6[12] & 127);
        cipher.init(1, new SecretKeySpec(this.f21512e, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(bArr6));
        return bjh.y(bArrA2, cipher.doFinal(bArr));
    }
}

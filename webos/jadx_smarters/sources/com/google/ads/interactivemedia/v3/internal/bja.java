package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class bja implements bgd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21543a = bch.f21049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SecretKey f21544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f21545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f21546d;

    public bja(byte[] bArr) throws GeneralSecurityException {
        bjg.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        this.f21544b = secretKeySpec;
        Cipher cipherB = b();
        cipherB.init(1, secretKeySpec);
        byte[] bArrB = com.google.ads.interactivemedia.v3.impl.data.ag.b(cipherB.doFinal(new byte[16]));
        this.f21545c = bArrB;
        this.f21546d = com.google.ads.interactivemedia.v3.impl.data.ag.b(bArrB);
    }

    private static Cipher b() throws GeneralSecurityException {
        if (bch.a(f21543a)) {
            return (Cipher) biv.f21524a.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bgd
    public final byte[] a(byte[] bArr, int i9) throws GeneralSecurityException {
        if (i9 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherB = b();
        cipherB.init(1, this.f21544b);
        int length = bArr.length;
        int iMax = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
        byte[] bArrA = iMax * 16 == length ? bjh.A(bArr, (iMax - 1) * 16, this.f21545c, 0, 16) : bjh.z(com.google.ads.interactivemedia.v3.impl.data.ag.a(Arrays.copyOfRange(bArr, (iMax - 1) * 16, length)), this.f21546d);
        byte[] bArrDoFinal = new byte[16];
        for (int i10 = 0; i10 < iMax - 1; i10++) {
            bArrDoFinal = cipherB.doFinal(bjh.A(bArrDoFinal, 0, bArr, i10 * 16, 16));
        }
        return Arrays.copyOf(cipherB.doFinal(bjh.z(bArrA, bArrDoFinal)), i9);
    }
}

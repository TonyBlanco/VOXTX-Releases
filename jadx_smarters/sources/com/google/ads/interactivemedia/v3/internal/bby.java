package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class bby {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21031a = bch.f21050b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f21032b = new bbx();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SecretKey f21033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21034d;

    public bby(byte[] bArr, boolean z9) throws GeneralSecurityException {
        if (!bch.a(f21031a)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        bjg.a(bArr.length);
        this.f21033c = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        this.f21034d = z9;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        int length = bArr2.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        boolean z9 = this.f21034d;
        byte[] bArr3 = new byte[z9 ? length + 28 : length + 16];
        if (z9) {
            System.arraycopy(bArr, 0, bArr3, 0, 12);
        }
        AlgorithmParameterSpec gCMParameterSpec = (!bjh.f() || com.google.ads.interactivemedia.v3.impl.data.p.b().intValue() > 19) ? new GCMParameterSpec(128, bArr, 0, 12) : new IvParameterSpec(bArr, 0, 12);
        ThreadLocal threadLocal = f21032b;
        ((Cipher) threadLocal.get()).init(1, this.f21033c, gCMParameterSpec);
        int iDoFinal = ((Cipher) threadLocal.get()).doFinal(bArr2, 0, length, bArr3, true != this.f21034d ? 0 : 12);
        if (iDoFinal == length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - length)));
    }
}

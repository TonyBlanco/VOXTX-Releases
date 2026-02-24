package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.common.api.a;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class bij implements biz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21494a = bch.f21050b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f21495b = new bii();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SecretKeySpec f21496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21498e;

    public bij(byte[] bArr, int i9) throws GeneralSecurityException {
        if (!bch.a(f21494a)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        bjg.a(bArr.length);
        this.f21496c = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        int blockSize = ((Cipher) f21495b.get()).getBlockSize();
        this.f21498e = blockSize;
        if (i9 < 12 || i9 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f21497d = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.biz
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i9 = this.f21497d;
        if (length > a.e.API_PRIORITY_OTHER - i9) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (a.e.API_PRIORITY_OTHER - this.f21497d));
        }
        byte[] bArr2 = new byte[i9 + length];
        byte[] bArrB = bjf.b(i9);
        System.arraycopy(bArrB, 0, bArr2, 0, this.f21497d);
        int i10 = this.f21497d;
        Cipher cipher = (Cipher) f21495b.get();
        byte[] bArr3 = new byte[this.f21498e];
        System.arraycopy(bArrB, 0, bArr3, 0, this.f21497d);
        cipher.init(1, this.f21496c, new IvParameterSpec(bArr3));
        if (cipher.doFinal(bArr, 0, length, bArr2, i10) == length) {
            return bArr2;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}

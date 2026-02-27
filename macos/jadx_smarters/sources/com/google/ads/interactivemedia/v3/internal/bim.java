package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class bim implements azo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21499a = bch.f21049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f21500b = new bik();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal f21501c = new bil();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f21502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f21503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SecretKeySpec f21504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21505g;

    public bim(byte[] bArr, int i9) throws GeneralSecurityException {
        if (!bch.a(f21499a)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i9 != 12 && i9 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f21505g = i9;
        bjg.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        this.f21504f = secretKeySpec;
        Cipher cipher = (Cipher) f21500b.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrB = b(cipher.doFinal(new byte[16]));
        this.f21502d = bArrB;
        this.f21503e = b(bArrB);
    }

    private static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i9 = 0;
        while (i9 < 15) {
            byte b9 = bArr[i9];
            int i10 = i9 + 1;
            bArr2[i9] = (byte) (((b9 + b9) ^ ((bArr[i10] & 255) >>> 7)) & 255);
            i9 = i10;
        }
        byte b10 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b10 + b10));
        return bArr2;
    }

    private final byte[] c(Cipher cipher, int i9, byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException {
        int length;
        byte[] bArrD;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i9;
        if (i11 == 0) {
            return cipher.doFinal(d(bArr2, this.f21502d));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i12 = 0;
        int i13 = 0;
        while (i11 - i13 > 16) {
            for (int i14 = 0; i14 < 16; i14++) {
                bArrDoFinal[i14] = (byte) (bArrDoFinal[i14] ^ bArr[(i10 + i13) + i14]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i13 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i13 + i10, i10 + i11);
        if (bArrCopyOfRange.length == 16) {
            bArrD = d(bArrCopyOfRange, this.f21502d);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.f21503e, 16);
            while (true) {
                length = bArrCopyOfRange.length;
                if (i12 >= length) {
                    break;
                }
                bArrCopyOf[i12] = (byte) (bArrCopyOf[i12] ^ bArrCopyOfRange[i12]);
                i12++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
            bArrD = bArrCopyOf;
        }
        return cipher.doFinal(d(bArrDoFinal, bArrD));
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i9 = 0; i9 < length; i9++) {
            bArr3[i9] = (byte) (bArr[i9] ^ bArr2[i9]);
        }
        return bArr3;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azo
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i9 = this.f21505g;
        if (length > 2147483631 - i9) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[i9 + length + 16];
        byte[] bArrB = bjf.b(i9);
        System.arraycopy(bArrB, 0, bArr3, 0, this.f21505g);
        Cipher cipher = (Cipher) f21500b.get();
        cipher.init(1, this.f21504f);
        byte[] bArrC = c(cipher, 0, bArrB, 0, bArrB.length);
        byte[] bArrC2 = c(cipher, 1, bArr2, 0, 0);
        Cipher cipher2 = (Cipher) f21501c.get();
        cipher2.init(1, this.f21504f, new IvParameterSpec(bArrC));
        cipher2.doFinal(bArr, 0, length, bArr3, this.f21505g);
        byte[] bArrC3 = c(cipher, 2, bArr3, this.f21505g, length);
        int i10 = length + this.f21505g;
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[i10 + i11] = (byte) ((bArrC2[i11] ^ bArrC[i11]) ^ bArrC3[i11]);
        }
        return bArr3;
    }
}

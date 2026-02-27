package com.google.ads.interactivemedia.v3.internal;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class bdg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f21087a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bdf f21088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BigInteger f21089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f21090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f21091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f21092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f21093g = BigInteger.ZERO;

    private bdg(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, bdf bdfVar) {
        this.f21092f = bArr;
        this.f21090d = bArr2;
        this.f21091e = bArr3;
        this.f21089c = bigInteger;
        this.f21088b = bdfVar;
    }

    public static bdg c(byte[] bArr, byte[] bArr2, bdj bdjVar, bde bdeVar, bdf bdfVar, byte[] bArr3) throws GeneralSecurityException {
        byte[] bArrB = bdr.b(bdjVar.b(), bdeVar.b(), bdfVar.b());
        byte[] bArr4 = bdr.f21112l;
        byte[] bArr5 = f21087a;
        byte[] bArrY = bjh.y(bdr.f21101a, bdeVar.d(bArr4, bArr5, "psk_id_hash", bArrB), bdeVar.d(bArr4, bArr3, "info_hash", bArrB));
        byte[] bArrD = bdeVar.d(bArr2, bArr5, "secret", bArrB);
        byte[] bArrC = bdeVar.c(bArrD, bArrY, "key", bArrB, bdfVar.a());
        byte[] bArrC2 = bdeVar.c(bArrD, bArrY, "base_nonce", bArrB, 12);
        BigInteger bigInteger = BigInteger.ONE;
        return new bdg(bArr, bArrC, bArrC2, bigInteger.shiftLeft(96).subtract(bigInteger), bdfVar);
    }

    private final synchronized byte[] d() throws GeneralSecurityException {
        byte[] bArrZ;
        try {
            byte[] bArr = this.f21091e;
            byte[] byteArray = this.f21093g.toByteArray();
            int length = byteArray.length;
            if (length != 12) {
                if (length > 13) {
                    throw new GeneralSecurityException("integer too large");
                }
                if (length != 13) {
                    byte[] bArr2 = new byte[12];
                    System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                    byteArray = bArr2;
                } else {
                    if (byteArray[0] != 0) {
                        throw new GeneralSecurityException("integer too large");
                    }
                    byteArray = Arrays.copyOfRange(byteArray, 1, 13);
                }
            }
            bArrZ = bjh.z(bArr, byteArray);
            if (this.f21093g.compareTo(this.f21089c) >= 0) {
                throw new GeneralSecurityException("message limit reached");
            }
            this.f21093g = this.f21093g.add(BigInteger.ONE);
        } catch (Throwable th) {
            throw th;
        }
        return bArrZ;
    }

    public final byte[] a() {
        return this.f21092f;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f21088b.c(this.f21090d, d(), bArr, bArr2);
    }
}

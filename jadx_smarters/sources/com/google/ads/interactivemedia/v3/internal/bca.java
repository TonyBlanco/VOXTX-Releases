package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes3.dex */
abstract class bca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int[] f21042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21043b;

    public bca(byte[] bArr, int i9) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f21042a = bbw.d(bArr);
        this.f21043b = i9;
    }

    public abstract int a();

    public abstract int[] b(int[] iArr, int i9);

    public final ByteBuffer c(byte[] bArr, int i9) {
        int[] iArrB = b(bbw.d(bArr), i9);
        int[] iArr = (int[]) iArrB.clone();
        bbw.c(iArr);
        for (int i10 = 0; i10 < 16; i10++) {
            iArrB[i10] = iArrB[i10] + iArr[i10];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }

    public final void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
        if (bArr.length != a()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + a());
        }
        int iRemaining = byteBufferWrap.remaining();
        int i9 = iRemaining / 64;
        int i10 = i9 + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            ByteBuffer byteBufferC = c(bArr, this.f21043b + i11);
            int i12 = 64;
            if (i11 == i9) {
                i12 = iRemaining % 64;
            }
            bjh.w(byteBuffer, byteBufferWrap, byteBufferC, i12);
        }
    }
}

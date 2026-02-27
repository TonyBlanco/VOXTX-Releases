package com.google.ads.interactivemedia.v3.internal;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class bcd extends bca {
    public bcd(byte[] bArr, int i9) throws InvalidKeyException {
        super(bArr, i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bca
    public final int a() {
        return 24;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bca
    public final int[] b(int[] iArr, int i9) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        bbw.b(iArr3, this.f21042a);
        iArr3[12] = iArr[0];
        iArr3[13] = iArr[1];
        iArr3[14] = iArr[2];
        iArr3[15] = iArr[3];
        bbw.c(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        bbw.b(iArr2, Arrays.copyOf(iArr3, 8));
        iArr2[12] = i9;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}

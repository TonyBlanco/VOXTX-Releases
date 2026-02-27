package com.google.ads.interactivemedia.v3.internal;

import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes3.dex */
public final class bbz extends bca {
    public bbz(byte[] bArr, int i9) throws InvalidKeyException {
        super(bArr, i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bca
    public final int a() {
        return 12;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bca
    public final int[] b(int[] iArr, int i9) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        bbw.b(iArr2, this.f21042a);
        iArr2[12] = i9;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}

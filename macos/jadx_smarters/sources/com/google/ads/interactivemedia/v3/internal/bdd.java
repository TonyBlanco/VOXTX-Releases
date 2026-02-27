package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes3.dex */
final class bdd implements bdf {
    @Override // com.google.ads.interactivemedia.v3.internal.bdf
    public final int a() {
        return 32;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bdf
    public final byte[] b() {
        return bdr.f21111k;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bdf
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == 32) {
            return new bcb(bArr).c(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes3.dex */
final class bdc implements bdf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21085a;

    public bdc(int i9) throws InvalidAlgorithmParameterException {
        if (i9 == 16 || i9 == 32) {
            this.f21085a = i9;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bdf
    public final int a() {
        return this.f21085a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bdf
    public final byte[] b() throws GeneralSecurityException {
        int i9 = this.f21085a;
        if (i9 == 16) {
            return bdr.f21109i;
        }
        if (i9 == 32) {
            return bdr.f21110j;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bdf
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        int length = bArr.length;
        if (length == this.f21085a) {
            return new bby(bArr, false).a(bArr2, bArr3);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }
}

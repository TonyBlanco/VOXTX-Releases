package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class bdt implements bdj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bde f21118a;

    public bdt(bde bdeVar) {
        this.f21118a = bdeVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bdj
    public final bdk a(byte[] bArr) throws GeneralSecurityException {
        byte[] bArrB = bjh.b();
        byte[] bArrA = bjh.a(bArrB, bArr);
        byte[] bArrC = bjh.c(bArrB);
        byte[] bArrY = bjh.y(bArrC, bArr);
        byte[] bArrD = bdr.d(bdr.f21102b);
        bde bdeVar = this.f21118a;
        return new bdk(bdeVar.e(bArrA, bArrY, bArrD, bdeVar.a()), bArrC);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bdj
    public final byte[] b() throws GeneralSecurityException {
        if (Arrays.equals(this.f21118a.b(), bdr.f21106f)) {
            return bdr.f21102b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}

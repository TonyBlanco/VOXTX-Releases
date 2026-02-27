package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: loaded from: classes3.dex */
final class bds implements bdj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bde f21116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21117b;

    private bds(bde bdeVar, int i9) {
        this.f21116a = bdeVar;
        this.f21117b = i9;
    }

    public static bds c(int i9) throws GeneralSecurityException {
        int i10 = i9 - 1;
        return i10 != 0 ? i10 != 1 ? new bds(new bde("HmacSha512"), 3) : new bds(new bde("HmacSha384"), 2) : new bds(new bde("HmacSha256"), 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bdj
    public final bdk a(byte[] bArr) throws GeneralSecurityException {
        KeyPair keyPairP = bjh.p(this.f21117b);
        byte[] bArrO = bjh.o((ECPrivateKey) keyPairP.getPrivate(), bjh.r(this.f21117b, 1, bArr));
        byte[] bArrU = bjh.u(this.f21117b, 1, ((ECPublicKey) keyPairP.getPublic()).getW());
        byte[] bArrY = bjh.y(bArrU, bArr);
        byte[] bArrD = bdr.d(b());
        bde bdeVar = this.f21116a;
        return new bdk(bdeVar.e(bArrO, bArrY, bArrD, bdeVar.a()), bArrU);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bdj
    public final byte[] b() throws GeneralSecurityException {
        int i9 = this.f21117b - 1;
        return i9 != 0 ? i9 != 1 ? bdr.f21105e : bdr.f21104d : bdr.f21103c;
    }
}

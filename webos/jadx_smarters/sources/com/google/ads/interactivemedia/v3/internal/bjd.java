package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes3.dex */
public final class bjd implements bag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bgd f21553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21554b;

    public bjd(bgd bgdVar, int i9) throws GeneralSecurityException {
        this.f21553a = bgdVar;
        this.f21554b = i9;
        if (i9 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        bgdVar.a(new byte[0], i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bag
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        return this.f21553a.a(bArr, this.f21554b);
    }
}

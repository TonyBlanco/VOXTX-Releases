package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class bin implements azo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21506a = bch.f21050b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bby f21507b;

    public bin(byte[] bArr) throws GeneralSecurityException {
        if (!bch.a(f21506a)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f21507b = new bby(bArr, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azo
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f21507b.a(bjf.b(12), bArr);
    }
}

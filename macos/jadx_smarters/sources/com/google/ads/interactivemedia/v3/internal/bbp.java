package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class bbp implements azo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f21025a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bht f21026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final azo f21027c;

    public bbp(bht bhtVar, azo azoVar) {
        this.f21026b = bhtVar;
        this.f21027c = azoVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azo
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrAv = bao.c(this.f21026b).av();
        byte[] bArrA = this.f21027c.a(bArrAv, f21025a);
        byte[] bArrA2 = ((azo) bao.h(this.f21026b.e(), bArrAv, azo.class)).a(bArr, bArr2);
        int length = bArrA.length;
        return ByteBuffer.allocate(length + 4 + bArrA2.length).putInt(length).put(bArrA).put(bArrA2).array();
    }
}

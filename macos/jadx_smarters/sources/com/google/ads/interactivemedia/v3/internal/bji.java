package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class bji implements azo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bce f21556a;

    public bji(byte[] bArr) throws GeneralSecurityException {
        this.f21556a = new bce(bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azo
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] bArrB = bjf.b(24);
        byteBufferAllocate.put(bArrB);
        this.f21556a.b(byteBufferAllocate, bArrB, bArr, bArr2);
        return byteBufferAllocate.array();
    }
}

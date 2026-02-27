package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class bip implements azo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bcb f21513a;

    public bip(byte[] bArr) throws GeneralSecurityException {
        this.f21513a = new bcb(bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azo
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] bArrB = bjf.b(12);
        byteBufferAllocate.put(bArrB);
        this.f21513a.b(byteBufferAllocate, bArrB, bArr, bArr2);
        return byteBufferAllocate.array();
    }
}

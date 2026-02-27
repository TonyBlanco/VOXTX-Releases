package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes3.dex */
abstract class bcc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21044a = bch.f21049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bca f21045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bca f21046c;

    public bcc(byte[] bArr) throws GeneralSecurityException {
        if (!bch.a(f21044a)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f21045b = a(bArr, 1);
        this.f21046c = a(bArr, 0);
    }

    public abstract bca a(byte[] bArr, int i9) throws InvalidKeyException;

    public final void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        this.f21045b.d(byteBuffer, bArr, bArr2);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        byte[] bArr4 = new byte[32];
        this.f21046c.c(bArr, 0).get(bArr4);
        int iRemaining = byteBuffer.remaining();
        int i9 = iRemaining % 16;
        int i10 = i9 == 0 ? iRemaining : (iRemaining + 16) - i9;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i10 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr3);
        byteBufferOrder.position(0);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i10);
        byteBufferOrder.putLong(0L);
        byteBufferOrder.putLong(iRemaining);
        byte[] bArrE = axy.e(bArr4, byteBufferOrder.array());
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrE);
    }

    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int length = bArr2.length;
        if (length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 16);
        b(byteBufferAllocate, bArr, bArr2, bArr3);
        return byteBufferAllocate.array();
    }
}

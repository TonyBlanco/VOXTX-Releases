package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
final class aex implements aey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f19412a;

    public aex(ByteBuffer byteBuffer) {
        this.f19412a = byteBuffer.slice();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aey
    public final long a() {
        return this.f19412a.capacity();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aey
    public final void b(MessageDigest[] messageDigestArr, long j9, int i9) throws IOException {
        ByteBuffer byteBufferSlice;
        synchronized (this.f19412a) {
            int i10 = (int) j9;
            this.f19412a.position(i10);
            this.f19412a.limit(i10 + i9);
            byteBufferSlice = this.f19412a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }
}

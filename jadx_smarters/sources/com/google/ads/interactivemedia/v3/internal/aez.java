package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
final class aez implements aey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileChannel f19413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f19415c;

    public aez(FileChannel fileChannel, long j9, long j10) {
        this.f19413a = fileChannel;
        this.f19414b = j9;
        this.f19415c = j10;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aey
    public final long a() {
        return this.f19415c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aey
    public final void b(MessageDigest[] messageDigestArr, long j9, int i9) throws IOException {
        MappedByteBuffer map = this.f19413a.map(FileChannel.MapMode.READ_ONLY, this.f19414b + j9, i9);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}

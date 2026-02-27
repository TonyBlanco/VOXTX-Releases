package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f24350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f24351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24352c;

    private final long d(long j9) {
        return this.f24350a + Math.max(0L, ((this.f24351b - 529) * 1000000) / j9);
    }

    public final long a(C1333s c1333s) {
        return d(c1333s.f24481z);
    }

    public final long b(C1333s c1333s, ef efVar) {
        if (this.f24351b == 0) {
            this.f24350a = efVar.f22776d;
        }
        if (this.f24352c) {
            return efVar.f22776d;
        }
        ByteBuffer byteBuffer = efVar.f22774b;
        af.s(byteBuffer);
        int i9 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            i9 = (i9 << 8) | (byteBuffer.get(i10) & 255);
        }
        int iC = zs.c(i9);
        if (iC != -1) {
            long jD = d(c1333s.f24481z);
            this.f24351b += (long) iC;
            return jD;
        }
        this.f24352c = true;
        this.f24351b = 0L;
        this.f24350a = efVar.f22776d;
        cd.e("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return efVar.f22776d;
    }

    public final void c() {
        this.f24350a = 0L;
        this.f24351b = 0L;
        this.f24352c = false;
    }
}

package p3;

import O2.C0936z0;
import Q2.b0;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: p3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2404j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f46281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f46282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f46283c;

    public final long a(long j9) {
        return this.f46281a + Math.max(0L, ((this.f46282b - 529) * 1000000) / j9);
    }

    public long b(C0936z0 c0936z0) {
        return a(c0936z0.f6447A);
    }

    public void c() {
        this.f46281a = 0L;
        this.f46282b = 0L;
        this.f46283c = false;
    }

    public long d(C0936z0 c0936z0, U2.g gVar) {
        if (this.f46282b == 0) {
            this.f46281a = gVar.f9701f;
        }
        if (this.f46283c) {
            return gVar.f9701f;
        }
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC1684a.e(gVar.f9699d);
        int i9 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            i9 = (i9 << 8) | (byteBuffer.get(i10) & 255);
        }
        int iM = b0.m(i9);
        if (iM != -1) {
            long jA = a(c0936z0.f6447A);
            this.f46282b += (long) iM;
            return jA;
        }
        this.f46283c = true;
        this.f46282b = 0L;
        this.f46281a = gVar.f9701f;
        AbstractC1681B.j("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return gVar.f9701f;
    }
}

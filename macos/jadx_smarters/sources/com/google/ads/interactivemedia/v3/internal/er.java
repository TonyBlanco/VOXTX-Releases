package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class er {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f22831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f22832f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f22827a = 0.97f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f22828b = 1.03f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22829c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f22830d = 1.0E-7f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f22833g = 0.999f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f22834h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f22835i = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f22837k = -9223372036854775807L;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f22838l = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f22841o = 0.97f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f22840n = 1.03f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f22842p = 1.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f22843q = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f22836j = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f22839m = -9223372036854775807L;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f22844r = -9223372036854775807L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f22845s = -9223372036854775807L;

    public /* synthetic */ er(float f9, float f10, long j9, float f11, long j10, long j11, float f12) {
        this.f22831e = j10;
        this.f22832f = j11;
    }

    private static long f(long j9, long j10, float f9) {
        return (long) ((j9 * 0.999f) + (j10 * 9.999871E-4f));
    }

    private final void g() {
        long j9 = this.f22834h;
        if (j9 != -9223372036854775807L) {
            long j10 = this.f22835i;
            if (j10 != -9223372036854775807L) {
                j9 = j10;
            }
            long j11 = this.f22837k;
            if (j11 != -9223372036854775807L && j9 < j11) {
                j9 = j11;
            }
            long j12 = this.f22838l;
            if (j12 != -9223372036854775807L && j9 > j12) {
                j9 = j12;
            }
        } else {
            j9 = -9223372036854775807L;
        }
        if (this.f22836j == j9) {
            return;
        }
        this.f22836j = j9;
        this.f22839m = j9;
        this.f22844r = -9223372036854775807L;
        this.f22845s = -9223372036854775807L;
        this.f22843q = -9223372036854775807L;
    }

    public final float a(long j9, long j10) {
        long jF;
        long jP;
        if (this.f22834h == -9223372036854775807L) {
            return 1.0f;
        }
        long j11 = j9 - j10;
        long j12 = this.f22844r;
        if (j12 == -9223372036854775807L) {
            this.f22844r = j11;
            jF = 0;
        } else {
            long jMax = Math.max(j11, f(j12, j11, 0.999f));
            this.f22844r = jMax;
            jF = f(this.f22845s, Math.abs(j11 - jMax), 0.999f);
        }
        this.f22845s = jF;
        if (this.f22843q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f22843q < 1000) {
            return this.f22842p;
        }
        this.f22843q = SystemClock.elapsedRealtime();
        long j13 = this.f22844r + (this.f22845s * 3);
        if (this.f22839m > j13) {
            float fT = cq.t(1000L);
            long[] jArr = {j13, this.f22836j, this.f22839m - (((long) ((this.f22842p - 1.0f) * fT)) + ((long) ((this.f22840n - 1.0f) * fT)))};
            atp.e(true);
            jP = jArr[0];
            for (int i9 = 1; i9 < 3; i9++) {
                long j14 = jArr[i9];
                if (j14 > jP) {
                    jP = j14;
                }
            }
            this.f22839m = jP;
        } else {
            jP = cq.p(j9 - ((long) (Math.max(0.0f, this.f22842p - 1.0f) / 1.0E-7f)), this.f22839m, j13);
            this.f22839m = jP;
            long j15 = this.f22838l;
            if (j15 != -9223372036854775807L && jP > j15) {
                this.f22839m = j15;
                jP = j15;
            }
        }
        long j16 = j9 - jP;
        if (Math.abs(j16) < this.f22831e) {
            this.f22842p = 1.0f;
            return 1.0f;
        }
        float fA = cq.a((j16 * 1.0E-7f) + 1.0f, this.f22841o, this.f22840n);
        this.f22842p = fA;
        return fA;
    }

    public final long b() {
        return this.f22839m;
    }

    public final void c() {
        long j9 = this.f22839m;
        if (j9 == -9223372036854775807L) {
            return;
        }
        long j10 = j9 + this.f22832f;
        this.f22839m = j10;
        long j11 = this.f22838l;
        if (j11 != -9223372036854775807L && j10 > j11) {
            this.f22839m = j11;
        }
        this.f22843q = -9223372036854775807L;
    }

    public final void d(ac acVar) {
        this.f22834h = cq.t(acVar.f18881a);
        this.f22837k = cq.t(acVar.f18882b);
        this.f22838l = cq.t(acVar.f18883c);
        float f9 = acVar.f18884d;
        if (f9 == -3.4028235E38f) {
            f9 = 0.97f;
        }
        this.f22841o = f9;
        float f10 = acVar.f18885e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        this.f22840n = f10;
        if (f9 == 1.0f && f10 == 1.0f) {
            this.f22834h = -9223372036854775807L;
        }
        g();
    }

    public final void e(long j9) {
        this.f22835i = j9;
        g();
    }
}

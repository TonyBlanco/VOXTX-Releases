package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class es {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wr f22846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f22849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f22850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f22851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22853h;

    public es() {
        wr wrVar = new wr();
        i(2500, 0, "bufferForPlaybackMs", "0");
        i(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        i(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i(50000, 50000, "maxBufferMs", "minBufferMs");
        i(0, 0, "backBufferDurationMs", "0");
        this.f22846a = wrVar;
        this.f22847b = cq.t(50000L);
        this.f22848c = cq.t(50000L);
        this.f22849d = cq.t(2500L);
        this.f22850e = cq.t(5000L);
        this.f22852g = 13107200;
        this.f22851f = cq.t(0L);
    }

    private static void i(int i9, int i10, String str, String str2) {
        af.v(i9 >= i10, str + " cannot be less than " + str2);
    }

    private final void j(boolean z9) {
        this.f22852g = 13107200;
        this.f22853h = false;
        if (z9) {
            this.f22846a.c();
        }
    }

    public final long a() {
        return this.f22851f;
    }

    public final void b() {
        j(false);
    }

    public final void c() {
        j(true);
    }

    public final void d() {
        j(true);
    }

    public final boolean e(long j9, float f9, boolean z9, long j10) {
        long jS = cq.s(j9, f9);
        long jMin = z9 ? this.f22850e : this.f22849d;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(j10 / 2, jMin);
        }
        return jMin <= 0 || jS >= jMin || this.f22846a.a() >= this.f22852g;
    }

    public final wr f() {
        return this.f22846a;
    }

    public final void g(hh[] hhVarArr, we[] weVarArr) {
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int length = hhVarArr.length;
            if (i9 >= 2) {
                int iMax = Math.max(13107200, i10);
                this.f22852g = iMax;
                this.f22846a.d(iMax);
                return;
            } else {
                if (weVarArr[i9] != null) {
                    i10 += hhVarArr[i9].b() != 1 ? 131072000 : 13107200;
                }
                i9++;
            }
        }
    }

    public final boolean h(long j9, float f9) {
        int iA = this.f22846a.a();
        int i9 = this.f22852g;
        long jMin = this.f22847b;
        if (f9 > 1.0f) {
            jMin = Math.min(cq.q(jMin, f9), this.f22848c);
        }
        if (j9 < Math.max(jMin, 500000L)) {
            boolean z9 = iA < i9;
            this.f22853h = z9;
            if (!z9 && j9 < 500000) {
                cd.e("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j9 >= this.f22848c || iA >= i9) {
            this.f22853h = false;
        }
        return this.f22853h;
    }
}

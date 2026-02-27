package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class yu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f25208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f25210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f25211d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f25212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f25213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f25214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f25215h;

    public yu(long j9, long j10, long j11, long j12, long j13, long j14) {
        this.f25208a = j9;
        this.f25209b = j10;
        this.f25212e = j11;
        this.f25213f = j12;
        this.f25214g = j13;
        this.f25210c = j14;
        this.f25215h = f(j10, 0L, j11, j12, j13, j14);
    }

    public static long f(long j9, long j10, long j11, long j12, long j13, long j14) {
        if (j12 + 1 >= j13 || 1 + j10 >= j11) {
            return j12;
        }
        long j15 = (long) ((j9 - j10) * ((j13 - j12) / (j11 - j10)));
        return cq.p(((j12 + j15) - j14) - (j15 / 20), j12, (-1) + j13);
    }

    public static /* bridge */ /* synthetic */ void g(yu yuVar, long j9, long j10) {
        yuVar.f25212e = j9;
        yuVar.f25214g = j10;
        yuVar.i();
    }

    public static /* bridge */ /* synthetic */ void h(yu yuVar, long j9, long j10) {
        yuVar.f25211d = j9;
        yuVar.f25213f = j10;
        yuVar.i();
    }

    private final void i() {
        this.f25215h = f(this.f25209b, this.f25211d, this.f25212e, this.f25213f, this.f25214g, this.f25210c);
    }
}

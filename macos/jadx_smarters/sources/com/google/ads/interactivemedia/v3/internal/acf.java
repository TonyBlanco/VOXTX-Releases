package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class acf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f18905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final cj f18906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final cj f18907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f18908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f18909i;

    public acf(cj cjVar, cj cjVar2, boolean z9) throws as {
        this.f18907g = cjVar;
        this.f18906f = cjVar2;
        this.f18905e = z9;
        cjVar2.F(12);
        this.f18901a = cjVar2.l();
        cjVar.F(12);
        this.f18909i = cjVar.l();
        fz.k(cjVar.e() == 1, "first_chunk must be 1");
        this.f18902b = -1;
    }

    public final boolean a() {
        int i9 = this.f18902b + 1;
        this.f18902b = i9;
        if (i9 == this.f18901a) {
            return false;
        }
        this.f18904d = this.f18905e ? this.f18906f.q() : this.f18906f.p();
        if (this.f18902b == this.f18908h) {
            this.f18903c = this.f18907g.l();
            this.f18907g.G(4);
            int i10 = this.f18909i - 1;
            this.f18909i = i10;
            this.f18908h = i10 > 0 ? (-1) + this.f18907g.l() : -1;
        }
        return true;
    }
}

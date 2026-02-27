package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f21035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f21036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f21038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C1283b f21041g = C1283b.f20974a;

    public final int a(int i9) {
        return this.f21041g.a(i9).f18615b;
    }

    public final int b(long j9) {
        return -1;
    }

    public final int c(long j9) {
        return -1;
    }

    public final int d(int i9) {
        return this.f21041g.a(i9).a();
    }

    public final int e(int i9, int i10) {
        return this.f21041g.a(i9).b(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bc.class.equals(obj.getClass())) {
            bc bcVar = (bc) obj;
            if (cq.V(this.f21035a, bcVar.f21035a) && cq.V(this.f21036b, bcVar.f21036b) && this.f21037c == bcVar.f21037c && this.f21038d == bcVar.f21038d && this.f21039e == bcVar.f21039e && this.f21040f == bcVar.f21040f && cq.V(this.f21041g, bcVar.f21041g)) {
                return true;
            }
        }
        return false;
    }

    public final long f(int i9, int i10) {
        C1280a c1280aA = this.f21041g.a(i9);
        if (c1280aA.f18615b != -1) {
            return c1280aA.f18618e[i10];
        }
        return -9223372036854775807L;
    }

    public final long g() {
        return cq.x(this.f21039e);
    }

    public final void h() {
        int i9 = this.f21041g.f20976b;
    }

    public final int hashCode() {
        Object obj = this.f21035a;
        int iHashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.f21036b;
        int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
        int i9 = this.f21037c;
        long j9 = this.f21038d;
        long j10 = this.f21039e;
        return ((((((((((iHashCode + iHashCode2) * 31) + i9) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f21040f ? 1 : 0)) * 31) + this.f21041g.hashCode();
    }

    public final void i(int i9) {
        long j9 = this.f21041g.a(i9).f18614a;
    }

    public final void j() {
        long j9 = this.f21041g.f20977c;
    }

    public final void k(int i9) {
        long j9 = this.f21041g.a(i9).f18619f;
    }

    public final void l(int i9) {
        boolean z9 = this.f21041g.a(i9).f18620g;
    }

    public final bc m(Object obj, Object obj2, long j9, long j10) {
        n(obj, obj2, j9, j10, C1283b.f20974a, false);
        return this;
    }

    public final void n(Object obj, Object obj2, long j9, long j10, C1283b c1283b, boolean z9) {
        this.f21035a = obj;
        this.f21036b = obj2;
        this.f21037c = 0;
        this.f21038d = j9;
        this.f21039e = j10;
        this.f21041g = c1283b;
        this.f21040f = z9;
    }
}

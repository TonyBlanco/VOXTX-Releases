package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f21061a = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final ai f21062r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f21063b = f21061a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ai f21064c = f21062r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f21065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f21067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f21068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public boolean f21071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ac f21072k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f21073l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f21074m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f21075n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21076o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21077p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f21078q;

    static {
        C1341v c1341v = new C1341v();
        c1341v.b("bundled.androidx.media3.common.Timeline");
        c1341v.c(Uri.EMPTY);
        f21062r = c1341v.a();
    }

    public final long a() {
        return cq.x(this.f21074m);
    }

    public final long b() {
        return cq.x(this.f21075n);
    }

    public final boolean c() {
        af.w(this.f21071j == (this.f21072k != null));
        return this.f21072k != null;
    }

    public final void d(Object obj, ai aiVar, Object obj2, long j9, long j10, long j11, boolean z9, boolean z10, ac acVar, long j12, long j13, int i9, long j14) {
        this.f21063b = obj;
        this.f21064c = aiVar != null ? aiVar : f21062r;
        this.f21065d = obj2;
        this.f21066e = j9;
        this.f21067f = j10;
        this.f21068g = j11;
        this.f21069h = z9;
        this.f21070i = z10;
        this.f21071j = acVar != null;
        this.f21072k = acVar;
        this.f21074m = j12;
        this.f21075n = j13;
        this.f21076o = 0;
        this.f21077p = i9;
        this.f21078q = j14;
        this.f21073l = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bd.class.equals(obj.getClass())) {
            bd bdVar = (bd) obj;
            if (cq.V(this.f21063b, bdVar.f21063b) && cq.V(this.f21064c, bdVar.f21064c) && cq.V(this.f21065d, bdVar.f21065d) && cq.V(this.f21072k, bdVar.f21072k) && this.f21066e == bdVar.f21066e && this.f21067f == bdVar.f21067f && this.f21068g == bdVar.f21068g && this.f21069h == bdVar.f21069h && this.f21070i == bdVar.f21070i && this.f21073l == bdVar.f21073l && this.f21074m == bdVar.f21074m && this.f21075n == bdVar.f21075n && this.f21076o == bdVar.f21076o && this.f21077p == bdVar.f21077p && this.f21078q == bdVar.f21078q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f21063b.hashCode() + 217) * 31) + this.f21064c.hashCode()) * 31;
        Object obj = this.f21065d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        ac acVar = this.f21072k;
        int iHashCode3 = acVar != null ? acVar.hashCode() : 0;
        long j9 = this.f21066e;
        long j10 = this.f21067f;
        long j11 = this.f21068g;
        boolean z9 = this.f21069h;
        boolean z10 = this.f21070i;
        boolean z11 = this.f21073l;
        long j12 = this.f21074m;
        long j13 = this.f21075n;
        int i9 = this.f21076o;
        int i10 = this.f21077p;
        long j14 = this.f21078q;
        return ((((((((((((((((((((((iHashCode2 + iHashCode3) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (z9 ? 1 : 0)) * 31) + (z10 ? 1 : 0)) * 31) + (z11 ? 1 : 0)) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + i9) * 31) + i10) * 31) + ((int) ((j14 >>> 32) ^ j14));
    }
}

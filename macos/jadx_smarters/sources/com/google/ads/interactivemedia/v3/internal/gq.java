package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class gq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final td f23065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uf[] f23067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public gr f23070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f23072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final hi[] f23073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final wj f23074j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ha f23075k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private gq f23076l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private um f23077m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private wk f23078n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f23079o;

    public gq(hi[] hiVarArr, long j9, wj wjVar, wr wrVar, ha haVar, gr grVar, wk wkVar) {
        this.f23073i = hiVarArr;
        this.f23079o = j9;
        this.f23074j = wjVar;
        this.f23075k = haVar;
        te teVar = grVar.f23080a;
        this.f23066b = teVar.f20173a;
        this.f23070f = grVar;
        this.f23077m = um.f24748a;
        this.f23078n = wkVar;
        this.f23067c = new uf[2];
        this.f23072h = new boolean[2];
        long j10 = grVar.f23081b;
        long j11 = grVar.f23083d;
        td tdVarM = haVar.m(teVar, wrVar, j10);
        this.f23065a = j11 != -9223372036854775807L ? new se(tdVarM, j11) : tdVarM;
    }

    private final void u() {
        if (!w()) {
            return;
        }
        int i9 = 0;
        while (true) {
            wk wkVar = this.f23078n;
            if (i9 >= wkVar.f24976a) {
                return;
            }
            boolean zB = wkVar.b(i9);
            we weVar = this.f23078n.f24978c[i9];
            if (zB && weVar != null) {
                weVar.f();
            }
            i9++;
        }
    }

    private final void v() {
        if (!w()) {
            return;
        }
        int i9 = 0;
        while (true) {
            wk wkVar = this.f23078n;
            if (i9 >= wkVar.f24976a) {
                return;
            }
            boolean zB = wkVar.b(i9);
            we weVar = this.f23078n.f24978c[i9];
            if (zB && weVar != null) {
                weVar.g();
            }
            i9++;
        }
    }

    private final boolean w() {
        return this.f23076l == null;
    }

    public final long a(wk wkVar, long j9, boolean z9, boolean[] zArr) {
        int i9 = 0;
        while (true) {
            boolean z10 = true;
            if (i9 >= wkVar.f24976a) {
                break;
            }
            boolean[] zArr2 = this.f23072h;
            if (z9 || !wkVar.a(this.f23078n, i9)) {
                z10 = false;
            }
            zArr2[i9] = z10;
            i9++;
        }
        int i10 = 0;
        while (true) {
            hi[] hiVarArr = this.f23073i;
            if (i10 >= 2) {
                break;
            }
            hiVarArr[i10].b();
            i10++;
        }
        u();
        this.f23078n = wkVar;
        v();
        long jF = this.f23065a.f(wkVar.f24978c, this.f23072h, this.f23067c, zArr, j9);
        int i11 = 0;
        while (true) {
            hi[] hiVarArr2 = this.f23073i;
            if (i11 >= 2) {
                break;
            }
            hiVarArr2[i11].b();
            i11++;
        }
        this.f23069e = false;
        int i12 = 0;
        while (true) {
            uf[] ufVarArr = this.f23067c;
            if (i12 >= ufVarArr.length) {
                return jF;
            }
            if (ufVarArr[i12] != null) {
                af.w(wkVar.b(i12));
                this.f23073i[i12].b();
                this.f23069e = true;
            } else {
                af.w(wkVar.f24978c[i12] == null);
            }
            i12++;
        }
    }

    public final long b() {
        if (!this.f23068d) {
            return this.f23070f.f23081b;
        }
        long jBo = this.f23069e ? this.f23065a.bo() : Long.MIN_VALUE;
        return jBo == Long.MIN_VALUE ? this.f23070f.f23084e : jBo;
    }

    public final long c() {
        if (this.f23068d) {
            return this.f23065a.c();
        }
        return 0L;
    }

    public final long d() {
        return this.f23079o;
    }

    public final long e() {
        return this.f23070f.f23081b + this.f23079o;
    }

    public final long f(long j9) {
        return j9 - this.f23079o;
    }

    public final long g(long j9) {
        return j9 + this.f23079o;
    }

    public final gq h() {
        return this.f23076l;
    }

    public final um i() {
        return this.f23077m;
    }

    public final wk j() {
        return this.f23078n;
    }

    public final wk k(float f9, be beVar) throws ev {
        wk wkVarP = this.f23074j.p(this.f23073i, this.f23077m, this.f23070f.f23080a, beVar);
        for (we weVar : wkVarP.f24978c) {
            if (weVar != null) {
                weVar.h(f9);
            }
        }
        return wkVarP;
    }

    public final void l(long j9) {
        af.w(w());
        this.f23065a.o(f(j9));
    }

    public final void m(float f9, be beVar) throws ev {
        this.f23068d = true;
        this.f23077m = this.f23065a.h();
        wk wkVarK = k(f9, beVar);
        gr grVar = this.f23070f;
        long jMax = grVar.f23081b;
        long j9 = grVar.f23084e;
        if (j9 != -9223372036854775807L && jMax >= j9) {
            jMax = Math.max(0L, j9 - 1);
        }
        long jS = s(wkVarK, jMax);
        long j10 = this.f23079o;
        gr grVar2 = this.f23070f;
        this.f23079o = j10 + (grVar2.f23081b - jS);
        this.f23070f = grVar2.b(jS);
    }

    public final void n(long j9) {
        af.w(w());
        if (this.f23068d) {
            this.f23065a.l(f(j9));
        }
    }

    public final void o() {
        u();
        ha haVar = this.f23075k;
        td tdVar = this.f23065a;
        try {
            if (tdVar instanceof se) {
                haVar.g(((se) tdVar).f24495a);
            } else {
                haVar.g(tdVar);
            }
        } catch (RuntimeException e9) {
            cd.c("MediaPeriodHolder", "Period release failed.", e9);
        }
    }

    public final void p(gq gqVar) {
        if (gqVar == this.f23076l) {
            return;
        }
        u();
        this.f23076l = gqVar;
        v();
    }

    public final void q() {
        td tdVar = this.f23065a;
        if (tdVar instanceof se) {
            long j9 = this.f23070f.f23083d;
            if (j9 == -9223372036854775807L) {
                j9 = Long.MIN_VALUE;
            }
            ((se) tdVar).m(j9);
        }
    }

    public final boolean r() {
        if (this.f23068d) {
            return !this.f23069e || this.f23065a.bo() == Long.MIN_VALUE;
        }
        return false;
    }

    public final long s(wk wkVar, long j9) {
        return a(wkVar, j9, false, new boolean[2]);
    }

    public final void t() {
        this.f23079o = 1000000000000L;
    }
}

package l3;

import d3.InterfaceC1673j;
import d4.M;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2178c f44047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f44048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f44049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f44050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44052f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f44058l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p f44060n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f44062p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f44063q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f44064r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f44053g = new long[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f44054h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f44055i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f44056j = new long[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f44057k = new boolean[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean[] f44059m = new boolean[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final M f44061o = new M();

    public void a(InterfaceC1673j interfaceC1673j) {
        interfaceC1673j.m(this.f44061o.e(), 0, this.f44061o.g());
        this.f44061o.U(0);
        this.f44062p = false;
    }

    public void b(M m9) {
        m9.l(this.f44061o.e(), 0, this.f44061o.g());
        this.f44061o.U(0);
        this.f44062p = false;
    }

    public long c(int i9) {
        return this.f44056j[i9];
    }

    public void d(int i9) {
        this.f44061o.Q(i9);
        this.f44058l = true;
        this.f44062p = true;
    }

    public void e(int i9, int i10) {
        this.f44051e = i9;
        this.f44052f = i10;
        if (this.f44054h.length < i9) {
            this.f44053g = new long[i9];
            this.f44054h = new int[i9];
        }
        if (this.f44055i.length < i10) {
            int i11 = (i10 * 125) / 100;
            this.f44055i = new int[i11];
            this.f44056j = new long[i11];
            this.f44057k = new boolean[i11];
            this.f44059m = new boolean[i11];
        }
    }

    public void f() {
        this.f44051e = 0;
        this.f44063q = 0L;
        this.f44064r = false;
        this.f44058l = false;
        this.f44062p = false;
        this.f44060n = null;
    }

    public boolean g(int i9) {
        return this.f44058l && this.f44059m[i9];
    }
}

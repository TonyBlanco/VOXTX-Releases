package n3;

import O2.C0897l1;
import O2.C0936z0;
import Q2.AbstractC1015a;
import d3.InterfaceC1674k;
import d4.AbstractC1684a;
import d4.L;
import d4.M;
import java.util.Collections;
import n3.I;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f45199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L f45200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d3.w f45201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f45202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0936z0 f45203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f45208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f45211n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f45212o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f45213p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f45214q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f45215r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f45216s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f45217t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f45218u;

    public s(String str) {
        this.f45198a = str;
        M m9 = new M(1024);
        this.f45199b = m9;
        this.f45200c = new L(m9.e());
        this.f45208k = -9223372036854775807L;
    }

    public static long a(L l9) {
        return l9.h((l9.h(2) + 1) * 8);
    }

    @Override // n3.m
    public void b(M m9) throws C0897l1 {
        AbstractC1684a.i(this.f45201d);
        while (m9.a() > 0) {
            int i9 = this.f45204g;
            if (i9 != 0) {
                if (i9 == 1) {
                    int iH = m9.H();
                    if ((iH & 224) == 224) {
                        this.f45207j = iH;
                        this.f45204g = 2;
                    } else if (iH != 86) {
                        this.f45204g = 0;
                    }
                } else if (i9 == 2) {
                    int iH2 = ((this.f45207j & (-225)) << 8) | m9.H();
                    this.f45206i = iH2;
                    if (iH2 > this.f45199b.e().length) {
                        m(this.f45206i);
                    }
                    this.f45205h = 0;
                    this.f45204g = 3;
                } else {
                    if (i9 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(m9.a(), this.f45206i - this.f45205h);
                    m9.l(this.f45200c.f39700a, this.f45205h, iMin);
                    int i10 = this.f45205h + iMin;
                    this.f45205h = i10;
                    if (i10 == this.f45206i) {
                        this.f45200c.p(0);
                        g(this.f45200c);
                        this.f45204g = 0;
                    }
                }
            } else if (m9.H() == 86) {
                this.f45204g = 1;
            }
        }
    }

    @Override // n3.m
    public void c() {
        this.f45204g = 0;
        this.f45208k = -9223372036854775807L;
        this.f45209l = false;
    }

    @Override // n3.m
    public void d() {
    }

    @Override // n3.m
    public void e(long j9, int i9) {
        if (j9 != -9223372036854775807L) {
            this.f45208k = j9;
        }
    }

    @Override // n3.m
    public void f(InterfaceC1674k interfaceC1674k, I.d dVar) {
        dVar.a();
        this.f45201d = interfaceC1674k.e(dVar.c(), 1);
        this.f45202e = dVar.b();
    }

    public final void g(L l9) throws C0897l1 {
        if (!l9.g()) {
            this.f45209l = true;
            l(l9);
        } else if (!this.f45209l) {
            return;
        }
        if (this.f45210m != 0) {
            throw C0897l1.a(null, null);
        }
        if (this.f45211n != 0) {
            throw C0897l1.a(null, null);
        }
        k(l9, j(l9));
        if (this.f45213p) {
            l9.r((int) this.f45214q);
        }
    }

    public final int h(L l9) throws C0897l1 {
        int iB = l9.b();
        AbstractC1015a.b bVarE = AbstractC1015a.e(l9, true);
        this.f45218u = bVarE.f7733c;
        this.f45215r = bVarE.f7731a;
        this.f45217t = bVarE.f7732b;
        return iB - l9.b();
    }

    public final void i(L l9) {
        int i9;
        int iH = l9.h(3);
        this.f45212o = iH;
        if (iH == 0) {
            i9 = 8;
        } else {
            if (iH != 1) {
                if (iH == 3 || iH == 4 || iH == 5) {
                    l9.r(6);
                    return;
                } else {
                    if (iH != 6 && iH != 7) {
                        throw new IllegalStateException();
                    }
                    l9.r(1);
                    return;
                }
            }
            i9 = 9;
        }
        l9.r(i9);
    }

    public final int j(L l9) throws C0897l1 {
        int iH;
        if (this.f45212o != 0) {
            throw C0897l1.a(null, null);
        }
        int i9 = 0;
        do {
            iH = l9.h(8);
            i9 += iH;
        } while (iH == 255);
        return i9;
    }

    public final void k(L l9, int i9) {
        int iE = l9.e();
        if ((iE & 7) == 0) {
            this.f45199b.U(iE >> 3);
        } else {
            l9.i(this.f45199b.e(), 0, i9 * 8);
            this.f45199b.U(0);
        }
        this.f45201d.b(this.f45199b, i9);
        long j9 = this.f45208k;
        if (j9 != -9223372036854775807L) {
            this.f45201d.f(j9, 1, i9, 0, null);
            this.f45208k += this.f45216s;
        }
    }

    public final void l(L l9) throws C0897l1 {
        boolean zG;
        int iH = l9.h(1);
        int iH2 = iH == 1 ? l9.h(1) : 0;
        this.f45210m = iH2;
        if (iH2 != 0) {
            throw C0897l1.a(null, null);
        }
        if (iH == 1) {
            a(l9);
        }
        if (!l9.g()) {
            throw C0897l1.a(null, null);
        }
        this.f45211n = l9.h(6);
        int iH3 = l9.h(4);
        int iH4 = l9.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw C0897l1.a(null, null);
        }
        if (iH == 0) {
            int iE = l9.e();
            int iH5 = h(l9);
            l9.p(iE);
            byte[] bArr = new byte[(iH5 + 7) / 8];
            l9.i(bArr, 0, iH5);
            C0936z0 c0936z0G = new C0936z0.b().U(this.f45202e).g0("audio/mp4a-latm").K(this.f45218u).J(this.f45217t).h0(this.f45215r).V(Collections.singletonList(bArr)).X(this.f45198a).G();
            if (!c0936z0G.equals(this.f45203f)) {
                this.f45203f = c0936z0G;
                this.f45216s = 1024000000 / ((long) c0936z0G.f6447A);
                this.f45201d.d(c0936z0G);
            }
        } else {
            l9.r(((int) a(l9)) - h(l9));
        }
        i(l9);
        boolean zG2 = l9.g();
        this.f45213p = zG2;
        this.f45214q = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f45214q = a(l9);
            } else {
                do {
                    zG = l9.g();
                    this.f45214q = (this.f45214q << 8) + ((long) l9.h(8));
                } while (zG);
            }
        }
        if (l9.g()) {
            l9.r(8);
        }
    }

    public final void m(int i9) {
        this.f45199b.Q(i9);
        this.f45200c.n(this.f45199b.e());
    }
}

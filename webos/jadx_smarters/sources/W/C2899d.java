package w;

import java.util.Arrays;
import java.util.HashMap;
import w.i;
import x.d;

/* JADX INFO: renamed from: w.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2899d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f51495q = 1000;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f51496r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static long f51497s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static long f51498t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f51501c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2897b[] f51504f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C2898c f51511m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f51514p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51499a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f51500b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51502d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51503e = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f51505g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f51506h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean[] f51507i = new boolean[32];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51508j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f51509k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f51510l = 32;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i[] f51512n = new i[f51495q];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f51513o = 0;

    /* JADX INFO: renamed from: w.d$a */
    public interface a {
        i a(C2899d c2899d, boolean[] zArr);

        void b(a aVar);

        void c(i iVar);

        void clear();

        i getKey();
    }

    /* JADX INFO: renamed from: w.d$b */
    public class b extends C2897b {
        public b(C2898c c2898c) {
            this.f51489e = new j(this, c2898c);
        }
    }

    public C2899d() {
        this.f51504f = null;
        this.f51504f = new C2897b[32];
        C();
        C2898c c2898c = new C2898c();
        this.f51511m = c2898c;
        this.f51501c = new h(c2898c);
        this.f51514p = f51496r ? new b(c2898c) : new C2897b(c2898c);
    }

    public static C2897b s(C2899d c2899d, i iVar, i iVar2, float f9) {
        return c2899d.r().j(iVar, iVar2, f9);
    }

    public static e w() {
        return null;
    }

    public void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public final int B(a aVar, boolean z9) {
        for (int i9 = 0; i9 < this.f51508j; i9++) {
            this.f51507i[i9] = false;
        }
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            i10++;
            if (i10 >= this.f51508j * 2) {
                return i10;
            }
            if (aVar.getKey() != null) {
                this.f51507i[aVar.getKey().f51531c] = true;
            }
            i iVarA = aVar.a(this, this.f51507i);
            if (iVarA != null) {
                boolean[] zArr = this.f51507i;
                int i11 = iVarA.f51531c;
                if (zArr[i11]) {
                    return i10;
                }
                zArr[i11] = true;
            }
            if (iVarA != null) {
                float f9 = Float.MAX_VALUE;
                int i12 = -1;
                for (int i13 = 0; i13 < this.f51509k; i13++) {
                    C2897b c2897b = this.f51504f[i13];
                    if (c2897b.f51485a.f51538j != i.a.UNRESTRICTED && !c2897b.f51490f && c2897b.t(iVarA)) {
                        float f10 = c2897b.f51489e.f(iVarA);
                        if (f10 < 0.0f) {
                            float f11 = (-c2897b.f51486b) / f10;
                            if (f11 < f9) {
                                i12 = i13;
                                f9 = f11;
                            }
                        }
                    }
                }
                if (i12 > -1) {
                    C2897b c2897b2 = this.f51504f[i12];
                    c2897b2.f51485a.f51532d = -1;
                    c2897b2.y(iVarA);
                    i iVar = c2897b2.f51485a;
                    iVar.f51532d = i12;
                    iVar.g(c2897b2);
                }
            } else {
                z10 = true;
            }
        }
        return i10;
    }

    public final void C() {
        int i9 = 0;
        if (f51496r) {
            while (true) {
                C2897b[] c2897bArr = this.f51504f;
                if (i9 >= c2897bArr.length) {
                    return;
                }
                C2897b c2897b = c2897bArr[i9];
                if (c2897b != null) {
                    this.f51511m.f51491a.a(c2897b);
                }
                this.f51504f[i9] = null;
                i9++;
            }
        } else {
            while (true) {
                C2897b[] c2897bArr2 = this.f51504f;
                if (i9 >= c2897bArr2.length) {
                    return;
                }
                C2897b c2897b2 = c2897bArr2[i9];
                if (c2897b2 != null) {
                    this.f51511m.f51492b.a(c2897b2);
                }
                this.f51504f[i9] = null;
                i9++;
            }
        }
    }

    public void D() {
        C2898c c2898c;
        int i9 = 0;
        while (true) {
            c2898c = this.f51511m;
            i[] iVarArr = c2898c.f51494d;
            if (i9 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i9];
            if (iVar != null) {
                iVar.d();
            }
            i9++;
        }
        c2898c.f51493c.c(this.f51512n, this.f51513o);
        this.f51513o = 0;
        Arrays.fill(this.f51511m.f51494d, (Object) null);
        HashMap map = this.f51500b;
        if (map != null) {
            map.clear();
        }
        this.f51499a = 0;
        this.f51501c.clear();
        this.f51508j = 1;
        for (int i10 = 0; i10 < this.f51509k; i10++) {
            this.f51504f[i10].f51487c = false;
        }
        C();
        this.f51509k = 0;
        this.f51514p = f51496r ? new b(this.f51511m) : new C2897b(this.f51511m);
    }

    public final i a(i.a aVar, String str) {
        i iVar = (i) this.f51511m.f51493c.b();
        if (iVar == null) {
            iVar = new i(aVar, str);
        } else {
            iVar.d();
        }
        iVar.f(aVar, str);
        int i9 = this.f51513o;
        int i10 = f51495q;
        if (i9 >= i10) {
            int i11 = i10 * 2;
            f51495q = i11;
            this.f51512n = (i[]) Arrays.copyOf(this.f51512n, i11);
        }
        i[] iVarArr = this.f51512n;
        int i12 = this.f51513o;
        this.f51513o = i12 + 1;
        iVarArr[i12] = iVar;
        return iVar;
    }

    public void b(x.e eVar, x.e eVar2, float f9, int i9) {
        d.b bVar = d.b.LEFT;
        i iVarQ = q(eVar.k(bVar));
        d.b bVar2 = d.b.TOP;
        i iVarQ2 = q(eVar.k(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i iVarQ3 = q(eVar.k(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i iVarQ4 = q(eVar.k(bVar4));
        i iVarQ5 = q(eVar2.k(bVar));
        i iVarQ6 = q(eVar2.k(bVar2));
        i iVarQ7 = q(eVar2.k(bVar3));
        i iVarQ8 = q(eVar2.k(bVar4));
        C2897b c2897bR = r();
        double d9 = f9;
        double d10 = i9;
        c2897bR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d9) * d10));
        d(c2897bR);
        C2897b c2897bR2 = r();
        c2897bR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d9) * d10));
        d(c2897bR2);
    }

    public void c(i iVar, i iVar2, int i9, float f9, i iVar3, i iVar4, int i10, int i11) {
        C2897b c2897bR = r();
        c2897bR.h(iVar, iVar2, i9, f9, iVar3, iVar4, i10);
        if (i11 != 8) {
            c2897bR.d(this, i11);
        }
        d(c2897bR);
    }

    public void d(C2897b c2897b) {
        i iVarW;
        if (c2897b == null) {
            return;
        }
        boolean z9 = true;
        if (this.f51509k + 1 >= this.f51510l || this.f51508j + 1 >= this.f51503e) {
            y();
        }
        boolean z10 = false;
        if (!c2897b.f51490f) {
            c2897b.D(this);
            if (c2897b.u()) {
                return;
            }
            c2897b.r();
            if (c2897b.f(this)) {
                i iVarP = p();
                c2897b.f51485a = iVarP;
                l(c2897b);
                this.f51514p.b(c2897b);
                B(this.f51514p, true);
                if (iVarP.f51532d == -1) {
                    if (c2897b.f51485a == iVarP && (iVarW = c2897b.w(iVarP)) != null) {
                        c2897b.y(iVarW);
                    }
                    if (!c2897b.f51490f) {
                        c2897b.f51485a.g(c2897b);
                    }
                    this.f51509k--;
                }
            } else {
                z9 = false;
            }
            if (!c2897b.s()) {
                return;
            } else {
                z10 = z9;
            }
        }
        if (z10) {
            return;
        }
        l(c2897b);
    }

    public C2897b e(i iVar, i iVar2, int i9, int i10) {
        if (i10 == 8 && iVar2.f51535g && iVar.f51532d == -1) {
            iVar.e(this, iVar2.f51534f + i9);
            return null;
        }
        C2897b c2897bR = r();
        c2897bR.n(iVar, iVar2, i9);
        if (i10 != 8) {
            c2897bR.d(this, i10);
        }
        d(c2897bR);
        return c2897bR;
    }

    public void f(i iVar, int i9) {
        C2897b c2897bR;
        int i10 = iVar.f51532d;
        if (i10 == -1) {
            iVar.e(this, i9);
            return;
        }
        if (i10 != -1) {
            C2897b c2897b = this.f51504f[i10];
            if (!c2897b.f51490f) {
                if (c2897b.f51489e.i() == 0) {
                    c2897b.f51490f = true;
                } else {
                    c2897bR = r();
                    c2897bR.m(iVar, i9);
                }
            }
            c2897b.f51486b = i9;
            return;
        }
        c2897bR = r();
        c2897bR.i(iVar, i9);
        d(c2897bR);
    }

    public void g(i iVar, i iVar2, int i9, boolean z9) {
        C2897b c2897bR = r();
        i iVarT = t();
        iVarT.f51533e = 0;
        c2897bR.o(iVar, iVar2, iVarT, i9);
        d(c2897bR);
    }

    public void h(i iVar, i iVar2, int i9, int i10) {
        C2897b c2897bR = r();
        i iVarT = t();
        iVarT.f51533e = 0;
        c2897bR.o(iVar, iVar2, iVarT, i9);
        if (i10 != 8) {
            m(c2897bR, (int) (c2897bR.f51489e.f(iVarT) * (-1.0f)), i10);
        }
        d(c2897bR);
    }

    public void i(i iVar, i iVar2, int i9, boolean z9) {
        C2897b c2897bR = r();
        i iVarT = t();
        iVarT.f51533e = 0;
        c2897bR.p(iVar, iVar2, iVarT, i9);
        d(c2897bR);
    }

    public void j(i iVar, i iVar2, int i9, int i10) {
        C2897b c2897bR = r();
        i iVarT = t();
        iVarT.f51533e = 0;
        c2897bR.p(iVar, iVar2, iVarT, i9);
        if (i10 != 8) {
            m(c2897bR, (int) (c2897bR.f51489e.f(iVarT) * (-1.0f)), i10);
        }
        d(c2897bR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f9, int i9) {
        C2897b c2897bR = r();
        c2897bR.k(iVar, iVar2, iVar3, iVar4, f9);
        if (i9 != 8) {
            c2897bR.d(this, i9);
        }
        d(c2897bR);
    }

    public final void l(C2897b c2897b) {
        C2897b c2897b2;
        f fVar;
        if (f51496r) {
            c2897b2 = this.f51504f[this.f51509k];
            if (c2897b2 != null) {
                fVar = this.f51511m.f51491a;
                fVar.a(c2897b2);
            }
        } else {
            c2897b2 = this.f51504f[this.f51509k];
            if (c2897b2 != null) {
                fVar = this.f51511m.f51492b;
                fVar.a(c2897b2);
            }
        }
        C2897b[] c2897bArr = this.f51504f;
        int i9 = this.f51509k;
        c2897bArr[i9] = c2897b;
        i iVar = c2897b.f51485a;
        iVar.f51532d = i9;
        this.f51509k = i9 + 1;
        iVar.g(c2897b);
    }

    public void m(C2897b c2897b, int i9, int i10) {
        c2897b.e(o(i10, null), i9);
    }

    public final void n() {
        for (int i9 = 0; i9 < this.f51509k; i9++) {
            C2897b c2897b = this.f51504f[i9];
            c2897b.f51485a.f51534f = c2897b.f51486b;
        }
    }

    public i o(int i9, String str) {
        if (this.f51508j + 1 >= this.f51503e) {
            y();
        }
        i iVarA = a(i.a.ERROR, str);
        int i10 = this.f51499a + 1;
        this.f51499a = i10;
        this.f51508j++;
        iVarA.f51531c = i10;
        iVarA.f51533e = i9;
        this.f51511m.f51494d[i10] = iVarA;
        this.f51501c.c(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f51508j + 1 >= this.f51503e) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i9 = this.f51499a + 1;
        this.f51499a = i9;
        this.f51508j++;
        iVarA.f51531c = i9;
        this.f51511m.f51494d[i9] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarE = null;
        if (obj == null) {
            return null;
        }
        if (this.f51508j + 1 >= this.f51503e) {
            y();
        }
        if (obj instanceof x.d) {
            x.d dVar = (x.d) obj;
            iVarE = dVar.e();
            if (iVarE == null) {
                dVar.l(this.f51511m);
                iVarE = dVar.e();
            }
            int i9 = iVarE.f51531c;
            if (i9 == -1 || i9 > this.f51499a || this.f51511m.f51494d[i9] == null) {
                if (i9 != -1) {
                    iVarE.d();
                }
                int i10 = this.f51499a + 1;
                this.f51499a = i10;
                this.f51508j++;
                iVarE.f51531c = i10;
                iVarE.f51538j = i.a.UNRESTRICTED;
                this.f51511m.f51494d[i10] = iVarE;
            }
        }
        return iVarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f A[PHI: r0
      0x001f: PHI (r0v6 w.b) = (r0v4 w.b), (r0v11 w.b) binds: [B:9:0x002d, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w.C2897b r() {
        /*
            r5 = this;
            boolean r0 = w.C2899d.f51496r
            r1 = 1
            if (r0 == 0) goto L23
            w.c r0 = r5.f51511m
            w.f r0 = r0.f51491a
            java.lang.Object r0 = r0.b()
            w.b r0 = (w.C2897b) r0
            if (r0 != 0) goto L1f
            w.d$b r0 = new w.d$b
            w.c r3 = r5.f51511m
            r0.<init>(r3)
            long r3 = w.C2899d.f51498t
            long r3 = r3 + r1
            w.C2899d.f51498t = r3
            goto L3b
        L1f:
            r0.z()
            goto L3b
        L23:
            w.c r0 = r5.f51511m
            w.f r0 = r0.f51492b
            java.lang.Object r0 = r0.b()
            w.b r0 = (w.C2897b) r0
            if (r0 != 0) goto L1f
            w.b r0 = new w.b
            w.c r3 = r5.f51511m
            r0.<init>(r3)
            long r3 = w.C2899d.f51497s
            long r3 = r3 + r1
            w.C2899d.f51497s = r3
        L3b:
            w.i.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C2899d.r():w.b");
    }

    public i t() {
        if (this.f51508j + 1 >= this.f51503e) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i9 = this.f51499a + 1;
        this.f51499a = i9;
        this.f51508j++;
        iVarA.f51531c = i9;
        this.f51511m.f51494d[i9] = iVarA;
        return iVarA;
    }

    public final int u(a aVar) {
        for (int i9 = 0; i9 < this.f51509k; i9++) {
            C2897b c2897b = this.f51504f[i9];
            if (c2897b.f51485a.f51538j != i.a.UNRESTRICTED && c2897b.f51486b < 0.0f) {
                boolean z9 = false;
                int i10 = 0;
                while (!z9) {
                    i10++;
                    float f9 = Float.MAX_VALUE;
                    int i11 = 0;
                    int i12 = -1;
                    int i13 = -1;
                    int i14 = 0;
                    while (true) {
                        if (i11 >= this.f51509k) {
                            break;
                        }
                        C2897b c2897b2 = this.f51504f[i11];
                        if (c2897b2.f51485a.f51538j != i.a.UNRESTRICTED && !c2897b2.f51490f && c2897b2.f51486b < 0.0f) {
                            for (int i15 = 1; i15 < this.f51508j; i15++) {
                                i iVar = this.f51511m.f51494d[i15];
                                float f10 = c2897b2.f51489e.f(iVar);
                                if (f10 > 0.0f) {
                                    for (int i16 = 0; i16 < 9; i16++) {
                                        float f11 = iVar.f51536h[i16] / f10;
                                        if ((f11 < f9 && i16 == i14) || i16 > i14) {
                                            f9 = f11;
                                            i12 = i11;
                                            i13 = i15;
                                            i14 = i16;
                                        }
                                    }
                                }
                            }
                        }
                        i11++;
                    }
                    if (i12 != -1) {
                        C2897b c2897b3 = this.f51504f[i12];
                        c2897b3.f51485a.f51532d = -1;
                        c2897b3.y(this.f51511m.f51494d[i13]);
                        i iVar2 = c2897b3.f51485a;
                        iVar2.f51532d = i12;
                        iVar2.g(c2897b3);
                    } else {
                        z9 = true;
                    }
                    if (i10 > this.f51508j / 2) {
                        z9 = true;
                    }
                }
                return i10;
            }
        }
        return 0;
    }

    public C2898c v() {
        return this.f51511m;
    }

    public int x(Object obj) {
        i iVarE = ((x.d) obj).e();
        if (iVarE != null) {
            return (int) (iVarE.f51534f + 0.5f);
        }
        return 0;
    }

    public final void y() {
        int i9 = this.f51502d * 2;
        this.f51502d = i9;
        this.f51504f = (C2897b[]) Arrays.copyOf(this.f51504f, i9);
        C2898c c2898c = this.f51511m;
        c2898c.f51494d = (i[]) Arrays.copyOf(c2898c.f51494d, this.f51502d);
        int i10 = this.f51502d;
        this.f51507i = new boolean[i10];
        this.f51503e = i10;
        this.f51510l = i10;
    }

    public void z() {
        if (this.f51505g || this.f51506h) {
            for (int i9 = 0; i9 < this.f51509k; i9++) {
                if (this.f51504f[i9].f51490f) {
                }
            }
            n();
            return;
        }
        A(this.f51501c);
    }
}

package n3;

import O2.C0936z0;
import android.util.SparseArray;
import d3.InterfaceC1674k;
import d4.AbstractC1684a;
import d4.AbstractC1689f;
import d4.G;
import d4.M;
import d4.N;
import d4.k0;
import java.util.ArrayList;
import java.util.Arrays;
import n3.I;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f45116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f45118c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f45122g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f45124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d3.w f45125j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f45126k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45127l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f45129n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f45123h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f45119d = new u(7, 128);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f45120e = new u(8, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f45121f = new u(6, 128);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f45128m = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final M f45130o = new M();

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d3.w f45131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f45132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f45133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray f45134d = new SparseArray();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray f45135e = new SparseArray();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final N f45136f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f45137g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f45138h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f45139i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f45140j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f45141k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f45142l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public a f45143m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public a f45144n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f45145o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f45146p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f45147q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f45148r;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f45149a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f45150b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public G.c f45151c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f45152d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f45153e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f45154f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f45155g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f45156h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f45157i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public boolean f45158j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean f45159k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f45160l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f45161m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f45162n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public int f45163o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public int f45164p;

            public a() {
            }

            public void b() {
                this.f45150b = false;
                this.f45149a = false;
            }

            public final boolean c(a aVar) {
                int i9;
                int i10;
                int i11;
                boolean z9;
                if (!this.f45149a) {
                    return false;
                }
                if (!aVar.f45149a) {
                    return true;
                }
                G.c cVar = (G.c) AbstractC1684a.i(this.f45151c);
                G.c cVar2 = (G.c) AbstractC1684a.i(aVar.f45151c);
                return (this.f45154f == aVar.f45154f && this.f45155g == aVar.f45155g && this.f45156h == aVar.f45156h && (!this.f45157i || !aVar.f45157i || this.f45158j == aVar.f45158j) && (((i9 = this.f45152d) == (i10 = aVar.f45152d) || (i9 != 0 && i10 != 0)) && (((i11 = cVar.f39685l) != 0 || cVar2.f39685l != 0 || (this.f45161m == aVar.f45161m && this.f45162n == aVar.f45162n)) && ((i11 != 1 || cVar2.f39685l != 1 || (this.f45163o == aVar.f45163o && this.f45164p == aVar.f45164p)) && (z9 = this.f45159k) == aVar.f45159k && (!z9 || this.f45160l == aVar.f45160l))))) ? false : true;
            }

            public boolean d() {
                int i9;
                return this.f45150b && ((i9 = this.f45153e) == 7 || i9 == 2);
            }

            public void e(G.c cVar, int i9, int i10, int i11, int i12, boolean z9, boolean z10, boolean z11, boolean z12, int i13, int i14, int i15, int i16, int i17) {
                this.f45151c = cVar;
                this.f45152d = i9;
                this.f45153e = i10;
                this.f45154f = i11;
                this.f45155g = i12;
                this.f45156h = z9;
                this.f45157i = z10;
                this.f45158j = z11;
                this.f45159k = z12;
                this.f45160l = i13;
                this.f45161m = i14;
                this.f45162n = i15;
                this.f45163o = i16;
                this.f45164p = i17;
                this.f45149a = true;
                this.f45150b = true;
            }

            public void f(int i9) {
                this.f45153e = i9;
                this.f45150b = true;
            }
        }

        public b(d3.w wVar, boolean z9, boolean z10) {
            this.f45131a = wVar;
            this.f45132b = z9;
            this.f45133c = z10;
            this.f45143m = new a();
            this.f45144n = new a();
            byte[] bArr = new byte[128];
            this.f45137g = bArr;
            this.f45136f = new N(bArr, 0, 0);
            g();
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0155  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instruction units count: 410
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: n3.p.b.a(byte[], int, int):void");
        }

        public boolean b(long j9, int i9, boolean z9, boolean z10) {
            boolean z11 = false;
            if (this.f45139i == 9 || (this.f45133c && this.f45144n.c(this.f45143m))) {
                if (z9 && this.f45145o) {
                    d(i9 + ((int) (j9 - this.f45140j)));
                }
                this.f45146p = this.f45140j;
                this.f45147q = this.f45142l;
                this.f45148r = false;
                this.f45145o = true;
            }
            if (this.f45132b) {
                z10 = this.f45144n.d();
            }
            boolean z12 = this.f45148r;
            int i10 = this.f45139i;
            if (i10 == 5 || (z10 && i10 == 1)) {
                z11 = true;
            }
            boolean z13 = z12 | z11;
            this.f45148r = z13;
            return z13;
        }

        public boolean c() {
            return this.f45133c;
        }

        public final void d(int i9) {
            long j9 = this.f45147q;
            if (j9 == -9223372036854775807L) {
                return;
            }
            boolean z9 = this.f45148r;
            this.f45131a.f(j9, z9 ? 1 : 0, (int) (this.f45140j - this.f45146p), i9, null);
        }

        public void e(G.b bVar) {
            this.f45135e.append(bVar.f39671a, bVar);
        }

        public void f(G.c cVar) {
            this.f45134d.append(cVar.f39677d, cVar);
        }

        public void g() {
            this.f45141k = false;
            this.f45145o = false;
            this.f45144n.b();
        }

        public void h(long j9, int i9, long j10) {
            this.f45139i = i9;
            this.f45142l = j10;
            this.f45140j = j9;
            if (!this.f45132b || i9 != 1) {
                if (!this.f45133c) {
                    return;
                }
                if (i9 != 5 && i9 != 1 && i9 != 2) {
                    return;
                }
            }
            a aVar = this.f45143m;
            this.f45143m = this.f45144n;
            this.f45144n = aVar;
            aVar.b();
            this.f45138h = 0;
            this.f45141k = true;
        }
    }

    public p(D d9, boolean z9, boolean z10) {
        this.f45116a = d9;
        this.f45117b = z9;
        this.f45118c = z10;
    }

    private void a() {
        AbstractC1684a.i(this.f45125j);
        k0.j(this.f45126k);
    }

    @Override // n3.m
    public void b(M m9) {
        a();
        int iF = m9.f();
        int iG = m9.g();
        byte[] bArrE = m9.e();
        this.f45122g += (long) m9.a();
        this.f45125j.b(m9, m9.a());
        while (true) {
            int iC = d4.G.c(bArrE, iF, iG, this.f45123h);
            if (iC == iG) {
                h(bArrE, iF, iG);
                return;
            }
            int iF2 = d4.G.f(bArrE, iC);
            int i9 = iC - iF;
            if (i9 > 0) {
                h(bArrE, iF, iC);
            }
            int i10 = iG - iC;
            long j9 = this.f45122g - ((long) i10);
            g(j9, i10, i9 < 0 ? -i9 : 0, this.f45128m);
            i(j9, iF2, this.f45128m);
            iF = iC + 3;
        }
    }

    @Override // n3.m
    public void c() {
        this.f45122g = 0L;
        this.f45129n = false;
        this.f45128m = -9223372036854775807L;
        d4.G.a(this.f45123h);
        this.f45119d.d();
        this.f45120e.d();
        this.f45121f.d();
        b bVar = this.f45126k;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // n3.m
    public void d() {
    }

    @Override // n3.m
    public void e(long j9, int i9) {
        if (j9 != -9223372036854775807L) {
            this.f45128m = j9;
        }
        this.f45129n |= (i9 & 2) != 0;
    }

    @Override // n3.m
    public void f(InterfaceC1674k interfaceC1674k, I.d dVar) {
        dVar.a();
        this.f45124i = dVar.b();
        d3.w wVarE = interfaceC1674k.e(dVar.c(), 2);
        this.f45125j = wVarE;
        this.f45126k = new b(wVarE, this.f45117b, this.f45118c);
        this.f45116a.b(interfaceC1674k, dVar);
    }

    public final void g(long j9, int i9, int i10, long j10) {
        u uVar;
        if (!this.f45127l || this.f45126k.c()) {
            this.f45119d.b(i10);
            this.f45120e.b(i10);
            if (this.f45127l) {
                if (this.f45119d.c()) {
                    u uVar2 = this.f45119d;
                    this.f45126k.f(d4.G.l(uVar2.f45234d, 3, uVar2.f45235e));
                    uVar = this.f45119d;
                } else if (this.f45120e.c()) {
                    u uVar3 = this.f45120e;
                    this.f45126k.e(d4.G.j(uVar3.f45234d, 3, uVar3.f45235e));
                    uVar = this.f45120e;
                }
            } else if (this.f45119d.c() && this.f45120e.c()) {
                ArrayList arrayList = new ArrayList();
                u uVar4 = this.f45119d;
                arrayList.add(Arrays.copyOf(uVar4.f45234d, uVar4.f45235e));
                u uVar5 = this.f45120e;
                arrayList.add(Arrays.copyOf(uVar5.f45234d, uVar5.f45235e));
                u uVar6 = this.f45119d;
                G.c cVarL = d4.G.l(uVar6.f45234d, 3, uVar6.f45235e);
                u uVar7 = this.f45120e;
                G.b bVarJ = d4.G.j(uVar7.f45234d, 3, uVar7.f45235e);
                this.f45125j.d(new C0936z0.b().U(this.f45124i).g0("video/avc").K(AbstractC1689f.a(cVarL.f39674a, cVarL.f39675b, cVarL.f39676c)).n0(cVarL.f39679f).S(cVarL.f39680g).c0(cVarL.f39681h).V(arrayList).G());
                this.f45127l = true;
                this.f45126k.f(cVarL);
                this.f45126k.e(bVarJ);
                this.f45119d.d();
                uVar = this.f45120e;
            }
            uVar.d();
        }
        if (this.f45121f.b(i10)) {
            u uVar8 = this.f45121f;
            this.f45130o.S(this.f45121f.f45234d, d4.G.q(uVar8.f45234d, uVar8.f45235e));
            this.f45130o.U(4);
            this.f45116a.a(j10, this.f45130o);
        }
        if (this.f45126k.b(j9, i9, this.f45127l, this.f45129n)) {
            this.f45129n = false;
        }
    }

    public final void h(byte[] bArr, int i9, int i10) {
        if (!this.f45127l || this.f45126k.c()) {
            this.f45119d.a(bArr, i9, i10);
            this.f45120e.a(bArr, i9, i10);
        }
        this.f45121f.a(bArr, i9, i10);
        this.f45126k.a(bArr, i9, i10);
    }

    public final void i(long j9, int i9, long j10) {
        if (!this.f45127l || this.f45126k.c()) {
            this.f45119d.e(i9);
            this.f45120e.e(i9);
        }
        this.f45121f.e(i9);
        this.f45126k.h(j9, i9, j10);
    }
}

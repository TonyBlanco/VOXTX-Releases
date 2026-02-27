package P2;

import B3.C;
import B3.C0512u;
import B3.C0515x;
import O2.C0909p1;
import O2.C0917s1;
import O2.C0921u;
import O2.C0927w;
import O2.C0936z0;
import O2.H0;
import O2.InterfaceC0920t1;
import O2.Q1;
import O2.R0;
import O2.V1;
import P2.InterfaceC0986c;
import Q2.C1019e;
import V2.AbstractC1059p;
import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import d4.AbstractC1684a;
import d4.C1680A;
import d4.C1701s;
import d4.InterfaceC1688e;
import d4.InterfaceC1705w;
import e4.C1737C;
import java.io.IOException;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import q3.C2540a;
import s5.AbstractC2717A;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public class p0 implements InterfaceC0984a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1688e f7079a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q1.b f7080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q1.d f7081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f7082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray f7083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1680A f7084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC0920t1 f7085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC1705w f7086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7087j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Q1.b f7088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AbstractC2743y f7089b = AbstractC2743y.z();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AbstractC2717A f7090c = AbstractC2717A.k();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C.b f7091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C.b f7092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public C.b f7093f;

        public a(Q1.b bVar) {
            this.f7088a = bVar;
        }

        public static C.b c(InterfaceC0920t1 interfaceC0920t1, AbstractC2743y abstractC2743y, C.b bVar, Q1.b bVar2) {
            Q1 q1W = interfaceC0920t1.w();
            int iJ = interfaceC0920t1.J();
            Object objR = q1W.v() ? null : q1W.r(iJ);
            int iG = (interfaceC0920t1.d() || q1W.v()) ? -1 : q1W.k(iJ, bVar2).g(d4.k0.P0(interfaceC0920t1.getCurrentPosition()) - bVar2.t());
            for (int i9 = 0; i9 < abstractC2743y.size(); i9++) {
                C.b bVar3 = (C.b) abstractC2743y.get(i9);
                if (i(bVar3, objR, interfaceC0920t1.d(), interfaceC0920t1.s(), interfaceC0920t1.N(), iG)) {
                    return bVar3;
                }
            }
            if (abstractC2743y.isEmpty() && bVar != null) {
                if (i(bVar, objR, interfaceC0920t1.d(), interfaceC0920t1.s(), interfaceC0920t1.N(), iG)) {
                    return bVar;
                }
            }
            return null;
        }

        public static boolean i(C.b bVar, Object obj, boolean z9, int i9, int i10, int i11) {
            if (bVar.f271a.equals(obj)) {
                return (z9 && bVar.f272b == i9 && bVar.f273c == i10) || (!z9 && bVar.f272b == -1 && bVar.f275e == i11);
            }
            return false;
        }

        public final void b(AbstractC2717A.a aVar, C.b bVar, Q1 q12) {
            if (bVar == null) {
                return;
            }
            if (q12.f(bVar.f271a) == -1 && (q12 = (Q1) this.f7090c.get(bVar)) == null) {
                return;
            }
            aVar.f(bVar, q12);
        }

        public C.b d() {
            return this.f7091d;
        }

        public C.b e() {
            if (this.f7089b.isEmpty()) {
                return null;
            }
            return (C.b) s5.D.d(this.f7089b);
        }

        public Q1 f(C.b bVar) {
            return (Q1) this.f7090c.get(bVar);
        }

        public C.b g() {
            return this.f7092e;
        }

        public C.b h() {
            return this.f7093f;
        }

        public void j(InterfaceC0920t1 interfaceC0920t1) {
            this.f7091d = c(interfaceC0920t1, this.f7089b, this.f7092e, this.f7088a);
        }

        public void k(List list, C.b bVar, InterfaceC0920t1 interfaceC0920t1) {
            this.f7089b = AbstractC2743y.r(list);
            if (!list.isEmpty()) {
                this.f7092e = (C.b) list.get(0);
                this.f7093f = (C.b) AbstractC1684a.e(bVar);
            }
            if (this.f7091d == null) {
                this.f7091d = c(interfaceC0920t1, this.f7089b, this.f7092e, this.f7088a);
            }
            m(interfaceC0920t1.w());
        }

        public void l(InterfaceC0920t1 interfaceC0920t1) {
            this.f7091d = c(interfaceC0920t1, this.f7089b, this.f7092e, this.f7088a);
            m(interfaceC0920t1.w());
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m(O2.Q1 r4) {
            /*
                r3 = this;
                s5.A$a r0 = s5.AbstractC2717A.a()
                s5.y r1 = r3.f7089b
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L3a
                B3.C$b r1 = r3.f7092e
                r3.b(r0, r1, r4)
                B3.C$b r1 = r3.f7093f
                B3.C$b r2 = r3.f7092e
                boolean r1 = r5.j.a(r1, r2)
                if (r1 != 0) goto L20
                B3.C$b r1 = r3.f7093f
                r3.b(r0, r1, r4)
            L20:
                B3.C$b r1 = r3.f7091d
                B3.C$b r2 = r3.f7092e
                boolean r1 = r5.j.a(r1, r2)
                if (r1 != 0) goto L5c
                B3.C$b r1 = r3.f7091d
                B3.C$b r2 = r3.f7093f
                boolean r1 = r5.j.a(r1, r2)
                if (r1 != 0) goto L5c
            L34:
                B3.C$b r1 = r3.f7091d
                r3.b(r0, r1, r4)
                goto L5c
            L3a:
                r1 = 0
            L3b:
                s5.y r2 = r3.f7089b
                int r2 = r2.size()
                if (r1 >= r2) goto L51
                s5.y r2 = r3.f7089b
                java.lang.Object r2 = r2.get(r1)
                B3.C$b r2 = (B3.C.b) r2
                r3.b(r0, r2, r4)
                int r1 = r1 + 1
                goto L3b
            L51:
                s5.y r1 = r3.f7089b
                B3.C$b r2 = r3.f7091d
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L5c
                goto L34
            L5c:
                s5.A r4 = r0.c()
                r3.f7090c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: P2.p0.a.m(O2.Q1):void");
        }
    }

    public p0(InterfaceC1688e interfaceC1688e) {
        this.f7079a = (InterfaceC1688e) AbstractC1684a.e(interfaceC1688e);
        this.f7084g = new C1680A(d4.k0.S(), interfaceC1688e, new C1680A.b() { // from class: P2.A
            @Override // d4.C1680A.b
            public final void a(Object obj, C1701s c1701s) {
                p0.H1((InterfaceC0986c) obj, c1701s);
            }
        });
        Q1.b bVar = new Q1.b();
        this.f7080c = bVar;
        this.f7081d = new Q1.d();
        this.f7082e = new a(bVar);
        this.f7083f = new SparseArray();
    }

    public static /* synthetic */ void H1(InterfaceC0986c interfaceC0986c, C1701s c1701s) {
    }

    public static /* synthetic */ void I2(InterfaceC0986c.a aVar, String str, long j9, long j10, InterfaceC0986c interfaceC0986c) {
        interfaceC0986c.u(aVar, str, j9);
        interfaceC0986c.t0(aVar, str, j10, j9);
    }

    public static /* synthetic */ void L1(InterfaceC0986c.a aVar, String str, long j9, long j10, InterfaceC0986c interfaceC0986c) {
        interfaceC0986c.g0(aVar, str, j9);
        interfaceC0986c.s(aVar, str, j10, j9);
    }

    public static /* synthetic */ void N2(InterfaceC0986c.a aVar, C0936z0 c0936z0, U2.h hVar, InterfaceC0986c interfaceC0986c) {
        interfaceC0986c.R(aVar, c0936z0);
        interfaceC0986c.a(aVar, c0936z0, hVar);
    }

    public static /* synthetic */ void O2(InterfaceC0986c.a aVar, C1737C c1737c, InterfaceC0986c interfaceC0986c) {
        interfaceC0986c.o0(aVar, c1737c);
        interfaceC0986c.O(aVar, c1737c.f40178a, c1737c.f40179c, c1737c.f40180d, c1737c.f40181e);
    }

    public static /* synthetic */ void P1(InterfaceC0986c.a aVar, C0936z0 c0936z0, U2.h hVar, InterfaceC0986c interfaceC0986c) {
        interfaceC0986c.n0(aVar, c0936z0);
        interfaceC0986c.l(aVar, c0936z0, hVar);
    }

    public static /* synthetic */ void d2(InterfaceC0986c.a aVar, int i9, InterfaceC0986c interfaceC0986c) {
        interfaceC0986c.f(aVar);
        interfaceC0986c.X(aVar, i9);
    }

    public static /* synthetic */ void h2(InterfaceC0986c.a aVar, boolean z9, InterfaceC0986c interfaceC0986c) {
        interfaceC0986c.P(aVar, z9);
        interfaceC0986c.g(aVar, z9);
    }

    public static /* synthetic */ void x2(InterfaceC0986c.a aVar, int i9, InterfaceC0920t1.e eVar, InterfaceC0920t1.e eVar2, InterfaceC0986c interfaceC0986c) {
        interfaceC0986c.e(aVar, i9);
        interfaceC0986c.p(aVar, eVar, eVar2, i9);
    }

    @Override // O2.InterfaceC0920t1.d
    public final void A(final C1019e c1019e) {
        final InterfaceC0986c.a aVarF1 = F1();
        S2(aVarF1, 20, new C1680A.a() { // from class: P2.m0
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).M(aVarF1, c1019e);
            }
        });
    }

    public final InterfaceC0986c.a A1(C.b bVar) {
        AbstractC1684a.e(this.f7085h);
        Q1 q1F = bVar == null ? null : this.f7082e.f(bVar);
        if (bVar != null && q1F != null) {
            return B1(q1F, q1F.m(bVar.f271a, this.f7080c).f5718d, bVar);
        }
        int iX = this.f7085h.X();
        Q1 q1W = this.f7085h.w();
        if (iX >= q1W.u()) {
            q1W = Q1.f5705a;
        }
        return B1(q1W, iX, null);
    }

    @Override // O2.InterfaceC0920t1.d
    public void B(boolean z9) {
    }

    public final InterfaceC0986c.a B1(Q1 q12, int i9, C.b bVar) {
        C.b bVar2 = q12.v() ? null : bVar;
        long jB = this.f7079a.b();
        boolean z9 = q12.equals(this.f7085h.w()) && i9 == this.f7085h.X();
        long jD = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z9) {
                jD = this.f7085h.R();
            } else if (!q12.v()) {
                jD = q12.s(i9, this.f7081d).d();
            }
        } else if (z9 && this.f7085h.s() == bVar2.f272b && this.f7085h.N() == bVar2.f273c) {
            jD = this.f7085h.getCurrentPosition();
        }
        return new InterfaceC0986c.a(jB, q12, i9, bVar2, jD, this.f7085h.w(), this.f7085h.X(), this.f7082e.d(), this.f7085h.getCurrentPosition(), this.f7085h.e());
    }

    @Override // V2.InterfaceC1065w
    public final void C(int i9, C.b bVar) {
        final InterfaceC0986c.a aVarD1 = D1(i9, bVar);
        S2(aVarD1, 1025, new C1680A.a() { // from class: P2.i0
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).c(aVarD1);
            }
        });
    }

    public final InterfaceC0986c.a C1() {
        return A1(this.f7082e.e());
    }

    @Override // B3.J
    public final void D(int i9, C.b bVar, final C0512u c0512u, final C0515x c0515x) {
        final InterfaceC0986c.a aVarD1 = D1(i9, bVar);
        S2(aVarD1, 1001, new C1680A.a() { // from class: P2.j
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).y(aVarD1, c0512u, c0515x);
            }
        });
    }

    public final InterfaceC0986c.a D1(int i9, C.b bVar) {
        AbstractC1684a.e(this.f7085h);
        if (bVar != null) {
            return this.f7082e.f(bVar) != null ? A1(bVar) : B1(Q1.f5705a, i9, bVar);
        }
        Q1 q1W = this.f7085h.w();
        if (i9 >= q1W.u()) {
            q1W = Q1.f5705a;
        }
        return B1(q1W, i9, null);
    }

    @Override // O2.InterfaceC0920t1.d
    public final void E(final int i9) {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 4, new C1680A.a() { // from class: P2.x
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).V(aVarZ1, i9);
            }
        });
    }

    public final InterfaceC0986c.a E1() {
        return A1(this.f7082e.g());
    }

    @Override // b4.InterfaceC1215f.a
    public final void F(final int i9, final long j9, final long j10) {
        final InterfaceC0986c.a aVarC1 = C1();
        S2(aVarC1, 1006, new C1680A.a() { // from class: P2.j0
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).i0(aVarC1, i9, j9, j10);
            }
        });
    }

    public final InterfaceC0986c.a F1() {
        return A1(this.f7082e.h());
    }

    @Override // V2.InterfaceC1065w
    public final void G(int i9, C.b bVar) {
        final InterfaceC0986c.a aVarD1 = D1(i9, bVar);
        S2(aVarD1, 1026, new C1680A.a() { // from class: P2.b0
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).m(aVarD1);
            }
        });
    }

    public final InterfaceC0986c.a G1(C0909p1 c0909p1) {
        B3.A a9;
        return (!(c0909p1 instanceof C0927w) || (a9 = ((C0927w) c0909p1).f6356o) == null) ? z1() : A1(new C.b(a9));
    }

    @Override // P2.InterfaceC0984a
    public final void H() {
        if (this.f7087j) {
            return;
        }
        final InterfaceC0986c.a aVarZ1 = z1();
        this.f7087j = true;
        S2(aVarZ1, -1, new C1680A.a() { // from class: P2.l
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).i(aVarZ1);
            }
        });
    }

    @Override // B3.J
    public final void I(int i9, C.b bVar, final C0512u c0512u, final C0515x c0515x) {
        final InterfaceC0986c.a aVarD1 = D1(i9, bVar);
        S2(aVarD1, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, new C1680A.a() { // from class: P2.h0
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).p0(aVarD1, c0512u, c0515x);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public final void J(final boolean z9) {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 9, new C1680A.a() { // from class: P2.e
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).b0(aVarZ1, z9);
            }
        });
    }

    @Override // V2.InterfaceC1065w
    public /* synthetic */ void K(int i9, C.b bVar) {
        AbstractC1059p.a(this, i9, bVar);
    }

    @Override // B3.J
    public final void L(int i9, C.b bVar, final C0512u c0512u, final C0515x c0515x, final IOException iOException, final boolean z9) {
        final InterfaceC0986c.a aVarD1 = D1(i9, bVar);
        S2(aVarD1, 1003, new C1680A.a() { // from class: P2.q
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).a0(aVarD1, c0512u, c0515x, iOException, z9);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public void M(final int i9, final boolean z9) {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 30, new C1680A.a() { // from class: P2.Y
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).m0(aVarZ1, i9, z9);
            }
        });
    }

    @Override // V2.InterfaceC1065w
    public final void N(int i9, C.b bVar, final int i10) {
        final InterfaceC0986c.a aVarD1 = D1(i9, bVar);
        S2(aVarD1, 1022, new C1680A.a() { // from class: P2.V
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                p0.d2(aVarD1, i10, (InterfaceC0986c) obj);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public void O(final InterfaceC0920t1.b bVar) {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 13, new C1680A.a() { // from class: P2.u
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).w(aVarZ1, bVar);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public void P() {
    }

    @Override // V2.InterfaceC1065w
    public final void Q(int i9, C.b bVar, final Exception exc) {
        final InterfaceC0986c.a aVarD1 = D1(i9, bVar);
        S2(aVarD1, 1024, new C1680A.a() { // from class: P2.Q
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).W(aVarD1, exc);
            }
        });
    }

    public final /* synthetic */ void Q2(InterfaceC0920t1 interfaceC0920t1, InterfaceC0986c interfaceC0986c, C1701s c1701s) {
        interfaceC0986c.u0(interfaceC0920t1, new InterfaceC0986c.b(c1701s, this.f7083f));
    }

    @Override // B3.J
    public final void R(int i9, C.b bVar, final C0512u c0512u, final C0515x c0515x) {
        final InterfaceC0986c.a aVarD1 = D1(i9, bVar);
        S2(aVarD1, 1000, new C1680A.a() { // from class: P2.K
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).d(aVarD1, c0512u, c0515x);
            }
        });
    }

    public final void R2() {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 1028, new C1680A.a() { // from class: P2.f0
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).Q(aVarZ1);
            }
        });
        this.f7084g.j();
    }

    @Override // O2.InterfaceC0920t1.d
    public final void S(final InterfaceC0920t1.e eVar, final InterfaceC0920t1.e eVar2, final int i9) {
        if (i9 == 1) {
            this.f7087j = false;
        }
        this.f7082e.j((InterfaceC0920t1) AbstractC1684a.e(this.f7085h));
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 11, new C1680A.a() { // from class: P2.S
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                p0.x2(aVarZ1, i9, eVar, eVar2, (InterfaceC0986c) obj);
            }
        });
    }

    public final void S2(InterfaceC0986c.a aVar, int i9, C1680A.a aVar2) {
        this.f7083f.put(i9, aVar);
        this.f7084g.l(i9, aVar2);
    }

    @Override // V2.InterfaceC1065w
    public final void T(int i9, C.b bVar) {
        final InterfaceC0986c.a aVarD1 = D1(i9, bVar);
        S2(aVarD1, 1023, new C1680A.a() { // from class: P2.g0
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).k0(aVarD1);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public final void U(final int i9, final int i10) {
        final InterfaceC0986c.a aVarF1 = F1();
        S2(aVarF1, 24, new C1680A.a() { // from class: P2.p
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).o(aVarF1, i9, i10);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public final void V(Q1 q12, final int i9) {
        this.f7082e.l((InterfaceC0920t1) AbstractC1684a.e(this.f7085h));
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 0, new C1680A.a() { // from class: P2.U
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).e0(aVarZ1, i9);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public void W(final C0909p1 c0909p1) {
        final InterfaceC0986c.a aVarG1 = G1(c0909p1);
        S2(aVarG1, 10, new C1680A.a() { // from class: P2.L
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).r0(aVarG1, c0909p1);
            }
        });
    }

    @Override // P2.InterfaceC0984a
    public void X(InterfaceC0986c interfaceC0986c) {
        AbstractC1684a.e(interfaceC0986c);
        this.f7084g.c(interfaceC0986c);
    }

    @Override // O2.InterfaceC0920t1.d
    public void Y(final Z3.z zVar) {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 19, new C1680A.a() { // from class: P2.B
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).h(aVarZ1, zVar);
            }
        });
    }

    @Override // B3.J
    public final void Z(int i9, C.b bVar, final C0515x c0515x) {
        final InterfaceC0986c.a aVarD1 = D1(i9, bVar);
        S2(aVarD1, 1004, new C1680A.a() { // from class: P2.n
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).Y(aVarD1, c0515x);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public final void a(final boolean z9) {
        final InterfaceC0986c.a aVarF1 = F1();
        S2(aVarF1, 23, new C1680A.a() { // from class: P2.k0
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).l0(aVarF1, z9);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public void a0(final C0921u c0921u) {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 29, new C1680A.a() { // from class: P2.X
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).J(aVarZ1, c0921u);
            }
        });
    }

    @Override // P2.InterfaceC0984a
    public final void b(final Exception exc) {
        final InterfaceC0986c.a aVarF1 = F1();
        S2(aVarF1, 1014, new C1680A.a() { // from class: P2.N
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).j(aVarF1, exc);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public void b0(int i9) {
    }

    @Override // P2.InterfaceC0984a
    public final void c(final String str) {
        final InterfaceC0986c.a aVarF1 = F1();
        S2(aVarF1, 1019, new C1680A.a() { // from class: P2.a0
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).N(aVarF1, str);
            }
        });
    }

    @Override // V2.InterfaceC1065w
    public final void c0(int i9, C.b bVar) {
        final InterfaceC0986c.a aVarD1 = D1(i9, bVar);
        S2(aVarD1, 1027, new C1680A.a() { // from class: P2.G
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).L(aVarD1);
            }
        });
    }

    @Override // P2.InterfaceC0984a
    public final void d(final String str, final long j9, final long j10) {
        final InterfaceC0986c.a aVarF1 = F1();
        S2(aVarF1, 1016, new C1680A.a() { // from class: P2.y
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                p0.I2(aVarF1, str, j10, j9, (InterfaceC0986c) obj);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public final void d0(final boolean z9) {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 3, new C1680A.a() { // from class: P2.W
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                p0.h2(aVarZ1, z9, (InterfaceC0986c) obj);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public final void e(final C2540a c2540a) {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 28, new C1680A.a() { // from class: P2.Z
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).d0(aVarZ1, c2540a);
            }
        });
    }

    @Override // P2.InterfaceC0984a
    public final void e0(List list, C.b bVar) {
        this.f7082e.k(list, bVar, (InterfaceC0920t1) AbstractC1684a.e(this.f7085h));
    }

    @Override // P2.InterfaceC0984a
    public final void f(final String str) {
        final InterfaceC0986c.a aVarF1 = F1();
        S2(aVarF1, 1012, new C1680A.a() { // from class: P2.D
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).Z(aVarF1, str);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public void f0(final V1 v12) {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 2, new C1680A.a() { // from class: P2.I
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).k(aVarZ1, v12);
            }
        });
    }

    @Override // P2.InterfaceC0984a
    public final void g(final String str, final long j9, final long j10) {
        final InterfaceC0986c.a aVarF1 = F1();
        S2(aVarF1, 1008, new C1680A.a() { // from class: P2.d
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                p0.L1(aVarF1, str, j10, j9, (InterfaceC0986c) obj);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public final void g0(final boolean z9, final int i9) {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, -1, new C1680A.a() { // from class: P2.k
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).f0(aVarZ1, z9, i9);
            }
        });
    }

    @Override // P2.InterfaceC0984a
    public final void h(final U2.e eVar) {
        final InterfaceC0986c.a aVarE1 = E1();
        S2(aVarE1, 1020, new C1680A.a() { // from class: P2.z
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).E(aVarE1, eVar);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public final void h0(final H0 h02, final int i9) {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 1, new C1680A.a() { // from class: P2.s
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).C(aVarZ1, h02, i9);
            }
        });
    }

    @Override // P2.InterfaceC0984a
    public final void i(final U2.e eVar) {
        final InterfaceC0986c.a aVarF1 = F1();
        S2(aVarF1, 1007, new C1680A.a() { // from class: P2.T
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).q(aVarF1, eVar);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public void i0(final R0 r02) {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 14, new C1680A.a() { // from class: P2.g
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).H(aVarZ1, r02);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public final void j(final C1737C c1737c) {
        final InterfaceC0986c.a aVarF1 = F1();
        S2(aVarF1, 25, new C1680A.a() { // from class: P2.c0
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                p0.O2(aVarF1, c1737c, (InterfaceC0986c) obj);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public final void j0(final boolean z9, final int i9) {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 5, new C1680A.a() { // from class: P2.o
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).j0(aVarZ1, z9, i9);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public void k(final List list) {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 27, new C1680A.a() { // from class: P2.H
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).q0(aVarZ1, list);
            }
        });
    }

    @Override // P2.InterfaceC0984a
    public void k0(final InterfaceC0920t1 interfaceC0920t1, Looper looper) {
        AbstractC1684a.g(this.f7085h == null || this.f7082e.f7089b.isEmpty());
        this.f7085h = (InterfaceC0920t1) AbstractC1684a.e(interfaceC0920t1);
        this.f7086i = this.f7079a.c(looper, null);
        this.f7084g = this.f7084g.e(looper, new C1680A.b() { // from class: P2.m
            @Override // d4.C1680A.b
            public final void a(Object obj, C1701s c1701s) {
                this.f7063a.Q2(interfaceC0920t1, (InterfaceC0986c) obj, c1701s);
            }
        });
    }

    @Override // P2.InterfaceC0984a
    public final void l(final long j9) {
        final InterfaceC0986c.a aVarF1 = F1();
        S2(aVarF1, 1010, new C1680A.a() { // from class: P2.F
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).c0(aVarF1, j9);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public final void l0(final C0909p1 c0909p1) {
        final InterfaceC0986c.a aVarG1 = G1(c0909p1);
        S2(aVarG1, 10, new C1680A.a() { // from class: P2.r
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).F(aVarG1, c0909p1);
            }
        });
    }

    @Override // P2.InterfaceC0984a
    public final void m(final Exception exc) {
        final InterfaceC0986c.a aVarF1 = F1();
        S2(aVarF1, 1030, new C1680A.a() { // from class: P2.n0
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).U(aVarF1, exc);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public void m0(InterfaceC0920t1 interfaceC0920t1, InterfaceC0920t1.c cVar) {
    }

    @Override // P2.InterfaceC0984a
    public final void n(final U2.e eVar) {
        final InterfaceC0986c.a aVarE1 = E1();
        S2(aVarE1, 1013, new C1680A.a() { // from class: P2.C
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).s0(aVarE1, eVar);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public void n0(final boolean z9) {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 7, new C1680A.a() { // from class: P2.l0
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).A(aVarZ1, z9);
            }
        });
    }

    @Override // B3.J
    public final void o(int i9, C.b bVar, final C0515x c0515x) {
        final InterfaceC0986c.a aVarD1 = D1(i9, bVar);
        S2(aVarD1, WebSocketProtocol.CLOSE_NO_STATUS_CODE, new C1680A.a() { // from class: P2.P
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).G(aVarD1, c0515x);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public final void onRepeatModeChanged(final int i9) {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 8, new C1680A.a() { // from class: P2.E
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).z(aVarZ1, i9);
            }
        });
    }

    @Override // P2.InterfaceC0984a
    public final void p(final U2.e eVar) {
        final InterfaceC0986c.a aVarF1 = F1();
        S2(aVarF1, 1015, new C1680A.a() { // from class: P2.w
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).T(aVarF1, eVar);
            }
        });
    }

    @Override // P2.InterfaceC0984a
    public final void q(final C0936z0 c0936z0, final U2.h hVar) {
        final InterfaceC0986c.a aVarF1 = F1();
        S2(aVarF1, 1017, new C1680A.a() { // from class: P2.v
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                p0.N2(aVarF1, c0936z0, hVar, (InterfaceC0986c) obj);
            }
        });
    }

    @Override // P2.InterfaceC0984a
    public final void r(final C0936z0 c0936z0, final U2.h hVar) {
        final InterfaceC0986c.a aVarF1 = F1();
        S2(aVarF1, 1009, new C1680A.a() { // from class: P2.f
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                p0.P1(aVarF1, c0936z0, hVar, (InterfaceC0986c) obj);
            }
        });
    }

    @Override // P2.InterfaceC0984a
    public void release() {
        ((InterfaceC1705w) AbstractC1684a.i(this.f7086i)).i(new Runnable() { // from class: P2.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f7041a.R2();
            }
        });
    }

    @Override // P2.InterfaceC0984a
    public final void s(final int i9, final long j9) {
        final InterfaceC0986c.a aVarE1 = E1();
        S2(aVarE1, 1018, new C1680A.a() { // from class: P2.J
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).h0(aVarE1, i9, j9);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public final void t(final C0917s1 c0917s1) {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 12, new C1680A.a() { // from class: P2.i
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).t(aVarZ1, c0917s1);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public void u(final P3.f fVar) {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 27, new C1680A.a() { // from class: P2.t
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).r(aVarZ1, fVar);
            }
        });
    }

    @Override // P2.InterfaceC0984a
    public final void v(final Object obj, final long j9) {
        final InterfaceC0986c.a aVarF1 = F1();
        S2(aVarF1, 26, new C1680A.a() { // from class: P2.d0
            @Override // d4.C1680A.a
            public final void invoke(Object obj2) {
                ((InterfaceC0986c) obj2).D(aVarF1, obj, j9);
            }
        });
    }

    @Override // P2.InterfaceC0984a
    public final void w(final Exception exc) {
        final InterfaceC0986c.a aVarF1 = F1();
        S2(aVarF1, 1029, new C1680A.a() { // from class: P2.o0
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).I(aVarF1, exc);
            }
        });
    }

    @Override // P2.InterfaceC0984a
    public final void x(final int i9, final long j9, final long j10) {
        final InterfaceC0986c.a aVarF1 = F1();
        S2(aVarF1, 1011, new C1680A.a() { // from class: P2.e0
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).B(aVarF1, i9, j9, j10);
            }
        });
    }

    @Override // P2.InterfaceC0984a
    public final void y(final long j9, final int i9) {
        final InterfaceC0986c.a aVarE1 = E1();
        S2(aVarE1, 1021, new C1680A.a() { // from class: P2.O
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).n(aVarE1, j9, i9);
            }
        });
    }

    @Override // O2.InterfaceC0920t1.d
    public final void z(final int i9) {
        final InterfaceC0986c.a aVarZ1 = z1();
        S2(aVarZ1, 6, new C1680A.a() { // from class: P2.M
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0986c) obj).K(aVarZ1, i9);
            }
        });
    }

    public final InterfaceC0986c.a z1() {
        return A1(this.f7082e.d());
    }
}

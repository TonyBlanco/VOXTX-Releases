package C3;

import B3.AbstractC0493a;
import B3.AbstractC0510s;
import B3.C;
import B3.C0512u;
import B3.C0515x;
import B3.InterfaceC0517z;
import B3.J;
import B3.Y;
import B3.g0;
import B3.i0;
import B3.r;
import C3.b;
import O2.A0;
import O2.C0936z0;
import O2.H0;
import O2.H1;
import O2.Q1;
import V2.AbstractC1059p;
import V2.InterfaceC1065w;
import Z3.s;
import android.os.Handler;
import android.util.Pair;
import b4.InterfaceC1211b;
import b4.S;
import d4.AbstractC1684a;
import d4.k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s5.AbstractC2717A;
import s5.C2726g;
import s5.D;
import s5.F;
import s5.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends AbstractC0493a implements C.c, J, InterfaceC1065w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C f1106i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f1110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Handler f1111n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e f1112o;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final F f1107j = C2726g.A();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AbstractC2717A f1113p = AbstractC2717A.k();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final J.a f1108k = f0(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC1065w.a f1109l = b0(null);

    public interface a {
        boolean o(Q1 q12);
    }

    public static final class b implements InterfaceC0517z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f1114a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C.b f1115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final J.a f1116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final InterfaceC1065w.a f1117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC0517z.a f1118f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f1119g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean[] f1120h = new boolean[0];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f1121i;

        public b(e eVar, C.b bVar, J.a aVar, InterfaceC1065w.a aVar2) {
            this.f1114a = eVar;
            this.f1115c = bVar;
            this.f1116d = aVar;
            this.f1117e = aVar2;
        }

        public void a() {
            InterfaceC0517z.a aVar = this.f1118f;
            if (aVar != null) {
                aVar.e(this);
            }
            this.f1121i = true;
        }

        @Override // B3.InterfaceC0517z, B3.Z
        public boolean b() {
            return this.f1114a.t(this);
        }

        @Override // B3.InterfaceC0517z, B3.Z
        public long c() {
            return this.f1114a.p(this);
        }

        @Override // B3.InterfaceC0517z
        public long d(long j9, H1 h12) {
            return this.f1114a.k(this, j9, h12);
        }

        @Override // B3.InterfaceC0517z, B3.Z
        public boolean f(long j9) {
            return this.f1114a.g(this, j9);
        }

        @Override // B3.InterfaceC0517z, B3.Z
        public long g() {
            return this.f1114a.l(this);
        }

        @Override // B3.InterfaceC0517z, B3.Z
        public void h(long j9) {
            this.f1114a.G(this, j9);
        }

        @Override // B3.InterfaceC0517z
        public long i(s[] sVarArr, boolean[] zArr, Y[] yArr, boolean[] zArr2, long j9) {
            if (this.f1120h.length == 0) {
                this.f1120h = new boolean[yArr.length];
            }
            return this.f1114a.K(this, sVarArr, zArr, yArr, zArr2, j9);
        }

        @Override // B3.InterfaceC0517z
        public List k(List list) {
            return this.f1114a.q(list);
        }

        @Override // B3.InterfaceC0517z
        public long l(long j9) {
            return this.f1114a.J(this, j9);
        }

        @Override // B3.InterfaceC0517z
        public long m() {
            return this.f1114a.F(this);
        }

        @Override // B3.InterfaceC0517z
        public void p() {
            this.f1114a.y();
        }

        @Override // B3.InterfaceC0517z
        public void s(InterfaceC0517z.a aVar, long j9) {
            this.f1118f = aVar;
            this.f1114a.D(this, j9);
        }

        @Override // B3.InterfaceC0517z
        public i0 u() {
            return this.f1114a.s();
        }

        @Override // B3.InterfaceC0517z
        public void v(long j9, boolean z9) {
            this.f1114a.h(this, j9, z9);
        }
    }

    public static final class c implements Y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f1122a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1123c;

        public c(b bVar, int i9) {
            this.f1122a = bVar;
            this.f1123c = i9;
        }

        @Override // B3.Y
        public void a() {
            this.f1122a.f1114a.x(this.f1123c);
        }

        @Override // B3.Y
        public boolean e() {
            return this.f1122a.f1114a.u(this.f1123c);
        }

        @Override // B3.Y
        public int n(long j9) {
            b bVar = this.f1122a;
            return bVar.f1114a.L(bVar, this.f1123c, j9);
        }

        @Override // B3.Y
        public int q(A0 a02, U2.g gVar, int i9) {
            b bVar = this.f1122a;
            return bVar.f1114a.E(bVar, this.f1123c, a02, gVar, i9);
        }
    }

    public static final class d extends AbstractC0510s {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AbstractC2717A f1124h;

        public d(Q1 q12, AbstractC2717A abstractC2717A) {
            super(q12);
            AbstractC1684a.g(q12.u() == 1);
            Q1.b bVar = new Q1.b();
            for (int i9 = 0; i9 < q12.n(); i9++) {
                q12.l(i9, bVar, true);
                AbstractC1684a.g(abstractC2717A.containsKey(AbstractC1684a.e(bVar.f5717c)));
            }
            this.f1124h = abstractC2717A;
        }

        @Override // B3.AbstractC0510s, O2.Q1
        public Q1.b l(int i9, Q1.b bVar, boolean z9) {
            super.l(i9, bVar, true);
            C3.b bVar2 = (C3.b) AbstractC1684a.e((C3.b) this.f1124h.get(bVar.f5717c));
            long j9 = bVar.f5719e;
            long jF = j9 == -9223372036854775807L ? bVar2.f1046e : n.f(j9, -1, bVar2);
            Q1.b bVar3 = new Q1.b();
            long jF2 = 0;
            for (int i10 = 0; i10 < i9 + 1; i10++) {
                this.f626g.l(i10, bVar3, true);
                C3.b bVar4 = (C3.b) AbstractC1684a.e((C3.b) this.f1124h.get(bVar3.f5717c));
                if (i10 == 0) {
                    jF2 = -n.f(-bVar3.t(), -1, bVar4);
                }
                if (i10 != i9) {
                    jF2 += n.f(bVar3.f5719e, -1, bVar4);
                }
            }
            bVar.z(bVar.f5716a, bVar.f5717c, bVar.f5718d, jF, jF2, bVar2, bVar.f5721g);
            return bVar;
        }

        @Override // B3.AbstractC0510s, O2.Q1
        public Q1.d t(int i9, Q1.d dVar, long j9) {
            super.t(i9, dVar, j9);
            Q1.b bVar = new Q1.b();
            C3.b bVar2 = (C3.b) AbstractC1684a.e((C3.b) this.f1124h.get(AbstractC1684a.e(l(dVar.f5758p, bVar, true).f5717c)));
            long jF = n.f(dVar.f5760r, -1, bVar2);
            if (dVar.f5757o == -9223372036854775807L) {
                long j10 = bVar2.f1046e;
                if (j10 != -9223372036854775807L) {
                    dVar.f5757o = j10 - jF;
                }
            } else {
                Q1.b bVarL = super.l(dVar.f5759q, bVar, true);
                long j11 = bVarL.f5720f;
                C3.b bVar3 = (C3.b) AbstractC1684a.e((C3.b) this.f1124h.get(bVarL.f5717c));
                Q1.b bVarK = k(dVar.f5759q, bVar);
                dVar.f5757o = bVarK.f5720f + n.f(dVar.f5757o - j11, -1, bVar3);
            }
            dVar.f5760r = jF;
            return dVar;
        }
    }

    public static final class e implements InterfaceC0517z.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0517z f1125a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f1128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public C3.b f1129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public b f1130g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f1131h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f1132i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f1126c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map f1127d = new HashMap();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public s[] f1133j = new s[0];

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Y[] f1134k = new Y[0];

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public C0515x[] f1135l = new C0515x[0];

        public e(InterfaceC0517z interfaceC0517z, Object obj, C3.b bVar) {
            this.f1125a = interfaceC0517z;
            this.f1128e = obj;
            this.f1129f = bVar;
        }

        public void A(b bVar, C0515x c0515x) {
            int i9 = i(c0515x);
            if (i9 != -1) {
                this.f1135l[i9] = c0515x;
                bVar.f1120h[i9] = true;
            }
        }

        public void B(C0512u c0512u) {
            this.f1127d.remove(Long.valueOf(c0512u.f633a));
        }

        public void C(C0512u c0512u, C0515x c0515x) {
            this.f1127d.put(Long.valueOf(c0512u.f633a), Pair.create(c0512u, c0515x));
        }

        public void D(b bVar, long j9) {
            bVar.f1119g = j9;
            if (this.f1131h) {
                if (this.f1132i) {
                    bVar.a();
                }
            } else {
                this.f1131h = true;
                this.f1125a.s(this, n.g(j9, bVar.f1115c, this.f1129f));
            }
        }

        public int E(b bVar, int i9, A0 a02, U2.g gVar, int i10) {
            int iQ = ((Y) k0.j(this.f1134k[i9])).q(a02, gVar, i10 | 5);
            long jO = o(bVar, gVar.f9701f);
            if ((iQ == -4 && jO == Long.MIN_VALUE) || (iQ == -3 && l(bVar) == Long.MIN_VALUE && !gVar.f9700e)) {
                w(bVar, i9);
                gVar.clear();
                gVar.addFlag(4);
                return -4;
            }
            if (iQ == -4) {
                w(bVar, i9);
                ((Y) k0.j(this.f1134k[i9])).q(a02, gVar, i10);
                gVar.f9701f = jO;
            }
            return iQ;
        }

        public long F(b bVar) {
            if (!bVar.equals(this.f1126c.get(0))) {
                return -9223372036854775807L;
            }
            long jM = this.f1125a.m();
            if (jM == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return n.d(jM, bVar.f1115c, this.f1129f);
        }

        public void G(b bVar, long j9) {
            this.f1125a.h(r(bVar, j9));
        }

        public void H(C c9) {
            c9.Y(this.f1125a);
        }

        public void I(b bVar) {
            if (bVar.equals(this.f1130g)) {
                this.f1130g = null;
                this.f1127d.clear();
            }
            this.f1126c.remove(bVar);
        }

        public long J(b bVar, long j9) {
            return n.d(this.f1125a.l(n.g(j9, bVar.f1115c, this.f1129f)), bVar.f1115c, this.f1129f);
        }

        public long K(b bVar, s[] sVarArr, boolean[] zArr, Y[] yArr, boolean[] zArr2, long j9) {
            bVar.f1119g = j9;
            if (!bVar.equals(this.f1126c.get(0))) {
                for (int i9 = 0; i9 < sVarArr.length; i9++) {
                    s sVar = sVarArr[i9];
                    boolean z9 = true;
                    if (sVar != null) {
                        if (zArr[i9] && yArr[i9] != null) {
                            z9 = false;
                        }
                        zArr2[i9] = z9;
                        if (z9) {
                            yArr[i9] = k0.c(this.f1133j[i9], sVar) ? new c(bVar, i9) : new r();
                        }
                    } else {
                        yArr[i9] = null;
                        zArr2[i9] = true;
                    }
                }
                return j9;
            }
            this.f1133j = (s[]) Arrays.copyOf(sVarArr, sVarArr.length);
            long jG = n.g(j9, bVar.f1115c, this.f1129f);
            Y[] yArr2 = this.f1134k;
            Y[] yArr3 = yArr2.length == 0 ? new Y[sVarArr.length] : (Y[]) Arrays.copyOf(yArr2, yArr2.length);
            long jI = this.f1125a.i(sVarArr, zArr, yArr3, zArr2, jG);
            this.f1134k = (Y[]) Arrays.copyOf(yArr3, yArr3.length);
            this.f1135l = (C0515x[]) Arrays.copyOf(this.f1135l, yArr3.length);
            for (int i10 = 0; i10 < yArr3.length; i10++) {
                if (yArr3[i10] == null) {
                    yArr[i10] = null;
                    this.f1135l[i10] = null;
                } else if (yArr[i10] == null || zArr2[i10]) {
                    yArr[i10] = new c(bVar, i10);
                    this.f1135l[i10] = null;
                }
            }
            return n.d(jI, bVar.f1115c, this.f1129f);
        }

        public int L(b bVar, int i9, long j9) {
            return ((Y) k0.j(this.f1134k[i9])).n(n.g(j9, bVar.f1115c, this.f1129f));
        }

        public void M(C3.b bVar) {
            this.f1129f = bVar;
        }

        public void d(b bVar) {
            this.f1126c.add(bVar);
        }

        @Override // B3.InterfaceC0517z.a
        public void e(InterfaceC0517z interfaceC0517z) {
            this.f1132i = true;
            for (int i9 = 0; i9 < this.f1126c.size(); i9++) {
                ((b) this.f1126c.get(i9)).a();
            }
        }

        public boolean f(C.b bVar, long j9) {
            b bVar2 = (b) D.d(this.f1126c);
            return n.g(j9, bVar, this.f1129f) == n.g(m.t0(bVar2, this.f1129f), bVar2.f1115c, this.f1129f);
        }

        public boolean g(b bVar, long j9) {
            b bVar2 = this.f1130g;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                for (Pair pair : this.f1127d.values()) {
                    bVar2.f1116d.u((C0512u) pair.first, m.r0(bVar2, (C0515x) pair.second, this.f1129f));
                    bVar.f1116d.A((C0512u) pair.first, m.r0(bVar, (C0515x) pair.second, this.f1129f));
                }
            }
            this.f1130g = bVar;
            return this.f1125a.f(r(bVar, j9));
        }

        public void h(b bVar, long j9, boolean z9) {
            this.f1125a.v(n.g(j9, bVar.f1115c, this.f1129f), z9);
        }

        public final int i(C0515x c0515x) {
            String str;
            if (c0515x.f663c == null) {
                return -1;
            }
            int i9 = 0;
            loop0: while (true) {
                s[] sVarArr = this.f1133j;
                if (i9 >= sVarArr.length) {
                    return -1;
                }
                s sVar = sVarArr[i9];
                if (sVar != null) {
                    g0 g0VarK = sVar.k();
                    boolean z9 = c0515x.f662b == 0 && g0VarK.equals(s().b(0));
                    for (int i10 = 0; i10 < g0VarK.f581a; i10++) {
                        C0936z0 c0936z0C = g0VarK.c(i10);
                        if (c0936z0C.equals(c0515x.f663c) || (z9 && (str = c0936z0C.f6456a) != null && str.equals(c0515x.f663c.f6456a))) {
                            break loop0;
                        }
                    }
                }
                i9++;
            }
            return i9;
        }

        public long k(b bVar, long j9, H1 h12) {
            return n.d(this.f1125a.d(n.g(j9, bVar.f1115c, this.f1129f), h12), bVar.f1115c, this.f1129f);
        }

        public long l(b bVar) {
            return o(bVar, this.f1125a.g());
        }

        public b m(C0515x c0515x) {
            if (c0515x == null || c0515x.f666f == -9223372036854775807L) {
                return null;
            }
            for (int i9 = 0; i9 < this.f1126c.size(); i9++) {
                b bVar = (b) this.f1126c.get(i9);
                if (bVar.f1121i) {
                    long jD = n.d(k0.P0(c0515x.f666f), bVar.f1115c, this.f1129f);
                    long jT0 = m.t0(bVar, this.f1129f);
                    if (jD >= 0 && jD < jT0) {
                        return bVar;
                    }
                }
            }
            return null;
        }

        public final long o(b bVar, long j9) {
            if (j9 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            long jD = n.d(j9, bVar.f1115c, this.f1129f);
            if (jD >= m.t0(bVar, this.f1129f)) {
                return Long.MIN_VALUE;
            }
            return jD;
        }

        public long p(b bVar) {
            return o(bVar, this.f1125a.c());
        }

        public List q(List list) {
            return this.f1125a.k(list);
        }

        public final long r(b bVar, long j9) {
            long j10 = bVar.f1119g;
            return j9 < j10 ? n.g(j10, bVar.f1115c, this.f1129f) - (bVar.f1119g - j9) : n.g(j9, bVar.f1115c, this.f1129f);
        }

        public i0 s() {
            return this.f1125a.u();
        }

        public boolean t(b bVar) {
            return bVar.equals(this.f1130g) && this.f1125a.b();
        }

        public boolean u(int i9) {
            return ((Y) k0.j(this.f1134k[i9])).e();
        }

        public boolean v() {
            return this.f1126c.isEmpty();
        }

        public final void w(b bVar, int i9) {
            C0515x c0515x;
            boolean[] zArr = bVar.f1120h;
            if (zArr[i9] || (c0515x = this.f1135l[i9]) == null) {
                return;
            }
            zArr[i9] = true;
            bVar.f1116d.i(m.r0(bVar, c0515x, this.f1129f));
        }

        public void x(int i9) {
            ((Y) k0.j(this.f1134k[i9])).a();
        }

        public void y() {
            this.f1125a.p();
        }

        @Override // B3.Z.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void j(InterfaceC0517z interfaceC0517z) {
            b bVar = this.f1130g;
            if (bVar == null) {
                return;
            }
            ((InterfaceC0517z.a) AbstractC1684a.e(bVar.f1118f)).j(this.f1130g);
        }
    }

    public m(C c9, a aVar) {
        this.f1106i = c9;
        this.f1110m = aVar;
    }

    public static C0515x r0(b bVar, C0515x c0515x, C3.b bVar2) {
        return new C0515x(c0515x.f661a, c0515x.f662b, c0515x.f663c, c0515x.f664d, c0515x.f665e, s0(c0515x.f666f, bVar, bVar2), s0(c0515x.f667g, bVar, bVar2));
    }

    public static long s0(long j9, b bVar, C3.b bVar2) {
        if (j9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long jP0 = k0.P0(j9);
        C.b bVar3 = bVar.f1115c;
        return k0.x1(bVar3.b() ? n.e(jP0, bVar3.f272b, bVar3.f273c, bVar2) : n.f(jP0, -1, bVar2));
    }

    public static long t0(b bVar, C3.b bVar2) {
        C.b bVar3 = bVar.f1115c;
        if (bVar3.b()) {
            b.C0010b c0010bE = bVar2.e(bVar3.f272b);
            if (c0010bE.f1059c == -1) {
                return 0L;
            }
            return c0010bE.f1063g[bVar3.f273c];
        }
        int i9 = bVar3.f275e;
        if (i9 == -1) {
            return Long.MAX_VALUE;
        }
        long j9 = bVar2.e(i9).f1058a;
        if (j9 == Long.MIN_VALUE) {
            return Long.MAX_VALUE;
        }
        return j9;
    }

    @Override // V2.InterfaceC1065w
    public void C(int i9, C.b bVar) {
        b bVarU0 = u0(bVar, null, false);
        (bVarU0 == null ? this.f1109l : bVarU0.f1117e).j();
    }

    @Override // B3.J
    public void D(int i9, C.b bVar, C0512u c0512u, C0515x c0515x) {
        b bVarU0 = u0(bVar, c0515x, true);
        if (bVarU0 == null) {
            this.f1108k.u(c0512u, c0515x);
        } else {
            bVarU0.f1114a.B(c0512u);
            bVarU0.f1116d.u(c0512u, r0(bVarU0, c0515x, (C3.b) AbstractC1684a.e((C3.b) this.f1113p.get(bVarU0.f1115c.f271a))));
        }
    }

    @Override // B3.C
    public InterfaceC0517z E(C.b bVar, InterfaceC1211b interfaceC1211b, long j9) {
        e eVar;
        Pair pair = new Pair(Long.valueOf(bVar.f274d), bVar.f271a);
        e eVar2 = this.f1112o;
        boolean z9 = false;
        if (eVar2 != null) {
            if (eVar2.f1128e.equals(bVar.f271a)) {
                eVar = this.f1112o;
                this.f1107j.put(pair, eVar);
                z9 = true;
            } else {
                this.f1112o.H(this.f1106i);
                eVar = null;
            }
            this.f1112o = null;
        } else {
            eVar = null;
        }
        if (eVar == null && ((eVar = (e) D.e(this.f1107j.get((Object) pair), null)) == null || !eVar.f(bVar, j9))) {
            C3.b bVar2 = (C3.b) AbstractC1684a.e((C3.b) this.f1113p.get(bVar.f271a));
            e eVar3 = new e(this.f1106i.E(new C.b(bVar.f271a, bVar.f274d), interfaceC1211b, n.g(j9, bVar, bVar2)), bVar.f271a, bVar2);
            this.f1107j.put(pair, eVar3);
            eVar = eVar3;
        }
        b bVar3 = new b(eVar, bVar, f0(bVar), b0(bVar));
        eVar.d(bVar3);
        if (z9 && eVar.f1133j.length > 0) {
            bVar3.l(j9);
        }
        return bVar3;
    }

    @Override // V2.InterfaceC1065w
    public void G(int i9, C.b bVar) {
        b bVarU0 = u0(bVar, null, false);
        (bVarU0 == null ? this.f1109l : bVarU0.f1117e).i();
    }

    @Override // B3.J
    public void I(int i9, C.b bVar, C0512u c0512u, C0515x c0515x) {
        b bVarU0 = u0(bVar, c0515x, true);
        if (bVarU0 == null) {
            this.f1108k.r(c0512u, c0515x);
        } else {
            bVarU0.f1114a.B(c0512u);
            bVarU0.f1116d.r(c0512u, r0(bVarU0, c0515x, (C3.b) AbstractC1684a.e((C3.b) this.f1113p.get(bVarU0.f1115c.f271a))));
        }
    }

    @Override // B3.C.c
    public void J(C c9, Q1 q12) {
        a aVar = this.f1110m;
        if ((aVar == null || !aVar.o(q12)) && !this.f1113p.isEmpty()) {
            m0(new d(q12, this.f1113p));
        }
    }

    @Override // V2.InterfaceC1065w
    public /* synthetic */ void K(int i9, C.b bVar) {
        AbstractC1059p.a(this, i9, bVar);
    }

    @Override // B3.J
    public void L(int i9, C.b bVar, C0512u c0512u, C0515x c0515x, IOException iOException, boolean z9) {
        b bVarU0 = u0(bVar, c0515x, true);
        if (bVarU0 == null) {
            this.f1108k.x(c0512u, c0515x, iOException, z9);
            return;
        }
        if (z9) {
            bVarU0.f1114a.B(c0512u);
        }
        bVarU0.f1116d.x(c0512u, r0(bVarU0, c0515x, (C3.b) AbstractC1684a.e((C3.b) this.f1113p.get(bVarU0.f1115c.f271a))), iOException, z9);
    }

    @Override // V2.InterfaceC1065w
    public void N(int i9, C.b bVar, int i10) {
        b bVarU0 = u0(bVar, null, true);
        (bVarU0 == null ? this.f1109l : bVarU0.f1117e).k(i10);
    }

    @Override // B3.C
    public void P() {
        this.f1106i.P();
    }

    @Override // V2.InterfaceC1065w
    public void Q(int i9, C.b bVar, Exception exc) {
        b bVarU0 = u0(bVar, null, false);
        (bVarU0 == null ? this.f1109l : bVarU0.f1117e).l(exc);
    }

    @Override // B3.J
    public void R(int i9, C.b bVar, C0512u c0512u, C0515x c0515x) {
        b bVarU0 = u0(bVar, c0515x, true);
        if (bVarU0 == null) {
            this.f1108k.A(c0512u, c0515x);
        } else {
            bVarU0.f1114a.C(c0512u, c0515x);
            bVarU0.f1116d.A(c0512u, r0(bVarU0, c0515x, (C3.b) AbstractC1684a.e((C3.b) this.f1113p.get(bVarU0.f1115c.f271a))));
        }
    }

    @Override // V2.InterfaceC1065w
    public void T(int i9, C.b bVar) {
        b bVarU0 = u0(bVar, null, false);
        (bVarU0 == null ? this.f1109l : bVarU0.f1117e).h();
    }

    @Override // B3.C
    public void Y(InterfaceC0517z interfaceC0517z) {
        b bVar = (b) interfaceC0517z;
        bVar.f1114a.I(bVar);
        if (bVar.f1114a.v()) {
            this.f1107j.remove(new Pair(Long.valueOf(bVar.f1115c.f274d), bVar.f1115c.f271a), bVar.f1114a);
            boolean zIsEmpty = this.f1107j.isEmpty();
            e eVar = bVar.f1114a;
            if (zIsEmpty) {
                this.f1112o = eVar;
            } else {
                eVar.H(this.f1106i);
            }
        }
    }

    @Override // B3.J
    public void Z(int i9, C.b bVar, C0515x c0515x) {
        b bVarU0 = u0(bVar, c0515x, false);
        if (bVarU0 == null) {
            this.f1108k.i(c0515x);
        } else {
            bVarU0.f1114a.A(bVarU0, c0515x);
            bVarU0.f1116d.i(r0(bVarU0, c0515x, (C3.b) AbstractC1684a.e((C3.b) this.f1113p.get(bVarU0.f1115c.f271a))));
        }
    }

    @Override // V2.InterfaceC1065w
    public void c0(int i9, C.b bVar) {
        b bVarU0 = u0(bVar, null, false);
        (bVarU0 == null ? this.f1109l : bVarU0.f1117e).m();
    }

    @Override // B3.C
    public H0 e() {
        return this.f1106i.e();
    }

    @Override // B3.AbstractC0493a
    public void g0() {
        w0();
        this.f1106i.B(this);
    }

    @Override // B3.AbstractC0493a
    public void h0() {
        this.f1106i.F(this);
    }

    @Override // B3.AbstractC0493a
    public void l0(S s9) {
        Handler handlerX = k0.x();
        synchronized (this) {
            this.f1111n = handlerX;
        }
        this.f1106i.k(handlerX, this);
        this.f1106i.A(handlerX, this);
        this.f1106i.a(this, s9, i0());
    }

    @Override // B3.AbstractC0493a
    public void n0() {
        w0();
        synchronized (this) {
            this.f1111n = null;
        }
        this.f1106i.V(this);
        this.f1106i.u(this);
        this.f1106i.z(this);
    }

    @Override // B3.J
    public void o(int i9, C.b bVar, C0515x c0515x) {
        b bVarU0 = u0(bVar, c0515x, false);
        if (bVarU0 == null) {
            this.f1108k.D(c0515x);
        } else {
            bVarU0.f1116d.D(r0(bVarU0, c0515x, (C3.b) AbstractC1684a.e((C3.b) this.f1113p.get(bVarU0.f1115c.f271a))));
        }
    }

    public final b u0(C.b bVar, C0515x c0515x, boolean z9) {
        if (bVar == null) {
            return null;
        }
        List list = this.f1107j.get((Object) new Pair(Long.valueOf(bVar.f274d), bVar.f271a));
        if (list.isEmpty()) {
            return null;
        }
        if (z9) {
            e eVar = (e) D.d(list);
            return eVar.f1130g != null ? eVar.f1130g : (b) D.d(eVar.f1126c);
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            b bVarM = ((e) list.get(i9)).m(c0515x);
            if (bVarM != null) {
                return bVarM;
            }
        }
        return (b) ((e) list.get(0)).f1126c.get(0);
    }

    public final /* synthetic */ void v0(AbstractC2717A abstractC2717A, Q1 q12) {
        C3.b bVar;
        for (e eVar : this.f1107j.values()) {
            C3.b bVar2 = (C3.b) abstractC2717A.get(eVar.f1128e);
            if (bVar2 != null) {
                eVar.M(bVar2);
            }
        }
        e eVar2 = this.f1112o;
        if (eVar2 != null && (bVar = (C3.b) abstractC2717A.get(eVar2.f1128e)) != null) {
            this.f1112o.M(bVar);
        }
        this.f1113p = abstractC2717A;
        m0(new d(q12, abstractC2717A));
    }

    public final void w0() {
        e eVar = this.f1112o;
        if (eVar != null) {
            eVar.H(this.f1106i);
            this.f1112o = null;
        }
    }

    public void x0(final AbstractC2717A abstractC2717A, final Q1 q12) {
        AbstractC1684a.a(!abstractC2717A.isEmpty());
        Object objE = AbstractC1684a.e(((C3.b) abstractC2717A.values().d().get(0)).f1043a);
        c0 it = abstractC2717A.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            C3.b bVar = (C3.b) entry.getValue();
            AbstractC1684a.a(k0.c(objE, bVar.f1043a));
            C3.b bVar2 = (C3.b) this.f1113p.get(key);
            if (bVar2 != null) {
                for (int i9 = bVar.f1047f; i9 < bVar.f1044c; i9++) {
                    b.C0010b c0010bE = bVar.e(i9);
                    AbstractC1684a.a(c0010bE.f1065i);
                    if (i9 < bVar2.f1044c && n.c(bVar, i9) < n.c(bVar2, i9)) {
                        b.C0010b c0010bE2 = bVar.e(i9 + 1);
                        AbstractC1684a.a(c0010bE.f1064h + c0010bE2.f1064h == bVar2.e(i9).f1064h);
                        AbstractC1684a.a(c0010bE.f1058a + c0010bE.f1064h == c0010bE2.f1058a);
                    }
                    if (c0010bE.f1058a == Long.MIN_VALUE) {
                        AbstractC1684a.a(n.c(bVar, i9) == 0);
                    }
                }
            }
        }
        synchronized (this) {
            try {
                Handler handler = this.f1111n;
                if (handler == null) {
                    this.f1113p = abstractC2717A;
                } else {
                    handler.post(new Runnable() { // from class: C3.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f1103a.v0(abstractC2717A, q12);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

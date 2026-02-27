package B3;

import B3.C0511t;
import B3.InterfaceC0517z;
import B3.J;
import B3.X;
import O2.A0;
import O2.C0897l1;
import O2.C0936z0;
import O2.H1;
import V2.InterfaceC1065w;
import android.net.Uri;
import android.os.Handler;
import b4.C1227s;
import b4.F;
import b4.G;
import b4.InterfaceC1211b;
import b4.InterfaceC1220k;
import b4.InterfaceC1224o;
import com.google.android.exoplayer2.extractor.g;
import d3.InterfaceC1674k;
import d4.AbstractC1684a;
import d4.C1691h;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q3.C2540a;
import u3.C2851b;

/* JADX INFO: loaded from: classes3.dex */
public final class S implements InterfaceC0517z, InterfaceC1674k, G.b, G.f, X.d {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final Map f342N = L();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C0936z0 f343O = new C0936z0.b().U("icy").g0("application/x-icy").G();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f345B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f347D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f348E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f349F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f350G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f351H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f353J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f354K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f355L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f356M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f357a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1224o f358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V2.y f359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b4.F f360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J.a f361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1065w.a f362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC1211b f364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f366k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final M f368m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC0517z.a f373r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C2851b f374s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f377v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f378w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f379x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f380y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.g f381z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b4.G f367l = new b4.G("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1691h f369n = new C1691h();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f370o = new Runnable() { // from class: B3.N
        @Override // java.lang.Runnable
        public final void run() {
            this.f337a.U();
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Runnable f371p = new Runnable() { // from class: B3.O
        @Override // java.lang.Runnable
        public final void run() {
            this.f338a.R();
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Handler f372q = d4.k0.x();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d[] f376u = new d[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public X[] f375t = new X[0];

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f352I = -9223372036854775807L;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f344A = -9223372036854775807L;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f346C = 1;

    public final class a implements G.e, C0511t.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b4.P f384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final M f385e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final InterfaceC1674k f386f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final C1691h f387g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f389i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f391k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public d3.w f393m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f394n;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final d3.t f388h = new d3.t();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f390j = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f382a = C0512u.a();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public C1227s f392l = i(0);

        public a(Uri uri, InterfaceC1224o interfaceC1224o, M m9, InterfaceC1674k interfaceC1674k, C1691h c1691h) {
            this.f383c = uri;
            this.f384d = new b4.P(interfaceC1224o);
            this.f385e = m9;
            this.f386f = interfaceC1674k;
            this.f387g = c1691h;
        }

        @Override // b4.G.e
        public void a() {
            int iC = 0;
            while (iC == 0 && !this.f389i) {
                try {
                    long j9 = this.f388h.f39608a;
                    C1227s c1227sI = i(j9);
                    this.f392l = c1227sI;
                    long jA = this.f384d.a(c1227sI);
                    if (jA != -1) {
                        jA += j9;
                        S.this.a0();
                    }
                    long j10 = jA;
                    S.this.f374s = C2851b.a(this.f384d.e());
                    InterfaceC1220k c0511t = this.f384d;
                    if (S.this.f374s != null && S.this.f374s.f51205g != -1) {
                        c0511t = new C0511t(this.f384d, S.this.f374s.f51205g, this);
                        d3.w wVarO = S.this.O();
                        this.f393m = wVarO;
                        wVarO.d(S.f343O);
                    }
                    long jD = j9;
                    this.f385e.e(c0511t, this.f383c, this.f384d.e(), j9, j10, this.f386f);
                    if (S.this.f374s != null) {
                        this.f385e.b();
                    }
                    if (this.f390j) {
                        this.f385e.a(jD, this.f391k);
                        this.f390j = false;
                    }
                    while (true) {
                        long j11 = jD;
                        while (iC == 0 && !this.f389i) {
                            try {
                                this.f387g.a();
                                iC = this.f385e.c(this.f388h);
                                jD = this.f385e.d();
                                if (jD > S.this.f366k + j11) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f387g.d();
                        S.this.f372q.post(S.this.f371p);
                    }
                    if (iC == 1) {
                        iC = 0;
                    } else if (this.f385e.d() != -1) {
                        this.f388h.f39608a = this.f385e.d();
                    }
                    b4.r.a(this.f384d);
                } catch (Throwable th) {
                    if (iC != 1 && this.f385e.d() != -1) {
                        this.f388h.f39608a = this.f385e.d();
                    }
                    b4.r.a(this.f384d);
                    throw th;
                }
            }
        }

        @Override // B3.C0511t.a
        public void b(d4.M m9) {
            long jMax = !this.f394n ? this.f391k : Math.max(S.this.N(true), this.f391k);
            int iA = m9.a();
            d3.w wVar = (d3.w) AbstractC1684a.e(this.f393m);
            wVar.b(m9, iA);
            wVar.f(jMax, 1, iA, 0, null);
            this.f394n = true;
        }

        @Override // b4.G.e
        public void c() {
            this.f389i = true;
        }

        public final C1227s i(long j9) {
            return new C1227s.b().i(this.f383c).h(j9).f(S.this.f365j).b(6).e(S.f342N).a();
        }

        public final void j(long j9, long j10) {
            this.f388h.f39608a = j9;
            this.f391k = j10;
            this.f390j = true;
            this.f394n = false;
        }
    }

    public interface b {
        void O(long j9, boolean z9, boolean z10);
    }

    public final class c implements Y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f396a;

        public c(int i9) {
            this.f396a = i9;
        }

        @Override // B3.Y
        public void a() throws IOException {
            S.this.Z(this.f396a);
        }

        @Override // B3.Y
        public boolean e() {
            return S.this.Q(this.f396a);
        }

        @Override // B3.Y
        public int n(long j9) {
            return S.this.j0(this.f396a, j9);
        }

        @Override // B3.Y
        public int q(A0 a02, U2.g gVar, int i9) {
            return S.this.f0(this.f396a, a02, gVar, i9);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f399b;

        public d(int i9, boolean z9) {
            this.f398a = i9;
            this.f399b = z9;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f398a == dVar.f398a && this.f399b == dVar.f399b;
        }

        public int hashCode() {
            return (this.f398a * 31) + (this.f399b ? 1 : 0);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i0 f400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f403d;

        public e(i0 i0Var, boolean[] zArr) {
            this.f400a = i0Var;
            this.f401b = zArr;
            int i9 = i0Var.f590a;
            this.f402c = new boolean[i9];
            this.f403d = new boolean[i9];
        }
    }

    public S(Uri uri, InterfaceC1224o interfaceC1224o, M m9, V2.y yVar, InterfaceC1065w.a aVar, b4.F f9, J.a aVar2, b bVar, InterfaceC1211b interfaceC1211b, String str, int i9) {
        this.f357a = uri;
        this.f358c = interfaceC1224o;
        this.f359d = yVar;
        this.f362g = aVar;
        this.f360e = f9;
        this.f361f = aVar2;
        this.f363h = bVar;
        this.f364i = interfaceC1211b;
        this.f365j = str;
        this.f366k = i9;
        this.f368m = m9;
    }

    public static Map L() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    private boolean P() {
        return this.f352I != -9223372036854775807L;
    }

    public final void J() {
        AbstractC1684a.g(this.f378w);
        AbstractC1684a.e(this.f380y);
        AbstractC1684a.e(this.f381z);
    }

    public final boolean K(a aVar, int i9) {
        com.google.android.exoplayer2.extractor.g gVar;
        if (this.f350G || !((gVar = this.f381z) == null || gVar.i() == -9223372036854775807L)) {
            this.f354K = i9;
            return true;
        }
        if (this.f378w && !l0()) {
            this.f353J = true;
            return false;
        }
        this.f348E = this.f378w;
        this.f351H = 0L;
        this.f354K = 0;
        for (X x9 : this.f375t) {
            x9.V();
        }
        aVar.j(0L, 0L);
        return true;
    }

    public final int M() {
        int iG = 0;
        for (X x9 : this.f375t) {
            iG += x9.G();
        }
        return iG;
    }

    public final long N(boolean z9) {
        long jMax = Long.MIN_VALUE;
        for (int i9 = 0; i9 < this.f375t.length; i9++) {
            if (z9 || ((e) AbstractC1684a.e(this.f380y)).f402c[i9]) {
                jMax = Math.max(jMax, this.f375t[i9].z());
            }
        }
        return jMax;
    }

    public d3.w O() {
        return e0(new d(0, true));
    }

    public boolean Q(int i9) {
        return !l0() && this.f375t[i9].K(this.f355L);
    }

    public final /* synthetic */ void R() {
        if (this.f356M) {
            return;
        }
        ((InterfaceC0517z.a) AbstractC1684a.e(this.f373r)).j(this);
    }

    public final /* synthetic */ void S() {
        this.f350G = true;
    }

    public final void U() {
        if (this.f356M || this.f378w || !this.f377v || this.f381z == null) {
            return;
        }
        for (X x9 : this.f375t) {
            if (x9.F() == null) {
                return;
            }
        }
        this.f369n.d();
        int length = this.f375t.length;
        g0[] g0VarArr = new g0[length];
        boolean[] zArr = new boolean[length];
        for (int i9 = 0; i9 < length; i9++) {
            C0936z0 c0936z0G = (C0936z0) AbstractC1684a.e(this.f375t[i9].F());
            String str = c0936z0G.f6467m;
            boolean zO = d4.F.o(str);
            boolean z9 = zO || d4.F.s(str);
            zArr[i9] = z9;
            this.f379x = z9 | this.f379x;
            C2851b c2851b = this.f374s;
            if (c2851b != null) {
                if (zO || this.f376u[i9].f399b) {
                    C2540a c2540a = c0936z0G.f6465k;
                    c0936z0G = c0936z0G.b().Z(c2540a == null ? new C2540a(c2851b) : c2540a.a(c2851b)).G();
                }
                if (zO && c0936z0G.f6461g == -1 && c0936z0G.f6462h == -1 && c2851b.f51200a != -1) {
                    c0936z0G = c0936z0G.b().I(c2851b.f51200a).G();
                }
            }
            g0VarArr[i9] = new g0(Integer.toString(i9), c0936z0G.c(this.f359d.a(c0936z0G)));
        }
        this.f380y = new e(new i0(g0VarArr), zArr);
        this.f378w = true;
        ((InterfaceC0517z.a) AbstractC1684a.e(this.f373r)).e(this);
    }

    public final void V(int i9) {
        J();
        e eVar = this.f380y;
        boolean[] zArr = eVar.f403d;
        if (zArr[i9]) {
            return;
        }
        C0936z0 c0936z0C = eVar.f400a.b(i9).c(0);
        this.f361f.h(d4.F.k(c0936z0C.f6467m), c0936z0C, 0, null, this.f351H);
        zArr[i9] = true;
    }

    public final void X(int i9) {
        J();
        boolean[] zArr = this.f380y.f401b;
        if (this.f353J && zArr[i9]) {
            if (this.f375t[i9].K(false)) {
                return;
            }
            this.f352I = 0L;
            this.f353J = false;
            this.f348E = true;
            this.f351H = 0L;
            this.f354K = 0;
            for (X x9 : this.f375t) {
                x9.V();
            }
            ((InterfaceC0517z.a) AbstractC1684a.e(this.f373r)).j(this);
        }
    }

    public void Y() throws IOException {
        this.f367l.k(this.f360e.b(this.f346C));
    }

    public void Z(int i9) throws IOException {
        this.f375t[i9].N();
        Y();
    }

    public final void a0() {
        this.f372q.post(new Runnable() { // from class: B3.P
            @Override // java.lang.Runnable
            public final void run() {
                this.f339a.S();
            }
        });
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public boolean b() {
        return this.f367l.j() && this.f369n.e();
    }

    @Override // b4.G.b
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void t(a aVar, long j9, long j10, boolean z9) {
        b4.P p9 = aVar.f384d;
        C0512u c0512u = new C0512u(aVar.f382a, aVar.f392l, p9.t(), p9.u(), j9, j10, p9.j());
        this.f360e.d(aVar.f382a);
        this.f361f.q(c0512u, 1, -1, null, 0, null, aVar.f391k, this.f344A);
        if (z9) {
            return;
        }
        for (X x9 : this.f375t) {
            x9.V();
        }
        if (this.f349F > 0) {
            ((InterfaceC0517z.a) AbstractC1684a.e(this.f373r)).j(this);
        }
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public long c() {
        return g();
    }

    @Override // b4.G.b
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void W(a aVar, long j9, long j10) {
        com.google.android.exoplayer2.extractor.g gVar;
        if (this.f344A == -9223372036854775807L && (gVar = this.f381z) != null) {
            boolean zG = gVar.g();
            long jN = N(true);
            long j11 = jN == Long.MIN_VALUE ? 0L : jN + 10000;
            this.f344A = j11;
            this.f363h.O(j11, zG, this.f345B);
        }
        b4.P p9 = aVar.f384d;
        C0512u c0512u = new C0512u(aVar.f382a, aVar.f392l, p9.t(), p9.u(), j9, j10, p9.j());
        this.f360e.d(aVar.f382a);
        this.f361f.t(c0512u, 1, -1, null, 0, null, aVar.f391k, this.f344A);
        this.f355L = true;
        ((InterfaceC0517z.a) AbstractC1684a.e(this.f373r)).j(this);
    }

    @Override // B3.InterfaceC0517z
    public long d(long j9, H1 h12) {
        J();
        if (!this.f381z.g()) {
            return 0L;
        }
        g.a aVarE = this.f381z.e(j9);
        return h12.a(j9, aVarE.f25422a.f39610a, aVarE.f25423b.f39610a);
    }

    @Override // b4.G.b
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public G.c j(a aVar, long j9, long j10, IOException iOException, int i9) {
        boolean z9;
        a aVar2;
        G.c cVarH;
        b4.P p9 = aVar.f384d;
        C0512u c0512u = new C0512u(aVar.f382a, aVar.f392l, p9.t(), p9.u(), j9, j10, p9.j());
        long jC = this.f360e.c(new F.c(c0512u, new C0515x(1, -1, null, 0, null, d4.k0.x1(aVar.f391k), d4.k0.x1(this.f344A)), iOException, i9));
        if (jC == -9223372036854775807L) {
            cVarH = b4.G.f17501g;
        } else {
            int iM = M();
            if (iM > this.f354K) {
                aVar2 = aVar;
                z9 = true;
            } else {
                z9 = false;
                aVar2 = aVar;
            }
            cVarH = K(aVar2, iM) ? b4.G.h(z9, jC) : b4.G.f17500f;
        }
        boolean z10 = !cVarH.c();
        this.f361f.v(c0512u, 1, -1, null, 0, null, aVar.f391k, this.f344A, iOException, z10);
        if (z10) {
            this.f360e.d(aVar.f382a);
        }
        return cVarH;
    }

    @Override // d3.InterfaceC1674k
    public d3.w e(int i9, int i10) {
        return e0(new d(i9, false));
    }

    public final d3.w e0(d dVar) {
        int length = this.f375t.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (dVar.equals(this.f376u[i9])) {
                return this.f375t[i9];
            }
        }
        X xK = X.k(this.f364i, this.f359d, this.f362g);
        xK.d0(this);
        int i10 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f376u, i10);
        dVarArr[length] = dVar;
        this.f376u = (d[]) d4.k0.k(dVarArr);
        X[] xArr = (X[]) Arrays.copyOf(this.f375t, i10);
        xArr[length] = xK;
        this.f375t = (X[]) d4.k0.k(xArr);
        return xK;
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public boolean f(long j9) {
        if (this.f355L || this.f367l.i() || this.f353J) {
            return false;
        }
        if (this.f378w && this.f349F == 0) {
            return false;
        }
        boolean zF = this.f369n.f();
        if (this.f367l.j()) {
            return zF;
        }
        k0();
        return true;
    }

    public int f0(int i9, A0 a02, U2.g gVar, int i10) {
        if (l0()) {
            return -3;
        }
        V(i9);
        int iS = this.f375t[i9].S(a02, gVar, i10, this.f355L);
        if (iS == -3) {
            X(i9);
        }
        return iS;
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public long g() {
        long jN;
        J();
        if (this.f355L || this.f349F == 0) {
            return Long.MIN_VALUE;
        }
        if (P()) {
            return this.f352I;
        }
        if (this.f379x) {
            int length = this.f375t.length;
            jN = Long.MAX_VALUE;
            for (int i9 = 0; i9 < length; i9++) {
                e eVar = this.f380y;
                if (eVar.f401b[i9] && eVar.f402c[i9] && !this.f375t[i9].J()) {
                    jN = Math.min(jN, this.f375t[i9].z());
                }
            }
        } else {
            jN = Long.MAX_VALUE;
        }
        if (jN == Long.MAX_VALUE) {
            jN = N(false);
        }
        return jN == Long.MIN_VALUE ? this.f351H : jN;
    }

    public void g0() {
        if (this.f378w) {
            for (X x9 : this.f375t) {
                x9.R();
            }
        }
        this.f367l.m(this);
        this.f372q.removeCallbacksAndMessages(null);
        this.f373r = null;
        this.f356M = true;
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public void h(long j9) {
    }

    public final boolean h0(boolean[] zArr, long j9) {
        int length = this.f375t.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (!this.f375t[i9].Z(j9, false) && (zArr[i9] || !this.f379x)) {
                return false;
            }
        }
        return true;
    }

    @Override // B3.InterfaceC0517z
    public long i(Z3.s[] sVarArr, boolean[] zArr, Y[] yArr, boolean[] zArr2, long j9) {
        Z3.s sVar;
        J();
        e eVar = this.f380y;
        i0 i0Var = eVar.f400a;
        boolean[] zArr3 = eVar.f402c;
        int i9 = this.f349F;
        int i10 = 0;
        for (int i11 = 0; i11 < sVarArr.length; i11++) {
            Y y9 = yArr[i11];
            if (y9 != null && (sVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((c) y9).f396a;
                AbstractC1684a.g(zArr3[i12]);
                this.f349F--;
                zArr3[i12] = false;
                yArr[i11] = null;
            }
        }
        boolean z9 = !this.f347D ? j9 == 0 : i9 != 0;
        for (int i13 = 0; i13 < sVarArr.length; i13++) {
            if (yArr[i13] == null && (sVar = sVarArr[i13]) != null) {
                AbstractC1684a.g(sVar.length() == 1);
                AbstractC1684a.g(sVar.d(0) == 0);
                int iC = i0Var.c(sVar.k());
                AbstractC1684a.g(!zArr3[iC]);
                this.f349F++;
                zArr3[iC] = true;
                yArr[i13] = new c(iC);
                zArr2[i13] = true;
                if (!z9) {
                    X x9 = this.f375t[iC];
                    z9 = (x9.Z(j9, true) || x9.C() == 0) ? false : true;
                }
            }
        }
        if (this.f349F == 0) {
            this.f353J = false;
            this.f348E = false;
            if (this.f367l.j()) {
                X[] xArr = this.f375t;
                int length = xArr.length;
                while (i10 < length) {
                    xArr[i10].r();
                    i10++;
                }
                this.f367l.f();
            } else {
                X[] xArr2 = this.f375t;
                int length2 = xArr2.length;
                while (i10 < length2) {
                    xArr2[i10].V();
                    i10++;
                }
            }
        } else if (z9) {
            j9 = l(j9);
            while (i10 < yArr.length) {
                if (yArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.f347D = true;
        return j9;
    }

    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final void T(com.google.android.exoplayer2.extractor.g gVar) {
        this.f381z = this.f374s == null ? gVar : new g.b(-9223372036854775807L);
        this.f344A = gVar.i();
        boolean z9 = !this.f350G && gVar.i() == -9223372036854775807L;
        this.f345B = z9;
        this.f346C = z9 ? 7 : 1;
        this.f363h.O(this.f344A, gVar.g(), this.f345B);
        if (this.f378w) {
            return;
        }
        U();
    }

    public int j0(int i9, long j9) {
        if (l0()) {
            return 0;
        }
        V(i9);
        X x9 = this.f375t[i9];
        int iE = x9.E(j9, this.f355L);
        x9.e0(iE);
        if (iE == 0) {
            X(i9);
        }
        return iE;
    }

    @Override // B3.InterfaceC0517z
    public /* synthetic */ List k(List list) {
        return AbstractC0516y.a(this, list);
    }

    public final void k0() {
        a aVar = new a(this.f357a, this.f358c, this.f368m, this, this.f369n);
        if (this.f378w) {
            AbstractC1684a.g(P());
            long j9 = this.f344A;
            if (j9 != -9223372036854775807L && this.f352I > j9) {
                this.f355L = true;
                this.f352I = -9223372036854775807L;
                return;
            }
            aVar.j(((com.google.android.exoplayer2.extractor.g) AbstractC1684a.e(this.f381z)).e(this.f352I).f25422a.f39611b, this.f352I);
            for (X x9 : this.f375t) {
                x9.b0(this.f352I);
            }
            this.f352I = -9223372036854775807L;
        }
        this.f354K = M();
        this.f361f.z(new C0512u(aVar.f382a, aVar.f392l, this.f367l.n(aVar, this, this.f360e.b(this.f346C))), 1, -1, null, 0, null, aVar.f391k, this.f344A);
    }

    @Override // B3.InterfaceC0517z
    public long l(long j9) {
        J();
        boolean[] zArr = this.f380y.f401b;
        if (!this.f381z.g()) {
            j9 = 0;
        }
        int i9 = 0;
        this.f348E = false;
        this.f351H = j9;
        if (P()) {
            this.f352I = j9;
            return j9;
        }
        if (this.f346C != 7 && h0(zArr, j9)) {
            return j9;
        }
        this.f353J = false;
        this.f352I = j9;
        this.f355L = false;
        if (this.f367l.j()) {
            X[] xArr = this.f375t;
            int length = xArr.length;
            while (i9 < length) {
                xArr[i9].r();
                i9++;
            }
            this.f367l.f();
        } else {
            this.f367l.g();
            X[] xArr2 = this.f375t;
            int length2 = xArr2.length;
            while (i9 < length2) {
                xArr2[i9].V();
                i9++;
            }
        }
        return j9;
    }

    public final boolean l0() {
        return this.f348E || P();
    }

    @Override // B3.InterfaceC0517z
    public long m() {
        if (!this.f348E) {
            return -9223372036854775807L;
        }
        if (!this.f355L && M() <= this.f354K) {
            return -9223372036854775807L;
        }
        this.f348E = false;
        return this.f351H;
    }

    @Override // d3.InterfaceC1674k
    public void n(final com.google.android.exoplayer2.extractor.g gVar) {
        this.f372q.post(new Runnable() { // from class: B3.Q
            @Override // java.lang.Runnable
            public final void run() {
                this.f340a.T(gVar);
            }
        });
    }

    @Override // b4.G.f
    public void o() {
        for (X x9 : this.f375t) {
            x9.T();
        }
        this.f368m.release();
    }

    @Override // B3.InterfaceC0517z
    public void p() throws IOException {
        Y();
        if (this.f355L && !this.f378w) {
            throw C0897l1.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // d3.InterfaceC1674k
    public void q() {
        this.f377v = true;
        this.f372q.post(this.f370o);
    }

    @Override // B3.X.d
    public void r(C0936z0 c0936z0) {
        this.f372q.post(this.f370o);
    }

    @Override // B3.InterfaceC0517z
    public void s(InterfaceC0517z.a aVar, long j9) {
        this.f373r = aVar;
        this.f369n.f();
        k0();
    }

    @Override // B3.InterfaceC0517z
    public i0 u() {
        J();
        return this.f380y.f400a;
    }

    @Override // B3.InterfaceC0517z
    public void v(long j9, boolean z9) {
        J();
        if (P()) {
            return;
        }
        boolean[] zArr = this.f380y.f402c;
        int length = this.f375t.length;
        for (int i9 = 0; i9 < length; i9++) {
            this.f375t[i9].q(j9, z9, zArr[i9]);
        }
    }
}

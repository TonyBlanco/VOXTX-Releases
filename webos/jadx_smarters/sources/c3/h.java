package C3;

import B3.AbstractC0499g;
import B3.C;
import B3.C0512u;
import B3.C0513v;
import B3.InterfaceC0517z;
import C3.b;
import C3.e;
import O2.H0;
import O2.Q1;
import a4.InterfaceC1088b;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b4.C1227s;
import b4.InterfaceC1211b;
import b4.S;
import d4.AbstractC1684a;
import d4.k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends AbstractC0499g {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C.b f1070y = new C.b(new Object());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C f1071l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final H0.f f1072m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C.a f1073n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e f1074o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InterfaceC1088b f1075p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1227s f1076q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f1077r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d f1080u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Q1 f1081v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C3.b f1082w;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Handler f1078s = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Q1.b f1079t = new Q1.b();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b[][] f1083x = new b[0][];

    public static final class a extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1084a;

        public a(int i9, Exception exc) {
            super(exc);
            this.f1084a = i9;
        }

        public static a a(Exception exc) {
            return new a(0, exc);
        }

        public static a b(Exception exc, int i9) {
            return new a(1, new IOException("Failed to load ad group " + i9, exc));
        }

        public static a c(Exception exc) {
            return new a(2, exc);
        }

        public static a d(RuntimeException runtimeException) {
            return new a(3, runtimeException);
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C.b f1085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f1086b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Uri f1087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C f1088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Q1 f1089e;

        public b(C.b bVar) {
            this.f1085a = bVar;
        }

        public InterfaceC0517z a(C.b bVar, InterfaceC1211b interfaceC1211b, long j9) {
            C0513v c0513v = new C0513v(bVar, interfaceC1211b, j9);
            this.f1086b.add(c0513v);
            C c9 = this.f1088d;
            if (c9 != null) {
                c0513v.y(c9);
                c0513v.z(h.this.new c((Uri) AbstractC1684a.e(this.f1087c)));
            }
            Q1 q12 = this.f1089e;
            if (q12 != null) {
                c0513v.a(new C.b(q12.r(0), bVar.f274d));
            }
            return c0513v;
        }

        public long b() {
            Q1 q12 = this.f1089e;
            if (q12 == null) {
                return -9223372036854775807L;
            }
            return q12.k(0, h.this.f1079t).p();
        }

        public void c(Q1 q12) {
            AbstractC1684a.a(q12.n() == 1);
            if (this.f1089e == null) {
                Object objR = q12.r(0);
                for (int i9 = 0; i9 < this.f1086b.size(); i9++) {
                    C0513v c0513v = (C0513v) this.f1086b.get(i9);
                    c0513v.a(new C.b(objR, c0513v.f640a.f274d));
                }
            }
            this.f1089e = q12;
        }

        public boolean d() {
            return this.f1088d != null;
        }

        public void e(C c9, Uri uri) {
            this.f1088d = c9;
            this.f1087c = uri;
            for (int i9 = 0; i9 < this.f1086b.size(); i9++) {
                C0513v c0513v = (C0513v) this.f1086b.get(i9);
                c0513v.y(c9);
                c0513v.z(h.this.new c(uri));
            }
            h.this.u0(this.f1085a, c9);
        }

        public boolean f() {
            return this.f1086b.isEmpty();
        }

        public void g() {
            if (d()) {
                h.this.v0(this.f1085a);
            }
        }

        public void h(C0513v c0513v) {
            this.f1086b.remove(c0513v);
            c0513v.x();
        }
    }

    public final class c implements C0513v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f1091a;

        public c(Uri uri) {
            this.f1091a = uri;
        }

        @Override // B3.C0513v.a
        public void a(final C.b bVar) {
            h.this.f1078s.post(new Runnable() { // from class: C3.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1099a.e(bVar);
                }
            });
        }

        @Override // B3.C0513v.a
        public void b(final C.b bVar, final IOException iOException) {
            h.this.f0(bVar).w(new C0512u(C0512u.a(), new C1227s(this.f1091a), SystemClock.elapsedRealtime()), 6, a.a(iOException), true);
            h.this.f1078s.post(new Runnable() { // from class: C3.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1096a.f(bVar, iOException);
                }
            });
        }

        public final /* synthetic */ void e(C.b bVar) {
            h.this.f1074o.a(h.this, bVar.f272b, bVar.f273c);
        }

        public final /* synthetic */ void f(C.b bVar, IOException iOException) {
            h.this.f1074o.b(h.this, bVar.f272b, bVar.f273c, iOException);
        }
    }

    public final class d implements e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f1093a = k0.x();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f1094b;

        public d() {
        }

        @Override // C3.e.a
        public void a(final C3.b bVar) {
            if (this.f1094b) {
                return;
            }
            this.f1093a.post(new Runnable() { // from class: C3.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1101a.f(bVar);
                }
            });
        }

        @Override // C3.e.a
        public void b(a aVar, C1227s c1227s) {
            if (this.f1094b) {
                return;
            }
            h.this.f0(null).w(new C0512u(C0512u.a(), c1227s, SystemClock.elapsedRealtime()), 6, aVar, true);
        }

        @Override // C3.e.a
        public /* synthetic */ void c() {
            C3.d.a(this);
        }

        @Override // C3.e.a
        public /* synthetic */ void d() {
            C3.d.b(this);
        }

        public final /* synthetic */ void f(C3.b bVar) {
            if (this.f1094b) {
                return;
            }
            h.this.M0(bVar);
        }

        public void g() {
            this.f1094b = true;
            this.f1093a.removeCallbacksAndMessages(null);
        }
    }

    public h(C c9, C1227s c1227s, Object obj, C.a aVar, e eVar, InterfaceC1088b interfaceC1088b) {
        this.f1071l = c9;
        this.f1072m = ((H0.h) AbstractC1684a.e(c9.e().f5528c)).f5627d;
        this.f1073n = aVar;
        this.f1074o = eVar;
        this.f1075p = interfaceC1088b;
        this.f1076q = c1227s;
        this.f1077r = obj;
        eVar.c(aVar.c());
    }

    @Override // B3.C
    public InterfaceC0517z E(C.b bVar, InterfaceC1211b interfaceC1211b, long j9) {
        if (((C3.b) AbstractC1684a.e(this.f1082w)).f1044c <= 0 || !bVar.b()) {
            C0513v c0513v = new C0513v(bVar, interfaceC1211b, j9);
            c0513v.y(this.f1071l);
            c0513v.a(bVar);
            return c0513v;
        }
        int i9 = bVar.f272b;
        int i10 = bVar.f273c;
        b[][] bVarArr = this.f1083x;
        b[] bVarArr2 = bVarArr[i9];
        if (bVarArr2.length <= i10) {
            bVarArr[i9] = (b[]) Arrays.copyOf(bVarArr2, i10 + 1);
        }
        b bVar2 = this.f1083x[i9][i10];
        if (bVar2 == null) {
            bVar2 = new b(bVar);
            this.f1083x[i9][i10] = bVar2;
            K0();
        }
        return bVar2.a(bVar, interfaceC1211b, j9);
    }

    public final long[][] G0() {
        long[][] jArr = new long[this.f1083x.length][];
        int i9 = 0;
        while (true) {
            b[][] bVarArr = this.f1083x;
            if (i9 >= bVarArr.length) {
                return jArr;
            }
            jArr[i9] = new long[bVarArr[i9].length];
            int i10 = 0;
            while (true) {
                b[] bVarArr2 = this.f1083x[i9];
                if (i10 < bVarArr2.length) {
                    b bVar = bVarArr2[i10];
                    jArr[i9][i10] = bVar == null ? -9223372036854775807L : bVar.b();
                    i10++;
                }
            }
            i9++;
        }
    }

    @Override // B3.AbstractC0499g
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public C.b p0(C.b bVar, C.b bVar2) {
        return bVar.b() ? bVar : bVar2;
    }

    public final /* synthetic */ void I0(d dVar) {
        this.f1074o.e(this, this.f1076q, this.f1077r, this.f1075p, dVar);
    }

    public final /* synthetic */ void J0(d dVar) {
        this.f1074o.d(this, dVar);
    }

    public final void K0() {
        Uri uri;
        C3.b bVar = this.f1082w;
        if (bVar == null) {
            return;
        }
        for (int i9 = 0; i9 < this.f1083x.length; i9++) {
            int i10 = 0;
            while (true) {
                b[] bVarArr = this.f1083x[i9];
                if (i10 < bVarArr.length) {
                    b bVar2 = bVarArr[i10];
                    b.C0010b c0010bE = bVar.e(i9);
                    if (bVar2 != null && !bVar2.d()) {
                        Uri[] uriArr = c0010bE.f1061e;
                        if (i10 < uriArr.length && (uri = uriArr[i10]) != null) {
                            H0.c cVarM = new H0.c().m(uri);
                            H0.f fVar = this.f1072m;
                            if (fVar != null) {
                                cVarM.e(fVar);
                            }
                            bVar2.e(this.f1073n.b(cVarM.a()), uri);
                        }
                    }
                    i10++;
                }
            }
        }
    }

    public final void L0() {
        Q1 q12 = this.f1081v;
        C3.b bVar = this.f1082w;
        if (bVar == null || q12 == null) {
            return;
        }
        if (bVar.f1044c == 0) {
            m0(q12);
        } else {
            this.f1082w = bVar.n(G0());
            m0(new o(q12, this.f1082w));
        }
    }

    public final void M0(C3.b bVar) {
        C3.b bVar2 = this.f1082w;
        if (bVar2 == null) {
            b[][] bVarArr = new b[bVar.f1044c][];
            this.f1083x = bVarArr;
            Arrays.fill(bVarArr, new b[0]);
        } else {
            AbstractC1684a.g(bVar.f1044c == bVar2.f1044c);
        }
        this.f1082w = bVar;
        K0();
        L0();
    }

    @Override // B3.AbstractC0499g
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public void s0(C.b bVar, C c9, Q1 q12) {
        if (bVar.b()) {
            ((b) AbstractC1684a.e(this.f1083x[bVar.f272b][bVar.f273c])).c(q12);
        } else {
            AbstractC1684a.a(q12.n() == 1);
            this.f1081v = q12;
        }
        L0();
    }

    @Override // B3.C
    public void Y(InterfaceC0517z interfaceC0517z) {
        C0513v c0513v = (C0513v) interfaceC0517z;
        C.b bVar = c0513v.f640a;
        if (!bVar.b()) {
            c0513v.x();
            return;
        }
        b bVar2 = (b) AbstractC1684a.e(this.f1083x[bVar.f272b][bVar.f273c]);
        bVar2.h(c0513v);
        if (bVar2.f()) {
            bVar2.g();
            this.f1083x[bVar.f272b][bVar.f273c] = null;
        }
    }

    @Override // B3.C
    public H0 e() {
        return this.f1071l.e();
    }

    @Override // B3.AbstractC0499g, B3.AbstractC0493a
    public void l0(S s9) {
        super.l0(s9);
        final d dVar = new d();
        this.f1080u = dVar;
        u0(f1070y, this.f1071l);
        this.f1078s.post(new Runnable() { // from class: C3.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f1066a.I0(dVar);
            }
        });
    }

    @Override // B3.AbstractC0499g, B3.AbstractC0493a
    public void n0() {
        super.n0();
        final d dVar = (d) AbstractC1684a.e(this.f1080u);
        this.f1080u = null;
        dVar.g();
        this.f1081v = null;
        this.f1082w = null;
        this.f1083x = new b[0][];
        this.f1078s.post(new Runnable() { // from class: C3.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f1068a.J0(dVar);
            }
        });
    }
}

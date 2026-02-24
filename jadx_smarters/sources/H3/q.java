package H3;

import B3.C0512u;
import B3.C0515x;
import B3.J;
import B3.X;
import B3.Y;
import B3.Z;
import B3.g0;
import B3.i0;
import H3.f;
import O2.A0;
import O2.C0897l1;
import O2.C0936z0;
import O2.H1;
import V2.C1056m;
import V2.InterfaceC1065w;
import V2.y;
import Z3.A;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import b4.C;
import b4.F;
import b4.G;
import b4.InterfaceC1211b;
import b4.InterfaceC1220k;
import d3.C1671h;
import d3.InterfaceC1674k;
import d3.v;
import d3.w;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;
import j$.util.Objects;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q3.C2540a;
import s3.C2707a;
import s3.C2708b;
import s5.AbstractC2743y;
import s5.D;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements G.b, G.f, Z, InterfaceC1674k, X.d {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final Set f2525Z = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public w f2526A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f2527B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f2528C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f2529D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f2530E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f2531F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public C0936z0 f2532G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public C0936z0 f2533H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f2534I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public i0 f2535J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Set f2536K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int[] f2537L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f2538M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f2539N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean[] f2540O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean[] f2541P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f2542Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public long f2543R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f2544S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f2545T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f2546U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f2547V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public long f2548W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public C1056m f2549X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public j f2550Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2551a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f2553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f2554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC1211b f2555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0936z0 f2556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f2557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC1065w.a f2558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final F f2559j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final J.a f2561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2562m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f2564o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f2565p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Runnable f2566q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Runnable f2567r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Handler f2568s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f2569t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Map f2570u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public D3.f f2571v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d[] f2572w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Set f2574y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SparseIntArray f2575z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final G f2560k = new G("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f.b f2563n = new f.b();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int[] f2573x = new int[0];

    public interface b extends Z.a {
        void n(Uri uri);

        void onPrepared();
    }

    public static class c implements w {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final C0936z0 f2576g = new C0936z0.b().g0("application/id3").G();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0936z0 f2577h = new C0936z0.b().g0("application/x-emsg").G();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2708b f2578a = new C2708b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w f2579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0936z0 f2580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C0936z0 f2581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f2582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2583f;

        public c(w wVar, int i9) {
            C0936z0 c0936z0;
            this.f2579b = wVar;
            if (i9 == 1) {
                c0936z0 = f2576g;
            } else {
                if (i9 != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i9);
                }
                c0936z0 = f2577h;
            }
            this.f2580c = c0936z0;
            this.f2582e = new byte[0];
            this.f2583f = 0;
        }

        @Override // d3.w
        public /* synthetic */ int a(InterfaceC1220k interfaceC1220k, int i9, boolean z9) {
            return v.a(this, interfaceC1220k, i9, z9);
        }

        @Override // d3.w
        public /* synthetic */ void b(M m9, int i9) {
            v.b(this, m9, i9);
        }

        @Override // d3.w
        public void c(M m9, int i9, int i10) {
            h(this.f2583f + i9);
            m9.l(this.f2582e, this.f2583f, i9);
            this.f2583f += i9;
        }

        @Override // d3.w
        public void d(C0936z0 c0936z0) {
            this.f2581d = c0936z0;
            this.f2579b.d(this.f2580c);
        }

        @Override // d3.w
        public int e(InterfaceC1220k interfaceC1220k, int i9, boolean z9, int i10) throws EOFException {
            h(this.f2583f + i9);
            int i11 = interfaceC1220k.read(this.f2582e, this.f2583f, i9);
            if (i11 != -1) {
                this.f2583f += i11;
                return i11;
            }
            if (z9) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // d3.w
        public void f(long j9, int i9, int i10, int i11, w.a aVar) {
            AbstractC1684a.e(this.f2581d);
            M mI = i(i10, i11);
            if (!k0.c(this.f2581d.f6467m, this.f2580c.f6467m)) {
                if (!"application/x-emsg".equals(this.f2581d.f6467m)) {
                    AbstractC1681B.j("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f2581d.f6467m);
                    return;
                }
                C2707a c2707aC = this.f2578a.c(mI);
                if (!g(c2707aC)) {
                    AbstractC1681B.j("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f2580c.f6467m, c2707aC.getWrappedMetadataFormat()));
                    return;
                }
                mI = new M((byte[]) AbstractC1684a.e(c2707aC.getWrappedMetadataBytes()));
            }
            int iA = mI.a();
            this.f2579b.b(mI, iA);
            this.f2579b.f(j9, i9, iA, i11, aVar);
        }

        public final boolean g(C2707a c2707a) {
            C0936z0 wrappedMetadataFormat = c2707a.getWrappedMetadataFormat();
            return wrappedMetadataFormat != null && k0.c(this.f2580c.f6467m, wrappedMetadataFormat.f6467m);
        }

        public final void h(int i9) {
            byte[] bArr = this.f2582e;
            if (bArr.length < i9) {
                this.f2582e = Arrays.copyOf(bArr, i9 + (i9 / 2));
            }
        }

        public final M i(int i9, int i10) {
            int i11 = this.f2583f - i10;
            M m9 = new M(Arrays.copyOfRange(this.f2582e, i11 - i9, i11));
            byte[] bArr = this.f2582e;
            System.arraycopy(bArr, i11, bArr, 0, i10);
            this.f2583f = i10;
            return m9;
        }
    }

    public static final class d extends X {

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public final Map f2584H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public C1056m f2585I;

        public d(InterfaceC1211b interfaceC1211b, y yVar, InterfaceC1065w.a aVar, Map map) {
            super(interfaceC1211b, yVar, aVar);
            this.f2584H = map;
        }

        @Override // B3.X, d3.w
        public void f(long j9, int i9, int i10, int i11, w.a aVar) {
            super.f(j9, i9, i10, i11, aVar);
        }

        public final C2540a h0(C2540a c2540a) {
            if (c2540a == null) {
                return null;
            }
            int iF = c2540a.f();
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= iF) {
                    i10 = -1;
                    break;
                }
                C2540a.b bVarE = c2540a.e(i10);
                if ((bVarE instanceof v3.l) && "com.apple.streaming.transportStreamTimestamp".equals(((v3.l) bVarE).f51325c)) {
                    break;
                }
                i10++;
            }
            if (i10 == -1) {
                return c2540a;
            }
            if (iF == 1) {
                return null;
            }
            C2540a.b[] bVarArr = new C2540a.b[iF - 1];
            while (i9 < iF) {
                if (i9 != i10) {
                    bVarArr[i9 < i10 ? i9 : i9 - 1] = c2540a.e(i9);
                }
                i9++;
            }
            return new C2540a(bVarArr);
        }

        public void i0(C1056m c1056m) {
            this.f2585I = c1056m;
            I();
        }

        public void j0(j jVar) {
            f0(jVar.f2477l);
        }

        @Override // B3.X
        public C0936z0 w(C0936z0 c0936z0) {
            C1056m c1056m;
            C1056m c1056m2 = this.f2585I;
            if (c1056m2 == null) {
                c1056m2 = c0936z0.f6470p;
            }
            if (c1056m2 != null && (c1056m = (C1056m) this.f2584H.get(c1056m2.f10008d)) != null) {
                c1056m2 = c1056m;
            }
            C2540a c2540aH0 = h0(c0936z0.f6465k);
            if (c1056m2 != c0936z0.f6470p || c2540aH0 != c0936z0.f6465k) {
                c0936z0 = c0936z0.b().O(c1056m2).Z(c2540aH0).G();
            }
            return super.w(c0936z0);
        }
    }

    public q(String str, int i9, b bVar, f fVar, Map map, InterfaceC1211b interfaceC1211b, long j9, C0936z0 c0936z0, y yVar, InterfaceC1065w.a aVar, F f9, J.a aVar2, int i10) {
        this.f2551a = str;
        this.f2552c = i9;
        this.f2553d = bVar;
        this.f2554e = fVar;
        this.f2570u = map;
        this.f2555f = interfaceC1211b;
        this.f2556g = c0936z0;
        this.f2557h = yVar;
        this.f2558i = aVar;
        this.f2559j = f9;
        this.f2561l = aVar2;
        this.f2562m = i10;
        Set set = f2525Z;
        this.f2574y = new HashSet(set.size());
        this.f2575z = new SparseIntArray(set.size());
        this.f2572w = new d[0];
        this.f2541P = new boolean[0];
        this.f2540O = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f2564o = arrayList;
        this.f2565p = Collections.unmodifiableList(arrayList);
        this.f2569t = new ArrayList();
        this.f2566q = new Runnable() { // from class: H3.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f2523a.U();
            }
        };
        this.f2567r = new Runnable() { // from class: H3.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f2524a.e0();
            }
        };
        this.f2568s = k0.x();
        this.f2542Q = j9;
        this.f2543R = j9;
    }

    public static C1671h C(int i9, int i10) {
        AbstractC1681B.j("HlsSampleStreamWrapper", "Unmapped track with id " + i9 + " of type " + i10);
        return new C1671h();
    }

    public static C0936z0 F(C0936z0 c0936z0, C0936z0 c0936z02, boolean z9) {
        String strD;
        String strG;
        if (c0936z0 == null) {
            return c0936z02;
        }
        int iK = d4.F.k(c0936z02.f6467m);
        if (k0.M(c0936z0.f6464j, iK) == 1) {
            strD = k0.N(c0936z0.f6464j, iK);
            strG = d4.F.g(strD);
        } else {
            strD = d4.F.d(c0936z0.f6464j, c0936z02.f6467m);
            strG = c0936z02.f6467m;
        }
        C0936z0.b bVarK = c0936z02.b().U(c0936z0.f6456a).W(c0936z0.f6457c).X(c0936z0.f6458d).i0(c0936z0.f6459e).e0(c0936z0.f6460f).I(z9 ? c0936z0.f6461g : -1).b0(z9 ? c0936z0.f6462h : -1).K(strD);
        if (iK == 2) {
            bVarK.n0(c0936z0.f6472r).S(c0936z0.f6473s).R(c0936z0.f6474t);
        }
        if (strG != null) {
            bVarK.g0(strG);
        }
        int i9 = c0936z0.f6480z;
        if (i9 != -1 && iK == 1) {
            bVarK.J(i9);
        }
        C2540a c2540aC = c0936z0.f6465k;
        if (c2540aC != null) {
            C2540a c2540a = c0936z02.f6465k;
            if (c2540a != null) {
                c2540aC = c2540a.c(c2540aC);
            }
            bVarK.Z(c2540aC);
        }
        return bVarK.G();
    }

    private void G(int i9) {
        AbstractC1684a.g(!this.f2560k.j());
        while (true) {
            if (i9 >= this.f2564o.size()) {
                i9 = -1;
                break;
            } else if (A(i9)) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 == -1) {
            return;
        }
        long j9 = K().f1383i;
        j jVarH = H(i9);
        if (this.f2564o.isEmpty()) {
            this.f2543R = this.f2542Q;
        } else {
            ((j) D.d(this.f2564o)).o();
        }
        this.f2546U = false;
        this.f2561l.C(this.f2527B, jVarH.f1382h, j9);
    }

    public static boolean J(C0936z0 c0936z0, C0936z0 c0936z02) {
        String str = c0936z0.f6467m;
        String str2 = c0936z02.f6467m;
        int iK = d4.F.k(str);
        if (iK != 3) {
            return iK == d4.F.k(str2);
        }
        if (k0.c(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || c0936z0.f6451E == c0936z02.f6451E;
        }
        return false;
    }

    public static int N(int i9) {
        if (i9 == 1) {
            return 2;
        }
        if (i9 != 2) {
            return i9 != 3 ? 0 : 1;
        }
        return 3;
    }

    private static boolean P(D3.f fVar) {
        return fVar instanceof j;
    }

    private boolean Q() {
        return this.f2543R != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (!this.f2534I && this.f2537L == null && this.f2529D) {
            for (d dVar : this.f2572w) {
                if (dVar.F() == null) {
                    return;
                }
            }
            if (this.f2535J != null) {
                T();
                return;
            }
            z();
            n0();
            this.f2553d.onPrepared();
        }
    }

    private void i0() {
        for (d dVar : this.f2572w) {
            dVar.W(this.f2544S);
        }
        this.f2544S = false;
    }

    private boolean j0(long j9) {
        int length = this.f2572w.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (!this.f2572w[i9].Z(j9, false) && (this.f2541P[i9] || !this.f2539N)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A(int i9) {
        for (int i10 = i9; i10 < this.f2564o.size(); i10++) {
            if (((j) this.f2564o.get(i10)).f2480o) {
                return false;
            }
        }
        j jVar = (j) this.f2564o.get(i9);
        for (int i11 = 0; i11 < this.f2572w.length; i11++) {
            if (this.f2572w[i11].C() > jVar.m(i11)) {
                return false;
            }
        }
        return true;
    }

    public void B() {
        if (this.f2530E) {
            return;
        }
        f(this.f2542Q);
    }

    public final X D(int i9, int i10) {
        int length = this.f2572w.length;
        boolean z9 = true;
        if (i10 != 1 && i10 != 2) {
            z9 = false;
        }
        d dVar = new d(this.f2555f, this.f2557h, this.f2558i, this.f2570u);
        dVar.b0(this.f2542Q);
        if (z9) {
            dVar.i0(this.f2549X);
        }
        dVar.a0(this.f2548W);
        j jVar = this.f2550Y;
        if (jVar != null) {
            dVar.j0(jVar);
        }
        dVar.d0(this);
        int i11 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.f2573x, i11);
        this.f2573x = iArrCopyOf;
        iArrCopyOf[length] = i9;
        this.f2572w = (d[]) k0.S0(this.f2572w, dVar);
        boolean[] zArrCopyOf = Arrays.copyOf(this.f2541P, i11);
        this.f2541P = zArrCopyOf;
        zArrCopyOf[length] = z9;
        this.f2539N |= z9;
        this.f2574y.add(Integer.valueOf(i10));
        this.f2575z.append(i10, length);
        if (N(i10) > N(this.f2527B)) {
            this.f2528C = length;
            this.f2527B = i10;
        }
        this.f2540O = Arrays.copyOf(this.f2540O, i11);
        return dVar;
    }

    public final i0 E(g0[] g0VarArr) {
        for (int i9 = 0; i9 < g0VarArr.length; i9++) {
            g0 g0Var = g0VarArr[i9];
            C0936z0[] c0936z0Arr = new C0936z0[g0Var.f581a];
            for (int i10 = 0; i10 < g0Var.f581a; i10++) {
                C0936z0 c0936z0C = g0Var.c(i10);
                c0936z0Arr[i10] = c0936z0C.c(this.f2557h.a(c0936z0C));
            }
            g0VarArr[i9] = new g0(g0Var.f582c, c0936z0Arr);
        }
        return new i0(g0VarArr);
    }

    public final j H(int i9) {
        j jVar = (j) this.f2564o.get(i9);
        ArrayList arrayList = this.f2564o;
        k0.a1(arrayList, i9, arrayList.size());
        for (int i10 = 0; i10 < this.f2572w.length; i10++) {
            this.f2572w[i10].u(jVar.m(i10));
        }
        return jVar;
    }

    public final boolean I(j jVar) {
        int i9 = jVar.f2477l;
        int length = this.f2572w.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f2540O[i10] && this.f2572w[i10].Q() == i9) {
                return false;
            }
        }
        return true;
    }

    public final j K() {
        return (j) this.f2564o.get(r0.size() - 1);
    }

    public final w L(int i9, int i10) {
        AbstractC1684a.a(f2525Z.contains(Integer.valueOf(i10)));
        int i11 = this.f2575z.get(i10, -1);
        if (i11 == -1) {
            return null;
        }
        if (this.f2574y.add(Integer.valueOf(i10))) {
            this.f2573x[i11] = i9;
        }
        return this.f2573x[i11] == i9 ? this.f2572w[i11] : C(i9, i10);
    }

    public int M() {
        return this.f2538M;
    }

    public final void O(j jVar) {
        this.f2550Y = jVar;
        this.f2532G = jVar.f1379e;
        this.f2543R = -9223372036854775807L;
        this.f2564o.add(jVar);
        AbstractC2743y.a aVarP = AbstractC2743y.p();
        for (d dVar : this.f2572w) {
            aVarP.a(Integer.valueOf(dVar.G()));
        }
        jVar.n(this, aVarP.k());
        for (d dVar2 : this.f2572w) {
            dVar2.j0(jVar);
            if (jVar.f2480o) {
                dVar2.g0();
            }
        }
    }

    public boolean R(int i9) {
        return !Q() && this.f2572w[i9].K(this.f2546U);
    }

    public boolean S() {
        return this.f2527B == 2;
    }

    public final void T() {
        int i9 = this.f2535J.f590a;
        int[] iArr = new int[i9];
        this.f2537L = iArr;
        Arrays.fill(iArr, -1);
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = 0;
            while (true) {
                d[] dVarArr = this.f2572w;
                if (i11 >= dVarArr.length) {
                    break;
                }
                if (J((C0936z0) AbstractC1684a.i(dVarArr[i11].F()), this.f2535J.b(i10).c(0))) {
                    this.f2537L[i10] = i11;
                    break;
                }
                i11++;
            }
        }
        Iterator it = this.f2569t.iterator();
        while (it.hasNext()) {
            ((m) it.next()).b();
        }
    }

    public void V() {
        this.f2560k.a();
        this.f2554e.n();
    }

    public void X(int i9) {
        V();
        this.f2572w[i9].N();
    }

    @Override // b4.G.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void t(D3.f fVar, long j9, long j10, boolean z9) {
        this.f2571v = null;
        C0512u c0512u = new C0512u(fVar.f1376a, fVar.f1377c, fVar.f(), fVar.e(), j9, j10, fVar.b());
        this.f2559j.d(fVar.f1376a);
        this.f2561l.q(c0512u, fVar.f1378d, this.f2552c, fVar.f1379e, fVar.f1380f, fVar.f1381g, fVar.f1382h, fVar.f1383i);
        if (z9) {
            return;
        }
        if (Q() || this.f2531F == 0) {
            i0();
        }
        if (this.f2531F > 0) {
            this.f2553d.j(this);
        }
    }

    @Override // b4.G.b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void W(D3.f fVar, long j9, long j10) {
        this.f2571v = null;
        this.f2554e.p(fVar);
        C0512u c0512u = new C0512u(fVar.f1376a, fVar.f1377c, fVar.f(), fVar.e(), j9, j10, fVar.b());
        this.f2559j.d(fVar.f1376a);
        this.f2561l.t(c0512u, fVar.f1378d, this.f2552c, fVar.f1379e, fVar.f1380f, fVar.f1381g, fVar.f1382h, fVar.f1383i);
        if (this.f2530E) {
            this.f2553d.j(this);
        } else {
            f(this.f2542Q);
        }
    }

    @Override // b4.G.b
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public G.c j(D3.f fVar, long j9, long j10, IOException iOException, int i9) {
        G.c cVarH;
        int i10;
        boolean zP = P(fVar);
        if (zP && !((j) fVar).q() && (iOException instanceof C.e) && ((i10 = ((C.e) iOException).f17480e) == 410 || i10 == 404)) {
            return G.f17498d;
        }
        long jB = fVar.b();
        C0512u c0512u = new C0512u(fVar.f1376a, fVar.f1377c, fVar.f(), fVar.e(), j9, j10, jB);
        F.c cVar = new F.c(c0512u, new C0515x(fVar.f1378d, this.f2552c, fVar.f1379e, fVar.f1380f, fVar.f1381g, k0.x1(fVar.f1382h), k0.x1(fVar.f1383i)), iOException, i9);
        F.b bVarA = this.f2559j.a(A.c(this.f2554e.k()), cVar);
        boolean zM = (bVarA == null || bVarA.f17492a != 2) ? false : this.f2554e.m(fVar, bVarA.f17493b);
        if (zM) {
            if (zP && jB == 0) {
                ArrayList arrayList = this.f2564o;
                AbstractC1684a.g(((j) arrayList.remove(arrayList.size() - 1)) == fVar);
                if (this.f2564o.isEmpty()) {
                    this.f2543R = this.f2542Q;
                } else {
                    ((j) D.d(this.f2564o)).o();
                }
            }
            cVarH = G.f17500f;
        } else {
            long jC = this.f2559j.c(cVar);
            cVarH = jC != -9223372036854775807L ? G.h(false, jC) : G.f17501g;
        }
        G.c cVar2 = cVarH;
        boolean z9 = !cVar2.c();
        this.f2561l.v(c0512u, fVar.f1378d, this.f2552c, fVar.f1379e, fVar.f1380f, fVar.f1381g, fVar.f1382h, fVar.f1383i, iOException, z9);
        if (z9) {
            this.f2571v = null;
            this.f2559j.d(fVar.f1376a);
        }
        if (zM) {
            if (this.f2530E) {
                this.f2553d.j(this);
            } else {
                f(this.f2542Q);
            }
        }
        return cVar2;
    }

    @Override // B3.Z
    public boolean b() {
        return this.f2560k.j();
    }

    public void b0() {
        this.f2574y.clear();
    }

    @Override // B3.Z
    public long c() {
        if (Q()) {
            return this.f2543R;
        }
        if (this.f2546U) {
            return Long.MIN_VALUE;
        }
        return K().f1383i;
    }

    public boolean c0(Uri uri, F.c cVar, boolean z9) {
        F.b bVarA;
        if (!this.f2554e.o(uri)) {
            return true;
        }
        long j9 = (z9 || (bVarA = this.f2559j.a(A.c(this.f2554e.k()), cVar)) == null || bVarA.f17492a != 2) ? -9223372036854775807L : bVarA.f17493b;
        return this.f2554e.q(uri, j9) && j9 != -9223372036854775807L;
    }

    public long d(long j9, H1 h12) {
        return this.f2554e.b(j9, h12);
    }

    public void d0() {
        if (this.f2564o.isEmpty()) {
            return;
        }
        j jVar = (j) D.d(this.f2564o);
        int iC = this.f2554e.c(jVar);
        if (iC == 1) {
            jVar.v();
        } else if (iC == 2 && !this.f2546U && this.f2560k.j()) {
            this.f2560k.f();
        }
    }

    @Override // d3.InterfaceC1674k
    public w e(int i9, int i10) {
        w wVarD;
        if (!f2525Z.contains(Integer.valueOf(i10))) {
            int i11 = 0;
            while (true) {
                w[] wVarArr = this.f2572w;
                if (i11 >= wVarArr.length) {
                    wVarD = null;
                    break;
                }
                if (this.f2573x[i11] == i9) {
                    wVarD = wVarArr[i11];
                    break;
                }
                i11++;
            }
        } else {
            wVarD = L(i9, i10);
        }
        if (wVarD == null) {
            if (this.f2547V) {
                return C(i9, i10);
            }
            wVarD = D(i9, i10);
        }
        if (i10 != 5) {
            return wVarD;
        }
        if (this.f2526A == null) {
            this.f2526A = new c(wVarD, this.f2562m);
        }
        return this.f2526A;
    }

    public final void e0() {
        this.f2529D = true;
        U();
    }

    @Override // B3.Z
    public boolean f(long j9) {
        List listEmptyList;
        long jMax;
        if (this.f2546U || this.f2560k.j() || this.f2560k.i()) {
            return false;
        }
        if (Q()) {
            listEmptyList = Collections.emptyList();
            jMax = this.f2543R;
            for (d dVar : this.f2572w) {
                dVar.b0(this.f2543R);
            }
        } else {
            listEmptyList = this.f2565p;
            j jVarK = K();
            jMax = jVarK.h() ? jVarK.f1383i : Math.max(this.f2542Q, jVarK.f1382h);
        }
        List list = listEmptyList;
        long j10 = jMax;
        this.f2563n.a();
        this.f2554e.e(j9, j10, list, this.f2530E || !list.isEmpty(), this.f2563n);
        f.b bVar = this.f2563n;
        boolean z9 = bVar.f2449b;
        D3.f fVar = bVar.f2448a;
        Uri uri = bVar.f2450c;
        if (z9) {
            this.f2543R = -9223372036854775807L;
            this.f2546U = true;
            return true;
        }
        if (fVar == null) {
            if (uri != null) {
                this.f2553d.n(uri);
            }
            return false;
        }
        if (P(fVar)) {
            O((j) fVar);
        }
        this.f2571v = fVar;
        this.f2561l.z(new C0512u(fVar.f1376a, fVar.f1377c, this.f2560k.n(fVar, this, this.f2559j.b(fVar.f1378d))), fVar.f1378d, this.f2552c, fVar.f1379e, fVar.f1380f, fVar.f1381g, fVar.f1382h, fVar.f1383i);
        return true;
    }

    public void f0(g0[] g0VarArr, int i9, int... iArr) {
        this.f2535J = E(g0VarArr);
        this.f2536K = new HashSet();
        for (int i10 : iArr) {
            this.f2536K.add(this.f2535J.b(i10));
        }
        this.f2538M = i9;
        Handler handler = this.f2568s;
        final b bVar = this.f2553d;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: H3.n
            @Override // java.lang.Runnable
            public final void run() {
                bVar.onPrepared();
            }
        });
        n0();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    @Override // B3.Z
    public long g() {
        /*
            r7 = this;
            boolean r0 = r7.f2546U
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.Q()
            if (r0 == 0) goto L10
            long r0 = r7.f2543R
            return r0
        L10:
            long r0 = r7.f2542Q
            H3.j r2 = r7.K()
            boolean r3 = r2.h()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList r2 = r7.f2564o
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList r2 = r7.f2564o
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            H3.j r2 = (H3.j) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.f1383i
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r7.f2529D
            if (r2 == 0) goto L55
            H3.q$d[] r2 = r7.f2572w
            int r3 = r2.length
            r4 = 0
        L46:
            if (r4 >= r3) goto L55
            r5 = r2[r4]
            long r5 = r5.z()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.q.g():long");
    }

    public int g0(int i9, A0 a02, U2.g gVar, int i10) {
        if (Q()) {
            return -3;
        }
        int i11 = 0;
        if (!this.f2564o.isEmpty()) {
            int i12 = 0;
            while (i12 < this.f2564o.size() - 1 && I((j) this.f2564o.get(i12))) {
                i12++;
            }
            k0.a1(this.f2564o, 0, i12);
            j jVar = (j) this.f2564o.get(0);
            C0936z0 c0936z0 = jVar.f1379e;
            if (!c0936z0.equals(this.f2533H)) {
                this.f2561l.h(this.f2552c, c0936z0, jVar.f1380f, jVar.f1381g, jVar.f1382h);
            }
            this.f2533H = c0936z0;
        }
        if (!this.f2564o.isEmpty() && !((j) this.f2564o.get(0)).q()) {
            return -3;
        }
        int iS = this.f2572w[i9].S(a02, gVar, i10, this.f2546U);
        if (iS == -5) {
            C0936z0 c0936z0L = (C0936z0) AbstractC1684a.e(a02.f5499b);
            if (i9 == this.f2528C) {
                int iD = w5.f.d(this.f2572w[i9].Q());
                while (i11 < this.f2564o.size() && ((j) this.f2564o.get(i11)).f2477l != iD) {
                    i11++;
                }
                c0936z0L = c0936z0L.l(i11 < this.f2564o.size() ? ((j) this.f2564o.get(i11)).f1379e : (C0936z0) AbstractC1684a.e(this.f2532G));
            }
            a02.f5499b = c0936z0L;
        }
        return iS;
    }

    @Override // B3.Z
    public void h(long j9) {
        if (this.f2560k.i() || Q()) {
            return;
        }
        if (this.f2560k.j()) {
            AbstractC1684a.e(this.f2571v);
            if (this.f2554e.v(j9, this.f2571v, this.f2565p)) {
                this.f2560k.f();
                return;
            }
            return;
        }
        int size = this.f2565p.size();
        while (size > 0 && this.f2554e.c((j) this.f2565p.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f2565p.size()) {
            G(size);
        }
        int iH = this.f2554e.h(j9, this.f2565p);
        if (iH < this.f2564o.size()) {
            G(iH);
        }
    }

    public void h0() {
        if (this.f2530E) {
            for (d dVar : this.f2572w) {
                dVar.R();
            }
        }
        this.f2560k.m(this);
        this.f2568s.removeCallbacksAndMessages(null);
        this.f2534I = true;
        this.f2569t.clear();
    }

    public boolean k0(long j9, boolean z9) {
        this.f2542Q = j9;
        if (Q()) {
            this.f2543R = j9;
            return true;
        }
        if (this.f2529D && !z9 && j0(j9)) {
            return false;
        }
        this.f2543R = j9;
        this.f2546U = false;
        this.f2564o.clear();
        if (this.f2560k.j()) {
            if (this.f2529D) {
                for (d dVar : this.f2572w) {
                    dVar.r();
                }
            }
            this.f2560k.f();
        } else {
            this.f2560k.g();
            i0();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l0(Z3.s[] r20, boolean[] r21, B3.Y[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.q.l0(Z3.s[], boolean[], B3.Y[], boolean[], long, boolean):boolean");
    }

    public void m0(C1056m c1056m) {
        if (k0.c(this.f2549X, c1056m)) {
            return;
        }
        this.f2549X = c1056m;
        int i9 = 0;
        while (true) {
            d[] dVarArr = this.f2572w;
            if (i9 >= dVarArr.length) {
                return;
            }
            if (this.f2541P[i9]) {
                dVarArr[i9].i0(c1056m);
            }
            i9++;
        }
    }

    @Override // d3.InterfaceC1674k
    public void n(com.google.android.exoplayer2.extractor.g gVar) {
    }

    public final void n0() {
        this.f2530E = true;
    }

    @Override // b4.G.f
    public void o() {
        for (d dVar : this.f2572w) {
            dVar.T();
        }
    }

    public void o0(boolean z9) {
        this.f2554e.t(z9);
    }

    public void p() throws C0897l1 {
        V();
        if (this.f2546U && !this.f2530E) {
            throw C0897l1.a("Loading finished before preparation is complete.", null);
        }
    }

    public void p0(long j9) {
        if (this.f2548W != j9) {
            this.f2548W = j9;
            for (d dVar : this.f2572w) {
                dVar.a0(j9);
            }
        }
    }

    @Override // d3.InterfaceC1674k
    public void q() {
        this.f2547V = true;
        this.f2568s.post(this.f2567r);
    }

    public int q0(int i9, long j9) {
        if (Q()) {
            return 0;
        }
        d dVar = this.f2572w[i9];
        int iE = dVar.E(j9, this.f2546U);
        j jVar = (j) D.e(this.f2564o, null);
        if (jVar != null && !jVar.q()) {
            iE = Math.min(iE, jVar.m(i9) - dVar.C());
        }
        dVar.e0(iE);
        return iE;
    }

    @Override // B3.X.d
    public void r(C0936z0 c0936z0) {
        this.f2568s.post(this.f2566q);
    }

    public void r0(int i9) {
        x();
        AbstractC1684a.e(this.f2537L);
        int i10 = this.f2537L[i9];
        AbstractC1684a.g(this.f2540O[i10]);
        this.f2540O[i10] = false;
    }

    public final void s0(Y[] yArr) {
        this.f2569t.clear();
        for (Y y9 : yArr) {
            if (y9 != null) {
                this.f2569t.add((m) y9);
            }
        }
    }

    public i0 u() {
        x();
        return this.f2535J;
    }

    public void v(long j9, boolean z9) {
        if (!this.f2529D || Q()) {
            return;
        }
        int length = this.f2572w.length;
        for (int i9 = 0; i9 < length; i9++) {
            this.f2572w[i9].q(j9, z9, this.f2540O[i9]);
        }
    }

    public final void x() {
        AbstractC1684a.g(this.f2530E);
        AbstractC1684a.e(this.f2535J);
        AbstractC1684a.e(this.f2536K);
    }

    public int y(int i9) {
        x();
        AbstractC1684a.e(this.f2537L);
        int i10 = this.f2537L[i9];
        if (i10 == -1) {
            return this.f2536K.contains(this.f2535J.b(i9)) ? -3 : -2;
        }
        boolean[] zArr = this.f2540O;
        if (zArr[i10]) {
            return -2;
        }
        zArr[i10] = true;
        return i10;
    }

    public final void z() {
        C0936z0 c0936z0;
        int length = this.f2572w.length;
        int i9 = 0;
        int i10 = -2;
        int i11 = -1;
        while (true) {
            if (i9 >= length) {
                break;
            }
            String str = ((C0936z0) AbstractC1684a.i(this.f2572w[i9].F())).f6467m;
            int i12 = d4.F.s(str) ? 2 : d4.F.o(str) ? 1 : d4.F.r(str) ? 3 : -2;
            if (N(i12) > N(i10)) {
                i11 = i9;
                i10 = i12;
            } else if (i12 == i10 && i11 != -1) {
                i11 = -1;
            }
            i9++;
        }
        g0 g0VarJ = this.f2554e.j();
        int i13 = g0VarJ.f581a;
        this.f2538M = -1;
        this.f2537L = new int[length];
        for (int i14 = 0; i14 < length; i14++) {
            this.f2537L[i14] = i14;
        }
        g0[] g0VarArr = new g0[length];
        int i15 = 0;
        while (i15 < length) {
            C0936z0 c0936z02 = (C0936z0) AbstractC1684a.i(this.f2572w[i15].F());
            if (i15 == i11) {
                C0936z0[] c0936z0Arr = new C0936z0[i13];
                for (int i16 = 0; i16 < i13; i16++) {
                    C0936z0 c0936z0C = g0VarJ.c(i16);
                    if (i10 == 1 && (c0936z0 = this.f2556g) != null) {
                        c0936z0C = c0936z0C.l(c0936z0);
                    }
                    c0936z0Arr[i16] = i13 == 1 ? c0936z02.l(c0936z0C) : F(c0936z0C, c0936z02, true);
                }
                g0VarArr[i15] = new g0(this.f2551a, c0936z0Arr);
                this.f2538M = i15;
            } else {
                C0936z0 c0936z03 = (i10 == 2 && d4.F.o(c0936z02.f6467m)) ? this.f2556g : null;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f2551a);
                sb.append(":muxed:");
                sb.append(i15 < i11 ? i15 : i15 - 1);
                g0VarArr[i15] = new g0(sb.toString(), F(c0936z03, c0936z02, false));
            }
            i15++;
        }
        this.f2535J = E(g0VarArr);
        AbstractC1684a.g(this.f2536K == null);
        this.f2536K = Collections.emptySet();
    }
}

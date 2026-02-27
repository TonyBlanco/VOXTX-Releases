package B3;

import B3.X;
import O2.A0;
import O2.C0936z0;
import V2.C1056m;
import V2.InterfaceC1058o;
import V2.InterfaceC1065w;
import V2.y;
import b4.InterfaceC1211b;
import b4.InterfaceC1220k;
import d3.w;
import d4.AbstractC1684a;
import d4.InterfaceC1692i;

/* JADX INFO: loaded from: classes3.dex */
public class X implements d3.w {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C0936z0 f436A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0936z0 f437B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f438C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f439D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f440E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f441F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f442G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f443a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V2.y f446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1065w.a f447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0936z0 f449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC1058o f450h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f458p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f459q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f460r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f461s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f465w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f468z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f444b = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f451i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f452j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f453k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f456n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f455m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f454l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w.a[] f457o = new w.a[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f445c = new e0(new InterfaceC1692i() { // from class: B3.W
        @Override // d4.InterfaceC1692i
        public final void accept(Object obj) {
            X.L((X.c) obj);
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f462t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f463u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f464v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f467y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f466x = true;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public w.a f471c;
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0936z0 f472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y.b f473b;

        public c(C0936z0 c0936z0, y.b bVar) {
            this.f472a = c0936z0;
            this.f473b = bVar;
        }
    }

    public interface d {
        void r(C0936z0 c0936z0);
    }

    public X(InterfaceC1211b interfaceC1211b, V2.y yVar, InterfaceC1065w.a aVar) {
        this.f446d = yVar;
        this.f447e = aVar;
        this.f443a = new V(interfaceC1211b);
    }

    public static /* synthetic */ void L(c cVar) {
        cVar.f473b.release();
    }

    public static X k(InterfaceC1211b interfaceC1211b, V2.y yVar, InterfaceC1065w.a aVar) {
        return new X(interfaceC1211b, (V2.y) AbstractC1684a.e(yVar), (InterfaceC1065w.a) AbstractC1684a.e(aVar));
    }

    public static X l(InterfaceC1211b interfaceC1211b) {
        return new X(interfaceC1211b, null, null);
    }

    public final synchronized long A() {
        return Math.max(this.f463u, B(this.f461s));
    }

    public final long B(int i9) {
        long jMax = Long.MIN_VALUE;
        if (i9 == 0) {
            return Long.MIN_VALUE;
        }
        int iD = D(i9 - 1);
        for (int i10 = 0; i10 < i9; i10++) {
            jMax = Math.max(jMax, this.f456n[iD]);
            if ((this.f455m[iD] & 1) != 0) {
                break;
            }
            iD--;
            if (iD == -1) {
                iD = this.f451i - 1;
            }
        }
        return jMax;
    }

    public final int C() {
        return this.f459q + this.f461s;
    }

    public final int D(int i9) {
        int i10 = this.f460r + i9;
        int i11 = this.f451i;
        return i10 < i11 ? i10 : i10 - i11;
    }

    public final synchronized int E(long j9, boolean z9) {
        int iD = D(this.f461s);
        if (H() && j9 >= this.f456n[iD]) {
            if (j9 > this.f464v && z9) {
                return this.f458p - this.f461s;
            }
            int iV = v(iD, this.f458p - this.f461s, j9, true);
            if (iV == -1) {
                return 0;
            }
            return iV;
        }
        return 0;
    }

    public final synchronized C0936z0 F() {
        return this.f467y ? null : this.f437B;
    }

    public final int G() {
        return this.f459q + this.f458p;
    }

    public final boolean H() {
        return this.f461s != this.f458p;
    }

    public final void I() {
        this.f468z = true;
    }

    public final synchronized boolean J() {
        return this.f465w;
    }

    public synchronized boolean K(boolean z9) {
        C0936z0 c0936z0;
        boolean z10 = true;
        if (H()) {
            if (((c) this.f445c.e(C())).f472a != this.f449g) {
                return true;
            }
            return M(D(this.f461s));
        }
        if (!z9 && !this.f465w && ((c0936z0 = this.f437B) == null || c0936z0 == this.f449g)) {
            z10 = false;
        }
        return z10;
    }

    public final boolean M(int i9) {
        InterfaceC1058o interfaceC1058o = this.f450h;
        return interfaceC1058o == null || interfaceC1058o.getState() == 4 || ((this.f455m[i9] & 1073741824) == 0 && this.f450h.b());
    }

    public void N() throws InterfaceC1058o.a {
        InterfaceC1058o interfaceC1058o = this.f450h;
        if (interfaceC1058o != null && interfaceC1058o.getState() == 1) {
            throw ((InterfaceC1058o.a) AbstractC1684a.e(this.f450h.getError()));
        }
    }

    public final void O(C0936z0 c0936z0, A0 a02) {
        C0936z0 c0936z02 = this.f449g;
        boolean z9 = c0936z02 == null;
        C1056m c1056m = z9 ? null : c0936z02.f6470p;
        this.f449g = c0936z0;
        C1056m c1056m2 = c0936z0.f6470p;
        V2.y yVar = this.f446d;
        a02.f5499b = yVar != null ? c0936z0.c(yVar.a(c0936z0)) : c0936z0;
        a02.f5498a = this.f450h;
        if (this.f446d == null) {
            return;
        }
        if (z9 || !d4.k0.c(c1056m, c1056m2)) {
            InterfaceC1058o interfaceC1058o = this.f450h;
            InterfaceC1058o interfaceC1058oC = this.f446d.c(this.f447e, c0936z0);
            this.f450h = interfaceC1058oC;
            a02.f5498a = interfaceC1058oC;
            if (interfaceC1058o != null) {
                interfaceC1058o.f(this.f447e);
            }
        }
    }

    public final synchronized int P(A0 a02, U2.g gVar, boolean z9, boolean z10, b bVar) {
        try {
            gVar.f9700e = false;
            if (!H()) {
                if (!z10 && !this.f465w) {
                    C0936z0 c0936z0 = this.f437B;
                    if (c0936z0 == null || (!z9 && c0936z0 == this.f449g)) {
                        return -3;
                    }
                    O((C0936z0) AbstractC1684a.e(c0936z0), a02);
                    return -5;
                }
                gVar.setFlags(4);
                return -4;
            }
            C0936z0 c0936z02 = ((c) this.f445c.e(C())).f472a;
            if (!z9 && c0936z02 == this.f449g) {
                int iD = D(this.f461s);
                if (!M(iD)) {
                    gVar.f9700e = true;
                    return -3;
                }
                gVar.setFlags(this.f455m[iD]);
                if (this.f461s == this.f458p - 1 && (z10 || this.f465w)) {
                    gVar.addFlag(536870912);
                }
                long j9 = this.f456n[iD];
                gVar.f9701f = j9;
                if (j9 < this.f462t) {
                    gVar.addFlag(Integer.MIN_VALUE);
                }
                bVar.f469a = this.f454l[iD];
                bVar.f470b = this.f453k[iD];
                bVar.f471c = this.f457o[iD];
                return -4;
            }
            O(c0936z02, a02);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long Q() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return H() ? this.f452j[D(this.f461s)] : this.f438C;
    }

    public void R() {
        r();
        U();
    }

    public int S(A0 a02, U2.g gVar, int i9, boolean z9) {
        int iP = P(a02, gVar, (i9 & 2) != 0, z9, this.f444b);
        if (iP == -4 && !gVar.isEndOfStream()) {
            boolean z10 = (i9 & 1) != 0;
            if ((i9 & 4) == 0) {
                V v9 = this.f443a;
                b bVar = this.f444b;
                if (z10) {
                    v9.f(gVar, bVar);
                } else {
                    v9.m(gVar, bVar);
                }
            }
            if (!z10) {
                this.f461s++;
            }
        }
        return iP;
    }

    public void T() {
        W(true);
        U();
    }

    public final void U() {
        InterfaceC1058o interfaceC1058o = this.f450h;
        if (interfaceC1058o != null) {
            interfaceC1058o.f(this.f447e);
            this.f450h = null;
            this.f449g = null;
        }
    }

    public final void V() {
        W(false);
    }

    public void W(boolean z9) {
        this.f443a.n();
        this.f458p = 0;
        this.f459q = 0;
        this.f460r = 0;
        this.f461s = 0;
        this.f466x = true;
        this.f462t = Long.MIN_VALUE;
        this.f463u = Long.MIN_VALUE;
        this.f464v = Long.MIN_VALUE;
        this.f465w = false;
        this.f445c.b();
        if (z9) {
            this.f436A = null;
            this.f437B = null;
            this.f467y = true;
        }
    }

    public final synchronized void X() {
        this.f461s = 0;
        this.f443a.o();
    }

    public final synchronized boolean Y(int i9) {
        X();
        int i10 = this.f459q;
        if (i9 >= i10 && i9 <= this.f458p + i10) {
            this.f462t = Long.MIN_VALUE;
            this.f461s = i9 - i10;
            return true;
        }
        return false;
    }

    public final synchronized boolean Z(long j9, boolean z9) {
        X();
        int iD = D(this.f461s);
        if (H() && j9 >= this.f456n[iD] && (j9 <= this.f464v || z9)) {
            int iV = v(iD, this.f458p - this.f461s, j9, true);
            if (iV == -1) {
                return false;
            }
            this.f462t = j9;
            this.f461s += iV;
            return true;
        }
        return false;
    }

    @Override // d3.w
    public /* synthetic */ int a(InterfaceC1220k interfaceC1220k, int i9, boolean z9) {
        return d3.v.a(this, interfaceC1220k, i9, z9);
    }

    public final void a0(long j9) {
        if (this.f441F != j9) {
            this.f441F = j9;
            I();
        }
    }

    @Override // d3.w
    public /* synthetic */ void b(d4.M m9, int i9) {
        d3.v.b(this, m9, i9);
    }

    public final void b0(long j9) {
        this.f462t = j9;
    }

    @Override // d3.w
    public final void c(d4.M m9, int i9, int i10) {
        this.f443a.q(m9, i9);
    }

    public final synchronized boolean c0(C0936z0 c0936z0) {
        try {
            this.f467y = false;
            if (d4.k0.c(c0936z0, this.f437B)) {
                return false;
            }
            if (!this.f445c.g() && ((c) this.f445c.f()).f472a.equals(c0936z0)) {
                c0936z0 = ((c) this.f445c.f()).f472a;
            }
            this.f437B = c0936z0;
            C0936z0 c0936z02 = this.f437B;
            this.f439D = d4.F.a(c0936z02.f6467m, c0936z02.f6464j);
            this.f440E = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // d3.w
    public final void d(C0936z0 c0936z0) {
        C0936z0 c0936z0W = w(c0936z0);
        this.f468z = false;
        this.f436A = c0936z0;
        boolean zC0 = c0(c0936z0W);
        d dVar = this.f448f;
        if (dVar == null || !zC0) {
            return;
        }
        dVar.r(c0936z0W);
    }

    public final void d0(d dVar) {
        this.f448f = dVar;
    }

    @Override // d3.w
    public final int e(InterfaceC1220k interfaceC1220k, int i9, boolean z9, int i10) {
        return this.f443a.p(interfaceC1220k, i9, z9);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e0(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f461s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f458p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            d4.AbstractC1684a.a(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f461s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f461s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.X.e0(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    @Override // d3.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(long r12, int r14, int r15, int r16, d3.w.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f468z
            if (r0 == 0) goto L10
            O2.z0 r0 = r8.f436A
            java.lang.Object r0 = d4.AbstractC1684a.i(r0)
            O2.z0 r0 = (O2.C0936z0) r0
            r11.d(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            boolean r4 = r8.f466x
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f466x = r1
        L22:
            long r4 = r8.f441F
            long r4 = r4 + r12
            boolean r6 = r8.f439D
            if (r6 == 0) goto L54
            long r6 = r8.f462t
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L54
            boolean r0 = r8.f440E
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            O2.z0 r6 = r8.f437B
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            d4.AbstractC1681B.j(r6, r0)
            r8.f440E = r2
        L50:
            r0 = r14 | 1
            r6 = r0
            goto L55
        L54:
            r6 = r14
        L55:
            boolean r0 = r8.f442G
            if (r0 == 0) goto L66
            if (r3 == 0) goto L65
            boolean r0 = r11.h(r4)
            if (r0 != 0) goto L62
            goto L65
        L62:
            r8.f442G = r1
            goto L66
        L65:
            return
        L66:
            B3.V r0 = r8.f443a
            long r0 = r0.e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.X.f(long, int, int, int, d3.w$a):void");
    }

    public final void f0(long j9) {
        this.f438C = j9;
    }

    public final void g0() {
        this.f442G = true;
    }

    public final synchronized boolean h(long j9) {
        if (this.f458p == 0) {
            return j9 > this.f463u;
        }
        if (A() >= j9) {
            return false;
        }
        t(this.f459q + j(j9));
        return true;
    }

    public final synchronized void i(long j9, int i9, long j10, int i10, w.a aVar) {
        try {
            int i11 = this.f458p;
            if (i11 > 0) {
                int iD = D(i11 - 1);
                AbstractC1684a.a(this.f453k[iD] + ((long) this.f454l[iD]) <= j10);
            }
            this.f465w = (536870912 & i9) != 0;
            this.f464v = Math.max(this.f464v, j9);
            int iD2 = D(this.f458p);
            this.f456n[iD2] = j9;
            this.f453k[iD2] = j10;
            this.f454l[iD2] = i10;
            this.f455m[iD2] = i9;
            this.f457o[iD2] = aVar;
            this.f452j[iD2] = this.f438C;
            if (this.f445c.g() || !((c) this.f445c.f()).f472a.equals(this.f437B)) {
                V2.y yVar = this.f446d;
                this.f445c.a(G(), new c((C0936z0) AbstractC1684a.e(this.f437B), yVar != null ? yVar.d(this.f447e, this.f437B) : y.b.f10037a));
            }
            int i12 = this.f458p + 1;
            this.f458p = i12;
            int i13 = this.f451i;
            if (i12 == i13) {
                int i14 = i13 + 1000;
                long[] jArr = new long[i14];
                long[] jArr2 = new long[i14];
                long[] jArr3 = new long[i14];
                int[] iArr = new int[i14];
                int[] iArr2 = new int[i14];
                w.a[] aVarArr = new w.a[i14];
                int i15 = this.f460r;
                int i16 = i13 - i15;
                System.arraycopy(this.f453k, i15, jArr2, 0, i16);
                System.arraycopy(this.f456n, this.f460r, jArr3, 0, i16);
                System.arraycopy(this.f455m, this.f460r, iArr, 0, i16);
                System.arraycopy(this.f454l, this.f460r, iArr2, 0, i16);
                System.arraycopy(this.f457o, this.f460r, aVarArr, 0, i16);
                System.arraycopy(this.f452j, this.f460r, jArr, 0, i16);
                int i17 = this.f460r;
                System.arraycopy(this.f453k, 0, jArr2, i16, i17);
                System.arraycopy(this.f456n, 0, jArr3, i16, i17);
                System.arraycopy(this.f455m, 0, iArr, i16, i17);
                System.arraycopy(this.f454l, 0, iArr2, i16, i17);
                System.arraycopy(this.f457o, 0, aVarArr, i16, i17);
                System.arraycopy(this.f452j, 0, jArr, i16, i17);
                this.f453k = jArr2;
                this.f456n = jArr3;
                this.f455m = iArr;
                this.f454l = iArr2;
                this.f457o = aVarArr;
                this.f452j = jArr;
                this.f460r = 0;
                this.f451i = i14;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int j(long j9) {
        int i9 = this.f458p;
        int iD = D(i9 - 1);
        while (i9 > this.f461s && this.f456n[iD] >= j9) {
            i9--;
            iD--;
            if (iD == -1) {
                iD = this.f451i - 1;
            }
        }
        return i9;
    }

    public final synchronized long m(long j9, boolean z9, boolean z10) {
        int i9;
        try {
            int i10 = this.f458p;
            if (i10 != 0) {
                long[] jArr = this.f456n;
                int i11 = this.f460r;
                if (j9 >= jArr[i11]) {
                    if (z10 && (i9 = this.f461s) != i10) {
                        i10 = i9 + 1;
                    }
                    int iV = v(i11, i10, j9, z9);
                    if (iV == -1) {
                        return -1L;
                    }
                    return p(iV);
                }
            }
            return -1L;
        } finally {
        }
    }

    public final synchronized long n() {
        int i9 = this.f458p;
        if (i9 == 0) {
            return -1L;
        }
        return p(i9);
    }

    public synchronized long o() {
        int i9 = this.f461s;
        if (i9 == 0) {
            return -1L;
        }
        return p(i9);
    }

    public final long p(int i9) {
        this.f463u = Math.max(this.f463u, B(i9));
        this.f458p -= i9;
        int i10 = this.f459q + i9;
        this.f459q = i10;
        int i11 = this.f460r + i9;
        this.f460r = i11;
        int i12 = this.f451i;
        if (i11 >= i12) {
            this.f460r = i11 - i12;
        }
        int i13 = this.f461s - i9;
        this.f461s = i13;
        if (i13 < 0) {
            this.f461s = 0;
        }
        this.f445c.d(i10);
        if (this.f458p != 0) {
            return this.f453k[this.f460r];
        }
        int i14 = this.f460r;
        if (i14 == 0) {
            i14 = this.f451i;
        }
        int i15 = i14 - 1;
        return this.f453k[i15] + ((long) this.f454l[i15]);
    }

    public final void q(long j9, boolean z9, boolean z10) {
        this.f443a.b(m(j9, z9, z10));
    }

    public final void r() {
        this.f443a.b(n());
    }

    public final void s() {
        this.f443a.b(o());
    }

    public final long t(int i9) {
        int iG = G() - i9;
        boolean z9 = false;
        AbstractC1684a.a(iG >= 0 && iG <= this.f458p - this.f461s);
        int i10 = this.f458p - iG;
        this.f458p = i10;
        this.f464v = Math.max(this.f463u, B(i10));
        if (iG == 0 && this.f465w) {
            z9 = true;
        }
        this.f465w = z9;
        this.f445c.c(i9);
        int i11 = this.f458p;
        if (i11 == 0) {
            return 0L;
        }
        int iD = D(i11 - 1);
        return this.f453k[iD] + ((long) this.f454l[iD]);
    }

    public final void u(int i9) {
        this.f443a.c(t(i9));
    }

    public final int v(int i9, int i10, long j9, boolean z9) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = this.f456n[i9];
            if (j10 > j9) {
                return i11;
            }
            if (!z9 || (this.f455m[i9] & 1) != 0) {
                if (j10 == j9) {
                    return i12;
                }
                i11 = i12;
            }
            i9++;
            if (i9 == this.f451i) {
                i9 = 0;
            }
        }
        return i11;
    }

    public C0936z0 w(C0936z0 c0936z0) {
        return (this.f441F == 0 || c0936z0.f6471q == Long.MAX_VALUE) ? c0936z0 : c0936z0.b().k0(c0936z0.f6471q + this.f441F).G();
    }

    public final int x() {
        return this.f459q;
    }

    public final synchronized long y() {
        return this.f458p == 0 ? Long.MIN_VALUE : this.f456n[this.f460r];
    }

    public final synchronized long z() {
        return this.f464v;
    }
}

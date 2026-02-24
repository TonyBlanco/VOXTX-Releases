package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ue implements aae {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private C1333s f24693A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private C1333s f24694B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f24695C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f24696D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f24697E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f24698F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f24699G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ua f24700a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nt f24703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nn f24704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ud f24705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C1333s f24706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private nm f24707h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f24715p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f24716q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f24717r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f24718s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f24722w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f24725z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ub f24701b = new ub();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f24708i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f24709j = new int[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long[] f24710k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long[] f24713n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f24712m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f24711l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private aad[] f24714o = new aad[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ul f24702c = new ul(uk.f24743b);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f24719t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f24720u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f24721v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f24724y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f24723x = true;

    public ue(wr wrVar, nt ntVar, nn nnVar) {
        this.f24703d = ntVar;
        this.f24704e = nnVar;
        this.f24700a = new ua(wrVar);
    }

    public static ue N(wr wrVar, nt ntVar, nn nnVar) {
        af.s(ntVar);
        return new ue(wrVar, ntVar, nnVar);
    }

    public static ue O(wr wrVar) {
        return new ue(wrVar, null, null);
    }

    private final synchronized int Q(go goVar, ef efVar, boolean z9, boolean z10, ub ubVar) {
        try {
            efVar.f22775c = false;
            if (!aa()) {
                if (!z10 && !this.f24722w) {
                    C1333s c1333s = this.f24694B;
                    if (c1333s == null || (!z9 && c1333s == this.f24706g)) {
                        return -3;
                    }
                    af.s(c1333s);
                    W(c1333s, goVar);
                    return -5;
                }
                efVar.c(4);
                return -4;
            }
            Object obj = ((uc) this.f24702c.a(k())).f24691a;
            if (!z9 && obj == this.f24706g) {
                int iG = g(this.f24718s);
                if (!ab(iG)) {
                    efVar.f22775c = true;
                    return -3;
                }
                efVar.c(this.f24712m[iG]);
                long j9 = this.f24713n[iG];
                efVar.f22776d = j9;
                if (j9 < this.f24719t) {
                    efVar.a(Integer.MIN_VALUE);
                }
                ubVar.f24688a = this.f24711l[iG];
                ubVar.f24689b = this.f24710k[iG];
                ubVar.f24690c = this.f24714o[iG];
                return -4;
            }
            W((C1333s) obj, goVar);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized long R() {
        int i9 = this.f24715p;
        if (i9 == 0) {
            return -1L;
        }
        return S(i9);
    }

    private final long S(int i9) {
        this.f24720u = Math.max(this.f24720u, U(i9));
        this.f24715p -= i9;
        int i10 = this.f24716q + i9;
        this.f24716q = i10;
        int i11 = this.f24717r + i9;
        this.f24717r = i11;
        int i12 = this.f24708i;
        if (i11 >= i12) {
            this.f24717r = i11 - i12;
        }
        int i13 = this.f24718s - i9;
        this.f24718s = i13;
        if (i13 < 0) {
            this.f24718s = 0;
        }
        this.f24702c.f(i10);
        if (this.f24715p != 0) {
            return this.f24710k[this.f24717r];
        }
        int i14 = this.f24717r;
        if (i14 == 0) {
            i14 = this.f24708i;
        }
        int i15 = i14 - 1;
        return this.f24710k[i15] + ((long) this.f24711l[i15]);
    }

    private final long T(int i9) {
        int iM = m() - i9;
        af.u(iM >= 0 && iM <= this.f24715p - this.f24718s);
        int i10 = this.f24715p - iM;
        this.f24715p = i10;
        this.f24721v = Math.max(this.f24720u, U(i10));
        this.f24722w = iM == 0 && this.f24722w;
        this.f24702c.e(i9);
        int i11 = this.f24715p;
        if (i11 == 0) {
            return 0L;
        }
        int iG = g(i11 - 1);
        return this.f24710k[iG] + ((long) this.f24711l[iG]);
    }

    private final long U(int i9) {
        long jMax = Long.MIN_VALUE;
        if (i9 == 0) {
            return Long.MIN_VALUE;
        }
        int iG = g(i9 - 1);
        for (int i10 = 0; i10 < i9; i10++) {
            jMax = Math.max(jMax, this.f24713n[iG]);
            if ((this.f24712m[iG] & 1) != 0) {
                break;
            }
            iG--;
            if (iG == -1) {
                iG = this.f24708i - 1;
            }
        }
        return jMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001e, B:12:0x0025, B:16:0x002d, B:18:0x005f, B:25:0x0095, B:27:0x009e, B:20:0x0073, B:22:0x0077, B:24:0x0082, B:23:0x0080), top: B:34:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void V(long r9, int r11, long r12, int r14, com.google.ads.interactivemedia.v3.internal.aad r15) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ue.V(long, int, long, int, com.google.ads.interactivemedia.v3.internal.aad):void");
    }

    private final void W(C1333s c1333s, go goVar) {
        C1333s c1333s2 = this.f24706g;
        boolean z9 = c1333s2 == null;
        C1322o c1322o = z9 ? null : c1333s2.f24470o;
        this.f24706g = c1333s;
        C1322o c1322o2 = c1333s.f24470o;
        nt ntVar = this.f24703d;
        goVar.f23064b = ntVar != null ? c1333s.c(ntVar.b(c1333s)) : c1333s;
        goVar.f23063a = this.f24707h;
        if (this.f24703d == null) {
            return;
        }
        if (z9 || !cq.V(c1322o, c1322o2)) {
            nm nmVar = this.f24707h;
            nm nmVarI = this.f24703d.i(this.f24704e, c1333s);
            this.f24707h = nmVarI;
            goVar.f23063a = nmVarI;
            if (nmVar != null) {
                nmVar.m(this.f24704e);
            }
        }
    }

    private final void X() {
        nm nmVar = this.f24707h;
        if (nmVar != null) {
            nmVar.m(this.f24704e);
            this.f24707h = null;
            this.f24706g = null;
        }
    }

    private final synchronized void Y() {
        this.f24718s = 0;
        this.f24700a.h();
    }

    private final synchronized boolean Z(long j9) {
        if (this.f24715p == 0) {
            return j9 > this.f24720u;
        }
        if (s() >= j9) {
            return false;
        }
        int i9 = this.f24715p;
        int iG = g(i9 - 1);
        while (i9 > this.f24718s && this.f24713n[iG] >= j9) {
            i9--;
            iG--;
            if (iG == -1) {
                iG = this.f24708i - 1;
            }
        }
        T(this.f24716q + i9);
        return true;
    }

    private final boolean aa() {
        return this.f24718s != this.f24715p;
    }

    private final boolean ab(int i9) {
        nm nmVar = this.f24707h;
        if (nmVar == null || nmVar.a() == 4) {
            return true;
        }
        return (this.f24712m[i9] & 1073741824) == 0 && this.f24707h.o();
    }

    private final synchronized boolean ac(C1333s c1333s) {
        try {
            this.f24724y = false;
            if (cq.V(c1333s, this.f24694B)) {
                return false;
            }
            if (!this.f24702c.g() && ((C1333s) ((uc) this.f24702c.b()).f24691a).equals(c1333s)) {
                c1333s = (C1333s) ((uc) this.f24702c.b()).f24691a;
            }
            this.f24694B = c1333s;
            C1333s c1333s2 = this.f24694B;
            this.f24696D = ar.k(c1333s2.f24467l, c1333s2.f24464i);
            this.f24697E = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized long ad(long j9, boolean z9) {
        int i9;
        try {
            int i10 = this.f24715p;
            if (i10 != 0) {
                long[] jArr = this.f24713n;
                int i11 = this.f24717r;
                if (j9 >= jArr[i11]) {
                    if (z9 && (i9 = this.f24718s) != i10) {
                        i10 = i9 + 1;
                    }
                    int iD = d(i11, i10, j9, false);
                    if (iD == -1) {
                        return -1L;
                    }
                    return S(iD);
                }
            }
            return -1L;
        } finally {
        }
    }

    private final int d(int i9, int i10, long j9, boolean z9) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = this.f24713n[i9];
            if (j10 > j9) {
                break;
            }
            if (!z9 || (this.f24712m[i9] & 1) != 0) {
                i11 = i12;
                if (j10 == j9) {
                    break;
                }
            }
            i9++;
            if (i9 == this.f24708i) {
                i9 = 0;
            }
        }
        return i11;
    }

    private final int g(int i9) {
        int i10 = this.f24717r + i9;
        int i11 = this.f24708i;
        return i10 < i11 ? i10 : i10 - i11;
    }

    public final void A() {
        C(true);
        X();
    }

    public final void B() {
        C(false);
    }

    public final void C(boolean z9) {
        this.f24700a.g();
        this.f24715p = 0;
        this.f24716q = 0;
        this.f24717r = 0;
        this.f24718s = 0;
        this.f24723x = true;
        this.f24719t = Long.MIN_VALUE;
        this.f24720u = Long.MIN_VALUE;
        this.f24721v = Long.MIN_VALUE;
        this.f24722w = false;
        this.f24702c.d();
        if (z9) {
            this.f24693A = null;
            this.f24694B = null;
            this.f24724y = true;
        }
    }

    public final void D(long j9) {
        if (this.f24698F != j9) {
            this.f24698F = j9;
            x();
        }
    }

    public final void E(long j9) {
        this.f24719t = j9;
    }

    public final void F(ud udVar) {
        this.f24705f = udVar;
    }

    public final synchronized void G(int i9) {
        boolean z9 = false;
        if (i9 >= 0) {
            try {
                if (this.f24718s + i9 <= this.f24715p) {
                    z9 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        af.u(z9);
        this.f24718s += i9;
    }

    public final void H(int i9) {
        this.f24695C = i9;
    }

    public final void I() {
        this.f24699G = true;
    }

    public final synchronized boolean J() {
        return this.f24722w;
    }

    public final synchronized boolean K(boolean z9) {
        boolean z10 = true;
        if (aa()) {
            if (((uc) this.f24702c.a(k())).f24691a != this.f24706g) {
                return true;
            }
            return ab(g(this.f24718s));
        }
        if (!z9 && !this.f24722w) {
            C1333s c1333s = this.f24694B;
            if (c1333s == null) {
                z10 = false;
            } else if (c1333s == this.f24706g) {
                return false;
            }
        }
        return z10;
    }

    public final synchronized boolean L(int i9) {
        Y();
        int i10 = this.f24716q;
        if (i9 >= i10 && i9 <= this.f24715p + i10) {
            this.f24719t = Long.MIN_VALUE;
            this.f24718s = i9 - i10;
            return true;
        }
        return false;
    }

    public final synchronized boolean M(long j9, boolean z9) {
        Y();
        int i9 = this.f24718s;
        int iG = g(i9);
        if (!aa() || j9 < this.f24713n[iG] || (j9 > this.f24721v && !z9)) {
            return false;
        }
        int iD = d(iG, this.f24715p - i9, j9, true);
        if (iD == -1) {
            return false;
        }
        this.f24719t = j9;
        this.f24718s += iD;
        return true;
    }

    public final void P(long j9, boolean z9) {
        this.f24700a.c(ad(j9, z9));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final /* synthetic */ int a(InterfaceC1310k interfaceC1310k, int i9, boolean z9) {
        return fz.h(this, interfaceC1310k, i9, z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final void b(C1333s c1333s) {
        C1333s c1333sC = c(c1333s);
        this.f24725z = false;
        this.f24693A = c1333s;
        boolean zAc = ac(c1333sC);
        ud udVar = this.f24705f;
        if (udVar == null || !zAc) {
            return;
        }
        udVar.H();
    }

    public C1333s c(C1333s c1333s) {
        if (this.f24698F == 0 || c1333s.f24471p == Long.MAX_VALUE) {
            return c1333s;
        }
        r rVarB = c1333s.b();
        rVarB.ai(c1333s.f24471p + this.f24698F);
        return rVarB.v();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final /* synthetic */ void e(cj cjVar, int i9) {
        fz.i(this, cjVar, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    @Override // com.google.ads.interactivemedia.v3.internal.aae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(long r12, int r14, int r15, int r16, com.google.ads.interactivemedia.v3.internal.aad r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f24725z
            if (r0 == 0) goto Ld
            com.google.ads.interactivemedia.v3.internal.s r0 = r8.f24693A
            com.google.ads.interactivemedia.v3.internal.af.t(r0)
            r11.b(r0)
        Ld:
            r0 = r14 & 1
            boolean r1 = r8.f24723x
            r2 = 0
            if (r1 == 0) goto L19
            if (r0 != 0) goto L17
            return
        L17:
            r8.f24723x = r2
        L19:
            long r3 = r8.f24698F
            long r3 = r3 + r12
            boolean r1 = r8.f24696D
            if (r1 == 0) goto L45
            long r5 = r8.f24719t
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L27
            return
        L27:
            if (r0 != 0) goto L45
            boolean r1 = r8.f24697E
            if (r1 != 0) goto L41
            com.google.ads.interactivemedia.v3.internal.s r1 = r8.f24694B
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r5 = "Overriding unexpected non-sync sample for format: "
            java.lang.String r1 = r5.concat(r1)
            java.lang.String r5 = "SampleQueue"
            com.google.ads.interactivemedia.v3.internal.cd.e(r5, r1)
            r1 = 1
            r8.f24697E = r1
        L41:
            r1 = r14 | 1
            r5 = r1
            goto L46
        L45:
            r5 = r14
        L46:
            boolean r1 = r8.f24699G
            if (r1 == 0) goto L57
            if (r0 == 0) goto L56
            boolean r0 = r11.Z(r3)
            if (r0 != 0) goto L53
            goto L56
        L53:
            r8.f24699G = r2
            goto L57
        L56:
            return
        L57:
            com.google.ads.interactivemedia.v3.internal.ua r0 = r8.f24700a
            long r0 = r0.b()
            r6 = r15
            long r9 = (long) r6
            long r0 = r0 - r9
            r2 = r16
            long r9 = (long) r2
            long r9 = r0 - r9
            r0 = r11
            r1 = r3
            r3 = r5
            r4 = r9
            r7 = r17
            r0.V(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ue.f(long, int, int, int, com.google.ads.interactivemedia.v3.internal.aad):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final int h(InterfaceC1310k interfaceC1310k, int i9, boolean z9) throws IOException {
        return this.f24700a.a(interfaceC1310k, i9, z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final void i(cj cjVar, int i9) {
        this.f24700a.i(cjVar, i9);
    }

    public final int j() {
        return this.f24716q;
    }

    public final int k() {
        return this.f24716q + this.f24718s;
    }

    public final synchronized int l(long j9, boolean z9) {
        int i9 = this.f24718s;
        int iG = g(i9);
        if (aa() && j9 >= this.f24713n[iG]) {
            if (j9 > this.f24721v && z9) {
                return this.f24715p - i9;
            }
            int iD = d(iG, this.f24715p - i9, j9, true);
            if (iD == -1) {
                return 0;
            }
            return iD;
        }
        return 0;
    }

    public final int m() {
        return this.f24716q + this.f24715p;
    }

    public final synchronized int n() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return aa() ? this.f24709j[g(this.f24718s)] : this.f24695C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r9 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o(com.google.ads.interactivemedia.v3.internal.go r9, com.google.ads.interactivemedia.v3.internal.ef r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = 1
            goto L9
        L7:
            r0 = 0
            r5 = 0
        L9:
            com.google.ads.interactivemedia.v3.internal.ub r7 = r8.f24701b
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.Q(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.g()
            if (r9 != 0) goto L2b
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L35
            if (r9 == 0) goto L2d
            com.google.ads.interactivemedia.v3.internal.ua r9 = r8.f24700a
            com.google.ads.interactivemedia.v3.internal.ub r11 = r8.f24701b
            r9.e(r10, r11)
        L2b:
            r9 = -4
            goto L3e
        L2d:
            com.google.ads.interactivemedia.v3.internal.ua r9 = r8.f24700a
            com.google.ads.interactivemedia.v3.internal.ub r11 = r8.f24701b
            r9.f(r10, r11)
            goto L38
        L35:
            if (r9 == 0) goto L38
            goto L2b
        L38:
            int r9 = r8.f24718s
            int r9 = r9 + r1
            r8.f24718s = r9
            return r12
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ue.o(com.google.ads.interactivemedia.v3.internal.go, com.google.ads.interactivemedia.v3.internal.ef, int, boolean):int");
    }

    public final synchronized long p() {
        int i9 = this.f24718s;
        if (i9 == 0) {
            return -1L;
        }
        return S(i9);
    }

    public final synchronized long q() {
        if (this.f24715p == 0) {
            return Long.MIN_VALUE;
        }
        return this.f24713n[this.f24717r];
    }

    public final synchronized long r() {
        return this.f24721v;
    }

    public final synchronized long s() {
        return Math.max(this.f24720u, U(this.f24718s));
    }

    public final synchronized C1333s t() {
        if (this.f24724y) {
            return null;
        }
        return this.f24694B;
    }

    public final void u() {
        this.f24700a.c(R());
    }

    public final void v() {
        this.f24700a.c(p());
    }

    public final void w(int i9) {
        this.f24700a.d(T(i9));
    }

    public final void x() {
        this.f24725z = true;
    }

    public final void y() throws IOException {
        nm nmVar = this.f24707h;
        if (nmVar == null || nmVar.a() != 1) {
            return;
        }
        nl nlVarC = this.f24707h.c();
        af.s(nlVarC);
        throw nlVarC;
    }

    public final void z() {
        u();
        X();
    }
}

package B3;

import B3.C0497e;
import B3.InterfaceC0517z;
import O2.A0;
import O2.C0936z0;
import O2.H1;
import d4.AbstractC1684a;
import java.util.List;

/* JADX INFO: renamed from: B3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0496d implements InterfaceC0517z, InterfaceC0517z.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0517z f523a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0517z.a f524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a[] f525d = new a[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0497e.b f529h;

    /* JADX INFO: renamed from: B3.d$a */
    public final class a implements Y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Y f530a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f531c;

        public a(Y y9) {
            this.f530a = y9;
        }

        @Override // B3.Y
        public void a() {
            this.f530a.a();
        }

        public void b() {
            this.f531c = false;
        }

        @Override // B3.Y
        public boolean e() {
            return !C0496d.this.o() && this.f530a.e();
        }

        @Override // B3.Y
        public int n(long j9) {
            if (C0496d.this.o()) {
                return -3;
            }
            return this.f530a.n(j9);
        }

        @Override // B3.Y
        public int q(A0 a02, U2.g gVar, int i9) {
            if (C0496d.this.o()) {
                return -3;
            }
            if (this.f531c) {
                gVar.setFlags(4);
                return -4;
            }
            int iQ = this.f530a.q(a02, gVar, i9);
            if (iQ == -5) {
                C0936z0 c0936z0 = (C0936z0) AbstractC1684a.e(a02.f5499b);
                int i10 = c0936z0.f6449C;
                if (i10 != 0 || c0936z0.f6450D != 0) {
                    C0496d c0496d = C0496d.this;
                    if (c0496d.f527f != 0) {
                        i10 = 0;
                    }
                    a02.f5499b = c0936z0.b().P(i10).Q(c0496d.f528g == Long.MIN_VALUE ? c0936z0.f6450D : 0).G();
                }
                return -5;
            }
            C0496d c0496d2 = C0496d.this;
            long j9 = c0496d2.f528g;
            if (j9 == Long.MIN_VALUE || ((iQ != -4 || gVar.f9701f < j9) && !(iQ == -3 && c0496d2.g() == Long.MIN_VALUE && !gVar.f9700e))) {
                return iQ;
            }
            gVar.clear();
            gVar.setFlags(4);
            this.f531c = true;
            return -4;
        }
    }

    public C0496d(InterfaceC0517z interfaceC0517z, boolean z9, long j9, long j10) {
        this.f523a = interfaceC0517z;
        this.f526e = z9 ? j9 : -9223372036854775807L;
        this.f527f = j9;
        this.f528g = j10;
    }

    public static boolean t(long j9, Z3.s[] sVarArr) {
        if (j9 != 0) {
            for (Z3.s sVar : sVarArr) {
                if (sVar != null) {
                    C0936z0 c0936z0P = sVar.p();
                    if (!d4.F.a(c0936z0P.f6467m, c0936z0P.f6464j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final H1 a(long j9, H1 h12) {
        long jS = d4.k0.s(h12.f5672a, 0L, j9 - this.f527f);
        long j10 = h12.f5673b;
        long j11 = this.f528g;
        long jS2 = d4.k0.s(j10, 0L, j11 == Long.MIN_VALUE ? Long.MAX_VALUE : j11 - j9);
        return (jS == h12.f5672a && jS2 == h12.f5673b) ? h12 : new H1(jS, jS2);
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public boolean b() {
        return this.f523a.b();
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public long c() {
        long jC = this.f523a.c();
        if (jC != Long.MIN_VALUE) {
            long j9 = this.f528g;
            if (j9 == Long.MIN_VALUE || jC < j9) {
                return jC;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // B3.InterfaceC0517z
    public long d(long j9, H1 h12) {
        long j10 = this.f527f;
        if (j9 == j10) {
            return j10;
        }
        return this.f523a.d(j9, a(j9, h12));
    }

    @Override // B3.InterfaceC0517z.a
    public void e(InterfaceC0517z interfaceC0517z) {
        if (this.f529h != null) {
            return;
        }
        ((InterfaceC0517z.a) AbstractC1684a.e(this.f524c)).e(this);
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public boolean f(long j9) {
        return this.f523a.f(j9);
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public long g() {
        long jG = this.f523a.g();
        if (jG != Long.MIN_VALUE) {
            long j9 = this.f528g;
            if (j9 == Long.MIN_VALUE || jG < j9) {
                return jG;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public void h(long j9) {
        this.f523a.h(j9);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // B3.InterfaceC0517z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long i(Z3.s[] r13, boolean[] r14, B3.Y[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            B3.d$a[] r2 = new B3.C0496d.a[r2]
            r0.f525d = r2
            int r2 = r1.length
            B3.Y[] r9 = new B3.Y[r2]
            r10 = 0
            r2 = 0
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            B3.d$a[] r3 = r0.f525d
            r4 = r1[r2]
            B3.d$a r4 = (B3.C0496d.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            B3.Y r11 = r4.f530a
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            B3.z r2 = r0.f523a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.i(r3, r4, r5, r6, r7)
            boolean r4 = r12.o()
            if (r4 == 0) goto L43
            long r4 = r0.f527f
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            r6 = r13
            boolean r4 = t(r4, r13)
            if (r4 == 0) goto L43
            r4 = r2
            goto L48
        L43:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            r0.f526e = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.f527f
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L61
            long r4 = r0.f528g
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L63
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L61
            goto L63
        L61:
            r4 = 0
            goto L64
        L63:
            r4 = 1
        L64:
            d4.AbstractC1684a.g(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L8d
            r4 = r9[r10]
            if (r4 != 0) goto L73
            B3.d$a[] r4 = r0.f525d
            r4[r10] = r11
            goto L84
        L73:
            B3.d$a[] r5 = r0.f525d
            r6 = r5[r10]
            if (r6 == 0) goto L7d
            B3.Y r6 = r6.f530a
            if (r6 == r4) goto L84
        L7d:
            B3.d$a r6 = new B3.d$a
            r6.<init>(r4)
            r5[r10] = r6
        L84:
            B3.d$a[] r4 = r0.f525d
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.C0496d.i(Z3.s[], boolean[], B3.Y[], boolean[], long):long");
    }

    @Override // B3.InterfaceC0517z
    public /* synthetic */ List k(List list) {
        return AbstractC0516y.a(this, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // B3.InterfaceC0517z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long l(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f526e = r0
            B3.d$a[] r0 = r6.f525d
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            B3.z r0 = r6.f523a
            long r0 = r0.l(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L34
            long r7 = r6.f527f
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L35
            long r7 = r6.f528g
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L34
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L35
        L34:
            r2 = 1
        L35:
            d4.AbstractC1684a.g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.C0496d.l(long):long");
    }

    @Override // B3.InterfaceC0517z
    public long m() {
        if (o()) {
            long j9 = this.f526e;
            this.f526e = -9223372036854775807L;
            long jM = m();
            return jM != -9223372036854775807L ? jM : j9;
        }
        long jM2 = this.f523a.m();
        if (jM2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC1684a.g(jM2 >= this.f527f);
        long j10 = this.f528g;
        AbstractC1684a.g(j10 == Long.MIN_VALUE || jM2 <= j10);
        return jM2;
    }

    public boolean o() {
        return this.f526e != -9223372036854775807L;
    }

    @Override // B3.InterfaceC0517z
    public void p() throws C0497e.b {
        C0497e.b bVar = this.f529h;
        if (bVar != null) {
            throw bVar;
        }
        this.f523a.p();
    }

    @Override // B3.Z.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(InterfaceC0517z interfaceC0517z) {
        ((InterfaceC0517z.a) AbstractC1684a.e(this.f524c)).j(this);
    }

    public void r(C0497e.b bVar) {
        this.f529h = bVar;
    }

    @Override // B3.InterfaceC0517z
    public void s(InterfaceC0517z.a aVar, long j9) {
        this.f524c = aVar;
        this.f523a.s(this, j9);
    }

    @Override // B3.InterfaceC0517z
    public i0 u() {
        return this.f523a.u();
    }

    @Override // B3.InterfaceC0517z
    public void v(long j9, boolean z9) {
        this.f523a.v(j9, z9);
    }

    public void w(long j9, long j10) {
        this.f527f = j9;
        this.f528g = j10;
    }
}

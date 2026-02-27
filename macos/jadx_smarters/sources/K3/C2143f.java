package k3;

import O2.C0897l1;
import O2.C0936z0;
import Q2.b0;
import android.net.Uri;
import d3.AbstractC1677n;
import d3.C1671h;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.InterfaceC1678o;
import d3.r;
import d3.s;
import d3.t;
import d3.w;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;
import java.io.EOFException;
import java.util.Map;
import k3.InterfaceC2144g;
import q3.C2540a;
import v3.h;
import v3.k;
import v3.m;

/* JADX INFO: renamed from: k3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2143f implements InterfaceC1672i {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final InterfaceC1678o f43543u = new InterfaceC1678o() { // from class: k3.d
        @Override // d3.InterfaceC1678o
        public /* synthetic */ InterfaceC1672i[] a(Uri uri, Map map) {
            return AbstractC1677n.a(this, uri, map);
        }

        @Override // d3.InterfaceC1678o
        public final InterfaceC1672i[] b() {
            return C2143f.o();
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h.a f43544v = new h.a() { // from class: k3.e
        @Override // v3.h.a
        public final boolean a(int i9, int i10, int i11, int i12, int i13) {
            return C2143f.p(i9, i10, i11, i12, i13);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f43547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0.a f43548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f43549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f43550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f43551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC1674k f43552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w f43553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w f43554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f43555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2540a f43556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f43557m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f43558n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f43559o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f43560p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InterfaceC2144g f43561q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f43562r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f43563s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f43564t;

    public C2143f() {
        this(0);
    }

    public C2143f(int i9) {
        this(i9, -9223372036854775807L);
    }

    public C2143f(int i9, long j9) {
        this.f43545a = (i9 & 2) != 0 ? i9 | 1 : i9;
        this.f43546b = j9;
        this.f43547c = new M(10);
        this.f43548d = new b0.a();
        this.f43549e = new r();
        this.f43557m = -9223372036854775807L;
        this.f43550f = new s();
        C1671h c1671h = new C1671h();
        this.f43551g = c1671h;
        this.f43554j = c1671h;
    }

    private void f() {
        AbstractC1684a.i(this.f43553i);
        k0.j(this.f43552h);
    }

    public static long l(C2540a c2540a) {
        if (c2540a == null) {
            return -9223372036854775807L;
        }
        int iF = c2540a.f();
        for (int i9 = 0; i9 < iF; i9++) {
            C2540a.b bVarE = c2540a.e(i9);
            if (bVarE instanceof m) {
                m mVar = (m) bVarE;
                if (mVar.f51316a.equals("TLEN")) {
                    return k0.P0(Long.parseLong((String) mVar.f51329e.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    public static int m(M m9, int i9) {
        if (m9.g() >= i9 + 4) {
            m9.U(i9);
            int iQ = m9.q();
            if (iQ == 1483304551 || iQ == 1231971951) {
                return iQ;
            }
        }
        if (m9.g() < 40) {
            return 0;
        }
        m9.U(36);
        return m9.q() == 1447187017 ? 1447187017 : 0;
    }

    public static boolean n(int i9, long j9) {
        return ((long) (i9 & (-128000))) == (j9 & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC1672i[] o() {
        return new InterfaceC1672i[]{new C2143f()};
    }

    public static /* synthetic */ boolean p(int i9, int i10, int i11, int i12, int i13) {
        return (i10 == 67 && i11 == 79 && i12 == 77 && (i13 == 77 || i9 == 2)) || (i10 == 77 && i11 == 76 && i12 == 76 && (i13 == 84 || i9 == 2));
    }

    public static C2140c q(C2540a c2540a, long j9) {
        if (c2540a == null) {
            return null;
        }
        int iF = c2540a.f();
        for (int i9 = 0; i9 < iF; i9++) {
            C2540a.b bVarE = c2540a.e(i9);
            if (bVarE instanceof k) {
                return C2140c.a(j9, (k) bVarE, l(c2540a));
            }
        }
        return null;
    }

    private int u(InterfaceC1673j interfaceC1673j) {
        if (this.f43560p == 0) {
            interfaceC1673j.f();
            if (s(interfaceC1673j)) {
                return -1;
            }
            this.f43547c.U(0);
            int iQ = this.f43547c.q();
            if (!n(iQ, this.f43555k) || b0.j(iQ) == -1) {
                interfaceC1673j.q(1);
                this.f43555k = 0;
                return 0;
            }
            this.f43548d.a(iQ);
            if (this.f43557m == -9223372036854775807L) {
                this.f43557m = this.f43561q.c(interfaceC1673j.getPosition());
                if (this.f43546b != -9223372036854775807L) {
                    this.f43557m += this.f43546b - this.f43561q.c(0L);
                }
            }
            b0.a aVar = this.f43548d;
            this.f43560p = aVar.f7770c;
            InterfaceC2144g interfaceC2144g = this.f43561q;
            if (interfaceC2144g instanceof C2139b) {
                C2139b c2139b = (C2139b) interfaceC2144g;
                c2139b.b(i(this.f43558n + ((long) aVar.f7774g)), interfaceC1673j.getPosition() + ((long) this.f43548d.f7770c));
                if (this.f43563s && c2139b.a(this.f43564t)) {
                    this.f43563s = false;
                    this.f43554j = this.f43553i;
                }
            }
        }
        int iA = this.f43554j.a(interfaceC1673j, this.f43560p, true);
        if (iA == -1) {
            return -1;
        }
        int i9 = this.f43560p - iA;
        this.f43560p = i9;
        if (i9 > 0) {
            return 0;
        }
        this.f43554j.f(i(this.f43558n), 1, this.f43548d.f7770c, 0, null);
        this.f43558n += (long) this.f43548d.f7774g;
        this.f43560p = 0;
        return 0;
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        this.f43555k = 0;
        this.f43557m = -9223372036854775807L;
        this.f43558n = 0L;
        this.f43560p = 0;
        this.f43564t = j10;
        InterfaceC2144g interfaceC2144g = this.f43561q;
        if (!(interfaceC2144g instanceof C2139b) || ((C2139b) interfaceC2144g).a(j10)) {
            return;
        }
        this.f43563s = true;
        this.f43554j = this.f43551g;
    }

    @Override // d3.InterfaceC1672i
    public void b(InterfaceC1674k interfaceC1674k) {
        this.f43552h = interfaceC1674k;
        w wVarE = interfaceC1674k.e(0, 1);
        this.f43553i = wVarE;
        this.f43554j = wVarE;
        this.f43552h.q();
    }

    @Override // d3.InterfaceC1672i
    public int d(InterfaceC1673j interfaceC1673j, t tVar) throws C0897l1 {
        f();
        int iT = t(interfaceC1673j);
        if (iT == -1 && (this.f43561q instanceof C2139b)) {
            long jI = i(this.f43558n);
            if (this.f43561q.i() != jI) {
                ((C2139b) this.f43561q).d(jI);
                this.f43552h.n(this.f43561q);
            }
        }
        return iT;
    }

    public final InterfaceC2144g g(InterfaceC1673j interfaceC1673j) {
        long jL;
        long jF;
        InterfaceC2144g interfaceC2144gR = r(interfaceC1673j);
        C2140c c2140cQ = q(this.f43556l, interfaceC1673j.getPosition());
        if (this.f43562r) {
            return new InterfaceC2144g.a();
        }
        if ((this.f43545a & 4) != 0) {
            if (c2140cQ != null) {
                jL = c2140cQ.i();
                jF = c2140cQ.f();
            } else if (interfaceC2144gR != null) {
                jL = interfaceC2144gR.i();
                jF = interfaceC2144gR.f();
            } else {
                jL = l(this.f43556l);
                jF = -1;
            }
            interfaceC2144gR = new C2139b(jL, interfaceC1673j.getPosition(), jF);
        } else if (c2140cQ != null) {
            interfaceC2144gR = c2140cQ;
        } else if (interfaceC2144gR == null) {
            interfaceC2144gR = null;
        }
        if (interfaceC2144gR == null || !(interfaceC2144gR.g() || (this.f43545a & 1) == 0)) {
            return k(interfaceC1673j, (this.f43545a & 2) != 0);
        }
        return interfaceC2144gR;
    }

    @Override // d3.InterfaceC1672i
    public boolean h(InterfaceC1673j interfaceC1673j) {
        return v(interfaceC1673j, true);
    }

    public final long i(long j9) {
        return this.f43557m + ((j9 * 1000000) / ((long) this.f43548d.f7771d));
    }

    public void j() {
        this.f43562r = true;
    }

    public final InterfaceC2144g k(InterfaceC1673j interfaceC1673j, boolean z9) {
        interfaceC1673j.s(this.f43547c.e(), 0, 4);
        this.f43547c.U(0);
        this.f43548d.a(this.f43547c.q());
        return new C2138a(interfaceC1673j.getLength(), interfaceC1673j.getPosition(), this.f43548d, z9);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k3.InterfaceC2144g r(d3.InterfaceC1673j r11) {
        /*
            r10 = this;
            d4.M r5 = new d4.M
            Q2.b0$a r0 = r10.f43548d
            int r0 = r0.f7770c
            r5.<init>(r0)
            byte[] r0 = r5.e()
            Q2.b0$a r1 = r10.f43548d
            int r1 = r1.f7770c
            r6 = 0
            r11.s(r0, r6, r1)
            Q2.b0$a r0 = r10.f43548d
            int r1 = r0.f7768a
            r2 = 1
            r1 = r1 & r2
            r3 = 21
            int r0 = r0.f7772e
            if (r1 == 0) goto L2b
            if (r0 == r2) goto L28
            r3 = 36
            r7 = 36
            goto L32
        L28:
            r7 = 21
            goto L32
        L2b:
            if (r0 == r2) goto L2e
            goto L28
        L2e:
            r3 = 13
            r7 = 13
        L32:
            int r8 = m(r5, r7)
            r0 = 1483304551(0x58696e67, float:1.02664153E15)
            r9 = 1231971951(0x496e666f, float:976486.94)
            if (r8 == r0) goto L61
            if (r8 != r9) goto L41
            goto L61
        L41:
            r0 = 1447187017(0x56425249, float:5.3414667E13)
            if (r8 != r0) goto L5c
            long r0 = r11.getLength()
            long r2 = r11.getPosition()
            Q2.b0$a r4 = r10.f43548d
            k3.h r0 = k3.C2145h.a(r0, r2, r4, r5)
            Q2.b0$a r1 = r10.f43548d
            int r1 = r1.f7770c
            r11.q(r1)
            goto Lb1
        L5c:
            r11.f()
            r0 = 0
            goto Lb1
        L61:
            long r0 = r11.getLength()
            long r2 = r11.getPosition()
            Q2.b0$a r4 = r10.f43548d
            k3.i r0 = k3.C2146i.a(r0, r2, r4, r5)
            if (r0 == 0) goto L9b
            d3.r r1 = r10.f43549e
            boolean r1 = r1.a()
            if (r1 != 0) goto L9b
            r11.f()
            int r7 = r7 + 141
            r11.n(r7)
            d4.M r1 = r10.f43547c
            byte[] r1 = r1.e()
            r2 = 3
            r11.s(r1, r6, r2)
            d4.M r1 = r10.f43547c
            r1.U(r6)
            d3.r r1 = r10.f43549e
            d4.M r2 = r10.f43547c
            int r2 = r2.K()
            r1.d(r2)
        L9b:
            Q2.b0$a r1 = r10.f43548d
            int r1 = r1.f7770c
            r11.q(r1)
            if (r0 == 0) goto Lb1
            boolean r1 = r0.g()
            if (r1 != 0) goto Lb1
            if (r8 != r9) goto Lb1
            k3.g r11 = r10.k(r11, r6)
            return r11
        Lb1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.C2143f.r(d3.j):k3.g");
    }

    @Override // d3.InterfaceC1672i
    public void release() {
    }

    public final boolean s(InterfaceC1673j interfaceC1673j) {
        InterfaceC2144g interfaceC2144g = this.f43561q;
        if (interfaceC2144g != null) {
            long jF = interfaceC2144g.f();
            if (jF != -1 && interfaceC1673j.k() > jF - 4) {
                return true;
            }
        }
        try {
            return !interfaceC1673j.d(this.f43547c.e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final int t(InterfaceC1673j interfaceC1673j) throws C0897l1 {
        if (this.f43555k == 0) {
            try {
                v(interfaceC1673j, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f43561q == null) {
            InterfaceC2144g interfaceC2144gG = g(interfaceC1673j);
            this.f43561q = interfaceC2144gG;
            this.f43552h.n(interfaceC2144gG);
            this.f43554j.d(new C0936z0.b().g0(this.f43548d.f7769b).Y(4096).J(this.f43548d.f7772e).h0(this.f43548d.f7771d).P(this.f43549e.f39605a).Q(this.f43549e.f39606b).Z((this.f43545a & 8) != 0 ? null : this.f43556l).G());
            this.f43559o = interfaceC1673j.getPosition();
        } else if (this.f43559o != 0) {
            long position = interfaceC1673j.getPosition();
            long j9 = this.f43559o;
            if (position < j9) {
                interfaceC1673j.q((int) (j9 - position));
            }
        }
        return u(interfaceC1673j);
    }

    public final boolean v(InterfaceC1673j interfaceC1673j, boolean z9) throws C0897l1, EOFException {
        int i9;
        int iK;
        int iJ;
        int i10 = z9 ? 32768 : 131072;
        interfaceC1673j.f();
        if (interfaceC1673j.getPosition() == 0) {
            C2540a c2540aA = this.f43550f.a(interfaceC1673j, (this.f43545a & 8) == 0 ? null : f43544v);
            this.f43556l = c2540aA;
            if (c2540aA != null) {
                this.f43549e.c(c2540aA);
            }
            iK = (int) interfaceC1673j.k();
            if (!z9) {
                interfaceC1673j.q(iK);
            }
            i9 = 0;
        } else {
            i9 = 0;
            iK = 0;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (!s(interfaceC1673j)) {
                this.f43547c.U(0);
                int iQ = this.f43547c.q();
                if ((i9 == 0 || n(iQ, i9)) && (iJ = b0.j(iQ)) != -1) {
                    i11++;
                    if (i11 != 1) {
                        if (i11 == 4) {
                            break;
                        }
                    } else {
                        this.f43548d.a(iQ);
                        i9 = iQ;
                    }
                    interfaceC1673j.n(iJ - 4);
                } else {
                    int i13 = i12 + 1;
                    if (i12 == i10) {
                        if (z9) {
                            return false;
                        }
                        throw C0897l1.a("Searched too many bytes.", null);
                    }
                    if (z9) {
                        interfaceC1673j.f();
                        interfaceC1673j.n(iK + i13);
                    } else {
                        interfaceC1673j.q(1);
                    }
                    i12 = i13;
                    i9 = 0;
                    i11 = 0;
                }
            } else if (i11 <= 0) {
                throw new EOFException();
            }
        }
        if (z9) {
            interfaceC1673j.q(iK + i12);
        } else {
            interfaceC1673j.f();
        }
        this.f43555k = i9;
        return true;
    }
}

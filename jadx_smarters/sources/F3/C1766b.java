package f3;

import O2.C0897l1;
import O2.C0936z0;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.extractor.g;
import d3.C1670g;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.t;
import d3.w;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.F;
import d4.M;
import java.util.ArrayList;
import s5.c0;

/* JADX INFO: renamed from: f3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1766b implements InterfaceC1672i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40564c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1767c f40566e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f40569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C1769e f40570i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f40574m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f40575n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f40562a = new M(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f40563b = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1674k f40565d = new C1670g();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1769e[] f40568g = new C1769e[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f40572k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f40573l = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40571j = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f40567f = -9223372036854775807L;

    /* JADX INFO: renamed from: f3.b$b, reason: collision with other inner class name */
    public class C0326b implements com.google.android.exoplayer2.extractor.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f40576a;

        public C0326b(long j9) {
            this.f40576a = j9;
        }

        @Override // com.google.android.exoplayer2.extractor.g
        public g.a e(long j9) {
            g.a aVarI = C1766b.this.f40568g[0].i(j9);
            for (int i9 = 1; i9 < C1766b.this.f40568g.length; i9++) {
                g.a aVarI2 = C1766b.this.f40568g[i9].i(j9);
                if (aVarI2.f25422a.f39611b < aVarI.f25422a.f39611b) {
                    aVarI = aVarI2;
                }
            }
            return aVarI;
        }

        @Override // com.google.android.exoplayer2.extractor.g
        public boolean g() {
            return true;
        }

        @Override // com.google.android.exoplayer2.extractor.g
        public long i() {
            return this.f40576a;
        }
    }

    /* JADX INFO: renamed from: f3.b$c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f40579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f40580c;

        public c() {
        }

        public void a(M m9) {
            this.f40578a = m9.u();
            this.f40579b = m9.u();
            this.f40580c = 0;
        }

        public void b(M m9) throws C0897l1 {
            a(m9);
            if (this.f40578a == 1414744396) {
                this.f40580c = m9.u();
                return;
            }
            throw C0897l1.a("LIST expected, found: " + this.f40578a, null);
        }
    }

    public static void e(InterfaceC1673j interfaceC1673j) {
        if ((interfaceC1673j.getPosition() & 1) == 1) {
            interfaceC1673j.q(1);
        }
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        this.f40569h = -1L;
        this.f40570i = null;
        for (C1769e c1769e : this.f40568g) {
            c1769e.o(j9);
        }
        if (j9 != 0) {
            this.f40564c = 6;
        } else if (this.f40568g.length == 0) {
            this.f40564c = 0;
        } else {
            this.f40564c = 3;
        }
    }

    @Override // d3.InterfaceC1672i
    public void b(InterfaceC1674k interfaceC1674k) {
        this.f40564c = 0;
        this.f40565d = interfaceC1674k;
        this.f40569h = -1L;
    }

    @Override // d3.InterfaceC1672i
    public int d(InterfaceC1673j interfaceC1673j, t tVar) throws C0897l1 {
        if (m(interfaceC1673j, tVar)) {
            return 1;
        }
        switch (this.f40564c) {
            case 0:
                if (!h(interfaceC1673j)) {
                    throw C0897l1.a("AVI Header List not found", null);
                }
                interfaceC1673j.q(12);
                this.f40564c = 1;
                return 0;
            case 1:
                interfaceC1673j.m(this.f40562a.e(), 0, 12);
                this.f40562a.U(0);
                this.f40563b.b(this.f40562a);
                c cVar = this.f40563b;
                if (cVar.f40580c == 1819436136) {
                    this.f40571j = cVar.f40579b;
                    this.f40564c = 2;
                    return 0;
                }
                throw C0897l1.a("hdrl expected, found: " + this.f40563b.f40580c, null);
            case 2:
                int i9 = this.f40571j - 4;
                M m9 = new M(i9);
                interfaceC1673j.m(m9.e(), 0, i9);
                g(m9);
                this.f40564c = 3;
                return 0;
            case 3:
                if (this.f40572k != -1) {
                    long position = interfaceC1673j.getPosition();
                    long j9 = this.f40572k;
                    if (position != j9) {
                        this.f40569h = j9;
                        return 0;
                    }
                }
                interfaceC1673j.s(this.f40562a.e(), 0, 12);
                interfaceC1673j.f();
                this.f40562a.U(0);
                this.f40563b.a(this.f40562a);
                int iU = this.f40562a.u();
                int i10 = this.f40563b.f40578a;
                if (i10 == 1179011410) {
                    interfaceC1673j.q(12);
                    return 0;
                }
                if (i10 != 1414744396 || iU != 1769369453) {
                    this.f40569h = interfaceC1673j.getPosition() + ((long) this.f40563b.f40579b) + 8;
                    return 0;
                }
                long position2 = interfaceC1673j.getPosition();
                this.f40572k = position2;
                this.f40573l = position2 + ((long) this.f40563b.f40579b) + 8;
                if (!this.f40575n) {
                    if (((C1767c) AbstractC1684a.e(this.f40566e)).a()) {
                        this.f40564c = 4;
                        this.f40569h = this.f40573l;
                        return 0;
                    }
                    this.f40565d.n(new g.b(this.f40567f));
                    this.f40575n = true;
                }
                this.f40569h = interfaceC1673j.getPosition() + 12;
                this.f40564c = 6;
                return 0;
            case 4:
                interfaceC1673j.m(this.f40562a.e(), 0, 8);
                this.f40562a.U(0);
                int iU2 = this.f40562a.u();
                int iU3 = this.f40562a.u();
                if (iU2 == 829973609) {
                    this.f40564c = 5;
                    this.f40574m = iU3;
                } else {
                    this.f40569h = interfaceC1673j.getPosition() + ((long) iU3);
                }
                return 0;
            case 5:
                M m10 = new M(this.f40574m);
                interfaceC1673j.m(m10.e(), 0, this.f40574m);
                i(m10);
                this.f40564c = 6;
                this.f40569h = this.f40572k;
                return 0;
            case 6:
                return l(interfaceC1673j);
            default:
                throw new AssertionError();
        }
    }

    public final C1769e f(int i9) {
        for (C1769e c1769e : this.f40568g) {
            if (c1769e.j(i9)) {
                return c1769e;
            }
        }
        return null;
    }

    public final void g(M m9) throws C0897l1 {
        C1770f c1770fC = C1770f.c(1819436136, m9);
        if (c1770fC.getType() != 1819436136) {
            throw C0897l1.a("Unexpected header list type " + c1770fC.getType(), null);
        }
        C1767c c1767c = (C1767c) c1770fC.b(C1767c.class);
        if (c1767c == null) {
            throw C0897l1.a("AviHeader not found", null);
        }
        this.f40566e = c1767c;
        this.f40567f = ((long) c1767c.f40583c) * ((long) c1767c.f40581a);
        ArrayList arrayList = new ArrayList();
        c0 it = c1770fC.f40603a.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            InterfaceC1765a interfaceC1765a = (InterfaceC1765a) it.next();
            if (interfaceC1765a.getType() == 1819440243) {
                int i10 = i9 + 1;
                C1769e c1769eK = k((C1770f) interfaceC1765a, i9);
                if (c1769eK != null) {
                    arrayList.add(c1769eK);
                }
                i9 = i10;
            }
        }
        this.f40568g = (C1769e[]) arrayList.toArray(new C1769e[0]);
        this.f40565d.q();
    }

    @Override // d3.InterfaceC1672i
    public boolean h(InterfaceC1673j interfaceC1673j) {
        interfaceC1673j.s(this.f40562a.e(), 0, 12);
        this.f40562a.U(0);
        if (this.f40562a.u() != 1179011410) {
            return false;
        }
        this.f40562a.V(4);
        return this.f40562a.u() == 541677121;
    }

    public final void i(M m9) {
        long j9 = j(m9);
        while (m9.a() >= 16) {
            int iU = m9.u();
            int iU2 = m9.u();
            long jU = ((long) m9.u()) + j9;
            m9.u();
            C1769e c1769eF = f(iU);
            if (c1769eF != null) {
                if ((iU2 & 16) == 16) {
                    c1769eF.b(jU);
                }
                c1769eF.k();
            }
        }
        for (C1769e c1769e : this.f40568g) {
            c1769e.c();
        }
        this.f40575n = true;
        this.f40565d.n(new C0326b(this.f40567f));
    }

    public final long j(M m9) {
        if (m9.a() < 16) {
            return 0L;
        }
        int iF = m9.f();
        m9.V(8);
        long jU = m9.u();
        long j9 = this.f40572k;
        long j10 = jU <= j9 ? j9 + 8 : 0L;
        m9.U(iF);
        return j10;
    }

    public final C1769e k(C1770f c1770f, int i9) {
        String str;
        C1768d c1768d = (C1768d) c1770f.b(C1768d.class);
        C1771g c1771g = (C1771g) c1770f.b(C1771g.class);
        if (c1768d == null) {
            str = "Missing Stream Header";
        } else {
            if (c1771g != null) {
                long jA = c1768d.a();
                C0936z0 c0936z0 = c1771g.f40605a;
                C0936z0.b bVarB = c0936z0.b();
                bVarB.T(i9);
                int i10 = c1768d.f40590f;
                if (i10 != 0) {
                    bVarB.Y(i10);
                }
                C1772h c1772h = (C1772h) c1770f.b(C1772h.class);
                if (c1772h != null) {
                    bVarB.W(c1772h.f40606a);
                }
                int iK = F.k(c0936z0.f6467m);
                if (iK != 1 && iK != 2) {
                    return null;
                }
                w wVarE = this.f40565d.e(i9, iK);
                wVarE.d(bVarB.G());
                C1769e c1769e = new C1769e(i9, iK, jA, c1768d.f40589e, wVarE);
                this.f40567f = jA;
                return c1769e;
            }
            str = "Missing Stream Format";
        }
        AbstractC1681B.j("AviExtractor", str);
        return null;
    }

    public final int l(InterfaceC1673j interfaceC1673j) {
        if (interfaceC1673j.getPosition() >= this.f40573l) {
            return -1;
        }
        C1769e c1769e = this.f40570i;
        if (c1769e == null) {
            e(interfaceC1673j);
            interfaceC1673j.s(this.f40562a.e(), 0, 12);
            this.f40562a.U(0);
            int iU = this.f40562a.u();
            if (iU == 1414744396) {
                this.f40562a.U(8);
                interfaceC1673j.q(this.f40562a.u() != 1769369453 ? 8 : 12);
                interfaceC1673j.f();
                return 0;
            }
            int iU2 = this.f40562a.u();
            if (iU == 1263424842) {
                this.f40569h = interfaceC1673j.getPosition() + ((long) iU2) + 8;
                return 0;
            }
            interfaceC1673j.q(8);
            interfaceC1673j.f();
            C1769e c1769eF = f(iU);
            if (c1769eF == null) {
                this.f40569h = interfaceC1673j.getPosition() + ((long) iU2);
                return 0;
            }
            c1769eF.n(iU2);
            this.f40570i = c1769eF;
        } else if (c1769e.m(interfaceC1673j)) {
            this.f40570i = null;
        }
        return 0;
    }

    public final boolean m(InterfaceC1673j interfaceC1673j, t tVar) {
        boolean z9;
        if (this.f40569h != -1) {
            long position = interfaceC1673j.getPosition();
            long j9 = this.f40569h;
            if (j9 < position || j9 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + position) {
                tVar.f39608a = j9;
                z9 = true;
            } else {
                interfaceC1673j.q((int) (j9 - position));
                z9 = false;
            }
        } else {
            z9 = false;
        }
        this.f40569h = -1L;
        return z9;
    }

    @Override // d3.InterfaceC1672i
    public void release() {
    }
}

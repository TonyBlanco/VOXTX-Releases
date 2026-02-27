package i3;

import O2.C0936z0;
import com.google.android.exoplayer2.extractor.g;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.t;
import d4.AbstractC1684a;
import d4.M;
import l3.C2186k;
import q3.C2540a;
import w3.C2908b;

/* JADX INFO: renamed from: i3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1884a implements InterfaceC1672i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1674k f41835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41838e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C2908b f41840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC1673j f41841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f41842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C2186k f41843j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f41834a = new M(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f41839f = -1;

    public static C2908b f(String str, long j9) {
        b bVarA;
        if (j9 == -1 || (bVarA = e.a(str)) == null) {
            return null;
        }
        return bVarA.a(j9);
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        if (j9 == 0) {
            this.f41836c = 0;
            this.f41843j = null;
        } else if (this.f41836c == 5) {
            ((C2186k) AbstractC1684a.e(this.f41843j)).a(j9, j10);
        }
    }

    @Override // d3.InterfaceC1672i
    public void b(InterfaceC1674k interfaceC1674k) {
        this.f41835b = interfaceC1674k;
    }

    public final void c(InterfaceC1673j interfaceC1673j) {
        this.f41834a.Q(2);
        interfaceC1673j.s(this.f41834a.e(), 0, 2);
        interfaceC1673j.n(this.f41834a.N() - 2);
    }

    @Override // d3.InterfaceC1672i
    public int d(InterfaceC1673j interfaceC1673j, t tVar) {
        int i9 = this.f41836c;
        if (i9 == 0) {
            j(interfaceC1673j);
            return 0;
        }
        if (i9 == 1) {
            l(interfaceC1673j);
            return 0;
        }
        if (i9 == 2) {
            k(interfaceC1673j);
            return 0;
        }
        if (i9 == 4) {
            long position = interfaceC1673j.getPosition();
            long j9 = this.f41839f;
            if (position != j9) {
                tVar.f39608a = j9;
                return 1;
            }
            m(interfaceC1673j);
            return 0;
        }
        if (i9 != 5) {
            if (i9 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f41842i == null || interfaceC1673j != this.f41841h) {
            this.f41841h = interfaceC1673j;
            this.f41842i = new c(interfaceC1673j, this.f41839f);
        }
        int iD = ((C2186k) AbstractC1684a.e(this.f41843j)).d(this.f41842i, tVar);
        if (iD == 1) {
            tVar.f39608a += this.f41839f;
        }
        return iD;
    }

    public final void e() {
        g(new C2540a.b[0]);
        ((InterfaceC1674k) AbstractC1684a.e(this.f41835b)).q();
        this.f41835b.n(new g.b(-9223372036854775807L));
        this.f41836c = 6;
    }

    public final void g(C2540a.b... bVarArr) {
        ((InterfaceC1674k) AbstractC1684a.e(this.f41835b)).e(1024, 4).d(new C0936z0.b().M("image/jpeg").Z(new C2540a(bVarArr)).G());
    }

    @Override // d3.InterfaceC1672i
    public boolean h(InterfaceC1673j interfaceC1673j) {
        if (i(interfaceC1673j) != 65496) {
            return false;
        }
        int i9 = i(interfaceC1673j);
        this.f41837d = i9;
        if (i9 == 65504) {
            c(interfaceC1673j);
            this.f41837d = i(interfaceC1673j);
        }
        if (this.f41837d != 65505) {
            return false;
        }
        interfaceC1673j.n(2);
        this.f41834a.Q(6);
        interfaceC1673j.s(this.f41834a.e(), 0, 6);
        return this.f41834a.J() == 1165519206 && this.f41834a.N() == 0;
    }

    public final int i(InterfaceC1673j interfaceC1673j) {
        this.f41834a.Q(2);
        interfaceC1673j.s(this.f41834a.e(), 0, 2);
        return this.f41834a.N();
    }

    public final void j(InterfaceC1673j interfaceC1673j) {
        int i9;
        this.f41834a.Q(2);
        interfaceC1673j.m(this.f41834a.e(), 0, 2);
        int iN = this.f41834a.N();
        this.f41837d = iN;
        if (iN == 65498) {
            if (this.f41839f == -1) {
                e();
                return;
            }
            i9 = 4;
        } else if ((iN >= 65488 && iN <= 65497) || iN == 65281) {
            return;
        } else {
            i9 = 1;
        }
        this.f41836c = i9;
    }

    public final void k(InterfaceC1673j interfaceC1673j) {
        String strB;
        if (this.f41837d == 65505) {
            M m9 = new M(this.f41838e);
            interfaceC1673j.m(m9.e(), 0, this.f41838e);
            if (this.f41840g == null && "http://ns.adobe.com/xap/1.0/".equals(m9.B()) && (strB = m9.B()) != null) {
                C2908b c2908bF = f(strB, interfaceC1673j.getLength());
                this.f41840g = c2908bF;
                if (c2908bF != null) {
                    this.f41839f = c2908bF.f51603e;
                }
            }
        } else {
            interfaceC1673j.q(this.f41838e);
        }
        this.f41836c = 0;
    }

    public final void l(InterfaceC1673j interfaceC1673j) {
        this.f41834a.Q(2);
        interfaceC1673j.m(this.f41834a.e(), 0, 2);
        this.f41838e = this.f41834a.N() - 2;
        this.f41836c = 2;
    }

    public final void m(InterfaceC1673j interfaceC1673j) {
        if (interfaceC1673j.d(this.f41834a.e(), 0, 1, true)) {
            interfaceC1673j.f();
            if (this.f41843j == null) {
                this.f41843j = new C2186k();
            }
            c cVar = new c(interfaceC1673j, this.f41839f);
            this.f41842i = cVar;
            if (this.f41843j.h(cVar)) {
                this.f41843j.b(new d(this.f41839f, (InterfaceC1674k) AbstractC1684a.e(this.f41835b)));
                n();
                return;
            }
        }
        e();
    }

    public final void n() {
        g((C2540a.b) AbstractC1684a.e(this.f41840g));
        this.f41836c = 5;
    }

    @Override // d3.InterfaceC1672i
    public void release() {
        C2186k c2186k = this.f41843j;
        if (c2186k != null) {
            c2186k.release();
        }
    }
}

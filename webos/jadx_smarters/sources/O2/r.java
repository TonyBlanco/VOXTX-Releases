package O2;

import d4.AbstractC1684a;
import d4.InterfaceC1683D;
import d4.InterfaceC1688e;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements InterfaceC1683D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4.U f6210a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f6211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1 f6212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1683D f6213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6214f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6215g;

    public interface a {
        void t(C0917s1 c0917s1);
    }

    public r(a aVar, InterfaceC1688e interfaceC1688e) {
        this.f6211c = aVar;
        this.f6210a = new d4.U(interfaceC1688e);
    }

    public void a(C1 c12) {
        if (c12 == this.f6212d) {
            this.f6213e = null;
            this.f6212d = null;
            this.f6214f = true;
        }
    }

    @Override // d4.InterfaceC1683D
    public void b(C0917s1 c0917s1) {
        InterfaceC1683D interfaceC1683D = this.f6213e;
        if (interfaceC1683D != null) {
            interfaceC1683D.b(c0917s1);
            c0917s1 = this.f6213e.c();
        }
        this.f6210a.b(c0917s1);
    }

    @Override // d4.InterfaceC1683D
    public C0917s1 c() {
        InterfaceC1683D interfaceC1683D = this.f6213e;
        return interfaceC1683D != null ? interfaceC1683D.c() : this.f6210a.c();
    }

    public void d(C1 c12) throws C0927w {
        InterfaceC1683D interfaceC1683D;
        InterfaceC1683D interfaceC1683DX = c12.x();
        if (interfaceC1683DX == null || interfaceC1683DX == (interfaceC1683D = this.f6213e)) {
            return;
        }
        if (interfaceC1683D != null) {
            throw C0927w.k(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f6213e = interfaceC1683DX;
        this.f6212d = c12;
        interfaceC1683DX.b(this.f6210a.c());
    }

    public void e(long j9) {
        this.f6210a.a(j9);
    }

    public final boolean f(boolean z9) {
        C1 c12 = this.f6212d;
        return c12 == null || c12.d() || (!this.f6212d.e() && (z9 || this.f6212d.h()));
    }

    public void g() {
        this.f6215g = true;
        this.f6210a.d();
    }

    public void h() {
        this.f6215g = false;
        this.f6210a.e();
    }

    public long i(boolean z9) {
        j(z9);
        return r();
    }

    public final void j(boolean z9) {
        if (f(z9)) {
            this.f6214f = true;
            if (this.f6215g) {
                this.f6210a.d();
                return;
            }
            return;
        }
        InterfaceC1683D interfaceC1683D = (InterfaceC1683D) AbstractC1684a.e(this.f6213e);
        long jR = interfaceC1683D.r();
        if (this.f6214f) {
            if (jR < this.f6210a.r()) {
                this.f6210a.e();
                return;
            } else {
                this.f6214f = false;
                if (this.f6215g) {
                    this.f6210a.d();
                }
            }
        }
        this.f6210a.a(jR);
        C0917s1 c0917s1C = interfaceC1683D.c();
        if (c0917s1C.equals(this.f6210a.c())) {
            return;
        }
        this.f6210a.b(c0917s1C);
        this.f6211c.t(c0917s1C);
    }

    @Override // d4.InterfaceC1683D
    public long r() {
        return this.f6214f ? this.f6210a.r() : ((InterfaceC1683D) AbstractC1684a.e(this.f6213e)).r();
    }
}

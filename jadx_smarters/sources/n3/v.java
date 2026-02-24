package n3;

import O2.C0936z0;
import d3.InterfaceC1674k;
import d4.AbstractC1684a;
import d4.M;
import d4.Z;
import d4.k0;
import n3.I;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements InterfaceC2247B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0936z0 f45236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z f45237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d3.w f45238c;

    public v(String str) {
        this.f45236a = new C0936z0.b().g0(str).G();
    }

    @Override // n3.InterfaceC2247B
    public void a(Z z9, InterfaceC1674k interfaceC1674k, I.d dVar) {
        this.f45237b = z9;
        dVar.a();
        d3.w wVarE = interfaceC1674k.e(dVar.c(), 5);
        this.f45238c = wVarE;
        wVarE.d(this.f45236a);
    }

    @Override // n3.InterfaceC2247B
    public void b(M m9) {
        c();
        long jD = this.f45237b.d();
        long jE = this.f45237b.e();
        if (jD == -9223372036854775807L || jE == -9223372036854775807L) {
            return;
        }
        C0936z0 c0936z0 = this.f45236a;
        if (jE != c0936z0.f6471q) {
            C0936z0 c0936z0G = c0936z0.b().k0(jE).G();
            this.f45236a = c0936z0G;
            this.f45238c.d(c0936z0G);
        }
        int iA = m9.a();
        this.f45238c.b(m9, iA);
        this.f45238c.f(jD, 1, iA, 0, null);
    }

    public final void c() {
        AbstractC1684a.i(this.f45237b);
        k0.j(this.f45238c);
    }
}

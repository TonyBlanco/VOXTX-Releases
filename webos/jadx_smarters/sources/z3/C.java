package Z3;

import B3.C;
import B3.i0;
import O2.C1;
import O2.E1;
import O2.Q1;
import Q2.C1019e;
import b4.InterfaceC1215f;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f11079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1215f f11080b;

    public interface a {
        void a(C1 c12);

        void b();
    }

    public final InterfaceC1215f b() {
        return (InterfaceC1215f) AbstractC1684a.i(this.f11080b);
    }

    public abstract z c();

    public abstract E1.a d();

    public void e(a aVar, InterfaceC1215f interfaceC1215f) {
        this.f11079a = aVar;
        this.f11080b = interfaceC1215f;
    }

    public final void f() {
        a aVar = this.f11079a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void g(C1 c12) {
        a aVar = this.f11079a;
        if (aVar != null) {
            aVar.a(c12);
        }
    }

    public abstract boolean h();

    public abstract void i(Object obj);

    public void j() {
        this.f11079a = null;
        this.f11080b = null;
    }

    public abstract D k(E1[] e1Arr, i0 i0Var, C.b bVar, Q1 q12);

    public abstract void l(C1019e c1019e);

    public abstract void m(z zVar);
}

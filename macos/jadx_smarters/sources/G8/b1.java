package G8;

import o8.InterfaceC2372d;
import o8.InterfaceC2373e;

/* JADX INFO: loaded from: classes4.dex */
public final class b1 extends kotlinx.coroutines.internal.x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ThreadLocal f2322e;

    /* JADX WARN: Illegal instructions before constructor call */
    public b1(o8.g gVar, InterfaceC2372d interfaceC2372d) {
        c1 c1Var = c1.f2324a;
        super(gVar.a(c1Var) == null ? gVar.V(c1Var) : gVar, interfaceC2372d);
        this.f2322e = new ThreadLocal();
        if (interfaceC2372d.getContext().a(InterfaceC2373e.f46141d0) instanceof H) {
            return;
        }
        Object objC = kotlinx.coroutines.internal.C.c(gVar, null);
        kotlinx.coroutines.internal.C.a(gVar, objC);
        Q0(gVar, objC);
    }

    @Override // kotlinx.coroutines.internal.x, G8.AbstractC0559a
    public void K0(Object obj) {
        k8.i iVar = (k8.i) this.f2322e.get();
        if (iVar != null) {
            kotlinx.coroutines.internal.C.a((o8.g) iVar.a(), iVar.b());
            this.f2322e.set(null);
        }
        Object objA = F.a(obj, this.f43785d);
        InterfaceC2372d interfaceC2372d = this.f43785d;
        o8.g context = interfaceC2372d.getContext();
        Object objC = kotlinx.coroutines.internal.C.c(context, null);
        b1 b1VarG = objC != kotlinx.coroutines.internal.C.f43730a ? G.g(interfaceC2372d, context, objC) : null;
        try {
            this.f43785d.resumeWith(objA);
            k8.q qVar = k8.q.f43674a;
        } finally {
            if (b1VarG == null || b1VarG.P0()) {
                kotlinx.coroutines.internal.C.a(context, objC);
            }
        }
    }

    public final boolean P0() {
        if (this.f2322e.get() == null) {
            return false;
        }
        this.f2322e.set(null);
        return true;
    }

    public final void Q0(o8.g gVar, Object obj) {
        this.f2322e.set(k8.m.a(gVar, obj));
    }
}

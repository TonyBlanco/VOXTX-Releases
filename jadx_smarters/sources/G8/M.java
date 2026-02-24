package G8;

import kotlinx.coroutines.internal.C2164e;
import o8.InterfaceC2372d;
import p8.AbstractC2512c;
import q8.AbstractC2649h;

/* JADX INFO: loaded from: classes4.dex */
public abstract class M {
    public static final L a(o8.g gVar) {
        if (gVar.a(InterfaceC0605x0.f2366b0) == null) {
            gVar = gVar.V(C0.b(null, 1, null));
        }
        return new C2164e(gVar);
    }

    public static final L b() {
        return new C2164e(S0.b(null, 1, null).V(C0562b0.c()));
    }

    public static final Object c(w8.p pVar, InterfaceC2372d interfaceC2372d) {
        kotlinx.coroutines.internal.x xVar = new kotlinx.coroutines.internal.x(interfaceC2372d.getContext(), interfaceC2372d);
        Object objC = K8.b.c(xVar, xVar, pVar);
        if (objC == AbstractC2512c.d()) {
            AbstractC2649h.c(interfaceC2372d);
        }
        return objC;
    }

    public static final void d(L l9) {
        B0.i(l9.t());
    }

    public static final boolean e(L l9) {
        InterfaceC0605x0 interfaceC0605x0 = (InterfaceC0605x0) l9.t().a(InterfaceC0605x0.f2366b0);
        if (interfaceC0605x0 != null) {
            return interfaceC0605x0.isActive();
        }
        return true;
    }
}

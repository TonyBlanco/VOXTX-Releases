package G8;

import o8.InterfaceC2372d;
import p8.AbstractC2512c;
import q8.AbstractC2649h;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Z0 {
    public static final X0 a(long j9, InterfaceC0605x0 interfaceC0605x0) {
        return new X0("Timed out waiting for " + j9 + " ms", interfaceC0605x0);
    }

    public static final Object b(Y0 y02, w8.p pVar) {
        B0.g(y02, W.a(y02.f43785d.getContext()).t(y02.f2314e, y02, y02.getContext()));
        return K8.b.d(y02, y02, pVar);
    }

    public static final Object c(long j9, w8.p pVar, InterfaceC2372d interfaceC2372d) {
        if (j9 <= 0) {
            throw new X0("Timed out immediately");
        }
        Object objB = b(new Y0(j9, interfaceC2372d), pVar);
        if (objB == AbstractC2512c.d()) {
            AbstractC2649h.c(interfaceC2372d);
        }
        return objB;
    }
}

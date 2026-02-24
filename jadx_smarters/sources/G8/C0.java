package G8;

import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class C0 {
    public static final InterfaceC0608z a(InterfaceC0605x0 interfaceC0605x0) {
        return new A0(interfaceC0605x0);
    }

    public static /* synthetic */ InterfaceC0608z b(InterfaceC0605x0 interfaceC0605x0, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            interfaceC0605x0 = null;
        }
        return B0.a(interfaceC0605x0);
    }

    public static final void c(o8.g gVar, CancellationException cancellationException) {
        InterfaceC0605x0 interfaceC0605x0 = (InterfaceC0605x0) gVar.a(InterfaceC0605x0.f2366b0);
        if (interfaceC0605x0 != null) {
            interfaceC0605x0.s(cancellationException);
        }
    }

    public static /* synthetic */ void d(o8.g gVar, CancellationException cancellationException, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            cancellationException = null;
        }
        B0.c(gVar, cancellationException);
    }

    public static final void e(o8.g gVar, CancellationException cancellationException) {
        D8.d dVarD;
        InterfaceC0605x0 interfaceC0605x0 = (InterfaceC0605x0) gVar.a(InterfaceC0605x0.f2366b0);
        if (interfaceC0605x0 == null || (dVarD = interfaceC0605x0.d()) == null) {
            return;
        }
        Iterator it = dVarD.iterator();
        while (it.hasNext()) {
            ((InterfaceC0605x0) it.next()).s(cancellationException);
        }
    }

    public static /* synthetic */ void f(o8.g gVar, CancellationException cancellationException, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            cancellationException = null;
        }
        B0.e(gVar, cancellationException);
    }

    public static final InterfaceC0566d0 g(InterfaceC0605x0 interfaceC0605x0, InterfaceC0566d0 interfaceC0566d0) {
        return interfaceC0605x0.i(new C0570f0(interfaceC0566d0));
    }

    public static final void h(InterfaceC0605x0 interfaceC0605x0) {
        if (!interfaceC0605x0.isActive()) {
            throw interfaceC0605x0.h();
        }
    }

    public static final void i(o8.g gVar) {
        InterfaceC0605x0 interfaceC0605x0 = (InterfaceC0605x0) gVar.a(InterfaceC0605x0.f2366b0);
        if (interfaceC0605x0 != null) {
            B0.h(interfaceC0605x0);
        }
    }

    public static final InterfaceC0605x0 j(o8.g gVar) {
        InterfaceC0605x0 interfaceC0605x0 = (InterfaceC0605x0) gVar.a(InterfaceC0605x0.f2366b0);
        if (interfaceC0605x0 != null) {
            return interfaceC0605x0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + gVar).toString());
    }
}

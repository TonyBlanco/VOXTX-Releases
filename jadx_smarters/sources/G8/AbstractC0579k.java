package G8;

import o8.InterfaceC2372d;
import o8.InterfaceC2373e;
import p8.AbstractC2512c;
import q8.AbstractC2649h;

/* JADX INFO: renamed from: G8.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC0579k {
    public static final T a(L l9, o8.g gVar, N n9, w8.p pVar) throws Throwable {
        o8.g gVarD = G.d(l9, gVar);
        U g02 = n9.isLazy() ? new G0(gVarD, pVar) : new U(gVarD, true);
        g02.N0(n9, g02, pVar);
        return g02;
    }

    public static /* synthetic */ T b(L l9, o8.g gVar, N n9, w8.p pVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            gVar = o8.h.f46144a;
        }
        if ((i9 & 2) != 0) {
            n9 = N.DEFAULT;
        }
        return AbstractC0575i.a(l9, gVar, n9, pVar);
    }

    public static final InterfaceC0605x0 c(L l9, o8.g gVar, N n9, w8.p pVar) throws Throwable {
        o8.g gVarD = G.d(l9, gVar);
        Q0 h02 = n9.isLazy() ? new H0(gVarD, pVar) : new Q0(gVarD, true);
        h02.N0(n9, h02, pVar);
        return h02;
    }

    public static /* synthetic */ InterfaceC0605x0 d(L l9, o8.g gVar, N n9, w8.p pVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            gVar = o8.h.f46144a;
        }
        if ((i9 & 2) != 0) {
            n9 = N.DEFAULT;
        }
        return AbstractC0575i.c(l9, gVar, n9, pVar);
    }

    public static final Object e(o8.g gVar, w8.p pVar, InterfaceC2372d interfaceC2372d) throws Throwable {
        Object objP0;
        o8.g context = interfaceC2372d.getContext();
        o8.g gVarE = G.e(context, gVar);
        B0.i(gVarE);
        if (gVarE == context) {
            kotlinx.coroutines.internal.x xVar = new kotlinx.coroutines.internal.x(gVarE, interfaceC2372d);
            objP0 = K8.b.c(xVar, xVar, pVar);
        } else {
            InterfaceC2373e.b bVar = InterfaceC2373e.f46141d0;
            if (kotlin.jvm.internal.l.a(gVarE.a(bVar), context.a(bVar))) {
                b1 b1Var = new b1(gVarE, interfaceC2372d);
                Object objC = kotlinx.coroutines.internal.C.c(gVarE, null);
                try {
                    Object objC2 = K8.b.c(b1Var, b1Var, pVar);
                    kotlinx.coroutines.internal.C.a(gVarE, objC);
                    objP0 = objC2;
                } catch (Throwable th) {
                    kotlinx.coroutines.internal.C.a(gVarE, objC);
                    throw th;
                }
            } else {
                Y y9 = new Y(gVarE, interfaceC2372d);
                K8.a.e(pVar, y9, y9, null, 4, null);
                objP0 = y9.P0();
            }
        }
        if (objP0 == AbstractC2512c.d()) {
            AbstractC2649h.c(interfaceC2372d);
        }
        return objP0;
    }
}

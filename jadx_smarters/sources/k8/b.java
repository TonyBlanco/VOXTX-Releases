package K8;

import G8.B;
import G8.F0;
import G8.X0;
import k8.j;
import k8.k;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.internal.C;
import kotlinx.coroutines.internal.x;
import o8.InterfaceC2372d;
import o8.g;
import p8.AbstractC2512c;
import q8.AbstractC2649h;
import w8.l;
import w8.p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final void a(l lVar, InterfaceC2372d interfaceC2372d) {
        Object objA;
        InterfaceC2372d interfaceC2372dA = AbstractC2649h.a(interfaceC2372d);
        try {
            g context = interfaceC2372d.getContext();
            Object objC = C.c(context, null);
            try {
                objA = ((l) F.b(lVar, 1)).invoke(interfaceC2372dA);
                if (objA == AbstractC2512c.d()) {
                    return;
                }
            } finally {
                C.a(context, objC);
            }
        } catch (Throwable th) {
            j.a aVar = j.f43666c;
            objA = k.a(th);
        }
        interfaceC2372dA.resumeWith(j.b(objA));
    }

    public static final void b(p pVar, Object obj, InterfaceC2372d interfaceC2372d) {
        Object objA;
        InterfaceC2372d interfaceC2372dA = AbstractC2649h.a(interfaceC2372d);
        try {
            g context = interfaceC2372d.getContext();
            Object objC = C.c(context, null);
            try {
                objA = ((p) F.b(pVar, 2)).invoke(obj, interfaceC2372dA);
                if (objA == AbstractC2512c.d()) {
                    return;
                }
            } finally {
                C.a(context, objC);
            }
        } catch (Throwable th) {
            j.a aVar = j.f43666c;
            objA = k.a(th);
        }
        interfaceC2372dA.resumeWith(j.b(objA));
    }

    public static final Object c(x xVar, Object obj, p pVar) {
        Object b9;
        Object objN0;
        try {
            b9 = ((p) F.b(pVar, 2)).invoke(obj, xVar);
        } catch (Throwable th) {
            b9 = new B(th, false, 2, null);
        }
        if (b9 == AbstractC2512c.d() || (objN0 = xVar.n0(b9)) == F0.f2280b) {
            return AbstractC2512c.d();
        }
        if (objN0 instanceof B) {
            throw ((B) objN0).f2261a;
        }
        return F0.h(objN0);
    }

    public static final Object d(x xVar, Object obj, p pVar) throws Throwable {
        Object b9;
        Object objN0;
        try {
            b9 = ((p) F.b(pVar, 2)).invoke(obj, xVar);
        } catch (Throwable th) {
            b9 = new B(th, false, 2, null);
        }
        if (b9 == AbstractC2512c.d() || (objN0 = xVar.n0(b9)) == F0.f2280b) {
            return AbstractC2512c.d();
        }
        if (objN0 instanceof B) {
            Throwable th2 = ((B) objN0).f2261a;
            if (!(th2 instanceof X0) || ((X0) th2).f2312a != xVar) {
                throw th2;
            }
            if (b9 instanceof B) {
                throw ((B) b9).f2261a;
            }
        } else {
            b9 = F0.h(objN0);
        }
        return b9;
    }
}

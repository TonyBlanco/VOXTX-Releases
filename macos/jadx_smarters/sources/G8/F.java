package G8;

import k8.j;
import o8.InterfaceC2372d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class F {
    public static final Object a(Object obj, InterfaceC2372d interfaceC2372d) {
        if (obj instanceof B) {
            j.a aVar = k8.j.f43666c;
            obj = k8.k.a(((B) obj).f2261a);
        }
        return k8.j.b(obj);
    }

    public static final Object b(Object obj, InterfaceC0585n interfaceC0585n) {
        Throwable thD = k8.j.d(obj);
        if (thD == null) {
            return obj;
        }
        return new B(thD, false, 2, null);
    }

    public static final Object c(Object obj, w8.l lVar) {
        Throwable thD = k8.j.d(obj);
        if (thD == null) {
            return lVar != null ? new C(obj, lVar) : obj;
        }
        return new B(thD, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, w8.l lVar, int i9, Object obj2) {
        if ((i9 & 1) != 0) {
            lVar = null;
        }
        return c(obj, lVar);
    }
}

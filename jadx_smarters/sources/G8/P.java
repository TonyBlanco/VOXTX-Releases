package G8;

import k8.j;
import kotlinx.coroutines.internal.C2165f;
import o8.InterfaceC2372d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class P {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(InterfaceC2372d interfaceC2372d) {
        Object objB;
        if (interfaceC2372d instanceof C2165f) {
            return interfaceC2372d.toString();
        }
        try {
            j.a aVar = k8.j.f43666c;
            objB = k8.j.b(interfaceC2372d + '@' + b(interfaceC2372d));
        } catch (Throwable th) {
            j.a aVar2 = k8.j.f43666c;
            objB = k8.j.b(k8.k.a(th));
        }
        if (k8.j.d(objB) != null) {
            objB = interfaceC2372d.getClass().getName() + '@' + b(interfaceC2372d);
        }
        return (String) objB;
    }
}

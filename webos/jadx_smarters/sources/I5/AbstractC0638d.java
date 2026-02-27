package I5;

import j6.InterfaceC2101a;
import j6.InterfaceC2102b;
import java.util.Set;

/* JADX INFO: renamed from: I5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0638d {
    public static Object a(InterfaceC0639e interfaceC0639e, F f9) {
        InterfaceC2102b interfaceC2102bE = interfaceC0639e.e(f9);
        if (interfaceC2102bE == null) {
            return null;
        }
        return interfaceC2102bE.get();
    }

    public static Object b(InterfaceC0639e interfaceC0639e, Class cls) {
        return interfaceC0639e.b(F.b(cls));
    }

    public static InterfaceC2101a c(InterfaceC0639e interfaceC0639e, Class cls) {
        return interfaceC0639e.h(F.b(cls));
    }

    public static InterfaceC2102b d(InterfaceC0639e interfaceC0639e, Class cls) {
        return interfaceC0639e.e(F.b(cls));
    }

    public static Set e(InterfaceC0639e interfaceC0639e, F f9) {
        return (Set) interfaceC0639e.f(f9).get();
    }

    public static Set f(InterfaceC0639e interfaceC0639e, Class cls) {
        return interfaceC0639e.d(F.b(cls));
    }
}

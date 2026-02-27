package G8;

import kotlinx.coroutines.internal.C2165f;
import o8.InterfaceC2372d;

/* JADX INFO: renamed from: G8.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0591q {
    public static final void a(InterfaceC0585n interfaceC0585n, InterfaceC0566d0 interfaceC0566d0) {
        interfaceC0585n.x(new C0568e0(interfaceC0566d0));
    }

    public static final C0587o b(InterfaceC2372d interfaceC2372d) {
        if (!(interfaceC2372d instanceof C2165f)) {
            return new C0587o(interfaceC2372d, 1);
        }
        C0587o c0587oJ = ((C2165f) interfaceC2372d).j();
        if (c0587oJ != null) {
            if (!c0587oJ.G()) {
                c0587oJ = null;
            }
            if (c0587oJ != null) {
                return c0587oJ;
            }
        }
        return new C0587o(interfaceC2372d, 2);
    }

    public static final void c(InterfaceC0585n interfaceC0585n, kotlinx.coroutines.internal.m mVar) {
        interfaceC0585n.x(new N0(mVar));
    }
}

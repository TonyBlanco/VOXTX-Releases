package G8;

import o8.InterfaceC2372d;

/* JADX INFO: renamed from: G8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC0585n extends InterfaceC2372d {

    /* JADX INFO: renamed from: G8.n$a */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC0585n interfaceC0585n, Throwable th, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i9 & 1) != 0) {
                th = null;
            }
            return interfaceC0585n.b(th);
        }
    }

    boolean b(Throwable th);

    Object f(Object obj, Object obj2, w8.l lVar);

    void u(Object obj, w8.l lVar);

    void x(w8.l lVar);

    void y(Object obj);
}

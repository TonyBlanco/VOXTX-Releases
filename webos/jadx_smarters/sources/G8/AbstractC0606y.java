package G8;

/* JADX INFO: renamed from: G8.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0606y {
    public static final InterfaceC0602w a(InterfaceC0605x0 interfaceC0605x0) {
        return new C0604x(interfaceC0605x0);
    }

    public static /* synthetic */ InterfaceC0602w b(InterfaceC0605x0 interfaceC0605x0, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            interfaceC0605x0 = null;
        }
        return a(interfaceC0605x0);
    }

    public static final boolean c(InterfaceC0602w interfaceC0602w, Object obj) {
        Throwable thD = k8.j.d(obj);
        return thD == null ? interfaceC0602w.p(obj) : interfaceC0602w.n(thD);
    }
}

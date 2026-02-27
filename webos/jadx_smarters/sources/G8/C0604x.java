package G8;

import o8.InterfaceC2372d;
import p8.AbstractC2512c;

/* JADX INFO: renamed from: G8.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0604x extends E0 implements InterfaceC0602w {
    public C0604x(InterfaceC0605x0 interfaceC0605x0) {
        super(true);
        g0(interfaceC0605x0);
    }

    @Override // G8.E0
    public boolean Z() {
        return true;
    }

    @Override // G8.T
    public Object c() {
        return S();
    }

    @Override // G8.InterfaceC0602w
    public boolean n(Throwable th) {
        return m0(new B(th, false, 2, null));
    }

    @Override // G8.InterfaceC0602w
    public boolean p(Object obj) {
        return m0(obj);
    }

    @Override // G8.T
    public Object q(InterfaceC2372d interfaceC2372d) throws Throwable {
        Object objE = E(interfaceC2372d);
        AbstractC2512c.d();
        return objE;
    }
}

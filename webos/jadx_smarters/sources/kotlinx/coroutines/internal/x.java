package kotlinx.coroutines.internal;

import G8.AbstractC0559a;
import G8.InterfaceC0596t;
import G8.InterfaceC0605x0;
import o8.InterfaceC2372d;
import p8.AbstractC2511b;
import q8.InterfaceC2646e;

/* JADX INFO: loaded from: classes4.dex */
public class x extends AbstractC0559a implements InterfaceC2646e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2372d f43785d;

    public x(o8.g gVar, InterfaceC2372d interfaceC2372d) {
        super(gVar, true, true);
        this.f43785d = interfaceC2372d;
    }

    @Override // G8.E0
    public void D(Object obj) {
        AbstractC2166g.c(AbstractC2511b.c(this.f43785d), G8.F.a(obj, this.f43785d), null, 2, null);
    }

    @Override // G8.AbstractC0559a
    public void K0(Object obj) {
        InterfaceC2372d interfaceC2372d = this.f43785d;
        interfaceC2372d.resumeWith(G8.F.a(obj, interfaceC2372d));
    }

    public final InterfaceC0605x0 O0() {
        InterfaceC0596t interfaceC0596tC0 = c0();
        if (interfaceC0596tC0 != null) {
            return interfaceC0596tC0.getParent();
        }
        return null;
    }

    @Override // q8.InterfaceC2646e
    public final InterfaceC2646e getCallerFrame() {
        InterfaceC2372d interfaceC2372d = this.f43785d;
        if (interfaceC2372d instanceof InterfaceC2646e) {
            return (InterfaceC2646e) interfaceC2372d;
        }
        return null;
    }

    @Override // G8.E0
    public final boolean i0() {
        return true;
    }
}

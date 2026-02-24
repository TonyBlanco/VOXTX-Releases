package J2;

import K2.InterfaceC0689d;
import j8.InterfaceC2104a;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements E2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2104a f3092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2104a f3093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2104a f3094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2104a f3095d;

    public w(InterfaceC2104a interfaceC2104a, InterfaceC2104a interfaceC2104a2, InterfaceC2104a interfaceC2104a3, InterfaceC2104a interfaceC2104a4) {
        this.f3092a = interfaceC2104a;
        this.f3093b = interfaceC2104a2;
        this.f3094c = interfaceC2104a3;
        this.f3095d = interfaceC2104a4;
    }

    public static w a(InterfaceC2104a interfaceC2104a, InterfaceC2104a interfaceC2104a2, InterfaceC2104a interfaceC2104a3, InterfaceC2104a interfaceC2104a4) {
        return new w(interfaceC2104a, interfaceC2104a2, interfaceC2104a3, interfaceC2104a4);
    }

    public static v c(Executor executor, InterfaceC0689d interfaceC0689d, x xVar, L2.b bVar) {
        return new v(executor, interfaceC0689d, xVar, bVar);
    }

    @Override // j8.InterfaceC2104a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f3092a.get(), (InterfaceC0689d) this.f3093b.get(), (x) this.f3094c.get(), (L2.b) this.f3095d.get());
    }
}

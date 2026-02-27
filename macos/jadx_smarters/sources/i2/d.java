package I2;

import J2.x;
import K2.InterfaceC0689d;
import j8.InterfaceC2104a;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements E2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2104a f2821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2104a f2822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2104a f2823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2104a f2824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2104a f2825e;

    public d(InterfaceC2104a interfaceC2104a, InterfaceC2104a interfaceC2104a2, InterfaceC2104a interfaceC2104a3, InterfaceC2104a interfaceC2104a4, InterfaceC2104a interfaceC2104a5) {
        this.f2821a = interfaceC2104a;
        this.f2822b = interfaceC2104a2;
        this.f2823c = interfaceC2104a3;
        this.f2824d = interfaceC2104a4;
        this.f2825e = interfaceC2104a5;
    }

    public static d a(InterfaceC2104a interfaceC2104a, InterfaceC2104a interfaceC2104a2, InterfaceC2104a interfaceC2104a3, InterfaceC2104a interfaceC2104a4, InterfaceC2104a interfaceC2104a5) {
        return new d(interfaceC2104a, interfaceC2104a2, interfaceC2104a3, interfaceC2104a4, interfaceC2104a5);
    }

    public static c c(Executor executor, D2.e eVar, x xVar, InterfaceC0689d interfaceC0689d, L2.b bVar) {
        return new c(executor, eVar, xVar, interfaceC0689d, bVar);
    }

    @Override // j8.InterfaceC2104a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((Executor) this.f2821a.get(), (D2.e) this.f2822b.get(), (x) this.f2823c.get(), (InterfaceC0689d) this.f2824d.get(), (L2.b) this.f2825e.get());
    }
}

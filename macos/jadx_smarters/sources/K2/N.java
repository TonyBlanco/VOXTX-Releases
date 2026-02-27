package K2;

import j8.InterfaceC2104a;

/* JADX INFO: loaded from: classes3.dex */
public final class N implements E2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2104a f3618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2104a f3619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2104a f3620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2104a f3621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2104a f3622e;

    public N(InterfaceC2104a interfaceC2104a, InterfaceC2104a interfaceC2104a2, InterfaceC2104a interfaceC2104a3, InterfaceC2104a interfaceC2104a4, InterfaceC2104a interfaceC2104a5) {
        this.f3618a = interfaceC2104a;
        this.f3619b = interfaceC2104a2;
        this.f3620c = interfaceC2104a3;
        this.f3621d = interfaceC2104a4;
        this.f3622e = interfaceC2104a5;
    }

    public static N a(InterfaceC2104a interfaceC2104a, InterfaceC2104a interfaceC2104a2, InterfaceC2104a interfaceC2104a3, InterfaceC2104a interfaceC2104a4, InterfaceC2104a interfaceC2104a5) {
        return new N(interfaceC2104a, interfaceC2104a2, interfaceC2104a3, interfaceC2104a4, interfaceC2104a5);
    }

    public static M c(M2.a aVar, M2.a aVar2, Object obj, Object obj2, InterfaceC2104a interfaceC2104a) {
        return new M(aVar, aVar2, (AbstractC0690e) obj, (U) obj2, interfaceC2104a);
    }

    @Override // j8.InterfaceC2104a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c((M2.a) this.f3618a.get(), (M2.a) this.f3619b.get(), this.f3620c.get(), this.f3621d.get(), this.f3622e);
    }
}

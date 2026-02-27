package C2;

import j8.InterfaceC2104a;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements E2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2104a f1031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2104a f1032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2104a f1033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2104a f1034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2104a f1035e;

    public w(InterfaceC2104a interfaceC2104a, InterfaceC2104a interfaceC2104a2, InterfaceC2104a interfaceC2104a3, InterfaceC2104a interfaceC2104a4, InterfaceC2104a interfaceC2104a5) {
        this.f1031a = interfaceC2104a;
        this.f1032b = interfaceC2104a2;
        this.f1033c = interfaceC2104a3;
        this.f1034d = interfaceC2104a4;
        this.f1035e = interfaceC2104a5;
    }

    public static w a(InterfaceC2104a interfaceC2104a, InterfaceC2104a interfaceC2104a2, InterfaceC2104a interfaceC2104a3, InterfaceC2104a interfaceC2104a4, InterfaceC2104a interfaceC2104a5) {
        return new w(interfaceC2104a, interfaceC2104a2, interfaceC2104a3, interfaceC2104a4, interfaceC2104a5);
    }

    public static u c(M2.a aVar, M2.a aVar2, I2.e eVar, J2.r rVar, J2.v vVar) {
        return new u(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // j8.InterfaceC2104a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c((M2.a) this.f1031a.get(), (M2.a) this.f1032b.get(), (I2.e) this.f1033c.get(), (J2.r) this.f1034d.get(), (J2.v) this.f1035e.get());
    }
}

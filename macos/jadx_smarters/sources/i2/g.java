package I2;

import j8.InterfaceC2104a;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements E2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2104a f2826a;

    public g(InterfaceC2104a interfaceC2104a) {
        this.f2826a = interfaceC2104a;
    }

    public static J2.f a(M2.a aVar) {
        return (J2.f) E2.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(InterfaceC2104a interfaceC2104a) {
        return new g(interfaceC2104a);
    }

    @Override // j8.InterfaceC2104a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public J2.f get() {
        return a((M2.a) this.f2826a.get());
    }
}

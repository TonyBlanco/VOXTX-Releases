package d2;

import l2.InterfaceC2175b;

/* JADX INFO: loaded from: classes.dex */
public class n implements InterfaceC2175b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1663m f39553a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S1.e f39554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S1.f f39555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Z1.h f39556e;

    public n(InterfaceC2175b interfaceC2175b, InterfaceC2175b interfaceC2175b2) {
        this.f39555d = interfaceC2175b.e();
        this.f39556e = new Z1.h(interfaceC2175b.b(), interfaceC2175b2.b());
        this.f39554c = interfaceC2175b.g();
        this.f39553a = new C1663m(interfaceC2175b.f(), interfaceC2175b2.f());
    }

    @Override // l2.InterfaceC2175b
    public S1.b b() {
        return this.f39556e;
    }

    @Override // l2.InterfaceC2175b
    public S1.f e() {
        return this.f39555d;
    }

    @Override // l2.InterfaceC2175b
    public S1.e f() {
        return this.f39553a;
    }

    @Override // l2.InterfaceC2175b
    public S1.e g() {
        return this.f39554c;
    }
}

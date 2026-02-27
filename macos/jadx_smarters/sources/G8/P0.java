package G8;

import k8.j;
import o8.InterfaceC2372d;

/* JADX INFO: loaded from: classes4.dex */
public final class P0 extends D0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC2372d f2301f;

    public P0(InterfaceC2372d interfaceC2372d) {
        this.f2301f = interfaceC2372d;
    }

    @Override // w8.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        z((Throwable) obj);
        return k8.q.f43674a;
    }

    @Override // G8.D
    public void z(Throwable th) {
        InterfaceC2372d interfaceC2372d = this.f2301f;
        j.a aVar = k8.j.f43666c;
        interfaceC2372d.resumeWith(k8.j.b(k8.q.f43674a));
    }
}

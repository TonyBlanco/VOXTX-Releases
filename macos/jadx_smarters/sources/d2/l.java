package D2;

import android.content.Context;
import j8.InterfaceC2104a;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements E2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2104a f1347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2104a f1348b;

    public l(InterfaceC2104a interfaceC2104a, InterfaceC2104a interfaceC2104a2) {
        this.f1347a = interfaceC2104a;
        this.f1348b = interfaceC2104a2;
    }

    public static l a(InterfaceC2104a interfaceC2104a, InterfaceC2104a interfaceC2104a2) {
        return new l(interfaceC2104a, interfaceC2104a2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // j8.InterfaceC2104a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.f1347a.get(), this.f1348b.get());
    }
}

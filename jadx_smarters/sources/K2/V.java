package K2;

import android.content.Context;
import j8.InterfaceC2104a;

/* JADX INFO: loaded from: classes3.dex */
public final class V implements E2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2104a f3633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2104a f3634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2104a f3635c;

    public V(InterfaceC2104a interfaceC2104a, InterfaceC2104a interfaceC2104a2, InterfaceC2104a interfaceC2104a3) {
        this.f3633a = interfaceC2104a;
        this.f3634b = interfaceC2104a2;
        this.f3635c = interfaceC2104a3;
    }

    public static V a(InterfaceC2104a interfaceC2104a, InterfaceC2104a interfaceC2104a2, InterfaceC2104a interfaceC2104a3) {
        return new V(interfaceC2104a, interfaceC2104a2, interfaceC2104a3);
    }

    public static U c(Context context, String str, int i9) {
        return new U(context, str, i9);
    }

    @Override // j8.InterfaceC2104a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public U get() {
        return c((Context) this.f3633a.get(), (String) this.f3634b.get(), ((Integer) this.f3635c.get()).intValue());
    }
}

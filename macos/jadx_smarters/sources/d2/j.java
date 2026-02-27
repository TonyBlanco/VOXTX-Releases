package D2;

import android.content.Context;
import j8.InterfaceC2104a;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements E2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2104a f1339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2104a f1340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2104a f1341c;

    public j(InterfaceC2104a interfaceC2104a, InterfaceC2104a interfaceC2104a2, InterfaceC2104a interfaceC2104a3) {
        this.f1339a = interfaceC2104a;
        this.f1340b = interfaceC2104a2;
        this.f1341c = interfaceC2104a3;
    }

    public static j a(InterfaceC2104a interfaceC2104a, InterfaceC2104a interfaceC2104a2, InterfaceC2104a interfaceC2104a3) {
        return new j(interfaceC2104a, interfaceC2104a2, interfaceC2104a3);
    }

    public static i c(Context context, M2.a aVar, M2.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // j8.InterfaceC2104a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f1339a.get(), (M2.a) this.f1340b.get(), (M2.a) this.f1341c.get());
    }
}

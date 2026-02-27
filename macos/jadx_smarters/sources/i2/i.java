package I2;

import J2.x;
import K2.InterfaceC0689d;
import android.content.Context;
import j8.InterfaceC2104a;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements E2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2104a f2827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2104a f2828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2104a f2829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2104a f2830d;

    public i(InterfaceC2104a interfaceC2104a, InterfaceC2104a interfaceC2104a2, InterfaceC2104a interfaceC2104a3, InterfaceC2104a interfaceC2104a4) {
        this.f2827a = interfaceC2104a;
        this.f2828b = interfaceC2104a2;
        this.f2829c = interfaceC2104a3;
        this.f2830d = interfaceC2104a4;
    }

    public static i a(InterfaceC2104a interfaceC2104a, InterfaceC2104a interfaceC2104a2, InterfaceC2104a interfaceC2104a3, InterfaceC2104a interfaceC2104a4) {
        return new i(interfaceC2104a, interfaceC2104a2, interfaceC2104a3, interfaceC2104a4);
    }

    public static x c(Context context, InterfaceC0689d interfaceC0689d, J2.f fVar, M2.a aVar) {
        return (x) E2.d.c(h.a(context, interfaceC0689d, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // j8.InterfaceC2104a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f2827a.get(), (InterfaceC0689d) this.f2828b.get(), (J2.f) this.f2829c.get(), (M2.a) this.f2830d.get());
    }
}

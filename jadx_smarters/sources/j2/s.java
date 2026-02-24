package J2;

import K2.InterfaceC0688c;
import K2.InterfaceC0689d;
import android.content.Context;
import j8.InterfaceC2104a;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements E2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2104a f3077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2104a f3078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2104a f3079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2104a f3080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2104a f3081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC2104a f3082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC2104a f3083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC2104a f3084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC2104a f3085i;

    public s(InterfaceC2104a interfaceC2104a, InterfaceC2104a interfaceC2104a2, InterfaceC2104a interfaceC2104a3, InterfaceC2104a interfaceC2104a4, InterfaceC2104a interfaceC2104a5, InterfaceC2104a interfaceC2104a6, InterfaceC2104a interfaceC2104a7, InterfaceC2104a interfaceC2104a8, InterfaceC2104a interfaceC2104a9) {
        this.f3077a = interfaceC2104a;
        this.f3078b = interfaceC2104a2;
        this.f3079c = interfaceC2104a3;
        this.f3080d = interfaceC2104a4;
        this.f3081e = interfaceC2104a5;
        this.f3082f = interfaceC2104a6;
        this.f3083g = interfaceC2104a7;
        this.f3084h = interfaceC2104a8;
        this.f3085i = interfaceC2104a9;
    }

    public static s a(InterfaceC2104a interfaceC2104a, InterfaceC2104a interfaceC2104a2, InterfaceC2104a interfaceC2104a3, InterfaceC2104a interfaceC2104a4, InterfaceC2104a interfaceC2104a5, InterfaceC2104a interfaceC2104a6, InterfaceC2104a interfaceC2104a7, InterfaceC2104a interfaceC2104a8, InterfaceC2104a interfaceC2104a9) {
        return new s(interfaceC2104a, interfaceC2104a2, interfaceC2104a3, interfaceC2104a4, interfaceC2104a5, interfaceC2104a6, interfaceC2104a7, interfaceC2104a8, interfaceC2104a9);
    }

    public static r c(Context context, D2.e eVar, InterfaceC0689d interfaceC0689d, x xVar, Executor executor, L2.b bVar, M2.a aVar, M2.a aVar2, InterfaceC0688c interfaceC0688c) {
        return new r(context, eVar, interfaceC0689d, xVar, executor, bVar, aVar, aVar2, interfaceC0688c);
    }

    @Override // j8.InterfaceC2104a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f3077a.get(), (D2.e) this.f3078b.get(), (InterfaceC0689d) this.f3079c.get(), (x) this.f3080d.get(), (Executor) this.f3081e.get(), (L2.b) this.f3082f.get(), (M2.a) this.f3083g.get(), (M2.a) this.f3084h.get(), (InterfaceC0688c) this.f3085i.get());
    }
}

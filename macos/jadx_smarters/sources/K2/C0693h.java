package K2;

import android.content.Context;
import j8.InterfaceC2104a;

/* JADX INFO: renamed from: K2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0693h implements E2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2104a f3651a;

    public C0693h(InterfaceC2104a interfaceC2104a) {
        this.f3651a = interfaceC2104a;
    }

    public static C0693h a(InterfaceC2104a interfaceC2104a) {
        return new C0693h(interfaceC2104a);
    }

    public static String c(Context context) {
        return (String) E2.d.c(AbstractC0691f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // j8.InterfaceC2104a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f3651a.get());
    }
}

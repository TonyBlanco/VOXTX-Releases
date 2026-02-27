package E2;

import j8.InterfaceC2104a;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements InterfaceC2104a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f1674c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile InterfaceC2104a f1675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f1676b = f1674c;

    public a(InterfaceC2104a interfaceC2104a) {
        this.f1675a = interfaceC2104a;
    }

    public static InterfaceC2104a a(InterfaceC2104a interfaceC2104a) {
        d.b(interfaceC2104a);
        return interfaceC2104a instanceof a ? interfaceC2104a : new a(interfaceC2104a);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f1674c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // j8.InterfaceC2104a
    public Object get() {
        Object obj = this.f1676b;
        Object obj2 = f1674c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f1676b;
                    if (obj == obj2) {
                        obj = this.f1675a.get();
                        this.f1676b = b(this.f1676b, obj);
                        this.f1675a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}

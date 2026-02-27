package E2;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f1677b = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1678a;

    public c(Object obj) {
        this.f1678a = obj;
    }

    public static b a(Object obj) {
        return new c(d.c(obj, "instance cannot be null"));
    }

    @Override // j8.InterfaceC2104a
    public Object get() {
        return this.f1678a;
    }
}

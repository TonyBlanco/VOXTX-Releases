package M2;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements E2.b {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f4178a = new d();
    }

    public static d a() {
        return a.f4178a;
    }

    public static M2.a c() {
        return (M2.a) E2.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // j8.InterfaceC2104a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public M2.a get() {
        return c();
    }
}

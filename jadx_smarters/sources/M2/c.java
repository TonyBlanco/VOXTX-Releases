package M2;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements E2.b {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f4177a = new c();
    }

    public static c a() {
        return a.f4177a;
    }

    public static M2.a b() {
        return (M2.a) E2.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // j8.InterfaceC2104a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public M2.a get() {
        return b();
    }
}

package K2;

/* JADX INFO: renamed from: K2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0692g implements E2.b {

    /* JADX INFO: renamed from: K2.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0692g f3650a = new C0692g();
    }

    public static C0692g a() {
        return a.f3650a;
    }

    public static String b() {
        return (String) E2.d.c(AbstractC0691f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // j8.InterfaceC2104a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}

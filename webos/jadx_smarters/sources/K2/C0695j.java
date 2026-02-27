package K2;

/* JADX INFO: renamed from: K2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0695j implements E2.b {

    /* JADX INFO: renamed from: K2.j$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0695j f3653a = new C0695j();
    }

    public static C0695j a() {
        return a.f3653a;
    }

    public static AbstractC0690e c() {
        return (AbstractC0690e) E2.d.c(AbstractC0691f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // j8.InterfaceC2104a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC0690e get() {
        return c();
    }
}

package C2;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements E2.b {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f1014a = new k();
    }

    public static k a() {
        return a.f1014a;
    }

    public static Executor b() {
        return (Executor) E2.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // j8.InterfaceC2104a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}

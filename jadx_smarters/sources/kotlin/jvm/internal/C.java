package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f43677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C8.c[] f43678b;

    static {
        D d9 = null;
        try {
            d9 = (D) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (d9 == null) {
            d9 = new D();
        }
        f43677a = d9;
        f43678b = new C8.c[0];
    }

    public static C8.e a(i iVar) {
        return f43677a.a(iVar);
    }

    public static C8.c b(Class cls) {
        return f43677a.b(cls);
    }

    public static C8.d c(Class cls) {
        return f43677a.c(cls, "");
    }

    public static C8.g d(n nVar) {
        return f43677a.d(nVar);
    }

    public static C8.h e(p pVar) {
        return f43677a.e(pVar);
    }

    public static C8.j f(t tVar) {
        return f43677a.f(tVar);
    }

    public static C8.l g(v vVar) {
        return f43677a.g(vVar);
    }

    public static String h(h hVar) {
        return f43677a.h(hVar);
    }

    public static String i(m mVar) {
        return f43677a.i(mVar);
    }
}

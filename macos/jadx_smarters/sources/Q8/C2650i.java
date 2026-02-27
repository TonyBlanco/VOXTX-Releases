package q8;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: q8.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2650i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2650i f49608a = new C2650i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f49609b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f49610c;

    /* JADX INFO: renamed from: q8.i$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f49611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f49612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f49613c;

        public a(Method method, Method method2, Method method3) {
            this.f49611a = method;
            this.f49612b = method2;
            this.f49613c = method3;
        }
    }

    public final a a(AbstractC2642a abstractC2642a) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", null), abstractC2642a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), abstractC2642a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f49610c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f49609b;
            f49610c = aVar2;
            return aVar2;
        }
    }

    public final String b(AbstractC2642a continuation) {
        kotlin.jvm.internal.l.e(continuation, "continuation");
        a aVarA = f49610c;
        if (aVarA == null) {
            aVarA = a(continuation);
        }
        if (aVarA == f49609b) {
            return null;
        }
        Method method = aVarA.f49611a;
        Object objInvoke = method != null ? method.invoke(continuation.getClass(), null) : null;
        if (objInvoke == null) {
            return null;
        }
        Method method2 = aVarA.f49612b;
        Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
        if (objInvoke2 == null) {
            return null;
        }
        Method method3 = aVarA.f49613c;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}

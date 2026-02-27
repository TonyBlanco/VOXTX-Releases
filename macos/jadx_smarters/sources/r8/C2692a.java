package r8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l;
import l8.h;

/* JADX INFO: renamed from: r8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2692a {

    /* JADX INFO: renamed from: r8.a$a, reason: collision with other inner class name */
    public static final class C0436a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0436a f49798a = new C0436a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f49799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f49800c;

        static {
            Method method;
            Method method2;
            Method[] throwableMethods = Throwable.class.getMethods();
            l.d(throwableMethods, "throwableMethods");
            int length = throwableMethods.length;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                method = null;
                if (i10 >= length) {
                    method2 = null;
                    break;
                }
                method2 = throwableMethods[i10];
                if (l.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    l.d(parameterTypes, "it.parameterTypes");
                    if (l.a(h.M(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i10++;
            }
            f49799b = method2;
            int length2 = throwableMethods.length;
            while (true) {
                if (i9 >= length2) {
                    break;
                }
                Method method3 = throwableMethods[i9];
                if (l.a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i9++;
            }
            f49800c = method;
        }
    }

    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        l.e(cause, "cause");
        l.e(exception, "exception");
        Method method = C0436a.f49799b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public z8.c b() {
        return new z8.b();
    }
}

package kotlin.jvm.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.util.List;
import k8.InterfaceC2153b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class F {
    public static List a(Object obj) {
        if (obj instanceof x8.a) {
            h(obj, "kotlin.collections.MutableList");
        }
        return c(obj);
    }

    public static Object b(Object obj, int i9) {
        if (obj != null && !e(obj, i9)) {
            h(obj, "kotlin.jvm.functions.Function" + i9);
        }
        return obj;
    }

    public static List c(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e9) {
            throw g(e9);
        }
    }

    public static int d(Object obj) {
        if (obj instanceof h) {
            return ((h) obj).getArity();
        }
        if (obj instanceof w8.a) {
            return 0;
        }
        if (obj instanceof w8.l) {
            return 1;
        }
        if (obj instanceof w8.p) {
            return 2;
        }
        return obj instanceof w8.q ? 3 : -1;
    }

    public static boolean e(Object obj, int i9) {
        return (obj instanceof InterfaceC2153b) && d(obj) == i9;
    }

    public static Throwable f(Throwable th) {
        return l.k(th, F.class.getName());
    }

    public static ClassCastException g(ClassCastException classCastException) {
        throw ((ClassCastException) f(classCastException));
    }

    public static void h(Object obj, String str) {
        i((obj == null ? Constants.NULL_VERSION_ID : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void i(String str) {
        throw g(new ClassCastException(str));
    }
}

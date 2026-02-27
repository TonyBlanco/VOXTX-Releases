package J0;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f2992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f2993b;

    public static void a(String str) {
        c.a(str);
    }

    public static void b() {
        c.b();
    }

    public static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean d() {
        try {
            if (f2993b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return e();
    }

    public static boolean e() {
        try {
            if (f2993b == null) {
                f2992a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2993b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2993b.invoke(null, Long.valueOf(f2992a))).booleanValue();
        } catch (Exception e9) {
            c("isTagEnabled", e9);
            return false;
        }
    }
}

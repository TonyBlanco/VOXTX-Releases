package L;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f3868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f3869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f3870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f3871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f3872e;

    public static class a {
        public static void a(String str) {
            Trace.beginSection(str);
        }

        public static void b() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f3868a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f3869b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f3870c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f3871d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f3872e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e9) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e9);
            }
        }
    }

    public static void a(String str) {
        a.a(str);
    }

    public static void b() {
        a.b();
    }
}

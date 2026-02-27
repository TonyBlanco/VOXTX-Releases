package h1;

import android.os.SystemClock;
import android.util.Log;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f41582a = "Volley";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f41583b = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f41584c = v.class.getName();

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final boolean f41585c = v.f41583b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f41586a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f41587b = false;

        /* JADX INFO: renamed from: h1.v$a$a, reason: collision with other inner class name */
        public static class C0340a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f41588a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f41589b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f41590c;

            public C0340a(String str, long j9, long j10) {
                this.f41588a = str;
                this.f41589b = j9;
                this.f41590c = j10;
            }
        }

        public synchronized void a(String str, long j9) {
            if (this.f41587b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f41586a.add(new C0340a(str, j9, SystemClock.elapsedRealtime()));
        }

        public synchronized void b(String str) {
            this.f41587b = true;
            long jC = c();
            if (jC <= 0) {
                return;
            }
            long j9 = ((C0340a) this.f41586a.get(0)).f41590c;
            v.b("(%-4d ms) %s", Long.valueOf(jC), str);
            for (C0340a c0340a : this.f41586a) {
                long j10 = c0340a.f41590c;
                v.b("(+%-4d) [%2d] %s", Long.valueOf(j10 - j9), Long.valueOf(c0340a.f41589b), c0340a.f41588a);
                j9 = j10;
            }
        }

        public final long c() {
            if (this.f41586a.size() == 0) {
                return 0L;
            }
            return ((C0340a) this.f41586a.get(r2.size() - 1)).f41590c - ((C0340a) this.f41586a.get(0)).f41590c;
        }

        public void finalize() {
            if (this.f41587b) {
                return;
            }
            b("Request on the loose");
            v.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i9 = 2;
        while (true) {
            if (i9 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i9].getClassName().equals(f41584c)) {
                String className = stackTrace[i9].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + InstructionFileId.DOT + stackTrace[i9].getMethodName();
                break;
            }
            i9++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void b(String str, Object... objArr) {
        Log.d(f41582a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f41582a, a(str, objArr));
    }

    public static void d(Throwable th, String str, Object... objArr) {
        Log.e(f41582a, a(str, objArr), th);
    }

    public static void e(String str, Object... objArr) {
        if (f41583b) {
            Log.v(f41582a, a(str, objArr));
        }
    }
}

package d4;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: d4.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1681B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f39641b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f39642c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f39640a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f39643d = a.f39644a;

    /* JADX INFO: renamed from: d4.B$a */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39644a = new C0314a();

        /* JADX INFO: renamed from: d4.B$a$a, reason: collision with other inner class name */
        public class C0314a implements a {
            @Override // d4.AbstractC1681B.a
            public void a(String str, String str2) {
                Log.w(str, str2);
            }

            @Override // d4.AbstractC1681B.a
            public void b(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // d4.AbstractC1681B.a
            public void c(String str, String str2) {
                Log.d(str, str2);
            }

            @Override // d4.AbstractC1681B.a
            public void d(String str, String str2) {
                Log.i(str, str2);
            }
        }

        void a(String str, String str2);

        void b(String str, String str2);

        void c(String str, String str2);

        void d(String str, String str2);
    }

    public static String a(String str, Throwable th) {
        String strF = f(th);
        if (TextUtils.isEmpty(strF)) {
            return str;
        }
        return str + "\n  " + strF.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f39640a) {
            try {
                if (f39641b == 0) {
                    f39643d.c(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(String str, String str2, Throwable th) {
        b(str, a(str2, th));
    }

    public static void d(String str, String str2) {
        synchronized (f39640a) {
            try {
                if (f39641b <= 3) {
                    f39643d.b(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(String str, String str2, Throwable th) {
        d(str, a(str2, th));
    }

    public static String f(Throwable th) {
        synchronized (f39640a) {
            try {
                if (th == null) {
                    return null;
                }
                if (i(th)) {
                    return "UnknownHostException (no network)";
                }
                if (f39642c) {
                    return Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
                return th.getMessage();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void g(String str, String str2) {
        synchronized (f39640a) {
            try {
                if (f39641b <= 1) {
                    f39643d.d(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void h(String str, String str2, Throwable th) {
        g(str, a(str2, th));
    }

    public static boolean i(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void j(String str, String str2) {
        synchronized (f39640a) {
            try {
                if (f39641b <= 2) {
                    f39643d.a(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void k(String str, String str2, Throwable th) {
        j(str, a(str2, th));
    }
}

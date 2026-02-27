package L5;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f4088c = new f("FirebaseCrashlytics");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4090b = 4;

    public f(String str) {
        this.f4089a = str;
    }

    public static f f() {
        return f4088c;
    }

    public final boolean a(int i9) {
        return this.f4090b <= i9 || Log.isLoggable(this.f4089a, i9);
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.f4089a, str, th);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f4089a, str, th);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.f4089a, str, th);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.f4089a, str, th);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.f4089a, str, th);
        }
    }
}

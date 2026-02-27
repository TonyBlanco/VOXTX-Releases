package q6;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static WeakReference f47026d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f47027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Y f47028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f47029c;

    public b0(SharedPreferences sharedPreferences, Executor executor) {
        this.f47029c = executor;
        this.f47027a = sharedPreferences;
    }

    public static synchronized b0 b(Context context, Executor executor) {
        try {
            WeakReference weakReference = f47026d;
            b0 b0Var = weakReference != null ? (b0) weakReference.get() : null;
            if (b0Var != null) {
                return b0Var;
            }
            b0 b0Var2 = new b0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
            b0Var2.d();
            f47026d = new WeakReference(b0Var2);
            return b0Var2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean a(a0 a0Var) {
        return this.f47028b.b(a0Var.e());
    }

    public synchronized a0 c() {
        return a0.a(this.f47028b.f());
    }

    public final synchronized void d() {
        this.f47028b = Y.d(this.f47027a, "topic_operation_queue", ",", this.f47029c);
    }

    public synchronized boolean e(a0 a0Var) {
        return this.f47028b.g(a0Var.e());
    }
}

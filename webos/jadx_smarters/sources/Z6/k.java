package Z6;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static k f11415e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f11416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HandlerThread f11417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11418c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11419d = new Object();

    public static k d() {
        if (f11415e == null) {
            f11415e = new k();
        }
        return f11415e;
    }

    public final void a() {
        synchronized (this.f11419d) {
            try {
                if (this.f11416a == null) {
                    if (this.f11418c <= 0) {
                        throw new IllegalStateException("CameraThread is not open");
                    }
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f11417b = handlerThread;
                    handlerThread.start();
                    this.f11416a = new Handler(this.f11417b.getLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        synchronized (this.f11419d) {
            try {
                int i9 = this.f11418c - 1;
                this.f11418c = i9;
                if (i9 == 0) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(Runnable runnable) {
        synchronized (this.f11419d) {
            a();
            this.f11416a.post(runnable);
        }
    }

    public void e(Runnable runnable) {
        synchronized (this.f11419d) {
            this.f11418c++;
            c(runnable);
        }
    }

    public final void f() {
        synchronized (this.f11419d) {
            this.f11417b.quit();
            this.f11417b = null;
            this.f11416a = null;
        }
    }
}

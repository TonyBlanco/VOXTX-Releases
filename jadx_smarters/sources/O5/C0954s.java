package O5;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: O5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0954s implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f6660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V5.i f6661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f6662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L5.a f6663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f6664e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: O5.s$a */
    public interface a {
        void a(V5.i iVar, Thread thread, Throwable th);
    }

    public C0954s(a aVar, V5.i iVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, L5.a aVar2) {
        this.f6660a = aVar;
        this.f6661b = iVar;
        this.f6662c = uncaughtExceptionHandler;
        this.f6663d = aVar2;
    }

    public boolean a() {
        return this.f6664e.get();
    }

    public final boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            L5.f.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            L5.f.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f6663d.b()) {
            return true;
        }
        L5.f.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f6664e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.f6660a.a(this.f6661b, thread, th);
                } else {
                    L5.f.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e9) {
                L5.f.f().e("An error occurred in the uncaught exception handler", e9);
            }
            L5.f.f().b("Completed exception processing. Invoking default exception handler.");
            this.f6662c.uncaughtException(thread, th);
            this.f6664e.set(false);
        } catch (Throwable th2) {
            L5.f.f().b("Completed exception processing. Invoking default exception handler.");
            this.f6662c.uncaughtException(thread, th);
            this.f6664e.set(false);
            throw th2;
        }
    }
}

package d4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Q implements RunnableFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1691h f39714a = new C1691h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1691h f39715c = new C1691h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f39716d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Exception f39717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f39718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread f39719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f39720h;

    public final void a() {
        this.f39715c.c();
    }

    public final void b() {
        this.f39714a.c();
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        synchronized (this.f39716d) {
            try {
                if (!this.f39720h && !this.f39715c.e()) {
                    this.f39720h = true;
                    c();
                    Thread thread = this.f39719g;
                    if (thread == null) {
                        this.f39714a.f();
                        this.f39715c.f();
                    } else if (z9) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public abstract Object d();

    public final Object e() throws ExecutionException {
        if (this.f39720h) {
            throw new CancellationException();
        }
        if (this.f39717e == null) {
            return this.f39718f;
        }
        throw new ExecutionException(this.f39717e);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        this.f39715c.a();
        return e();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) throws TimeoutException {
        if (this.f39715c.b(TimeUnit.MILLISECONDS.convert(j9, timeUnit))) {
            return e();
        }
        throw new TimeoutException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f39720h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f39715c.e();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f39716d) {
            try {
                if (this.f39720h) {
                    return;
                }
                this.f39719g = Thread.currentThread();
                this.f39714a.f();
                try {
                    try {
                        this.f39718f = d();
                        synchronized (this.f39716d) {
                            this.f39715c.f();
                            this.f39719g = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th) {
                        synchronized (this.f39716d) {
                            this.f39715c.f();
                            this.f39719g = null;
                            Thread.interrupted();
                            throw th;
                        }
                    }
                } catch (Exception e9) {
                    this.f39717e = e9;
                    synchronized (this.f39716d) {
                        this.f39715c.f();
                        this.f39719g = null;
                        Thread.interrupted();
                    }
                }
            } finally {
            }
        }
    }
}

package J5;

import J5.p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class o implements ScheduledExecutorService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f3371a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f3372c;

    public o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f3371a = executorService;
        this.f3372c = scheduledExecutorService;
    }

    public static /* synthetic */ void m(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e9) {
            bVar.a(e9);
        }
    }

    public static /* synthetic */ void p(Callable callable, p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e9) {
            bVar.a(e9);
        }
    }

    public static /* synthetic */ void s(Runnable runnable, p.b bVar) throws Exception {
        try {
            runnable.run();
        } catch (Exception e9) {
            bVar.a(e9);
            throw e9;
        }
    }

    public static /* synthetic */ void x(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e9) {
            bVar.a(e9);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j9, TimeUnit timeUnit) {
        return this.f3371a.awaitTermination(j9, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f3371a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f3371a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j9, TimeUnit timeUnit) {
        return this.f3371a.invokeAll(collection, j9, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f3371a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j9, TimeUnit timeUnit) {
        return this.f3371a.invokeAny(collection, j9, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f3371a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f3371a.isTerminated();
    }

    public final /* synthetic */ void n(final Runnable runnable, final p.b bVar) {
        this.f3371a.execute(new Runnable() { // from class: J5.m
            @Override // java.lang.Runnable
            public final void run() {
                o.m(runnable, bVar);
            }
        });
    }

    public final /* synthetic */ ScheduledFuture o(final Runnable runnable, long j9, TimeUnit timeUnit, final p.b bVar) {
        return this.f3372c.schedule(new Runnable() { // from class: J5.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f3358a.n(runnable, bVar);
            }
        }, j9, timeUnit);
    }

    public final /* synthetic */ Future q(final Callable callable, final p.b bVar) {
        return this.f3371a.submit(new Runnable() { // from class: J5.n
            @Override // java.lang.Runnable
            public final void run() {
                o.p(callable, bVar);
            }
        });
    }

    public final /* synthetic */ ScheduledFuture r(final Callable callable, long j9, TimeUnit timeUnit, final p.b bVar) {
        return this.f3372c.schedule(new Callable() { // from class: J5.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f3361a.q(callable, bVar);
            }
        }, j9, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j9, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: J5.c
            @Override // J5.p.c
            public final ScheduledFuture a(p.b bVar) {
                return this.f3333a.o(runnable, j9, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j9, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: J5.h
            @Override // J5.p.c
            public final ScheduledFuture a(p.b bVar) {
                return this.f3351a.r(callable, j9, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j9, final long j10, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: J5.f
            @Override // J5.p.c
            public final ScheduledFuture a(p.b bVar) {
                return this.f3341a.u(runnable, j9, j10, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j9, final long j10, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: J5.g
            @Override // J5.p.c
            public final ScheduledFuture a(p.b bVar) {
                return this.f3346a.w(runnable, j9, j10, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f3371a.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f3371a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f3371a.submit(callable);
    }

    public final /* synthetic */ void t(final Runnable runnable, final p.b bVar) {
        this.f3371a.execute(new Runnable() { // from class: J5.d
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                o.s(runnable, bVar);
            }
        });
    }

    public final /* synthetic */ ScheduledFuture u(final Runnable runnable, long j9, long j10, TimeUnit timeUnit, final p.b bVar) {
        return this.f3372c.scheduleAtFixedRate(new Runnable() { // from class: J5.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f3355a.t(runnable, bVar);
            }
        }, j9, j10, timeUnit);
    }

    public final /* synthetic */ void v(final Runnable runnable, final p.b bVar) {
        this.f3371a.execute(new Runnable() { // from class: J5.e
            @Override // java.lang.Runnable
            public final void run() {
                o.x(runnable, bVar);
            }
        });
    }

    public final /* synthetic */ ScheduledFuture w(final Runnable runnable, long j9, long j10, TimeUnit timeUnit, final p.b bVar) {
        return this.f3372c.scheduleWithFixedDelay(new Runnable() { // from class: J5.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f3364a.v(runnable, bVar);
            }
        }, j9, j10, timeUnit);
    }
}

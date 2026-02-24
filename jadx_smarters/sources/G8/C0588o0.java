package G8;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.AbstractC2163d;

/* JADX INFO: renamed from: G8.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0588o0 extends AbstractC0586n0 implements V {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f2354e;

    public C0588o0(Executor executor) {
        this.f2354e = executor;
        AbstractC2163d.a(g0());
    }

    @Override // G8.H
    public void c0(o8.g gVar, Runnable runnable) {
        try {
            Executor executorG0 = g0();
            AbstractC0563c.a();
            executorG0.execute(runnable);
        } catch (RejectedExecutionException e9) {
            AbstractC0563c.a();
            f0(gVar, e9);
            C0562b0.b().c0(gVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorG0 = g0();
        ExecutorService executorService = executorG0 instanceof ExecutorService ? (ExecutorService) executorG0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0588o0) && ((C0588o0) obj).g0() == g0();
    }

    public final void f0(o8.g gVar, RejectedExecutionException rejectedExecutionException) {
        B0.c(gVar, AbstractC0584m0.a("The task was rejected", rejectedExecutionException));
    }

    public Executor g0() {
        return this.f2354e;
    }

    public final ScheduledFuture h0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, o8.g gVar, long j9) {
        try {
            return scheduledExecutorService.schedule(runnable, j9, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e9) {
            f0(gVar, e9);
            return null;
        }
    }

    public int hashCode() {
        return System.identityHashCode(g0());
    }

    @Override // G8.V
    public InterfaceC0566d0 t(long j9, Runnable runnable, o8.g gVar) {
        Executor executorG0 = g0();
        ScheduledExecutorService scheduledExecutorService = executorG0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorG0 : null;
        ScheduledFuture scheduledFutureH0 = scheduledExecutorService != null ? h0(scheduledExecutorService, runnable, gVar, j9) : null;
        return scheduledFutureH0 != null ? new C0564c0(scheduledFutureH0) : Q.f2302i.t(j9, runnable, gVar);
    }

    @Override // G8.H
    public String toString() {
        return g0().toString();
    }
}

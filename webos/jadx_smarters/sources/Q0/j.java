package Q0;

import G8.InterfaceC0605x0;
import b1.C1199c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import y5.InterfaceFutureC2987b;

/* JADX INFO: loaded from: classes.dex */
public final class j implements InterfaceFutureC2987b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0605x0 f7458a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1199c f7459c;

    public static final class a extends kotlin.jvm.internal.m implements w8.l {
        public a() {
            super(1);
        }

        public final void a(Throwable th) {
            if (th == null) {
                if (!j.this.f7459c.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else {
                if (th instanceof CancellationException) {
                    j.this.f7459c.cancel(true);
                    return;
                }
                C1199c c1199c = j.this.f7459c;
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                c1199c.q(th);
            }
        }

        @Override // w8.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return k8.q.f43674a;
        }
    }

    public j(InterfaceC0605x0 job, C1199c underlying) {
        kotlin.jvm.internal.l.e(job, "job");
        kotlin.jvm.internal.l.e(underlying, "underlying");
        this.f7458a = job;
        this.f7459c = underlying;
        job.i(new a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ j(InterfaceC0605x0 interfaceC0605x0, C1199c c1199c, int i9, kotlin.jvm.internal.g gVar) {
        if ((i9 & 2) != 0) {
            c1199c = C1199c.t();
            kotlin.jvm.internal.l.d(c1199c, "create()");
        }
        this(interfaceC0605x0, c1199c);
    }

    @Override // y5.InterfaceFutureC2987b
    public void addListener(Runnable runnable, Executor executor) {
        this.f7459c.addListener(runnable, executor);
    }

    public final void b(Object obj) {
        this.f7459c.p(obj);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z9) {
        return this.f7459c.cancel(z9);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f7459c.get();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j9, TimeUnit timeUnit) {
        return this.f7459c.get(j9, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f7459c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f7459c.isDone();
    }
}

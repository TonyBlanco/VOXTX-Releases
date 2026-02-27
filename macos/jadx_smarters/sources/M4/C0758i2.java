package M4;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: M4.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0758i2 extends F2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicLong f4730l = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0746g2 f4731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0746g2 f4732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue f4733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BlockingQueue f4734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f4735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f4736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f4737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Semaphore f4738j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f4739k;

    public C0758i2(C0776l2 c0776l2) {
        super(c0776l2);
        this.f4737i = new Object();
        this.f4738j = new Semaphore(2);
        this.f4733e = new PriorityBlockingQueue();
        this.f4734f = new LinkedBlockingQueue();
        this.f4735g = new C0734e2(this, "Thread death: Uncaught exception on worker thread");
        this.f4736h = new C0734e2(this, "Thread death: Uncaught exception on network thread");
    }

    public static /* bridge */ /* synthetic */ boolean B(C0758i2 c0758i2) {
        boolean z9 = c0758i2.f4739k;
        return false;
    }

    public final void A(Runnable runnable) {
        k();
        com.google.android.gms.common.internal.r.m(runnable);
        D(new C0740f2(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean C() {
        return Thread.currentThread() == this.f4731c;
    }

    public final void D(C0740f2 c0740f2) {
        synchronized (this.f4737i) {
            try {
                this.f4733e.add(c0740f2);
                C0746g2 c0746g2 = this.f4731c;
                if (c0746g2 == null) {
                    C0746g2 c0746g22 = new C0746g2(this, "Measurement Worker", this.f4733e);
                    this.f4731c = c0746g22;
                    c0746g22.setUncaughtExceptionHandler(this.f4735g);
                    this.f4731c.start();
                } else {
                    c0746g2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M4.E2
    public final void g() {
        if (Thread.currentThread() != this.f4732d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // M4.E2
    public final void h() {
        if (Thread.currentThread() != this.f4731c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // M4.F2
    public final boolean j() {
        return false;
    }

    public final Object r(AtomicReference atomicReference, long j9, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f4245a.f().z(runnable);
            try {
                atomicReference.wait(j9);
            } catch (InterruptedException unused) {
                this.f4245a.d().w().a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f4245a.d().w().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final Future s(Callable callable) {
        k();
        com.google.android.gms.common.internal.r.m(callable);
        C0740f2 c0740f2 = new C0740f2(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f4731c) {
            if (!this.f4733e.isEmpty()) {
                this.f4245a.d().w().a("Callable skipped the worker queue.");
            }
            c0740f2.run();
        } else {
            D(c0740f2);
        }
        return c0740f2;
    }

    public final Future t(Callable callable) {
        k();
        com.google.android.gms.common.internal.r.m(callable);
        C0740f2 c0740f2 = new C0740f2(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f4731c) {
            c0740f2.run();
        } else {
            D(c0740f2);
        }
        return c0740f2;
    }

    public final void y(Runnable runnable) {
        k();
        com.google.android.gms.common.internal.r.m(runnable);
        C0740f2 c0740f2 = new C0740f2(this, runnable, false, "Task exception on network thread");
        synchronized (this.f4737i) {
            try {
                this.f4734f.add(c0740f2);
                C0746g2 c0746g2 = this.f4732d;
                if (c0746g2 == null) {
                    C0746g2 c0746g22 = new C0746g2(this, "Measurement Network", this.f4734f);
                    this.f4732d = c0746g22;
                    c0746g22.setUncaughtExceptionHandler(this.f4736h);
                    this.f4732d.start();
                } else {
                    c0746g2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(Runnable runnable) {
        k();
        com.google.android.gms.common.internal.r.m(runnable);
        D(new C0740f2(this, runnable, false, "Task exception on worker thread"));
    }
}

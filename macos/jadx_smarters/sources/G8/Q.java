package G8;

import G8.AbstractC0576i0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class Q extends AbstractC0576i0 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Q f2302i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f2303j;

    static {
        Long l9;
        Q q9 = new Q();
        f2302i = q9;
        AbstractC0574h0.l0(q9, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l9 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l9 = 1000L;
        }
        f2303j = timeUnit.toNanos(l9.longValue());
    }

    public final synchronized void I0() {
        if (L0()) {
            debugStatus = 3;
            C0();
            notifyAll();
        }
    }

    public final synchronized Thread J0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final boolean K0() {
        return debugStatus == 4;
    }

    public final boolean L0() {
        int i9 = debugStatus;
        return i9 == 2 || i9 == 3;
    }

    public final synchronized boolean M0() {
        if (L0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    public final void N0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // G8.AbstractC0578j0
    public Thread r0() {
        Thread thread = _thread;
        return thread == null ? J0() : thread;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zA0;
        U0.f2306a.d(this);
        AbstractC0563c.a();
        try {
            if (!M0()) {
                if (zA0) {
                    return;
                } else {
                    return;
                }
            }
            long j9 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jO0 = o0();
                if (jO0 == Long.MAX_VALUE) {
                    AbstractC0563c.a();
                    long jNanoTime = System.nanoTime();
                    if (j9 == Long.MAX_VALUE) {
                        j9 = f2303j + jNanoTime;
                    }
                    long j10 = j9 - jNanoTime;
                    if (j10 <= 0) {
                        _thread = null;
                        I0();
                        AbstractC0563c.a();
                        if (A0()) {
                            return;
                        }
                        r0();
                        return;
                    }
                    jO0 = B8.h.f(jO0, j10);
                } else {
                    j9 = Long.MAX_VALUE;
                }
                if (jO0 > 0) {
                    if (L0()) {
                        _thread = null;
                        I0();
                        AbstractC0563c.a();
                        if (A0()) {
                            return;
                        }
                        r0();
                        return;
                    }
                    AbstractC0563c.a();
                    LockSupport.parkNanos(this, jO0);
                }
            }
        } finally {
            _thread = null;
            I0();
            AbstractC0563c.a();
            if (!A0()) {
                r0();
            }
        }
    }

    @Override // G8.AbstractC0578j0
    public void s0(long j9, AbstractC0576i0.b bVar) {
        N0();
    }

    @Override // G8.AbstractC0576i0, G8.AbstractC0574h0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // G8.AbstractC0576i0, G8.V
    public InterfaceC0566d0 t(long j9, Runnable runnable, o8.g gVar) {
        return F0(j9, runnable);
    }

    @Override // G8.AbstractC0576i0
    public void x0(Runnable runnable) {
        if (K0()) {
            N0();
        }
        super.x0(runnable);
    }
}

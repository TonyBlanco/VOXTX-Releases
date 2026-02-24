package com.onesignal;

import com.onesignal.F1;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.onesignal.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1580q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue f38805a = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f38806b = new AtomicLong();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ExecutorService f38807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P0 f38808d;

    /* JADX INFO: renamed from: com.onesignal.q1$a */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("OS_PENDING_EXECUTOR_" + thread.getId());
            return thread;
        }
    }

    /* JADX INFO: renamed from: com.onesignal.q1$b */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C1580q1 f38810a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Runnable f38811c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f38812d;

        public b(C1580q1 c1580q1, Runnable runnable) {
            this.f38810a = c1580q1;
            this.f38811c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38811c.run();
            this.f38810a.d(this.f38812d);
        }

        public String toString() {
            return "PendingTaskRunnable{innerTask=" + this.f38811c + ", taskId=" + this.f38812d + '}';
        }
    }

    public C1580q1(P0 p02) {
        this.f38808d = p02;
    }

    public final void b(b bVar) {
        synchronized (this.f38805a) {
            try {
                bVar.f38812d = this.f38806b.incrementAndGet();
                ExecutorService executorService = this.f38807c;
                if (executorService == null) {
                    this.f38808d.debug("Adding a task to the pending queue with ID: " + bVar.f38812d);
                    this.f38805a.add(bVar);
                } else if (!executorService.isShutdown()) {
                    this.f38808d.debug("Executor is still running, add to the executor with ID: " + bVar.f38812d);
                    try {
                        this.f38807c.submit(bVar);
                    } catch (RejectedExecutionException e9) {
                        this.f38808d.info("Executor is shutdown, running task manually with ID: " + bVar.f38812d);
                        bVar.run();
                        e9.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(Runnable runnable) {
        b(new b(this, runnable));
    }

    public final void d(long j9) {
        if (this.f38806b.get() == j9) {
            F1.a(F1.v.INFO, "Last Pending Task has ran, shutting down");
            this.f38807c.shutdown();
        }
    }

    public boolean e() {
        if (Thread.currentThread().getName().contains("OS_PENDING_EXECUTOR_")) {
            return false;
        }
        if (F1.O0() && this.f38807c == null) {
            return false;
        }
        if (F1.O0() || this.f38807c != null) {
            return !this.f38807c.isShutdown();
        }
        return true;
    }

    public void f() {
        synchronized (this.f38805a) {
            try {
                F1.a(F1.v.DEBUG, "startPendingTasks with task queue quantity: " + this.f38805a.size());
                if (!this.f38805a.isEmpty()) {
                    this.f38807c = Executors.newSingleThreadExecutor(new a());
                    while (!this.f38805a.isEmpty()) {
                        this.f38807c.submit((Runnable) this.f38805a.poll());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

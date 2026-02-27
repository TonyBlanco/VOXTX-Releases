package X1;

import android.os.Process;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class a extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f10395a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f10396c;

    public static class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10397a = 0;

        /* JADX INFO: renamed from: X1.a$b$a, reason: collision with other inner class name */
        public class C0138a extends Thread {
            public C0138a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            C0138a c0138a = new C0138a(runnable, "fifo-pool-thread-" + this.f10397a);
            this.f10397a = this.f10397a + 1;
            return c0138a;
        }
    }

    public static class c extends FutureTask implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10399a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10400c;

        public c(Runnable runnable, Object obj, int i9) {
            super(runnable, obj);
            if (!(runnable instanceof X1.b)) {
                throw new IllegalArgumentException("FifoPriorityThreadPoolExecutor must be given Runnables that implement Prioritized");
            }
            this.f10399a = ((X1.b) runnable).a();
            this.f10400c = i9;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i9 = this.f10399a - cVar.f10399a;
            return i9 == 0 ? this.f10400c - cVar.f10400c : i9;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f10400c == cVar.f10400c && this.f10399a == cVar.f10399a;
        }

        public int hashCode() {
            return (this.f10399a * 31) + this.f10400c;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d IGNORE;
        public static final d LOG;
        public static final d THROW;

        /* JADX INFO: renamed from: X1.a$d$a, reason: collision with other inner class name */
        public enum C0139a extends d {
            public C0139a(String str, int i9) {
                super(str, i9);
            }

            @Override // X1.a.d
            public void handle(Throwable th) {
                if (Log.isLoggable("PriorityExecutor", 6)) {
                    Log.e("PriorityExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        public enum b extends d {
            public b(String str, int i9) {
                super(str, i9);
            }

            @Override // X1.a.d
            public void handle(Throwable th) {
                super.handle(th);
                throw new RuntimeException(th);
            }
        }

        static {
            d dVar = new d("IGNORE", 0);
            IGNORE = dVar;
            C0139a c0139a = new C0139a("LOG", 1);
            LOG = c0139a;
            b bVar = new b("THROW", 2);
            THROW = bVar;
            $VALUES = new d[]{dVar, c0139a, bVar};
        }

        private d(String str, int i9) {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        public void handle(Throwable th) {
        }
    }

    public a(int i9) {
        this(i9, d.LOG);
    }

    public a(int i9, int i10, long j9, TimeUnit timeUnit, ThreadFactory threadFactory, d dVar) {
        super(i9, i10, j9, timeUnit, new PriorityBlockingQueue(), threadFactory);
        this.f10395a = new AtomicInteger();
        this.f10396c = dVar;
    }

    public a(int i9, d dVar) {
        this(i9, i9, 0L, TimeUnit.MILLISECONDS, new b(), dVar);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            if (!future.isDone() || future.isCancelled()) {
                return;
            }
            try {
                future.get();
            } catch (InterruptedException | ExecutionException e9) {
                this.f10396c.handle(e9);
            }
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new c(runnable, obj, this.f10395a.getAndIncrement());
    }
}

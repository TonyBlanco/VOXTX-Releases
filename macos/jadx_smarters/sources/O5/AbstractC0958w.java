package O5;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: O5.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0958w {

    /* JADX INFO: renamed from: O5.w$a */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f6673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f6674b;

        /* JADX INFO: renamed from: O5.w$a$a, reason: collision with other inner class name */
        public class C0075a extends AbstractRunnableC0940d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f6675a;

            public C0075a(Runnable runnable) {
                this.f6675a = runnable;
            }

            @Override // O5.AbstractRunnableC0940d
            public void a() {
                this.f6675a.run();
            }
        }

        public a(String str, AtomicLong atomicLong) {
            this.f6673a = str;
            this.f6674b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C0075a(runnable));
            threadNewThread.setName(this.f6673a + this.f6674b.getAndIncrement());
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: O5.w$b */
    public class b extends AbstractRunnableC0940d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f6677a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ExecutorService f6678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f6679d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ TimeUnit f6680e;

        public b(String str, ExecutorService executorService, long j9, TimeUnit timeUnit) {
            this.f6677a = str;
            this.f6678c = executorService;
            this.f6679d = j9;
            this.f6680e = timeUnit;
        }

        @Override // O5.AbstractRunnableC0940d
        public void a() {
            try {
                L5.f.f().b("Executing shutdown hook for " + this.f6677a);
                this.f6678c.shutdown();
                if (this.f6678c.awaitTermination(this.f6679d, this.f6680e)) {
                    return;
                }
                L5.f.f().b(this.f6677a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f6678c.shutdownNow();
            } catch (InterruptedException unused) {
                L5.f.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f6677a));
                this.f6678c.shutdownNow();
            }
        }
    }

    public static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    public static void b(String str, ExecutorService executorService, long j9, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j9, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService executorServiceE = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, executorServiceE);
        return executorServiceE;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    public static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}

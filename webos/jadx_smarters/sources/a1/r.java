package a1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f11495f = Q0.k.f("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadFactory f11496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f11497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f11498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f11499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11500e;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11501a = 0;

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f11501a);
            this.f11501a = this.f11501a + 1;
            return threadNewThread;
        }
    }

    public interface b {
        void a(String str);
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f11503a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f11504c;

        public c(r rVar, String str) {
            this.f11503a = rVar;
            this.f11504c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f11503a.f11500e) {
                try {
                    if (((c) this.f11503a.f11498c.remove(this.f11504c)) != null) {
                        b bVar = (b) this.f11503a.f11499d.remove(this.f11504c);
                        if (bVar != null) {
                            bVar.a(this.f11504c);
                        }
                    } else {
                        Q0.k.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f11504c), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public r() {
        a aVar = new a();
        this.f11496a = aVar;
        this.f11498c = new HashMap();
        this.f11499d = new HashMap();
        this.f11500e = new Object();
        this.f11497b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (this.f11497b.isShutdown()) {
            return;
        }
        this.f11497b.shutdownNow();
    }

    public void b(String str, long j9, b bVar) {
        synchronized (this.f11500e) {
            Q0.k.c().a(f11495f, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f11498c.put(str, cVar);
            this.f11499d.put(str, bVar);
            this.f11497b.schedule(cVar, j9, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.f11500e) {
            try {
                if (((c) this.f11498c.remove(str)) != null) {
                    Q0.k.c().a(f11495f, String.format("Stopping timer for %s", str), new Throwable[0]);
                    this.f11499d.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

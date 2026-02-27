package C0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class l implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f943a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f944c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f945d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f946a;

        public a(Runnable runnable) {
            this.f946a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f946a.run();
            } finally {
                l.this.a();
            }
        }
    }

    public l(Executor executor) {
        this.f943a = executor;
    }

    public synchronized void a() {
        Runnable runnable = (Runnable) this.f944c.poll();
        this.f945d = runnable;
        if (runnable != null) {
            this.f943a.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f944c.offer(new a(runnable));
        if (this.f945d == null) {
            a();
        }
    }
}

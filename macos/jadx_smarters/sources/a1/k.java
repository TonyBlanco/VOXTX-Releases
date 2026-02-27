package a1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class k implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f11458c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Runnable f11460e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f11457a = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11459d = new Object();

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f11461a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f11462c;

        public a(k kVar, Runnable runnable) {
            this.f11461a = kVar;
            this.f11462c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f11462c.run();
            } finally {
                this.f11461a.b();
            }
        }
    }

    public k(Executor executor) {
        this.f11458c = executor;
    }

    public boolean a() {
        boolean z9;
        synchronized (this.f11459d) {
            z9 = !this.f11457a.isEmpty();
        }
        return z9;
    }

    public void b() {
        synchronized (this.f11459d) {
            try {
                Runnable runnable = (Runnable) this.f11457a.poll();
                this.f11460e = runnable;
                if (runnable != null) {
                    this.f11458c.execute(this.f11460e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f11459d) {
            try {
                this.f11457a.add(new a(this, runnable));
                if (this.f11460e == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

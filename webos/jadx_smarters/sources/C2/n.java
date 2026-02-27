package C2;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class n implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f1016a;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f1017a;

        public a(Runnable runnable) {
            this.f1017a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1017a.run();
            } catch (Exception e9) {
                G2.a.d("Executor", "Background execution failure.", e9);
            }
        }
    }

    public n(Executor executor) {
        this.f1016a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f1016a.execute(new a(runnable));
    }
}

package l1;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public class f implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43871a;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f43872a;

        public a(Runnable runnable) {
            this.f43872a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(f.this.f43871a);
            } catch (Throwable unused) {
            }
            this.f43872a.run();
        }
    }

    public f(int i9) {
        this.f43871a = i9;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(new a(runnable));
    }
}

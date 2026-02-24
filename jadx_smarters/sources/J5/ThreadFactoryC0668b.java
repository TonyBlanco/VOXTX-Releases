package J5;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: J5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class ThreadFactoryC0668b implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f3328e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f3329a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f3332d;

    public ThreadFactoryC0668b(String str, int i9, StrictMode.ThreadPolicy threadPolicy) {
        this.f3330b = str;
        this.f3331c = i9;
        this.f3332d = threadPolicy;
    }

    public final /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f3331c);
        StrictMode.ThreadPolicy threadPolicy = this.f3332d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f3328e.newThread(new Runnable() { // from class: J5.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f3326a.b(runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f3330b, Long.valueOf(this.f3329a.getAndIncrement())));
        return threadNewThread;
    }
}

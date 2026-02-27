package G8;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class W0 {
    public static final AbstractC0586n0 b(final int i9, final String str) {
        if (i9 >= 1) {
            final AtomicInteger atomicInteger = new AtomicInteger();
            return AbstractC0590p0.b(Executors.newScheduledThreadPool(i9, new ThreadFactory() { // from class: G8.V0
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return W0.c(i9, str, atomicInteger, runnable);
                }
            }));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i9 + " specified").toString());
    }

    public static final Thread c(int i9, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i9 != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }

    public static final AbstractC0586n0 d(String str) {
        return b(1, str);
    }
}

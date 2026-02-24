package D4;

import com.google.android.gms.common.internal.r;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class c implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f1437b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadFactory f1438c = Executors.defaultThreadFactory();

    public c(String str) {
        r.n(str, "Name must not be null");
        this.f1436a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f1438c.newThread(new d(runnable, 0));
        threadNewThread.setName(this.f1436a + "[" + this.f1437b.getAndIncrement() + "]");
        return threadNewThread;
    }
}

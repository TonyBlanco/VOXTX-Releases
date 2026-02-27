package D4;

import com.google.android.gms.common.internal.r;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f1435b = Executors.defaultThreadFactory();

    public b(String str) {
        r.n(str, "Name must not be null");
        this.f1434a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f1435b.newThread(new d(runnable, 0));
        threadNewThread.setName(this.f1434a);
        return threadNewThread;
    }
}

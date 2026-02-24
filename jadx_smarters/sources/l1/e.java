package l1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class e implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f43870a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f43870a.post(runnable);
    }
}

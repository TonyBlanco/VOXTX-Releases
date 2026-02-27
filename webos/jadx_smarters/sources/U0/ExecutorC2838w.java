package u0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: u0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC2838w implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f51132a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f51132a.post(runnable);
    }
}

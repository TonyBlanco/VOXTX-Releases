package D4;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f1439a;

    public d(Runnable runnable, int i9) {
        this.f1439a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f1439a.run();
    }
}

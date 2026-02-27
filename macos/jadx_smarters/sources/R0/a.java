package R0;

import Q0.r;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f8458a = L.h.a(Looper.getMainLooper());

    @Override // Q0.r
    public void a(Runnable runnable) {
        this.f8458a.removeCallbacks(runnable);
    }

    @Override // Q0.r
    public void b(long j9, Runnable runnable) {
        this.f8458a.postDelayed(runnable, j9);
    }
}

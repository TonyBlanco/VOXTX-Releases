package A5;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q {
    public static q a(long j9, long j10, long j11) {
        return new a(j9, j10, j11);
    }

    public static q e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}

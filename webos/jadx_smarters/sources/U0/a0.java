package u0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f51032a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f51033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f51034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f51035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f51036e;

    public a0(Runnable runnable) {
        this.f51033b = runnable;
    }

    public boolean a() {
        if (this.f51036e) {
            long j9 = this.f51034c;
            if (j9 > 0) {
                this.f51032a.postDelayed(this.f51033b, j9);
            }
        }
        return this.f51036e;
    }

    public void b(boolean z9, long j9) {
        if (z9) {
            long j10 = this.f51035d;
            if (j10 - j9 >= 30000) {
                return;
            }
            this.f51034c = Math.max(this.f51034c, (j9 + 30000) - j10);
            this.f51036e = true;
        }
    }

    public void c() {
        this.f51034c = 0L;
        this.f51036e = false;
        this.f51035d = SystemClock.elapsedRealtime();
        this.f51032a.removeCallbacks(this.f51033b);
    }
}

package q2;

import android.os.SystemClock;

/* JADX INFO: renamed from: q2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2535d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f46806a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j9) {
        return (b() - j9) * f46806a;
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}

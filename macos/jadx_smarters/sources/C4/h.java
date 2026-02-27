package C4;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f1138a = new h();

    public static e c() {
        return f1138a;
    }

    @Override // C4.e
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // C4.e
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // C4.e
    public final long nanoTime() {
        return System.nanoTime();
    }
}

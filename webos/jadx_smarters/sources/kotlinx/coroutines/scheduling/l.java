package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.B;
import kotlinx.coroutines.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f43821a = B.e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f43822b = B.d("kotlinx.coroutines.scheduler.core.pool.size", B8.h.c(z.a(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f43823c = B.d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f43824d = TimeUnit.SECONDS.toNanos(B.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static g f43825e = e.f43811a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f43826f = new j(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f43827g = new j(1);
}

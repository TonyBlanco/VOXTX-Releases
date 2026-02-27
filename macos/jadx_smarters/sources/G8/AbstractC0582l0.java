package G8;

/* JADX INFO: renamed from: G8.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0582l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.y f2345a = new kotlinx.coroutines.internal.y("REMOVED_TASK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.y f2346b = new kotlinx.coroutines.internal.y("CLOSED_EMPTY");

    public static final long c(long j9) {
        if (j9 <= 0) {
            return 0L;
        }
        if (j9 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j9;
    }
}

package y5;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: y5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2989d {
    public static void a(Object obj, long j9) {
        LockSupport.parkNanos(obj, Math.min(j9, 2147483647999999999L));
    }
}

package w5;

import r5.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static int a(long j9, long j10) {
        if (j9 < j10) {
            return -1;
        }
        return j9 > j10 ? 1 : 0;
    }

    public static int b(long j9) {
        return (int) (j9 ^ (j9 >>> 32));
    }

    public static long c(long... jArr) {
        m.d(jArr.length > 0);
        long j9 = jArr[0];
        for (int i9 = 1; i9 < jArr.length; i9++) {
            long j10 = jArr[i9];
            if (j10 > j9) {
                j9 = j10;
            }
        }
        return j9;
    }

    public static long d(long... jArr) {
        m.d(jArr.length > 0);
        long j9 = jArr[0];
        for (int i9 = 1; i9 < jArr.length; i9++) {
            long j10 = jArr[i9];
            if (j10 < j9) {
                j9 = j10;
            }
        }
        return j9;
    }
}

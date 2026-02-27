package r8;

/* JADX INFO: renamed from: r8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2694c {
    public static final int a(int i9, int i10, int i11) {
        return e(e(i9, i11) - e(i10, i11), i11);
    }

    public static final long b(long j9, long j10, long j11) {
        return f(f(j9, j11) - f(j10, j11), j11);
    }

    public static final int c(int i9, int i10, int i11) {
        if (i11 > 0) {
            return i9 >= i10 ? i10 : i10 - a(i10, i9, i11);
        }
        if (i11 < 0) {
            return i9 <= i10 ? i10 : i10 + a(i9, i10, -i11);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final long d(long j9, long j10, long j11) {
        if (j11 > 0) {
            return j9 >= j10 ? j10 : j10 - b(j10, j9, j11);
        }
        if (j11 < 0) {
            return j9 <= j10 ? j10 : j10 + b(j9, j10, -j11);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final int e(int i9, int i10) {
        int i11 = i9 % i10;
        return i11 >= 0 ? i11 : i11 + i10;
    }

    public static final long f(long j9, long j10) {
        long j11 = j9 % j10;
        return j11 >= 0 ? j11 : j11 + j10;
    }
}

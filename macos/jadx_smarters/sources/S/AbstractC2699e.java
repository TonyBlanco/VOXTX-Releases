package s;

/* JADX INFO: renamed from: s.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2699e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f49823a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f49824b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f49825c = new Object[0];

    public static int a(int[] iArr, int i9, int i10) {
        int i11 = i9 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static int b(long[] jArr, int i9, long j9) {
        int i10 = i9 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j10 = jArr[i12];
            if (j10 < j9) {
                i11 = i12 + 1;
            } else {
                if (j10 <= j9) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int d(int i9) {
        for (int i10 = 4; i10 < 32; i10++) {
            int i11 = (1 << i10) - 12;
            if (i9 <= i11) {
                return i11;
            }
        }
        return i9;
    }

    public static int e(int i9) {
        return d(i9 * 4) / 4;
    }

    public static int f(int i9) {
        return d(i9 * 8) / 8;
    }
}

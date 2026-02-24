package E8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m extends l {
    public static Integer i(String str) {
        kotlin.jvm.internal.l.e(str, "<this>");
        return j(str, 10);
    }

    public static final Integer j(String str, int i9) {
        boolean z9;
        int i10;
        int i11;
        kotlin.jvm.internal.l.e(str, "<this>");
        a.a(i9);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        int i13 = -2147483647;
        if (kotlin.jvm.internal.l.f(cCharAt, 48) < 0) {
            i10 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                i13 = Integer.MIN_VALUE;
                z9 = true;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z9 = false;
            }
        } else {
            z9 = false;
            i10 = 0;
        }
        int i14 = -59652323;
        while (i10 < length) {
            int iB = a.b(str.charAt(i10), i9);
            if (iB < 0) {
                return null;
            }
            if ((i12 < i14 && (i14 != -59652323 || i12 < (i14 = i13 / i9))) || (i11 = i12 * i9) < i13 + iB) {
                return null;
            }
            i12 = i11 - iB;
            i10++;
        }
        return z9 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    public static Long k(String str) {
        kotlin.jvm.internal.l.e(str, "<this>");
        return l(str, 10);
    }

    public static final Long l(String str, int i9) {
        boolean z9;
        kotlin.jvm.internal.l.e(str, "<this>");
        a.a(i9);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        long j9 = -9223372036854775807L;
        if (kotlin.jvm.internal.l.f(cCharAt, 48) < 0) {
            z9 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                j9 = Long.MIN_VALUE;
                i10 = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                i10 = 1;
                z9 = false;
            }
        } else {
            z9 = false;
        }
        long j10 = -256204778801521550L;
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i10 < length) {
            int iB = a.b(str.charAt(i10), i9);
            if (iB < 0) {
                return null;
            }
            if (j11 < j12) {
                if (j12 == j10) {
                    j12 = j9 / ((long) i9);
                    if (j11 < j12) {
                    }
                }
                return null;
            }
            long j13 = j11 * ((long) i9);
            long j14 = iB;
            if (j13 < j9 + j14) {
                return null;
            }
            j11 = j13 - j14;
            i10++;
            j10 = -256204778801521550L;
        }
        return z9 ? Long.valueOf(j11) : Long.valueOf(-j11);
    }
}

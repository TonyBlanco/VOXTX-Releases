package O;

import java.io.PrintWriter;
import org.apache.http.message.TokenParser;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f5405a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char[] f5406b = new char[24];

    public static int a(int i9, int i10, boolean z9, int i11) {
        if (i9 > 99 || (z9 && i11 >= 3)) {
            return i10 + 3;
        }
        if (i9 > 9 || (z9 && i11 >= 2)) {
            return i10 + 2;
        }
        if (z9 || i9 > 0) {
            return i10 + 1;
        }
        return 0;
    }

    public static void b(long j9, long j10, PrintWriter printWriter) {
        if (j9 == 0) {
            printWriter.print("--");
        } else {
            d(j9 - j10, printWriter, 0);
        }
    }

    public static void c(long j9, PrintWriter printWriter) {
        d(j9, printWriter, 0);
    }

    public static void d(long j9, PrintWriter printWriter, int i9) {
        synchronized (f5405a) {
            printWriter.print(new String(f5406b, 0, e(j9, i9)));
        }
    }

    public static int e(long j9, int i9) {
        char c9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j10 = j9;
        if (f5406b.length < i9) {
            f5406b = new char[i9];
        }
        char[] cArr = f5406b;
        if (j10 == 0) {
            int i15 = i9 - 1;
            while (i15 > 0) {
                cArr[0] = TokenParser.SP;
            }
            cArr[0] = '0';
            return 1;
        }
        if (j10 > 0) {
            c9 = '+';
        } else {
            j10 = -j10;
            c9 = '-';
        }
        int i16 = (int) (j10 % 1000);
        int iFloor = (int) Math.floor(j10 / 1000);
        if (iFloor > 86400) {
            i10 = iFloor / DateTimeConstants.SECONDS_PER_DAY;
            iFloor -= DateTimeConstants.SECONDS_PER_DAY * i10;
        } else {
            i10 = 0;
        }
        if (iFloor > 3600) {
            i11 = iFloor / 3600;
            iFloor -= i11 * 3600;
        } else {
            i11 = 0;
        }
        if (iFloor > 60) {
            int i17 = iFloor / 60;
            i12 = iFloor - (i17 * 60);
            i13 = i17;
        } else {
            i12 = iFloor;
            i13 = 0;
        }
        if (i9 != 0) {
            int iA = a(i10, 1, false, 0);
            int iA2 = iA + a(i11, 1, iA > 0, 2);
            int iA3 = iA2 + a(i13, 1, iA2 > 0, 2);
            int iA4 = iA3 + a(i12, 1, iA3 > 0, 2);
            i14 = 0;
            for (int iA5 = iA4 + a(i16, 2, true, iA4 > 0 ? 3 : 0) + 1; iA5 < i9; iA5++) {
                cArr[i14] = TokenParser.SP;
                i14++;
            }
        } else {
            i14 = 0;
        }
        cArr[i14] = c9;
        int i18 = i14 + 1;
        boolean z9 = i9 != 0;
        int iF = f(cArr, i10, 'd', i18, false, 0);
        int iF2 = f(cArr, i11, 'h', iF, iF != i18, z9 ? 2 : 0);
        int iF3 = f(cArr, i13, 'm', iF2, iF2 != i18, z9 ? 2 : 0);
        int iF4 = f(cArr, i12, 's', iF3, iF3 != i18, z9 ? 2 : 0);
        int iF5 = f(cArr, i16, 'm', iF4, true, (!z9 || iF4 == i18) ? 0 : 3);
        cArr[iF5] = 's';
        return iF5 + 1;
    }

    public static int f(char[] cArr, int i9, char c9, int i10, boolean z9, int i11) {
        int i12;
        if (!z9 && i9 <= 0) {
            return i10;
        }
        if ((!z9 || i11 < 3) && i9 <= 99) {
            i12 = i10;
        } else {
            int i13 = i9 / 100;
            cArr[i10] = (char) (i13 + 48);
            i12 = i10 + 1;
            i9 -= i13 * 100;
        }
        if ((z9 && i11 >= 2) || i9 > 9 || i10 != i12) {
            int i14 = i9 / 10;
            cArr[i12] = (char) (i14 + 48);
            i12++;
            i9 -= i14 * 10;
        }
        cArr[i12] = (char) (i9 + 48);
        cArr[i12 + 1] = c9;
        return i12 + 2;
    }
}

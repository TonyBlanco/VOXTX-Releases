package R6;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[][] f9345a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, Q6.a.f8394b.length, 8);

    static {
        int i9;
        int i10 = 0;
        while (true) {
            int[] iArr = Q6.a.f8394b;
            if (i10 >= iArr.length) {
                return;
            }
            int i11 = iArr[i10];
            int i12 = i11 & 1;
            int i13 = 0;
            while (i13 < 8) {
                float f9 = 0.0f;
                while (true) {
                    i9 = i11 & 1;
                    if (i9 == i12) {
                        f9 += 1.0f;
                        i11 >>= 1;
                    }
                }
                f9345a[i10][7 - i13] = f9 / 17.0f;
                i13++;
                i12 = i9;
            }
            i10++;
        }
    }

    public static int a(int[] iArr) {
        long j9 = 0;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            for (int i10 = 0; i10 < iArr[i9]; i10++) {
                int i11 = 1;
                long j10 = j9 << 1;
                if (i9 % 2 != 0) {
                    i11 = 0;
                }
                j9 = j10 | ((long) i11);
            }
        }
        return (int) j9;
    }

    public static int b(int[] iArr) {
        int iD = E6.a.d(iArr);
        float[] fArr = new float[8];
        if (iD > 1) {
            for (int i9 = 0; i9 < 8; i9++) {
                fArr[i9] = iArr[i9] / iD;
            }
        }
        float f9 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            float[][] fArr2 = f9345a;
            if (i11 >= fArr2.length) {
                return i10;
            }
            float[] fArr3 = fArr2[i11];
            float f10 = 0.0f;
            for (int i12 = 0; i12 < 8; i12++) {
                float f11 = fArr3[i12] - fArr[i12];
                f10 += f11 * f11;
                if (f10 >= f9) {
                    break;
                }
            }
            if (f10 < f9) {
                i10 = Q6.a.f8394b[i11];
                f9 = f10;
            }
            i11++;
        }
    }

    public static int c(int[] iArr) {
        int iA = a(iArr);
        if (Q6.a.a(iA) == -1) {
            return -1;
        }
        return iA;
    }

    public static int d(int[] iArr) {
        int iC = c(e(iArr));
        return iC != -1 ? iC : b(iArr);
    }

    public static int[] e(int[] iArr) {
        float fD = E6.a.d(iArr);
        int[] iArr2 = new int[8];
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < 17; i11++) {
            float f9 = (fD / 34.0f) + ((i11 * fD) / 17.0f);
            int i12 = iArr[i10];
            if (i9 + i12 <= f9) {
                i9 += i12;
                i10++;
            }
            iArr2[i10] = iArr2[i10] + 1;
        }
        return iArr2;
    }
}

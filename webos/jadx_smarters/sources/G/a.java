package G;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2102a = new ThreadLocal();

    public static void a(int i9, int i10, int i11, float[] fArr) {
        float f9;
        float fAbs;
        float f10 = i9 / 255.0f;
        float f11 = i10 / 255.0f;
        float f12 = i11 / 255.0f;
        float fMax = Math.max(f10, Math.max(f11, f12));
        float fMin = Math.min(f10, Math.min(f11, f12));
        float f13 = fMax - fMin;
        float f14 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f9 = 0.0f;
            fAbs = 0.0f;
        } else {
            f9 = fMax == f10 ? ((f11 - f12) / f13) % 6.0f : fMax == f11 ? ((f12 - f10) / f13) + 2.0f : 4.0f + ((f10 - f11) / f13);
            fAbs = f13 / (1.0f - Math.abs((2.0f * f14) - 1.0f));
        }
        float f15 = (f9 * 60.0f) % 360.0f;
        if (f15 < 0.0f) {
            f15 += 360.0f;
        }
        fArr[0] = l(f15, 0.0f, 360.0f);
        fArr[1] = l(fAbs, 0.0f, 1.0f);
        fArr[2] = l(f14, 0.0f, 1.0f);
    }

    public static void b(int i9, int i10, int i11, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d9 = ((double) i9) / 255.0d;
        double dPow = d9 < 0.04045d ? d9 / 12.92d : Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
        double d10 = ((double) i10) / 255.0d;
        double dPow2 = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = ((double) i11) / 255.0d;
        double dPow3 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    public static int c(double d9, double d10, double d11) {
        double d12 = (((3.2406d * d9) + ((-1.5372d) * d10)) + ((-0.4986d) * d11)) / 100.0d;
        double d13 = ((((-0.9689d) * d9) + (1.8758d * d10)) + (0.0415d * d11)) / 100.0d;
        double d14 = (((0.0557d * d9) + ((-0.204d) * d10)) + (1.057d * d11)) / 100.0d;
        return Color.rgb(m((int) Math.round((d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d) * 255.0d), 0, 255), m((int) Math.round((d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d) * 255.0d), 0, 255), m((int) Math.round((d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : 12.92d * d14) * 255.0d), 0, 255));
    }

    public static double d(int i9, int i10) {
        if (Color.alpha(i10) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i10));
        }
        if (Color.alpha(i9) < 255) {
            i9 = j(i9, i10);
        }
        double dE = e(i9) + 0.05d;
        double dE2 = e(i10) + 0.05d;
        return Math.max(dE, dE2) / Math.min(dE, dE2);
    }

    public static double e(int i9) {
        double[] dArrN = n();
        h(i9, dArrN);
        return dArrN[1] / 100.0d;
    }

    public static int f(int i9, int i10, float f9) {
        int i11 = 255;
        if (Color.alpha(i10) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i10));
        }
        double d9 = f9;
        if (d(o(i9, 255), i10) < d9) {
            return -1;
        }
        int i12 = 0;
        for (int i13 = 0; i13 <= 10 && i11 - i12 > 1; i13++) {
            int i14 = (i12 + i11) / 2;
            if (d(o(i9, i14), i10) < d9) {
                i12 = i14;
            } else {
                i11 = i14;
            }
        }
        return i11;
    }

    public static void g(int i9, float[] fArr) {
        a(Color.red(i9), Color.green(i9), Color.blue(i9), fArr);
    }

    public static void h(int i9, double[] dArr) {
        b(Color.red(i9), Color.green(i9), Color.blue(i9), dArr);
    }

    public static int i(int i9, int i10) {
        return 255 - (((255 - i10) * (255 - i9)) / 255);
    }

    public static int j(int i9, int i10) {
        int iAlpha = Color.alpha(i10);
        int iAlpha2 = Color.alpha(i9);
        int i11 = i(iAlpha2, iAlpha);
        return Color.argb(i11, k(Color.red(i9), iAlpha2, Color.red(i10), iAlpha, i11), k(Color.green(i9), iAlpha2, Color.green(i10), iAlpha, i11), k(Color.blue(i9), iAlpha2, Color.blue(i10), iAlpha, i11));
    }

    public static int k(int i9, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        return (((i9 * 255) * i10) + ((i11 * i12) * (255 - i10))) / (i13 * 255);
    }

    public static float l(float f9, float f10, float f11) {
        return f9 < f10 ? f10 : Math.min(f9, f11);
    }

    public static int m(int i9, int i10, int i11) {
        return i9 < i10 ? i10 : Math.min(i9, i11);
    }

    public static double[] n() {
        ThreadLocal threadLocal = f2102a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    public static int o(int i9, int i10) {
        if (i10 < 0 || i10 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i9 & 16777215) | (i10 << 24);
    }
}

package N6;

import M6.k;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f5356b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f5359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f5360f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f5355a = new int[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f5357c = new float[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f5358d = new float[4];

    public a() {
        int[] iArr = new int[8];
        this.f5356b = iArr;
        this.f5359e = new int[iArr.length / 2];
        this.f5360f = new int[iArr.length / 2];
    }

    public static void h(int[] iArr, float[] fArr) {
        int i9 = 0;
        float f9 = fArr[0];
        for (int i10 = 1; i10 < iArr.length; i10++) {
            float f10 = fArr[i10];
            if (f10 < f9) {
                i9 = i10;
                f9 = f10;
            }
        }
        iArr[i9] = iArr[i9] - 1;
    }

    public static void o(int[] iArr, float[] fArr) {
        int i9 = 0;
        float f9 = fArr[0];
        for (int i10 = 1; i10 < iArr.length; i10++) {
            float f10 = fArr[i10];
            if (f10 > f9) {
                i9 = i10;
                f9 = f10;
            }
        }
        iArr[i9] = iArr[i9] + 1;
    }

    public static boolean p(int[] iArr) {
        float f9 = (iArr[0] + iArr[1]) / ((iArr[2] + r1) + iArr[3]);
        if (f9 >= 0.7916667f && f9 <= 0.89285713f) {
            int i9 = a.e.API_PRIORITY_OTHER;
            int i10 = Integer.MIN_VALUE;
            for (int i11 : iArr) {
                if (i11 > i10) {
                    i10 = i11;
                }
                if (i11 < i9) {
                    i9 = i11;
                }
            }
            if (i10 < i9 * 10) {
                return true;
            }
        }
        return false;
    }

    public static int q(int[] iArr, int[][] iArr2) throws x6.k {
        for (int i9 = 0; i9 < iArr2.length; i9++) {
            if (k.e(iArr, iArr2[i9], 0.45f) < 0.2f) {
                return i9;
            }
        }
        throw x6.k.a();
    }

    public final int[] i() {
        return this.f5356b;
    }

    public final int[] j() {
        return this.f5355a;
    }

    public final int[] k() {
        return this.f5360f;
    }

    public final float[] l() {
        return this.f5358d;
    }

    public final int[] m() {
        return this.f5359e;
    }

    public final float[] n() {
        return this.f5357c;
    }
}

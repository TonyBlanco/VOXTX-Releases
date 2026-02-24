package F;

import android.graphics.Color;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[][] f1750a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[][] f1751b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f1752c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[][] f1753d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static int a(float f9) {
        if (f9 < 1.0f) {
            return DefaultRenderer.BACKGROUND_COLOR;
        }
        if (f9 > 99.0f) {
            return -1;
        }
        float f10 = (f9 + 16.0f) / 116.0f;
        float f11 = f9 > 8.0f ? f10 * f10 * f10 : f9 / 903.2963f;
        float f12 = f10 * f10 * f10;
        boolean z9 = f12 > 0.008856452f;
        float f13 = z9 ? f12 : ((f10 * 116.0f) - 16.0f) / 903.2963f;
        if (!z9) {
            f12 = ((f10 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f1752c;
        return G.a.c(f13 * fArr[0], f11 * fArr[1], f12 * fArr[2]);
    }

    public static float b(int i9) {
        return c(g(i9));
    }

    public static float c(float f9) {
        float f10 = f9 / 100.0f;
        return f10 <= 0.008856452f ? f10 * 903.2963f : (((float) Math.cbrt(f10)) * 116.0f) - 16.0f;
    }

    public static float d(float f9, float f10, float f11) {
        return f9 + ((f10 - f9) * f11);
    }

    public static float e(int i9) {
        float f9 = i9 / 255.0f;
        return (f9 <= 0.04045f ? f9 / 12.92f : (float) Math.pow((f9 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static float[] f(int i9) {
        float fE = e(Color.red(i9));
        float fE2 = e(Color.green(i9));
        float fE3 = e(Color.blue(i9));
        float[][] fArr = f1753d;
        float[] fArr2 = fArr[0];
        float f9 = (fArr2[0] * fE) + (fArr2[1] * fE2) + (fArr2[2] * fE3);
        float[] fArr3 = fArr[1];
        float f10 = (fArr3[0] * fE) + (fArr3[1] * fE2) + (fArr3[2] * fE3);
        float[] fArr4 = fArr[2];
        return new float[]{f9, f10, (fE * fArr4[0]) + (fE2 * fArr4[1]) + (fE3 * fArr4[2])};
    }

    public static float g(int i9) {
        float fE = e(Color.red(i9));
        float fE2 = e(Color.green(i9));
        float fE3 = e(Color.blue(i9));
        float[] fArr = f1753d[1];
        return (fE * fArr[0]) + (fE2 * fArr[1]) + (fE3 * fArr[2]);
    }

    public static float h(float f9) {
        return (f9 > 8.0f ? (float) Math.pow((((double) f9) + 16.0d) / 116.0d, 3.0d) : f9 / 903.2963f) * 100.0f;
    }
}

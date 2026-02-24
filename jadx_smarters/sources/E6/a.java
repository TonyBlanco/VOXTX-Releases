package E6;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static float a(float f9, float f10, float f11, float f12) {
        double d9 = f9 - f11;
        double d10 = f10 - f12;
        return (float) Math.sqrt((d9 * d9) + (d10 * d10));
    }

    public static float b(int i9, int i10, int i11, int i12) {
        double d9 = i9 - i11;
        double d10 = i10 - i12;
        return (float) Math.sqrt((d9 * d9) + (d10 * d10));
    }

    public static int c(float f9) {
        return (int) (f9 + (f9 < 0.0f ? -0.5f : 0.5f));
    }

    public static int d(int[] iArr) {
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += i10;
        }
        return i9;
    }
}

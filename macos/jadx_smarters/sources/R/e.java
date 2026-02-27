package r;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f49626a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f9, float f10, boolean z9) {
        return z9 ? (float) (((double) f9) + ((1.0d - f49626a) * ((double) f10))) : f9;
    }

    public static float b(float f9, float f10, boolean z9) {
        float f11 = f9 * 1.5f;
        return z9 ? (float) (((double) f11) + ((1.0d - f49626a) * ((double) f10))) : f11;
    }
}

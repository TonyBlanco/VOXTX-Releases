package G;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final Matrix a(float f9, float f10) {
        Matrix matrix = new Matrix();
        matrix.setScale(f9, f10);
        return matrix;
    }

    public static final Matrix b(float f9, float f10) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(f9, f10);
        return matrix;
    }
}

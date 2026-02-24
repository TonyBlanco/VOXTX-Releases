package S4;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f9416a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f9417b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f9418c = new Matrix();

    public Matrix a(float f9, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f9416a);
        matrix2.getValues(this.f9417b);
        for (int i9 = 0; i9 < 9; i9++) {
            float[] fArr = this.f9417b;
            float f10 = fArr[i9];
            float f11 = this.f9416a[i9];
            fArr[i9] = f11 + ((f10 - f11) * f9);
        }
        this.f9418c.setValues(this.f9417b);
        return this.f9418c;
    }
}

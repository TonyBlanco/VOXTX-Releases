package K0;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class G extends D {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f3419f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f3420g = true;

    @Override // K0.M
    public void h(View view, Matrix matrix) {
        if (f3419f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f3419f = false;
            }
        }
    }

    @Override // K0.M
    public void i(View view, Matrix matrix) {
        if (f3420g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f3420g = false;
            }
        }
    }
}

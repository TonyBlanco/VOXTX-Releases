package K0;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class L extends K {
    @Override // K0.D, K0.M
    public float c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // K0.I, K0.M
    public void e(View view, int i9, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i9, i10, i11, i12);
    }

    @Override // K0.D, K0.M
    public void f(View view, float f9) {
        view.setTransitionAlpha(f9);
    }

    @Override // K0.K, K0.M
    public void g(View view, int i9) {
        view.setTransitionVisibility(i9);
    }

    @Override // K0.G, K0.M
    public void h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // K0.G, K0.M
    public void i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}

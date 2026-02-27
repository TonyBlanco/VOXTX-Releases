package y2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import v2.C2873d;
import x2.AbstractC2954c;

/* JADX INFO: loaded from: classes.dex */
public class o extends x2.g {

    public class a extends AbstractC2954c {
        public a() {
            E(0.4f);
        }

        @Override // x2.f
        public ValueAnimator r() {
            Float fValueOf = Float.valueOf(0.4f);
            float[] fArr = {0.0f, 0.2f, 0.4f, 1.0f};
            return new C2873d(this).m(fArr, fValueOf, Float.valueOf(1.0f), fValueOf, fValueOf).c(1200L).d(fArr).b();
        }
    }

    @Override // x2.g
    public x2.f[] O() {
        a[] aVarArr = new a[5];
        for (int i9 = 0; i9 < 5; i9++) {
            a aVar = new a();
            aVarArr[i9] = aVar;
            aVar.t(Build.VERSION.SDK_INT >= 24 ? (i9 * 100) + 600 : (i9 * 100) - 1200);
        }
        return aVarArr;
    }

    @Override // x2.g, x2.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = a(rect);
        int iWidth = rectA.width() / L();
        int iWidth2 = ((rectA.width() / 5) * 3) / 5;
        for (int i9 = 0; i9 < L(); i9++) {
            x2.f fVarK = K(i9);
            int i10 = rectA.left + (i9 * iWidth) + (iWidth / 5);
            fVarK.v(i10, rectA.top, i10 + iWidth2, rectA.bottom);
        }
    }
}

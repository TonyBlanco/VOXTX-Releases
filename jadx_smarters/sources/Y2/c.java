package y2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import v2.C2873d;
import x2.AbstractC2954c;

/* JADX INFO: loaded from: classes.dex */
public class c extends x2.g {

    public class b extends AbstractC2954c {
        public b() {
        }

        @Override // x2.f
        public ValueAnimator r() {
            Float fValueOf = Float.valueOf(1.0f);
            float[] fArr = {0.0f, 0.35f, 0.7f, 1.0f};
            return new C2873d(this).l(fArr, fValueOf, Float.valueOf(0.0f), fValueOf, fValueOf).c(1300L).d(fArr).b();
        }
    }

    @Override // x2.g
    public x2.f[] O() {
        int[] iArr = {200, 300, 400, 100, 200, 300, 0, 100, 200};
        b[] bVarArr = new b[9];
        for (int i9 = 0; i9 < 9; i9++) {
            b bVar = new b();
            bVarArr[i9] = bVar;
            bVar.t(iArr[i9]);
        }
        return bVarArr;
    }

    @Override // x2.g, x2.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = a(rect);
        int iWidth = (int) (rectA.width() * 0.33f);
        int iHeight = (int) (rectA.height() * 0.33f);
        for (int i9 = 0; i9 < L(); i9++) {
            int i10 = rectA.left + ((i9 % 3) * iWidth);
            int i11 = rectA.top + ((i9 / 3) * iHeight);
            K(i9).v(i10, i11, i10 + iWidth, i11 + iHeight);
        }
    }
}

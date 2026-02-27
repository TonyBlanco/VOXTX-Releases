package y2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import v2.C2873d;
import x2.AbstractC2953b;

/* JADX INFO: loaded from: classes.dex */
public class m extends x2.g {

    public class a extends AbstractC2953b {
        public a() {
            C(0.0f);
        }

        @Override // x2.f
        public ValueAnimator r() {
            Float fValueOf = Float.valueOf(0.0f);
            float[] fArr = {0.0f, 0.4f, 0.8f, 1.0f};
            return new C2873d(this).l(fArr, fValueOf, Float.valueOf(1.0f), fValueOf, fValueOf).c(1400L).d(fArr).b();
        }
    }

    @Override // x2.g
    public void N(x2.f... fVarArr) {
        super.N(fVarArr);
        fVarArr[1].t(160);
        fVarArr[2].t(320);
    }

    @Override // x2.g
    public x2.f[] O() {
        return new x2.f[]{new a(), new a(), new a()};
    }

    @Override // x2.g, x2.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = a(rect);
        int iWidth = rectA.width() / 8;
        int iCenterY = rectA.centerY() - iWidth;
        int iCenterY2 = rectA.centerY() + iWidth;
        for (int i9 = 0; i9 < L(); i9++) {
            int iWidth2 = ((rectA.width() * i9) / 3) + rectA.left;
            K(i9).v(iWidth2, iCenterY, (iWidth * 2) + iWidth2, iCenterY2);
        }
    }
}

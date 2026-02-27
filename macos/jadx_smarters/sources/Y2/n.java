package y2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import v2.C2873d;
import x2.AbstractC2954c;

/* JADX INFO: loaded from: classes.dex */
public class n extends x2.g {

    public class a extends AbstractC2954c {

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f52140I;

        public a(int i9) {
            this.f52140I = i9;
        }

        @Override // x2.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.25f, 0.5f, 0.51f, 0.75f, 1.0f};
            C2873d c2873dI = new C2873d(this).i(fArr, 0, -90, -179, -180, -270, -360);
            Float fValueOf = Float.valueOf(0.0f);
            Float fValueOf2 = Float.valueOf(0.75f);
            C2873d c2873dP = c2873dI.o(fArr, fValueOf, fValueOf2, fValueOf2, fValueOf2, fValueOf, fValueOf).p(fArr, fValueOf, fValueOf, fValueOf2, fValueOf2, fValueOf2, fValueOf);
            Float fValueOf3 = Float.valueOf(1.0f);
            Float fValueOf4 = Float.valueOf(0.5f);
            C2873d c2873dD = c2873dP.l(fArr, fValueOf3, fValueOf4, fValueOf3, fValueOf3, fValueOf4, fValueOf3).c(1800L).d(fArr);
            if (Build.VERSION.SDK_INT >= 24) {
                c2873dD.n(this.f52140I);
            }
            return c2873dD.b();
        }
    }

    @Override // x2.g
    public void N(x2.f... fVarArr) {
        super.N(fVarArr);
        if (Build.VERSION.SDK_INT < 24) {
            fVarArr[1].t(-900);
        }
    }

    @Override // x2.g
    public x2.f[] O() {
        return new x2.f[]{new a(0), new a(3)};
    }

    @Override // x2.g, x2.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Rect rectA = a(rect);
        super.onBoundsChange(rectA);
        for (int i9 = 0; i9 < L(); i9++) {
            x2.f fVarK = K(i9);
            int i10 = rectA.left;
            fVarK.v(i10, rectA.top, (rectA.width() / 4) + i10, rectA.top + (rectA.height() / 4));
        }
    }
}

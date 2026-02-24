package y2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.view.animation.LinearInterpolator;
import v2.C2873d;
import x2.AbstractC2953b;

/* JADX INFO: renamed from: y2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2983a extends x2.g {

    /* JADX INFO: renamed from: y2.a$a, reason: collision with other inner class name */
    public class C0484a extends AbstractC2953b {
        public C0484a() {
            C(0.0f);
        }

        @Override // x2.f
        public ValueAnimator r() {
            Float fValueOf = Float.valueOf(0.0f);
            float[] fArr = {0.0f, 0.5f, 1.0f};
            return new C2873d(this).l(fArr, fValueOf, Float.valueOf(1.0f), fValueOf).c(2000L).d(fArr).b();
        }
    }

    @Override // x2.g
    public void N(x2.f... fVarArr) {
        x2.f fVar;
        int i9;
        super.N(fVarArr);
        if (Build.VERSION.SDK_INT >= 24) {
            fVar = fVarArr[1];
            i9 = 1000;
        } else {
            fVar = fVarArr[1];
            i9 = -1000;
        }
        fVar.t(i9);
    }

    @Override // x2.g
    public x2.f[] O() {
        return new x2.f[]{new C0484a(), new C0484a()};
    }

    @Override // x2.g, x2.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = a(rect);
        int iWidth = (int) (rectA.width() * 0.6f);
        x2.f fVarK = K(0);
        int i9 = rectA.right;
        int i10 = rectA.top;
        fVarK.v(i9 - iWidth, i10, i9, i10 + iWidth);
        x2.f fVarK2 = K(1);
        int i11 = rectA.right;
        int i12 = rectA.bottom;
        fVarK2.v(i11 - iWidth, i12 - iWidth, i11, i12);
    }

    @Override // x2.g, x2.f
    public ValueAnimator r() {
        return new C2873d(this).i(new float[]{0.0f, 1.0f}, 0, 360).c(2000L).h(new LinearInterpolator()).b();
    }
}

package y2;

import android.animation.ValueAnimator;
import android.os.Build;
import v2.C2873d;
import x2.AbstractC2953b;

/* JADX INFO: loaded from: classes.dex */
public class d extends x2.g {

    public class a extends AbstractC2953b {
        public a() {
            setAlpha(153);
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
        return new x2.f[]{new a(), new a()};
    }
}

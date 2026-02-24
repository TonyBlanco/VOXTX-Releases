package y2;

import android.animation.ValueAnimator;
import android.os.Build;
import v2.C2873d;
import x2.AbstractC2952a;
import x2.AbstractC2953b;

/* JADX INFO: loaded from: classes.dex */
public class e extends AbstractC2952a {

    public class a extends AbstractC2953b {
        public a() {
            setAlpha(0);
        }

        @Override // x2.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.39f, 0.4f, 1.0f};
            return new C2873d(this).a(fArr, 0, 0, 255, 0).c(1200L).d(fArr).b();
        }
    }

    @Override // x2.g
    public x2.f[] O() {
        a[] aVarArr = new a[12];
        for (int i9 = 0; i9 < 12; i9++) {
            a aVar = new a();
            aVarArr[i9] = aVar;
            aVar.t(Build.VERSION.SDK_INT >= 24 ? i9 * 100 : (i9 * 100) - 1200);
        }
        return aVarArr;
    }
}

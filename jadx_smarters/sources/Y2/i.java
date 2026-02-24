package y2;

import android.animation.ValueAnimator;
import v2.C2873d;
import x2.AbstractC2953b;

/* JADX INFO: loaded from: classes.dex */
public class i extends AbstractC2953b {
    public i() {
        C(0.0f);
    }

    @Override // x2.f
    public ValueAnimator r() {
        float[] fArr = {0.0f, 1.0f};
        return new C2873d(this).l(fArr, Float.valueOf(0.0f), Float.valueOf(1.0f)).a(fArr, 255, 0).c(1000L).d(fArr).b();
    }
}

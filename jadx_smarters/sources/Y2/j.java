package y2;

import android.animation.ValueAnimator;
import v2.C2873d;
import w2.InterpolatorC2904b;

/* JADX INFO: loaded from: classes.dex */
public class j extends x2.d {
    public j() {
        C(0.0f);
    }

    @Override // x2.f
    public ValueAnimator r() {
        Float fValueOf = Float.valueOf(1.0f);
        float[] fArr = {0.0f, 0.7f, 1.0f};
        return new C2873d(this).l(fArr, Float.valueOf(0.0f), fValueOf, fValueOf).a(fArr, 255, 178, 0).c(1000L).h(InterpolatorC2904b.b(0.21f, 0.53f, 0.56f, 0.8f, fArr)).b();
    }
}

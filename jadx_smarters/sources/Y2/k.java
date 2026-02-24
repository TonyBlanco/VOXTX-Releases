package y2;

import android.animation.ValueAnimator;
import v2.C2873d;
import x2.AbstractC2953b;

/* JADX INFO: loaded from: classes.dex */
public class k extends AbstractC2953b {
    @Override // x2.f
    public ValueAnimator r() {
        float[] fArr = {0.0f, 0.5f, 1.0f};
        return new C2873d(this).j(fArr, 0, -180, -180).k(fArr, 0, 0, -180).c(1200L).d(fArr).b();
    }
}

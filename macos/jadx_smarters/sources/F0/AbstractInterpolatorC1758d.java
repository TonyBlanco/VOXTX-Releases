package f0;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: f0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractInterpolatorC1758d implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f40552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f40553b;

    public AbstractInterpolatorC1758d(float[] fArr) {
        this.f40552a = fArr;
        this.f40553b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f9) {
        if (f9 >= 1.0f) {
            return 1.0f;
        }
        if (f9 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f40552a;
        int iMin = Math.min((int) ((fArr.length - 1) * f9), fArr.length - 2);
        float f10 = this.f40553b;
        float f11 = (f9 - (iMin * f10)) / f10;
        float[] fArr2 = this.f40552a;
        float f12 = fArr2[iMin];
        return f12 + (f11 * (fArr2[iMin + 1] - f12));
    }
}

package w2;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: w2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class InterpolatorC2904b implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TimeInterpolator f51594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f51595b;

    public InterpolatorC2904b(TimeInterpolator timeInterpolator, float... fArr) {
        this.f51594a = timeInterpolator;
        this.f51595b = fArr;
    }

    public static InterpolatorC2904b a(float... fArr) {
        InterpolatorC2904b interpolatorC2904b = new InterpolatorC2904b(AbstractC2903a.a(), new float[0]);
        interpolatorC2904b.c(fArr);
        return interpolatorC2904b;
    }

    public static InterpolatorC2904b b(float f9, float f10, float f11, float f12, float... fArr) {
        InterpolatorC2904b interpolatorC2904b = new InterpolatorC2904b(AbstractC2905c.a(f9, f10, f11, f12), new float[0]);
        interpolatorC2904b.c(fArr);
        return interpolatorC2904b;
    }

    public void c(float... fArr) {
        this.f51595b = fArr;
    }

    @Override // android.animation.TimeInterpolator
    public synchronized float getInterpolation(float f9) {
        if (this.f51595b.length > 1) {
            int i9 = 0;
            while (true) {
                float[] fArr = this.f51595b;
                if (i9 >= fArr.length - 1) {
                    break;
                }
                float f10 = fArr[i9];
                i9++;
                float f11 = fArr[i9];
                float f12 = f11 - f10;
                if (f9 >= f10 && f9 <= f11) {
                    return f10 + (this.f51594a.getInterpolation((f9 - f10) / f12) * f12);
                }
            }
        }
        return this.f51594a.getInterpolation(f9);
    }
}

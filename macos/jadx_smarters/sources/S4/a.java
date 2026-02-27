package S4;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import f0.C1755a;
import f0.C1756b;
import f0.C1757c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeInterpolator f9409a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f9410b = new C1756b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TimeInterpolator f9411c = new C1755a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TimeInterpolator f9412d = new C1757c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TimeInterpolator f9413e = new DecelerateInterpolator();

    public static float a(float f9, float f10, float f11) {
        return f9 + (f11 * (f10 - f9));
    }

    public static float b(float f9, float f10, float f11, float f12, float f13) {
        return f13 < f11 ? f9 : f13 > f12 ? f10 : a(f9, f10, (f13 - f11) / (f12 - f11));
    }

    public static int c(int i9, int i10, float f9) {
        return i9 + Math.round(f9 * (i10 - i9));
    }
}

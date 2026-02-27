package R;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: R.a$a, reason: collision with other inner class name */
    public static class C0112a {
        public static PathInterpolator a(float f9, float f10) {
            return new PathInterpolator(f9, f10);
        }

        public static PathInterpolator b(float f9, float f10, float f11, float f12) {
            return new PathInterpolator(f9, f10, f11, f12);
        }

        public static PathInterpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f9, float f10, float f11, float f12) {
        return C0112a.b(f9, f10, f11, f12);
    }

    public static Interpolator b(Path path) {
        return C0112a.c(path);
    }
}

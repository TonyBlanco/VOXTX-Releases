package K0;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class D extends M {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f3418e = true;

    @Override // K0.M
    public void a(View view) {
    }

    @Override // K0.M
    public float c(View view) {
        if (f3418e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f3418e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // K0.M
    public void d(View view) {
    }

    @Override // K0.M
    public void f(View view, float f9) {
        if (f3418e) {
            try {
                view.setTransitionAlpha(f9);
                return;
            } catch (NoSuchMethodError unused) {
                f3418e = false;
            }
        }
        view.setAlpha(f9);
    }
}

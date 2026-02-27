package K0;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class K extends I {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f3422i = true;

    @Override // K0.M
    public void g(View view, int i9) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g(view, i9);
        } else if (f3422i) {
            try {
                view.setTransitionVisibility(i9);
            } catch (NoSuchMethodError unused) {
                f3422i = false;
            }
        }
    }
}

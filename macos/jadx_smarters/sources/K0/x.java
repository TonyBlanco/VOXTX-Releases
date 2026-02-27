package K0;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f3576a = true;

    public static v a(ViewGroup viewGroup) {
        return new u(viewGroup);
    }

    public static void b(ViewGroup viewGroup, boolean z9) {
        if (f3576a) {
            try {
                viewGroup.suppressLayout(z9);
            } catch (NoSuchMethodError unused) {
                f3576a = false;
            }
        }
    }

    public static void c(ViewGroup viewGroup, boolean z9) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z9);
        } else {
            b(viewGroup, z9);
        }
    }
}

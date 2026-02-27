package androidx.navigation;

import D.AbstractC0519b;
import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static NavController a(Activity activity, int i9) {
        NavController navControllerC = c(AbstractC0519b.i(activity, i9));
        if (navControllerC != null) {
            return navControllerC;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i9);
    }

    public static NavController b(View view) {
        NavController navControllerC = c(view);
        if (navControllerC != null) {
            return navControllerC;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static NavController c(View view) {
        while (view != null) {
            NavController navControllerD = d(view);
            if (navControllerD != null) {
                return navControllerD;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static NavController d(View view) {
        Object tag = view.getTag(u.f16456a);
        if (tag instanceof WeakReference) {
            tag = ((WeakReference) tag).get();
        } else if (!(tag instanceof NavController)) {
            return null;
        }
        return (NavController) tag;
    }

    public static void e(View view, NavController navController) {
        view.setTag(u.f16456a, navController);
    }
}

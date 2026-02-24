package f5;

import P.W;
import P.w0;
import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static void a(Window window, boolean z9, Integer num, Integer num2) {
        boolean z10 = num == null || num.intValue() == 0;
        boolean z11 = num2 == null || num2.intValue() == 0;
        if (z10 || z11) {
            int iB = Z4.a.b(window.getContext(), R.attr.colorBackground, DefaultRenderer.BACKGROUND_COLOR);
            if (z10) {
                num = Integer.valueOf(iB);
            }
            if (z11) {
                num2 = Integer.valueOf(iB);
            }
        }
        W.b(window, !z9);
        int iC = c(window.getContext(), z9);
        int iB2 = b(window.getContext(), z9);
        window.setStatusBarColor(iC);
        window.setNavigationBarColor(iB2);
        boolean zD = d(iC, Z4.a.f(num.intValue()));
        boolean zD2 = d(iB2, Z4.a.f(num2.intValue()));
        w0 w0VarA = W.a(window, window.getDecorView());
        if (w0VarA != null) {
            w0VarA.b(zD);
            w0VarA.a(zD2);
        }
    }

    public static int b(Context context, boolean z9) {
        if (z9 && Build.VERSION.SDK_INT < 27) {
            return G.a.o(Z4.a.b(context, R.attr.navigationBarColor, DefaultRenderer.BACKGROUND_COLOR), 128);
        }
        if (z9) {
            return 0;
        }
        return Z4.a.b(context, R.attr.navigationBarColor, DefaultRenderer.BACKGROUND_COLOR);
    }

    public static int c(Context context, boolean z9) {
        if (z9 && Build.VERSION.SDK_INT < 23) {
            return G.a.o(Z4.a.b(context, R.attr.statusBarColor, DefaultRenderer.BACKGROUND_COLOR), 128);
        }
        if (z9) {
            return 0;
        }
        return Z4.a.b(context, R.attr.statusBarColor, DefaultRenderer.BACKGROUND_COLOR);
    }

    public static boolean d(int i9, boolean z9) {
        return Z4.a.f(i9) || (i9 == 0 && z9);
    }
}

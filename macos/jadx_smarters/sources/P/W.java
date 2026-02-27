package P;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {

    public static class a {
        public static void a(Window window, boolean z9) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z9 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static class b {
        public static void a(Window window, boolean z9) {
            window.setDecorFitsSystemWindows(z9);
        }
    }

    public static w0 a(Window window, View view) {
        return new w0(window, view);
    }

    public static void b(Window window, boolean z9) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z9);
        } else {
            a.a(window, z9);
        }
    }
}

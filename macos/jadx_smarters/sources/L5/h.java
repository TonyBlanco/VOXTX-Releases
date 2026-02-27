package l5;

import android.graphics.drawable.Drawable;
import android.view.View;
import f5.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static AbstractC2195d a(int i9) {
        return i9 != 0 ? i9 != 1 ? b() : new C2196e() : new j();
    }

    public static AbstractC2195d b() {
        return new j();
    }

    public static C2197f c() {
        return new C2197f();
    }

    public static void d(View view, float f9) {
        Drawable background = view.getBackground();
        if (background instanceof C2198g) {
            ((C2198g) background).V(f9);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C2198g) {
            f(view, (C2198g) background);
        }
    }

    public static void f(View view, C2198g c2198g) {
        if (c2198g.N()) {
            c2198g.Z(w.d(view));
        }
    }
}

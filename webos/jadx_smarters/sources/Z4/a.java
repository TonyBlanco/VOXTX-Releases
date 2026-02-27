package Z4;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import i5.AbstractC1892b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static int a(int i9, int i10) {
        return G.a.o(i9, (Color.alpha(i9) * i10) / 255);
    }

    public static int b(Context context, int i9, int i10) {
        TypedValue typedValueA = AbstractC1892b.a(context, i9);
        return typedValueA != null ? typedValueA.data : i10;
    }

    public static int c(Context context, int i9, String str) {
        return AbstractC1892b.d(context, i9, str);
    }

    public static int d(View view, int i9) {
        return AbstractC1892b.e(view, i9);
    }

    public static int e(View view, int i9, int i10) {
        return b(view.getContext(), i9, i10);
    }

    public static boolean f(int i9) {
        return i9 != 0 && G.a.e(i9) > 0.5d;
    }

    public static int g(int i9, int i10) {
        return G.a.j(i10, i9);
    }

    public static int h(int i9, int i10, float f9) {
        return g(i9, G.a.o(i10, Math.round(Color.alpha(i10) * f9)));
    }

    public static int i(View view, int i9, int i10, float f9) {
        return h(d(view, i9), d(view, i10), f9);
    }
}

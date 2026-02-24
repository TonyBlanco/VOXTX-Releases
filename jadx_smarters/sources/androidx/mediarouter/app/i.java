package androidx.mediarouter.app;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ProgressBar;
import c.AbstractC1238a;
import e.AbstractC1726a;
import t0.AbstractC2758a;
import t0.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f16286a = t0.c.f50494g;

    public static Context a(Context context) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, l(context));
        int iP = p(contextThemeWrapper, AbstractC2758a.f50485h);
        return iP != 0 ? new ContextThemeWrapper(contextThemeWrapper, iP) : contextThemeWrapper;
    }

    public static Context b(Context context, int i9, boolean z9) {
        if (i9 == 0) {
            i9 = p(context, !z9 ? AbstractC1238a.f17766y : AbstractC1238a.f17753l);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i9);
        return p(contextThemeWrapper, AbstractC2758a.f50485h) != 0 ? new ContextThemeWrapper(contextThemeWrapper, l(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static int c(Context context) {
        int iP = p(context, AbstractC2758a.f50485h);
        return iP == 0 ? l(context) : iP;
    }

    public static int d(Context context) {
        int iO = o(context, 0, AbstractC1238a.f17763v);
        return G.a.d(iO, o(context, 0, R.attr.colorBackground)) < 3.0d ? o(context, 0, AbstractC1238a.f17758q) : iO;
    }

    public static Drawable e(Context context) {
        return j(context, t0.e.f50504a);
    }

    public static int f(Context context, int i9) {
        return G.a.d(-1, o(context, i9, AbstractC1238a.f17763v)) >= 3.0d ? -1 : -570425344;
    }

    public static Drawable g(Context context) {
        return i(context, AbstractC2758a.f50479b);
    }

    public static float h(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Drawable i(Context context, int i9) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i9});
        Drawable drawableR = H.a.r(AbstractC1726a.b(context, typedArrayObtainStyledAttributes.getResourceId(0, 0)));
        if (r(context)) {
            H.a.n(drawableR, E.b.getColor(context, f16286a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return drawableR;
    }

    public static Drawable j(Context context, int i9) {
        Drawable drawableR = H.a.r(AbstractC1726a.b(context, i9));
        if (r(context)) {
            H.a.n(drawableR, E.b.getColor(context, f16286a));
        }
        return drawableR;
    }

    public static Drawable k(Context context) {
        return j(context, t0.e.f50505b);
    }

    public static int l(Context context) {
        boolean zR = r(context);
        int iF = f(context, 0);
        return zR ? iF == -570425344 ? k.f50599b : k.f50601d : iF == -570425344 ? k.f50600c : k.f50598a;
    }

    public static Drawable m(Context context) {
        return i(context, AbstractC2758a.f50483f);
    }

    public static Drawable n(Context context) {
        return i(context, AbstractC2758a.f50482e);
    }

    public static int o(Context context, int i9, int i10) {
        if (i9 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i9, new int[]{i10});
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    public static int p(Context context, int i9) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i9, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static Drawable q(Context context) {
        return i(context, AbstractC2758a.f50486i);
    }

    public static boolean r(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(AbstractC1238a.f17727D, typedValue, true) && typedValue.data != 0;
    }

    public static void s(Context context, Dialog dialog) {
        dialog.getWindow().getDecorView().setBackgroundColor(E.b.getColor(context, r(context) ? t0.c.f50493f : t0.c.f50492e));
    }

    public static void t(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(E.b.getColor(context, r(context) ? t0.c.f50491d : t0.c.f50490c), PorterDuff.Mode.SRC_IN);
        }
    }

    public static void u(Context context, View view, View view2, boolean z9) {
        int iO = o(context, 0, AbstractC1238a.f17763v);
        int iO2 = o(context, 0, AbstractC1238a.f17764w);
        if (z9 && f(context, 0) == -570425344) {
            iO2 = iO;
            iO = -1;
        }
        view.setBackgroundColor(iO);
        view2.setBackgroundColor(iO2);
        view.setTag(Integer.valueOf(iO));
        view2.setTag(Integer.valueOf(iO2));
    }

    public static void v(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        int color;
        int i9;
        if (r(context)) {
            color = E.b.getColor(context, t0.c.f50491d);
            i9 = t0.c.f50489b;
        } else {
            color = E.b.getColor(context, t0.c.f50490c);
            i9 = t0.c.f50488a;
        }
        mediaRouteVolumeSlider.b(color, E.b.getColor(context, i9));
    }

    public static void w(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int iF = f(context, 0);
        if (Color.alpha(iF) != 255) {
            iF = G.a.j(iF, ((Integer) view.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(iF);
    }
}

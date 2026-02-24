package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f43272a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f43273b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f43274c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f43275d = {R.attr.state_activated};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f43276e = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f43277f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f43278g = {R.attr.state_selected};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f43279h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f43280i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f43281j = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(c.j.f18169y0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(c.j.f17932D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i9) {
        ColorStateList colorStateListE = e(context, i9);
        if (colorStateListE != null && colorStateListE.isStateful()) {
            return colorStateListE.getColorForState(f43273b, colorStateListE.getDefaultColor());
        }
        TypedValue typedValueF = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueF, true);
        return d(context, i9, typedValueF.getFloat());
    }

    public static int c(Context context, int i9) {
        int[] iArr = f43281j;
        iArr[0] = i9;
        d0 d0VarU = d0.u(context, null, iArr);
        try {
            return d0VarU.b(0, 0);
        } finally {
            d0VarU.w();
        }
    }

    public static int d(Context context, int i9, float f9) {
        return G.a.o(c(context, i9), Math.round(Color.alpha(r0) * f9));
    }

    public static ColorStateList e(Context context, int i9) {
        int[] iArr = f43281j;
        iArr[0] = i9;
        d0 d0VarU = d0.u(context, null, iArr);
        try {
            return d0VarU.c(0);
        } finally {
            d0VarU.w();
        }
    }

    public static TypedValue f() {
        ThreadLocal threadLocal = f43272a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}

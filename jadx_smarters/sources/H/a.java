package H;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f2369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f2370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f2371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f2372d;

    /* JADX INFO: renamed from: H.a$a, reason: collision with other inner class name */
    public static class C0041a {
        public static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        public static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i9) {
            return drawableContainerState.getChild(i9);
        }

        public static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        public static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        public static void e(Drawable drawable, boolean z9) {
            drawable.setAutoMirrored(z9);
        }
    }

    public static class b {
        public static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        public static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        public static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        public static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        public static void e(Drawable drawable, float f9, float f10) {
            drawable.setHotspot(f9, f10);
        }

        public static void f(Drawable drawable, int i9, int i10, int i11, int i12) {
            drawable.setHotspotBounds(i9, i10, i11, i12);
        }

        public static void g(Drawable drawable, int i9) {
            drawable.setTint(i9);
        }

        public static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        public static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    public static class c {
        public static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        public static boolean b(Drawable drawable, int i9) {
            return drawable.setLayoutDirection(i9);
        }
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        b.a(drawable, theme);
    }

    public static boolean b(Drawable drawable) {
        return b.b(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable drawableA;
        int i9 = Build.VERSION.SDK_INT;
        drawable.clearColorFilter();
        if (i9 >= 23) {
            return;
        }
        if (drawable instanceof InsetDrawable) {
            drawableA = C0041a.c((InsetDrawable) drawable);
        } else {
            if (!(drawable instanceof H.c)) {
                if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
                    return;
                }
                int childCount = drawableContainerState.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    Drawable drawableB = C0041a.b(drawableContainerState, i10);
                    if (drawableB != null) {
                        c(drawableB);
                    }
                }
                return;
            }
            drawableA = ((H.c) drawable).a();
        }
        c(drawableA);
    }

    public static int d(Drawable drawable) {
        return C0041a.a(drawable);
    }

    public static ColorFilter e(Drawable drawable) {
        return b.c(drawable);
    }

    public static int f(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.a(drawable);
        }
        if (!f2372d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                f2371c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e9) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e9);
            }
            f2372d = true;
        }
        Method method = f2371c;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, null)).intValue();
        } catch (Exception e10) {
            Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e10);
            f2371c = null;
            return 0;
        }
    }

    public static void g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        b.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean h(Drawable drawable) {
        return C0041a.d(drawable);
    }

    public static void i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(Drawable drawable, boolean z9) {
        C0041a.e(drawable, z9);
    }

    public static void k(Drawable drawable, float f9, float f10) {
        b.e(drawable, f9, f10);
    }

    public static void l(Drawable drawable, int i9, int i10, int i11, int i12) {
        b.f(drawable, i9, i10, i11, i12);
    }

    public static boolean m(Drawable drawable, int i9) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.b(drawable, i9);
        }
        if (!f2370b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f2369a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e9) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e9);
            }
            f2370b = true;
        }
        Method method = f2369a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i9));
                return true;
            } catch (Exception e10) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e10);
                f2369a = null;
            }
        }
        return false;
    }

    public static void n(Drawable drawable, int i9) {
        b.g(drawable, i9);
    }

    public static void o(Drawable drawable, ColorStateList colorStateList) {
        b.h(drawable, colorStateList);
    }

    public static void p(Drawable drawable, PorterDuff.Mode mode) {
        b.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable q(Drawable drawable) {
        return drawable instanceof H.c ? ((H.c) drawable).a() : drawable;
    }

    public static Drawable r(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof H.b)) ? new e(drawable) : drawable;
    }
}

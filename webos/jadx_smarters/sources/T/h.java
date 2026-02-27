package T;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f9487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f9488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Field f9489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f9490d;

    public static class a {
        public static void a(PopupWindow popupWindow, View view, int i9, int i10, int i11) {
            popupWindow.showAsDropDown(view, i9, i10, i11);
        }
    }

    public static class b {
        public static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        public static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        public static void c(PopupWindow popupWindow, boolean z9) {
            popupWindow.setOverlapAnchor(z9);
        }

        public static void d(PopupWindow popupWindow, int i9) {
            popupWindow.setWindowLayoutType(i9);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z9) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.c(popupWindow, z9);
            return;
        }
        if (!f9490d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f9489c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e9) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e9);
            }
            f9490d = true;
        }
        Field field = f9489c;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z9));
            } catch (IllegalAccessException e10) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e10);
            }
        }
    }

    public static void b(PopupWindow popupWindow, int i9) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.d(popupWindow, i9);
            return;
        }
        if (!f9488b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f9487a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f9488b = true;
        }
        Method method = f9487a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i9));
            } catch (Exception unused2) {
            }
        }
    }

    public static void c(PopupWindow popupWindow, View view, int i9, int i10, int i11) {
        a.a(popupWindow, view, i9, i10, i11);
    }
}

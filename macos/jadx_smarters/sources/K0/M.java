package K0;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f3423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f3424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Field f3425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f3426d;

    public abstract void a(View view);

    public final void b() {
        if (f3424b) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f3423a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e9) {
            Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e9);
        }
        f3424b = true;
    }

    public abstract float c(View view);

    public abstract void d(View view);

    public void e(View view, int i9, int i10, int i11, int i12) {
        b();
        Method method = f3423a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e9) {
                throw new RuntimeException(e9.getCause());
            }
        }
    }

    public abstract void f(View view, float f9);

    public void g(View view, int i9) {
        if (!f3426d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f3425c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f3426d = true;
        }
        Field field = f3425c;
        if (field != null) {
            try {
                f3425c.setInt(view, i9 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void h(View view, Matrix matrix);

    public abstract void i(View view, Matrix matrix);
}

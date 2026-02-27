package K0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f3415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Property f3416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Property f3417c;

    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(A.c(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f9) {
            A.g(view, f9.floatValue());
        }
    }

    public class b extends Property {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return P.L.w(view);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            P.L.z0(view, rect);
        }
    }

    static {
        int i9 = Build.VERSION.SDK_INT;
        f3415a = i9 >= 29 ? new L() : i9 >= 23 ? new K() : i9 >= 22 ? new I() : new G();
        f3416b = new a(Float.class, "translationAlpha");
        f3417c = new b(Rect.class, "clipBounds");
    }

    public static void a(View view) {
        f3415a.a(view);
    }

    public static z b(View view) {
        return new y(view);
    }

    public static float c(View view) {
        return f3415a.c(view);
    }

    public static P d(View view) {
        return new O(view);
    }

    public static void e(View view) {
        f3415a.d(view);
    }

    public static void f(View view, int i9, int i10, int i11, int i12) {
        f3415a.e(view, i9, i10, i11, i12);
    }

    public static void g(View view, float f9) {
        f3415a.f(view, f9);
    }

    public static void h(View view, int i9) {
        f3415a.g(view, i9);
    }

    public static void i(View view, Matrix matrix) {
        f3415a.h(view, matrix);
    }

    public static void j(View view, Matrix matrix) {
        f3415a.i(view, matrix);
    }
}

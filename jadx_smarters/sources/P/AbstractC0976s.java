package P;

import android.view.ViewGroup;

/* JADX INFO: renamed from: P.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0976s {

    /* JADX INFO: renamed from: P.s$a */
    public static class a {
        public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        public static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        public static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        public static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i9) {
            marginLayoutParams.resolveLayoutDirection(i9);
        }

        public static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i9) {
            marginLayoutParams.setLayoutDirection(i9);
        }

        public static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i9) {
            marginLayoutParams.setMarginEnd(i9);
        }

        public static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i9) {
            marginLayoutParams.setMarginStart(i9);
        }
    }

    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.b(marginLayoutParams);
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.c(marginLayoutParams);
    }

    public static void c(ViewGroup.MarginLayoutParams marginLayoutParams, int i9) {
        a.g(marginLayoutParams, i9);
    }

    public static void d(ViewGroup.MarginLayoutParams marginLayoutParams, int i9) {
        a.h(marginLayoutParams, i9);
    }
}

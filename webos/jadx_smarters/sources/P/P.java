package P;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    public static class a {
        public static boolean a(ViewParent viewParent, View view, float f9, float f10, boolean z9) {
            return viewParent.onNestedFling(view, f9, f10, z9);
        }

        public static boolean b(ViewParent viewParent, View view, float f9, float f10) {
            return viewParent.onNestedPreFling(view, f9, f10);
        }

        public static void c(ViewParent viewParent, View view, int i9, int i10, int[] iArr) {
            viewParent.onNestedPreScroll(view, i9, i10, iArr);
        }

        public static void d(ViewParent viewParent, View view, int i9, int i10, int i11, int i12) {
            viewParent.onNestedScroll(view, i9, i10, i11, i12);
        }

        public static void e(ViewParent viewParent, View view, View view2, int i9) {
            viewParent.onNestedScrollAccepted(view, view2, i9);
        }

        public static boolean f(ViewParent viewParent, View view, View view2, int i9) {
            return viewParent.onStartNestedScroll(view, view2, i9);
        }

        public static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f9, float f10, boolean z9) {
        try {
            return a.a(viewParent, view, f9, f10, z9);
        } catch (AbstractMethodError e9) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e9);
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, View view, float f9, float f10) {
        try {
            return a.b(viewParent, view, f9, f10);
        } catch (AbstractMethodError e9) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e9);
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int i9, int i10, int[] iArr, int i11) {
        if (viewParent instanceof B) {
            ((B) viewParent).k(view, i9, i10, iArr, i11);
            return;
        }
        if (i11 == 0) {
            try {
                a.c(viewParent, view, i9, i10, iArr);
            } catch (AbstractMethodError e9) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e9);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        if (viewParent instanceof C) {
            ((C) viewParent).m(view, i9, i10, i11, i12, i13, iArr);
            return;
        }
        iArr[0] = iArr[0] + i11;
        iArr[1] = iArr[1] + i12;
        if (viewParent instanceof B) {
            ((B) viewParent).n(view, i9, i10, i11, i12, i13);
            return;
        }
        if (i13 == 0) {
            try {
                a.d(viewParent, view, i9, i10, i11, i12);
            } catch (AbstractMethodError e9) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e9);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int i9, int i10) {
        if (viewParent instanceof B) {
            ((B) viewParent).i(view, view2, i9, i10);
            return;
        }
        if (i10 == 0) {
            try {
                a.e(viewParent, view, view2, i9);
            } catch (AbstractMethodError e9) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e9);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i9, int i10) {
        if (viewParent instanceof B) {
            return ((B) viewParent).o(view, view2, i9, i10);
        }
        if (i10 != 0) {
            return false;
        }
        try {
            return a.f(viewParent, view, view2, i9);
        } catch (AbstractMethodError e9) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e9);
            return false;
        }
    }

    public static void g(ViewParent viewParent, View view, int i9) {
        if (viewParent instanceof B) {
            ((B) viewParent).j(view, i9);
            return;
        }
        if (i9 == 0) {
            try {
                a.g(viewParent, view);
            } catch (AbstractMethodError e9) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e9);
            }
        }
    }
}

package com.onesignal;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.onesignal.C1530a;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class C1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f38176a = b(24);

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38177a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Runnable f38178c;

        /* JADX INFO: renamed from: com.onesignal.C1$a$a, reason: collision with other inner class name */
        public class C0299a extends C1530a.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1530a f38179a;

            public C0299a(C1530a c1530a) {
                this.f38179a = c1530a;
            }

            @Override // com.onesignal.C1530a.b
            public void a(Activity activity) {
                this.f38179a.r(a.this.f38177a);
                if (C1.k(activity)) {
                    a.this.f38178c.run();
                } else {
                    C1.a(activity, a.this.f38178c);
                }
            }
        }

        public a(String str, Runnable runnable) {
            this.f38177a = str;
            this.f38178c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1530a c1530aB = C1533b.b();
            if (c1530aB != null) {
                c1530aB.c(this.f38177a, new C0299a(c1530aB));
            }
        }
    }

    public static void a(Activity activity, Runnable runnable) {
        activity.getWindow().getDecorView().post(new a("decorViewReady:" + runnable, runnable));
    }

    public static int b(int i9) {
        return (int) (i9 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int[] c(Activity activity) {
        float safeInsetRight;
        float safeInsetLeft;
        DisplayCutout cutout;
        Rect rectI = i(activity);
        View viewFindViewById = activity.getWindow().findViewById(R.id.content);
        float top = (rectI.top - viewFindViewById.getTop()) / Resources.getSystem().getDisplayMetrics().density;
        float bottom = (viewFindViewById.getBottom() - rectI.bottom) / Resources.getSystem().getDisplayMetrics().density;
        if (Build.VERSION.SDK_INT != 29 || (cutout = activity.getWindowManager().getDefaultDisplay().getCutout()) == null) {
            safeInsetRight = 0.0f;
            safeInsetLeft = 0.0f;
        } else {
            safeInsetRight = cutout.getSafeInsetRight() / Resources.getSystem().getDisplayMetrics().density;
            safeInsetLeft = cutout.getSafeInsetLeft() / Resources.getSystem().getDisplayMetrics().density;
        }
        return new int[]{Math.round(top), Math.round(bottom), Math.round(safeInsetRight), Math.round(safeInsetLeft)};
    }

    public static int d(Activity activity) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        return point.y;
    }

    public static int e(Activity activity) {
        return Build.VERSION.SDK_INT >= 23 ? activity.getWindow().getDecorView().getWidth() : j(activity);
    }

    public static int f(Activity activity) {
        return Build.VERSION.SDK_INT >= 23 ? g(activity) : h(activity);
    }

    public static int g(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
        int height = decorView.getHeight();
        return rootWindowInsets == null ? height : (height - rootWindowInsets.getStableInsetBottom()) - rootWindowInsets.getStableInsetTop();
    }

    public static int h(Activity activity) {
        return activity.getResources().getConfiguration().orientation == 2 ? i(activity).height() : d(activity);
    }

    public static Rect i(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    public static int j(Activity activity) {
        return i(activity).width();
    }

    public static boolean k(Activity activity) {
        boolean z9 = activity.getWindow().getDecorView().getApplicationWindowToken() != null;
        if (Build.VERSION.SDK_INT < 23) {
            return z9;
        }
        return z9 && (activity.getWindow().getDecorView().getRootWindowInsets() != null);
    }

    public static boolean l(WeakReference weakReference) {
        View decorView;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        if (weakReference.get() != null) {
            Window window = ((Activity) weakReference.get()).getWindow();
            decorView = window.getDecorView();
            decorView.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            decorView = null;
        }
        return decorView != null && displayMetrics.heightPixels - rect.bottom > f38176a;
    }
}

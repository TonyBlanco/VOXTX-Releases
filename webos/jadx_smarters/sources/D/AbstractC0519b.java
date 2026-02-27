package D;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: D.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0519b extends E.b {

    /* JADX INFO: renamed from: D.b$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f1207a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f1208c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f1209d;

        public a(String[] strArr, Activity activity, int i9) {
            this.f1207a = strArr;
            this.f1208c = activity;
            this.f1209d = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f1207a.length];
            PackageManager packageManager = this.f1208c.getPackageManager();
            String packageName = this.f1208c.getPackageName();
            int length = this.f1207a.length;
            for (int i9 = 0; i9 < length; i9++) {
                iArr[i9] = packageManager.checkPermission(this.f1207a[i9], packageName);
            }
            ((f) this.f1208c).onRequestPermissionsResult(this.f1209d, this.f1207a, iArr);
        }
    }

    /* JADX INFO: renamed from: D.b$b, reason: collision with other inner class name */
    public static class C0012b {
        public static void a(Activity activity) {
            activity.finishAffinity();
        }

        public static void b(Activity activity, Intent intent, int i9, Bundle bundle) {
            activity.startActivityForResult(intent, i9, bundle);
        }

        public static void c(Activity activity, IntentSender intentSender, int i9, Intent intent, int i10, int i11, int i12, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i9, intent, i10, i11, i12, bundle);
        }
    }

    /* JADX INFO: renamed from: D.b$c */
    public static class c {
        public static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        public static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        public static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        public static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        public static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: renamed from: D.b$d */
    public static class d {
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] strArr, int i9) {
            activity.requestPermissions(strArr, i9);
        }

        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: D.b$e */
    public static class e {
        public static <T> T a(Activity activity, int i9) {
            return (T) activity.requireViewById(i9);
        }
    }

    /* JADX INFO: renamed from: D.b$f */
    public interface f {
        void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr);
    }

    /* JADX INFO: renamed from: D.b$g */
    public interface g {
        void validateRequestPermissionsRequestCode(int i9);
    }

    public static void b(Activity activity) {
        C0012b.a(activity);
    }

    public static void c(Activity activity) {
        c.a(activity);
    }

    public static boolean d(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static /* synthetic */ void e(Activity activity) {
        if (activity.isFinishing() || AbstractC0522e.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void f(Activity activity) {
        c.b(activity);
    }

    public static void g(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: D.a
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0519b.e(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(Activity activity, String[] strArr, int i9) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof g) {
                ((g) activity).validateRequestPermissionsRequestCode(i9);
            }
            d.b(activity, strArr, i9);
        } else if (activity instanceof f) {
            new Handler(Looper.getMainLooper()).post(new a(strArr, activity, i9));
        }
    }

    public static View i(Activity activity, int i9) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) e.a(activity, i9);
        }
        View viewFindViewById = activity.findViewById(i9);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void j(Activity activity, O o9) {
        c.c(activity, null);
    }

    public static void k(Activity activity, O o9) {
        c.d(activity, null);
    }

    public static boolean l(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return d.c(activity, str);
        }
        return false;
    }

    public static void m(Activity activity, Intent intent, int i9, Bundle bundle) {
        C0012b.b(activity, intent, i9, bundle);
    }

    public static void n(Activity activity, IntentSender intentSender, int i9, Intent intent, int i10, int i11, int i12, Bundle bundle) throws IntentSender.SendIntentException {
        C0012b.c(activity, intentSender, i9, intent, i10, i11, i12, bundle);
    }

    public static void o(Activity activity) {
        c.e(activity);
    }
}

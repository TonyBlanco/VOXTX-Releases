package D;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: D.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0522e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f1210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f1211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f1212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f1213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f1214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f1215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Handler f1216g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: D.e$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f1217a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f1218c;

        public a(d dVar, Object obj) {
            this.f1217a = dVar;
            this.f1218c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1217a.f1223a = this.f1218c;
        }
    }

    /* JADX INFO: renamed from: D.e$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Application f1219a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f1220c;

        public b(Application application, d dVar) {
            this.f1219a = application;
            this.f1220c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1219a.unregisterActivityLifecycleCallbacks(this.f1220c);
        }
    }

    /* JADX INFO: renamed from: D.e$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f1221a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f1222c;

        public c(Object obj, Object obj2) {
            this.f1221a = obj;
            this.f1222c = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = AbstractC0522e.f1213d;
                if (method != null) {
                    method.invoke(this.f1221a, this.f1222c, Boolean.FALSE, "AppCompat recreation");
                } else {
                    AbstractC0522e.f1214e.invoke(this.f1221a, this.f1222c, Boolean.FALSE);
                }
            } catch (RuntimeException e9) {
                if (e9.getClass() == RuntimeException.class && e9.getMessage() != null && e9.getMessage().startsWith("Unable to stop")) {
                    throw e9;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* JADX INFO: renamed from: D.e$d */
    public static final class d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f1223a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Activity f1224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f1225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f1226e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1227f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f1228g = false;

        public d(Activity activity) {
            this.f1224c = activity;
            this.f1225d = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f1224c == activity) {
                this.f1224c = null;
                this.f1227f = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f1227f || this.f1228g || this.f1226e || !AbstractC0522e.h(this.f1223a, this.f1225d, activity)) {
                return;
            }
            this.f1228g = true;
            this.f1223a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f1224c == activity) {
                this.f1226e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class clsA = a();
        f1210a = clsA;
        f1211b = b();
        f1212c = f();
        f1213d = d(clsA);
        f1214e = c(clsA);
        f1215f = e(clsA);
    }

    public static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        int i9 = Build.VERSION.SDK_INT;
        return i9 == 26 || i9 == 27;
    }

    public static boolean h(Object obj, int i9, Activity activity) {
        try {
            Object obj2 = f1212c.get(activity);
            if (obj2 == obj && activity.hashCode() == i9) {
                f1216g.postAtFrontOfQueue(new c(f1211b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f1215f == null) {
            return false;
        }
        if (f1214e == null && f1213d == null) {
            return false;
        }
        try {
            Object obj2 = f1212c.get(activity);
            if (obj2 == null || (obj = f1211b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f1216g;
            handler.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f1215f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                f1216g.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}

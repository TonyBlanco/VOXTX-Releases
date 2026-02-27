package com.onesignal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Bundle;

/* JADX INFO: renamed from: com.onesignal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1533b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C1533b f38665a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C1530a f38666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ComponentCallbacks f38667d;

    /* JADX INFO: renamed from: com.onesignal.b$a */
    public class a implements ComponentCallbacks {
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            C1533b.f38666c.p(configuration, C1533b.f38666c.e());
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    public static C1530a b() {
        return f38666c;
    }

    public static void c(Application application) {
        if (f38665a == null) {
            C1533b c1533b = new C1533b();
            f38665a = c1533b;
            application.registerActivityLifecycleCallbacks(c1533b);
        }
        if (f38666c == null) {
            f38666c = new C1530a(new OSFocusHandler());
        }
        if (f38667d == null) {
            ComponentCallbacks aVar = new a();
            f38667d = aVar;
            application.registerComponentCallbacks(aVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C1530a c1530a = f38666c;
        if (c1530a != null) {
            c1530a.j(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        C1530a c1530a = f38666c;
        if (c1530a != null) {
            c1530a.k(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C1530a c1530a = f38666c;
        if (c1530a != null) {
            c1530a.l(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        C1530a c1530a = f38666c;
        if (c1530a != null) {
            c1530a.m(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        C1530a c1530a = f38666c;
        if (c1530a != null) {
            c1530a.n(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C1530a c1530a = f38666c;
        if (c1530a != null) {
            c1530a.o(activity);
        }
    }
}

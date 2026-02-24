package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
final class ano implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f20340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f20341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20342c = false;

    public ano(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f20341b = new WeakReference(activityLifecycleCallbacks);
        this.f20340a = application;
    }

    public final void a(ann annVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f20341b.get();
            if (activityLifecycleCallbacks != null) {
                annVar.a(activityLifecycleCallbacks);
            } else {
                if (this.f20342c) {
                    return;
                }
                this.f20340a.unregisterActivityLifecycleCallbacks(this);
                this.f20342c = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new anm(activity, bundle, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new anl(activity, 4));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new anl(activity, 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new anl(activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new anm(activity, bundle, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new anl(activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new anl(activity, 3));
    }
}

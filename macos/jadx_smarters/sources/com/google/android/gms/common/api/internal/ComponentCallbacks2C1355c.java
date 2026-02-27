package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ComponentCallbacks2C1355c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ComponentCallbacks2C1355c f26590f = new ComponentCallbacks2C1355c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f26591a = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f26592c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f26593d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26594e = false;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.c$a */
    public interface a {
        void a(boolean z9);
    }

    public static ComponentCallbacks2C1355c b() {
        return f26590f;
    }

    public static void c(Application application) {
        ComponentCallbacks2C1355c componentCallbacks2C1355c = f26590f;
        synchronized (componentCallbacks2C1355c) {
            try {
                if (!componentCallbacks2C1355c.f26594e) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C1355c);
                    application.registerComponentCallbacks(componentCallbacks2C1355c);
                    componentCallbacks2C1355c.f26594e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar) {
        synchronized (f26590f) {
            this.f26593d.add(aVar);
        }
    }

    public boolean d() {
        return this.f26591a.get();
    }

    public boolean e(boolean z9) {
        if (!this.f26592c.get()) {
            if (!C4.m.b()) {
                return z9;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f26592c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f26591a.set(true);
            }
        }
        return d();
    }

    public final void f(boolean z9) {
        synchronized (f26590f) {
            try {
                Iterator it = this.f26593d.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f26592c;
        boolean zCompareAndSet = this.f26591a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f26592c;
        boolean zCompareAndSet = this.f26591a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i9) {
        if (i9 == 20 && this.f26591a.compareAndSet(false, true)) {
            this.f26592c.set(true);
            f(true);
        }
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class aha implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static final aha f19751a = new aha();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ahe f19754d;

    private aha() {
    }

    public static aha a() {
        return f19751a;
    }

    private final void e() {
        boolean z9 = this.f19753c;
        Iterator it = agz.a().c().iterator();
        while (it.hasNext()) {
            ahi ahiVarH = ((agt) it.next()).h();
            if (ahiVarH.k()) {
                ahd.a().b(ahiVarH.a(), "setState", true != z9 ? "foregrounded" : "backgrounded");
            }
        }
    }

    private final void f(boolean z9) {
        if (this.f19753c != z9) {
            this.f19753c = z9;
            if (this.f19752b) {
                e();
                if (this.f19754d != null) {
                    if (!z9) {
                        aht.c().h();
                    } else {
                        aht.c().g();
                    }
                }
            }
        }
    }

    public final void b() {
        this.f19752b = true;
        this.f19753c = false;
        e();
    }

    public final void c() {
        this.f19752b = false;
        this.f19753c = false;
        this.f19754d = null;
    }

    public final void d(ahe aheVar) {
        this.f19754d = aheVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        f(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        View viewG;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i9 = runningAppProcessInfo.importance;
        boolean z9 = true;
        for (agt agtVar : agz.a().b()) {
            if (agtVar.k() && (viewG = agtVar.g()) != null && viewG.hasWindowFocus()) {
                z9 = false;
            }
        }
        f(i9 != 100 && z9);
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
final class aic implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ aid f19820a;

    public aic(aid aidVar) {
        this.f19820a = aidVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        aid aidVar = this.f19820a;
        if (aidVar.f19825e == activity) {
            aidVar.f19825e = null;
            this.f19820a.k();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        aid aidVar = this.f19820a;
        if (aidVar.f19825e == null || aidVar.f19825e == activity) {
            aidVar.f19825e = activity;
            this.f19820a.f19821a.o(new ajr(ajp.activityMonitor, ajq.appStateChanged, this.f19820a.f19822b, this.f19820a.c("", "", "inactive")));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        aid aidVar = this.f19820a;
        if (aidVar.f19825e == activity) {
            this.f19820a.f19821a.o(new ajr(ajp.activityMonitor, ajq.appStateChanged, this.f19820a.f19822b, aidVar.c("", "", "active")));
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
}

package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes3.dex */
final class anl implements ann {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f20335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f20336b;

    public anl(Activity activity, int i9) {
        this.f20336b = i9;
        this.f20335a = activity;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ann
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        int i9 = this.f20336b;
        if (i9 == 0) {
            activityLifecycleCallbacks.onActivityResumed(this.f20335a);
            return;
        }
        if (i9 == 1) {
            activityLifecycleCallbacks.onActivityStarted(this.f20335a);
            return;
        }
        if (i9 == 2) {
            activityLifecycleCallbacks.onActivityPaused(this.f20335a);
        } else if (i9 != 3) {
            activityLifecycleCallbacks.onActivityDestroyed(this.f20335a);
        } else {
            activityLifecycleCallbacks.onActivityStopped(this.f20335a);
        }
    }
}

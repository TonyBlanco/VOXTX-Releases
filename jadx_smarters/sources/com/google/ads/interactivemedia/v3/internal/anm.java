package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
final class anm implements ann {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f20337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f20338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f20339c;

    public anm(Activity activity, Bundle bundle, int i9) {
        this.f20339c = i9;
        this.f20337a = activity;
        this.f20338b = bundle;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ann
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        if (this.f20339c != 0) {
            activityLifecycleCallbacks.onActivityCreated(this.f20337a, this.f20338b);
        } else {
            activityLifecycleCallbacks.onActivitySaveInstanceState(this.f20337a, this.f20338b);
        }
    }
}

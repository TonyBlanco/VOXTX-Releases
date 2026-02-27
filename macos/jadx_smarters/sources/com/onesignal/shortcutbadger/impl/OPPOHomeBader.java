package com.onesignal.shortcutbadger.impl;

import T7.a;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class OPPOHomeBader implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38833a = -1;

    @Override // T7.a
    public List a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // T7.a
    public void b(Context context, ComponentName componentName, int i9) {
        if (this.f38833a == i9) {
            return;
        }
        this.f38833a = i9;
        c(context, i9);
    }

    public final void c(Context context, int i9) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i9);
        context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
    }
}

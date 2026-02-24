package com.onesignal.shortcutbadger.impl;

import T7.a;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ZukHomeBadger implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f38840a = Uri.parse("content://com.android.badge/badge");

    @Override // T7.a
    public List a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // T7.a
    public void b(Context context, ComponentName componentName, int i9) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i9);
        context.getContentResolver().call(this.f38840a, "setAppBadgeCount", (String) null, bundle);
    }
}

package com.onesignal;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X0 f38625a = new X0();

    public final boolean a(Context context) {
        kotlin.jvm.internal.l.e(context, "context");
        return !kotlin.jvm.internal.l.a("DISABLE", OSUtils.f(context, "com.onesignal.NotificationOpened.DEFAULT"));
    }

    public final boolean b(Context context) {
        kotlin.jvm.internal.l.e(context, "context");
        return OSUtils.g(context, "com.onesignal.suppressLaunchURLs");
    }
}

package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q f38450a = new Q();

    public final void a(Context context) {
        kotlin.jvm.internal.l.e(context, "context");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse(kotlin.jvm.internal.l.l("package:", context.getPackageName())));
        context.startActivity(intent);
    }
}

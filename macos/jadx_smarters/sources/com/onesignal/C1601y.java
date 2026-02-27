package com.onesignal;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.onesignal.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1601y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f38961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38962c;

    public C1601y(Context context, Intent intent, boolean z9) {
        kotlin.jvm.internal.l.e(context, "context");
        this.f38960a = context;
        this.f38961b = intent;
        this.f38962c = z9;
    }

    public final Intent a() {
        Intent launchIntentForPackage;
        if (!this.f38962c || (launchIntentForPackage = this.f38960a.getPackageManager().getLaunchIntentForPackage(this.f38960a.getPackageName())) == null) {
            return null;
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.setFlags(270532608);
        return launchIntentForPackage;
    }

    public final Intent b() {
        Intent intent = this.f38961b;
        return intent != null ? intent : a();
    }
}

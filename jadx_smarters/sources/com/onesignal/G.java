package com.onesignal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f38328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f38329c;

    public G(Context context) {
        kotlin.jvm.internal.l.e(context, "context");
        this.f38327a = context;
        this.f38328b = NotificationOpenedReceiver.class;
        this.f38329c = NotificationOpenedReceiverAndroid22AndOlder.class;
    }

    public final PendingIntent a(int i9, Intent oneSignalIntent) {
        kotlin.jvm.internal.l.e(oneSignalIntent, "oneSignalIntent");
        return PendingIntent.getActivity(this.f38327a, i9, oneSignalIntent, 201326592);
    }

    public final Intent b(int i9) {
        Intent intentAddFlags = (Build.VERSION.SDK_INT >= 23 ? d() : c()).putExtra("androidNotificationId", i9).addFlags(603979776);
        kotlin.jvm.internal.l.d(intentAddFlags, "intent\n            .putE…Y_CLEAR_TOP\n            )");
        return intentAddFlags;
    }

    public final Intent c() {
        Intent intent = new Intent(this.f38327a, (Class<?>) this.f38329c);
        intent.addFlags(403177472);
        return intent;
    }

    public final Intent d() {
        return new Intent(this.f38327a, (Class<?>) this.f38328b);
    }
}

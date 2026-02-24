package com.onesignal.shortcutbadger.impl;

import T7.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class VivoHomeBadger implements a {
    @Override // T7.a
    public List a() {
        return Arrays.asList("com.vivo.launcher");
    }

    @Override // T7.a
    public void b(Context context, ComponentName componentName, int i9) {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i9);
        context.sendBroadcast(intent);
    }
}

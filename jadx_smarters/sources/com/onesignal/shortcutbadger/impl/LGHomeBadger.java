package com.onesignal.shortcutbadger.impl;

import T7.a;
import T7.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class LGHomeBadger implements a {
    @Override // T7.a
    public List a() {
        return Arrays.asList("com.lge.launcher", "com.lge.launcher2");
    }

    @Override // T7.a
    public void b(Context context, ComponentName componentName, int i9) throws b {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i9);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        if (U7.a.a(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        throw new b("unable to resolve intent: " + intent.toString());
    }
}

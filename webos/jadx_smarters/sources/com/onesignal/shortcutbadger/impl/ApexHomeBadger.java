package com.onesignal.shortcutbadger.impl;

import T7.a;
import T7.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes4.dex */
public class ApexHomeBadger implements a {
    @Override // T7.a
    public List a() {
        return Arrays.asList("com.anddoes.launcher");
    }

    @Override // T7.a
    public void b(Context context, ComponentName componentName, int i9) throws b {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i9);
        intent.putExtra(Name.LABEL, componentName.getClassName());
        if (U7.a.a(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        throw new b("unable to resolve intent: " + intent.toString());
    }
}

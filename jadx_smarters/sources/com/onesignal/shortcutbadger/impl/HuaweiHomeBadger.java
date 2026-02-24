package com.onesignal.shortcutbadger.impl;

import T7.a;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes4.dex */
public class HuaweiHomeBadger implements a {
    @Override // T7.a
    public List a() {
        return Arrays.asList("com.huawei.android.launcher");
    }

    @Override // T7.a
    public void b(Context context, ComponentName componentName, int i9) {
        Bundle bundle = new Bundle();
        bundle.putString("package", context.getPackageName());
        bundle.putString(Name.LABEL, componentName.getClassName());
        bundle.putInt("badgenumber", i9);
        context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
    }
}

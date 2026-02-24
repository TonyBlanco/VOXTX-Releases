package com.onesignal;

import D.AbstractC0519b;
import android.app.Activity;

/* JADX INFO: renamed from: com.onesignal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1548g {
    public static void a(Activity activity, String[] strArr, int i9) {
        activity.requestPermissions(strArr, i9);
    }

    public static boolean b(Activity activity, String str) {
        return AbstractC0519b.l(activity, str);
    }
}

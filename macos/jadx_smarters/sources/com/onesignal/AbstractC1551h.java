package com.onesignal;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;

/* JADX INFO: renamed from: com.onesignal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1551h {
    public static int a(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            Log.e("OneSignal", "checkSelfPermission failed, returning PERMISSION_DENIED");
            return -1;
        }
    }

    public static int b(Context context, int i9) {
        return Build.VERSION.SDK_INT > 22 ? context.getColor(i9) : context.getResources().getColor(i9);
    }
}

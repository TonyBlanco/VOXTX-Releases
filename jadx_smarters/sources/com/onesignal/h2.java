package com.onesignal;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h2 {
    public static boolean a() {
        String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i9 = 0; i9 < 8; i9++) {
            try {
                if (new File(strArr[i9] + "su").exists()) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}

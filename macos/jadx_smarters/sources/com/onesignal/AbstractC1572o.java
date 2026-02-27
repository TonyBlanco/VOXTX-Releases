package com.onesignal;

import android.os.Build;

/* JADX INFO: renamed from: com.onesignal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1572o {
    public static InterfaceC1566m a() {
        return Build.VERSION.SDK_INT >= 22 ? new C1578q() : new C1569n();
    }
}

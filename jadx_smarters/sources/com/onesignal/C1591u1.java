package com.onesignal;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.onesignal.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1591u1 implements InterfaceC1588t1 {
    @Override // com.onesignal.InterfaceC1588t1
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // com.onesignal.InterfaceC1588t1
    public long b() {
        return SystemClock.elapsedRealtime();
    }
}

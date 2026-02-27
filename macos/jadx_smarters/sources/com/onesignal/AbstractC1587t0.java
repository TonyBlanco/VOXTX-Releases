package com.onesignal;

import com.onesignal.F1;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.onesignal.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1587t0 {
    public static void a(TimerTask timerTask, String str, long j9) {
        F1.c1(F1.v.DEBUG, "scheduleTrigger: " + str + " delay: " + j9);
        StringBuilder sb = new StringBuilder();
        sb.append("trigger_timer:");
        sb.append(str);
        new Timer(sb.toString()).schedule(timerTask, j9);
    }
}

package com.onesignal;

/* JADX INFO: renamed from: com.onesignal.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1579q0 {
    public final void d(Runnable runnable, String threadName) {
        kotlin.jvm.internal.l.e(runnable, "runnable");
        kotlin.jvm.internal.l.e(threadName, "threadName");
        if (OSUtils.H()) {
            new Thread(runnable, threadName).start();
        } else {
            runnable.run();
        }
    }
}

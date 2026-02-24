package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.F1;

/* JADX INFO: renamed from: com.onesignal.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class HandlerThreadC1594v1 extends HandlerThread {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f38905c = "com.onesignal.v1";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f38906d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HandlerThreadC1594v1 f38907e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f38908a;

    public HandlerThreadC1594v1() {
        super(f38905c);
        start();
        this.f38908a = new Handler(getLooper());
    }

    public static HandlerThreadC1594v1 b() {
        if (f38907e == null) {
            synchronized (f38906d) {
                try {
                    if (f38907e == null) {
                        f38907e = new HandlerThreadC1594v1();
                    }
                } finally {
                }
            }
        }
        return f38907e;
    }

    public void a(Runnable runnable) {
        synchronized (f38906d) {
            F1.a(F1.v.DEBUG, "Running destroyTimeout with runnable: " + runnable.toString());
            this.f38908a.removeCallbacks(runnable);
        }
    }

    public void c(long j9, Runnable runnable) {
        synchronized (f38906d) {
            a(runnable);
            F1.a(F1.v.DEBUG, "Running startTimeout with timeout: " + j9 + " and runnable: " + runnable.toString());
            this.f38908a.postDelayed(runnable, j9);
        }
    }
}

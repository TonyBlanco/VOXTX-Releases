package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
final class kd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Exception f23437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f23438b;

    public final void a() {
        this.f23437a = null;
    }

    public final void b(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f23437a == null) {
            this.f23437a = exc;
            this.f23438b = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f23438b) {
            Exception exc2 = this.f23437a;
            if (exc2 != exc) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(exc2, exc);
                } catch (Exception unused) {
                }
            }
            Exception exc3 = this.f23437a;
            a();
            throw exc3;
        }
    }
}

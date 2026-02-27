package com.google.ads.interactivemedia.v3.internal;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class he {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hd f23150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hc f23151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bn f23152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final be f23153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f23155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Looper f23156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f23157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f23158i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f23159j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23161l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f23162m;

    public he(hc hcVar, hd hdVar, be beVar, int i9, bn bnVar, Looper looper) {
        this.f23151b = hcVar;
        this.f23150a = hdVar;
        this.f23153d = beVar;
        this.f23156g = looper;
        this.f23152c = bnVar;
        this.f23157h = i9;
    }

    public final int a() {
        return this.f23157h;
    }

    public final int b() {
        return this.f23154e;
    }

    public final long c() {
        return -9223372036854775807L;
    }

    public final Looper d() {
        return this.f23156g;
    }

    public final be e() {
        return this.f23153d;
    }

    public final hd f() {
        return this.f23150a;
    }

    public final Object g() {
        return this.f23155f;
    }

    public final synchronized void h(boolean z9) {
        this.f23161l = z9 | this.f23161l;
        this.f23162m = true;
        notifyAll();
    }

    public final boolean i() {
        return true;
    }

    public final synchronized void j(long j9) throws InterruptedException, TimeoutException {
        try {
            af.w(this.f23160k);
            af.w(this.f23156g.getThread() != Thread.currentThread());
            long jElapsedRealtime = SystemClock.elapsedRealtime() + j9;
            while (!this.f23162m) {
                if (j9 <= 0) {
                    throw new TimeoutException("Message delivery timed out.");
                }
                wait(j9);
                j9 = jElapsedRealtime - SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k() {
    }

    public final void l() {
        af.w(!this.f23160k);
        af.u(true);
        this.f23160k = true;
        this.f23151b.m(this);
    }

    public final void m(Object obj) {
        af.w(!this.f23160k);
        this.f23155f = obj;
    }

    public final void n(int i9) {
        af.w(!this.f23160k);
        this.f23154e = i9;
    }
}

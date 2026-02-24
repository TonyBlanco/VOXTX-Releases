package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class yh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f25171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yi f25172b;

    public yh(Handler handler, yi yiVar) {
        this.f25171a = yiVar == null ? null : handler;
        this.f25172b = yiVar;
    }

    public final void a(final String str, final long j9, final long j10) {
        Handler handler = this.f25171a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.yf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25164a.g(str, j9, j10);
                }
            });
        }
    }

    public final void b(String str) {
        Handler handler = this.f25171a;
        if (handler != null) {
            handler.post(new ye(this, str, 4));
        }
    }

    public final void c(ep epVar) {
        epVar.a();
        Handler handler = this.f25171a;
        if (handler != null) {
            handler.post(new ye(this, epVar, 2));
        }
    }

    public final void d(int i9, long j9) {
        Handler handler = this.f25171a;
        if (handler != null) {
            handler.post(new yd(this, i9, j9, 1));
        }
    }

    public final void e(ep epVar) {
        Handler handler = this.f25171a;
        if (handler != null) {
            handler.post(new ye(this, epVar, 0));
        }
    }

    public final void f(final C1333s c1333s, final eq eqVar) {
        Handler handler = this.f25171a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.yg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25168a.l(c1333s, eqVar);
                }
            });
        }
    }

    public final /* synthetic */ void g(String str, long j9, long j10) {
        yi yiVar = this.f25172b;
        int i9 = cq.f22640a;
        yiVar.o(str, j9, j10);
    }

    public final /* synthetic */ void h(String str) {
        yi yiVar = this.f25172b;
        int i9 = cq.f22640a;
        yiVar.p(str);
    }

    public final /* synthetic */ void i(ep epVar) {
        epVar.a();
        yi yiVar = this.f25172b;
        int i9 = cq.f22640a;
        yiVar.q(epVar);
    }

    public final /* synthetic */ void j(int i9, long j9) {
        yi yiVar = this.f25172b;
        int i10 = cq.f22640a;
        yiVar.k(i9, j9);
    }

    public final /* synthetic */ void k(ep epVar) {
        yi yiVar = this.f25172b;
        int i9 = cq.f22640a;
        yiVar.r(epVar);
    }

    public final /* synthetic */ void l(C1333s c1333s, eq eqVar) {
        int i9 = cq.f22640a;
        this.f25172b.t(c1333s, eqVar);
    }

    public final /* synthetic */ void m(Object obj, long j9) {
        yi yiVar = this.f25172b;
        int i9 = cq.f22640a;
        yiVar.l(obj, j9);
    }

    public final /* synthetic */ void n(long j9, int i9) {
        yi yiVar = this.f25172b;
        int i10 = cq.f22640a;
        yiVar.s(j9, i9);
    }

    public final /* synthetic */ void o(Exception exc) {
        yi yiVar = this.f25172b;
        int i9 = cq.f22640a;
        yiVar.n(exc);
    }

    public final /* synthetic */ void p(bl blVar) {
        yi yiVar = this.f25172b;
        int i9 = cq.f22640a;
        yiVar.u(blVar);
    }

    public final void q(final Object obj) {
        if (this.f25171a != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f25171a.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.yc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25154a.m(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void r(long j9, int i9) {
        Handler handler = this.f25171a;
        if (handler != null) {
            handler.post(new yd(this, j9, i9, 0));
        }
    }

    public final void s(Exception exc) {
        Handler handler = this.f25171a;
        if (handler != null) {
            handler.post(new ye(this, exc, 1));
        }
    }

    public final void t(bl blVar) {
        Handler handler = this.f25171a;
        if (handler != null) {
            handler.post(new ye(this, blVar, 3));
        }
    }
}

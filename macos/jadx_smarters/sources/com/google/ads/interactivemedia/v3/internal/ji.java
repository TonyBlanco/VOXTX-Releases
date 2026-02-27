package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class ji {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f23358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jj f23359b;

    public ji(Handler handler, jj jjVar) {
        this.f23358a = jjVar == null ? null : handler;
        this.f23359b = jjVar;
    }

    public final void a(Exception exc) {
        Handler handler = this.f23358a;
        if (handler != null) {
            handler.post(new jc(this, exc, 0));
        }
    }

    public final void b(Exception exc) {
        Handler handler = this.f23358a;
        if (handler != null) {
            handler.post(new jc(this, exc, 4));
        }
    }

    public final void c(final String str, final long j9, final long j10) {
        Handler handler = this.f23358a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.jf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23346a.j(str, j9, j10);
                }
            });
        }
    }

    public final void d(String str) {
        Handler handler = this.f23358a;
        if (handler != null) {
            handler.post(new jc(this, str, 5));
        }
    }

    public final void e(ep epVar) {
        epVar.a();
        Handler handler = this.f23358a;
        if (handler != null) {
            handler.post(new jc(this, epVar, 2));
        }
    }

    public final void f(ep epVar) {
        Handler handler = this.f23358a;
        if (handler != null) {
            handler.post(new jc(this, epVar, 3));
        }
    }

    public final void g(C1333s c1333s, eq eqVar) {
        Handler handler = this.f23358a;
        if (handler != null) {
            handler.post(new jg(this, c1333s, eqVar, 0));
        }
    }

    public final /* synthetic */ void h(Exception exc) {
        jj jjVar = this.f23359b;
        int i9 = cq.f22640a;
        jjVar.b(exc);
    }

    public final /* synthetic */ void i(Exception exc) {
        jj jjVar = this.f23359b;
        int i9 = cq.f22640a;
        jjVar.i(exc);
    }

    public final /* synthetic */ void j(String str, long j9, long j10) {
        jj jjVar = this.f23359b;
        int i9 = cq.f22640a;
        jjVar.c(str, j9, j10);
    }

    public final /* synthetic */ void k(String str) {
        jj jjVar = this.f23359b;
        int i9 = cq.f22640a;
        jjVar.d(str);
    }

    public final /* synthetic */ void l(ep epVar) {
        epVar.a();
        jj jjVar = this.f23359b;
        int i9 = cq.f22640a;
        jjVar.e(epVar);
    }

    public final /* synthetic */ void m(ep epVar) {
        jj jjVar = this.f23359b;
        int i9 = cq.f22640a;
        jjVar.f(epVar);
    }

    public final /* synthetic */ void n(C1333s c1333s, eq eqVar) {
        int i9 = cq.f22640a;
        this.f23359b.g(c1333s, eqVar);
    }

    public final /* synthetic */ void o(long j9) {
        jj jjVar = this.f23359b;
        int i9 = cq.f22640a;
        jjVar.h(j9);
    }

    public final /* synthetic */ void p(boolean z9) {
        jj jjVar = this.f23359b;
        int i9 = cq.f22640a;
        jjVar.m(z9);
    }

    public final /* synthetic */ void q(int i9, long j9, long j10) {
        jj jjVar = this.f23359b;
        int i10 = cq.f22640a;
        jjVar.j(i9, j9, j10);
    }

    public final void r(final long j9) {
        Handler handler = this.f23358a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.jd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23342a.o(j9);
                }
            });
        }
    }

    public final void s(final boolean z9) {
        Handler handler = this.f23358a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.je
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23344a.p(z9);
                }
            });
        }
    }

    public final void t(final int i9, final long j9, final long j10) {
        Handler handler = this.f23358a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.jh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23354a.q(i9, j9, j10);
                }
            });
        }
    }
}

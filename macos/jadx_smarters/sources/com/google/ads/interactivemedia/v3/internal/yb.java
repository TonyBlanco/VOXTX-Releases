package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.view.Display;
import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public final class yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xo f25137a = new xo();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xx f25138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ya f25139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f25141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f25142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f25143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f25144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f25145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25146j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f25147k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f25148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f25149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f25150n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f25151o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f25152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f25153q;

    public yb(Context context) {
        xx xxVarC;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            xxVarC = cq.f22640a >= 17 ? xz.c(applicationContext) : null;
            if (xxVarC == null) {
                xxVarC = xy.c(applicationContext);
            }
        } else {
            xxVarC = null;
        }
        this.f25138b = xxVarC;
        this.f25139c = xxVarC != null ? ya.a() : null;
        this.f25147k = -9223372036854775807L;
        this.f25148l = -9223372036854775807L;
        this.f25142f = -1.0f;
        this.f25145i = 1.0f;
        this.f25146j = 0;
    }

    public static /* synthetic */ void b(yb ybVar, Display display) {
        long j9;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            ybVar.f25147k = refreshRate;
            j9 = (refreshRate * 80) / 100;
        } else {
            cd.e("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j9 = -9223372036854775807L;
            ybVar.f25147k = -9223372036854775807L;
        }
        ybVar.f25148l = j9;
    }

    private final void k() {
        Surface surface;
        if (cq.f22640a < 30 || (surface = this.f25141e) == null || this.f25146j == Integer.MIN_VALUE || this.f25144h == 0.0f) {
            return;
        }
        this.f25144h = 0.0f;
        xw.a(surface, 0.0f);
    }

    private final void l() {
        this.f25149m = 0L;
        this.f25152p = -1L;
        this.f25150n = -1L;
    }

    private final void m() {
        if (cq.f22640a < 30 || this.f25141e == null) {
            return;
        }
        float fA = this.f25137a.g() ? this.f25137a.a() : this.f25142f;
        float f9 = this.f25143g;
        if (fA == f9) {
            return;
        }
        if (fA != -1.0f && f9 != -1.0f) {
            float f10 = 1.0f;
            if (this.f25137a.g() && this.f25137a.d() >= 5000000000L) {
                f10 = 0.02f;
            }
            if (Math.abs(fA - this.f25143g) < f10) {
                return;
            }
        } else if (fA == -1.0f && this.f25137a.b() < 30) {
            return;
        }
        this.f25143g = fA;
        n(false);
    }

    private final void n(boolean z9) {
        Surface surface;
        if (cq.f22640a < 30 || (surface = this.f25141e) == null || this.f25146j == Integer.MIN_VALUE) {
            return;
        }
        float f9 = 0.0f;
        if (this.f25140d) {
            float f10 = this.f25143g;
            if (f10 != -1.0f) {
                f9 = this.f25145i * f10;
            }
        }
        if (z9 || this.f25144h != f9) {
            this.f25144h = f9;
            xw.a(surface, f9);
        }
    }

    public final long a(long j9) {
        long j10;
        if (this.f25152p != -1 && this.f25137a.g()) {
            long jC = this.f25153q + ((long) ((this.f25137a.c() * (this.f25149m - this.f25152p)) / this.f25145i));
            if (Math.abs(j9 - jC) <= 20000000) {
                j9 = jC;
            } else {
                l();
            }
        }
        this.f25150n = this.f25149m;
        this.f25151o = j9;
        ya yaVar = this.f25139c;
        if (yaVar == null || this.f25147k == -9223372036854775807L) {
            return j9;
        }
        long j11 = yaVar.f25132a;
        if (j11 == -9223372036854775807L) {
            return j9;
        }
        long j12 = this.f25147k;
        long j13 = j11 + (((j9 - j11) / j12) * j12);
        if (j9 <= j13) {
            j10 = j13 - j12;
        } else {
            j13 = j12 + j13;
            j10 = j13;
        }
        if (j13 - j9 >= j9 - j10) {
            j13 = j10;
        }
        return j13 - this.f25148l;
    }

    public final void c(float f9) {
        this.f25142f = f9;
        this.f25137a.f();
        m();
    }

    public final void d(long j9) {
        long j10 = this.f25150n;
        if (j10 != -1) {
            this.f25152p = j10;
            this.f25153q = this.f25151o;
        }
        this.f25149m++;
        this.f25137a.e(j9 * 1000);
        m();
    }

    public final void e(float f9) {
        this.f25145i = f9;
        l();
        n(false);
    }

    public final void f() {
        l();
    }

    public final void g() {
        this.f25140d = true;
        l();
        if (this.f25138b != null) {
            ya yaVar = this.f25139c;
            af.s(yaVar);
            yaVar.b();
            this.f25138b.b(new xv(this));
        }
        n(false);
    }

    public final void h() {
        this.f25140d = false;
        xx xxVar = this.f25138b;
        if (xxVar != null) {
            xxVar.a();
            ya yaVar = this.f25139c;
            af.s(yaVar);
            yaVar.c();
        }
        k();
    }

    public final void i(Surface surface) {
        if (true == (surface instanceof xt)) {
            surface = null;
        }
        if (this.f25141e == surface) {
            return;
        }
        k();
        this.f25141e = surface;
        n(true);
    }

    public final void j(int i9) {
        if (this.f25146j == i9) {
            return;
        }
        this.f25146j = i9;
        n(true);
    }
}

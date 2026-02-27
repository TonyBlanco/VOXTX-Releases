package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class xo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25079c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25081e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private xn f25077a = new xn();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private xn f25078b = new xn();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f25080d = -9223372036854775807L;

    public final float a() {
        if (g()) {
            return (float) (1.0E9d / this.f25077a.a());
        }
        return -1.0f;
    }

    public final int b() {
        return this.f25081e;
    }

    public final long c() {
        if (g()) {
            return this.f25077a.a();
        }
        return -9223372036854775807L;
    }

    public final long d() {
        if (g()) {
            return this.f25077a.b();
        }
        return -9223372036854775807L;
    }

    public final void e(long j9) {
        this.f25077a.c(j9);
        if (this.f25077a.f()) {
            this.f25079c = false;
        } else if (this.f25080d != -9223372036854775807L) {
            if (!this.f25079c || this.f25078b.e()) {
                this.f25078b.d();
                this.f25078b.c(this.f25080d);
            }
            this.f25079c = true;
            this.f25078b.c(j9);
        }
        if (this.f25079c && this.f25078b.f()) {
            xn xnVar = this.f25077a;
            this.f25077a = this.f25078b;
            this.f25078b = xnVar;
            this.f25079c = false;
        }
        this.f25080d = j9;
        this.f25081e = this.f25077a.f() ? 0 : this.f25081e + 1;
    }

    public final void f() {
        this.f25077a.d();
        this.f25078b.d();
        this.f25079c = false;
        this.f25080d = -9223372036854775807L;
        this.f25081e = 0;
    }

    public final boolean g() {
        return this.f25077a.f();
    }
}

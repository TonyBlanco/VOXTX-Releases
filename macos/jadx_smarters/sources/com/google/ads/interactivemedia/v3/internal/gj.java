package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hb f23006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23012g;

    public gj(hb hbVar) {
        this.f23006a = hbVar;
    }

    public final void a(int i9) {
        this.f23012g = 1 == ((this.f23012g ? 1 : 0) | i9);
        this.f23007b += i9;
    }

    public final void b(int i9) {
        this.f23012g = true;
        this.f23010e = true;
        this.f23011f = i9;
    }

    public final void c(hb hbVar) {
        this.f23012g |= this.f23006a != hbVar;
        this.f23006a = hbVar;
    }

    public final void d(int i9) {
        if (this.f23008c && this.f23009d != 5) {
            af.u(i9 == 5);
            return;
        }
        this.f23012g = true;
        this.f23008c = true;
        this.f23009d = i9;
    }
}

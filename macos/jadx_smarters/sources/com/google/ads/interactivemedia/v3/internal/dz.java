package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public class dz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22759a;

    public final void a(int i9) {
        this.f22759a = i9 | this.f22759a;
    }

    public void b() {
        this.f22759a = 0;
    }

    public final void c(int i9) {
        this.f22759a = i9;
    }

    public final boolean d(int i9) {
        return (this.f22759a & i9) == i9;
    }

    public final boolean e() {
        return d(268435456);
    }

    public final boolean f() {
        return d(Integer.MIN_VALUE);
    }

    public final boolean g() {
        return d(4);
    }

    public final boolean h() {
        return d(1);
    }
}

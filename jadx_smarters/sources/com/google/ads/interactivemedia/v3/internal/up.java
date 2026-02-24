package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class up extends ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f24755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private zo f24756d;

    public up(cy cyVar, dc dcVar, C1333s c1333s, int i9, long j9, long j10, long j11, long j12, long j13) {
        super(cyVar, dcVar, c1333s, i9, j9, j10, j13);
        this.f24753a = j11;
        this.f24754b = j12;
    }

    public final int a(int i9) {
        return ((int[]) af.t(this.f24755c))[i9];
    }

    public final zo c() {
        zo zoVar = this.f24756d;
        af.t(zoVar);
        return zoVar;
    }

    public final void d(zo zoVar) {
        this.f24756d = zoVar;
        this.f24755c = zoVar.b();
    }
}

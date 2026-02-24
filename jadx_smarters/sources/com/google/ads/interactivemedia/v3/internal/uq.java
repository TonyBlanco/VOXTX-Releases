package com.google.ads.interactivemedia.v3.internal;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uq implements vg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f24758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f24759d;

    public uq(long j9, long j10) {
        this.f24757b = j9;
        this.f24758c = j10;
        this.f24759d = j9 - 1;
    }

    public final long c() {
        return this.f24759d;
    }

    public final void d() {
        long j9 = this.f24759d;
        if (j9 < this.f24757b || j9 > this.f24758c) {
            throw new NoSuchElementException();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vg
    public final boolean e() {
        long j9 = this.f24759d + 1;
        this.f24759d = j9;
        return j9 <= this.f24758c;
    }
}

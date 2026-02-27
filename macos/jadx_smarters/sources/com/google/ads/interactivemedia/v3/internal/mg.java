package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mg extends mf {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List f23787e;

    public mg(mb mbVar, long j9, long j10, long j11, long j12, List list, long j13, List list2, long j14, long j15) {
        super(mbVar, j9, j10, j11, j12, list, j13, j14, j15);
        this.f23787e = list2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mf
    public final long c(long j9) {
        return this.f23787e.size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mf
    public final mb g(me meVar, long j9) {
        return (mb) this.f23787e.get((int) (j9 - this.f23781a));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mf
    public final boolean h() {
        return true;
    }
}

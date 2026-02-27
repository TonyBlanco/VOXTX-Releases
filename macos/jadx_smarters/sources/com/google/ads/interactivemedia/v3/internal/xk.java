package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes3.dex */
final class xk implements ww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xj f25063a;

    public xk(xj xjVar) {
        this.f25063a = xjVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final void bj(wy wyVar, long j9, long j10) {
        if (xm.h()) {
            this.f25063a.b();
        } else {
            this.f25063a.a(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final wv bk(wy wyVar, long j9, long j10, IOException iOException, int i9) {
        this.f25063a.a(iOException);
        return xc.f25037b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final void bn(wy wyVar, long j9, long j10, boolean z9) {
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class lf implements ww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ lh f23633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23634b;

    public /* synthetic */ lf(lh lhVar, int i9) {
        this.f23634b = i9;
        this.f23633a = lhVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final /* synthetic */ void bj(wy wyVar, long j9, long j10) {
        if (this.f23634b != 0) {
            this.f23633a.l((xf) wyVar, j9, j10);
        } else {
            this.f23633a.m((xf) wyVar, j9, j10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final /* synthetic */ wv bk(wy wyVar, long j9, long j10, IOException iOException, int i9) {
        int i10 = this.f23634b;
        xf xfVar = (xf) wyVar;
        lh lhVar = this.f23633a;
        return i10 != 0 ? lhVar.r(xfVar, j9, j10, iOException, i9) : lhVar.s(xfVar, j9, j10, iOException);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final /* synthetic */ void bn(wy wyVar, long j9, long j10, boolean z9) {
        if (this.f23634b != 0) {
            this.f23633a.k((xf) wyVar, j9, j10);
        } else {
            this.f23633a.k((xf) wyVar, j9, j10);
        }
    }
}

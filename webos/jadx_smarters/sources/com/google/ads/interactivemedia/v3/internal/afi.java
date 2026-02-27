package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class afi implements bqr {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f19441d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final bqr f19440c = new afi(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final bqr f19439b = new afi(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final bqr f19438a = new afi(0);

    private afi(int i9) {
        this.f19441d = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqr
    public final boolean a(int i9) {
        int i10 = this.f19441d;
        return i10 != 0 ? i10 != 1 ? afo.b(i9) != 0 : afg.c(i9) != 0 : afj.c(i9) != 0;
    }
}

package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class buh implements bqr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f22446c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final bqr f22445b = new buh(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final bqr f22444a = new buh(0);

    private buh(int i9) {
        this.f22446c = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqr
    public final boolean a(int i9) {
        return this.f22446c != 0 ? btz.b(i9) != 0 : bui.c(i9) != null;
    }
}

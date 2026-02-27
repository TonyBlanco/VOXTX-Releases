package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class btw implements bqr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f22367c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final bqr f22366b = new btw(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final bqr f22365a = new btw(0);

    private btw(int i9) {
        this.f22367c = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqr
    public final boolean a(int i9) {
        return this.f22367c != 0 ? btv.b(i9) != 0 : btx.b(i9) != 0;
    }
}

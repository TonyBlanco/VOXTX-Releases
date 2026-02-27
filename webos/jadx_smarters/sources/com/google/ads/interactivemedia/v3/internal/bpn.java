package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class bpn implements bqr {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f21925d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final bqr f21924c = new bpn(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final bqr f21923b = new bpn(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final bqr f21922a = new bpn(0);

    private bpn(int i9) {
        this.f21925d = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqr
    public final boolean a(int i9) {
        int i10 = this.f21925d;
        return i10 != 0 ? i10 != 1 ? bps.b(i9) != 0 : bpm.b(i9) != 0 : bpo.b(i9) != 0;
    }
}

package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class sz extends be {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ai f24564b;

    public sz(ai aiVar) {
        this.f24564b = aiVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int a(Object obj) {
        return obj == sy.f24561c ? 0 : -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int b() {
        return 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int c() {
        return 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final bc d(int i9, bc bcVar, boolean z9) {
        bcVar.n(z9 ? 0 : null, z9 ? sy.f24561c : null, -9223372036854775807L, 0L, C1283b.f20974a, true);
        return bcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final bd e(int i9, bd bdVar, long j9) {
        bdVar.d(bd.f21061a, this.f24564b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0L);
        bdVar.f21073l = true;
        return bdVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final Object f(int i9) {
        return sy.f24561c;
    }
}

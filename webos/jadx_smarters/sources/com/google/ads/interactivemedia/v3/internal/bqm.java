package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class bqm implements bqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final bqq f22104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f22105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final btk f22106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f22107d;

    public bqm(bqq bqqVar, int i9, btk btkVar, boolean z9) {
        this.f22104a = bqqVar;
        this.f22105b = i9;
        this.f22106c = btkVar;
        this.f22107d = z9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqd
    public final int a() {
        return this.f22105b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqd
    public final brr b(brr brrVar, brs brsVar) {
        ((bqj) brrVar).be((bqn) brsVar);
        return brrVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqd
    public final btk c() {
        return this.f22106c;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f22105b - ((bqm) obj).f22105b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqd
    public final btl d() {
        return this.f22106c.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqd
    public final boolean e() {
        return this.f22107d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqd
    public final brx f() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqd
    public final void g() {
    }
}

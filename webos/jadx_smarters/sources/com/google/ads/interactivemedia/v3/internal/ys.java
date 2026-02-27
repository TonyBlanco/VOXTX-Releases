package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class ys implements aab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yv f25202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f25204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f25205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f25206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f25207f;

    public ys(yv yvVar, long j9, long j10, long j11, long j12, long j13) {
        this.f25202a = yvVar;
        this.f25203b = j9;
        this.f25204c = j10;
        this.f25205d = j11;
        this.f25206e = j12;
        this.f25207f = j13;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final long e() {
        return this.f25203b;
    }

    public final long f(long j9) {
        return this.f25202a.a(j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final zz g(long j9) {
        aac aacVar = new aac(j9, yu.f(this.f25202a.a(j9), 0L, this.f25204c, this.f25205d, this.f25206e, this.f25207f));
        return new zz(aacVar, aacVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final boolean h() {
        return true;
    }
}

package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class aaa implements aab, abz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f18624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zz f18625b;

    public aaa() {
        this(-9223372036854775807L);
    }

    public aaa(long j9) {
        this(j9, 0L);
    }

    public aaa(long j9, long j10) {
        this.f18624a = j9;
        aac aacVar = j10 == 0 ? aac.f18626a : new aac(0L, j10);
        this.f18625b = new zz(aacVar, aacVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abz
    public final long a() {
        return -1L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abz
    public final long b(long j9) {
        return 0L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final long e() {
        return this.f18624a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final zz g(long j9) {
        return this.f18625b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final boolean h() {
        return false;
    }
}

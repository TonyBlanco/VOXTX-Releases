package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class lj implements li {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yz f23668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f23669b;

    public lj(yz yzVar, long j9) {
        this.f23668a = yzVar;
        this.f23669b = j9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final long a(long j9, long j10) {
        return this.f23668a.f25224a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final long b(long j9, long j10) {
        return this.f23668a.f25227d[(int) j9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final long c(long j9, long j10) {
        return 0L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final long d() {
        return 0L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final long e(long j9, long j10) {
        return -9223372036854775807L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final long f(long j9) {
        return this.f23668a.f25224a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final long g(long j9, long j10) {
        return this.f23668a.a(j9 + this.f23669b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final long h(long j9) {
        return this.f23668a.f25228e[(int) j9] - this.f23669b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final mb i(long j9) {
        return new mb(null, this.f23668a.f25226c[(int) j9], r0.f25225b[r9]);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final boolean j() {
        return true;
    }
}

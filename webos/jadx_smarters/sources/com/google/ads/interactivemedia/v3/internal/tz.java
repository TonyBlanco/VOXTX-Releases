package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class tz implements wl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f24678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public tz f24680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bdz f24681d;

    public tz(long j9) {
        d(j9);
    }

    public final int a(long j9) {
        long j10 = this.f24678a;
        int i9 = this.f24681d.f21125b;
        return (int) (j9 - j10);
    }

    public final tz b() {
        this.f24681d = null;
        tz tzVar = this.f24680c;
        this.f24680c = null;
        return tzVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wl
    public final wl c() {
        tz tzVar = this.f24680c;
        if (tzVar == null || tzVar.f24681d == null) {
            return null;
        }
        return tzVar;
    }

    public final void d(long j9) {
        af.w(this.f24681d == null);
        this.f24678a = j9;
        this.f24679b = j9 + 65536;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wl
    public final bdz e() {
        bdz bdzVar = this.f24681d;
        af.s(bdzVar);
        return bdzVar;
    }
}

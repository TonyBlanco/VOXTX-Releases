package E3;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.extractor.b f1685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1686b;

    public h(com.google.android.exoplayer2.extractor.b bVar, long j9) {
        this.f1685a = bVar;
        this.f1686b = j9;
    }

    @Override // E3.f
    public long c(long j9) {
        return this.f1685a.f25406e[(int) j9] - this.f1686b;
    }

    @Override // E3.f
    public long d(long j9, long j10) {
        return this.f1685a.f25405d[(int) j9];
    }

    @Override // E3.f
    public long e(long j9, long j10) {
        return 0L;
    }

    @Override // E3.f
    public long f(long j9, long j10) {
        return -9223372036854775807L;
    }

    @Override // E3.f
    public F3.i g(long j9) {
        return new F3.i(null, this.f1685a.f25404c[(int) j9], r0.f25403b[r9]);
    }

    @Override // E3.f
    public long h(long j9, long j10) {
        return this.f1685a.a(j9 + this.f1686b);
    }

    @Override // E3.f
    public long i(long j9) {
        return this.f1685a.f25402a;
    }

    @Override // E3.f
    public boolean j() {
        return true;
    }

    @Override // E3.f
    public long k() {
        return 0L;
    }

    @Override // E3.f
    public long l(long j9, long j10) {
        return this.f1685a.f25402a;
    }
}

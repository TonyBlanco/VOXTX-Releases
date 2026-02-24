package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public class za implements aab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f25232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f25235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f25236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f25237f;

    public za(long j9, long j10, int i9, int i10) {
        long jB;
        this.f25232a = j9;
        this.f25233b = j10;
        this.f25234c = i10 == -1 ? 1 : i10;
        this.f25236e = i9;
        if (j9 == -1) {
            this.f25235d = -1L;
            jB = -9223372036854775807L;
        } else {
            this.f25235d = j9 - j10;
            jB = b(j9, j10, i9);
        }
        this.f25237f = jB;
    }

    private static long b(long j9, long j10, int i9) {
        return (Math.max(0L, j9 - j10) * 8000000) / ((long) i9);
    }

    public final long B(long j9) {
        return b(j9, this.f25233b, this.f25236e);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final long e() {
        return this.f25237f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final zz g(long j9) {
        long j10 = this.f25235d;
        if (j10 == -1) {
            aac aacVar = new aac(0L, this.f25233b);
            return new zz(aacVar, aacVar);
        }
        int i9 = this.f25236e;
        long j11 = this.f25234c;
        long jMin = (((((long) i9) * j9) / 8000000) / j11) * j11;
        if (j10 != -1) {
            jMin = Math.min(jMin, j10 - j11);
        }
        long jMax = this.f25233b + Math.max(jMin, 0L);
        long jB = B(jMax);
        aac aacVar2 = new aac(jB, jMax);
        if (this.f25235d != -1 && jB < j9) {
            long j12 = jMax + ((long) this.f25234c);
            if (j12 < this.f25232a) {
                return new zz(aacVar2, new aac(B(j12), j12));
            }
        }
        return new zz(aacVar2, aacVar2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final boolean h() {
        return this.f25235d != -1;
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
final class abw implements abz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f18858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f18859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f18860c;

    private abw(long[] jArr, long[] jArr2, long j9) {
        this.f18858a = jArr;
        this.f18859b = jArr2;
        this.f18860c = j9 == -9223372036854775807L ? cq.t(jArr2[jArr2.length - 1]) : j9;
    }

    public static abw c(long j9, abc abcVar, long j10) {
        int length = abcVar.f18718d.length;
        int i9 = length + 1;
        long[] jArr = new long[i9];
        long[] jArr2 = new long[i9];
        jArr[0] = j9;
        long j11 = 0;
        jArr2[0] = 0;
        for (int i10 = 1; i10 <= length; i10++) {
            int i11 = i10 - 1;
            j9 += (long) (abcVar.f18716b + abcVar.f18718d[i11]);
            j11 += (long) (abcVar.f18717c + abcVar.f18719e[i11]);
            jArr[i10] = j9;
            jArr2[i10] = j11;
        }
        return new abw(jArr, jArr2, j10);
    }

    private static Pair d(long j9, long[] jArr, long[] jArr2) {
        Long lValueOf;
        Long lValueOf2;
        int iAq = cq.aq(jArr, j9, true);
        long j10 = jArr[iAq];
        long j11 = jArr2[iAq];
        int i9 = iAq + 1;
        if (i9 == jArr.length) {
            lValueOf = Long.valueOf(j10);
            lValueOf2 = Long.valueOf(j11);
        } else {
            long j12 = jArr[i9];
            long j13 = jArr2[i9];
            double d9 = j12 == j10 ? 0.0d : (j9 - j10) / (j12 - j10);
            lValueOf = Long.valueOf(j9);
            lValueOf2 = Long.valueOf(((long) (d9 * (j13 - j11))) + j11);
        }
        return Pair.create(lValueOf, lValueOf2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abz
    public final long a() {
        return -1L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abz
    public final long b(long j9) {
        return cq.t(((Long) d(j9, this.f18858a, this.f18859b).second).longValue());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final long e() {
        return this.f18860c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final zz g(long j9) {
        Pair pairD = d(cq.x(cq.p(j9, 0L, this.f18860c)), this.f18859b, this.f18858a);
        long jLongValue = ((Long) pairD.first).longValue();
        aac aacVar = new aac(cq.t(jLongValue), ((Long) pairD.second).longValue());
        return new zz(aacVar, aacVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final boolean h() {
        return true;
    }
}

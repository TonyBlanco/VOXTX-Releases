package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class acb implements abz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f18890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f18892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f18893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f18894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long[] f18895f;

    private acb(long j9, int i9, long j10, long j11, long[] jArr) {
        this.f18890a = j9;
        this.f18891b = i9;
        this.f18892c = j10;
        this.f18895f = jArr;
        this.f18893d = j11;
        this.f18894e = j11 != -1 ? j9 + j11 : -1L;
    }

    public static acb c(long j9, long j10, zr zrVar, cj cjVar) {
        int iL;
        int i9 = zrVar.f25279g;
        int i10 = zrVar.f25276d;
        int iE = cjVar.e();
        if ((iE & 1) != 1 || (iL = cjVar.l()) == 0) {
            return null;
        }
        long jW = cq.w(iL, ((long) i9) * 1000000, i10);
        if ((iE & 6) != 6) {
            return new acb(j10, zrVar.f25275c, jW, -1L, null);
        }
        long jP = cjVar.p();
        long[] jArr = new long[100];
        for (int i11 = 0; i11 < 100; i11++) {
            jArr[i11] = cjVar.i();
        }
        if (j9 != -1) {
            long j11 = j10 + jP;
            if (j9 != j11) {
                cd.e("XingSeeker", "XING data size mismatch: " + j9 + ", " + j11);
            }
        }
        return new acb(j10, zrVar.f25275c, jW, jP, jArr);
    }

    private final long d(int i9) {
        return (this.f18892c * ((long) i9)) / 100;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abz
    public final long a() {
        return this.f18894e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abz
    public final long b(long j9) {
        long j10 = j9 - this.f18890a;
        if (!h() || j10 <= this.f18891b) {
            return 0L;
        }
        long[] jArr = (long[]) af.t(this.f18895f);
        double d9 = (j10 * 256.0d) / this.f18893d;
        int iAq = cq.aq(jArr, (long) d9, true);
        long jD = d(iAq);
        long j11 = jArr[iAq];
        int i9 = iAq + 1;
        long jD2 = d(i9);
        return jD + Math.round((j11 == (iAq == 99 ? 256L : jArr[i9]) ? 0.0d : (d9 - j11) / (r0 - j11)) * (jD2 - jD));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final long e() {
        return this.f18892c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final zz g(long j9) {
        if (!h()) {
            aac aacVar = new aac(0L, this.f18890a + ((long) this.f18891b));
            return new zz(aacVar, aacVar);
        }
        long jP = cq.p(j9, 0L, this.f18892c);
        double d9 = (jP * 100.0d) / this.f18892c;
        double d10 = 0.0d;
        if (d9 > 0.0d) {
            if (d9 >= 100.0d) {
                d10 = 256.0d;
            } else {
                int i9 = (int) d9;
                double d11 = ((long[]) af.t(this.f18895f))[i9];
                d10 = d11 + ((d9 - ((double) i9)) * ((i9 == 99 ? 256.0d : r3[i9 + 1]) - d11));
            }
        }
        aac aacVar2 = new aac(jP, this.f18890a + cq.p(Math.round((d10 / 256.0d) * this.f18893d), this.f18891b, this.f18893d - 1));
        return new zz(aacVar2, aacVar2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final boolean h() {
        return this.f18895f != null;
    }
}

package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class aca implements abz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f18886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f18887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f18888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f18889d;

    private aca(long[] jArr, long[] jArr2, long j9, long j10) {
        this.f18886a = jArr;
        this.f18887b = jArr2;
        this.f18888c = j9;
        this.f18889d = j10;
    }

    public static aca c(long j9, long j10, zr zrVar, cj cjVar) {
        int i9;
        cjVar.G(10);
        int iE = cjVar.e();
        if (iE <= 0) {
            return null;
        }
        int i10 = zrVar.f25276d;
        long jW = cq.w(iE, ((long) (i10 >= 32000 ? 1152 : 576)) * 1000000, i10);
        int iM = cjVar.m();
        int iM2 = cjVar.m();
        int iM3 = cjVar.m();
        cjVar.G(2);
        long j11 = j10 + ((long) zrVar.f25275c);
        long[] jArr = new long[iM];
        long[] jArr2 = new long[iM];
        int i11 = 0;
        long j12 = j10;
        while (i11 < iM) {
            int i12 = iM2;
            long j13 = j11;
            jArr[i11] = (((long) i11) * jW) / ((long) iM);
            jArr2[i11] = Math.max(j12, j13);
            if (iM3 == 1) {
                i9 = cjVar.i();
            } else if (iM3 == 2) {
                i9 = cjVar.m();
            } else if (iM3 == 3) {
                i9 = cjVar.k();
            } else {
                if (iM3 != 4) {
                    return null;
                }
                i9 = cjVar.l();
            }
            j12 += ((long) i9) * ((long) i12);
            i11++;
            jArr = jArr;
            iM2 = i12;
            j11 = j13;
        }
        long[] jArr3 = jArr;
        if (j9 != -1 && j9 != j12) {
            cd.e("VbriSeeker", "VBRI data size mismatch: " + j9 + ", " + j12);
        }
        return new aca(jArr3, jArr2, jW, j12);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abz
    public final long a() {
        return this.f18889d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abz
    public final long b(long j9) {
        return this.f18886a[cq.aq(this.f18887b, j9, true)];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final long e() {
        return this.f18888c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final zz g(long j9) {
        int iAq = cq.aq(this.f18886a, j9, true);
        aac aacVar = new aac(this.f18886a[iAq], this.f18887b[iAq]);
        if (aacVar.f18627b < j9) {
            long[] jArr = this.f18886a;
            if (iAq != jArr.length - 1) {
                int i9 = iAq + 1;
                return new zz(aacVar, new aac(jArr[i9], this.f18887b[i9]));
            }
        }
        return new zz(aacVar, aacVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final boolean h() {
        return true;
    }
}

package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class ade {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final adb f19069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f19071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f19072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f19074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f19075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f19076h;

    public ade(adb adbVar, long[] jArr, int[] iArr, int i9, long[] jArr2, int[] iArr2, long j9) {
        int length = iArr.length;
        int length2 = jArr2.length;
        af.u(length == length2);
        int length3 = jArr.length;
        af.u(length3 == length2);
        int length4 = iArr2.length;
        af.u(length4 == length2);
        this.f19069a = adbVar;
        this.f19071c = jArr;
        this.f19072d = iArr;
        this.f19073e = i9;
        this.f19074f = jArr2;
        this.f19075g = iArr2;
        this.f19076h = j9;
        this.f19070b = length3;
        if (length4 > 0) {
            int i10 = length4 - 1;
            iArr2[i10] = iArr2[i10] | 536870912;
        }
    }

    public final int a(long j9) {
        for (int iAq = cq.aq(this.f19074f, j9, false); iAq >= 0; iAq--) {
            if ((this.f19075g[iAq] & 1) != 0) {
                return iAq;
            }
        }
        return -1;
    }

    public final int b(long j9) {
        for (int iAo = cq.ao(this.f19074f, j9, true); iAo < this.f19074f.length; iAo++) {
            if ((this.f19075g[iAo] & 1) != 0) {
                return iAo;
            }
        }
        return -1;
    }
}

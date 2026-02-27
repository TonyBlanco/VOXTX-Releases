package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class yz implements aab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f25225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f25226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f25227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f25228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f25229f;

    public yz(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f25225b = iArr;
        this.f25226c = jArr;
        this.f25227d = jArr2;
        this.f25228e = jArr3;
        int length = iArr.length;
        this.f25224a = length;
        if (length <= 0) {
            this.f25229f = 0L;
        } else {
            int i9 = length - 1;
            this.f25229f = jArr2[i9] + jArr3[i9];
        }
    }

    public final int a(long j9) {
        return cq.aq(this.f25228e, j9, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final long e() {
        return this.f25229f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final zz g(long j9) {
        int iA = a(j9);
        aac aacVar = new aac(this.f25228e[iA], this.f25226c[iA]);
        if (aacVar.f18627b >= j9 || iA == this.f25224a - 1) {
            return new zz(aacVar, aacVar);
        }
        int i9 = iA + 1;
        return new zz(aacVar, new aac(this.f25228e[i9], this.f25226c[i9]));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final boolean h() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f25224a + ", sizes=" + Arrays.toString(this.f25225b) + ", offsets=" + Arrays.toString(this.f25226c) + ", timeUs=" + Arrays.toString(this.f25228e) + ", durationsUs=" + Arrays.toString(this.f25227d) + ")";
    }
}

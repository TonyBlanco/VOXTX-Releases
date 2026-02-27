package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.g;
import d3.u;
import d4.k0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f25403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f25404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f25405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f25406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f25407f;

    public b(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f25403b = iArr;
        this.f25404c = jArr;
        this.f25405d = jArr2;
        this.f25406e = jArr3;
        int length = iArr.length;
        this.f25402a = length;
        if (length > 0) {
            this.f25407f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f25407f = 0L;
        }
    }

    public int a(long j9) {
        return k0.i(this.f25406e, j9, true, true);
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public g.a e(long j9) {
        int iA = a(j9);
        u uVar = new u(this.f25406e[iA], this.f25404c[iA]);
        if (uVar.f39610a >= j9 || iA == this.f25402a - 1) {
            return new g.a(uVar);
        }
        int i9 = iA + 1;
        return new g.a(uVar, new u(this.f25406e[i9], this.f25404c[i9]));
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public boolean g() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public long i() {
        return this.f25407f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f25402a + ", sizes=" + Arrays.toString(this.f25403b) + ", offsets=" + Arrays.toString(this.f25404c) + ", timeUs=" + Arrays.toString(this.f25406e) + ", durationsUs=" + Arrays.toString(this.f25405d) + ")";
    }
}

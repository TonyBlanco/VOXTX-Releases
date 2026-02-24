package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.g;
import d3.u;
import d4.AbstractC1684a;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f25418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f25419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25421d;

    public f(long[] jArr, long[] jArr2, long j9) {
        AbstractC1684a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z9 = length > 0;
        this.f25421d = z9;
        if (!z9 || jArr2[0] <= 0) {
            this.f25418a = jArr;
            this.f25419b = jArr2;
        } else {
            int i9 = length + 1;
            long[] jArr3 = new long[i9];
            this.f25418a = jArr3;
            long[] jArr4 = new long[i9];
            this.f25419b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f25420c = j9;
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public g.a e(long j9) {
        if (!this.f25421d) {
            return new g.a(u.f39609c);
        }
        int i9 = k0.i(this.f25419b, j9, true, true);
        u uVar = new u(this.f25419b[i9], this.f25418a[i9]);
        if (uVar.f39610a == j9 || i9 == this.f25419b.length - 1) {
            return new g.a(uVar);
        }
        int i10 = i9 + 1;
        return new g.a(uVar, new u(this.f25419b[i10], this.f25418a[i10]));
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public boolean g() {
        return this.f25421d;
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public long i() {
        return this.f25420c;
    }
}

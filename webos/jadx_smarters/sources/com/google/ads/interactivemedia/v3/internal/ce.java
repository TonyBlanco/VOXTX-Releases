package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f22613b = new long[32];

    public final int a() {
        return this.f22612a;
    }

    public final long b(int i9) {
        if (i9 >= 0 && i9 < this.f22612a) {
            return this.f22613b[i9];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i9 + ", size is " + this.f22612a);
    }

    public final void c(long j9) {
        int i9 = this.f22612a;
        long[] jArr = this.f22613b;
        if (i9 == jArr.length) {
            this.f22613b = Arrays.copyOf(jArr, i9 + i9);
        }
        long[] jArr2 = this.f22613b;
        int i10 = this.f22612a;
        this.f22612a = i10 + 1;
        jArr2[i10] = j9;
    }
}

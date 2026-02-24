package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class abt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long[] f18854a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f18855b = new byte[8];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18857d;

    public static int b(int i9) {
        int i10 = 0;
        while (i10 < 8) {
            long j9 = f18854a[i10] & ((long) i9);
            i10++;
            if (j9 != 0) {
                return i10;
            }
        }
        return -1;
    }

    public static long c(byte[] bArr, int i9, boolean z9) {
        long j9 = ((long) bArr[0]) & 255;
        if (z9) {
            j9 &= ~f18854a[i9 - 1];
        }
        for (int i10 = 1; i10 < i9; i10++) {
            j9 = (j9 << 8) | (((long) bArr[i10]) & 255);
        }
        return j9;
    }

    public final int a() {
        return this.f18857d;
    }

    public final long d(zi ziVar, boolean z9, boolean z10, int i9) throws IOException {
        if (this.f18856c == 0) {
            if (!ziVar.l(this.f18855b, 0, 1, z9)) {
                return -1L;
            }
            int iB = b(this.f18855b[0] & 255);
            this.f18857d = iB;
            if (iB == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f18856c = 1;
        }
        int i10 = this.f18857d;
        if (i10 > i9) {
            this.f18856c = 0;
            return -2L;
        }
        if (i10 != 1) {
            ziVar.g(this.f18855b, 1, i10 - 1);
        }
        this.f18856c = 0;
        return c(this.f18855b, this.f18857d, z10);
    }

    public final void e() {
        this.f18856c = 0;
        this.f18857d = 0;
    }
}

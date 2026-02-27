package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class abs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cj f18852a = new cj(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18853b;

    private final long b(zi ziVar) throws IOException {
        int i9 = 0;
        ziVar.f(this.f18852a.H(), 0, 1);
        int i10 = this.f18852a.H()[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((i10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = i10 & (~i11);
        ziVar.f(this.f18852a.H(), 1, i12);
        while (i9 < i12) {
            i9++;
            i13 = (this.f18852a.H()[i9] & 255) + (i13 << 8);
        }
        this.f18853b += i12 + 1;
        return i13;
    }

    public final boolean a(zi ziVar) throws IOException {
        long jB = ziVar.b();
        long j9 = 1024;
        if (jB != -1 && jB <= 1024) {
            j9 = jB;
        }
        int i9 = (int) j9;
        ziVar.f(this.f18852a.H(), 0, 4);
        long jP = this.f18852a.p();
        this.f18853b = 4;
        while (jP != 440786851) {
            int i10 = this.f18853b + 1;
            this.f18853b = i10;
            if (i10 == i9) {
                return false;
            }
            ziVar.f(this.f18852a.H(), 0, 1);
            jP = ((jP << 8) & (-256)) | ((long) (this.f18852a.H()[0] & 255));
        }
        long jB2 = b(ziVar);
        long j10 = this.f18853b;
        if (jB2 != Long.MIN_VALUE && (jB == -1 || j10 + jB2 < jB)) {
            while (true) {
                long j11 = this.f18853b;
                long j12 = j10 + jB2;
                if (j11 < j12) {
                    if (b(ziVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jB3 = b(ziVar);
                    if (jB3 < 0) {
                        return false;
                    }
                    if (jB3 != 0) {
                        int i11 = (int) jB3;
                        ziVar.e(i11);
                        this.f18853b += i11;
                    }
                } else if (j11 == j12) {
                    return true;
                }
            }
        }
        return false;
    }
}

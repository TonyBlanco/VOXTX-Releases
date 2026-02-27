package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class xn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f25069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f25070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f25071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f25072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f25073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f25074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f25075g = new boolean[15];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25076h;

    private static int g(long j9) {
        return (int) (j9 % 15);
    }

    public final long a() {
        long j9 = this.f25073e;
        if (j9 == 0) {
            return 0L;
        }
        return this.f25074f / j9;
    }

    public final long b() {
        return this.f25074f;
    }

    public final void c(long j9) {
        int i9;
        long j10 = this.f25072d;
        if (j10 == 0) {
            this.f25069a = j9;
        } else if (j10 == 1) {
            long j11 = j9 - this.f25069a;
            this.f25070b = j11;
            this.f25074f = j11;
            this.f25073e = 1L;
        } else {
            long j12 = j9 - this.f25071c;
            int iG = g(j10);
            if (Math.abs(j12 - this.f25070b) <= 1000000) {
                this.f25073e++;
                this.f25074f += j12;
                boolean[] zArr = this.f25075g;
                if (zArr[iG]) {
                    zArr[iG] = false;
                    i9 = this.f25076h - 1;
                    this.f25076h = i9;
                }
            } else {
                boolean[] zArr2 = this.f25075g;
                if (!zArr2[iG]) {
                    zArr2[iG] = true;
                    i9 = this.f25076h + 1;
                    this.f25076h = i9;
                }
            }
        }
        this.f25072d++;
        this.f25071c = j9;
    }

    public final void d() {
        this.f25072d = 0L;
        this.f25073e = 0L;
        this.f25074f = 0L;
        this.f25076h = 0;
        Arrays.fill(this.f25075g, false);
    }

    public final boolean e() {
        long j9 = this.f25072d;
        if (j9 == 0) {
            return false;
        }
        return this.f25075g[g(j9 - 1)];
    }

    public final boolean f() {
        return this.f25072d > 15 && this.f25076h == 0;
    }
}

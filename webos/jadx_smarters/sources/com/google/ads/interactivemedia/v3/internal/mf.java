package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mf extends mk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f23781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f23782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List f23783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f23784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f23785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f23786f;

    public mf(mb mbVar, long j9, long j10, long j11, long j12, List list, long j13, long j14, long j15) {
        super(mbVar, j9, j10);
        this.f23781a = j11;
        this.f23782b = j12;
        this.f23783c = list;
        this.f23784d = j13;
        this.f23785e = j14;
        this.f23786f = j15;
    }

    public final long a(long j9, long j10) {
        long jC = c(j9);
        return jC != -1 ? jC : (int) (e((j10 - this.f23786f) + this.f23784d, j9) - b(j9, j10));
    }

    public final long b(long j9, long j10) {
        if (c(j9) == -1) {
            long j11 = this.f23785e;
            if (j11 != -9223372036854775807L) {
                return Math.max(this.f23781a, e((j10 - this.f23786f) - j11, j9));
            }
        }
        return this.f23781a;
    }

    public abstract long c(long j9);

    public final long d(long j9, long j10) {
        List list = this.f23783c;
        if (list != null) {
            return (((mi) list.get((int) (j9 - this.f23781a))).f23792b * 1000000) / this.f23796i;
        }
        long jC = c(j10);
        return (jC == -1 || j9 != (this.f23781a + jC) + (-1)) ? (this.f23782b * 1000000) / this.f23796i : j10 - f(j9);
    }

    public final long e(long j9, long j10) {
        long j11 = this.f23781a;
        long jC = c(j10);
        if (jC == 0) {
            return j11;
        }
        if (this.f23783c == null) {
            long j12 = this.f23781a + (j9 / ((this.f23782b * 1000000) / this.f23796i));
            return j12 < j11 ? j11 : jC != -1 ? Math.min(j12, (j11 + jC) - 1) : j12;
        }
        long j13 = (jC + j11) - 1;
        long j14 = j11;
        while (j14 <= j13) {
            long j15 = ((j13 - j14) / 2) + j14;
            long jF = f(j15);
            if (jF < j9) {
                j14 = 1 + j15;
            } else {
                if (jF <= j9) {
                    return j15;
                }
                j13 = j15 - 1;
            }
        }
        return j14 == j11 ? j14 : j13;
    }

    public final long f(long j9) {
        List list = this.f23783c;
        return cq.w(list != null ? ((mi) list.get((int) (j9 - this.f23781a))).f23791a - this.f23797j : (j9 - this.f23781a) * this.f23782b, 1000000L, this.f23796i);
    }

    public abstract mb g(me meVar, long j9);

    public boolean h() {
        return this.f23783c != null;
    }
}

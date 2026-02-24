package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class aek implements yx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final co f19357a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19360d = 112800;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cj f19358b = new cj();

    public aek(int i9, co coVar, int i10) {
        this.f19359c = i9;
        this.f19357a = coVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yx
    public final yw a(zi ziVar, long j9) throws IOException {
        int iF;
        int iF2;
        long j10;
        long jD = ziVar.d();
        int iMin = (int) Math.min(112800L, ziVar.b() - jD);
        this.f19358b.B(iMin);
        ziVar.f(this.f19358b.H(), 0, iMin);
        cj cjVar = this.f19358b;
        int iD = cjVar.d();
        long j11 = -1;
        long j12 = -1;
        long j13 = -9223372036854775807L;
        while (cjVar.a() >= 188 && (iF2 = (iF = afe.f(cjVar.H(), cjVar.c(), iD)) + 188) <= iD) {
            long jG = afe.g(cjVar, iF, this.f19359c);
            if (jG != -9223372036854775807L) {
                long jB = this.f19357a.b(jG);
                if (jB > j9) {
                    if (j13 == -9223372036854775807L) {
                        return yw.d(jB, jD);
                    }
                    j10 = jD + j12;
                } else if (100000 + jB > j9) {
                    j10 = jD + ((long) iF);
                } else {
                    j12 = iF;
                    j13 = jB;
                }
                return yw.e(j10);
            }
            cjVar.F(iF2);
            j11 = iF2;
        }
        return j13 != -9223372036854775807L ? yw.f(j13, jD + j11) : yw.f25216a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yx
    public final void b() {
        this.f19358b.C(cq.f22645f);
    }
}

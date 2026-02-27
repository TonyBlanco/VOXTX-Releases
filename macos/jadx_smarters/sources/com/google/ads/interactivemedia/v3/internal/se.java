package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class se implements td, tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final td f24495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f24496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private tc f24497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private sd[] f24498d = new sd[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f24499e = 0;

    public se(td tdVar, long j9) {
        this.f24495a = tdVar;
        this.f24496b = j9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final long a(long j9, hl hlVar) {
        if (j9 == 0) {
            return 0L;
        }
        long jP = cq.p(hlVar.f23174c, 0L, j9);
        long j10 = hlVar.f23175d;
        long j11 = this.f24496b;
        long jP2 = cq.p(j10, 0L, j11 == Long.MIN_VALUE ? Long.MAX_VALUE : j11 - j9);
        if (jP != hlVar.f23174c || jP2 != hlVar.f23175d) {
            hlVar = new hl(jP, jP2);
        }
        return this.f24495a.a(j9, hlVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tc
    public final void bl(td tdVar) {
        tc tcVar = this.f24497c;
        af.s(tcVar);
        tcVar.bl(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final void bm() throws IOException {
        this.f24495a.bm();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final long bo() {
        long jBo = this.f24495a.bo();
        if (jBo != Long.MIN_VALUE) {
            long j9 = this.f24496b;
            if (j9 == Long.MIN_VALUE || jBo < j9) {
                return jBo;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final long c() {
        long jC = this.f24495a.c();
        if (jC != Long.MIN_VALUE) {
            long j9 = this.f24496b;
            if (j9 == Long.MIN_VALUE || jC < j9) {
                return jC;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final long d() {
        if (j()) {
            long j9 = this.f24499e;
            this.f24499e = -9223372036854775807L;
            long jD = d();
            return jD != -9223372036854775807L ? jD : j9;
        }
        long jD2 = this.f24495a.d();
        if (jD2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        af.w(jD2 >= 0);
        long j10 = this.f24496b;
        af.w(j10 == Long.MIN_VALUE || jD2 <= j10);
        return jD2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    @Override // com.google.ads.interactivemedia.v3.internal.td
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f24499e = r0
            com.google.ads.interactivemedia.v3.internal.sd[] r0 = r7.f24498d
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.c()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.ads.interactivemedia.v3.internal.td r0 = r7.f24495a
            long r0 = r0.e(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L35
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L36
            long r8 = r7.f24496b
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L35
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L36
        L35:
            r2 = 1
        L36:
            com.google.ads.interactivemedia.v3.internal.af.w(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.se.e(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    @Override // com.google.ads.interactivemedia.v3.internal.td
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(com.google.ads.interactivemedia.v3.internal.we[] r15, boolean[] r16, com.google.ads.interactivemedia.v3.internal.uf[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            com.google.ads.interactivemedia.v3.internal.sd[] r3 = new com.google.ads.interactivemedia.v3.internal.sd[r2]
            r0.f24498d = r3
            com.google.ads.interactivemedia.v3.internal.uf[] r2 = new com.google.ads.interactivemedia.v3.internal.uf[r2]
            r3 = 0
            r4 = 0
        Lc:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L21
            com.google.ads.interactivemedia.v3.internal.sd[] r5 = r0.f24498d
            r6 = r1[r4]
            com.google.ads.interactivemedia.v3.internal.sd r6 = (com.google.ads.interactivemedia.v3.internal.sd) r6
            r5[r4] = r6
            if (r6 == 0) goto L1c
            com.google.ads.interactivemedia.v3.internal.uf r11 = r6.f24492a
        L1c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto Lc
        L21:
            com.google.ads.interactivemedia.v3.internal.td r4 = r0.f24495a
            r5 = r15
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r19
            long r4 = r4.f(r5, r6, r7, r8, r9)
            boolean r6 = r14.j()
            r7 = 0
            if (r6 == 0) goto L3d
            int r6 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r6 != 0) goto L3d
            r9 = r7
            goto L3f
        L3d:
            r9 = r19
        L3f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f24499e = r12
            r6 = 1
            int r12 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r12 == 0) goto L5d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L5c
            long r7 = r0.f24496b
            r9 = -9223372036854775808
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 == 0) goto L5d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 > 0) goto L5c
            goto L5d
        L5c:
            r6 = 0
        L5d:
            com.google.ads.interactivemedia.v3.internal.af.w(r6)
        L60:
            int r6 = r1.length
            if (r3 >= r6) goto L86
            r6 = r2[r3]
            if (r6 != 0) goto L6c
            com.google.ads.interactivemedia.v3.internal.sd[] r6 = r0.f24498d
            r6[r3] = r11
            goto L7d
        L6c:
            com.google.ads.interactivemedia.v3.internal.sd[] r7 = r0.f24498d
            r8 = r7[r3]
            if (r8 == 0) goto L76
            com.google.ads.interactivemedia.v3.internal.uf r8 = r8.f24492a
            if (r8 == r6) goto L7d
        L76:
            com.google.ads.interactivemedia.v3.internal.sd r8 = new com.google.ads.interactivemedia.v3.internal.sd
            r8.<init>(r14, r6)
            r7[r3] = r8
        L7d:
            com.google.ads.interactivemedia.v3.internal.sd[] r6 = r0.f24498d
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L60
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.se.f(com.google.ads.interactivemedia.v3.internal.we[], boolean[], com.google.ads.interactivemedia.v3.internal.uf[], boolean[], long):long");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ug
    public final /* bridge */ /* synthetic */ void g(uh uhVar) {
        tc tcVar = this.f24497c;
        af.s(tcVar);
        tcVar.g(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final um h() {
        return this.f24495a.h();
    }

    public final boolean j() {
        return this.f24499e != -9223372036854775807L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final void k(tc tcVar, long j9) {
        this.f24497c = tcVar;
        this.f24495a.k(this, j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final void l(long j9) {
        this.f24495a.l(j9);
    }

    public final void m(long j9) {
        this.f24496b = j9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final boolean o(long j9) {
        return this.f24495a.o(j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final boolean p() {
        return this.f24495a.p();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final void q(long j9) {
        this.f24495a.q(j9);
    }
}

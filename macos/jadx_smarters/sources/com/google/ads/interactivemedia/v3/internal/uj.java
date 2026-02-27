package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class uj extends be {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f24729b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f24730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f24731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f24732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f24733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f24734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f24735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f24736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f24737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f24738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f24739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ai f24740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ac f24741n;

    static {
        C1341v c1341v = new C1341v();
        c1341v.b("SinglePeriodTimeline");
        c1341v.c(Uri.EMPTY);
        c1341v.a();
    }

    public uj(long j9, long j10, long j11, long j12, long j13, long j14, boolean z9, boolean z10, boolean z11, Object obj, ai aiVar, ac acVar) {
        this.f24730c = j9;
        this.f24731d = j10;
        this.f24732e = j11;
        this.f24733f = j12;
        this.f24734g = j13;
        this.f24735h = j14;
        this.f24736i = z9;
        this.f24737j = z10;
        this.f24738k = z11;
        this.f24739l = obj;
        this.f24740m = aiVar;
        this.f24741n = acVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int a(Object obj) {
        return f24729b.equals(obj) ? 0 : -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int b() {
        return 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int c() {
        return 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final bc d(int i9, bc bcVar, boolean z9) {
        af.y(i9, 1);
        return bcVar.m(null, z9 ? f24729b : null, this.f24732e, -this.f24734g);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[PHI: r1
      0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v5 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.ads.interactivemedia.v3.internal.be
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.internal.bd e(int r24, com.google.ads.interactivemedia.v3.internal.bd r25, long r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = 1
            r2 = r24
            com.google.ads.interactivemedia.v3.internal.af.y(r2, r1)
            long r1 = r0.f24735h
            boolean r14 = r0.f24737j
            if (r14 == 0) goto L2d
            boolean r3 = r0.f24738k
            if (r3 != 0) goto L2d
            r3 = 0
            int r5 = (r26 > r3 ? 1 : (r26 == r3 ? 0 : -1))
            if (r5 == 0) goto L2d
            long r3 = r0.f24733f
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L26
        L23:
            r16 = r5
            goto L2f
        L26:
            long r1 = r1 + r26
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L2d
            goto L23
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = com.google.ads.interactivemedia.v3.internal.bd.f21061a
            com.google.ads.interactivemedia.v3.internal.ai r5 = r0.f24740m
            java.lang.Object r6 = r0.f24739l
            long r7 = r0.f24730c
            long r9 = r0.f24731d
            boolean r13 = r0.f24736i
            com.google.ads.interactivemedia.v3.internal.ac r15 = r0.f24741n
            long r1 = r0.f24733f
            r18 = r1
            r20 = 0
            long r1 = r0.f24734g
            r21 = r1
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r25
            r3.d(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21)
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.uj.e(int, com.google.ads.interactivemedia.v3.internal.bd, long):com.google.ads.interactivemedia.v3.internal.bd");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final Object f(int i9) {
        af.y(i9, 1);
        return f24729b;
    }
}

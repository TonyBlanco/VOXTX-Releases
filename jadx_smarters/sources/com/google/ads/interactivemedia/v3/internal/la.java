package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class la extends be {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f23614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f23615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f23616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f23618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f23619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f23620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final lu f23621i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ai f23622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ac f23623k;

    public la(long j9, long j10, long j11, int i9, long j12, long j13, long j14, lu luVar, ai aiVar, ac acVar) {
        af.w(luVar.f23728d == (acVar != null));
        this.f23614b = j9;
        this.f23615c = j10;
        this.f23616d = j11;
        this.f23617e = i9;
        this.f23618f = j12;
        this.f23619g = j13;
        this.f23620h = j14;
        this.f23621i = luVar;
        this.f23622j = aiVar;
        this.f23623k = acVar;
    }

    private static boolean r(lu luVar) {
        return luVar.f23728d && luVar.f23729e != -9223372036854775807L && luVar.f23726b == -9223372036854775807L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int a(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f23617e) >= 0 && iIntValue < b()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int b() {
        return this.f23621i.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int c() {
        return 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final bc d(int i9, bc bcVar, boolean z9) {
        af.y(i9, b());
        return bcVar.m(z9 ? this.f23621i.d(i9).f23759a : null, z9 ? Integer.valueOf(this.f23617e + i9) : null, this.f23621i.c(i9), cq.t(this.f23621i.d(i9).f23760b - this.f23621i.d(0).f23760b) - this.f23618f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[PHI: r1
      0x002b: PHI (r1v2 long) = (r1v1 long), (r1v5 long) binds: [B:6:0x001b, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.ads.interactivemedia.v3.internal.be
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.internal.bd e(int r26, com.google.ads.interactivemedia.v3.internal.bd r27, long r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = 1
            r2 = r26
            com.google.ads.interactivemedia.v3.internal.af.y(r2, r1)
            long r1 = r0.f23620h
            com.google.ads.interactivemedia.v3.internal.lu r3 = r0.f23621i
            boolean r3 = r(r3)
            r4 = -1
            if (r3 != 0) goto L17
        L13:
            r18 = r1
            goto L9b
        L17:
            r5 = 0
            int r3 = (r28 > r5 ? 1 : (r28 == r5 ? 0 : -1))
            if (r3 <= 0) goto L2b
            long r1 = r1 + r28
            long r7 = r0.f23619g
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 <= 0) goto L2b
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L13
        L2b:
            long r7 = r0.f23618f
            long r7 = r7 + r1
            com.google.ads.interactivemedia.v3.internal.lu r3 = r0.f23621i
            r9 = 0
            long r10 = r3.c(r9)
            r3 = 0
        L36:
            com.google.ads.interactivemedia.v3.internal.lu r12 = r0.f23621i
            int r12 = r12.a()
            int r12 = r12 + r4
            if (r3 >= r12) goto L4d
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 < 0) goto L4d
            long r7 = r7 - r10
            int r3 = r3 + 1
            com.google.ads.interactivemedia.v3.internal.lu r10 = r0.f23621i
            long r10 = r10.c(r3)
            goto L36
        L4d:
            com.google.ads.interactivemedia.v3.internal.lu r12 = r0.f23621i
            com.google.ads.interactivemedia.v3.internal.lz r3 = r12.d(r3)
            java.util.List r12 = r3.f23761c
            int r12 = r12.size()
            r13 = 0
        L5a:
            if (r13 >= r12) goto L6c
            java.util.List r14 = r3.f23761c
            java.lang.Object r14 = r14.get(r13)
            com.google.ads.interactivemedia.v3.internal.ls r14 = (com.google.ads.interactivemedia.v3.internal.ls) r14
            int r14 = r14.f23716b
            r15 = 2
            if (r14 == r15) goto L6d
            int r13 = r13 + 1
            goto L5a
        L6c:
            r13 = -1
        L6d:
            if (r13 != r4) goto L70
            goto L13
        L70:
            java.util.List r3 = r3.f23761c
            java.lang.Object r3 = r3.get(r13)
            com.google.ads.interactivemedia.v3.internal.ls r3 = (com.google.ads.interactivemedia.v3.internal.ls) r3
            java.util.List r3 = r3.f23717c
            java.lang.Object r3 = r3.get(r9)
            com.google.ads.interactivemedia.v3.internal.me r3 = (com.google.ads.interactivemedia.v3.internal.me) r3
            com.google.ads.interactivemedia.v3.internal.li r3 = r3.k()
            if (r3 == 0) goto L13
            long r12 = r3.f(r10)
            int r9 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r9 != 0) goto L8f
            goto L13
        L8f:
            long r5 = r3.g(r7, r10)
            long r5 = r3.h(r5)
            long r1 = r1 + r5
            long r1 = r1 - r7
            goto L13
        L9b:
            java.lang.Object r6 = com.google.ads.interactivemedia.v3.internal.bd.f21061a
            com.google.ads.interactivemedia.v3.internal.ai r7 = r0.f23622j
            com.google.ads.interactivemedia.v3.internal.lu r1 = r0.f23621i
            r8 = r1
            long r9 = r0.f23614b
            long r11 = r0.f23615c
            long r13 = r0.f23616d
            boolean r16 = r(r1)
            com.google.ads.interactivemedia.v3.internal.ac r1 = r0.f23623k
            r17 = r1
            long r1 = r0.f23619g
            r20 = r1
            int r1 = r25.b()
            int r22 = r1 + (-1)
            long r1 = r0.f23618f
            r23 = r1
            r15 = 1
            r5 = r27
            r5.d(r6, r7, r8, r9, r11, r13, r15, r16, r17, r18, r20, r22, r23)
            return r27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.la.e(int, com.google.ads.interactivemedia.v3.internal.bd, long):com.google.ads.interactivemedia.v3.internal.bd");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final Object f(int i9) {
        af.y(i9, b());
        return Integer.valueOf(this.f23617e + i9);
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class qd extends qh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f24186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f24187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f24189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f24191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f24192k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f24193l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f24194m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1322o f24195n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f24196o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f24197p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map f24198q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f24199r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qc f24200s;

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qd(int r13, java.lang.String r14, java.util.List r15, long r16, boolean r18, long r19, boolean r21, int r22, long r23, int r25, long r26, long r28, boolean r30, boolean r31, boolean r32, com.google.ads.interactivemedia.v3.internal.C1322o r33, java.util.List r34, java.util.List r35, com.google.ads.interactivemedia.v3.internal.qc r36, java.util.Map r37) {
        /*
            r12 = this;
            r0 = r12
            r1 = r16
            r3 = r14
            r4 = r15
            r5 = r30
            r12.<init>(r14, r15, r5)
            r3 = r13
            r0.f24182a = r3
            r3 = r19
            r0.f24186e = r3
            r3 = r18
            r0.f24185d = r3
            r3 = r21
            r0.f24187f = r3
            r3 = r22
            r0.f24188g = r3
            r3 = r23
            r0.f24189h = r3
            r3 = r25
            r0.f24190i = r3
            r3 = r26
            r0.f24191j = r3
            r3 = r28
            r0.f24192k = r3
            r3 = r31
            r0.f24193l = r3
            r3 = r32
            r0.f24194m = r3
            r3 = r33
            r0.f24195n = r3
            com.google.ads.interactivemedia.v3.internal.avo r3 = com.google.ads.interactivemedia.v3.internal.avo.m(r34)
            r0.f24196o = r3
            com.google.ads.interactivemedia.v3.internal.avo r3 = com.google.ads.interactivemedia.v3.internal.avo.m(r35)
            r0.f24197p = r3
            com.google.ads.interactivemedia.v3.internal.avs r3 = com.google.ads.interactivemedia.v3.internal.avs.c(r37)
            r0.f24198q = r3
            boolean r3 = r35.isEmpty()
            r4 = 0
            if (r3 != 0) goto L62
            java.lang.Object r3 = com.google.ads.interactivemedia.v3.internal.axo.z(r35)
            com.google.ads.interactivemedia.v3.internal.py r3 = (com.google.ads.interactivemedia.v3.internal.py) r3
        L59:
            long r6 = r3.f24170g
            long r8 = r3.f24168e
            long r6 = r6 + r8
            r0.f24199r = r6
        L60:
            r8 = r6
            goto L73
        L62:
            boolean r3 = r34.isEmpty()
            if (r3 != 0) goto L6f
            java.lang.Object r3 = com.google.ads.interactivemedia.v3.internal.axo.z(r34)
            com.google.ads.interactivemedia.v3.internal.qa r3 = (com.google.ads.interactivemedia.v3.internal.qa) r3
            goto L59
        L6f:
            r0.f24199r = r4
            r6 = r4
            goto L60
        L73:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 != 0) goto L7d
            goto L8b
        L7d:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 < 0) goto L86
            long r10 = java.lang.Math.min(r8, r1)
            goto L8b
        L86:
            long r6 = r6 + r1
            long r10 = java.lang.Math.max(r4, r6)
        L8b:
            r0.f24183b = r10
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 < 0) goto L93
            r1 = 1
            goto L94
        L93:
            r1 = 0
        L94:
            r0.f24184c = r1
            r1 = r36
            r0.f24200s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.qd.<init>(int, java.lang.String, java.util.List, long, boolean, long, boolean, int, long, int, long, long, boolean, boolean, boolean, com.google.ads.interactivemedia.v3.internal.o, java.util.List, java.util.List, com.google.ads.interactivemedia.v3.internal.qc, java.util.Map):void");
    }

    public final long a() {
        return this.f24186e + this.f24199r;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ry
    public final /* bridge */ /* synthetic */ Object e(List list) {
        return this;
    }
}

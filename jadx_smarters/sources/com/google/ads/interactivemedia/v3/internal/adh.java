package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class adh implements zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final adi f19079a = new adi();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cj f19080b = new cj(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19081c;

    static {
        adj adjVar = adj.f19094a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if ((r4 - r3) < 8192) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r8.h();
        r4 = r4 + 1;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.zh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(com.google.ads.interactivemedia.v3.internal.zi r8) throws java.io.IOException {
        /*
            r7 = this;
            com.google.ads.interactivemedia.v3.internal.cj r0 = new com.google.ads.interactivemedia.v3.internal.cj
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.H()
            r8.f(r4, r2, r1)
            r0.F(r2)
            int r4 = r0.k()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L5f
            r8.h()
            r8.e(r3)
            r4 = r3
        L23:
            r1 = 0
        L24:
            byte[] r5 = r0.H()
            r6 = 6
            r8.f(r5, r2, r6)
            r0.F(r2)
            int r5 = r0.m()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L47
            r8.h()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L43
            return r2
        L43:
            r8.e(r4)
            goto L23
        L47:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L4d
            return r5
        L4d:
            byte[] r5 = r0.H()
            int r5 = com.google.ads.interactivemedia.v3.internal.yo.b(r5)
            r6 = -1
            if (r5 != r6) goto L59
            return r2
        L59:
            int r5 = r5 + (-6)
            r8.e(r5)
            goto L24
        L5f:
            r4 = 3
            r0.G(r4)
            int r4 = r0.h()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.e(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.adh.C(com.google.ads.interactivemedia.v3.internal.zi):boolean");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final int a(zi ziVar, zy zyVar) throws IOException {
        int iA = ziVar.a(this.f19080b.H(), 0, 2786);
        if (iA == -1) {
            return -1;
        }
        this.f19080b.F(0);
        this.f19080b.E(iA);
        if (!this.f19081c) {
            this.f19079a.d(0L, 4);
            this.f19081c = true;
        }
        this.f19079a.a(this.f19080b);
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void b(zk zkVar) {
        this.f19079a.b(zkVar, new aet(0, 1));
        zkVar.n();
        zkVar.x(new aaa(-9223372036854775807L));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void d(long j9, long j10) {
        this.f19081c = false;
        this.f19079a.e();
    }
}

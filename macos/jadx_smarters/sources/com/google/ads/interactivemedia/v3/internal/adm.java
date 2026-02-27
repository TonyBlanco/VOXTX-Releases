package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class adm implements zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final adn f19117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cj f19118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cj f19119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ci f19120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private zk f19121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f19122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f19123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f19125j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19126k;

    static {
        adj adjVar = adj.f19094a;
    }

    public adm() {
        this(null);
    }

    public adm(byte[] bArr) {
        this.f19116a = 0;
        this.f19117b = new adn(true, null);
        this.f19118c = new cj(2048);
        this.f19124i = -1;
        this.f19123h = -1L;
        cj cjVar = new cj(10);
        this.f19119d = cjVar;
        this.f19120e = new ci(cjVar.H());
    }

    private final int f(zi ziVar) throws IOException {
        int i9 = 0;
        while (true) {
            ziVar.f(this.f19119d.H(), 0, 10);
            this.f19119d.F(0);
            if (this.f19119d.k() != 4801587) {
                break;
            }
            this.f19119d.G(3);
            int iH = this.f19119d.h();
            i9 += iH + 10;
            ziVar.e(iH);
        }
        ziVar.h();
        ziVar.e(i9);
        if (this.f19123h == -1) {
            this.f19123h = i9;
        }
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0023  */
    @Override // com.google.ads.interactivemedia.v3.internal.zh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(com.google.ads.interactivemedia.v3.internal.zi r9) throws java.io.IOException {
        /*
            r8 = this;
            int r0 = r8.f(r9)
            r1 = 0
            r3 = r0
            r2 = 0
            r4 = 0
        L8:
            com.google.ads.interactivemedia.v3.internal.cj r5 = r8.f19119d
            byte[] r5 = r5.H()
            r6 = 2
            r9.f(r5, r1, r6)
            com.google.ads.interactivemedia.v3.internal.cj r5 = r8.f19119d
            r5.F(r1)
            com.google.ads.interactivemedia.v3.internal.cj r5 = r8.f19119d
            int r5 = r5.m()
            boolean r5 = com.google.ads.interactivemedia.v3.internal.adn.f(r5)
            if (r5 != 0) goto L2e
        L23:
            int r3 = r3 + 1
            r9.h()
            r9.e(r3)
            r2 = 0
            r4 = 0
            goto L5b
        L2e:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L39
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 > r7) goto L38
            goto L39
        L38:
            return r5
        L39:
            com.google.ads.interactivemedia.v3.internal.cj r5 = r8.f19119d
            byte[] r5 = r5.H()
            r9.f(r5, r1, r6)
            com.google.ads.interactivemedia.v3.internal.ci r5 = r8.f19120e
            r6 = 14
            r5.g(r6)
            com.google.ads.interactivemedia.v3.internal.ci r5 = r8.f19120e
            r6 = 13
            int r5 = r5.c(r6)
            r6 = 6
            if (r5 > r6) goto L55
            goto L23
        L55:
            int r6 = r5 + (-6)
            r9.e(r6)
            int r4 = r4 + r5
        L5b:
            int r5 = r3 - r0
            r6 = 8192(0x2000, float:1.148E-41)
            if (r5 < r6) goto L8
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.adm.C(com.google.ads.interactivemedia.v3.internal.zi):boolean");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final int a(zi ziVar, zy zyVar) throws IOException {
        af.t(this.f19121f);
        int iA = ziVar.a(this.f19118c.H(), 0, 2048);
        if (!this.f19126k) {
            this.f19121f.x(new aaa(-9223372036854775807L));
            this.f19126k = true;
        }
        if (iA == -1) {
            return -1;
        }
        this.f19118c.F(0);
        this.f19118c.E(iA);
        if (!this.f19125j) {
            this.f19117b.d(this.f19122g, 4);
            this.f19125j = true;
        }
        this.f19117b.a(this.f19118c);
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void b(zk zkVar) {
        this.f19121f = zkVar;
        this.f19117b.b(zkVar, new aet(0, 1));
        zkVar.n();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void d(long j9, long j10) {
        this.f19125j = false;
        this.f19117b.e();
        this.f19122g = j10;
    }
}

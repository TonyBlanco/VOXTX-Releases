package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes3.dex */
final class oy extends ve {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final AtomicInteger f23966p = new AtomicInteger();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final cj f23967A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final boolean f23968B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f23969C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final iw f23970D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private oz f23971E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private pk f23972F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f23973G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f23974H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private volatile boolean f23975I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f23976J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private avo f23977K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f23978L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f23979M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f23982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23984e;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final cy f23985q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final dc f23986r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final oz f23987s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f23988t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f23989u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final co f23990v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ox f23991w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final List f23992x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final C1322o f23993y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final aaz f23994z;

    private oy(ox oxVar, cy cyVar, dc dcVar, C1333s c1333s, boolean z9, cy cyVar2, dc dcVar2, boolean z10, Uri uri, List list, int i9, long j9, long j10, long j11, int i10, boolean z11, int i11, boolean z12, boolean z13, co coVar, C1322o c1322o, oz ozVar, aaz aazVar, cj cjVar, boolean z14, iw iwVar) {
        super(cyVar, dcVar, c1333s, i9, j9, j10, j11);
        this.f23968B = z9;
        this.f23984e = i10;
        this.f23979M = z11;
        this.f23981b = i11;
        this.f23986r = dcVar2;
        this.f23985q = cyVar2;
        this.f23974H = dcVar2 != null;
        this.f23969C = z10;
        this.f23982c = uri;
        this.f23988t = z13;
        this.f23990v = coVar;
        this.f23989u = z12;
        this.f23991w = oxVar;
        this.f23992x = list;
        this.f23993y = c1322o;
        this.f23987s = ozVar;
        this.f23994z = aazVar;
        this.f23967A = cjVar;
        this.f23983d = z14;
        this.f23970D = iwVar;
        this.f23977K = avo.o();
        this.f23980a = f23966p.getAndIncrement();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r5.f24223v != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(com.google.ads.interactivemedia.v3.internal.oy r3, android.net.Uri r4, com.google.ads.interactivemedia.v3.internal.qd r5, com.google.ads.interactivemedia.v3.internal.ov r6, long r7) {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            android.net.Uri r1 = r3.f23982c
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L12
            boolean r4 = r3.f23976J
            if (r4 != 0) goto L11
            goto L12
        L11:
            return r0
        L12:
            com.google.ads.interactivemedia.v3.internal.qb r4 = r6.f23942a
            long r1 = r4.f24170g
            long r7 = r7 + r1
            boolean r1 = r4 instanceof com.google.ads.interactivemedia.v3.internal.py
            r2 = 1
            if (r1 == 0) goto L2e
            com.google.ads.interactivemedia.v3.internal.py r4 = (com.google.ads.interactivemedia.v3.internal.py) r4
            boolean r4 = r4.f24158a
            if (r4 != 0) goto L2a
            int r4 = r6.f23944c
            if (r4 != 0) goto L2c
            boolean r4 = r5.f24223v
            if (r4 == 0) goto L3a
        L2a:
            r4 = 1
            goto L30
        L2c:
            r4 = 0
            goto L30
        L2e:
            boolean r4 = r5.f24223v
        L30:
            if (r4 == 0) goto L3a
            long r3 = r3.f24786m
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L39
            goto L3a
        L39:
            return r0
        L3a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.oy.i(com.google.ads.interactivemedia.v3.internal.oy, android.net.Uri, com.google.ads.interactivemedia.v3.internal.qd, com.google.ads.interactivemedia.v3.internal.ov, long):boolean");
    }

    public static oy j(ox oxVar, cy cyVar, C1333s c1333s, long j9, qd qdVar, ov ovVar, Uri uri, List list, int i9, boolean z9, vk vkVar, oy oyVar, byte[] bArr, byte[] bArr2, boolean z10, iw iwVar) {
        byte[] bArrQ;
        dc dcVar;
        cy cyVarO;
        boolean z11;
        aaz aazVar;
        oz ozVar;
        cj cjVar;
        byte[] bArrQ2;
        qb qbVar = ovVar.f23942a;
        db dbVar = new db();
        dbVar.i(af.l(qdVar.f24221t, qbVar.f24166c));
        dbVar.h(qbVar.f24174k);
        dbVar.g(qbVar.f24175l);
        dbVar.b(true != ovVar.f23945d ? 0 : 8);
        dc dcVarA = dbVar.a();
        boolean z12 = bArr != null;
        if (z12) {
            String str = qbVar.f24173j;
            af.s(str);
            bArrQ = q(str);
        } else {
            bArrQ = null;
        }
        cy cyVarO2 = o(cyVar, bArr, bArrQ);
        qa qaVar = qbVar.f24167d;
        if (qaVar != null) {
            boolean z13 = bArr2 != null;
            if (z13) {
                String str2 = qaVar.f24173j;
                af.s(str2);
                bArrQ2 = q(str2);
            } else {
                bArrQ2 = null;
            }
            dc dcVar2 = new dc(af.l(qdVar.f24221t, qaVar.f24166c), qaVar.f24174k, qaVar.f24175l);
            z11 = z13;
            cyVarO = o(cyVar, bArr2, bArrQ2);
            dcVar = dcVar2;
        } else {
            dcVar = null;
            cyVarO = null;
            z11 = false;
        }
        long j10 = j9 + qbVar.f24170g;
        long j11 = j10 + qbVar.f24168e;
        int i10 = qdVar.f24188g + qbVar.f24169f;
        if (oyVar != null) {
            dc dcVar3 = oyVar.f23986r;
            boolean z14 = dcVar == dcVar3 || (dcVar != null && dcVar3 != null && dcVar.f22688a.equals(dcVar3.f22688a) && dcVar.f22692e == oyVar.f23986r.f22692e);
            boolean z15 = uri.equals(oyVar.f23982c) && oyVar.f23976J;
            aaz aazVar2 = oyVar.f23994z;
            cj cjVar2 = oyVar.f23967A;
            ozVar = (z14 && z15 && !oyVar.f23978L && oyVar.f23981b == i10) ? oyVar.f23971E : null;
            aazVar = aazVar2;
            cjVar = cjVar2;
        } else {
            aazVar = new aaz(null);
            ozVar = null;
            cjVar = new cj(10);
        }
        return new oy(oxVar, cyVarO2, dcVarA, c1333s, z12, cyVarO, dcVar, z11, uri, list, i9, j10, j11, ovVar.f23943b, ovVar.f23944c, !ovVar.f23945d, i10, qbVar.f24176m, z9, vkVar.b(i10), qbVar.f24171h, ozVar, aazVar, cjVar, z10, iwVar);
    }

    private final long n(zi ziVar) throws Throwable {
        ziVar.h();
        try {
            this.f23967A.B(10);
            ziVar.f(this.f23967A.H(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f23967A.k() != 4801587) {
            return -9223372036854775807L;
        }
        this.f23967A.G(3);
        int iH = this.f23967A.h();
        int i9 = iH + 10;
        if (i9 > this.f23967A.b()) {
            cj cjVar = this.f23967A;
            byte[] bArrH = cjVar.H();
            cjVar.B(i9);
            System.arraycopy(bArrH, 0, this.f23967A.H(), 0, 10);
        }
        ziVar.f(this.f23967A.H(), 10, iH);
        ao aoVarC = this.f23994z.c(this.f23967A.H(), iH);
        if (aoVarC == null) {
            return -9223372036854775807L;
        }
        int iA = aoVarC.a();
        for (int i10 = 0; i10 < iA; i10++) {
            an anVarB = aoVarC.b(i10);
            if (anVarB instanceof abd) {
                abd abdVar = (abd) anVarB;
                if ("com.apple.streaming.transportStreamTimestamp".equals(abdVar.f18720a)) {
                    System.arraycopy(abdVar.f18721b, 0, this.f23967A.H(), 0, 8);
                    this.f23967A.F(0);
                    this.f23967A.E(8);
                    return this.f23967A.o() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    private static cy o(cy cyVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return cyVar;
        }
        af.s(bArr2);
        return new om(cyVar, bArr, bArr2);
    }

    private final void p(cy cyVar, dc dcVar, boolean z9, boolean z10) throws IOException {
        dc dcVarB;
        cy cyVar2;
        long jD;
        long j9;
        int i9 = this.f23973G;
        if (z9) {
            z = i9 != 0;
            cyVar2 = cyVar;
            dcVarB = dcVar;
        } else {
            dcVarB = dcVar.b(i9);
            cyVar2 = cyVar;
        }
        try {
            long jB = cyVar2.b(dcVarB);
            if (z10) {
                try {
                    this.f23990v.i(this.f23988t, this.f24785l);
                } catch (InterruptedException unused) {
                    throw new InterruptedIOException();
                }
            }
            zb zbVar = new zb(cyVar, dcVarB.f22692e, jB);
            if (this.f23971E == null) {
                long jN = n(zbVar);
                zbVar.h();
                oz ozVar = this.f23987s;
                oz ozVarA = ozVar != null ? ozVar.a() : ((oo) this.f23991w).a(dcVarB.f22688a, this.f24782i, this.f23992x, this.f23990v, cyVar.e(), zbVar);
                this.f23971E = ozVarA;
                zh zhVar = ((on) ozVarA).f23930a;
                if ((zhVar instanceof adm) || (zhVar instanceof adh) || (zhVar instanceof adk) || (zhVar instanceof aby)) {
                    this.f23972F.A(jN != -9223372036854775807L ? this.f23990v.b(jN) : this.f24785l);
                } else {
                    this.f23972F.A(0L);
                }
                this.f23972F.u();
                ((on) this.f23971E).f23930a.b(this.f23972F);
            }
            this.f23972F.y(this.f23993y);
            if (z) {
                zbVar.i(this.f23973G);
            }
            while (!this.f23975I && this.f23971E.c(zbVar)) {
                try {
                    try {
                    } catch (EOFException e9) {
                        if ((this.f24782i.f24460e & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                            throw e9;
                        }
                        ((on) this.f23971E).f23930a.d(0L, 0L);
                        jD = zbVar.d();
                        j9 = dcVar.f22692e;
                    }
                } catch (Throwable th) {
                    this.f23973G = (int) (zbVar.d() - dcVar.f22692e);
                    throw th;
                }
            }
            jD = zbVar.d();
            j9 = dcVar.f22692e;
            this.f23973G = (int) (jD - j9);
        } finally {
            af.e(cyVar);
        }
    }

    private static byte[] q(String str) {
        if (com.google.ads.interactivemedia.v3.impl.data.k.d(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length;
        int i9 = length > 16 ? length - 16 : 0;
        System.arraycopy(byteArray, i9, bArr, (16 - length) + i9, length - i9);
        return bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(int i9) {
        af.w(!this.f23983d);
        if (i9 >= this.f23977K.size()) {
            return 0;
        }
        return ((Integer) this.f23977K.get(i9)).intValue();
    }

    public final void c(pk pkVar, avo avoVar) {
        this.f23972F = pkVar;
        this.f23977K = avoVar;
    }

    public final void d() {
        this.f23978L = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wy
    public final void e() throws IOException {
        oz ozVar;
        af.s(this.f23972F);
        if (this.f23971E == null && (ozVar = this.f23987s) != null && ozVar.b()) {
            this.f23971E = this.f23987s;
            this.f23974H = false;
        }
        if (this.f23974H) {
            af.s(this.f23985q);
            af.s(this.f23986r);
            p(this.f23985q, this.f23986r, this.f23969C, false);
            this.f23973G = 0;
            this.f23974H = false;
        }
        if (this.f23975I) {
            return;
        }
        if (!this.f23989u) {
            p(this.f24787n, this.f24780g, this.f23968B, true);
        }
        this.f23976J = !this.f23975I;
    }

    public final void f() {
        this.f23979M = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ve
    public final boolean g() {
        return this.f23976J;
    }

    public final boolean h() {
        return this.f23979M;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wy
    public final void r() {
        this.f23975I = true;
    }
}

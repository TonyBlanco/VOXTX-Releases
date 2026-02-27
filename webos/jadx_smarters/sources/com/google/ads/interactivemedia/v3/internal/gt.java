package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
final class gt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bc f23092a = new bc();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bd f23093b = new bd();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hu f23094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f23095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f23096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private gq f23099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private gq f23100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private gq f23101j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23102k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Object f23103l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f23104m;

    public gt(hu huVar, Handler handler) {
        this.f23094c = huVar;
        this.f23095d = handler;
    }

    private final boolean A(be beVar, te teVar) {
        if (C(teVar)) {
            return beVar.o(beVar.n(teVar.f20173a, this.f23092a).f21037c, this.f23093b).f21077p == beVar.a(teVar.f20173a);
        }
        return false;
    }

    private final boolean B(be beVar) {
        gq gqVarH = this.f23099h;
        if (gqVarH == null) {
            return true;
        }
        int iA = beVar.a(gqVarH.f23066b);
        while (true) {
            iA = beVar.i(iA, this.f23092a, this.f23093b, this.f23097f, this.f23098g);
            while (gqVarH.h() != null && !gqVarH.f23070f.f23086g) {
                gqVarH = gqVarH.h();
            }
            gq gqVarH2 = gqVarH.h();
            if (iA == -1 || gqVarH2 == null || beVar.a(gqVarH2.f23066b) != iA) {
                break;
            }
            gqVarH = gqVarH2;
        }
        boolean zM = m(gqVarH);
        gqVarH.f23070f = g(beVar, gqVarH.f23070f);
        return !zM;
    }

    private static final boolean C(te teVar) {
        return !teVar.b() && teVar.f20177e == -1;
    }

    private final long s(be beVar, Object obj, int i9) {
        beVar.n(obj, this.f23092a);
        this.f23092a.i(i9);
        this.f23092a.k(i9);
        return 0L;
    }

    private final gr t(be beVar, gq gqVar, long j9) {
        long j10;
        gr grVar = gqVar.f23070f;
        long jD = (gqVar.d() + grVar.f23084e) - j9;
        if (!grVar.f23086g) {
            te teVar = grVar.f23080a;
            beVar.n(teVar.f20173a, this.f23092a);
            if (!teVar.b()) {
                int iD = this.f23092a.d(teVar.f20177e);
                this.f23092a.l(teVar.f20177e);
                if (iD != this.f23092a.a(teVar.f20177e)) {
                    return v(beVar, teVar.f20173a, teVar.f20177e, iD, grVar.f23084e, teVar.f20176d);
                }
                s(beVar, teVar.f20173a, teVar.f20177e);
                return w(beVar, teVar.f20173a, 0L, grVar.f23084e, teVar.f20176d);
            }
            int i9 = teVar.f20174b;
            if (this.f23092a.a(i9) == -1) {
                return null;
            }
            int iE = this.f23092a.e(i9, teVar.f20175c);
            if (iE < 0) {
                return v(beVar, teVar.f20173a, i9, iE, grVar.f23082c, teVar.f20176d);
            }
            long jLongValue = grVar.f23082c;
            if (jLongValue == -9223372036854775807L) {
                bd bdVar = this.f23093b;
                bc bcVar = this.f23092a;
                Pair pairL = beVar.l(bdVar, bcVar, bcVar.f21037c, -9223372036854775807L, Math.max(0L, jD));
                if (pairL == null) {
                    return null;
                }
                jLongValue = ((Long) pairL.second).longValue();
            }
            s(beVar, teVar.f20173a, teVar.f20174b);
            return w(beVar, teVar.f20173a, Math.max(0L, jLongValue), grVar.f23082c, teVar.f20176d);
        }
        long j11 = 0;
        int i10 = beVar.i(beVar.a(grVar.f23080a.f20173a), this.f23092a, this.f23093b, this.f23097f, this.f23098g);
        if (i10 == -1) {
            return null;
        }
        int i11 = beVar.d(i10, this.f23092a, true).f21037c;
        Object obj = this.f23092a.f21036b;
        af.s(obj);
        long j12 = grVar.f23080a.f20176d;
        if (beVar.o(i11, this.f23093b).f21076o == i10) {
            Pair pairL2 = beVar.l(this.f23093b, this.f23092a, i11, -9223372036854775807L, Math.max(0L, jD));
            if (pairL2 == null) {
                return null;
            }
            obj = pairL2.first;
            long jLongValue2 = ((Long) pairL2.second).longValue();
            gq gqVarH = gqVar.h();
            if (gqVarH == null || !gqVarH.f23066b.equals(obj)) {
                j12 = this.f23096e;
                this.f23096e = 1 + j12;
            } else {
                j12 = gqVarH.f23070f.f23080a.f20176d;
            }
            j10 = jLongValue2;
            j11 = -9223372036854775807L;
        } else {
            j10 = 0;
        }
        te teVarX = x(beVar, obj, j10, j12, this.f23093b, this.f23092a);
        if (j11 != -9223372036854775807L && grVar.f23082c != -9223372036854775807L) {
            beVar.n(grVar.f23080a.f20173a, this.f23092a).h();
        }
        return u(beVar, teVarX, j11, j10);
    }

    private final gr u(be beVar, te teVar, long j9, long j10) {
        beVar.n(teVar.f20173a, this.f23092a);
        boolean zB = teVar.b();
        Object obj = teVar.f20173a;
        return zB ? v(beVar, obj, teVar.f20174b, teVar.f20175c, j9, teVar.f20176d) : w(beVar, obj, j10, j9, teVar.f20176d);
    }

    private final gr v(be beVar, Object obj, int i9, int i10, long j9, long j10) {
        te teVar = new te(obj, i9, i10, j10);
        long jF = beVar.n(teVar.f20173a, this.f23092a).f(teVar.f20174b, teVar.f20175c);
        if (i10 == this.f23092a.d(i9)) {
            this.f23092a.j();
        }
        this.f23092a.l(teVar.f20174b);
        long jMax = 0;
        if (jF != -9223372036854775807L && jF <= 0) {
            jMax = Math.max(0L, (-1) + jF);
        }
        return new gr(teVar, jMax, j9, -9223372036854775807L, jF, false, false, false, false);
    }

    private final gr w(be beVar, Object obj, long j9, long j10, long j11) {
        long j12;
        long j13;
        long j14;
        long jMax = j9;
        beVar.n(obj, this.f23092a);
        int iB = this.f23092a.b(jMax);
        bc bcVar = this.f23092a;
        if (iB == -1) {
            bcVar.h();
        } else {
            bcVar.l(iB);
        }
        te teVar = new te(obj, j11, iB);
        boolean zC = C(teVar);
        boolean zA = A(beVar, teVar);
        boolean z9 = z(beVar, teVar, zC);
        if (iB != -1) {
            this.f23092a.l(iB);
        }
        if (iB != -1) {
            this.f23092a.i(iB);
            j12 = 0;
        } else {
            j12 = -9223372036854775807L;
        }
        if (j12 != -9223372036854775807L) {
            j14 = j12;
            j13 = j14;
        } else {
            j13 = this.f23092a.f21038d;
            j14 = -9223372036854775807L;
        }
        if (j13 != -9223372036854775807L && jMax >= j13) {
            jMax = Math.max(0L, j13 - 1);
        }
        return new gr(teVar, jMax, j10, j14, j13, false, zC, zA, z9);
    }

    private static te x(be beVar, Object obj, long j9, long j10, bd bdVar, bc bcVar) {
        beVar.n(obj, bcVar);
        beVar.o(bcVar.f21037c, bdVar);
        beVar.a(obj);
        if (bcVar.f21038d == 0) {
            bcVar.h();
        }
        beVar.n(obj, bcVar);
        int iC = bcVar.c(j9);
        return iC == -1 ? new te(obj, j10, bcVar.b(j9)) : new te(obj, iC, bcVar.d(iC), j10);
    }

    private final void y() {
        final avk avkVarJ = avo.j();
        for (gq gqVarH = this.f23099h; gqVarH != null; gqVarH = gqVarH.h()) {
            avkVarJ.g(gqVarH.f23070f.f23080a);
        }
        gq gqVar = this.f23100i;
        final te teVar = gqVar == null ? null : gqVar.f23070f.f23080a;
        this.f23095d.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.gs
            @Override // java.lang.Runnable
            public final void run() {
                this.f23089a.j(avkVarJ, teVar);
            }
        });
    }

    private final boolean z(be beVar, te teVar, boolean z9) {
        int iA = beVar.a(teVar.f20173a);
        return !beVar.o(beVar.m(iA, this.f23092a).f21037c, this.f23093b).f21070i && beVar.i(iA, this.f23092a, this.f23093b, this.f23097f, this.f23098g) == -1 && z9;
    }

    public final gq a() {
        gq gqVar = this.f23099h;
        if (gqVar == null) {
            return null;
        }
        if (gqVar == this.f23100i) {
            this.f23100i = gqVar.h();
        }
        this.f23099h.o();
        int i9 = this.f23102k - 1;
        this.f23102k = i9;
        if (i9 == 0) {
            this.f23101j = null;
            gq gqVar2 = this.f23099h;
            this.f23103l = gqVar2.f23066b;
            this.f23104m = gqVar2.f23070f.f23080a.f20176d;
        }
        this.f23099h = this.f23099h.h();
        y();
        return this.f23099h;
    }

    public final gq b() {
        gq gqVar = this.f23100i;
        boolean z9 = false;
        if (gqVar != null && gqVar.h() != null) {
            z9 = true;
        }
        af.w(z9);
        this.f23100i = this.f23100i.h();
        y();
        return this.f23100i;
    }

    public final gq c() {
        return this.f23101j;
    }

    public final gq d() {
        return this.f23099h;
    }

    public final gq e() {
        return this.f23100i;
    }

    public final gr f(long j9, hb hbVar) {
        gq gqVar = this.f23101j;
        return gqVar == null ? u(hbVar.f23132a, hbVar.f23133b, hbVar.f23134c, hbVar.f23149r) : t(hbVar.f23132a, gqVar, j9);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.internal.gr g(com.google.ads.interactivemedia.v3.internal.be r19, com.google.ads.interactivemedia.v3.internal.gr r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.ads.interactivemedia.v3.internal.te r3 = r2.f23080a
            boolean r12 = C(r3)
            boolean r13 = r0.A(r1, r3)
            boolean r14 = r0.z(r1, r3, r12)
            com.google.ads.interactivemedia.v3.internal.te r4 = r2.f23080a
            java.lang.Object r4 = r4.f20173a
            com.google.ads.interactivemedia.v3.internal.bc r5 = r0.f23092a
            r1.n(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L2f
            int r1 = r3.f20177e
            if (r1 != r4) goto L31
        L2f:
            r9 = r7
            goto L37
        L31:
            com.google.ads.interactivemedia.v3.internal.bc r9 = r0.f23092a
            r9.i(r1)
            r9 = r5
        L37:
            boolean r1 = r3.b()
            if (r1 == 0) goto L4a
            com.google.ads.interactivemedia.v3.internal.bc r1 = r0.f23092a
            int r5 = r3.f20174b
            int r6 = r3.f20175c
            long r5 = r1.f(r5, r6)
        L47:
            r7 = r9
            r9 = r5
            goto L56
        L4a:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L51
            r7 = r5
            r9 = r7
            goto L56
        L51:
            com.google.ads.interactivemedia.v3.internal.bc r1 = r0.f23092a
            long r5 = r1.f21038d
            goto L47
        L56:
            boolean r1 = r3.b()
            if (r1 == 0) goto L64
            com.google.ads.interactivemedia.v3.internal.bc r1 = r0.f23092a
            int r4 = r3.f20174b
            r1.l(r4)
            goto L6d
        L64:
            int r1 = r3.f20177e
            if (r1 == r4) goto L6d
            com.google.ads.interactivemedia.v3.internal.bc r4 = r0.f23092a
            r4.l(r1)
        L6d:
            com.google.ads.interactivemedia.v3.internal.gr r15 = new com.google.ads.interactivemedia.v3.internal.gr
            long r4 = r2.f23081b
            long r1 = r2.f23082c
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.gt.g(com.google.ads.interactivemedia.v3.internal.be, com.google.ads.interactivemedia.v3.internal.gr):com.google.ads.interactivemedia.v3.internal.gr");
    }

    public final te h(be beVar, Object obj, long j9) {
        long j10;
        int iA;
        int i9 = beVar.n(obj, this.f23092a).f21037c;
        Object obj2 = this.f23103l;
        if (obj2 == null || (iA = beVar.a(obj2)) == -1 || beVar.m(iA, this.f23092a).f21037c != i9) {
            gq gqVarH = this.f23099h;
            while (true) {
                if (gqVarH == null) {
                    gqVarH = this.f23099h;
                    while (gqVarH != null) {
                        int iA2 = beVar.a(gqVarH.f23066b);
                        if (iA2 == -1 || beVar.m(iA2, this.f23092a).f21037c != i9) {
                            gqVarH = gqVarH.h();
                        }
                    }
                    j10 = this.f23096e;
                    this.f23096e = 1 + j10;
                    if (this.f23099h == null) {
                        this.f23103l = obj;
                        this.f23104m = j10;
                    }
                } else {
                    if (gqVarH.f23066b.equals(obj)) {
                        break;
                    }
                    gqVarH = gqVarH.h();
                }
            }
            j10 = gqVarH.f23070f.f23080a.f20176d;
        } else {
            j10 = this.f23104m;
        }
        long j11 = j10;
        beVar.n(obj, this.f23092a);
        beVar.o(this.f23092a.f21037c, this.f23093b);
        int iA3 = beVar.a(obj);
        Object obj3 = obj;
        while (true) {
            bd bdVar = this.f23093b;
            if (iA3 < bdVar.f21076o) {
                return x(beVar, obj3, j9, j11, bdVar, this.f23092a);
            }
            beVar.d(iA3, this.f23092a, true);
            this.f23092a.h();
            bc bcVar = this.f23092a;
            if (bcVar.c(bcVar.f21038d) != -1) {
                obj3 = this.f23092a.f21036b;
                af.s(obj3);
            }
            iA3--;
        }
    }

    public final void i() {
        if (this.f23102k == 0) {
            return;
        }
        gq gqVarH = this.f23099h;
        af.t(gqVarH);
        this.f23103l = gqVarH.f23066b;
        this.f23104m = gqVarH.f23070f.f23080a.f20176d;
        while (gqVarH != null) {
            gqVarH.o();
            gqVarH = gqVarH.h();
        }
        this.f23099h = null;
        this.f23101j = null;
        this.f23100i = null;
        this.f23102k = 0;
        y();
    }

    public final /* synthetic */ void j(avk avkVar, te teVar) {
        this.f23094c.S(avkVar.f(), teVar);
    }

    public final void k(long j9) {
        gq gqVar = this.f23101j;
        if (gqVar != null) {
            gqVar.n(j9);
        }
    }

    public final boolean l(td tdVar) {
        gq gqVar = this.f23101j;
        return gqVar != null && gqVar.f23065a == tdVar;
    }

    public final boolean m(gq gqVar) {
        boolean z9 = false;
        af.w(gqVar != null);
        if (gqVar.equals(this.f23101j)) {
            return false;
        }
        this.f23101j = gqVar;
        while (gqVar.h() != null) {
            gqVar = gqVar.h();
            if (gqVar == this.f23100i) {
                this.f23100i = this.f23099h;
                z9 = true;
            }
            gqVar.o();
            this.f23102k--;
        }
        this.f23101j.p(null);
        y();
        return z9;
    }

    public final boolean n() {
        gq gqVar = this.f23101j;
        if (gqVar != null) {
            return !gqVar.f23070f.f23088i && gqVar.r() && this.f23101j.f23070f.f23084e != -9223372036854775807L && this.f23102k < 100;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(com.google.ads.interactivemedia.v3.internal.be r17, long r18, long r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.ads.interactivemedia.v3.internal.gq r2 = r0.f23099h
            r3 = 0
        L7:
            r4 = 1
            if (r2 == 0) goto L96
            com.google.ads.interactivemedia.v3.internal.gr r5 = r2.f23070f
            r6 = 0
            if (r3 != 0) goto L16
            com.google.ads.interactivemedia.v3.internal.gr r3 = r0.g(r1, r5)
            r7 = r18
            goto L39
        L16:
            r7 = r18
            com.google.ads.interactivemedia.v3.internal.gr r9 = r0.t(r1, r3, r7)
            if (r9 != 0) goto L26
            boolean r1 = r0.m(r3)
            if (r1 != 0) goto L25
            return r4
        L25:
            return r6
        L26:
            long r10 = r5.f23081b
            long r12 = r9.f23081b
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L8e
            com.google.ads.interactivemedia.v3.internal.te r10 = r5.f23080a
            com.google.ads.interactivemedia.v3.internal.te r11 = r9.f23080a
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L8e
            r3 = r9
        L39:
            long r9 = r5.f23082c
            com.google.ads.interactivemedia.v3.internal.gr r9 = r3.a(r9)
            r2.f23070f = r9
            long r9 = r5.f23084e
            long r11 = r3.f23084e
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 == 0) goto L85
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 != 0) goto L53
            goto L85
        L53:
            r2.q()
            long r7 = r3.f23084e
            int r1 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r1 != 0) goto L62
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L66
        L62:
            long r7 = r2.g(r7)
        L66:
            com.google.ads.interactivemedia.v3.internal.gq r1 = r0.f23100i
            if (r2 != r1) goto L7a
            com.google.ads.interactivemedia.v3.internal.gr r1 = r2.f23070f
            boolean r1 = r1.f23085f
            r9 = -9223372036854775808
            int r1 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r1 == 0) goto L78
            int r1 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r1 < 0) goto L7a
        L78:
            r1 = 1
            goto L7b
        L7a:
            r1 = 0
        L7b:
            boolean r2 = r0.m(r2)
            if (r2 != 0) goto L84
            if (r1 != 0) goto L84
            return r4
        L84:
            return r6
        L85:
            com.google.ads.interactivemedia.v3.internal.gq r3 = r2.h()
            r15 = r3
            r3 = r2
            r2 = r15
            goto L7
        L8e:
            boolean r1 = r0.m(r3)
            if (r1 != 0) goto L95
            return r4
        L95:
            return r6
        L96:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.gt.o(com.google.ads.interactivemedia.v3.internal.be, long, long):boolean");
    }

    public final boolean p(be beVar, int i9) {
        this.f23097f = i9;
        return B(beVar);
    }

    public final boolean q(be beVar, boolean z9) {
        this.f23098g = z9;
        return B(beVar);
    }

    public final gq r(hi[] hiVarArr, wj wjVar, wr wrVar, ha haVar, gr grVar, wk wkVar) {
        gq gqVar = this.f23101j;
        gq gqVar2 = new gq(hiVarArr, gqVar == null ? 1000000000000L : (gqVar.d() + this.f23101j.f23070f.f23084e) - grVar.f23081b, wjVar, wrVar, haVar, grVar, wkVar);
        gq gqVar3 = this.f23101j;
        if (gqVar3 != null) {
            gqVar3.p(gqVar2);
        } else {
            this.f23099h = gqVar2;
            this.f23100i = gqVar2;
        }
        this.f23103l = null;
        this.f23101j = gqVar2;
        this.f23102k++;
        y();
        return gqVar2;
    }
}

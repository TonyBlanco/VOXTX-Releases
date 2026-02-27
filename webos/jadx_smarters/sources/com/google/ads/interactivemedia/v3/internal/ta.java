package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class ta extends uo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f24565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bd f24566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bc f24567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private sy f24568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private sx f24569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24572i;

    public ta(tg tgVar, boolean z9) {
        super(tgVar);
        boolean z10 = false;
        if (z9 && tgVar.L()) {
            z10 = true;
        }
        this.f24565b = z10;
        this.f24566c = new bd();
        this.f24567d = new bc();
        be beVarT = tgVar.t();
        if (beVarT == null) {
            this.f24568e = sy.s(tgVar.a());
        } else {
            this.f24568e = sy.t(beVarT, null, null);
            this.f24572i = true;
        }
    }

    private final Object O(Object obj) {
        return (this.f24568e.f24563e == null || !obj.equals(sy.f24561c)) ? obj : this.f24568e.f24563e;
    }

    private final void P(long j9) {
        sx sxVar = this.f24569f;
        int iA = this.f24568e.a(sxVar.f24554a.f20173a);
        if (iA == -1) {
            return;
        }
        long j10 = this.f24568e.m(iA, this.f24567d).f21038d;
        if (j10 != -9223372036854775807L && j9 >= j10) {
            j9 = Math.max(0L, j10 - 1);
        }
        sxVar.r(j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.si, com.google.ads.interactivemedia.v3.internal.tg
    public final void h() {
    }

    public final be k() {
        return this.f24568e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uo
    public final te l(te teVar) {
        Object obj = teVar.f20173a;
        if (this.f24568e.f24563e != null && this.f24568e.f24563e.equals(obj)) {
            obj = sy.f24561c;
        }
        return teVar.c(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    @Override // com.google.ads.interactivemedia.v3.internal.uo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(com.google.ads.interactivemedia.v3.internal.be r11) {
        /*
            r10 = this;
            boolean r0 = r10.f24571h
            r6 = 0
            if (r0 == 0) goto L1a
            com.google.ads.interactivemedia.v3.internal.sy r0 = r10.f24568e
            com.google.ads.interactivemedia.v3.internal.sy r0 = r0.r(r11)
            r10.f24568e = r0
            com.google.ads.interactivemedia.v3.internal.sx r0 = r10.f24569f
            if (r0 == 0) goto La6
            long r0 = r0.j()
            r10.P(r0)
            goto La6
        L1a:
            boolean r0 = r11.p()
            if (r0 == 0) goto L37
            boolean r0 = r10.f24572i
            if (r0 == 0) goto L2b
            com.google.ads.interactivemedia.v3.internal.sy r0 = r10.f24568e
            com.google.ads.interactivemedia.v3.internal.sy r0 = r0.r(r11)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.ads.interactivemedia.v3.internal.bd.f21061a
            java.lang.Object r1 = com.google.ads.interactivemedia.v3.internal.sy.f24561c
            com.google.ads.interactivemedia.v3.internal.sy r0 = com.google.ads.interactivemedia.v3.internal.sy.t(r11, r0, r1)
        L33:
            r10.f24568e = r0
            goto La6
        L37:
            com.google.ads.interactivemedia.v3.internal.bd r0 = r10.f24566c
            r1 = 0
            r11.o(r1, r0)
            com.google.ads.interactivemedia.v3.internal.bd r0 = r10.f24566c
            long r2 = r0.f21074m
            java.lang.Object r7 = r0.f21063b
            com.google.ads.interactivemedia.v3.internal.sx r0 = r10.f24569f
            if (r0 == 0) goto L6d
            long r4 = r0.m()
            com.google.ads.interactivemedia.v3.internal.sy r0 = r10.f24568e
            com.google.ads.interactivemedia.v3.internal.sx r8 = r10.f24569f
            com.google.ads.interactivemedia.v3.internal.te r8 = r8.f24554a
            java.lang.Object r8 = r8.f20173a
            com.google.ads.interactivemedia.v3.internal.bc r9 = r10.f24567d
            r0.n(r8, r9)
            com.google.ads.interactivemedia.v3.internal.bc r0 = r10.f24567d
            long r8 = r0.f21039e
            long r8 = r8 + r4
            com.google.ads.interactivemedia.v3.internal.sy r0 = r10.f24568e
            com.google.ads.interactivemedia.v3.internal.bd r4 = r10.f24566c
            com.google.ads.interactivemedia.v3.internal.bd r0 = r0.o(r1, r4)
            long r0 = r0.f21074m
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 == 0) goto L6d
            r4 = r8
            goto L6e
        L6d:
            r4 = r2
        L6e:
            com.google.ads.interactivemedia.v3.internal.bd r1 = r10.f24566c
            com.google.ads.interactivemedia.v3.internal.bc r2 = r10.f24567d
            r3 = 0
            r0 = r11
            android.util.Pair r0 = r0.k(r1, r2, r3, r4)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r10.f24572i
            if (r0 == 0) goto L8d
            com.google.ads.interactivemedia.v3.internal.sy r0 = r10.f24568e
            com.google.ads.interactivemedia.v3.internal.sy r0 = r0.r(r11)
            goto L91
        L8d:
            com.google.ads.interactivemedia.v3.internal.sy r0 = com.google.ads.interactivemedia.v3.internal.sy.t(r11, r7, r1)
        L91:
            r10.f24568e = r0
            com.google.ads.interactivemedia.v3.internal.sx r0 = r10.f24569f
            if (r0 == 0) goto La6
            r10.P(r2)
            com.google.ads.interactivemedia.v3.internal.te r0 = r0.f24554a
            java.lang.Object r1 = r0.f20173a
            java.lang.Object r1 = r10.O(r1)
            com.google.ads.interactivemedia.v3.internal.te r6 = r0.c(r1)
        La6:
            r0 = 1
            r10.f24572i = r0
            r10.f24571h = r0
            com.google.ads.interactivemedia.v3.internal.sy r0 = r10.f24568e
            r10.G(r0)
            if (r6 == 0) goto Lba
            com.google.ads.interactivemedia.v3.internal.sx r0 = r10.f24569f
            com.google.ads.interactivemedia.v3.internal.af.s(r0)
            r0.n(r6)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ta.m(com.google.ads.interactivemedia.v3.internal.be):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uo, com.google.ads.interactivemedia.v3.internal.tg
    public final void o(td tdVar) {
        ((sx) tdVar).s();
        if (tdVar == this.f24569f) {
            this.f24569f = null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.si, com.google.ads.interactivemedia.v3.internal.sa
    public final void p() {
        this.f24571h = false;
        this.f24570g = false;
        super.p();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uo
    public final void r() {
        if (this.f24565b) {
            return;
        }
        this.f24570g = true;
        N();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uo, com.google.ads.interactivemedia.v3.internal.tg
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final sx q(te teVar, wr wrVar, long j9) {
        sx sxVar = new sx(teVar, wrVar, j9);
        sxVar.t(((uo) this).f24752a);
        if (this.f24571h) {
            sxVar.n(teVar.c(O(teVar.f20173a)));
        } else {
            this.f24569f = sxVar;
            if (!this.f24570g) {
                this.f24570g = true;
                N();
            }
        }
        return sxVar;
    }
}

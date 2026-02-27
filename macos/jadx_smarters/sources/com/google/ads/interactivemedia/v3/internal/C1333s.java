package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.ads.interactivemedia.v3.internal.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1333s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f24450A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f24451B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f24452C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f24453D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f24454E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f24455F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f24464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ao f24465j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f24466k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f24467l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f24468m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f24469n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1322o f24470o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f24471p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f24472q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f24473r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f24474s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f24475t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f24476u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[] f24477v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f24478w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1307j f24479x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f24480y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f24481z;

    static {
        new r().v();
    }

    public /* synthetic */ C1333s(r rVar) {
        this.f24456a = rVar.f24324a;
        this.f24457b = rVar.f24325b;
        this.f24458c = cq.Q(rVar.f24326c);
        this.f24459d = rVar.f24327d;
        this.f24460e = rVar.f24328e;
        int i9 = rVar.f24329f;
        this.f24461f = i9;
        int i10 = rVar.f24330g;
        this.f24462g = i10;
        this.f24463h = i10 != -1 ? i10 : i9;
        this.f24464i = rVar.f24331h;
        this.f24465j = rVar.f24332i;
        this.f24466k = rVar.f24333j;
        this.f24467l = rVar.f24334k;
        this.f24468m = rVar.f24335l;
        this.f24469n = rVar.f24336m == null ? Collections.emptyList() : rVar.f24336m;
        C1322o c1322o = rVar.f24337n;
        this.f24470o = c1322o;
        this.f24471p = rVar.f24338o;
        this.f24472q = rVar.f24339p;
        this.f24473r = rVar.f24340q;
        this.f24474s = rVar.f24341r;
        this.f24475t = rVar.f24342s == -1 ? 0 : rVar.f24342s;
        this.f24476u = rVar.f24343t == -1.0f ? 1.0f : rVar.f24343t;
        this.f24477v = rVar.f24344u;
        this.f24478w = rVar.f24345v;
        this.f24479x = rVar.f24346w;
        this.f24480y = rVar.f24347x;
        this.f24481z = rVar.f24348y;
        this.f24450A = rVar.f24349z;
        this.f24451B = rVar.f24320A == -1 ? 0 : rVar.f24320A;
        this.f24452C = rVar.f24321B != -1 ? rVar.f24321B : 0;
        this.f24453D = rVar.f24322C;
        this.f24454E = (rVar.f24323D != 0 || c1322o == null) ? rVar.f24323D : 1;
    }

    public final int a() {
        int i9;
        int i10 = this.f24472q;
        if (i10 == -1 || (i9 = this.f24473r) == -1) {
            return -1;
        }
        return i10 * i9;
    }

    public final r b() {
        return new r(this);
    }

    public final C1333s c(int i9) {
        r rVarB = b();
        rVarB.L(i9);
        return rVarB.v();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.internal.C1333s d(com.google.ads.interactivemedia.v3.internal.C1333s r14) {
        /*
            r13 = this;
            if (r13 != r14) goto L3
            return r13
        L3:
            java.lang.String r0 = r13.f24467l
            int r0 = com.google.ads.interactivemedia.v3.internal.ar.b(r0)
            java.lang.String r1 = r14.f24456a
            java.lang.String r2 = r14.f24457b
            if (r2 != 0) goto L11
            java.lang.String r2 = r13.f24457b
        L11:
            java.lang.String r3 = r13.f24458c
            r4 = 3
            r5 = 1
            if (r0 == r4) goto L1a
            if (r0 != r5) goto L1f
            r0 = 1
        L1a:
            java.lang.String r4 = r14.f24458c
            if (r4 == 0) goto L1f
            r3 = r4
        L1f:
            int r4 = r13.f24461f
            r6 = -1
            if (r4 != r6) goto L26
            int r4 = r14.f24461f
        L26:
            int r7 = r13.f24462g
            if (r7 != r6) goto L2c
            int r7 = r14.f24462g
        L2c:
            java.lang.String r6 = r13.f24464i
            if (r6 != 0) goto L3e
            java.lang.String r8 = r14.f24464i
            java.lang.String r8 = com.google.ads.interactivemedia.v3.internal.cq.K(r8, r0)
            java.lang.String[] r9 = com.google.ads.interactivemedia.v3.internal.cq.am(r8)
            int r9 = r9.length
            if (r9 != r5) goto L3e
            r6 = r8
        L3e:
            com.google.ads.interactivemedia.v3.internal.ao r5 = r13.f24465j
            if (r5 != 0) goto L45
            com.google.ads.interactivemedia.v3.internal.ao r5 = r14.f24465j
            goto L4b
        L45:
            com.google.ads.interactivemedia.v3.internal.ao r8 = r14.f24465j
            com.google.ads.interactivemedia.v3.internal.ao r5 = r5.d(r8)
        L4b:
            float r8 = r13.f24474s
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 != 0) goto L58
            r9 = 2
            if (r0 != r9) goto L58
            float r8 = r14.f24474s
        L58:
            int r0 = r13.f24459d
            int r9 = r14.f24459d
            int r10 = r13.f24460e
            int r11 = r14.f24460e
            com.google.ads.interactivemedia.v3.internal.o r14 = r14.f24470o
            com.google.ads.interactivemedia.v3.internal.o r12 = r13.f24470o
            com.google.ads.interactivemedia.v3.internal.o r14 = com.google.ads.interactivemedia.v3.internal.C1322o.c(r14, r12)
            com.google.ads.interactivemedia.v3.internal.r r12 = r13.b()
            r12.S(r1)
            r12.U(r2)
            r12.V(r3)
            r0 = r0 | r9
            r12.ag(r0)
            r0 = r10 | r11
            r12.ac(r0)
            r12.G(r4)
            r12.Z(r7)
            r12.I(r6)
            r12.X(r5)
            r12.M(r14)
            r12.P(r8)
            com.google.ads.interactivemedia.v3.internal.s r14 = r12.v()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.C1333s.d(com.google.ads.interactivemedia.v3.internal.s):com.google.ads.interactivemedia.v3.internal.s");
    }

    public final boolean e(C1333s c1333s) {
        if (this.f24469n.size() != c1333s.f24469n.size()) {
            return false;
        }
        for (int i9 = 0; i9 < this.f24469n.size(); i9++) {
            if (!Arrays.equals((byte[]) this.f24469n.get(i9), (byte[]) c1333s.f24469n.get(i9))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i9;
        if (this == obj) {
            return true;
        }
        if (obj != null && C1333s.class == obj.getClass()) {
            C1333s c1333s = (C1333s) obj;
            int i10 = this.f24455F;
            if ((i10 == 0 || (i9 = c1333s.f24455F) == 0 || i10 == i9) && this.f24459d == c1333s.f24459d && this.f24460e == c1333s.f24460e && this.f24461f == c1333s.f24461f && this.f24462g == c1333s.f24462g && this.f24468m == c1333s.f24468m && this.f24471p == c1333s.f24471p && this.f24472q == c1333s.f24472q && this.f24473r == c1333s.f24473r && this.f24475t == c1333s.f24475t && this.f24478w == c1333s.f24478w && this.f24480y == c1333s.f24480y && this.f24481z == c1333s.f24481z && this.f24450A == c1333s.f24450A && this.f24451B == c1333s.f24451B && this.f24452C == c1333s.f24452C && this.f24453D == c1333s.f24453D && this.f24454E == c1333s.f24454E && Float.compare(this.f24474s, c1333s.f24474s) == 0 && Float.compare(this.f24476u, c1333s.f24476u) == 0 && cq.V(this.f24456a, c1333s.f24456a) && cq.V(this.f24457b, c1333s.f24457b) && cq.V(this.f24464i, c1333s.f24464i) && cq.V(this.f24466k, c1333s.f24466k) && cq.V(this.f24467l, c1333s.f24467l) && cq.V(this.f24458c, c1333s.f24458c) && Arrays.equals(this.f24477v, c1333s.f24477v) && cq.V(this.f24465j, c1333s.f24465j) && cq.V(this.f24479x, c1333s.f24479x) && cq.V(this.f24470o, c1333s.f24470o) && e(c1333s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.f24455F;
        if (i9 != 0) {
            return i9;
        }
        String str = this.f24456a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.f24457b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f24458c;
        int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f24459d) * 31) + this.f24460e) * 31) + this.f24461f) * 31) + this.f24462g) * 31;
        String str4 = this.f24464i;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ao aoVar = this.f24465j;
        int iHashCode5 = (iHashCode4 + (aoVar == null ? 0 : aoVar.hashCode())) * 31;
        String str5 = this.f24466k;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f24467l;
        int iHashCode7 = ((((((((((((((((((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f24468m) * 31) + ((int) this.f24471p)) * 31) + this.f24472q) * 31) + this.f24473r) * 31) + Float.floatToIntBits(this.f24474s)) * 31) + this.f24475t) * 31) + Float.floatToIntBits(this.f24476u)) * 31) + this.f24478w) * 31) + this.f24480y) * 31) + this.f24481z) * 31) + this.f24450A) * 31) + this.f24451B) * 31) + this.f24452C) * 31) + this.f24453D) * 31) + this.f24454E;
        this.f24455F = iHashCode7;
        return iHashCode7;
    }

    public final String toString() {
        return "Format(" + this.f24456a + ", " + this.f24457b + ", " + this.f24466k + ", " + this.f24467l + ", " + this.f24464i + ", " + this.f24463h + ", " + this.f24458c + ", [" + this.f24472q + ", " + this.f24473r + ", " + this.f24474s + "], [" + this.f24480y + ", " + this.f24481z + "])";
    }
}

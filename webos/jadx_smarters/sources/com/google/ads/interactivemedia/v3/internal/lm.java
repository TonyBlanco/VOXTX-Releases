package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lm implements ku {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final lk[] f23677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xd f23678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f23679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final cy f23681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f23682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final lq f23683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private we f23684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private lu f23685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private IOException f23687k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ly f23689m;

    /* JADX WARN: Multi-variable type inference failed */
    public lm(xd xdVar, lu luVar, ly lyVar, int i9, int[] iArr, we weVar, int i10, cy cyVar, long j9, boolean z9, List list, lq lqVar, byte[] bArr) {
        zh acsVar;
        this.f23678b = xdVar;
        this.f23685i = luVar;
        this.f23689m = lyVar;
        this.f23679c = iArr;
        this.f23684h = weVar;
        this.f23680d = i10;
        this.f23681e = cyVar;
        this.f23686j = i9;
        this.f23682f = j9;
        this.f23683g = lqVar;
        long jC = luVar.c(i9);
        ArrayList arrayListM = m();
        this.f23677a = new lk[weVar.n()];
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.f23677a.length) {
            me meVar = (me) arrayListM.get(weVar.j(i12));
            lt ltVarC = lyVar.c(meVar.f23778c);
            lk[] lkVarArr = this.f23677a;
            lt ltVar = ltVarC == null ? (lt) meVar.f23778c.get(i11) : ltVarC;
            C1333s c1333s = meVar.f23777b;
            String str = c1333s.f24466k;
            ut utVar = null;
            if (!ar.p(str)) {
                if (ar.o(str)) {
                    acsVar = new abr(1);
                } else {
                    acsVar = new acs(true != z9 ? 0 : 4, null, list, lqVar);
                }
                utVar = new ut(acsVar, i10, c1333s);
            }
            int i13 = i12;
            lkVarArr[i13] = new lk(jC, meVar, ltVar, utVar, 0L, meVar.k());
            i12 = i13 + 1;
            i11 = 0;
        }
    }

    private final long k(long j9) {
        lu luVar = this.f23685i;
        long j10 = luVar.f23725a;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j9 - cq.t(j10 + luVar.d(this.f23686j).f23760b);
    }

    private final lk l(int i9) {
        lk lkVar = this.f23677a[i9];
        lt ltVarC = this.f23689m.c(lkVar.f23671b.f23778c);
        if (ltVarC == null || ltVarC.equals(lkVar.f23672c)) {
            return lkVar;
        }
        lk lkVarK = lkVar.k(ltVarC);
        this.f23677a[i9] = lkVarK;
        return lkVarK;
    }

    private final ArrayList m() {
        List list = this.f23685i.d(this.f23686j).f23761c;
        ArrayList arrayList = new ArrayList();
        for (int i9 : this.f23679c) {
            arrayList.addAll(((ls) list.get(i9)).f23717c);
        }
        return arrayList;
    }

    private static final long n(lk lkVar, ve veVar, long j9, long j10, long j11) {
        return veVar != null ? veVar.s() : cq.p(lkVar.g(j9), j10, j11);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ku
    public final void a(lu luVar, int i9) {
        try {
            this.f23685i = luVar;
            this.f23686j = i9;
            long jC = luVar.c(i9);
            ArrayList arrayListM = m();
            for (int i10 = 0; i10 < this.f23677a.length; i10++) {
                me meVar = (me) arrayListM.get(this.f23684h.j(i10));
                lk[] lkVarArr = this.f23677a;
                lkVarArr[i10] = lkVarArr[i10].i(jC, meVar);
            }
        } catch (sb e9) {
            this.f23687k = e9;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ku
    public final void b(we weVar) {
        this.f23684h = weVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.va
    public final int c(long j9, List list) {
        return (this.f23687k != null || this.f23684h.n() < 2) ? list.size() : this.f23684h.e(j9, list);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.va
    public final long d(long j9, hl hlVar) {
        for (lk lkVar : this.f23677a) {
            if (lkVar.f23673d != null) {
                long jG = lkVar.g(j9);
                long jH = lkVar.h(jG);
                long jE = lkVar.e();
                return hlVar.a(j9, jH, (jH >= j9 || (jE != -1 && jG >= (lkVar.c() + jE) + (-1))) ? jH : lkVar.h(jG + 1));
            }
        }
        return j9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.va
    public final void e(long j9, long j10, List list, uw uwVar) {
        uu vbVar;
        long j11;
        int i9;
        vg[] vgVarArr;
        int i10;
        if (this.f23687k != null) {
            return;
        }
        long j12 = j10 - j9;
        long jT = cq.t(this.f23685i.f23725a) + cq.t(this.f23685i.d(this.f23686j).f23760b) + j10;
        lq lqVar = this.f23683g;
        if (lqVar == null || !lqVar.f23700a.f(jT)) {
            long jT2 = cq.t(cq.r(this.f23682f));
            long jK = k(jT2);
            ve veVar = list.isEmpty() ? null : (ve) list.get(list.size() - 1);
            int iN = this.f23684h.n();
            vg[] vgVarArr2 = new vg[iN];
            int i11 = 0;
            while (i11 < iN) {
                lk lkVar = this.f23677a[i11];
                if (lkVar.f23673d == null) {
                    vgVarArr2[i11] = vg.f24839a;
                    vgVarArr = vgVarArr2;
                    i10 = iN;
                    j11 = jK;
                    i9 = i11;
                } else {
                    long jB = lkVar.b(jT2);
                    long jD = lkVar.d(jT2);
                    j11 = jK;
                    i9 = i11;
                    vgVarArr = vgVarArr2;
                    i10 = iN;
                    long jN = n(lkVar, veVar, j10, jB, jD);
                    if (jN < jB) {
                        vgVarArr[i9] = vg.f24839a;
                    } else {
                        vgVarArr[i9] = new ll(l(i9), jN, jD);
                    }
                }
                i11 = i9 + 1;
                jK = j11;
                vgVarArr2 = vgVarArr;
                iN = i10;
            }
            long j13 = jK;
            this.f23684h.d(j12, !this.f23685i.f23728d ? -9223372036854775807L : Math.max(0L, Math.min(k(jT2), this.f23677a[0].f(this.f23677a[0].d(jT2))) - j9), list, vgVarArr2);
            lk lkVarL = l(this.f23684h.a());
            uv uvVar = lkVarL.f23670a;
            if (uvVar != null) {
                me meVar = lkVarL.f23671b;
                mb mbVarN = uvVar.d() == null ? meVar.n() : null;
                mb mbVarL = lkVarL.f23673d == null ? meVar.l() : null;
                if (mbVarN != null || mbVarL != null) {
                    cy cyVar = this.f23681e;
                    C1333s c1333sP = this.f23684h.p();
                    int iB = this.f23684h.b();
                    this.f23684h.c();
                    me meVar2 = lkVarL.f23671b;
                    if (mbVarN == null || (mbVarL = mbVarN.b(mbVarL, lkVarL.f23672c.f23721a)) != null) {
                        mbVarN = mbVarL;
                    }
                    uwVar.f24788a = new vd(cyVar, pi.e(meVar2, lkVarL.f23672c.f23721a, mbVarN, 0), c1333sP, iB, lkVarL.f23670a);
                    return;
                }
            }
            long j14 = lkVarL.f23674e;
            boolean z9 = j14 != -9223372036854775807L;
            if (lkVarL.e() == 0) {
                uwVar.f24789b = z9;
                return;
            }
            long jB2 = lkVarL.b(jT2);
            long jD2 = lkVarL.d(jT2);
            boolean z10 = z9;
            long jN2 = n(lkVarL, veVar, j10, jB2, jD2);
            if (jN2 < jB2) {
                this.f23687k = new sb();
                return;
            }
            if (jN2 > jD2 || (this.f23688l && jN2 >= jD2)) {
                uwVar.f24789b = z10;
                return;
            }
            if (z10 && lkVarL.h(jN2) >= j14) {
                uwVar.f24789b = true;
                return;
            }
            int iMin = (int) Math.min(1L, (jD2 - jN2) + 1);
            if (j14 != -9223372036854775807L) {
                for (int i12 = 1; iMin > i12 && lkVarL.h((((long) iMin) + jN2) - 1) >= j14; i12 = 1) {
                    iMin--;
                }
            }
            long j15 = true != list.isEmpty() ? -9223372036854775807L : j10;
            cy cyVar2 = this.f23681e;
            int i13 = this.f23680d;
            C1333s c1333sP2 = this.f23684h.p();
            int iB2 = this.f23684h.b();
            this.f23684h.c();
            me meVar3 = lkVarL.f23671b;
            long jH = lkVarL.h(jN2);
            mb mbVarL2 = lkVarL.l(jN2);
            if (lkVarL.f23670a == null) {
                vbVar = new vh(cyVar2, pi.e(meVar3, lkVarL.f23672c.f23721a, mbVarL2, true != lkVarL.m(jN2, j13) ? 8 : 0), c1333sP2, iB2, jH, lkVarL.f(jN2), jN2, i13, c1333sP2);
            } else {
                int i14 = 1;
                int i15 = 1;
                while (i14 < iMin) {
                    mb mbVarB = mbVarL2.b(lkVarL.l(((long) i14) + jN2), lkVarL.f23672c.f23721a);
                    if (mbVarB == null) {
                        break;
                    }
                    i15++;
                    i14++;
                    mbVarL2 = mbVarB;
                }
                long j16 = (((long) i15) + jN2) - 1;
                long jF = lkVarL.f(j16);
                long j17 = lkVarL.f23674e;
                vbVar = new vb(cyVar2, pi.e(meVar3, lkVarL.f23672c.f23721a, mbVarL2, true != lkVarL.m(j16, j13) ? 8 : 0), c1333sP2, iB2, jH, jF, j15, (j17 == -9223372036854775807L || j17 > jF) ? -9223372036854775807L : j17, jN2, i15, -meVar3.f23779d, lkVarL.f23670a);
            }
            uwVar.f24788a = vbVar;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.va
    public final void f() throws IOException {
        IOException iOException = this.f23687k;
        if (iOException != null) {
            throw iOException;
        }
        this.f23678b.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.va
    public final void g(uu uuVar) {
        yz yzVarA;
        if (uuVar instanceof vd) {
            int iM = this.f23684h.m(((vd) uuVar).f24782i);
            lk lkVar = this.f23677a[iM];
            if (lkVar.f23673d == null && (yzVarA = lkVar.f23670a.a()) != null) {
                this.f23677a[iM] = lkVar.j(new lj(yzVarA, lkVar.f23671b.f23779d));
            }
        }
        lq lqVar = this.f23683g;
        if (lqVar != null) {
            lqVar.c(uuVar);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.va
    public final void h() {
        for (lk lkVar : this.f23677a) {
            uv uvVar = lkVar.f23670a;
            if (uvVar != null) {
                uvVar.b();
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.va
    public final void i(long j9, uu uuVar, List list) {
        if (this.f23687k != null) {
            return;
        }
        this.f23684h.t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.va
    public final boolean j(uu uuVar, boolean z9, bdz bdzVar, ws wsVar) {
        wv wvVarD;
        if (!z9) {
            return false;
        }
        lq lqVar = this.f23683g;
        if (lqVar != null && lqVar.g(uuVar)) {
            return true;
        }
        if (!this.f23685i.f23728d && (uuVar instanceof ve)) {
            Object obj = bdzVar.f21124a;
            if ((obj instanceof dq) && ((dq) obj).f22734c == 404) {
                long jE = this.f23677a[this.f23684h.m(uuVar.f24782i)].e();
                if (jE != -1 && jE != 0) {
                    if (((ve) uuVar).s() > (r11.c() + jE) - 1) {
                        this.f23688l = true;
                        return true;
                    }
                }
            }
        }
        lk lkVar = this.f23677a[this.f23684h.m(uuVar.f24782i)];
        lt ltVarC = this.f23689m.c(lkVar.f23671b.f23778c);
        if (ltVarC != null && !lkVar.f23672c.equals(ltVarC)) {
            return true;
        }
        we weVar = this.f23684h;
        avo avoVar = lkVar.f23671b.f23778c;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iN = weVar.n();
        int i9 = 0;
        for (int i10 = 0; i10 < iN; i10++) {
            if (weVar.s(i10, jElapsedRealtime)) {
                i9++;
            }
        }
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < avoVar.size(); i11++) {
            hashSet.add(Integer.valueOf(((lt) avoVar.get(i11)).f23723c));
        }
        int size = hashSet.size();
        wu wuVar = new wu(size, size - this.f23689m.b(avoVar), iN, i9);
        if ((wuVar.a(2) || wuVar.a(1)) && (wvVarD = ws.d(wuVar, bdzVar)) != null) {
            int i12 = wvVarD.f25018a;
            if (wuVar.a(i12)) {
                if (i12 == 2) {
                    we weVar2 = this.f23684h;
                    return weVar2.r(weVar2.m(uuVar.f24782i), wvVarD.f25019b);
                }
                this.f23689m.d(lkVar.f23672c, wvVarD.f25019b);
                return true;
            }
        }
        return false;
    }
}

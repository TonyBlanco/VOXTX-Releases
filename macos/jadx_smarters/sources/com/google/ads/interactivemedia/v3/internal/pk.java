package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class pk implements ww, wz, uh, zk, ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f24056a = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f24057A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f24058B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f24059C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f24060D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f24061E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private C1333s f24062F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private C1333s f24063G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f24064H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private um f24065I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Set f24066J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int[] f24067K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f24068L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f24069M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean[] f24070N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean[] f24071O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private long f24072P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private long f24073Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f24074R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f24075S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f24076T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f24077U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private long f24078V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private C1322o f24079W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private oy f24080X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final wr f24081Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final ws f24082Z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f24084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final pg f24085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ow f24086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1333s f24087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final nt f24088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final nn f24089i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final tj f24091k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f24094n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f24095o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f24096p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f24097q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Handler f24098r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList f24099s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f24100t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private uu f24101u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private pj[] f24102v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Set f24104x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final SparseIntArray f24105y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private aae f24106z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f24092l = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final xc f24090j = new xc("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final os f24093m = new os();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f24103w = new int[0];

    public pk(String str, int i9, pg pgVar, ow owVar, Map map, wr wrVar, long j9, C1333s c1333s, nt ntVar, nn nnVar, ws wsVar, tj tjVar, int i10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f24083c = str;
        this.f24084d = i9;
        this.f24085e = pgVar;
        this.f24086f = owVar;
        this.f24100t = map;
        this.f24081Y = wrVar;
        this.f24087g = c1333s;
        this.f24088h = ntVar;
        this.f24089i = nnVar;
        this.f24082Z = wsVar;
        this.f24091k = tjVar;
        Set set = f24056a;
        this.f24104x = new HashSet(set.size());
        this.f24105y = new SparseIntArray(set.size());
        this.f24102v = new pj[0];
        this.f24071O = new boolean[0];
        this.f24070N = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f24094n = arrayList;
        this.f24095o = Collections.unmodifiableList(arrayList);
        this.f24099s = new ArrayList();
        this.f24096p = new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.pe
            @Override // java.lang.Runnable
            public final void run() {
                this.f24045a.R();
            }
        };
        this.f24097q = new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.pf
            @Override // java.lang.Runnable
            public final void run() {
                pk.j(this.f24046a);
            }
        };
        this.f24098r = cq.A();
        this.f24072P = j9;
        this.f24073Q = j9;
    }

    private static int K(int i9) {
        if (i9 == 1) {
            return 2;
        }
        if (i9 != 2) {
            return i9 != 3 ? 0 : 1;
        }
        return 3;
    }

    private static C1333s L(C1333s c1333s, C1333s c1333s2, boolean z9) {
        String strF;
        String strG;
        if (c1333s == null) {
            return c1333s2;
        }
        int iB = ar.b(c1333s2.f24467l);
        if (cq.h(c1333s.f24464i, iB) == 1) {
            strF = cq.K(c1333s.f24464i, iB);
            strG = ar.g(strF);
        } else {
            strF = ar.f(c1333s.f24464i, c1333s2.f24467l);
            strG = c1333s2.f24467l;
        }
        r rVarB = c1333s2.b();
        rVarB.S(c1333s.f24456a);
        rVarB.U(c1333s.f24457b);
        rVarB.V(c1333s.f24458c);
        rVarB.ag(c1333s.f24459d);
        rVarB.ac(c1333s.f24460e);
        rVarB.G(z9 ? c1333s.f24461f : -1);
        rVarB.Z(z9 ? c1333s.f24462g : -1);
        rVarB.I(strF);
        if (iB == 2) {
            rVarB.aj(c1333s.f24472q);
            rVarB.Q(c1333s.f24473r);
            rVarB.P(c1333s.f24474s);
            iB = 2;
        }
        if (strG != null) {
            rVarB.ae(strG);
        }
        int i9 = c1333s.f24480y;
        if (i9 != -1 && iB == 1) {
            rVarB.H(i9);
        }
        ao aoVarD = c1333s.f24465j;
        if (aoVarD != null) {
            ao aoVar = c1333s2.f24465j;
            if (aoVar != null) {
                aoVarD = aoVar.d(aoVarD);
            }
            rVarB.X(aoVarD);
        }
        return rVarB.v();
    }

    private final oy M() {
        return (oy) this.f24094n.get(r0.size() - 1);
    }

    private final um N(bf[] bfVarArr) {
        for (int i9 = 0; i9 < bfVarArr.length; i9++) {
            bf bfVar = bfVarArr[i9];
            C1333s[] c1333sArr = new C1333s[bfVar.f21163a];
            for (int i10 = 0; i10 < bfVar.f21163a; i10++) {
                C1333s c1333sB = bfVar.b(i10);
                c1333sArr[i10] = c1333sB.c(this.f24088h.b(c1333sB));
            }
            bfVarArr[i9] = new bf(bfVar.f21164b, c1333sArr);
        }
        return new um(bfVarArr);
    }

    private static zg O(int i9, int i10) {
        cd.e("HlsSampleStreamWrapper", "Unmapped track with id " + i9 + " of type " + i10);
        return new zg();
    }

    private final void P() {
        af.w(this.f24060D);
        af.s(this.f24065I);
        af.s(this.f24066J);
    }

    private final void Q(int i9) {
        int i10;
        af.w(!this.f24090j.m());
        loop0: while (true) {
            if (i9 >= this.f24094n.size()) {
                i9 = -1;
                break;
            }
            int i11 = i9;
            while (true) {
                if (i11 >= this.f24094n.size()) {
                    oy oyVar = (oy) this.f24094n.get(i9);
                    while (i10 < this.f24102v.length) {
                        i10 = this.f24102v[i10].k() <= oyVar.a(i10) ? i10 + 1 : 0;
                    }
                    break loop0;
                } else if (((oy) this.f24094n.get(i11)).f23983d) {
                    break;
                } else {
                    i11++;
                }
            }
            i9++;
        }
        if (i9 == -1) {
            return;
        }
        long j9 = M().f24786m;
        oy oyVar2 = (oy) this.f24094n.get(i9);
        ArrayList arrayList = this.f24094n;
        cq.T(arrayList, i9, arrayList.size());
        for (int i12 = 0; i12 < this.f24102v.length; i12++) {
            this.f24102v[i12].w(oyVar2.a(i12));
        }
        if (this.f24094n.isEmpty()) {
            this.f24073Q = this.f24072P;
        } else {
            ((oy) axo.z(this.f24094n)).d();
        }
        this.f24076T = false;
        this.f24091k.n(this.f24057A, oyVar2.f24785l, j9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        C1333s c1333s;
        if (!this.f24064H && this.f24067K == null && this.f24059C) {
            for (pj pjVar : this.f24102v) {
                if (pjVar.t() == null) {
                    return;
                }
            }
            um umVar = this.f24065I;
            if (umVar != null) {
                int i9 = umVar.f24749b;
                int[] iArr = new int[i9];
                this.f24067K = iArr;
                Arrays.fill(iArr, -1);
                for (int i10 = 0; i10 < i9; i10++) {
                    int i11 = 0;
                    while (true) {
                        pj[] pjVarArr = this.f24102v;
                        if (i11 < pjVarArr.length) {
                            C1333s c1333sT = pjVarArr[i11].t();
                            af.t(c1333sT);
                            C1333s c1333sB = this.f24065I.b(i10).b(0);
                            String str = c1333sT.f24467l;
                            String str2 = c1333sB.f24467l;
                            int iB = ar.b(str);
                            if (iB == 3) {
                                if (cq.V(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || c1333sT.f24453D == c1333sB.f24453D)) {
                                    break;
                                } else {
                                    i11++;
                                }
                            } else if (iB == ar.b(str2)) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    this.f24067K[i10] = i11;
                }
                ArrayList arrayList = this.f24099s;
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((pd) arrayList.get(i12)).c();
                }
                return;
            }
            int length = this.f24102v.length;
            int i13 = 0;
            int i14 = -2;
            int i15 = -1;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                C1333s c1333sT2 = this.f24102v[i13].t();
                af.t(c1333sT2);
                String str3 = c1333sT2.f24467l;
                int i16 = ar.q(str3) ? 2 : ar.m(str3) ? 1 : ar.p(str3) ? 3 : -2;
                if (K(i16) > K(i14)) {
                    i15 = i13;
                    i14 = i16;
                } else if (i16 == i14) {
                    i15 = -1;
                }
                i13++;
            }
            bf bfVarD = this.f24086f.d();
            int i17 = bfVarD.f21163a;
            this.f24068L = -1;
            this.f24067K = new int[length];
            for (int i18 = 0; i18 < length; i18++) {
                this.f24067K[i18] = i18;
            }
            bf[] bfVarArr = new bf[length];
            int i19 = 0;
            while (i19 < length) {
                C1333s c1333sT3 = this.f24102v[i19].t();
                af.t(c1333sT3);
                if (i19 == i15) {
                    C1333s[] c1333sArr = new C1333s[i17];
                    for (int i20 = 0; i20 < i17; i20++) {
                        C1333s c1333sB2 = bfVarD.b(i20);
                        if (i14 == 1 && (c1333s = this.f24087g) != null) {
                            c1333sB2 = c1333sB2.d(c1333s);
                        }
                        c1333sArr[i20] = i17 == 1 ? c1333sT3.d(c1333sB2) : L(c1333sB2, c1333sT3, true);
                    }
                    bfVarArr[i19] = new bf(this.f24083c, c1333sArr);
                    this.f24068L = i19;
                } else {
                    C1333s c1333s2 = null;
                    if (i14 == 2 && ar.m(c1333sT3.f24467l)) {
                        c1333s2 = this.f24087g;
                    }
                    bfVarArr[i19] = new bf(this.f24083c + ":muxed:" + (i19 < i15 ? i19 : i19 - 1), L(c1333s2, c1333sT3, false));
                }
                i19++;
            }
            this.f24065I = N(bfVarArr);
            af.w(this.f24066J == null);
            this.f24066J = Collections.emptySet();
            T();
            this.f24085e.n();
        }
    }

    private final void S() {
        for (pj pjVar : this.f24102v) {
            pjVar.C(this.f24074R);
        }
        this.f24074R = false;
    }

    private final void T() {
        this.f24060D = true;
    }

    private final boolean U() {
        return this.f24073Q != -9223372036854775807L;
    }

    public static /* synthetic */ void j(pk pkVar) {
        pkVar.f24059C = true;
        pkVar.R();
    }

    public final void A(long j9) {
        if (this.f24078V != j9) {
            this.f24078V = j9;
            for (pj pjVar : this.f24102v) {
                pjVar.D(j9);
            }
        }
    }

    public final void B(int i9) {
        P();
        af.s(this.f24067K);
        int i10 = this.f24067K[i9];
        af.w(this.f24070N[i10]);
        this.f24070N[i10] = false;
    }

    public final boolean C(int i9) {
        return !U() && this.f24102v[i9].K(this.f24076T);
    }

    public final boolean D() {
        return this.f24057A == 2;
    }

    public final boolean E(long j9, boolean z9) {
        this.f24072P = j9;
        if (U()) {
            this.f24073Q = j9;
            return true;
        }
        if (this.f24059C && !z9) {
            int length = this.f24102v.length;
            for (int i9 = 0; i9 < length; i9++) {
                if (this.f24102v[i9].M(j9, false) || (!this.f24071O[i9] && this.f24069M)) {
                }
            }
            return false;
        }
        this.f24073Q = j9;
        this.f24076T = false;
        this.f24094n.clear();
        xc xcVar = this.f24090j;
        if (xcVar.m()) {
            if (this.f24059C) {
                for (pj pjVar : this.f24102v) {
                    pjVar.u();
                }
            }
            this.f24090j.g();
        } else {
            xcVar.h();
            S();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F(com.google.ads.interactivemedia.v3.internal.we[] r20, boolean[] r21, com.google.ads.interactivemedia.v3.internal.uf[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.pk.F(com.google.ads.interactivemedia.v3.internal.we[], boolean[], com.google.ads.interactivemedia.v3.internal.uf[], boolean[], long, boolean):boolean");
    }

    public final void G(long j9) {
        if (!this.f24059C || U()) {
            return;
        }
        int length = this.f24102v.length;
        for (int i9 = 0; i9 < length; i9++) {
            this.f24102v[i9].P(j9, this.f24070N[i9]);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ud
    public final void H() {
        this.f24098r.post(this.f24096p);
    }

    public final void I(bf[] bfVarArr, int... iArr) {
        this.f24065I = N(bfVarArr);
        this.f24066J = new HashSet();
        for (int i9 : iArr) {
            this.f24066J.add(this.f24065I.b(i9));
        }
        this.f24068L = 0;
        this.f24098r.post(new ky(this.f24085e, 3));
        T();
    }

    public final boolean J(Uri uri, bdz bdzVar, boolean z9) {
        wv wvVarD;
        if (!this.f24086f.m(uri)) {
            return true;
        }
        long j9 = (z9 || (wvVarD = ws.d(ws.b(this.f24086f.e()), bdzVar)) == null || wvVarD.f25018a != 2) ? -9223372036854775807L : wvVarD.f25019b;
        return this.f24086f.n(uri, j9) && j9 != -9223372036854775807L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final /* bridge */ /* synthetic */ void bj(wy wyVar, long j9, long j10) {
        uu uuVar = (uu) wyVar;
        this.f24101u = null;
        this.f24086f.h(uuVar);
        long j11 = uuVar.f24779f;
        uuVar.l();
        uuVar.m();
        uuVar.k();
        this.f24091k.q(new sw(), uuVar.f24781h, this.f24084d, uuVar.f24782i, uuVar.f24783j, uuVar.f24785l, uuVar.f24786m);
        if (this.f24060D) {
            this.f24085e.g(this);
        } else {
            o(this.f24072P);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final /* bridge */ /* synthetic */ wv bk(wy wyVar, long j9, long j10, IOException iOException, int i9) {
        wv wvVarN;
        int i10;
        uu uuVar = (uu) wyVar;
        boolean z9 = uuVar instanceof oy;
        if (z9 && !((oy) uuVar).h() && (iOException instanceof dq) && ((i10 = ((dq) iOException).f22734c) == 410 || i10 == 404)) {
            return xc.f25036a;
        }
        long jK = uuVar.k();
        uuVar.l();
        uuVar.m();
        sw swVar = new sw();
        int i11 = cq.f22640a;
        bdz bdzVar = new bdz(iOException, i9);
        wv wvVarD = ws.d(ws.b(this.f24086f.e()), bdzVar);
        boolean zL = (wvVarD == null || wvVarD.f25018a != 2) ? false : this.f24086f.l(uuVar, wvVarD.f25019b);
        if (zL) {
            if (z9 && jK == 0) {
                ArrayList arrayList = this.f24094n;
                af.w(((oy) arrayList.remove(arrayList.size() + (-1))) == uuVar);
                if (this.f24094n.isEmpty()) {
                    this.f24073Q = this.f24072P;
                } else {
                    ((oy) axo.z(this.f24094n)).d();
                }
            }
            wvVarN = xc.f25037b;
        } else {
            long jE = ws.e(bdzVar);
            wvVarN = jE != -9223372036854775807L ? xc.n(false, jE) : xc.f25038c;
        }
        wv wvVar = wvVarN;
        boolean z10 = !wvVar.a();
        this.f24091k.r(swVar, uuVar.f24781h, this.f24084d, uuVar.f24782i, uuVar.f24783j, uuVar.f24785l, uuVar.f24786m, iOException, z10);
        if (z10) {
            this.f24101u = null;
        }
        if (zL) {
            if (this.f24060D) {
                this.f24085e.g(this);
            } else {
                o(this.f24072P);
            }
        }
        return wvVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final /* bridge */ /* synthetic */ void bn(wy wyVar, long j9, long j10, boolean z9) {
        uu uuVar = (uu) wyVar;
        this.f24101u = null;
        long j11 = uuVar.f24779f;
        uuVar.l();
        uuVar.m();
        uuVar.k();
        this.f24091k.p(new sw(), uuVar.f24781h, this.f24084d, uuVar.f24782i, uuVar.f24783j, uuVar.f24785l, uuVar.f24786m);
        if (z9) {
            return;
        }
        if (U() || this.f24061E == 0) {
            S();
        }
        if (this.f24061E > 0) {
            this.f24085e.g(this);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    @Override // com.google.ads.interactivemedia.v3.internal.uh
    public final long bo() {
        /*
            r7 = this;
            boolean r0 = r7.f24076T
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.U()
            if (r0 == 0) goto L10
            long r0 = r7.f24073Q
            return r0
        L10:
            long r0 = r7.f24072P
            com.google.ads.interactivemedia.v3.internal.oy r2 = r7.M()
            boolean r3 = r2.g()
            if (r3 != 0) goto L35
            java.util.ArrayList r2 = r7.f24094n
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L34
            java.util.ArrayList r2 = r7.f24094n
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            com.google.ads.interactivemedia.v3.internal.oy r2 = (com.google.ads.interactivemedia.v3.internal.oy) r2
            goto L35
        L34:
            r2 = 0
        L35:
            if (r2 == 0) goto L3d
            long r2 = r2.f24786m
            long r0 = java.lang.Math.max(r0, r2)
        L3d:
            boolean r2 = r7.f24059C
            if (r2 == 0) goto L54
            com.google.ads.interactivemedia.v3.internal.pj[] r2 = r7.f24102v
            int r3 = r2.length
            r4 = 0
        L45:
            if (r4 >= r3) goto L54
            r5 = r2[r4]
            long r5 = r5.r()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L45
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.pk.bo():long");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uh
    public final long c() {
        if (U()) {
            return this.f24073Q;
        }
        if (this.f24076T) {
            return Long.MIN_VALUE;
        }
        return M().f24786m;
    }

    public final int d(int i9) {
        P();
        af.s(this.f24067K);
        int i10 = this.f24067K[i9];
        if (i10 == -1) {
            return this.f24066J.contains(this.f24065I.b(i9)) ? -3 : -2;
        }
        boolean[] zArr = this.f24070N;
        if (zArr[i10]) {
            return -2;
        }
        zArr[i10] = true;
        return i10;
    }

    public final int e(int i9, go goVar, ef efVar, int i10) {
        C1333s c1333s;
        if (U()) {
            return -3;
        }
        int i11 = 0;
        if (!this.f24094n.isEmpty()) {
            int i12 = 0;
            loop0: while (i12 < this.f24094n.size() - 1) {
                int i13 = ((oy) this.f24094n.get(i12)).f23980a;
                int length = this.f24102v.length;
                for (int i14 = 0; i14 < length; i14++) {
                    if (this.f24070N[i14] && this.f24102v[i14].n() == i13) {
                        break loop0;
                    }
                }
                i12++;
            }
            cq.T(this.f24094n, 0, i12);
            oy oyVar = (oy) this.f24094n.get(0);
            C1333s c1333s2 = oyVar.f24782i;
            if (!c1333s2.equals(this.f24063G)) {
                this.f24091k.o(this.f24084d, c1333s2, oyVar.f24783j, oyVar.f24785l);
            }
            this.f24063G = c1333s2;
        }
        if (!this.f24094n.isEmpty() && !((oy) this.f24094n.get(0)).h()) {
            return -3;
        }
        int iO = this.f24102v[i9].o(goVar, efVar, i10, this.f24076T);
        if (iO == -5) {
            C1333s c1333sD = goVar.f23064b;
            af.s(c1333sD);
            if (i9 == this.f24058B) {
                int iN = this.f24102v[i9].n();
                while (i11 < this.f24094n.size() && ((oy) this.f24094n.get(i11)).f23980a != iN) {
                    i11++;
                }
                if (i11 < this.f24094n.size()) {
                    c1333s = ((oy) this.f24094n.get(i11)).f24782i;
                } else {
                    c1333s = this.f24062F;
                    af.s(c1333s);
                }
                c1333sD = c1333sD.d(c1333s);
            }
            goVar.f23064b = c1333sD;
        }
        return iO;
    }

    public final int f(int i9, long j9) {
        if (U()) {
            return 0;
        }
        pj pjVar = this.f24102v[i9];
        int iL = pjVar.l(j9, this.f24076T);
        oy oyVar = (oy) axo.C(this.f24094n);
        if (oyVar != null && !oyVar.h()) {
            iL = Math.min(iL, oyVar.a(i9) - pjVar.k());
        }
        pjVar.G(iL);
        return iL;
    }

    public final long g(long j9, hl hlVar) {
        return this.f24086f.c(j9, hlVar);
    }

    public final um h() {
        P();
        return this.f24065I;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    @Override // com.google.ads.interactivemedia.v3.internal.zk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.internal.aae i(int r10, int r11) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.pk.i(int, int):com.google.ads.interactivemedia.v3.internal.aae");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uh
    public final void l(long j9) {
        xc xcVar = this.f24090j;
        if (xcVar.l() || U()) {
            return;
        }
        if (xcVar.m()) {
            af.s(this.f24101u);
            this.f24086f.p(j9, this.f24101u, this.f24095o);
            return;
        }
        int size = this.f24095o.size();
        while (size > 0) {
            int i9 = size - 1;
            if (this.f24086f.a((oy) this.f24095o.get(i9)) != 2) {
                break;
            } else {
                size = i9;
            }
        }
        if (size < this.f24095o.size()) {
            Q(size);
        }
        int iB = this.f24086f.b(j9, this.f24095o);
        if (iB < this.f24094n.size()) {
            Q(iB);
        }
    }

    public final void m() {
        if (this.f24060D) {
            return;
        }
        o(this.f24072P);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zk
    public final void n() {
        this.f24077U = true;
        this.f24098r.post(this.f24097q);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uh
    public final boolean o(long j9) {
        List listEmptyList;
        long jMax;
        if (!this.f24076T) {
            xc xcVar = this.f24090j;
            if (!xcVar.m() && !xcVar.l()) {
                if (U()) {
                    listEmptyList = Collections.emptyList();
                    jMax = this.f24073Q;
                    for (pj pjVar : this.f24102v) {
                        pjVar.E(this.f24073Q);
                    }
                } else {
                    listEmptyList = this.f24095o;
                    oy oyVarM = M();
                    jMax = oyVarM.g() ? oyVarM.f24786m : Math.max(this.f24072P, oyVarM.f24785l);
                }
                List list = listEmptyList;
                long j10 = jMax;
                this.f24093m.a();
                this.f24086f.f(j9, j10, list, this.f24060D || !list.isEmpty(), this.f24093m);
                os osVar = this.f24093m;
                boolean z9 = osVar.f23937b;
                uu uuVar = osVar.f23936a;
                Uri uri = osVar.f23938c;
                if (z9) {
                    this.f24073Q = -9223372036854775807L;
                    this.f24076T = true;
                    return true;
                }
                if (uuVar == null) {
                    if (uri != null) {
                        this.f24085e.m(uri);
                    }
                    return false;
                }
                if (uuVar instanceof oy) {
                    oy oyVar = (oy) uuVar;
                    this.f24080X = oyVar;
                    this.f24062F = oyVar.f24782i;
                    this.f24073Q = -9223372036854775807L;
                    this.f24094n.add(oyVar);
                    avk avkVarJ = avo.j();
                    for (pj pjVar2 : this.f24102v) {
                        avkVarJ.g(Integer.valueOf(pjVar2.m()));
                    }
                    oyVar.c(this, avkVarJ.f());
                    for (pj pjVar3 : this.f24102v) {
                        pjVar3.g(oyVar);
                        if (oyVar.f23983d) {
                            pjVar3.I();
                        }
                    }
                }
                this.f24101u = uuVar;
                this.f24090j.b(uuVar, this, ws.c(uuVar.f24781h));
                this.f24091k.s(new sw(uuVar.f24780g), uuVar.f24781h, this.f24084d, uuVar.f24782i, uuVar.f24783j, uuVar.f24785l, uuVar.f24786m);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uh
    public final boolean p() {
        return this.f24090j.m();
    }

    public final void q() throws IOException {
        this.f24090j.a();
        this.f24086f.g();
    }

    public final void r(int i9) throws IOException {
        q();
        this.f24102v[i9].y();
    }

    public final void s() throws IOException {
        q();
        if (this.f24076T && !this.f24060D) {
            throw as.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wz
    public final void t() {
        for (pj pjVar : this.f24102v) {
            pjVar.A();
        }
    }

    public final void u() {
        this.f24104x.clear();
    }

    public final void v() {
        if (this.f24094n.isEmpty()) {
            return;
        }
        oy oyVar = (oy) axo.z(this.f24094n);
        int iA = this.f24086f.a(oyVar);
        if (iA == 1) {
            oyVar.f();
            return;
        }
        if (iA != 2 || this.f24076T) {
            return;
        }
        xc xcVar = this.f24090j;
        if (xcVar.m()) {
            xcVar.g();
        }
    }

    public final void w() {
        if (this.f24060D) {
            for (pj pjVar : this.f24102v) {
                pjVar.z();
            }
        }
        this.f24090j.k(this);
        this.f24098r.removeCallbacksAndMessages(null);
        this.f24064H = true;
        this.f24099s.clear();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zk
    public final void x(aab aabVar) {
    }

    public final void y(C1322o c1322o) {
        if (cq.V(this.f24079W, c1322o)) {
            return;
        }
        this.f24079W = c1322o;
        int i9 = 0;
        while (true) {
            pj[] pjVarArr = this.f24102v;
            if (i9 >= pjVarArr.length) {
                return;
            }
            if (this.f24071O[i9]) {
                pjVarArr[i9].d(c1322o);
            }
            i9++;
        }
    }

    public final void z(boolean z9) {
        this.f24086f.j(z9);
    }
}

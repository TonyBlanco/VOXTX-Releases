package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class tv implements td, zk, ww, wz, ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f24622a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C1333s f24623c;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f24625B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f24626C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f24627D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f24628E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f24629F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f24631H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f24632I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f24633J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f24634K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final wr f24635L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final ws f24637N;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Uri f24638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final cy f24639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final nt f24640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final tj f24641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final nn f24642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final tr f24643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f24644j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final tl f24646l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private tc f24650p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private aao f24651q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f24654t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f24655u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f24656v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private tu f24657w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private aab f24658x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f24660z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final xc f24645k = new xc("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final agp f24636M = new agp();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f24647m = new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.tm
        @Override // java.lang.Runnable
        public final void run() {
            this.f24595a.P();
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f24648n = new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.tn
        @Override // java.lang.Runnable
        public final void run() {
            this.f24596a.C();
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Handler f24649o = cq.A();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private tt[] f24653s = new tt[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ue[] f24652r = new ue[0];

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private long f24630G = -9223372036854775807L;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f24659y = -9223372036854775807L;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f24624A = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f24622a = Collections.unmodifiableMap(map);
        r rVar = new r();
        rVar.S("icy");
        rVar.ae("application/x-icy");
        f24623c = rVar.v();
    }

    public tv(Uri uri, cy cyVar, tl tlVar, nt ntVar, nn nnVar, ws wsVar, tj tjVar, tr trVar, wr wrVar, int i9, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f24638d = uri;
        this.f24639e = cyVar;
        this.f24640f = ntVar;
        this.f24642h = nnVar;
        this.f24637N = wsVar;
        this.f24641g = tjVar;
        this.f24643i = trVar;
        this.f24635L = wrVar;
        this.f24644j = i9;
        this.f24646l = tlVar;
    }

    private final int L() {
        int iM = 0;
        for (ue ueVar : this.f24652r) {
            iM += ueVar.m();
        }
        return iM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long M(boolean r6) {
        /*
            r5 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            com.google.ads.interactivemedia.v3.internal.ue[] r3 = r5.f24652r
            int r3 = r3.length
            if (r2 >= r3) goto L24
            if (r6 != 0) goto L15
            com.google.ads.interactivemedia.v3.internal.tu r3 = r5.f24657w
            com.google.ads.interactivemedia.v3.internal.af.s(r3)
            boolean[] r3 = r3.f24620c
            boolean r3 = r3[r2]
            if (r3 == 0) goto L21
        L15:
            com.google.ads.interactivemedia.v3.internal.ue[] r3 = r5.f24652r
            r3 = r3[r2]
            long r3 = r3.r()
            long r0 = java.lang.Math.max(r0, r3)
        L21:
            int r2 = r2 + 1
            goto L3
        L24:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.tv.M(boolean):long");
    }

    private final aae N(tt ttVar) {
        int length = this.f24652r.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (ttVar.equals(this.f24653s[i9])) {
                return this.f24652r[i9];
            }
        }
        ue ueVarN = ue.N(this.f24635L, this.f24640f, this.f24642h);
        ueVarN.F(this);
        int i10 = length + 1;
        tt[] ttVarArr = (tt[]) Arrays.copyOf(this.f24653s, i10);
        ttVarArr[length] = ttVar;
        this.f24653s = (tt[]) cq.af(ttVarArr);
        ue[] ueVarArr = (ue[]) Arrays.copyOf(this.f24652r, i10);
        ueVarArr[length] = ueVarN;
        this.f24652r = (ue[]) cq.af(ueVarArr);
        return ueVarN;
    }

    private final void O() {
        af.w(this.f24655u);
        af.s(this.f24657w);
        af.s(this.f24658x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        int i9;
        if (this.f24634K || this.f24655u || !this.f24654t || this.f24658x == null) {
            return;
        }
        for (ue ueVar : this.f24652r) {
            if (ueVar.t() == null) {
                return;
            }
        }
        this.f24636M.g();
        int length = this.f24652r.length;
        bf[] bfVarArr = new bf[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            C1333s c1333sT = this.f24652r[i10].t();
            af.s(c1333sT);
            String str = c1333sT.f24467l;
            boolean zM = ar.m(str);
            boolean z9 = zM || ar.q(str);
            zArr[i10] = z9;
            this.f24656v = z9 | this.f24656v;
            aao aaoVar = this.f24651q;
            if (aaoVar != null) {
                if (zM || this.f24653s[i10].f24617b) {
                    ao aoVar = c1333sT.f24465j;
                    ao aoVar2 = aoVar == null ? new ao(aaoVar) : aoVar.c(aaoVar);
                    r rVarB = c1333sT.b();
                    rVarB.X(aoVar2);
                    c1333sT = rVarB.v();
                }
                if (zM && c1333sT.f24461f == -1 && c1333sT.f24462g == -1 && (i9 = aaoVar.f18670a) != -1) {
                    r rVarB2 = c1333sT.b();
                    rVarB2.G(i9);
                    c1333sT = rVarB2.v();
                }
            }
            bfVarArr[i10] = new bf(Integer.toString(i10), c1333sT.c(this.f24640f.b(c1333sT)));
        }
        this.f24657w = new tu(new um(bfVarArr), zArr);
        this.f24655u = true;
        tc tcVar = this.f24650p;
        af.s(tcVar);
        tcVar.bl(this);
    }

    private final void Q(int i9) {
        O();
        tu tuVar = this.f24657w;
        boolean[] zArr = tuVar.f24621d;
        if (zArr[i9]) {
            return;
        }
        C1333s c1333sB = tuVar.f24618a.b(i9).b(0);
        this.f24641g.o(ar.b(c1333sB.f24467l), c1333sB, 0, this.f24629F);
        zArr[i9] = true;
    }

    private final void R(int i9) {
        O();
        boolean[] zArr = this.f24657w.f24619b;
        if (this.f24631H && zArr[i9]) {
            if (this.f24652r[i9].K(false)) {
                return;
            }
            this.f24630G = 0L;
            this.f24631H = false;
            this.f24626C = true;
            this.f24629F = 0L;
            this.f24632I = 0;
            for (ue ueVar : this.f24652r) {
                ueVar.B();
            }
            tc tcVar = this.f24650p;
            af.s(tcVar);
            tcVar.g(this);
        }
    }

    private final void S() {
        tq tqVar = new tq(this, this.f24638d, this.f24639e, this.f24646l, this, this.f24636M, null);
        if (this.f24655u) {
            af.w(T());
            long j9 = this.f24659y;
            if (j9 != -9223372036854775807L && this.f24630G > j9) {
                this.f24633J = true;
                this.f24630G = -9223372036854775807L;
                return;
            }
            aab aabVar = this.f24658x;
            af.s(aabVar);
            tq.h(tqVar, aabVar.g(this.f24630G).f25321a.f18628c, this.f24630G);
            for (ue ueVar : this.f24652r) {
                ueVar.E(this.f24630G);
            }
            this.f24630G = -9223372036854775807L;
        }
        this.f24632I = L();
        this.f24645k.b(tqVar, this, ws.c(this.f24624A));
        dc dcVar = tqVar.f24610k;
        tj tjVar = this.f24641g;
        long unused = tqVar.f24601b;
        tjVar.s(new sw(dcVar), 1, -1, null, 0, tqVar.f24609j, this.f24659y);
    }

    private final boolean T() {
        return this.f24630G != -9223372036854775807L;
    }

    private final boolean U() {
        return this.f24626C || T();
    }

    public final /* synthetic */ void C() {
        if (this.f24634K) {
            return;
        }
        tc tcVar = this.f24650p;
        af.s(tcVar);
        tcVar.g(this);
    }

    public final /* synthetic */ void D() {
        this.f24628E = true;
    }

    public final /* synthetic */ void E(aab aabVar) {
        this.f24658x = this.f24651q == null ? aabVar : new aaa(-9223372036854775807L);
        this.f24659y = aabVar.e();
        boolean z9 = false;
        if (!this.f24628E && aabVar.e() == -9223372036854775807L) {
            z9 = true;
        }
        this.f24660z = z9;
        this.f24624A = true == z9 ? 7 : 1;
        this.f24643i.b(this.f24659y, aabVar.h(), this.f24660z);
        if (this.f24655u) {
            return;
        }
        P();
    }

    public final void F() throws IOException {
        this.f24645k.i(ws.c(this.f24624A));
    }

    public final void G(int i9) throws IOException {
        this.f24652r[i9].y();
        F();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ud
    public final void H() {
        this.f24649o.post(this.f24647m);
    }

    public final void I() {
        if (this.f24655u) {
            for (ue ueVar : this.f24652r) {
                ueVar.z();
            }
        }
        this.f24645k.k(this);
        this.f24649o.removeCallbacksAndMessages(null);
        this.f24650p = null;
        this.f24634K = true;
    }

    public final boolean J(int i9) {
        return !U() && this.f24652r[i9].K(this.f24633J);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final long a(long j9, hl hlVar) {
        O();
        if (!this.f24658x.h()) {
            return 0L;
        }
        zz zzVarG = this.f24658x.g(j9);
        return hlVar.a(j9, zzVarG.f25321a.f18627b, zzVarG.f25322b.f18627b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final /* bridge */ /* synthetic */ void bj(wy wyVar, long j9, long j10) {
        aab aabVar;
        tq tqVar = (tq) wyVar;
        if (this.f24659y == -9223372036854775807L && (aabVar = this.f24658x) != null) {
            boolean zH = aabVar.h();
            long jM = M(true);
            long j11 = jM == Long.MIN_VALUE ? 0L : jM + 10000;
            this.f24659y = j11;
            this.f24643i.b(j11, zH, this.f24660z);
        }
        dv unused = tqVar.f24603d;
        long unused2 = tqVar.f24601b;
        dc unused3 = tqVar.f24610k;
        sw swVar = new sw();
        long unused4 = tqVar.f24601b;
        this.f24641g.q(swVar, 1, -1, null, 0, tqVar.f24609j, this.f24659y);
        this.f24633J = true;
        tc tcVar = this.f24650p;
        af.s(tcVar);
        tcVar.g(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final /* bridge */ /* synthetic */ wv bk(wy wyVar, long j9, long j10, IOException iOException, int i9) {
        wv wvVarN;
        aab aabVar;
        tq tqVar = (tq) wyVar;
        dv unused = tqVar.f24603d;
        long unused2 = tqVar.f24601b;
        dc unused3 = tqVar.f24610k;
        sw swVar = new sw();
        long unused4 = tqVar.f24609j;
        int i10 = cq.f22640a;
        long jE = ws.e(new bdz(iOException, i9));
        if (jE == -9223372036854775807L) {
            wvVarN = xc.f25038c;
        } else {
            int iL = L();
            boolean z9 = iL > this.f24632I;
            if (this.f24628E || !((aabVar = this.f24658x) == null || aabVar.e() == -9223372036854775807L)) {
                this.f24632I = iL;
            } else {
                boolean z10 = this.f24655u;
                if (!z10 || U()) {
                    this.f24626C = z10;
                    this.f24629F = 0L;
                    this.f24632I = 0;
                    for (ue ueVar : this.f24652r) {
                        ueVar.B();
                    }
                    tq.h(tqVar, 0L, 0L);
                } else {
                    this.f24631H = true;
                    wvVarN = xc.f25037b;
                }
            }
            wvVarN = xc.n(z9, jE);
        }
        wv wvVar = wvVarN;
        boolean z11 = !wvVar.a();
        this.f24641g.r(swVar, 1, -1, null, 0, tqVar.f24609j, this.f24659y, iOException, z11);
        if (z11) {
            long unused5 = tqVar.f24601b;
        }
        return wvVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final void bm() throws IOException {
        F();
        if (this.f24633J && !this.f24655u) {
            throw as.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final /* bridge */ /* synthetic */ void bn(wy wyVar, long j9, long j10, boolean z9) {
        tq tqVar = (tq) wyVar;
        dv unused = tqVar.f24603d;
        long unused2 = tqVar.f24601b;
        dc unused3 = tqVar.f24610k;
        sw swVar = new sw();
        long unused4 = tqVar.f24601b;
        this.f24641g.p(swVar, 1, -1, null, 0, tqVar.f24609j, this.f24659y);
        if (z9) {
            return;
        }
        for (ue ueVar : this.f24652r) {
            ueVar.B();
        }
        if (this.f24627D > 0) {
            tc tcVar = this.f24650p;
            af.s(tcVar);
            tcVar.g(this);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final long bo() {
        long jM;
        O();
        if (this.f24633J || this.f24627D == 0) {
            return Long.MIN_VALUE;
        }
        if (T()) {
            return this.f24630G;
        }
        if (this.f24656v) {
            int length = this.f24652r.length;
            jM = Long.MAX_VALUE;
            for (int i9 = 0; i9 < length; i9++) {
                tu tuVar = this.f24657w;
                if (tuVar.f24619b[i9] && tuVar.f24620c[i9] && !this.f24652r[i9].J()) {
                    jM = Math.min(jM, this.f24652r[i9].r());
                }
            }
        } else {
            jM = Long.MAX_VALUE;
        }
        if (jM == Long.MAX_VALUE) {
            jM = M(false);
        }
        return jM == Long.MIN_VALUE ? this.f24629F : jM;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final long c() {
        return bo();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final long d() {
        if (!this.f24626C) {
            return -9223372036854775807L;
        }
        if (!this.f24633J && L() <= this.f24632I) {
            return -9223372036854775807L;
        }
        this.f24626C = false;
        return this.f24629F;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final long e(long j9) {
        O();
        boolean[] zArr = this.f24657w.f24619b;
        if (true != this.f24658x.h()) {
            j9 = 0;
        }
        int i9 = 0;
        this.f24626C = false;
        this.f24629F = j9;
        if (T()) {
            this.f24630G = j9;
            return j9;
        }
        if (this.f24624A != 7) {
            int length = this.f24652r.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f24652r[i10].M(j9, false) || (!zArr[i10] && this.f24656v)) {
                }
            }
            return j9;
        }
        this.f24631H = false;
        this.f24630G = j9;
        this.f24633J = false;
        xc xcVar = this.f24645k;
        if (xcVar.m()) {
            ue[] ueVarArr = this.f24652r;
            int length2 = ueVarArr.length;
            while (i9 < length2) {
                ueVarArr[i9].u();
                i9++;
            }
            this.f24645k.g();
        } else {
            xcVar.h();
            ue[] ueVarArr2 = this.f24652r;
            int length3 = ueVarArr2.length;
            while (i9 < length3) {
                ueVarArr2[i9].B();
                i9++;
            }
        }
        return j9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final long f(we[] weVarArr, boolean[] zArr, uf[] ufVarArr, boolean[] zArr2, long j9) {
        boolean z9;
        we weVar;
        O();
        tu tuVar = this.f24657w;
        um umVar = tuVar.f24618a;
        boolean[] zArr3 = tuVar.f24620c;
        int i9 = this.f24627D;
        int i10 = 0;
        for (int i11 = 0; i11 < weVarArr.length; i11++) {
            uf ufVar = ufVarArr[i11];
            if (ufVar != null && (weVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((ts) ufVar).f24615b;
                af.w(zArr3[i12]);
                this.f24627D--;
                zArr3[i12] = false;
                ufVarArr[i11] = null;
            }
        }
        if (this.f24625B) {
            z9 = i9 == 0;
        } else if (j9 == 0) {
            j9 = 0;
        }
        for (int i13 = 0; i13 < weVarArr.length; i13++) {
            if (ufVarArr[i13] == null && (weVar = weVarArr[i13]) != null) {
                af.w(weVar.n() == 1);
                af.w(weVar.j(0) == 0);
                int iA = umVar.a(weVar.q());
                af.w(!zArr3[iA]);
                this.f24627D++;
                zArr3[iA] = true;
                ufVarArr[i13] = new ts(this, iA);
                zArr2[i13] = true;
                if (!z9) {
                    ue ueVar = this.f24652r[iA];
                    z9 = (ueVar.M(j9, true) || ueVar.k() == 0) ? false : true;
                }
            }
        }
        if (this.f24627D == 0) {
            this.f24631H = false;
            this.f24626C = false;
            if (this.f24645k.m()) {
                ue[] ueVarArr = this.f24652r;
                int length = ueVarArr.length;
                while (i10 < length) {
                    ueVarArr[i10].u();
                    i10++;
                }
                this.f24645k.g();
            } else {
                ue[] ueVarArr2 = this.f24652r;
                int length2 = ueVarArr2.length;
                while (i10 < length2) {
                    ueVarArr2[i10].B();
                    i10++;
                }
            }
        } else if (z9) {
            j9 = e(j9);
            while (i10 < ufVarArr.length) {
                if (ufVarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.f24625B = true;
        return j9;
    }

    public final int g(int i9, go goVar, ef efVar, int i10) {
        if (U()) {
            return -3;
        }
        Q(i9);
        int iO = this.f24652r[i9].o(goVar, efVar, i10, this.f24633J);
        if (iO == -3) {
            R(i9);
        }
        return iO;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final um h() {
        O();
        return this.f24657w.f24618a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zk
    public final aae i(int i9, int i10) {
        return N(new tt(i9, false));
    }

    public final int j(int i9, long j9) {
        if (U()) {
            return 0;
        }
        Q(i9);
        ue ueVar = this.f24652r[i9];
        int iL = ueVar.l(j9, this.f24633J);
        ueVar.G(iL);
        if (iL != 0) {
            return iL;
        }
        R(i9);
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final void k(tc tcVar, long j9) {
        this.f24650p = tcVar;
        this.f24636M.f();
        S();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final void l(long j9) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zk
    public final void n() {
        this.f24654t = true;
        this.f24649o.post(this.f24647m);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final boolean o(long j9) {
        if (this.f24633J || this.f24645k.l() || this.f24631H) {
            return false;
        }
        if (this.f24655u && this.f24627D == 0) {
            return false;
        }
        boolean zF = this.f24636M.f();
        if (this.f24645k.m()) {
            return zF;
        }
        S();
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final boolean p() {
        return this.f24645k.m() && this.f24636M.e();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final void q(long j9) {
        O();
        if (T()) {
            return;
        }
        boolean[] zArr = this.f24657w.f24620c;
        int length = this.f24652r.length;
        for (int i9 = 0; i9 < length; i9++) {
            this.f24652r[i9].P(j9, zArr[i9]);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wz
    public final void t() {
        for (ue ueVar : this.f24652r) {
            ueVar.A();
        }
        this.f24646l.e();
    }

    public final aae u() {
        return N(new tt(0, true));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zk
    public final void x(final aab aabVar) {
        this.f24649o.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.tp
            @Override // java.lang.Runnable
            public final void run() {
                this.f24598a.E(aabVar);
            }
        });
    }
}

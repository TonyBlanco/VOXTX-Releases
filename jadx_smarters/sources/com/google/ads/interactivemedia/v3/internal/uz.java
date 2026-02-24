package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uz implements uf, uh, ww, wz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f24796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f24797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1333s[] f24798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean[] f24799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final va f24800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ug f24801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final tj f24802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final xc f24803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final uw f24804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList f24805k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f24806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ue f24807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ue[] f24808n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private uu f24809o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C1333s f24810p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private uy f24811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f24812r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f24813s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f24814t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private up f24815u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final zo f24816v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ws f24817w;

    public uz(int i9, int[] iArr, C1333s[] c1333sArr, va vaVar, ug ugVar, wr wrVar, long j9, nt ntVar, nn nnVar, ws wsVar, tj tjVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f24795a = i9;
        int i10 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f24797c = iArr;
        this.f24798d = c1333sArr == null ? new C1333s[0] : c1333sArr;
        this.f24800f = vaVar;
        this.f24801g = ugVar;
        this.f24802h = tjVar;
        this.f24817w = wsVar;
        this.f24803i = new xc("ChunkSampleStream");
        this.f24804j = new uw();
        ArrayList arrayList = new ArrayList();
        this.f24805k = arrayList;
        this.f24806l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f24808n = new ue[length];
        this.f24799e = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        ue[] ueVarArr = new ue[i11];
        ue ueVarN = ue.N(wrVar, ntVar, nnVar);
        this.f24807m = ueVarN;
        iArr2[0] = i9;
        ueVarArr[0] = ueVarN;
        while (i10 < length) {
            ue ueVarO = ue.O(wrVar);
            this.f24808n[i10] = ueVarO;
            int i12 = i10 + 1;
            ueVarArr[i12] = ueVarO;
            iArr2[i12] = this.f24797c[i10];
            i10 = i12;
        }
        this.f24816v = new zo(iArr2, ueVarArr);
        this.f24812r = j9;
        this.f24813s = j9;
    }

    private final boolean A(int i9) {
        up upVar = (up) this.f24805k.get(i9);
        if (this.f24807m.k() > upVar.a(0)) {
            return true;
        }
        int i10 = 0;
        while (true) {
            ue[] ueVarArr = this.f24808n;
            if (i10 >= ueVarArr.length) {
                return false;
            }
            int i11 = i10 + 1;
            if (ueVarArr[i10].k() > upVar.a(i11)) {
                return true;
            }
            i10 = i11;
        }
    }

    private final int v(int i9, int i10) {
        do {
            i10++;
            if (i10 >= this.f24805k.size()) {
                return this.f24805k.size() - 1;
            }
        } while (((up) this.f24805k.get(i10)).a(0) <= i9);
        return i10 - 1;
    }

    private final up w(int i9) {
        up upVar = (up) this.f24805k.get(i9);
        ArrayList arrayList = this.f24805k;
        cq.T(arrayList, i9, arrayList.size());
        this.f24814t = Math.max(this.f24814t, this.f24805k.size());
        int i10 = 0;
        this.f24807m.w(upVar.a(0));
        while (true) {
            ue[] ueVarArr = this.f24808n;
            if (i10 >= ueVarArr.length) {
                return upVar;
            }
            int i11 = i10 + 1;
            ueVarArr[i10].w(upVar.a(i11));
            i10 = i11;
        }
    }

    private final up x() {
        return (up) this.f24805k.get(r0.size() - 1);
    }

    private final void y() {
        int iV = v(this.f24807m.k(), this.f24814t - 1);
        while (true) {
            int i9 = this.f24814t;
            if (i9 > iV) {
                return;
            }
            this.f24814t = i9 + 1;
            up upVar = (up) this.f24805k.get(i9);
            C1333s c1333s = upVar.f24782i;
            if (!c1333s.equals(this.f24810p)) {
                this.f24802h.o(this.f24795a, c1333s, upVar.f24783j, upVar.f24785l);
            }
            this.f24810p = c1333s;
        }
    }

    private final void z() {
        this.f24807m.B();
        for (ue ueVar : this.f24808n) {
            ueVar.B();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final int a(go goVar, ef efVar, int i9) {
        if (n()) {
            return -3;
        }
        y();
        return this.f24807m.o(goVar, efVar, i9, this.f24796b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final int b(long j9) {
        if (n()) {
            return 0;
        }
        int iL = this.f24807m.l(j9, this.f24796b);
        this.f24807m.G(iL);
        y();
        return iL;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final /* bridge */ /* synthetic */ void bj(wy wyVar, long j9, long j10) {
        uu uuVar = (uu) wyVar;
        this.f24809o = null;
        this.f24800f.g(uuVar);
        long j11 = uuVar.f24779f;
        uuVar.l();
        uuVar.m();
        uuVar.k();
        this.f24802h.q(new sw(), uuVar.f24781h, this.f24795a, uuVar.f24782i, uuVar.f24783j, uuVar.f24785l, uuVar.f24786m);
        this.f24801g.g(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final /* bridge */ /* synthetic */ wv bk(wy wyVar, long j9, long j10, IOException iOException, int i9) {
        wv wvVarN;
        uu uuVar = (uu) wyVar;
        long jK = uuVar.k();
        boolean z9 = uuVar instanceof up;
        int size = this.f24805k.size() - 1;
        boolean z10 = (jK != 0 && z9 && A(size)) ? false : true;
        uuVar.l();
        uuVar.m();
        sw swVar = new sw();
        int i10 = cq.f22640a;
        bdz bdzVar = new bdz(iOException, i9);
        if (!this.f24800f.j(uuVar, z10, bdzVar, this.f24817w)) {
            wvVarN = null;
        } else if (z10) {
            wvVarN = xc.f25037b;
            if (z9) {
                af.w(w(size) == uuVar);
                if (this.f24805k.isEmpty()) {
                    this.f24812r = this.f24813s;
                }
            }
        } else {
            cd.e("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            wvVarN = null;
        }
        if (wvVarN == null) {
            long jE = ws.e(bdzVar);
            wvVarN = jE != -9223372036854775807L ? xc.n(false, jE) : xc.f25038c;
        }
        boolean z11 = !wvVarN.a();
        this.f24802h.r(swVar, uuVar.f24781h, this.f24795a, uuVar.f24782i, uuVar.f24783j, uuVar.f24785l, uuVar.f24786m, iOException, z11);
        if (z11) {
            this.f24809o = null;
            this.f24801g.g(this);
        }
        return wvVarN;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final /* bridge */ /* synthetic */ void bn(wy wyVar, long j9, long j10, boolean z9) {
        uu uuVar = (uu) wyVar;
        this.f24809o = null;
        this.f24815u = null;
        long j11 = uuVar.f24779f;
        uuVar.l();
        uuVar.m();
        uuVar.k();
        this.f24802h.p(new sw(), uuVar.f24781h, this.f24795a, uuVar.f24782i, uuVar.f24783j, uuVar.f24785l, uuVar.f24786m);
        if (z9) {
            return;
        }
        if (n()) {
            z();
        } else if (uuVar instanceof up) {
            w(this.f24805k.size() - 1);
            if (this.f24805k.isEmpty()) {
                this.f24812r = this.f24813s;
            }
        }
        this.f24801g.g(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uh
    public final long bo() {
        if (this.f24796b) {
            return Long.MIN_VALUE;
        }
        if (n()) {
            return this.f24812r;
        }
        long jMax = this.f24813s;
        up upVarX = x();
        if (!upVarX.g()) {
            if (this.f24805k.size() > 1) {
                upVarX = (up) this.f24805k.get(r2.size() - 2);
            } else {
                upVarX = null;
            }
        }
        if (upVarX != null) {
            jMax = Math.max(jMax, upVarX.f24786m);
        }
        return Math.max(jMax, this.f24807m.r());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uh
    public final long c() {
        if (n()) {
            return this.f24812r;
        }
        if (this.f24796b) {
            return Long.MIN_VALUE;
        }
        return x().f24786m;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final void d() throws IOException {
        this.f24803i.a();
        this.f24807m.y();
        if (this.f24803i.m()) {
            return;
        }
        this.f24800f.f();
    }

    public final long f(long j9, hl hlVar) {
        return this.f24800f.d(j9, hlVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final boolean g() {
        return !n() && this.f24807m.K(this.f24796b);
    }

    public final ux i(long j9, int i9) {
        for (int i10 = 0; i10 < this.f24808n.length; i10++) {
            if (this.f24797c[i10] == i9) {
                af.w(!this.f24799e[i10]);
                this.f24799e[i10] = true;
                this.f24808n[i10].M(j9, true);
                return new ux(this, this, this.f24808n[i10], i10);
            }
        }
        throw new IllegalStateException();
    }

    public final va j() {
        return this.f24800f;
    }

    public final void k(uy uyVar) {
        this.f24811q = uyVar;
        this.f24807m.z();
        for (ue ueVar : this.f24808n) {
            ueVar.z();
        }
        this.f24803i.k(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uh
    public final void l(long j9) {
        xc xcVar = this.f24803i;
        if (xcVar.l() || n()) {
            return;
        }
        if (xcVar.m()) {
            uu uuVar = this.f24809o;
            af.s(uuVar);
            if ((uuVar instanceof up) && A(this.f24805k.size() - 1)) {
                return;
            }
            this.f24800f.i(j9, uuVar, this.f24806l);
            return;
        }
        int iC = this.f24800f.c(j9, this.f24806l);
        if (iC < this.f24805k.size()) {
            af.w(!this.f24803i.m());
            int size = this.f24805k.size();
            while (true) {
                if (iC >= size) {
                    iC = -1;
                    break;
                } else if (!A(iC)) {
                    break;
                } else {
                    iC++;
                }
            }
            if (iC == -1) {
                return;
            }
            long j10 = x().f24786m;
            up upVarW = w(iC);
            if (this.f24805k.isEmpty()) {
                this.f24812r = this.f24813s;
            }
            this.f24796b = false;
            this.f24802h.n(this.f24795a, upVarW.f24785l, j10);
        }
    }

    public final void m(long j9) {
        up upVar;
        boolean zM;
        this.f24813s = j9;
        if (n()) {
            this.f24812r = j9;
            return;
        }
        int i9 = 0;
        int i10 = 0;
        while (true) {
            upVar = null;
            if (i10 >= this.f24805k.size()) {
                break;
            }
            up upVar2 = (up) this.f24805k.get(i10);
            long j10 = upVar2.f24785l;
            if (j10 == j9 && upVar2.f24753a == -9223372036854775807L) {
                upVar = upVar2;
                break;
            } else if (j10 > j9) {
                break;
            } else {
                i10++;
            }
        }
        ue ueVar = this.f24807m;
        if (upVar != null) {
            zM = ueVar.L(upVar.a(0));
        } else {
            zM = ueVar.M(j9, j9 < c());
        }
        if (zM) {
            this.f24814t = v(this.f24807m.k(), 0);
            ue[] ueVarArr = this.f24808n;
            int length = ueVarArr.length;
            while (i9 < length) {
                ueVarArr[i9].M(j9, true);
                i9++;
            }
            return;
        }
        this.f24812r = j9;
        this.f24796b = false;
        this.f24805k.clear();
        this.f24814t = 0;
        xc xcVar = this.f24803i;
        if (!xcVar.m()) {
            xcVar.h();
            z();
            return;
        }
        this.f24807m.u();
        ue[] ueVarArr2 = this.f24808n;
        int length2 = ueVarArr2.length;
        while (i9 < length2) {
            ueVarArr2[i9].u();
            i9++;
        }
        this.f24803i.g();
    }

    public final boolean n() {
        return this.f24812r != -9223372036854775807L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uh
    public final boolean o(long j9) {
        List listEmptyList;
        long j10;
        if (!this.f24796b) {
            xc xcVar = this.f24803i;
            if (!xcVar.m() && !xcVar.l()) {
                boolean zN = n();
                if (zN) {
                    listEmptyList = Collections.emptyList();
                    j10 = this.f24812r;
                } else {
                    listEmptyList = this.f24806l;
                    j10 = x().f24786m;
                }
                this.f24800f.e(j9, j10, listEmptyList, this.f24804j);
                uw uwVar = this.f24804j;
                boolean z9 = uwVar.f24789b;
                uu uuVar = uwVar.f24788a;
                uwVar.f24788a = null;
                uwVar.f24789b = false;
                if (z9) {
                    this.f24812r = -9223372036854775807L;
                    this.f24796b = true;
                    return true;
                }
                if (uuVar == null) {
                    return false;
                }
                this.f24809o = uuVar;
                if (uuVar instanceof up) {
                    up upVar = (up) uuVar;
                    if (zN) {
                        long j11 = upVar.f24785l;
                        long j12 = this.f24812r;
                        if (j11 != j12) {
                            this.f24807m.E(j12);
                            for (ue ueVar : this.f24808n) {
                                ueVar.E(this.f24812r);
                            }
                        }
                        this.f24812r = -9223372036854775807L;
                    }
                    upVar.d(this.f24816v);
                    this.f24805k.add(upVar);
                } else if (uuVar instanceof vd) {
                    ((vd) uuVar).a(this.f24816v);
                }
                this.f24803i.b(uuVar, this, ws.c(uuVar.f24781h));
                this.f24802h.s(new sw(uuVar.f24780g), uuVar.f24781h, this.f24795a, uuVar.f24782i, uuVar.f24783j, uuVar.f24785l, uuVar.f24786m);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uh
    public final boolean p() {
        return this.f24803i.m();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wz
    public final void t() {
        this.f24807m.A();
        for (ue ueVar : this.f24808n) {
            ueVar.A();
        }
        this.f24800f.h();
        uy uyVar = this.f24811q;
        if (uyVar != null) {
            uyVar.j(this);
        }
    }

    public final void u(long j9) {
        if (n()) {
            return;
        }
        ue ueVar = this.f24807m;
        int iJ = ueVar.j();
        ueVar.P(j9, true);
        ue ueVar2 = this.f24807m;
        int iJ2 = ueVar2.j();
        if (iJ2 > iJ) {
            long jQ = ueVar2.q();
            int i9 = 0;
            while (true) {
                ue[] ueVarArr = this.f24808n;
                if (i9 >= ueVarArr.length) {
                    break;
                }
                ueVarArr[i9].P(jQ, this.f24799e[i9]);
                i9++;
            }
        }
        int iMin = Math.min(v(iJ2, 0), this.f24814t);
        if (iMin > 0) {
            cq.T(this.f24805k, 0, iMin);
            this.f24814t -= iMin;
        }
    }
}

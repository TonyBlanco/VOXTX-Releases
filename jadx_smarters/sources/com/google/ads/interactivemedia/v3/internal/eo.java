package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eo implements hh, hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22798a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private hj f22800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private iw f22802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private uf f22804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C1333s[] f22805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f22806i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f22808k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f22809l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final go f22799b = new go();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f22807j = Long.MIN_VALUE;

    public eo(int i9) {
        this.f22798a = i9;
    }

    private final void Q(long j9, boolean z9) throws ev {
        this.f22808k = false;
        this.f22807j = j9;
        v(j9, z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh
    public final void A() {
        af.w(this.f22803f == 0);
        this.f22799b.a();
        w();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh
    public final void B(long j9) throws ev {
        Q(j9, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh
    public final void C() {
        this.f22808k = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh
    public /* synthetic */ void D(float f9, float f10) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh
    public final void E() throws ev {
        af.w(this.f22803f == 1);
        this.f22803f = 2;
        x();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh
    public final void F() {
        af.w(this.f22803f == 2);
        this.f22803f = 1;
        y();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh
    public final boolean G() {
        return this.f22807j == Long.MIN_VALUE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh
    public final boolean H() {
        return this.f22808k;
    }

    public final boolean I() {
        if (G()) {
            return this.f22808k;
        }
        uf ufVar = this.f22804g;
        af.s(ufVar);
        return ufVar.g();
    }

    public final C1333s[] J() {
        return (C1333s[]) af.s(this.f22805h);
    }

    public void K(long j9, long j10) throws ev {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh, com.google.ads.interactivemedia.v3.internal.hi
    public final int b() {
        return this.f22798a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh
    public final int bg() {
        return this.f22803f;
    }

    public final int bh(go goVar, ef efVar, int i9) {
        uf ufVar = this.f22804g;
        af.s(ufVar);
        int iA = ufVar.a(goVar, efVar, i9);
        if (iA == -4) {
            if (efVar.g()) {
                this.f22807j = Long.MIN_VALUE;
                return this.f22808k ? -4 : -3;
            }
            long j9 = efVar.f22776d + this.f22806i;
            efVar.f22776d = j9;
            this.f22807j = Math.max(this.f22807j, j9);
        } else if (iA == -5) {
            C1333s c1333s = goVar.f23064b;
            af.s(c1333s);
            long j10 = c1333s.f24471p;
            if (j10 != Long.MAX_VALUE) {
                r rVarB = c1333s.b();
                rVarB.ai(j10 + this.f22806i);
                goVar.f23064b = rVarB.v();
                return -5;
            }
        }
        return iA;
    }

    public final ev bi(Throwable th, C1333s c1333s, int i9) {
        return h(th, c1333s, false, i9);
    }

    public final int d(long j9) {
        uf ufVar = this.f22804g;
        af.s(ufVar);
        return ufVar.b(j9 - this.f22806i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hi
    public int e() throws ev {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh
    public final long f() {
        return this.f22807j;
    }

    public final ev h(Throwable th, C1333s c1333s, boolean z9, int i9) {
        int i10;
        if (c1333s == null || this.f22809l) {
            i10 = 4;
        } else {
            this.f22809l = true;
            try {
                int iF = fz.f(P(c1333s));
                this.f22809l = false;
                i10 = iF;
            } catch (ev unused) {
                this.f22809l = false;
                i10 = 4;
            } catch (Throwable th2) {
                this.f22809l = false;
                throw th2;
            }
        }
        return ev.b(th, L(), this.f22801d, c1333s, i10, z9, i9);
    }

    public final go i() {
        this.f22799b.a();
        return this.f22799b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh
    public gp j() {
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh
    public final hi k() {
        return this;
    }

    public final hj l() {
        hj hjVar = this.f22800c;
        af.s(hjVar);
        return hjVar;
    }

    public final iw m() {
        iw iwVar = this.f22802e;
        af.s(iwVar);
        return iwVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh
    public final uf n() {
        return this.f22804g;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh
    public final void o() {
        af.w(this.f22803f == 1);
        this.f22799b.a();
        this.f22803f = 0;
        this.f22804g = null;
        this.f22805h = null;
        this.f22808k = false;
        t();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh
    public final void p(hj hjVar, C1333s[] c1333sArr, uf ufVar, long j9, boolean z9, boolean z10, long j10, long j11) throws ev {
        af.w(this.f22803f == 0);
        this.f22800c = hjVar;
        this.f22803f = 1;
        u(z9, z10);
        z(c1333sArr, ufVar, j10, j11);
        Q(j9, z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hd
    public void q(int i9, Object obj) throws ev {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh
    public final void r(int i9, iw iwVar) {
        this.f22801d = i9;
        this.f22802e = iwVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh
    public final void s() throws IOException {
        uf ufVar = this.f22804g;
        af.s(ufVar);
        ufVar.d();
    }

    public void t() {
        throw null;
    }

    public void u(boolean z9, boolean z10) throws ev {
    }

    public void v(long j9, boolean z9) throws ev {
        throw null;
    }

    public void w() {
    }

    public void x() throws ev {
    }

    public void y() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh
    public final void z(C1333s[] c1333sArr, uf ufVar, long j9, long j10) throws ev {
        af.w(!this.f22808k);
        this.f22804g = ufVar;
        if (this.f22807j == Long.MIN_VALUE) {
            this.f22807j = j9;
        }
        this.f22805h = c1333sArr;
        this.f22806i = j10;
        K(j9, j10);
    }
}

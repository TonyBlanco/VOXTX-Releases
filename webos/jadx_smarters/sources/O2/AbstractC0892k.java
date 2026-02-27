package O2;

import O2.E1;
import d4.AbstractC1684a;
import d4.InterfaceC1683D;

/* JADX INFO: renamed from: O2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0892k implements C1, E1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6090c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public F1 f6092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public P2.v0 f6094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public B3.Y f6096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0936z0[] f6097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f6098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6099l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6101n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6102o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public E1.a f6103p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6089a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A0 f6091d = new A0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f6100m = Long.MIN_VALUE;

    public AbstractC0892k(int i9) {
        this.f6090c = i9;
    }

    public final F1 A() {
        return (F1) AbstractC1684a.e(this.f6092e);
    }

    public final A0 B() {
        this.f6091d.a();
        return this.f6091d;
    }

    public final int C() {
        return this.f6093f;
    }

    public final P2.v0 D() {
        return (P2.v0) AbstractC1684a.e(this.f6094g);
    }

    public final C0936z0[] E() {
        return (C0936z0[]) AbstractC1684a.e(this.f6097j);
    }

    public final boolean F() {
        return h() ? this.f6101n : ((B3.Y) AbstractC1684a.e(this.f6096i)).e();
    }

    public abstract void G();

    public void H(boolean z9, boolean z10) {
    }

    public abstract void I(long j9, boolean z9);

    public void J() {
    }

    public final void K() {
        E1.a aVar;
        synchronized (this.f6089a) {
            aVar = this.f6103p;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void L() {
    }

    public void M() {
    }

    public void N() {
    }

    public void O(C0936z0[] c0936z0Arr, long j9, long j10) {
    }

    public final int P(A0 a02, U2.g gVar, int i9) {
        int iQ = ((B3.Y) AbstractC1684a.e(this.f6096i)).q(a02, gVar, i9);
        if (iQ == -4) {
            if (gVar.isEndOfStream()) {
                this.f6100m = Long.MIN_VALUE;
                return this.f6101n ? -4 : -3;
            }
            long j9 = gVar.f9701f + this.f6098k;
            gVar.f9701f = j9;
            this.f6100m = Math.max(this.f6100m, j9);
        } else if (iQ == -5) {
            C0936z0 c0936z0 = (C0936z0) AbstractC1684a.e(a02.f5499b);
            if (c0936z0.f6471q != Long.MAX_VALUE) {
                a02.f5499b = c0936z0.b().k0(c0936z0.f6471q + this.f6098k).G();
            }
        }
        return iQ;
    }

    public final void Q(long j9, boolean z9) {
        this.f6101n = false;
        this.f6099l = j9;
        this.f6100m = j9;
        I(j9, z9);
    }

    public int R(long j9) {
        return ((B3.Y) AbstractC1684a.e(this.f6096i)).n(j9 - this.f6098k);
    }

    @Override // O2.C1
    public final void disable() {
        AbstractC1684a.g(this.f6095h == 1);
        this.f6091d.a();
        this.f6095h = 0;
        this.f6096i = null;
        this.f6097j = null;
        this.f6101n = false;
        G();
    }

    @Override // O2.C1
    public final B3.Y f() {
        return this.f6096i;
    }

    @Override // O2.E1
    public final void g() {
        synchronized (this.f6089a) {
            this.f6103p = null;
        }
    }

    @Override // O2.C1
    public final int getState() {
        return this.f6095h;
    }

    @Override // O2.C1, O2.E1
    public final int getTrackType() {
        return this.f6090c;
    }

    @Override // O2.C1
    public final boolean h() {
        return this.f6100m == Long.MIN_VALUE;
    }

    @Override // O2.E1
    public final void i(E1.a aVar) {
        synchronized (this.f6089a) {
            this.f6103p = aVar;
        }
    }

    @Override // O2.C1
    public final void j() {
        this.f6101n = true;
    }

    @Override // O2.C1
    public final void k(F1 f12, C0936z0[] c0936z0Arr, B3.Y y9, long j9, boolean z9, boolean z10, long j10, long j11) {
        AbstractC1684a.g(this.f6095h == 0);
        this.f6092e = f12;
        this.f6095h = 1;
        H(z9, z10);
        m(c0936z0Arr, y9, j10, j11);
        Q(j9, z9);
    }

    @Override // O2.C1
    public final void l(int i9, P2.v0 v0Var) {
        this.f6093f = i9;
        this.f6094g = v0Var;
    }

    @Override // O2.C1
    public final void m(C0936z0[] c0936z0Arr, B3.Y y9, long j9, long j10) {
        AbstractC1684a.g(!this.f6101n);
        this.f6096i = y9;
        if (this.f6100m == Long.MIN_VALUE) {
            this.f6100m = j9;
        }
        this.f6097j = c0936z0Arr;
        this.f6098k = j10;
        O(c0936z0Arr, j9, j10);
    }

    @Override // O2.C0932x1.b
    public void n(int i9, Object obj) {
    }

    @Override // O2.C1
    public final void o() {
        ((B3.Y) AbstractC1684a.e(this.f6096i)).a();
    }

    @Override // O2.C1
    public final boolean p() {
        return this.f6101n;
    }

    @Override // O2.C1
    public final E1 q() {
        return this;
    }

    @Override // O2.C1
    public final void release() {
        AbstractC1684a.g(this.f6095h == 0);
        J();
    }

    @Override // O2.C1
    public final void reset() {
        AbstractC1684a.g(this.f6095h == 0);
        this.f6091d.a();
        L();
    }

    @Override // O2.C1
    public /* synthetic */ void s(float f9, float f10) {
        B1.a(this, f9, f10);
    }

    @Override // O2.C1
    public final void start() {
        AbstractC1684a.g(this.f6095h == 1);
        this.f6095h = 2;
        M();
    }

    @Override // O2.C1
    public final void stop() {
        AbstractC1684a.g(this.f6095h == 2);
        this.f6095h = 1;
        N();
    }

    @Override // O2.E1
    public int t() {
        return 0;
    }

    @Override // O2.C1
    public final long v() {
        return this.f6100m;
    }

    @Override // O2.C1
    public final void w(long j9) {
        Q(j9, false);
    }

    @Override // O2.C1
    public InterfaceC1683D x() {
        return null;
    }

    public final C0927w y(Throwable th, C0936z0 c0936z0, int i9) {
        return z(th, c0936z0, false, i9);
    }

    public final C0927w z(Throwable th, C0936z0 c0936z0, boolean z9, int i9) {
        int i10;
        if (c0936z0 == null || this.f6102o) {
            i10 = 4;
        } else {
            this.f6102o = true;
            try {
                int iF = D1.f(a(c0936z0));
                this.f6102o = false;
                i10 = iF;
            } catch (C0927w unused) {
                this.f6102o = false;
                i10 = 4;
            } catch (Throwable th2) {
                this.f6102o = false;
                throw th2;
            }
        }
        return C0927w.i(th, getName(), C(), c0936z0, i10, z9, i9);
    }
}

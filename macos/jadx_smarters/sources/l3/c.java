package L3;

import Q2.AbstractC1016b;
import d3.InterfaceC1674k;
import d3.w;
import d4.AbstractC1684a;
import d4.L;
import d4.M;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K3.h f3979a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f3981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3982d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3985g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f3980b = new L();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3983e = -9223372036854775807L;

    public c(K3.h hVar) {
        this.f3979a = hVar;
    }

    @Override // L3.k
    public void a(long j9, long j10) {
        this.f3983e = j9;
        this.f3985g = j10;
    }

    @Override // L3.k
    public void b(long j9, int i9) {
        AbstractC1684a.g(this.f3983e == -9223372036854775807L);
        this.f3983e = j9;
    }

    @Override // L3.k
    public void c(M m9, long j9, int i9, boolean z9) {
        int iH = m9.H() & 3;
        int iH2 = m9.H() & 255;
        long jA = m.a(this.f3985g, j9, this.f3983e, this.f3979a.f3741b);
        if (iH == 0) {
            e();
            if (iH2 == 1) {
                i(m9, jA);
                return;
            } else {
                h(m9, iH2, jA);
                return;
            }
        }
        if (iH == 1 || iH == 2) {
            e();
        } else if (iH != 3) {
            throw new IllegalArgumentException(String.valueOf(iH));
        }
        g(m9, z9, iH, jA);
    }

    @Override // L3.k
    public void d(InterfaceC1674k interfaceC1674k, int i9) {
        w wVarE = interfaceC1674k.e(i9, 1);
        this.f3981c = wVarE;
        wVarE.d(this.f3979a.f3742c);
    }

    public final void e() {
        if (this.f3982d > 0) {
            f();
        }
    }

    public final void f() {
        ((w) k0.j(this.f3981c)).f(this.f3984f, 1, this.f3982d, 0, null);
        this.f3982d = 0;
    }

    public final void g(M m9, boolean z9, int i9, long j9) {
        int iA = m9.a();
        ((w) AbstractC1684a.e(this.f3981c)).b(m9, iA);
        this.f3982d += iA;
        this.f3984f = j9;
        if (z9 && i9 == 3) {
            f();
        }
    }

    public final void h(M m9, int i9, long j9) {
        this.f3980b.n(m9.e());
        this.f3980b.s(2);
        for (int i10 = 0; i10 < i9; i10++) {
            AbstractC1016b.C0088b c0088bF = AbstractC1016b.f(this.f3980b);
            ((w) AbstractC1684a.e(this.f3981c)).b(m9, c0088bF.f7758e);
            ((w) k0.j(this.f3981c)).f(j9, 1, c0088bF.f7758e, 0, null);
            j9 += ((long) (c0088bF.f7759f / c0088bF.f7756c)) * 1000000;
            this.f3980b.s(c0088bF.f7758e);
        }
    }

    public final void i(M m9, long j9) {
        int iA = m9.a();
        ((w) AbstractC1684a.e(this.f3981c)).b(m9, iA);
        ((w) k0.j(this.f3981c)).f(j9, 1, iA, 0, null);
    }
}

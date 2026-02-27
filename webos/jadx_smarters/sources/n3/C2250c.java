package n3;

import O2.C0936z0;
import Q2.AbstractC1016b;
import d3.InterfaceC1674k;
import d4.AbstractC1684a;
import d4.L;
import d4.M;
import d4.k0;
import n3.I;

/* JADX INFO: renamed from: n3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2250c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f44985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f44986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f44988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d3.w f44989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f44992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f44993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0936z0 f44994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f44995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f44996l;

    public C2250c() {
        this(null);
    }

    public C2250c(String str) {
        L l9 = new L(new byte[128]);
        this.f44985a = l9;
        this.f44986b = new M(l9.f39700a);
        this.f44990f = 0;
        this.f44996l = -9223372036854775807L;
        this.f44987c = str;
    }

    public final boolean a(M m9, byte[] bArr, int i9) {
        int iMin = Math.min(m9.a(), i9 - this.f44991g);
        m9.l(bArr, this.f44991g, iMin);
        int i10 = this.f44991g + iMin;
        this.f44991g = i10;
        return i10 == i9;
    }

    @Override // n3.m
    public void b(M m9) {
        AbstractC1684a.i(this.f44989e);
        while (m9.a() > 0) {
            int i9 = this.f44990f;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        int iMin = Math.min(m9.a(), this.f44995k - this.f44991g);
                        this.f44989e.b(m9, iMin);
                        int i10 = this.f44991g + iMin;
                        this.f44991g = i10;
                        int i11 = this.f44995k;
                        if (i10 == i11) {
                            long j9 = this.f44996l;
                            if (j9 != -9223372036854775807L) {
                                this.f44989e.f(j9, 1, i11, 0, null);
                                this.f44996l += this.f44993i;
                            }
                            this.f44990f = 0;
                        }
                    }
                } else if (a(m9, this.f44986b.e(), 128)) {
                    g();
                    this.f44986b.U(0);
                    this.f44989e.b(this.f44986b, 128);
                    this.f44990f = 2;
                }
            } else if (h(m9)) {
                this.f44990f = 1;
                this.f44986b.e()[0] = 11;
                this.f44986b.e()[1] = 119;
                this.f44991g = 2;
            }
        }
    }

    @Override // n3.m
    public void c() {
        this.f44990f = 0;
        this.f44991g = 0;
        this.f44992h = false;
        this.f44996l = -9223372036854775807L;
    }

    @Override // n3.m
    public void d() {
    }

    @Override // n3.m
    public void e(long j9, int i9) {
        if (j9 != -9223372036854775807L) {
            this.f44996l = j9;
        }
    }

    @Override // n3.m
    public void f(InterfaceC1674k interfaceC1674k, I.d dVar) {
        dVar.a();
        this.f44988d = dVar.b();
        this.f44989e = interfaceC1674k.e(dVar.c(), 1);
    }

    public final void g() {
        this.f44985a.p(0);
        AbstractC1016b.C0088b c0088bF = AbstractC1016b.f(this.f44985a);
        C0936z0 c0936z0 = this.f44994j;
        if (c0936z0 == null || c0088bF.f7757d != c0936z0.f6480z || c0088bF.f7756c != c0936z0.f6447A || !k0.c(c0088bF.f7754a, c0936z0.f6467m)) {
            C0936z0.b bVarB0 = new C0936z0.b().U(this.f44988d).g0(c0088bF.f7754a).J(c0088bF.f7757d).h0(c0088bF.f7756c).X(this.f44987c).b0(c0088bF.f7760g);
            if ("audio/ac3".equals(c0088bF.f7754a)) {
                bVarB0.I(c0088bF.f7760g);
            }
            C0936z0 c0936z0G = bVarB0.G();
            this.f44994j = c0936z0G;
            this.f44989e.d(c0936z0G);
        }
        this.f44995k = c0088bF.f7758e;
        this.f44993i = (((long) c0088bF.f7759f) * 1000000) / ((long) this.f44994j.f6447A);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(d4.M r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6.a()
            r1 = 0
            if (r0 <= 0) goto L26
            boolean r0 = r5.f44992h
            r2 = 11
            r3 = 1
            if (r0 != 0) goto L18
            int r0 = r6.H()
            if (r0 != r2) goto L15
        L14:
            r1 = 1
        L15:
            r5.f44992h = r1
            goto L0
        L18:
            int r0 = r6.H()
            r4 = 119(0x77, float:1.67E-43)
            if (r0 != r4) goto L23
            r5.f44992h = r1
            return r3
        L23:
            if (r0 != r2) goto L15
            goto L14
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.C2250c.h(d4.M):boolean");
    }
}

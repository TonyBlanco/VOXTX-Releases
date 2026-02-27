package n3;

import O2.C0936z0;
import d3.InterfaceC1674k;
import d4.AbstractC1684a;
import d4.AbstractC1689f;
import d4.G;
import d4.M;
import d4.k0;
import java.util.Collections;
import n3.I;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f45165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f45166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d3.w f45167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f45168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45169e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f45176l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f45170f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f45171g = new u(32, 128);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f45172h = new u(33, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u f45173i = new u(34, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u f45174j = new u(39, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f45175k = new u(40, 128);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f45177m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final M f45178n = new M();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d3.w f45179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f45180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f45181c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f45182d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f45183e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f45184f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f45185g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f45186h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f45187i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f45188j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f45189k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f45190l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f45191m;

        public a(d3.w wVar) {
            this.f45179a = wVar;
        }

        public static boolean b(int i9) {
            return (32 <= i9 && i9 <= 35) || i9 == 39;
        }

        public static boolean c(int i9) {
            return i9 < 32 || i9 == 40;
        }

        public void a(long j9, int i9, boolean z9) {
            if (this.f45188j && this.f45185g) {
                this.f45191m = this.f45181c;
                this.f45188j = false;
            } else if (this.f45186h || this.f45185g) {
                if (z9 && this.f45187i) {
                    d(i9 + ((int) (j9 - this.f45180b)));
                }
                this.f45189k = this.f45180b;
                this.f45190l = this.f45183e;
                this.f45191m = this.f45181c;
                this.f45187i = true;
            }
        }

        public final void d(int i9) {
            long j9 = this.f45190l;
            if (j9 == -9223372036854775807L) {
                return;
            }
            boolean z9 = this.f45191m;
            this.f45179a.f(j9, z9 ? 1 : 0, (int) (this.f45180b - this.f45189k), i9, null);
        }

        public void e(byte[] bArr, int i9, int i10) {
            if (this.f45184f) {
                int i11 = this.f45182d;
                int i12 = (i9 + 2) - i11;
                if (i12 >= i10) {
                    this.f45182d = i11 + (i10 - i9);
                } else {
                    this.f45185g = (bArr[i12] & 128) != 0;
                    this.f45184f = false;
                }
            }
        }

        public void f() {
            this.f45184f = false;
            this.f45185g = false;
            this.f45186h = false;
            this.f45187i = false;
            this.f45188j = false;
        }

        public void g(long j9, int i9, int i10, long j10, boolean z9) {
            this.f45185g = false;
            this.f45186h = false;
            this.f45183e = j10;
            this.f45182d = 0;
            this.f45180b = j9;
            if (!c(i10)) {
                if (this.f45187i && !this.f45188j) {
                    if (z9) {
                        d(i9);
                    }
                    this.f45187i = false;
                }
                if (b(i10)) {
                    this.f45186h = !this.f45188j;
                    this.f45188j = true;
                }
            }
            boolean z10 = i10 >= 16 && i10 <= 21;
            this.f45181c = z10;
            this.f45184f = z10 || i10 <= 9;
        }
    }

    public q(D d9) {
        this.f45165a = d9;
    }

    private void a() {
        AbstractC1684a.i(this.f45167c);
        k0.j(this.f45168d);
    }

    private void g(long j9, int i9, int i10, long j10) {
        this.f45168d.a(j9, i9, this.f45169e);
        if (!this.f45169e) {
            this.f45171g.b(i10);
            this.f45172h.b(i10);
            this.f45173i.b(i10);
            if (this.f45171g.c() && this.f45172h.c() && this.f45173i.c()) {
                this.f45167c.d(i(this.f45166b, this.f45171g, this.f45172h, this.f45173i));
                this.f45169e = true;
            }
        }
        if (this.f45174j.b(i10)) {
            u uVar = this.f45174j;
            this.f45178n.S(this.f45174j.f45234d, d4.G.q(uVar.f45234d, uVar.f45235e));
            this.f45178n.V(5);
            this.f45165a.a(j10, this.f45178n);
        }
        if (this.f45175k.b(i10)) {
            u uVar2 = this.f45175k;
            this.f45178n.S(this.f45175k.f45234d, d4.G.q(uVar2.f45234d, uVar2.f45235e));
            this.f45178n.V(5);
            this.f45165a.a(j10, this.f45178n);
        }
    }

    private void h(byte[] bArr, int i9, int i10) {
        this.f45168d.e(bArr, i9, i10);
        if (!this.f45169e) {
            this.f45171g.a(bArr, i9, i10);
            this.f45172h.a(bArr, i9, i10);
            this.f45173i.a(bArr, i9, i10);
        }
        this.f45174j.a(bArr, i9, i10);
        this.f45175k.a(bArr, i9, i10);
    }

    public static C0936z0 i(String str, u uVar, u uVar2, u uVar3) {
        int i9 = uVar.f45235e;
        byte[] bArr = new byte[uVar2.f45235e + i9 + uVar3.f45235e];
        System.arraycopy(uVar.f45234d, 0, bArr, 0, i9);
        System.arraycopy(uVar2.f45234d, 0, bArr, uVar.f45235e, uVar2.f45235e);
        System.arraycopy(uVar3.f45234d, 0, bArr, uVar.f45235e + uVar2.f45235e, uVar3.f45235e);
        G.a aVarH = d4.G.h(uVar2.f45234d, 3, uVar2.f45235e);
        return new C0936z0.b().U(str).g0("video/hevc").K(AbstractC1689f.c(aVarH.f39655a, aVarH.f39656b, aVarH.f39657c, aVarH.f39658d, aVarH.f39662h, aVarH.f39663i)).n0(aVarH.f39665k).S(aVarH.f39666l).c0(aVarH.f39667m).V(Collections.singletonList(bArr)).G();
    }

    @Override // n3.m
    public void b(M m9) {
        a();
        while (m9.a() > 0) {
            int iF = m9.f();
            int iG = m9.g();
            byte[] bArrE = m9.e();
            this.f45176l += (long) m9.a();
            this.f45167c.b(m9, m9.a());
            while (iF < iG) {
                int iC = d4.G.c(bArrE, iF, iG, this.f45170f);
                if (iC == iG) {
                    h(bArrE, iF, iG);
                    return;
                }
                int iE = d4.G.e(bArrE, iC);
                int i9 = iC - iF;
                if (i9 > 0) {
                    h(bArrE, iF, iC);
                }
                int i10 = iG - iC;
                long j9 = this.f45176l - ((long) i10);
                g(j9, i10, i9 < 0 ? -i9 : 0, this.f45177m);
                j(j9, i10, iE, this.f45177m);
                iF = iC + 3;
            }
        }
    }

    @Override // n3.m
    public void c() {
        this.f45176l = 0L;
        this.f45177m = -9223372036854775807L;
        d4.G.a(this.f45170f);
        this.f45171g.d();
        this.f45172h.d();
        this.f45173i.d();
        this.f45174j.d();
        this.f45175k.d();
        a aVar = this.f45168d;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // n3.m
    public void d() {
    }

    @Override // n3.m
    public void e(long j9, int i9) {
        if (j9 != -9223372036854775807L) {
            this.f45177m = j9;
        }
    }

    @Override // n3.m
    public void f(InterfaceC1674k interfaceC1674k, I.d dVar) {
        dVar.a();
        this.f45166b = dVar.b();
        d3.w wVarE = interfaceC1674k.e(dVar.c(), 2);
        this.f45167c = wVarE;
        this.f45168d = new a(wVarE);
        this.f45165a.b(interfaceC1674k, dVar);
    }

    public final void j(long j9, int i9, int i10, long j10) {
        this.f45168d.g(j9, i9, i10, j10, this.f45169e);
        if (!this.f45169e) {
            this.f45171g.e(i10);
            this.f45172h.e(i10);
            this.f45173i.e(i10);
        }
        this.f45174j.e(i10);
        this.f45175k.e(i10);
    }
}

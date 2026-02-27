package n3;

import O2.C0936z0;
import Q2.b0;
import d3.InterfaceC1674k;
import d4.AbstractC1684a;
import d4.M;
import n3.I;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f45219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0.a f45220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d3.w f45222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f45223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f45226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f45227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f45228j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f45230l;

    public t() {
        this(null);
    }

    public t(String str) {
        this.f45224f = 0;
        M m9 = new M(4);
        this.f45219a = m9;
        m9.e()[0] = -1;
        this.f45220b = new b0.a();
        this.f45230l = -9223372036854775807L;
        this.f45221c = str;
    }

    public final void a(M m9) {
        byte[] bArrE = m9.e();
        int iG = m9.g();
        for (int iF = m9.f(); iF < iG; iF++) {
            byte b9 = bArrE[iF];
            boolean z9 = (b9 & 255) == 255;
            boolean z10 = this.f45227i && (b9 & 224) == 224;
            this.f45227i = z9;
            if (z10) {
                m9.U(iF + 1);
                this.f45227i = false;
                this.f45219a.e()[1] = bArrE[iF];
                this.f45225g = 2;
                this.f45224f = 1;
                return;
            }
        }
        m9.U(iG);
    }

    @Override // n3.m
    public void b(M m9) {
        AbstractC1684a.i(this.f45222d);
        while (m9.a() > 0) {
            int i9 = this.f45224f;
            if (i9 == 0) {
                a(m9);
            } else if (i9 == 1) {
                h(m9);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException();
                }
                g(m9);
            }
        }
    }

    @Override // n3.m
    public void c() {
        this.f45224f = 0;
        this.f45225g = 0;
        this.f45227i = false;
        this.f45230l = -9223372036854775807L;
    }

    @Override // n3.m
    public void d() {
    }

    @Override // n3.m
    public void e(long j9, int i9) {
        if (j9 != -9223372036854775807L) {
            this.f45230l = j9;
        }
    }

    @Override // n3.m
    public void f(InterfaceC1674k interfaceC1674k, I.d dVar) {
        dVar.a();
        this.f45223e = dVar.b();
        this.f45222d = interfaceC1674k.e(dVar.c(), 1);
    }

    public final void g(M m9) {
        int iMin = Math.min(m9.a(), this.f45229k - this.f45225g);
        this.f45222d.b(m9, iMin);
        int i9 = this.f45225g + iMin;
        this.f45225g = i9;
        int i10 = this.f45229k;
        if (i9 < i10) {
            return;
        }
        long j9 = this.f45230l;
        if (j9 != -9223372036854775807L) {
            this.f45222d.f(j9, 1, i10, 0, null);
            this.f45230l += this.f45228j;
        }
        this.f45225g = 0;
        this.f45224f = 0;
    }

    public final void h(M m9) {
        int iMin = Math.min(m9.a(), 4 - this.f45225g);
        m9.l(this.f45219a.e(), this.f45225g, iMin);
        int i9 = this.f45225g + iMin;
        this.f45225g = i9;
        if (i9 < 4) {
            return;
        }
        this.f45219a.U(0);
        if (!this.f45220b.a(this.f45219a.q())) {
            this.f45225g = 0;
            this.f45224f = 1;
            return;
        }
        b0.a aVar = this.f45220b;
        this.f45229k = aVar.f7770c;
        if (!this.f45226h) {
            this.f45228j = (((long) aVar.f7774g) * 1000000) / ((long) aVar.f7771d);
            this.f45222d.d(new C0936z0.b().U(this.f45223e).g0(this.f45220b.f7769b).Y(4096).J(this.f45220b.f7772e).h0(this.f45220b.f7771d).X(this.f45221c).G());
            this.f45226h = true;
        }
        this.f45219a.U(0);
        this.f45222d.b(this.f45219a, 4);
        this.f45224f = 2;
    }
}

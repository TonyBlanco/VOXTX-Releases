package n3;

import d3.InterfaceC1674k;
import d4.M;
import d4.Z;
import d4.k0;
import n3.I;

/* JADX INFO: loaded from: classes3.dex */
public final class C implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2247B f44919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f44920b = new M(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44924f;

    public C(InterfaceC2247B interfaceC2247B) {
        this.f44919a = interfaceC2247B;
    }

    @Override // n3.I
    public void a(Z z9, InterfaceC1674k interfaceC1674k, I.d dVar) {
        this.f44919a.a(z9, interfaceC1674k, dVar);
        this.f44924f = true;
    }

    @Override // n3.I
    public void b(M m9, int i9) {
        boolean z9 = (i9 & 1) != 0;
        int iF = z9 ? m9.f() + m9.H() : -1;
        if (this.f44924f) {
            if (!z9) {
                return;
            }
            this.f44924f = false;
            m9.U(iF);
            this.f44922d = 0;
        }
        while (m9.a() > 0) {
            int i10 = this.f44922d;
            if (i10 < 3) {
                if (i10 == 0) {
                    int iH = m9.H();
                    m9.U(m9.f() - 1);
                    if (iH == 255) {
                        this.f44924f = true;
                        return;
                    }
                }
                int iMin = Math.min(m9.a(), 3 - this.f44922d);
                m9.l(this.f44920b.e(), this.f44922d, iMin);
                int i11 = this.f44922d + iMin;
                this.f44922d = i11;
                if (i11 == 3) {
                    this.f44920b.U(0);
                    this.f44920b.T(3);
                    this.f44920b.V(1);
                    int iH2 = this.f44920b.H();
                    int iH3 = this.f44920b.H();
                    this.f44923e = (iH2 & 128) != 0;
                    this.f44921c = (((iH2 & 15) << 8) | iH3) + 3;
                    int iB = this.f44920b.b();
                    int i12 = this.f44921c;
                    if (iB < i12) {
                        this.f44920b.c(Math.min(4098, Math.max(i12, this.f44920b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(m9.a(), this.f44921c - this.f44922d);
                m9.l(this.f44920b.e(), this.f44922d, iMin2);
                int i13 = this.f44922d + iMin2;
                this.f44922d = i13;
                int i14 = this.f44921c;
                if (i13 != i14) {
                    continue;
                } else {
                    if (!this.f44923e) {
                        this.f44920b.T(i14);
                    } else {
                        if (k0.u(this.f44920b.e(), 0, this.f44921c, -1) != 0) {
                            this.f44924f = true;
                            return;
                        }
                        this.f44920b.T(this.f44921c - 4);
                    }
                    this.f44920b.U(0);
                    this.f44919a.b(this.f44920b);
                    this.f44922d = 0;
                }
            }
        }
    }

    @Override // n3.I
    public void c() {
        this.f44924f = true;
    }
}

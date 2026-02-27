package n3;

import O2.C0936z0;
import Q2.AbstractC1017c;
import d3.InterfaceC1674k;
import d4.AbstractC1684a;
import d4.L;
import d4.M;
import n3.I;

/* JADX INFO: renamed from: n3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2253f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f45001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f45002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f45004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d3.w f45005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f45008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f45009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f45010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0936z0 f45011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f45012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f45013m;

    public C2253f() {
        this(null);
    }

    public C2253f(String str) {
        L l9 = new L(new byte[16]);
        this.f45001a = l9;
        this.f45002b = new M(l9.f39700a);
        this.f45006f = 0;
        this.f45007g = 0;
        this.f45008h = false;
        this.f45009i = false;
        this.f45013m = -9223372036854775807L;
        this.f45003c = str;
    }

    private boolean a(M m9, byte[] bArr, int i9) {
        int iMin = Math.min(m9.a(), i9 - this.f45007g);
        m9.l(bArr, this.f45007g, iMin);
        int i10 = this.f45007g + iMin;
        this.f45007g = i10;
        return i10 == i9;
    }

    private void g() {
        this.f45001a.p(0);
        AbstractC1017c.b bVarD = AbstractC1017c.d(this.f45001a);
        C0936z0 c0936z0 = this.f45011k;
        if (c0936z0 == null || bVarD.f7778c != c0936z0.f6480z || bVarD.f7777b != c0936z0.f6447A || !"audio/ac4".equals(c0936z0.f6467m)) {
            C0936z0 c0936z0G = new C0936z0.b().U(this.f45004d).g0("audio/ac4").J(bVarD.f7778c).h0(bVarD.f7777b).X(this.f45003c).G();
            this.f45011k = c0936z0G;
            this.f45005e.d(c0936z0G);
        }
        this.f45012l = bVarD.f7779d;
        this.f45010j = (((long) bVarD.f7780e) * 1000000) / ((long) this.f45011k.f6447A);
    }

    private boolean h(M m9) {
        int iH;
        while (true) {
            if (m9.a() <= 0) {
                return false;
            }
            if (this.f45008h) {
                iH = m9.H();
                this.f45008h = iH == 172;
                if (iH == 64 || iH == 65) {
                    break;
                }
            } else {
                this.f45008h = m9.H() == 172;
            }
        }
        this.f45009i = iH == 65;
        return true;
    }

    @Override // n3.m
    public void b(M m9) {
        AbstractC1684a.i(this.f45005e);
        while (m9.a() > 0) {
            int i9 = this.f45006f;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        int iMin = Math.min(m9.a(), this.f45012l - this.f45007g);
                        this.f45005e.b(m9, iMin);
                        int i10 = this.f45007g + iMin;
                        this.f45007g = i10;
                        int i11 = this.f45012l;
                        if (i10 == i11) {
                            long j9 = this.f45013m;
                            if (j9 != -9223372036854775807L) {
                                this.f45005e.f(j9, 1, i11, 0, null);
                                this.f45013m += this.f45010j;
                            }
                            this.f45006f = 0;
                        }
                    }
                } else if (a(m9, this.f45002b.e(), 16)) {
                    g();
                    this.f45002b.U(0);
                    this.f45005e.b(this.f45002b, 16);
                    this.f45006f = 2;
                }
            } else if (h(m9)) {
                this.f45006f = 1;
                this.f45002b.e()[0] = -84;
                this.f45002b.e()[1] = (byte) (this.f45009i ? 65 : 64);
                this.f45007g = 2;
            }
        }
    }

    @Override // n3.m
    public void c() {
        this.f45006f = 0;
        this.f45007g = 0;
        this.f45008h = false;
        this.f45009i = false;
        this.f45013m = -9223372036854775807L;
    }

    @Override // n3.m
    public void d() {
    }

    @Override // n3.m
    public void e(long j9, int i9) {
        if (j9 != -9223372036854775807L) {
            this.f45013m = j9;
        }
    }

    @Override // n3.m
    public void f(InterfaceC1674k interfaceC1674k, I.d dVar) {
        dVar.a();
        this.f45004d = dVar.b();
        this.f45005e = interfaceC1674k.e(dVar.c(), 1);
    }
}

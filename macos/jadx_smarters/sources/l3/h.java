package L3;

import O2.C0897l1;
import d3.InterfaceC1674k;
import d3.w;
import d4.AbstractC1684a;
import d4.L;
import d4.M;
import d4.k0;
import s5.AbstractC2717A;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K3.h f4025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f4027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4032h;

    public h(K3.h hVar) {
        this.f4025a = hVar;
        try {
            this.f4026b = e(hVar.f3743d);
            this.f4028d = -9223372036854775807L;
            this.f4029e = -1;
            this.f4030f = 0;
            this.f4031g = 0L;
            this.f4032h = -9223372036854775807L;
        } catch (C0897l1 e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public static int e(AbstractC2717A abstractC2717A) throws C0897l1 {
        String str = (String) abstractC2717A.get("config");
        int i9 = 0;
        i9 = 0;
        if (str != null && str.length() % 2 == 0) {
            L l9 = new L(k0.L(str));
            int iH = l9.h(1);
            if (iH != 0) {
                throw C0897l1.b("unsupported audio mux version: " + iH, null);
            }
            AbstractC1684a.b(l9.h(1) == 1, "Only supports allStreamsSameTimeFraming.");
            int iH2 = l9.h(6);
            AbstractC1684a.b(l9.h(4) == 0, "Only suppors one program.");
            AbstractC1684a.b(l9.h(3) == 0, "Only suppors one layer.");
            i9 = iH2;
        }
        return i9 + 1;
    }

    private void f() {
        ((w) AbstractC1684a.e(this.f4027c)).f(this.f4032h, 1, this.f4030f, 0, null);
        this.f4030f = 0;
        this.f4032h = -9223372036854775807L;
    }

    @Override // L3.k
    public void a(long j9, long j10) {
        this.f4028d = j9;
        this.f4030f = 0;
        this.f4031g = j10;
    }

    @Override // L3.k
    public void b(long j9, int i9) {
        AbstractC1684a.g(this.f4028d == -9223372036854775807L);
        this.f4028d = j9;
    }

    @Override // L3.k
    public void c(M m9, long j9, int i9, boolean z9) {
        AbstractC1684a.i(this.f4027c);
        int iB = K3.e.b(this.f4029e);
        if (this.f4030f > 0 && iB < i9) {
            f();
        }
        for (int i10 = 0; i10 < this.f4026b; i10++) {
            int i11 = 0;
            while (m9.f() < m9.g()) {
                int iH = m9.H();
                i11 += iH;
                if (iH != 255) {
                    break;
                }
            }
            this.f4027c.b(m9, i11);
            this.f4030f += i11;
        }
        this.f4032h = m.a(this.f4031g, j9, this.f4028d, this.f4025a.f3741b);
        if (z9) {
            f();
        }
        this.f4029e = i9;
    }

    @Override // L3.k
    public void d(InterfaceC1674k interfaceC1674k, int i9) {
        w wVarE = interfaceC1674k.e(i9, 2);
        this.f4027c = wVarE;
        ((w) k0.j(wVarE)).d(this.f4025a.f3742c);
    }
}

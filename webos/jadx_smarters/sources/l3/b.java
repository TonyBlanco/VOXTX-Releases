package L3;

import d3.InterfaceC1674k;
import d3.w;
import d4.AbstractC1684a;
import d4.L;
import d4.M;
import d4.k0;
import r5.AbstractC2673b;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K3.h f3970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f3971b = new L();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f3977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f3978i;

    public b(K3.h hVar) {
        int i9;
        this.f3970a = hVar;
        this.f3972c = hVar.f3741b;
        String str = (String) AbstractC1684a.e((String) hVar.f3743d.get("mode"));
        if (AbstractC2673b.a(str, "AAC-hbr")) {
            this.f3973d = 13;
            i9 = 3;
        } else {
            if (!AbstractC2673b.a(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f3973d = 6;
            i9 = 2;
        }
        this.f3974e = i9;
        this.f3975f = this.f3974e + this.f3973d;
    }

    public static void e(w wVar, long j9, int i9) {
        wVar.f(j9, 1, i9, 0, null);
    }

    @Override // L3.k
    public void a(long j9, long j10) {
        this.f3976g = j9;
        this.f3978i = j10;
    }

    @Override // L3.k
    public void b(long j9, int i9) {
        this.f3976g = j9;
    }

    @Override // L3.k
    public void c(M m9, long j9, int i9, boolean z9) {
        AbstractC1684a.e(this.f3977h);
        short sD = m9.D();
        int i10 = sD / this.f3975f;
        long jA = m.a(this.f3978i, j9, this.f3976g, this.f3972c);
        this.f3971b.m(m9);
        if (i10 == 1) {
            int iH = this.f3971b.h(this.f3973d);
            this.f3971b.r(this.f3974e);
            this.f3977h.b(m9, m9.a());
            if (z9) {
                e(this.f3977h, jA, iH);
                return;
            }
            return;
        }
        m9.V((sD + 7) / 8);
        for (int i11 = 0; i11 < i10; i11++) {
            int iH2 = this.f3971b.h(this.f3973d);
            this.f3971b.r(this.f3974e);
            this.f3977h.b(m9, iH2);
            e(this.f3977h, jA, iH2);
            jA += k0.c1(i10, 1000000L, this.f3972c);
        }
    }

    @Override // L3.k
    public void d(InterfaceC1674k interfaceC1674k, int i9) {
        w wVarE = interfaceC1674k.e(i9, 1);
        this.f3977h = wVarE;
        wVarE.d(this.f3970a.f3742c);
    }
}

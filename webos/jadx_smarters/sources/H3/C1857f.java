package h3;

import O2.C0897l1;
import O2.C0936z0;
import d3.w;
import d4.G;
import d4.M;
import e4.C1738a;
import h3.AbstractC1856e;

/* JADX INFO: renamed from: h3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1857f extends AbstractC1856e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f41642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f41643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41647g;

    public C1857f(w wVar) {
        super(wVar);
        this.f41642b = new M(G.f39651a);
        this.f41643c = new M(4);
    }

    @Override // h3.AbstractC1856e
    public boolean b(M m9) throws AbstractC1856e.a {
        int iH = m9.H();
        int i9 = (iH >> 4) & 15;
        int i10 = iH & 15;
        if (i10 == 7) {
            this.f41647g = i9;
            return i9 != 5;
        }
        throw new AbstractC1856e.a("Video format not supported: " + i10);
    }

    @Override // h3.AbstractC1856e
    public boolean c(M m9, long j9) throws C0897l1 {
        int iH = m9.H();
        long jR = j9 + (((long) m9.r()) * 1000);
        if (iH == 0 && !this.f41645e) {
            M m10 = new M(new byte[m9.a()]);
            m9.l(m10.e(), 0, m9.a());
            C1738a c1738aB = C1738a.b(m10);
            this.f41644d = c1738aB.f40183b;
            this.f41641a.d(new C0936z0.b().g0("video/avc").K(c1738aB.f40190i).n0(c1738aB.f40184c).S(c1738aB.f40185d).c0(c1738aB.f40189h).V(c1738aB.f40182a).G());
            this.f41645e = true;
            return false;
        }
        if (iH != 1 || !this.f41645e) {
            return false;
        }
        int i9 = this.f41647g == 1 ? 1 : 0;
        if (!this.f41646f && i9 == 0) {
            return false;
        }
        byte[] bArrE = this.f41643c.e();
        bArrE[0] = 0;
        bArrE[1] = 0;
        bArrE[2] = 0;
        int i10 = 4 - this.f41644d;
        int i11 = 0;
        while (m9.a() > 0) {
            m9.l(this.f41643c.e(), i10, this.f41644d);
            this.f41643c.U(0);
            int iL = this.f41643c.L();
            this.f41642b.U(0);
            this.f41641a.b(this.f41642b, 4);
            this.f41641a.b(m9, iL);
            i11 = i11 + 4 + iL;
        }
        this.f41641a.f(jR, i9, i11, 0, null);
        this.f41646f = true;
        return true;
    }
}

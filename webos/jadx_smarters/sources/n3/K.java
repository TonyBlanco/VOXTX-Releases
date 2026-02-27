package n3;

import O2.C0936z0;
import d3.AbstractC1665b;
import d3.InterfaceC1674k;
import d4.AbstractC1684a;
import d4.M;
import java.util.List;
import n3.I;

/* JADX INFO: loaded from: classes3.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3.w[] f44980b;

    public K(List list) {
        this.f44979a = list;
        this.f44980b = new d3.w[list.size()];
    }

    public void a(long j9, M m9) {
        if (m9.a() < 9) {
            return;
        }
        int iQ = m9.q();
        int iQ2 = m9.q();
        int iH = m9.H();
        if (iQ == 434 && iQ2 == 1195456820 && iH == 3) {
            AbstractC1665b.b(j9, m9, this.f44980b);
        }
    }

    public void b(InterfaceC1674k interfaceC1674k, I.d dVar) {
        for (int i9 = 0; i9 < this.f44980b.length; i9++) {
            dVar.a();
            d3.w wVarE = interfaceC1674k.e(dVar.c(), 3);
            C0936z0 c0936z0 = (C0936z0) this.f44979a.get(i9);
            String str = c0936z0.f6467m;
            AbstractC1684a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            wVarE.d(new C0936z0.b().U(dVar.b()).g0(str).i0(c0936z0.f6459e).X(c0936z0.f6458d).H(c0936z0.f6451E).V(c0936z0.f6469o).G());
            this.f44980b[i9] = wVarE;
        }
    }
}

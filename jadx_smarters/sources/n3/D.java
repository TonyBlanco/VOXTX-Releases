package n3;

import O2.C0936z0;
import d3.AbstractC1665b;
import d3.InterfaceC1674k;
import d4.AbstractC1684a;
import d4.M;
import java.util.List;
import n3.I;

/* JADX INFO: loaded from: classes3.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3.w[] f44926b;

    public D(List list) {
        this.f44925a = list;
        this.f44926b = new d3.w[list.size()];
    }

    public void a(long j9, M m9) {
        AbstractC1665b.a(j9, m9, this.f44926b);
    }

    public void b(InterfaceC1674k interfaceC1674k, I.d dVar) {
        for (int i9 = 0; i9 < this.f44926b.length; i9++) {
            dVar.a();
            d3.w wVarE = interfaceC1674k.e(dVar.c(), 3);
            C0936z0 c0936z0 = (C0936z0) this.f44925a.get(i9);
            String str = c0936z0.f6467m;
            AbstractC1684a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String strB = c0936z0.f6456a;
            if (strB == null) {
                strB = dVar.b();
            }
            wVarE.d(new C0936z0.b().U(strB).g0(str).i0(c0936z0.f6459e).X(c0936z0.f6458d).H(c0936z0.f6451E).V(c0936z0.f6469o).G());
            this.f44926b[i9] = wVarE;
        }
    }
}

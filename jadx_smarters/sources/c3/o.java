package C3;

import B3.AbstractC0510s;
import O2.Q1;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends AbstractC0510s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f1136h;

    public o(Q1 q12, b bVar) {
        super(q12);
        AbstractC1684a.g(q12.n() == 1);
        AbstractC1684a.g(q12.u() == 1);
        this.f1136h = bVar;
    }

    @Override // B3.AbstractC0510s, O2.Q1
    public Q1.b l(int i9, Q1.b bVar, boolean z9) {
        this.f626g.l(i9, bVar, z9);
        long j9 = bVar.f5719e;
        if (j9 == -9223372036854775807L) {
            j9 = this.f1136h.f1046e;
        }
        bVar.z(bVar.f5716a, bVar.f5717c, bVar.f5718d, j9, bVar.t(), this.f1136h, bVar.f5721g);
        return bVar;
    }
}

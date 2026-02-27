package O3;

import N3.a;
import N3.b;
import O2.H0;
import b4.C1227s;
import b4.I;
import b4.InterfaceC1224o;
import c4.C1257c;
import d4.AbstractC1684a;
import d4.k0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import z3.AbstractC3027G;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends AbstractC3027G {
    public a(H0 h02, I.a aVar, C1257c.C0215c c0215c, Executor executor, long j9) {
        super(h02, aVar, c0215c, executor, j9);
    }

    public a(H0 h02, C1257c.C0215c c0215c, Executor executor) {
        this(h02.b().m(k0.C(((H0.h) AbstractC1684a.e(h02.f5528c)).f5625a)).a(), new b(), c0215c, executor, 20000L);
    }

    @Override // z3.AbstractC3027G
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public List h(InterfaceC1224o interfaceC1224o, N3.a aVar, boolean z9) {
        ArrayList arrayList = new ArrayList();
        for (a.b bVar : aVar.f5296f) {
            for (int i9 = 0; i9 < bVar.f5311j.length; i9++) {
                for (int i10 = 0; i10 < bVar.f5312k; i10++) {
                    arrayList.add(new AbstractC3027G.c(bVar.e(i10), new C1227s(bVar.a(i9, i10))));
                }
            }
        }
        return arrayList;
    }
}

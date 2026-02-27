package h2;

import U1.l;

/* JADX INFO: loaded from: classes.dex */
public class f implements S1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S1.g f41611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S1.g f41612b;

    public f(S1.g gVar, S1.g gVar2) {
        this.f41611a = gVar;
        this.f41612b = gVar2;
    }

    public f(V1.b bVar, S1.g gVar) {
        this(gVar, new g2.e(gVar, bVar));
    }

    @Override // S1.g
    public l a(l lVar, int i9, int i10) {
        S1.g gVar;
        S1.g gVar2;
        l lVarA = ((C1849a) lVar.get()).a();
        l lVarB = ((C1849a) lVar.get()).b();
        if (lVarA != null && (gVar2 = this.f41611a) != null) {
            l lVarA2 = gVar2.a(lVarA, i9, i10);
            return !lVarA.equals(lVarA2) ? new C1850b(new C1849a(lVarA2, ((C1849a) lVar.get()).b())) : lVar;
        }
        if (lVarB == null || (gVar = this.f41612b) == null) {
            return lVar;
        }
        l lVarA3 = gVar.a(lVarB, i9, i10);
        return !lVarB.equals(lVarA3) ? new C1850b(new C1849a(((C1849a) lVar.get()).a(), lVarA3)) : lVar;
    }

    @Override // S1.g
    public String getId() {
        return this.f41611a.getId();
    }
}

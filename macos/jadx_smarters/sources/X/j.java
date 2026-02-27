package x;

import w.C2899d;
import x.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean[] f51860a = new boolean[3];

    public static void a(f fVar, C2899d c2899d, e eVar) {
        eVar.f51797j = -1;
        eVar.f51799k = -1;
        e.b bVar = fVar.f51765M[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f51765M[0] == e.b.MATCH_PARENT) {
            int i9 = eVar.f51754B.f51748e;
            int iN = fVar.N() - eVar.f51756D.f51748e;
            d dVar = eVar.f51754B;
            dVar.f51750g = c2899d.q(dVar);
            d dVar2 = eVar.f51756D;
            dVar2.f51750g = c2899d.q(dVar2);
            c2899d.f(eVar.f51754B.f51750g, i9);
            c2899d.f(eVar.f51756D.f51750g, iN);
            eVar.f51797j = 2;
            eVar.h0(i9, iN);
        }
        if (fVar.f51765M[1] == bVar2 || eVar.f51765M[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i10 = eVar.f51755C.f51748e;
        int iT = fVar.t() - eVar.f51757E.f51748e;
        d dVar3 = eVar.f51755C;
        dVar3.f51750g = c2899d.q(dVar3);
        d dVar4 = eVar.f51757E;
        dVar4.f51750g = c2899d.q(dVar4);
        c2899d.f(eVar.f51755C.f51750g, i10);
        c2899d.f(eVar.f51757E.f51750g, iT);
        if (eVar.f51777Y > 0 || eVar.M() == 8) {
            d dVar5 = eVar.f51758F;
            dVar5.f51750g = c2899d.q(dVar5);
            c2899d.f(eVar.f51758F.f51750g, eVar.f51777Y + i10);
        }
        eVar.f51799k = 2;
        eVar.v0(i10, iT);
    }

    public static final boolean b(int i9, int i10) {
        return (i9 & i10) == i10;
    }
}

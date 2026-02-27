package W1;

import U1.l;
import W1.h;
import q2.C2536e;

/* JADX INFO: loaded from: classes.dex */
public class g extends C2536e implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h.a f10219e;

    public g(int i9) {
        super(i9);
    }

    @Override // W1.h
    public /* bridge */ /* synthetic */ l a(S1.c cVar, l lVar) {
        return (l) super.k(cVar, lVar);
    }

    @Override // W1.h
    public void b(int i9) {
        if (i9 >= 60) {
            c();
        } else if (i9 >= 40) {
            m(h() / 2);
        }
    }

    @Override // W1.h
    public /* bridge */ /* synthetic */ l d(S1.c cVar) {
        return (l) super.l(cVar);
    }

    @Override // W1.h
    public void e(h.a aVar) {
        this.f10219e = aVar;
    }

    @Override // q2.C2536e
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(l lVar) {
        return lVar.getSize();
    }

    @Override // q2.C2536e
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(S1.c cVar, l lVar) {
        h.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.b(lVar);
        }
    }
}

package V2;

import O2.H0;
import V2.C1051h;
import android.net.Uri;
import b4.InterfaceC1224o;
import b4.x;
import d4.AbstractC1684a;
import d4.k0;
import java.util.Map;
import s5.c0;

/* JADX INFO: renamed from: V2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1055l implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10001a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public H0.f f10002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y f10003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1224o.a f10004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10005e;

    @Override // V2.B
    public y a(H0 h02) {
        y yVar;
        AbstractC1684a.e(h02.f5528c);
        H0.f fVar = h02.f5528c.f5627d;
        if (fVar == null || k0.f39777a < 18) {
            return y.f10035a;
        }
        synchronized (this.f10001a) {
            try {
                if (!k0.c(fVar, this.f10002b)) {
                    this.f10002b = fVar;
                    this.f10003c = b(fVar);
                }
                yVar = (y) AbstractC1684a.e(this.f10003c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return yVar;
    }

    public final y b(H0.f fVar) {
        InterfaceC1224o.a aVarC = this.f10004d;
        if (aVarC == null) {
            aVarC = new x.b().c(this.f10005e);
        }
        Uri uri = fVar.f5583d;
        M m9 = new M(uri == null ? null : uri.toString(), fVar.f5588i, aVarC);
        c0 it = fVar.f5585f.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            m9.e((String) entry.getKey(), (String) entry.getValue());
        }
        C1051h c1051hA = new C1051h.b().f(fVar.f5581a, L.f9887d).c(fVar.f5586g).d(fVar.f5587h).e(w5.f.l(fVar.f5590k)).a(m9);
        c1051hA.E(0, fVar.e());
        return c1051hA;
    }

    public void c(InterfaceC1224o.a aVar) {
        this.f10004d = aVar;
    }
}

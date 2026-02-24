package O1;

import O1.j;
import Z1.l;
import android.graphics.Bitmap;
import i2.InterfaceC1881c;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final l f5416J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final l f5417K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final g f5418L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final j.d f5419M;

    public b(e eVar, l lVar, l lVar2, j.d dVar) {
        super(G(eVar.f5429d, lVar, lVar2, Bitmap.class, null), Bitmap.class, eVar);
        this.f5416J = lVar;
        this.f5417K = lVar2;
        this.f5418L = eVar.f5429d;
        this.f5419M = dVar;
    }

    public static l2.e G(g gVar, l lVar, l lVar2, Class cls, InterfaceC1881c interfaceC1881c) {
        if (lVar == null && lVar2 == null) {
            return null;
        }
        if (interfaceC1881c == null) {
            interfaceC1881c = gVar.f(Bitmap.class, cls);
        }
        return new l2.e(new Z1.f(lVar, lVar2), interfaceC1881c, gVar.a(Z1.g.class, Bitmap.class));
    }
}

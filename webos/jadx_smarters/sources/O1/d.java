package O1;

import O1.j;
import Z1.l;
import android.content.Context;
import e2.AbstractC1732b;
import h2.C1849a;
import i2.InterfaceC1881c;
import j2.C2087m;
import j2.InterfaceC2081g;

/* JADX INFO: loaded from: classes.dex */
public class d extends c {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final l f5420E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final l f5421F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final j.d f5422G;

    public d(Class cls, l lVar, l lVar2, Context context, g gVar, C2087m c2087m, InterfaceC2081g interfaceC2081g, j.d dVar) {
        super(context, cls, J(gVar, lVar, lVar2, C1849a.class, AbstractC1732b.class, null), gVar, c2087m, interfaceC2081g);
        this.f5420E = lVar;
        this.f5421F = lVar2;
        this.f5422G = dVar;
    }

    public static l2.e J(g gVar, l lVar, l lVar2, Class cls, Class cls2, InterfaceC1881c interfaceC1881c) {
        if (lVar == null && lVar2 == null) {
            return null;
        }
        if (interfaceC1881c == null) {
            interfaceC1881c = gVar.f(cls, cls2);
        }
        return new l2.e(new Z1.f(lVar, lVar2), interfaceC1881c, gVar.a(Z1.g.class, cls));
    }

    public b I() {
        j.d dVar = this.f5422G;
        return (b) dVar.a(new b(this, this.f5420E, this.f5421F, dVar));
    }
}

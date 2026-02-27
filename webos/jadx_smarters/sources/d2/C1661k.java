package d2;

import e2.AbstractC1731a;
import q2.AbstractC2539h;

/* JADX INFO: renamed from: d2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1661k extends AbstractC1731a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V1.b f39545b;

    public C1661k(C1660j c1660j, V1.b bVar) {
        super(c1660j);
        this.f39545b = bVar;
    }

    @Override // U1.l
    public void b() {
        this.f39545b.a(((C1660j) this.f40148a).d());
    }

    @Override // U1.l
    public int getSize() {
        return AbstractC2539h.e(((C1660j) this.f40148a).d());
    }
}

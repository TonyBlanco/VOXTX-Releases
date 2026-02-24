package J3;

import b4.I;
import java.util.List;
import z3.C3024D;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f3126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3127b;

    public e(j jVar, List list) {
        this.f3126a = jVar;
        this.f3127b = list;
    }

    @Override // J3.j
    public I.a a(g gVar, f fVar) {
        return new C3024D(this.f3126a.a(gVar, fVar), this.f3127b);
    }

    @Override // J3.j
    public I.a b() {
        return new C3024D(this.f3126a.b(), this.f3127b);
    }
}

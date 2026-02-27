package h2;

import U1.l;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class d implements S1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S1.f f41607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S1.f f41608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f41609c;

    public d(S1.f fVar, S1.f fVar2) {
        this.f41607a = fVar;
        this.f41608b = fVar2;
    }

    @Override // S1.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(l lVar, OutputStream outputStream) {
        C1849a c1849a = (C1849a) lVar.get();
        l lVarA = c1849a.a();
        return lVarA != null ? this.f41607a.a(lVarA, outputStream) : this.f41608b.a(c1849a.b(), outputStream);
    }

    @Override // S1.b
    public String getId() {
        if (this.f41609c == null) {
            this.f41609c = this.f41607a.getId() + this.f41608b.getId();
        }
        return this.f41609c;
    }
}

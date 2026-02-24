package Z1;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class h implements S1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S1.b f10878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S1.b f10879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10880c;

    public h(S1.b bVar, S1.b bVar2) {
        this.f10878a = bVar;
        this.f10879b = bVar2;
    }

    @Override // S1.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(g gVar, OutputStream outputStream) {
        S1.b bVar;
        Object objA;
        if (gVar.b() != null) {
            bVar = this.f10878a;
            objA = gVar.b();
        } else {
            bVar = this.f10879b;
            objA = gVar.a();
        }
        return bVar.a(objA, outputStream);
    }

    @Override // S1.b
    public String getId() {
        if (this.f10880c == null) {
            this.f10880c = this.f10878a.getId() + this.f10879b.getId();
        }
        return this.f10880c;
    }
}

package Y6;

import java.util.ArrayList;
import java.util.List;
import x6.C2962c;

/* JADX INFO: loaded from: classes.dex */
public class i implements x6.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x6.m f10694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f10695b = new ArrayList();

    public i(x6.m mVar) {
        this.f10694a = mVar;
    }

    @Override // x6.r
    public void a(x6.q qVar) {
        this.f10695b.add(qVar);
    }

    public x6.o b(C2962c c2962c) {
        this.f10695b.clear();
        try {
            x6.m mVar = this.f10694a;
            if (mVar instanceof x6.j) {
                x6.o oVarD = ((x6.j) mVar).d(c2962c);
                this.f10694a.reset();
                return oVarD;
            }
            x6.o oVarA = mVar.a(c2962c);
            this.f10694a.reset();
            return oVarA;
        } catch (Exception unused) {
            this.f10694a.reset();
            return null;
        } catch (Throwable th) {
            this.f10694a.reset();
            throw th;
        }
    }

    public x6.o c(x6.i iVar) {
        return b(e(iVar));
    }

    public List d() {
        return new ArrayList(this.f10695b);
    }

    public C2962c e(x6.i iVar) {
        return new C2962c(new D6.j(iVar));
    }
}

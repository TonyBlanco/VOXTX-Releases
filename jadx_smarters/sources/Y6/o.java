package Y6;

import x6.C2962c;

/* JADX INFO: loaded from: classes.dex */
public class o extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10714c;

    public o(x6.m mVar) {
        super(mVar);
        this.f10714c = true;
    }

    @Override // Y6.i
    public C2962c e(x6.i iVar) {
        if (this.f10714c) {
            this.f10714c = false;
            return new C2962c(new D6.j(iVar.e()));
        }
        this.f10714c = true;
        return new C2962c(new D6.j(iVar));
    }
}

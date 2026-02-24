package G8;

import k8.j;

/* JADX INFO: loaded from: classes4.dex */
public final class O0 extends D0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0587o f2300f;

    public O0(C0587o c0587o) {
        this.f2300f = c0587o;
    }

    @Override // w8.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        z((Throwable) obj);
        return k8.q.f43674a;
    }

    @Override // G8.D
    public void z(Throwable th) {
        C0587o c0587o;
        Object objH;
        Object objD0 = A().d0();
        if (objD0 instanceof B) {
            c0587o = this.f2300f;
            j.a aVar = k8.j.f43666c;
            objH = k8.k.a(((B) objD0).f2261a);
        } else {
            c0587o = this.f2300f;
            j.a aVar2 = k8.j.f43666c;
            objH = F0.h(objD0);
        }
        c0587o.resumeWith(k8.j.b(objH));
    }
}

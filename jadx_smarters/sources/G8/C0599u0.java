package G8;

/* JADX INFO: renamed from: G8.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0599u0 extends AbstractC0581l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w8.l f2362a;

    public C0599u0(w8.l lVar) {
        this.f2362a = lVar;
    }

    @Override // G8.AbstractC0583m
    public void a(Throwable th) {
        this.f2362a.invoke(th);
    }

    @Override // w8.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return k8.q.f43674a;
    }

    public String toString() {
        return "InvokeOnCancel[" + P.a(this.f2362a) + '@' + P.b(this) + ']';
    }
}

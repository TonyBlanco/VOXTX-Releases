package G8;

/* JADX INFO: renamed from: G8.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0598u extends AbstractC0609z0 implements InterfaceC0596t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC0600v f2361f;

    public C0598u(InterfaceC0600v interfaceC0600v) {
        this.f2361f = interfaceC0600v;
    }

    @Override // G8.InterfaceC0596t
    public boolean b(Throwable th) {
        return A().M(th);
    }

    @Override // G8.InterfaceC0596t
    public InterfaceC0605x0 getParent() {
        return A();
    }

    @Override // w8.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        z((Throwable) obj);
        return k8.q.f43674a;
    }

    @Override // G8.D
    public void z(Throwable th) {
        this.f2361f.g(A());
    }
}

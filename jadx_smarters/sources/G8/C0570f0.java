package G8;

/* JADX INFO: renamed from: G8.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0570f0 extends D0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC0566d0 f2331f;

    public C0570f0(InterfaceC0566d0 interfaceC0566d0) {
        this.f2331f = interfaceC0566d0;
    }

    @Override // w8.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        z((Throwable) obj);
        return k8.q.f43674a;
    }

    @Override // G8.D
    public void z(Throwable th) {
        this.f2331f.dispose();
    }
}

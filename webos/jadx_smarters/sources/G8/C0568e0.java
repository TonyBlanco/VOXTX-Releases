package G8;

/* JADX INFO: renamed from: G8.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0568e0 extends AbstractC0581l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0566d0 f2330a;

    public C0568e0(InterfaceC0566d0 interfaceC0566d0) {
        this.f2330a = interfaceC0566d0;
    }

    @Override // G8.AbstractC0583m
    public void a(Throwable th) {
        this.f2330a.dispose();
    }

    @Override // w8.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return k8.q.f43674a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f2330a + ']';
    }
}

package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
final class Y extends AbstractC1988k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42565b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(int i9, InterfaceC2018q2 interfaceC2018q2) {
        super(interfaceC2018q2);
        this.f42565b = i9;
    }

    @Override // j$.util.stream.InterfaceC2008o2, j$.util.stream.InterfaceC2018q2
    public final void accept(int i9) {
        switch (this.f42565b) {
            case 0:
                this.f42690a.accept(i9);
                break;
            default:
                this.f42690a.accept(i9);
                break;
        }
    }
}

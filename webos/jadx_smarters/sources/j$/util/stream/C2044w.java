package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2044w extends AbstractC1941b0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f42770m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2044w(AbstractC1940b abstractC1940b, int i9, int i10) {
        super(abstractC1940b, i9, 1);
        this.f42770m = i10;
    }

    @Override // j$.util.stream.AbstractC1940b
    final InterfaceC2018q2 R(int i9, InterfaceC2018q2 interfaceC2018q2) {
        switch (this.f42770m) {
            case 0:
                return new C2029t(this, interfaceC2018q2, 2);
            case 1:
                return new W(this, interfaceC2018q2, 2);
            case 2:
                return interfaceC2018q2;
            case 3:
                return new W(this, interfaceC2018q2, 5);
            default:
                return new C1956e0(this, interfaceC2018q2, 2);
        }
    }
}

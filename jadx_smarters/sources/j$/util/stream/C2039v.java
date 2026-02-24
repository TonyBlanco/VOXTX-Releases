package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2039v extends B {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f42762m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2039v(AbstractC1940b abstractC1940b, int i9, int i10) {
        super(abstractC1940b, i9, 1);
        this.f42762m = i10;
    }

    @Override // j$.util.stream.AbstractC1940b
    final InterfaceC2018q2 R(int i9, InterfaceC2018q2 interfaceC2018q2) {
        switch (this.f42762m) {
            case 0:
                return new C2029t(this, interfaceC2018q2, 1);
            case 1:
                return interfaceC2018q2;
            case 2:
                return new C2029t(this, interfaceC2018q2, 4);
            case 3:
                return new Y(1, interfaceC2018q2);
            case 4:
                return new W(this, interfaceC2018q2, 4);
            case 5:
                return new C1961f0(interfaceC2018q2);
            default:
                return new C1956e0(this, interfaceC2018q2, 3);
        }
    }
}

package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2059z extends B {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f42799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f42800n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2059z(AbstractC1940b abstractC1940b, int i9, Object obj, int i10) {
        super(abstractC1940b, i9, 1);
        this.f42799m = i10;
        this.f42800n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2059z(AbstractC1940b abstractC1940b, DoubleConsumer doubleConsumer) {
        super(abstractC1940b, 0, 1);
        this.f42799m = 1;
        this.f42800n = doubleConsumer;
    }

    @Override // j$.util.stream.AbstractC1940b
    final InterfaceC2018q2 R(int i9, InterfaceC2018q2 interfaceC2018q2) {
        switch (this.f42799m) {
            case 0:
                return new C2054y(this, interfaceC2018q2);
            case 1:
                return new C2029t(this, interfaceC2018q2, 5);
            case 2:
                return new C2000n(this, interfaceC2018q2, 6);
            default:
                return new C1953d2(this, interfaceC2018q2);
        }
    }
}

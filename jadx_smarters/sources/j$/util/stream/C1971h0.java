package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1971h0 extends AbstractC1981j0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f42674m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f42675n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1971h0(AbstractC1940b abstractC1940b, int i9, Object obj, int i10) {
        super(abstractC1940b, i9, 1);
        this.f42674m = i10;
        this.f42675n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1971h0(AbstractC1940b abstractC1940b, LongConsumer longConsumer) {
        super(abstractC1940b, 0, 1);
        this.f42674m = 1;
        this.f42675n = longConsumer;
    }

    @Override // j$.util.stream.AbstractC1940b
    final InterfaceC2018q2 R(int i9, InterfaceC2018q2 interfaceC2018q2) {
        switch (this.f42674m) {
            case 0:
                return new C1966g0(this, interfaceC2018q2);
            case 1:
                return new C1956e0(this, interfaceC2018q2, 5);
            case 2:
                return new C1953d2(this, interfaceC2018q2);
            default:
                return new C2000n(this, interfaceC2018q2, 5);
        }
    }
}

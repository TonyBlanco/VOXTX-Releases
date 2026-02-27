package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2034u extends AbstractC1973h2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f42755m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f42756n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2034u(AbstractC1940b abstractC1940b, int i9, Object obj, int i10) {
        super(abstractC1940b, i9, 1);
        this.f42755m = i10;
        this.f42756n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2034u(AbstractC1940b abstractC1940b, Consumer consumer) {
        super(abstractC1940b, 0, 1);
        this.f42755m = 3;
        this.f42756n = consumer;
    }

    @Override // j$.util.stream.AbstractC1940b
    final InterfaceC2018q2 R(int i9, InterfaceC2018q2 interfaceC2018q2) {
        switch (this.f42755m) {
            case 0:
                return new C2029t(this, interfaceC2018q2, 0);
            case 1:
                return new W(this, interfaceC2018q2, 0);
            case 2:
                return new C1956e0(this, interfaceC2018q2, 0);
            case 3:
                return new C2000n(this, interfaceC2018q2, 1);
            default:
                return new C2000n(this, interfaceC2018q2, 2);
        }
    }
}

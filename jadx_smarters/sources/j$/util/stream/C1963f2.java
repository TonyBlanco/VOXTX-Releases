package j$.util.stream;

import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.stream.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1963f2 extends AbstractC1973h2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f42645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function f42646n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1963f2(AbstractC1940b abstractC1940b, int i9, Function function, int i10) {
        super(abstractC1940b, i9, 1);
        this.f42645m = i10;
        this.f42646n = function;
    }

    @Override // j$.util.stream.AbstractC1940b
    final InterfaceC2018q2 R(int i9, InterfaceC2018q2 interfaceC2018q2) {
        switch (this.f42645m) {
            case 0:
                return new C2000n(this, interfaceC2018q2, 3);
            default:
                return new C1995m(this, interfaceC2018q2);
        }
    }
}

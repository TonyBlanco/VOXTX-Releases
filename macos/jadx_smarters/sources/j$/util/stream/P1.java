package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* JADX INFO: loaded from: classes2.dex */
final class P1 extends AbstractC2055y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f42501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f42502i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P1(EnumC1964f3 enumC1964f3, IntBinaryOperator intBinaryOperator, int i9) {
        super(enumC1964f3);
        this.f42501h = intBinaryOperator;
        this.f42502i = i9;
    }

    @Override // j$.util.stream.AbstractC2055y0
    public final U1 e0() {
        return new O1(this.f42502i, this.f42501h);
    }
}

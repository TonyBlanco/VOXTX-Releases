package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* JADX INFO: loaded from: classes2.dex */
final class I1 extends AbstractC2055y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f42448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ double f42449i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I1(EnumC1964f3 enumC1964f3, DoubleBinaryOperator doubleBinaryOperator, double d9) {
        super(enumC1964f3);
        this.f42448h = doubleBinaryOperator;
        this.f42449i = d9;
    }

    @Override // j$.util.stream.AbstractC2055y0
    public final U1 e0() {
        return new D1(this.f42449i, this.f42448h);
    }
}

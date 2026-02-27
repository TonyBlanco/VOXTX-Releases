package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* JADX INFO: loaded from: classes2.dex */
final class C1 extends AbstractC2055y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f42402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ Object f42403i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1(EnumC1964f3 enumC1964f3, Object obj, int i9) {
        super(enumC1964f3);
        this.f42402h = i9;
        this.f42403i = obj;
    }

    @Override // j$.util.stream.AbstractC2055y0
    public final U1 e0() {
        switch (this.f42402h) {
            case 0:
                return new T1((LongBinaryOperator) this.f42403i);
            case 1:
                return new F1((DoubleBinaryOperator) this.f42403i);
            case 2:
                return new K1((BinaryOperator) this.f42403i);
            default:
                return new Q1((IntBinaryOperator) this.f42403i);
        }
    }
}

package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
final class E1 extends AbstractC2055y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f42413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ Object f42414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ Object f42415j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ Object f42416k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E1(EnumC1964f3 enumC1964f3, Object obj, Object obj2, Object obj3, int i9) {
        super(enumC1964f3);
        this.f42413h = i9;
        this.f42414i = obj;
        this.f42416k = obj2;
        this.f42415j = obj3;
    }

    public /* synthetic */ E1(EnumC1964f3 enumC1964f3, BinaryOperator binaryOperator, Object obj, Supplier supplier, int i9) {
        this.f42413h = i9;
        this.f42414i = binaryOperator;
        this.f42416k = obj;
        this.f42415j = supplier;
    }

    @Override // j$.util.stream.AbstractC2055y0
    public final U1 e0() {
        switch (this.f42413h) {
            case 0:
                return new B1((Supplier) this.f42415j, (ObjLongConsumer) this.f42416k, (BinaryOperator) this.f42414i);
            case 1:
                return new H1((Supplier) this.f42415j, (ObjDoubleConsumer) this.f42416k, (BinaryOperator) this.f42414i);
            case 2:
                return new J1(this.f42415j, (BiFunction) this.f42416k, (BinaryOperator) this.f42414i);
            case 3:
                return new N1((Supplier) this.f42415j, (BiConsumer) this.f42416k, (BiConsumer) this.f42414i);
            default:
                return new R1((Supplier) this.f42415j, (ObjIntConsumer) this.f42416k, (BinaryOperator) this.f42414i);
        }
    }
}

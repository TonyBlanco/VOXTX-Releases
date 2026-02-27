package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
final class O3 extends AbstractC1973h2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ Predicate f42498m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O3(AbstractC1940b abstractC1940b, int i9, Predicate predicate) {
        super(abstractC1940b, i9, 0);
        this.f42498m = predicate;
    }

    @Override // j$.util.stream.AbstractC1940b
    final K0 O(AbstractC1940b abstractC1940b, Spliterator spliterator, IntFunction intFunction) {
        return (K0) new g4(this, abstractC1940b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC1940b
    final Spliterator P(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        return EnumC1959e3.ORDERED.q(abstractC1940b.K()) ? O(abstractC1940b, spliterator, new C2024s(29)).spliterator() : new k4(abstractC1940b.X(spliterator), this.f42498m, 1);
    }

    @Override // j$.util.stream.AbstractC1940b
    final InterfaceC2018q2 R(int i9, InterfaceC2018q2 interfaceC2018q2) {
        return new C1995m(this, interfaceC2018q2);
    }
}

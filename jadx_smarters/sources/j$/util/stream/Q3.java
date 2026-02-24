package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
final class Q3 extends AbstractC1973h2 implements d4 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ Predicate f42516m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3(AbstractC1940b abstractC1940b, int i9, Predicate predicate) {
        super(abstractC1940b, i9, 0);
        this.f42516m = predicate;
    }

    @Override // j$.util.stream.AbstractC1940b
    final K0 O(AbstractC1940b abstractC1940b, Spliterator spliterator, IntFunction intFunction) {
        return (K0) new f4(this, abstractC1940b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC1940b
    final Spliterator P(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        return EnumC1959e3.ORDERED.q(abstractC1940b.K()) ? O(abstractC1940b, spliterator, new C2024s(29)).spliterator() : new k4(abstractC1940b.X(spliterator), this.f42516m, 0);
    }

    @Override // j$.util.stream.AbstractC1940b
    final InterfaceC2018q2 R(int i9, InterfaceC2018q2 interfaceC2018q2) {
        return new P3(this, interfaceC2018q2, false);
    }

    @Override // j$.util.stream.d4
    public final e4 k(C0 c02, boolean z9) {
        return new P3(this, c02, z9);
    }
}

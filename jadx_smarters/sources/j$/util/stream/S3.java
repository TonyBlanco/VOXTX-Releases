package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class S3 extends AbstractC1941b0 {
    @Override // j$.util.stream.AbstractC1940b
    final K0 O(AbstractC1940b abstractC1940b, Spliterator spliterator, IntFunction intFunction) {
        return (K0) new g4(this, abstractC1940b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC1940b
    final Spliterator P(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        return EnumC1959e3.ORDERED.q(abstractC1940b.K()) ? O(abstractC1940b, spliterator, new C1948c2(6)).spliterator() : new i4((j$.util.H) abstractC1940b.X(spliterator), 1);
    }

    @Override // j$.util.stream.AbstractC1940b
    final InterfaceC2018q2 R(int i9, InterfaceC2018q2 interfaceC2018q2) {
        return new R3(this, interfaceC2018q2);
    }
}

package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class U3 extends AbstractC1941b0 implements d4 {
    @Override // j$.util.stream.AbstractC1940b
    final K0 O(AbstractC1940b abstractC1940b, Spliterator spliterator, IntFunction intFunction) {
        return (K0) new f4(this, abstractC1940b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC1940b
    final Spliterator P(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        return EnumC1959e3.ORDERED.q(abstractC1940b.K()) ? O(abstractC1940b, spliterator, new C1948c2(7)).spliterator() : new i4((j$.util.H) abstractC1940b.X(spliterator), 0);
    }

    @Override // j$.util.stream.AbstractC1940b
    final InterfaceC2018q2 R(int i9, InterfaceC2018q2 interfaceC2018q2) {
        return new T3(this, interfaceC2018q2, false);
    }

    @Override // j$.util.stream.d4
    public final e4 k(C0 c02, boolean z9) {
        return new T3(this, c02, z9);
    }
}

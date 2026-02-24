package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2005o extends AbstractC1973h2 {
    static O0 Y(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        C2015q c2015q = new C2015q(19);
        C2015q c2015q2 = new C2015q(20);
        C2015q c2015q3 = new C2015q(21);
        Objects.requireNonNull(c2015q);
        Objects.requireNonNull(c2015q2);
        Objects.requireNonNull(c2015q3);
        return new O0((Collection) new E1(EnumC1964f3.REFERENCE, (Object) c2015q3, (Object) c2015q2, (Object) c2015q, 3).c(abstractC1940b, spliterator));
    }

    @Override // j$.util.stream.AbstractC1940b
    final K0 O(AbstractC1940b abstractC1940b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC1959e3.DISTINCT.q(abstractC1940b.K())) {
            return abstractC1940b.C(spliterator, false, intFunction);
        }
        if (EnumC1959e3.ORDERED.q(abstractC1940b.K())) {
            return Y(abstractC1940b, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C2011p0 c2011p0 = new C2011p0(2, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(c2011p0);
        new Q(c2011p0, false).e(abstractC1940b, spliterator);
        Collection collectionKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new O0(collectionKeySet);
    }

    @Override // j$.util.stream.AbstractC1940b
    final Spliterator P(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        return EnumC1959e3.DISTINCT.q(abstractC1940b.K()) ? abstractC1940b.X(spliterator) : EnumC1959e3.ORDERED.q(abstractC1940b.K()) ? Y(abstractC1940b, spliterator).spliterator() : new C2004n3(abstractC1940b.X(spliterator));
    }

    @Override // j$.util.stream.AbstractC1940b
    final InterfaceC2018q2 R(int i9, InterfaceC2018q2 interfaceC2018q2) {
        Objects.requireNonNull(interfaceC2018q2);
        return EnumC1959e3.DISTINCT.q(i9) ? interfaceC2018q2 : EnumC1959e3.SORTED.q(i9) ? new C1995m(interfaceC2018q2) : new C2000n(interfaceC2018q2);
    }
}

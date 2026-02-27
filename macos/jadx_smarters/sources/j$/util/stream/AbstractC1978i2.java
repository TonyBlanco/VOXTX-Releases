package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.stream.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1978i2 extends AbstractC1940b implements Stream {
    @Override // j$.util.stream.AbstractC1940b
    final K0 F(AbstractC1940b abstractC1940b, Spliterator spliterator, boolean z9, IntFunction intFunction) {
        return AbstractC2055y0.E(abstractC1940b, spliterator, z9, intFunction);
    }

    @Override // j$.util.stream.AbstractC1940b
    final boolean H(Spliterator spliterator, InterfaceC2018q2 interfaceC2018q2) {
        boolean zO;
        do {
            zO = interfaceC2018q2.o();
            if (zO) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC2018q2));
        return zO;
    }

    @Override // j$.util.stream.AbstractC1940b
    final EnumC1964f3 I() {
        return EnumC1964f3.REFERENCE;
    }

    @Override // j$.util.stream.AbstractC1940b
    final C0 N(long j9, IntFunction intFunction) {
        return AbstractC2055y0.D(j9, intFunction);
    }

    @Override // j$.util.stream.AbstractC1940b
    final Spliterator U(AbstractC1940b abstractC1940b, Supplier supplier, boolean z9) {
        return new I3(abstractC1940b, supplier, z9);
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) D(AbstractC2055y0.c0(EnumC2040v0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) D(AbstractC2055y0.c0(EnumC2040v0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return D(new E1(EnumC1964f3.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) D(new G1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new C2005o(this, EnumC1959e3.f42629m | EnumC1959e3.f42636t, 0);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i9 = m4.f42710a;
        Objects.requireNonNull(predicate);
        return new Q3(this, m4.f42711b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream e(C1935a c1935a) {
        Objects.requireNonNull(c1935a);
        return new C1963f2(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n | EnumC1959e3.f42636t, c1935a, 1);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new C2034u(this, EnumC1959e3.f42636t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) D(K.f42460d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) D(K.f42459c);
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        D(new Q(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        D(new Q(consumer, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x014b  */
    @Override // j$.util.stream.Stream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(j$.util.stream.C1980j r10) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.AbstractC1978i2.h(j$.util.stream.j):java.lang.Object");
    }

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final Iterator iterator() {
        return Spliterators.i(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j9) {
        if (j9 >= 0) {
            return AbstractC2055y0.d0(this, 0L, j9);
        }
        throw new IllegalArgumentException(Long.toString(j9));
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new C1963f2(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final F mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new C2059z(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n, toDoubleFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new X(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC2001n0 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new C1971h0(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 0));
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) D(AbstractC2055y0.c0(EnumC2040v0.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC2001n0 o(C1935a c1935a) {
        Objects.requireNonNull(c1935a);
        return new C1971h0(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n | EnumC1959e3.f42636t, c1935a, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C2034u(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) D(new C1(EnumC1964f3.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return D(new E1(EnumC1964f3.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return D(new E1(EnumC1964f3.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j9) {
        if (j9 >= 0) {
            return j9 == 0 ? this : AbstractC2055y0.d0(this, j9, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j9));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new L2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new L2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final IntStream t(C1935a c1935a) {
        Objects.requireNonNull(c1935a);
        return new X(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n | EnumC1959e3.f42636t, c1935a, 3);
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i9 = m4.f42710a;
        Objects.requireNonNull(predicate);
        return new O3(this, m4.f42710a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new C1948c2(0));
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC2055y0.N(E(intFunction), intFunction).p(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final F z(C1935a c1935a) {
        Objects.requireNonNull(c1935a);
        return new C2059z(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n | EnumC1959e3.f42636t, c1935a, 3);
    }
}

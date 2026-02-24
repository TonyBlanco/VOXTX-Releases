package j$.util.stream;

import j$.util.C1926j;
import j$.util.C1927k;
import j$.util.C1929m;
import j$.util.InterfaceC2069y;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1986k0 extends AbstractC1940b implements InterfaceC2001n0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.K Z(Spliterator spliterator) {
        if (spliterator instanceof j$.util.K) {
            return (j$.util.K) spliterator;
        }
        if (!N3.f42490a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        N3.a(AbstractC1940b.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC1940b
    final K0 F(AbstractC1940b abstractC1940b, Spliterator spliterator, boolean z9, IntFunction intFunction) {
        return AbstractC2055y0.H(abstractC1940b, spliterator, z9);
    }

    @Override // j$.util.stream.AbstractC1940b
    final boolean H(Spliterator spliterator, InterfaceC2018q2 interfaceC2018q2) {
        LongConsumer c1951d0;
        boolean zO;
        j$.util.K kZ = Z(spliterator);
        if (interfaceC2018q2 instanceof LongConsumer) {
            c1951d0 = (LongConsumer) interfaceC2018q2;
        } else {
            if (N3.f42490a) {
                N3.a(AbstractC1940b.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC2018q2);
            c1951d0 = new C1951d0(interfaceC2018q2);
        }
        do {
            zO = interfaceC2018q2.o();
            if (zO) {
                break;
            }
        } while (kZ.tryAdvance(c1951d0));
        return zO;
    }

    @Override // j$.util.stream.AbstractC1940b
    final EnumC1964f3 I() {
        return EnumC1964f3.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC1940b
    final C0 N(long j9, IntFunction intFunction) {
        return AbstractC2055y0.U(j9);
    }

    @Override // j$.util.stream.AbstractC1940b
    final Spliterator U(AbstractC1940b abstractC1940b, Supplier supplier, boolean z9) {
        return new C2033t3(abstractC1940b, supplier, z9);
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final InterfaceC2001n0 a() {
        int i9 = m4.f42710a;
        Objects.requireNonNull(null);
        return new W3(this, m4.f42710a, 0);
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final F asDoubleStream() {
        return new C2039v(this, EnumC1959e3.f42630n, 5);
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final C1927k average() {
        long j9 = ((long[]) collect(new C2024s(23), new C2024s(24), new C2024s(25)))[0];
        return j9 > 0 ? C1927k.d(r0[1] / j9) : C1927k.a();
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final InterfaceC2001n0 b() {
        Objects.requireNonNull(null);
        return new C2049x(this, EnumC1959e3.f42636t, 5);
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final Stream boxed() {
        return new C2034u(this, 0, new C2024s(22), 2);
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final InterfaceC2001n0 c() {
        int i9 = m4.f42710a;
        Objects.requireNonNull(null);
        return new Y3(this, m4.f42711b, 0);
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        r rVar = new r(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(rVar);
        return D(new E1(EnumC1964f3.LONG_VALUE, (BinaryOperator) rVar, (Object) objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final long count() {
        return ((Long) D(new G1(0))).longValue();
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final InterfaceC2001n0 d() {
        Objects.requireNonNull(null);
        return new C2049x(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n, 3);
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final InterfaceC2001n0 distinct() {
        return ((AbstractC1978i2) ((AbstractC1978i2) boxed()).distinct()).mapToLong(new C2024s(19));
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final InterfaceC2001n0 e(C1935a c1935a) {
        Objects.requireNonNull(c1935a);
        return new C1971h0(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n | EnumC1959e3.f42636t, c1935a, 0);
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final C1929m findAny() {
        return (C1929m) D(J.f42453d);
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final C1929m findFirst() {
        return (C1929m) D(J.f42452c);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        D(new P(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        D(new P(longConsumer, true));
    }

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final InterfaceC2069y iterator() {
        return Spliterators.h(spliterator());
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final F l() {
        Objects.requireNonNull(null);
        return new C2039v(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n, 6);
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final InterfaceC2001n0 limit(long j9) {
        if (j9 >= 0) {
            return AbstractC2055y0.a0(this, 0L, j9);
        }
        throw new IllegalArgumentException(Long.toString(j9));
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new C2034u(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n, longFunction, 2);
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final C1929m max() {
        return reduce(new C2024s(26));
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final C1929m min() {
        return reduce(new C2024s(18));
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final boolean n() {
        return ((Boolean) D(AbstractC2055y0.b0(EnumC2040v0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final InterfaceC2001n0 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new C1971h0(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final boolean r() {
        return ((Boolean) D(AbstractC2055y0.b0(EnumC2040v0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final long reduce(long j9, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) D(new A1(EnumC1964f3.LONG_VALUE, longBinaryOperator, j9))).longValue();
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final C1929m reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (C1929m) D(new C1(EnumC1964f3.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final InterfaceC2001n0 skip(long j9) {
        if (j9 >= 0) {
            return j9 == 0 ? this : AbstractC2055y0.a0(this, j9, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j9));
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final InterfaceC2001n0 sorted() {
        return new K2(this, EnumC1959e3.f42633q | EnumC1959e3.f42631o, 0);
    }

    @Override // j$.util.stream.AbstractC1940b, j$.util.stream.InterfaceC1970h
    public final j$.util.K spliterator() {
        return Z(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final long sum() {
        return reduce(0L, new C2024s(27));
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final C1926j summaryStatistics() {
        return (C1926j) collect(new C2015q(18), new C2024s(17), new C2024s(20));
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final long[] toArray() {
        return (long[]) AbstractC2055y0.Q((I0) E(new C2024s(21))).e();
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final boolean w() {
        return ((Boolean) D(AbstractC2055y0.b0(EnumC2040v0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final IntStream x() {
        Objects.requireNonNull(null);
        return new C2044w(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n, 4);
    }
}

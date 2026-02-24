package j$.util.stream;

import j$.util.C1924h;
import j$.util.C1927k;
import j$.util.C1928l;
import j$.util.InterfaceC2065u;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1946c0 extends AbstractC1940b implements IntStream {
    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.H Z(Spliterator spliterator) {
        if (spliterator instanceof j$.util.H) {
            return (j$.util.H) spliterator;
        }
        if (!N3.f42490a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        N3.a(AbstractC1940b.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC1940b
    final K0 F(AbstractC1940b abstractC1940b, Spliterator spliterator, boolean z9, IntFunction intFunction) {
        return AbstractC2055y0.G(abstractC1940b, spliterator, z9);
    }

    @Override // j$.util.stream.AbstractC1940b
    final boolean H(Spliterator spliterator, InterfaceC2018q2 interfaceC2018q2) {
        IntConsumer v9;
        boolean zO;
        j$.util.H hZ = Z(spliterator);
        if (interfaceC2018q2 instanceof IntConsumer) {
            v9 = (IntConsumer) interfaceC2018q2;
        } else {
            if (N3.f42490a) {
                N3.a(AbstractC1940b.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC2018q2);
            v9 = new V(interfaceC2018q2);
        }
        do {
            zO = interfaceC2018q2.o();
            if (zO) {
                break;
            }
        } while (hZ.tryAdvance(v9));
        return zO;
    }

    @Override // j$.util.stream.AbstractC1940b
    final EnumC1964f3 I() {
        return EnumC1964f3.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC1940b
    final C0 N(long j9, IntFunction intFunction) {
        return AbstractC2055y0.S(j9);
    }

    @Override // j$.util.stream.AbstractC1940b
    final Spliterator U(AbstractC1940b abstractC1940b, Supplier supplier, boolean z9) {
        return new C2023r3(abstractC1940b, supplier, z9);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        int i9 = m4.f42710a;
        Objects.requireNonNull(null);
        return new S3(this, m4.f42710a, 0);
    }

    @Override // j$.util.stream.IntStream
    public final F asDoubleStream() {
        return new C2039v(this, 0, 3);
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC2001n0 asLongStream() {
        return new C2049x(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final C1927k average() {
        long j9 = ((long[]) collect(new C2024s(14), new C2024s(15), new C2024s(16)))[0];
        return j9 > 0 ? C1927k.d(r0[1] / j9) : C1927k.a();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream b() {
        Objects.requireNonNull(null);
        return new C2044w(this, EnumC1959e3.f42636t, 3);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C2034u(this, 0, new C2024s(8), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        int i9 = m4.f42710a;
        Objects.requireNonNull(null);
        return new U3(this, m4.f42711b, 0);
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        r rVar = new r(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(rVar);
        return D(new E1(EnumC1964f3.INT_VALUE, (BinaryOperator) rVar, (Object) objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) D(new G1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream d() {
        Objects.requireNonNull(null);
        return new C2044w(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC1978i2) ((AbstractC1978i2) boxed()).distinct()).mapToInt(new C2024s(7));
    }

    @Override // j$.util.stream.IntStream
    public final F f() {
        Objects.requireNonNull(null);
        return new C2039v(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n, 4);
    }

    @Override // j$.util.stream.IntStream
    public final C1928l findAny() {
        return (C1928l) D(I.f42447d);
    }

    @Override // j$.util.stream.IntStream
    public final C1928l findFirst() {
        return (C1928l) D(I.f42446c);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        D(new O(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        D(new O(intConsumer, true));
    }

    @Override // j$.util.stream.IntStream
    public final boolean g() {
        return ((Boolean) D(AbstractC2055y0.Z(EnumC2040v0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final InterfaceC2065u iterator() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j9) {
        if (j9 >= 0) {
            return AbstractC2055y0.Y(this, 0L, j9);
        }
        throw new IllegalArgumentException(Long.toString(j9));
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC2001n0 m() {
        Objects.requireNonNull(null);
        return new C2049x(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n, 2);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new C2034u(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final C1928l max() {
        return reduce(new C2024s(13));
    }

    @Override // j$.util.stream.IntStream
    public final C1928l min() {
        return reduce(new C2024s(9));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new X(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream q(Q0 q02) {
        Objects.requireNonNull(q02);
        return new X(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n | EnumC1959e3.f42636t, q02, 1);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i9, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) D(new P1(EnumC1964f3.INT_VALUE, intBinaryOperator, i9))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final C1928l reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (C1928l) D(new C1(EnumC1964f3.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final boolean s() {
        return ((Boolean) D(AbstractC2055y0.Z(EnumC2040v0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j9) {
        if (j9 >= 0) {
            return j9 == 0 ? this : AbstractC2055y0.Y(this, j9, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j9));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new J2(this, EnumC1959e3.f42633q | EnumC1959e3.f42631o, 0);
    }

    @Override // j$.util.stream.AbstractC1940b, j$.util.stream.InterfaceC1970h
    public final j$.util.H spliterator() {
        return Z(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new C2024s(12));
    }

    @Override // j$.util.stream.IntStream
    public final C1924h summaryStatistics() {
        return (C1924h) collect(new C2015q(17), new C2024s(10), new C2024s(11));
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC2055y0.P((G0) E(new C2024s(6))).e();
    }

    @Override // j$.util.stream.IntStream
    public final boolean v() {
        return ((Boolean) D(AbstractC2055y0.Z(EnumC2040v0.ALL))).booleanValue();
    }
}

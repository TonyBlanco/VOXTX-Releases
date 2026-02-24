package j$.util.stream;

import j$.util.C1923g;
import j$.util.C1927k;
import j$.util.InterfaceC1933q;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
abstract class C extends AbstractC1940b implements F {
    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.E Z(Spliterator spliterator) {
        if (spliterator instanceof j$.util.E) {
            return (j$.util.E) spliterator;
        }
        if (!N3.f42490a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        N3.a(AbstractC1940b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC1940b
    final K0 F(AbstractC1940b abstractC1940b, Spliterator spliterator, boolean z9, IntFunction intFunction) {
        return AbstractC2055y0.F(abstractC1940b, spliterator, z9);
    }

    @Override // j$.util.stream.AbstractC1940b
    final boolean H(Spliterator spliterator, InterfaceC2018q2 interfaceC2018q2) {
        DoubleConsumer c2010p;
        boolean zO;
        j$.util.E eZ = Z(spliterator);
        if (interfaceC2018q2 instanceof DoubleConsumer) {
            c2010p = (DoubleConsumer) interfaceC2018q2;
        } else {
            if (N3.f42490a) {
                N3.a(AbstractC1940b.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC2018q2);
            c2010p = new C2010p(interfaceC2018q2);
        }
        do {
            zO = interfaceC2018q2.o();
            if (zO) {
                break;
            }
        } while (eZ.tryAdvance(c2010p));
        return zO;
    }

    @Override // j$.util.stream.AbstractC1940b
    final EnumC1964f3 I() {
        return EnumC1964f3.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC1940b
    final C0 N(long j9, IntFunction intFunction) {
        return AbstractC2055y0.J(j9);
    }

    @Override // j$.util.stream.AbstractC1940b
    final Spliterator U(AbstractC1940b abstractC1940b, Supplier supplier, boolean z9) {
        return new C2014p3(abstractC1940b, supplier, z9);
    }

    @Override // j$.util.stream.F
    public final F a() {
        int i9 = m4.f42710a;
        Objects.requireNonNull(null);
        return new a4(this, m4.f42710a, 0);
    }

    @Override // j$.util.stream.F
    public final C1927k average() {
        double[] dArr = (double[]) collect(new C2015q(23), new C2015q(1), new C2015q(2));
        if (dArr[2] <= 0.0d) {
            return C1927k.a();
        }
        int i9 = AbstractC1990l.f42695a;
        double d9 = dArr[0] + dArr[1];
        double d10 = dArr[dArr.length - 1];
        if (Double.isNaN(d9) && Double.isInfinite(d10)) {
            d9 = d10;
        }
        return C1927k.d(d9 / dArr[2]);
    }

    @Override // j$.util.stream.F
    public final F b() {
        Objects.requireNonNull(null);
        return new C2039v(this, EnumC1959e3.f42636t, 2);
    }

    @Override // j$.util.stream.F
    public final Stream boxed() {
        return new C2034u(this, 0, new C2015q(26), 0);
    }

    @Override // j$.util.stream.F
    public final F c() {
        int i9 = m4.f42710a;
        Objects.requireNonNull(null);
        return new c4(this, m4.f42711b, 0);
    }

    @Override // j$.util.stream.F
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        r rVar = new r(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(rVar);
        return D(new E1(EnumC1964f3.DOUBLE_VALUE, (BinaryOperator) rVar, (Object) objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.F
    public final long count() {
        return ((Long) D(new G1(1))).longValue();
    }

    @Override // j$.util.stream.F
    public final F d() {
        Objects.requireNonNull(null);
        return new C2039v(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n, 0);
    }

    @Override // j$.util.stream.F
    public final F distinct() {
        return ((AbstractC1978i2) ((AbstractC1978i2) boxed()).distinct()).mapToDouble(new C2015q(27));
    }

    @Override // j$.util.stream.F
    public final F e(C1935a c1935a) {
        Objects.requireNonNull(c1935a);
        return new C2059z(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n | EnumC1959e3.f42636t, c1935a, 0);
    }

    @Override // j$.util.stream.F
    public final C1927k findAny() {
        return (C1927k) D(H.f42438d);
    }

    @Override // j$.util.stream.F
    public final C1927k findFirst() {
        return (C1927k) D(H.f42437c);
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        D(new N(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        D(new N(doubleConsumer, true));
    }

    @Override // j$.util.stream.F
    public final boolean i() {
        return ((Boolean) D(AbstractC2055y0.X(EnumC2040v0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final InterfaceC1933q iterator() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.F
    public final InterfaceC2001n0 j() {
        Objects.requireNonNull(null);
        return new C2049x(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n, 0);
    }

    @Override // j$.util.stream.F
    public final F limit(long j9) {
        if (j9 >= 0) {
            return AbstractC2055y0.W(this, 0L, j9);
        }
        throw new IllegalArgumentException(Long.toString(j9));
    }

    @Override // j$.util.stream.F
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new C2034u(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n, doubleFunction, 0);
    }

    @Override // j$.util.stream.F
    public final C1927k max() {
        return reduce(new C2015q(29));
    }

    @Override // j$.util.stream.F
    public final C1927k min() {
        return reduce(new C2015q(22));
    }

    @Override // j$.util.stream.F
    public final boolean p() {
        return ((Boolean) D(AbstractC2055y0.X(EnumC2040v0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.F
    public final F peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new C2059z(this, doubleConsumer);
    }

    @Override // j$.util.stream.F
    public final double reduce(double d9, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) D(new I1(EnumC1964f3.DOUBLE_VALUE, doubleBinaryOperator, d9))).doubleValue();
    }

    @Override // j$.util.stream.F
    public final C1927k reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (C1927k) D(new C1(EnumC1964f3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.F
    public final F skip(long j9) {
        if (j9 >= 0) {
            return j9 == 0 ? this : AbstractC2055y0.W(this, j9, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j9));
    }

    @Override // j$.util.stream.F
    public final F sorted() {
        return new I2(this, EnumC1959e3.f42633q | EnumC1959e3.f42631o, 0);
    }

    @Override // j$.util.stream.AbstractC1940b, j$.util.stream.InterfaceC1970h
    public final j$.util.E spliterator() {
        return Z(super.spliterator());
    }

    @Override // j$.util.stream.F
    public final double sum() {
        double[] dArr = (double[]) collect(new C2024s(0), new C2015q(3), new C2015q(0));
        int i9 = AbstractC1990l.f42695a;
        double d9 = dArr[0] + dArr[1];
        double d10 = dArr[dArr.length - 1];
        return (Double.isNaN(d9) && Double.isInfinite(d10)) ? d10 : d9;
    }

    @Override // j$.util.stream.F
    public final C1923g summaryStatistics() {
        return (C1923g) collect(new C2015q(16), new C2015q(24), new C2015q(25));
    }

    @Override // j$.util.stream.F
    public final double[] toArray() {
        return (double[]) AbstractC2055y0.O((E0) E(new C2015q(28))).e();
    }

    @Override // j$.util.stream.F
    public final IntStream u() {
        Objects.requireNonNull(null);
        return new C2044w(this, EnumC1959e3.f42632p | EnumC1959e3.f42630n, 0);
    }

    @Override // j$.util.stream.F
    public final boolean y() {
        return ((Boolean) D(AbstractC2055y0.X(EnumC2040v0.NONE))).booleanValue();
    }
}

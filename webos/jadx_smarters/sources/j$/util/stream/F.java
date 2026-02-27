package j$.util.stream;

import j$.util.C1923g;
import j$.util.C1927k;
import j$.util.InterfaceC1933q;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public interface F extends InterfaceC1970h {
    F a();

    C1927k average();

    F b();

    Stream boxed();

    F c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    F d();

    F distinct();

    F e(C1935a c1935a);

    C1927k findAny();

    C1927k findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    boolean i();

    InterfaceC1933q iterator();

    InterfaceC2001n0 j();

    F limit(long j9);

    Stream mapToObj(DoubleFunction doubleFunction);

    C1927k max();

    C1927k min();

    boolean p();

    F parallel();

    F peek(DoubleConsumer doubleConsumer);

    double reduce(double d9, DoubleBinaryOperator doubleBinaryOperator);

    C1927k reduce(DoubleBinaryOperator doubleBinaryOperator);

    F sequential();

    F skip(long j9);

    F sorted();

    @Override // j$.util.stream.InterfaceC1970h
    j$.util.E spliterator();

    double sum();

    C1923g summaryStatistics();

    double[] toArray();

    IntStream u();

    boolean y();
}

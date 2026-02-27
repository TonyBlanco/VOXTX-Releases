package j$.util.stream;

import j$.util.C1926j;
import j$.util.C1927k;
import j$.util.C1929m;
import j$.util.InterfaceC2069y;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2001n0 extends InterfaceC1970h {
    InterfaceC2001n0 a();

    F asDoubleStream();

    C1927k average();

    InterfaceC2001n0 b();

    Stream boxed();

    InterfaceC2001n0 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC2001n0 d();

    InterfaceC2001n0 distinct();

    InterfaceC2001n0 e(C1935a c1935a);

    C1929m findAny();

    C1929m findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    InterfaceC2069y iterator();

    F l();

    InterfaceC2001n0 limit(long j9);

    Stream mapToObj(LongFunction longFunction);

    C1929m max();

    C1929m min();

    boolean n();

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    InterfaceC2001n0 parallel();

    InterfaceC2001n0 peek(LongConsumer longConsumer);

    boolean r();

    long reduce(long j9, LongBinaryOperator longBinaryOperator);

    C1929m reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    InterfaceC2001n0 sequential();

    InterfaceC2001n0 skip(long j9);

    InterfaceC2001n0 sorted();

    @Override // j$.util.stream.InterfaceC1970h
    j$.util.K spliterator();

    long sum();

    C1926j summaryStatistics();

    long[] toArray();

    boolean w();

    IntStream x();
}

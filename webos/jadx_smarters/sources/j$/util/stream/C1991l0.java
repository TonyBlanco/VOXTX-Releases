package j$.util.stream;

import j$.util.C1926j;
import j$.util.C1927k;
import j$.util.C1929m;
import j$.util.C2067w;
import j$.util.InterfaceC2069y;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.util.stream.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1991l0 implements InterfaceC2001n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LongStream f42696a;

    private /* synthetic */ C1991l0(LongStream longStream) {
        this.f42696a = longStream;
    }

    public static /* synthetic */ InterfaceC2001n0 k(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C1996m0 ? ((C1996m0) longStream).f42707a : new C1991l0(longStream);
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ InterfaceC2001n0 a() {
        return k(this.f42696a.takeWhile(null));
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ F asDoubleStream() {
        return D.k(this.f42696a.asDoubleStream());
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ C1927k average() {
        return j$.util.A.k(this.f42696a.average());
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ InterfaceC2001n0 b() {
        return k(this.f42696a.filter(null));
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ Stream boxed() {
        return C1944b3.k(this.f42696a.boxed());
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ InterfaceC2001n0 c() {
        return k(this.f42696a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f42696a.close();
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f42696a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ long count() {
        return this.f42696a.count();
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ InterfaceC2001n0 d() {
        return k(this.f42696a.map(null));
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ InterfaceC2001n0 distinct() {
        return k(this.f42696a.distinct());
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final InterfaceC2001n0 e(C1935a c1935a) {
        LongStream longStream = this.f42696a;
        C1935a c1935a2 = new C1935a(9);
        c1935a2.f42580b = c1935a;
        return k(longStream.flatMap(c1935a2));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.f42696a;
        if (obj instanceof C1991l0) {
            obj = ((C1991l0) obj).f42696a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ C1929m findAny() {
        return j$.util.A.m(this.f42696a.findAny());
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ C1929m findFirst() {
        return j$.util.A.m(this.f42696a.findFirst());
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f42696a.forEach(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f42696a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f42696a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final /* synthetic */ boolean isParallel() {
        return this.f42696a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.InterfaceC2001n0, j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* synthetic */ InterfaceC2069y iterator() {
        return C2067w.a(this.f42696a.iterator());
    }

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* synthetic */ Iterator iterator() {
        return this.f42696a.iterator();
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ F l() {
        return D.k(this.f42696a.mapToDouble(null));
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ InterfaceC2001n0 limit(long j9) {
        return k(this.f42696a.limit(j9));
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return C1944b3.k(this.f42696a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ C1929m max() {
        return j$.util.A.m(this.f42696a.max());
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ C1929m min() {
        return j$.util.A.m(this.f42696a.min());
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ boolean n() {
        return this.f42696a.noneMatch(null);
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final /* synthetic */ InterfaceC1970h onClose(Runnable runnable) {
        return C1960f.k(this.f42696a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* synthetic */ InterfaceC1970h parallel() {
        return C1960f.k(this.f42696a.parallel());
    }

    @Override // j$.util.stream.InterfaceC2001n0, j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* synthetic */ InterfaceC2001n0 parallel() {
        return k(this.f42696a.parallel());
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ InterfaceC2001n0 peek(LongConsumer longConsumer) {
        return k(this.f42696a.peek(longConsumer));
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ boolean r() {
        return this.f42696a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ long reduce(long j9, LongBinaryOperator longBinaryOperator) {
        return this.f42696a.reduce(j9, longBinaryOperator);
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ C1929m reduce(LongBinaryOperator longBinaryOperator) {
        return j$.util.A.m(this.f42696a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* synthetic */ InterfaceC1970h sequential() {
        return C1960f.k(this.f42696a.sequential());
    }

    @Override // j$.util.stream.InterfaceC2001n0, j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* synthetic */ InterfaceC2001n0 sequential() {
        return k(this.f42696a.sequential());
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ InterfaceC2001n0 skip(long j9) {
        return k(this.f42696a.skip(j9));
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ InterfaceC2001n0 sorted() {
        return k(this.f42696a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.InterfaceC2001n0, j$.util.stream.InterfaceC1970h
    public final /* synthetic */ j$.util.K spliterator() {
        return j$.util.I.a(this.f42696a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.O.a(this.f42696a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ long sum() {
        return this.f42696a.sum();
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final C1926j summaryStatistics() {
        this.f42696a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ long[] toArray() {
        return this.f42696a.toArray();
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final /* synthetic */ InterfaceC1970h unordered() {
        return C1960f.k(this.f42696a.unordered());
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ boolean w() {
        return this.f42696a.anyMatch(null);
    }

    @Override // j$.util.stream.InterfaceC2001n0
    public final /* synthetic */ IntStream x() {
        return IntStream.VivifiedWrapper.convert(this.f42696a.mapToInt(null));
    }
}

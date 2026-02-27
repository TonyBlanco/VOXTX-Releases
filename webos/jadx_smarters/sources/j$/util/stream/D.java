package j$.util.stream;

import j$.util.C1923g;
import j$.util.C1927k;
import j$.util.C1931o;
import j$.util.InterfaceC1933q;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class D implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DoubleStream f42406a;

    private /* synthetic */ D(DoubleStream doubleStream) {
        this.f42406a = doubleStream;
    }

    public static /* synthetic */ F k(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof E ? ((E) doubleStream).f42412a : new D(doubleStream);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F a() {
        return k(this.f42406a.takeWhile(null));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ C1927k average() {
        return j$.util.A.k(this.f42406a.average());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F b() {
        return k(this.f42406a.filter(null));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ Stream boxed() {
        return C1944b3.k(this.f42406a.boxed());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F c() {
        return k(this.f42406a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f42406a.close();
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f42406a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ long count() {
        return this.f42406a.count();
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F d() {
        return k(this.f42406a.map(null));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F distinct() {
        return k(this.f42406a.distinct());
    }

    @Override // j$.util.stream.F
    public final F e(C1935a c1935a) {
        DoubleStream doubleStream = this.f42406a;
        C1935a c1935a2 = new C1935a(7);
        c1935a2.f42580b = c1935a;
        return k(doubleStream.flatMap(c1935a2));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.f42406a;
        if (obj instanceof D) {
            obj = ((D) obj).f42406a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ C1927k findAny() {
        return j$.util.A.k(this.f42406a.findAny());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ C1927k findFirst() {
        return j$.util.A.k(this.f42406a.findFirst());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f42406a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f42406a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f42406a.hashCode();
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ boolean i() {
        return this.f42406a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final /* synthetic */ boolean isParallel() {
        return this.f42406a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.F
    public final /* synthetic */ InterfaceC1933q iterator() {
        return C1931o.a(this.f42406a.iterator());
    }

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* synthetic */ Iterator iterator() {
        return this.f42406a.iterator();
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ InterfaceC2001n0 j() {
        return C1991l0.k(this.f42406a.mapToLong(null));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F limit(long j9) {
        return k(this.f42406a.limit(j9));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return C1944b3.k(this.f42406a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ C1927k max() {
        return j$.util.A.k(this.f42406a.max());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ C1927k min() {
        return j$.util.A.k(this.f42406a.min());
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final /* synthetic */ InterfaceC1970h onClose(Runnable runnable) {
        return C1960f.k(this.f42406a.onClose(runnable));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ boolean p() {
        return this.f42406a.anyMatch(null);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F parallel() {
        return k(this.f42406a.parallel());
    }

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* synthetic */ InterfaceC1970h parallel() {
        return C1960f.k(this.f42406a.parallel());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F peek(DoubleConsumer doubleConsumer) {
        return k(this.f42406a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ double reduce(double d9, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f42406a.reduce(d9, doubleBinaryOperator);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ C1927k reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return j$.util.A.k(this.f42406a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F sequential() {
        return k(this.f42406a.sequential());
    }

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* synthetic */ InterfaceC1970h sequential() {
        return C1960f.k(this.f42406a.sequential());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F skip(long j9) {
        return k(this.f42406a.skip(j9));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F sorted() {
        return k(this.f42406a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.F, j$.util.stream.InterfaceC1970h
    public final /* synthetic */ j$.util.E spliterator() {
        return j$.util.C.a(this.f42406a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.O.a(this.f42406a.spliterator());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ double sum() {
        return this.f42406a.sum();
    }

    @Override // j$.util.stream.F
    public final C1923g summaryStatistics() {
        this.f42406a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ double[] toArray() {
        return this.f42406a.toArray();
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ IntStream u() {
        return IntStream.VivifiedWrapper.convert(this.f42406a.mapToInt(null));
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final /* synthetic */ InterfaceC1970h unordered() {
        return C1960f.k(this.f42406a.unordered());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ boolean y() {
        return this.f42406a.noneMatch(null);
    }
}

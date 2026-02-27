package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
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

/* JADX INFO: renamed from: j$.util.stream.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1944b3 implements Stream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.stream.Stream f42597a;

    private /* synthetic */ C1944b3(java.util.stream.Stream stream) {
        this.f42597a = stream;
    }

    public static /* synthetic */ Stream k(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new C1944b3(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f42597a.allMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f42597a.anyMatch(predicate);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f42597a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f42597a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f42597a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return k(this.f42597a.distinct());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return k(this.f42597a.dropWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream e(C1935a c1935a) {
        return k(this.f42597a.flatMap(AbstractC2055y0.R(c1935a)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Stream stream = this.f42597a;
        if (obj instanceof C1944b3) {
            obj = ((C1944b3) obj).f42597a;
        }
        return stream.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return k(this.f42597a.filter(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return j$.util.A.j(this.f42597a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return j$.util.A.j(this.f42597a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f42597a.forEach(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.f42597a.forEachOrdered(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object h(C1980j c1980j) {
        return this.f42597a.collect(c1980j == null ? null : c1980j.f42684a);
    }

    public final /* synthetic */ int hashCode() {
        return this.f42597a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final /* synthetic */ boolean isParallel() {
        return this.f42597a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* synthetic */ Iterator iterator() {
        return this.f42597a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j9) {
        return k(this.f42597a.limit(j9));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return k(this.f42597a.map(function));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ F mapToDouble(ToDoubleFunction toDoubleFunction) {
        return D.k(this.f42597a.mapToDouble(toDoubleFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.f42597a.mapToInt(toIntFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC2001n0 mapToLong(ToLongFunction toLongFunction) {
        return C1991l0.k(this.f42597a.mapToLong(toLongFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return j$.util.A.j(this.f42597a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return j$.util.A.j(this.f42597a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f42597a.noneMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC2001n0 o(C1935a c1935a) {
        return C1991l0.k(this.f42597a.flatMapToLong(AbstractC2055y0.R(c1935a)));
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final /* synthetic */ InterfaceC1970h onClose(Runnable runnable) {
        return C1960f.k(this.f42597a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* synthetic */ InterfaceC1970h parallel() {
        return C1960f.k(this.f42597a.parallel());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return k(this.f42597a.peek(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return j$.util.A.j(this.f42597a.reduce(binaryOperator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f42597a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f42597a.reduce(obj, binaryOperator);
    }

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* synthetic */ InterfaceC1970h sequential() {
        return C1960f.k(this.f42597a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j9) {
        return k(this.f42597a.skip(j9));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return k(this.f42597a.sorted());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return k(this.f42597a.sorted(comparator));
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.O.a(this.f42597a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream t(C1935a c1935a) {
        return IntStream.VivifiedWrapper.convert(this.f42597a.flatMapToInt(AbstractC2055y0.R(c1935a)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return k(this.f42597a.takeWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.f42597a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f42597a.toArray(intFunction);
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final /* synthetic */ InterfaceC1970h unordered() {
        return C1960f.k(this.f42597a.unordered());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ F z(C1935a c1935a) {
        return D.k(this.f42597a.flatMapToDouble(AbstractC2055y0.R(c1935a)));
    }
}

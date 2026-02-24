package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.util.stream.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1960f implements InterfaceC1970h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseStream f42644a;

    private /* synthetic */ C1960f(BaseStream baseStream) {
        this.f42644a = baseStream;
    }

    public static /* synthetic */ InterfaceC1970h k(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C1965g ? ((C1965g) baseStream).f42653a : baseStream instanceof DoubleStream ? D.k((DoubleStream) baseStream) : baseStream instanceof java.util.stream.IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? C1991l0.k((LongStream) baseStream) : baseStream instanceof java.util.stream.Stream ? C1944b3.k((java.util.stream.Stream) baseStream) : new C1960f(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f42644a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.f42644a;
        if (obj instanceof C1960f) {
            obj = ((C1960f) obj).f42644a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f42644a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final /* synthetic */ boolean isParallel() {
        return this.f42644a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* synthetic */ Iterator iterator() {
        return this.f42644a.iterator();
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final /* synthetic */ InterfaceC1970h onClose(Runnable runnable) {
        return k(this.f42644a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* synthetic */ InterfaceC1970h parallel() {
        return k(this.f42644a.parallel());
    }

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* synthetic */ InterfaceC1970h sequential() {
        return k(this.f42644a.sequential());
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.O.a(this.f42644a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final /* synthetic */ InterfaceC1970h unordered() {
        return k(this.f42644a.unordered());
    }
}
